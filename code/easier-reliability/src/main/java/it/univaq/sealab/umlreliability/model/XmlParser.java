package it.univaq.sealab.umlreliability.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlParser {
	
	private static final Logger LOGGER = Logger.getLogger(XmlParser.class.getName());
	
	private Document document;
	
	public XmlParser(final String modelFile) throws SAXException, IOException, ParserConfigurationException {
		this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(modelFile));
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(final Document document) {
		this.document = document;
	}
	
	public List<Node> getElementsWithAttribute(final String tagName, final String attrName, final String attrValue) {
		final NodeList list = document.getElementsByTagName(tagName);
		final List<Node> filtered = new ArrayList<>();
		for (int i = 0; i < list.getLength(); i++) {
			final Node node = list.item(i);
			if (getAttributeValue(node, attrName).equals(attrValue)) {
				filtered.add(node);
			}
		}
		return filtered;
	}
	
	public String getAttributeValue(final Node node, final String attribute) {
		final Node item = node.getAttributes().getNamedItem(attribute);
		if (item != null) {
			return item.getNodeValue();
		}
		return null;
	}
	
	public Node getChildByName(final Node node, final String childName) {
		final NodeList children = node.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i).getNodeName().equals(childName)) {
				return children.item(i);
			}
		}
		LOGGER.warning(
				String.format("Node %s with xmi:id=%s has no children named '%s'",
						node.getNodeName(), getAttributeValue(node, "xmi:id"), childName));
		
		return null;
	}
	
	/**
	 * DaComponent.failure = (DaFailure) failure.occurrenceProb = (NFPReal) p
	 * @return components' failure probabilities
	 */
	public double[] parseComponentsFailProbs() {
		final Map<String,Double> componentsProbs = new HashMap<>();
		final NodeList daComponents = document.getElementsByTagName("Core:DaComponent");
		for (int i = 0; i < daComponents.getLength(); i++) {
			final Node node = daComponents.item(i);
			
			final Node failure = getChildByName(node, "failure");
			if (failure == null) {
				continue;
			}
			
			final Node occurrenceProb = getChildByName(failure, "occurrenceProb");
			if (occurrenceProb == null) {
				continue;
			}
			
			componentsProbs.put(
					getAttributeValue(node, "base_Element"),
					Double.valueOf(occurrenceProb.getTextContent()));
		}
		
		// Sort the probabilities by the xmi:id of the component
		final double[] probs = new double[componentsProbs.size()];
		final List<String> sortByID = new ArrayList<>(componentsProbs.keySet());
		Collections.sort(sortByID);
		for (int i = 0; i < probs.length; i++) {
			probs[i] = componentsProbs.get(sortByID.get(i));
		}
		
		return probs;
	}
	
	/**
	 * Invocations are obtained from sequence diagrams.
	 * @return int[scenario][numberOfInvocations] for each component
	 */
	public int[][] parseComponentsInvocations() {
		final List<Node> scenarios = getElementsWithAttribute("ownedBehavior", "xmi:type", "uml:Interaction");
		final int[][] invocations = new int[scenarios.size()][];
		for (int j = 0; j < scenarios.size(); j++) {
			final Map<String,Integer> scenarioInvocations = new HashMap<>();
			final NodeList messages = document.getElementsByTagName("message");
			
			// Count the invocations
			for (int i = 0; i < messages.getLength(); i++) {
				final Node message = messages.item(i);
				if (message.getParentNode().isEqualNode(scenarios.get(j))) {
					final String signature = getAttributeValue(message, "signature");
					if (signature != null) {
						final Node operation = getElementsWithAttribute("ownedOperation", "xmi:id", signature).get(0);
						final String component = getAttributeValue(operation.getParentNode(), "xmi:id");
						if (scenarioInvocations.containsKey(component)) {
							scenarioInvocations.put(component, scenarioInvocations.get(component) + 1);
						} else {
							scenarioInvocations.put(component, 1);
						}
					}
				}
			}
			
			// Sort them by component's xmi:id
			final int[] invoc = new int[scenarioInvocations.size()];
			final List<String> sortByID = new ArrayList<>(scenarioInvocations.keySet());
			Collections.sort(sortByID);
			for (int i = 0; i < invoc.length; i++) {
				invoc[i] = scenarioInvocations.get(sortByID.get(i));
			}
			
			// Assign to the array keeping the scenarios
			invocations[j] = invoc;
		}

		return invocations;
	}
	
	/**
	 * DaConnector.failure = (DaFailure) failure.occurrenceProb = (NFPReal) p
	 * @return link failure probabilities
	 */
	public double[] parseLinkFailProbs() {
		final Map<String,Double> linksProbs = new HashMap<>();
		final NodeList daConnectors = document.getElementsByTagName("Core:DaConnector");
		for (int i = 0; i < daConnectors.getLength(); i++) {
			final Node node = daConnectors.item(i);
			
			final Node failure = getChildByName(node, "failure");
			if (failure == null) {
				continue;
			}
			
			final Node occurrenceProb = getChildByName(failure, "occurrenceProb");
			if (occurrenceProb == null) {
				continue;
			}
			
			linksProbs.put(
					getAttributeValue(node, "base_Dependency"),
					Double.valueOf(occurrenceProb.getTextContent()));
		}
		
		// Sort the probabilities by the xmi:id of the link
		final double[] probs = new double[linksProbs.size()];
		final List<String> sortByID = new ArrayList<>(linksProbs.keySet());
		Collections.sort(sortByID);
		for (int i = 0; i < probs.length; i++) {
			probs[i] = linksProbs.get(sortByID.get(i));
		}
		
		return probs;
	}
	
	/**
	 * Go over all the messages that are exchanged over a link
	 * and sum their GaStep.msgSize to get the total msgSize of the link.
	 * @return total msgSize of each link
	 */
	public double[] parseMsgSize() {
		final Map<String,Double> linksMsgSize = new HashMap<>();
		final NodeList messages = document.getElementsByTagName("message");
		for (int i = 0; i < messages.getLength(); i++) {
			final Node message = messages.item(i);
			
			// Get the sending component
			final String sendEvent = getAttributeValue(message, "sendEvent");
			final String sendLifeline = getAttributeValue(
					getElementsWithAttribute("fragment", "xmi:id", sendEvent).get(0), "covered");
			final String sendRepresents = getAttributeValue(
					getElementsWithAttribute("lifeline", "xmi:id", sendLifeline).get(0), "represents");
			final String sendComponent = getAttributeValue(
					getElementsWithAttribute("ownedAttribute", "xmi:id", sendRepresents).get(0), "type");

			// Get the receiving component
			final String receiveEvent = getAttributeValue(message, "receiveEvent");
			final String receiveLifeline = getAttributeValue(
					getElementsWithAttribute("fragment", "xmi:id", receiveEvent).get(0), "covered");
			final String receiveRepresents = getAttributeValue(
					getElementsWithAttribute("lifeline", "xmi:id", receiveLifeline).get(0), "represents");
			final String receiveComponent = getAttributeValue(
					getElementsWithAttribute("ownedAttribute", "xmi:id", receiveRepresents).get(0), "type");
			
			// Get the link
			// FIXME cannot identify the link
			final List<Node> usages = getElementsWithAttribute("packagedElement", "xmi:type", "uml:Usage");
			final Node link = usages.stream()
				.filter(node -> 
					getAttributeValue(node, "client").equals(sendComponent) &&
					getAttributeValue(node, "supplier").equals(receiveComponent))
				.findAny().orElse(null);
			
			if (link == null) {
				System.out.println(sendComponent + " -> " + receiveComponent);
			} else {
				System.out.println(getAttributeValue(link, "xmi:id"));
			}
			
		}
		return null;
	}
}
