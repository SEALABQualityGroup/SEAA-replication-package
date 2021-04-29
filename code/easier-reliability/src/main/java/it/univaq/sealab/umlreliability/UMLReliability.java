package it.univaq.sealab.umlreliability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.CommunicationPath;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;

import com.masdes.dam.Complex_Data_Types.DaFailure;

import it.univaq.sealab.umlreliability.elements.Component;
import it.univaq.sealab.umlreliability.elements.Link;
import it.univaq.sealab.umlreliability.elements.Scenario;

public class UMLReliability {

	private static final Logger LOGGER = Logger.getLogger(UMLReliability.class.getName());
	
	private Model model;
	private List<Scenario> scenarios = new ArrayList<>();
	private List<Component> components = new ArrayList<>();
	private List<Link> links = new ArrayList<>();
	
	public UMLReliability(final Model model) throws MissingTagException {
		this.model = model;
		extractScenarios();
		extractComponents();
		extractLinks();
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	@SuppressWarnings("unchecked")
	private <T> List<T> getElements(final Element root, final EClass type) {
		final List<T> elements = new ArrayList<T>() {};
		root.eAllContents().forEachRemaining(e -> {
			if (e.eClass().equals(type)) {
				elements.add((T) e);
			}
		});
		return elements;
	}
	
	@SuppressWarnings("unchecked")
	private <T> List<T> getStereotypedElements(final Element root, final EClass type, final String Stereotype) {
		final List<T> elements = new ArrayList<T>() {};
		root.eAllContents().forEachRemaining(e -> {
			if (e.eClass().equals(type)) {
				final Element element = (Element) e;
				if (element.getAppliedStereotype(Stereotype) != null) {
					elements.add((T) e);
				}
			}
		});
		return elements;
	}

	private boolean isComponentDeployedOnNode(final Node node, final org.eclipse.uml2.uml.Component component) {
		return node.getDeployments().parallelStream()
			.flatMap(d ->d.getDeployedArtifacts().parallelStream()
			.flatMap(a -> ((Artifact) a).getManifestations().parallelStream()))
			.anyMatch(m -> m.getUtilizedElement().equals(component)) ||
			
			// Also look in nested nodes
			node.getNestedNodes().parallelStream()
				.anyMatch(nestedNode -> isComponentDeployedOnNode(nestedNode, component));
	}
	
	public List<Scenario> getScenarios() {
		return this.scenarios;
	}
	
	/**
	 * GaScenario on the Use Case, with root = first GaStep in the Sequence
	 * @return scenarios' execution probabilities
	 * @throws MissingTagException 
	 */
	private List<Scenario> extractScenarios() throws MissingTagException {
		final String gaScenarioST = "MARTE::MARTE_AnalysisModel::GQAM::GaScenario";
		final List<UseCase> usecases = getStereotypedElements(model, UMLPackage.Literals.USE_CASE, gaScenarioST);
		for (UseCase uc : usecases) {
			final Scenario scenario = new Scenario(uc);
			final GaStep root = (GaStep) uc.getValue(uc.getAppliedStereotype(gaScenarioST), "root");
			if (root == null) {
				throw new MissingTagException(gaScenarioST, "root", uc.getName());
			} else {
				scenario.setProbability(Double.parseDouble(root.getProb()));
			}
			scenarios.add(scenario);
		}
		return scenarios;
	}
	
	/**
	 * DaComponent.failure = (DaFailure) failure.occurrenceProb = (NFPReal) p
	 * Invocations are obtained from sequence diagrams.
	 * @return components with failure probabilities and invocations
	 * @throws MissingTagException
	 */
	private List<Component> extractComponents() throws MissingTagException {
		final String daComponentST = "DAM::DAM_UML_Extensions::System::Core::DaComponent";
		final List<org.eclipse.uml2.uml.Component> umlComponents =
				getStereotypedElements(model, UMLPackage.Literals.COMPONENT, daComponentST);
		for (org.eclipse.uml2.uml.Component c : umlComponents) {
			final Component component = new Component(c);
			
			// Get the failure probability
			final EObjectContainmentEList<?> tags = (EObjectContainmentEList<?>) c
					.getValue(c.getAppliedStereotype(daComponentST), "failure");
			if (tags.isEmpty()) {
				throw new MissingTagException(daComponentST, "failure", c.getName());
			} else {
				component.setFailureProb(Double.valueOf(((DaFailure) tags.get(0)).getOccurrenceProb().get(0)));
			}
			
			components.add(component);
		}
		return extractComponentsInvocations();
	}
	
	/**
	 * Invocations are obtained from sequence diagrams.
	 * @return int[scenario][numberOfInvocations] for each component
	 */
	private List<Component> extractComponentsInvocations() {
		scenarios.forEach(scenario -> {
			final List<Message> messages = getElements(scenario.getElement(), UMLPackage.Literals.MESSAGE);
			messages.parallelStream()
				.filter(m -> !m.getMessageSort().equals(MessageSort.REPLY_LITERAL))
				.forEach(message -> {
				
					final NamedElement signature = message.getSignature();
					if (signature != null) {
						// Count the invocation
						final org.eclipse.uml2.uml.Component umlComponent =
								(org.eclipse.uml2.uml.Component) ((Operation) signature).getOwner();
						final Component component = components.parallelStream()
								.filter(c -> c.getElement().equals(umlComponent)).findFirst().orElse(null);
						final Map<Scenario,Integer> invocations = component.getInvocations();
						invocations.put(scenario, invocations.getOrDefault(scenario, 0) + 1);
						scenario.getComponents().add(component);
					} else {
						LOGGER.info(String.format("Message '%s' has no signature.", message.getName()));
					}
			});
		});
		return components;
	}
	
	/**
	 * DaConnector.failure = (DaFailure) failure.occurrenceProb = (NFPReal) p
	 * Go over all the messages that are exchanged over a link
	 * and sum their GaStep.msgSize to get the total msgSize of the link.
	 * @return links with failure probabilities and message size
	 * @throws MissingTagException 
	 */
	private List<Link> extractLinks() throws MissingTagException {
		final String daConnectorST = "DAM::DAM_UML_Extensions::System::Core::DaConnector";
		final List<CommunicationPath> daConnectors =
				getStereotypedElements(model, UMLPackage.Literals.COMMUNICATION_PATH, daConnectorST);
		for (CommunicationPath cp : daConnectors) {
			final Link link = new Link(cp);

			final EObjectContainmentEList<?> tags = (EObjectContainmentEList<?>) cp
					.getValue(cp.getAppliedStereotype(daConnectorST), "failure");
			if (tags.isEmpty()) {
				throw new MissingTagException(daConnectorST, "failure", cp.getName());
			} else {
				link.setFailureProb(Double.valueOf(((DaFailure) tags.get(0)).getOccurrenceProb().get(0)));
			}
			
			links.add(link);
		}
		return extractMsgSizes();
	}
	
	/**
	 * Go over all the messages that are exchanged over a link
	 * and sum their GaStep.msgSize to get the total msgSize of the link.
	 * @return total msgSize of each link
	 * @throws MissingTagException
	 */
	private List<Link> extractMsgSizes() throws MissingTagException {
		final String gaStepST = "MARTE::MARTE_AnalysisModel::GQAM::GaStep";
		for (Scenario scenario : scenarios) {
			final List<Message> messages =
					getStereotypedElements(scenario.getElement(), UMLPackage.Literals.MESSAGE, gaStepST);
			for (Message message : messages.parallelStream()
					.filter(m -> !m.getMessageSort().equals(MessageSort.REPLY_LITERAL)).collect(Collectors.toList())) {
					
				// Get the sending component
				final Type sendType = ((MessageOccurrenceSpecification) message.getSendEvent())
						.getCovered().getRepresents().getType();
				
				// Get the receiving component
				final Type receiveType = ((MessageOccurrenceSpecification) message.getReceiveEvent())
						.getCovered().getRepresents().getType();
				
				// Only go through messages between components
				if (sendType instanceof ComponentImpl && receiveType instanceof ComponentImpl) {
					final org.eclipse.uml2.uml.Component sender = (org.eclipse.uml2.uml.Component) sendType;
					final org.eclipse.uml2.uml.Component receiver = (org.eclipse.uml2.uml.Component) receiveType;
					
					// Find the link on which the components are deployed at opposite ends
					for (Link link : links) {
						final List<Property> ends = link.getElement().getMemberEnds();
						final Node node1 = (Node) ends.get(0).getType();
						final Node node2 = (Node) ends.get(1).getType();
						if (isComponentDeployedOnNode(node1, sender) && isComponentDeployedOnNode(node2, receiver) ||
							isComponentDeployedOnNode(node1, receiver) && isComponentDeployedOnNode(node2, sender)) {
							final Stereotype gaStep = message.getAppliedStereotype(gaStepST);
							if (gaStep != null) {
								final EDataTypeUniqueEList<?> tags = (EDataTypeUniqueEList<?>) message
										.getValue(message.getAppliedStereotype(gaStepST), "msgSize");
								if (tags.isEmpty()) {
									throw new MissingTagException(gaStepST, "msgSize", message.getName());
								} else {
									final Map<Scenario,Double> msgSizes = link.getMsgSize();
									msgSizes.put(scenario, msgSizes.getOrDefault(scenario, 0.0) +
											Double.parseDouble((String) tags.get(0)));
									scenario.getLinks().add(link);
								}
							} else {
								LOGGER.info(String.format("Message '%s' has no GaStep stereotype.", message.getName()));
							}
						}
					}
				}
			}
		}
		return links;
	}
}
