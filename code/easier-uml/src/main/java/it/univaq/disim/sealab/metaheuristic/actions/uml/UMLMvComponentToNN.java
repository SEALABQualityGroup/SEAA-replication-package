/**
 * It moves a component from a node to another one
 */
package it.univaq.disim.sealab.metaheuristic.actions.uml;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.UMLFactory;
import org.uma.jmetal.util.pseudorandom.JMetalRandom;

import it.univaq.disim.sealab.epsilon.EpsilonStandalone;
import it.univaq.disim.sealab.epsilon.eol.EOLStandalone;
import it.univaq.disim.sealab.epsilon.eol.EasierUmlModel;
import it.univaq.disim.sealab.metaheuristic.actions.RefactoringAction;
import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;
import it.univaq.disim.sealab.metaheuristic.evolutionary.UMLRSolution;
import it.univaq.disim.sealab.metaheuristic.managers.Manager;
import it.univaq.disim.sealab.metaheuristic.managers.ocl.uml.UMLOclStringManager;
import it.univaq.disim.sealab.metaheuristic.utils.EasierLogger;
import logicalSpecification.AndOperator;
import logicalSpecification.ExistsOperator;
import logicalSpecification.FOLSpecification;
import logicalSpecification.Parameter;
import logicalSpecification.PostCondition;
import logicalSpecification.PreCondition;
import logicalSpecification.actions.UML.UMLPackage;
import logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl;

public class UMLMvComponentToNN extends UMLMoveComponentActionImpl implements RefactoringAction {

	private final static Path eolModulePath;

	private final static double VALUE_COST = 1.23;

	private final String sourceModelPath;

	static {
		eolModulePath = Paths.get(FileSystems.getDefault().getPath("").toAbsolutePath().toString(), "..",
				"easier-refactoringLibrary", "easier-ref-operations", "mv_comp_nn.eol");
	}

	public static Path getEolModulePath() {
		return eolModulePath;
	}

	public UMLMvComponentToNN(UMLRSolution sol) {

		sourceModelPath = sol.getModelPath().toString();

		umlTargetNodes = new BasicEList<>();

		umlCompToMove = getRandomComponent(sol);
		umlTargetNodes.add(createNewNode(sol));

		cost = calculateCost();
		numOfChanges = cost;

		setParameters();
		createPreCondition();
		createPostCondition();

	}

	private double calculateCost() {

		int intUsage = umlCompToMove.getUsedInterfaces().size();
		int intReal = umlCompToMove.getInterfaceRealizations().size();
		int ops = umlCompToMove.getOperations().size();

		return (intUsage + intReal + ops) * VALUE_COST;
	}

	// Creates a new random Node on which the component will be deployed on
	private Node createNewNode(UMLRSolution sol) {

		org.eclipse.uml2.uml.Package deploymentView = null;
		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(),
				UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& "deployment_view".equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				deploymentView = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}

		Node target = UMLFactory.eINSTANCE.createNode();
		target.setName("New-Node_" + generateHash());
		deploymentView.getPackagedElements().add(target);
		return target;
	}

	private String generateHash() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;

		return new Random().ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	// retrieves a random Component from the source model
	private Component getRandomComponent(UMLRSolution sol) {

		org.eclipse.uml2.uml.Package staticView = null;
		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(),
				UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& "static_view".equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				staticView = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}

		Component cmp;
		do {
			List<Component> comps = new ArrayList<>(
					EcoreUtil.getObjectsByType(staticView.getOwnedElements(), UMLPackage.Literals.COMPONENT));
			cmp = comps.get(JMetalRandom.getInstance().nextInt(0, comps.size() - 1));
		} while (cmp == null);
		return cmp;
	}

	@Override
	public void execute() {
		EOLStandalone executor = new EOLStandalone();

		EasierUmlModel contextModel;
		try {
			contextModel = EpsilonStandalone.createUmlModel(sourceModelPath);
			contextModel.setStoredOnDisposal(true);
			
			executor.setModel(contextModel);
			executor.setSource(eolModulePath);

			// fills variable within the eol module
			executor.setParameter(umlCompToMove.getName(), "String", "targetComponentName");
			executor.setParameter(umlTargetNodes.get(0).getName(), "String", "newNodeName");


			executor.execute();
		} catch (EolRuntimeException e) {
			System.err.println("Error in execution the eolmodule " + eolModulePath);
//			e.printStackTrace();
		}catch (URISyntaxException e) {
			EasierLogger.logger_.severe(String.format("ERROR while reading the model", sourceModelPath));
		}

		
		executor.clearMemory();
		executor = null;
	}

	@Override
	public void createPreCondition() {
		PreCondition preCondition = Manager.createPreCondition();

		FOLSpecification specification = Manager
				.createFOLSpectification("MvComponentToNNPreCondition");

		ExistsOperator existsTargetInComponents = Manager
				.createExistsInCollectionOperator(getCompToMoveSVP(), getAllCompsMVP());

		AndOperator andRoot = Manager.createAndOperator();
		andRoot.getArguments().add(existsTargetInComponents);

		specification.setRootOperator(andRoot);
		preCondition.setConditionFormula(specification);
		setPre(preCondition);
	}

	@Override
	public void createPostCondition() {
		PostCondition postCondition = Manager.createPostCondition();
		FOLSpecification specification = Manager
				.createFOLSpectification("MvComponentToNNPostCondition");

		ExistsOperator existsTargetInComponents = Manager
				.createExistsInCollectionOperator(getCompToMoveSVP(), getAllCompsMVP());

		AndOperator andRoot = Manager.createAndOperator();
		andRoot.getArguments().add(existsTargetInComponents);

		// Verifies whether target nodes are created in the model
		ExistsOperator existsTargetNodes = Manager
				.createExistsOperator(getTargetNodesMVP());
		andRoot.getArguments().add(existsTargetNodes);

		specification.setRootOperator(andRoot);
		postCondition.setConditionFormula(specification);
		setPost(postCondition);

	}

	@Override
	public void setParameters() {
		List<Parameter> params = new ArrayList<>();

		setCompToMoveSVP(Manager.createSingleValueParameter(UMLOclStringManager.getComponentQuery(umlCompToMove)));
		params.add(getCompToMoveSVP());

		setAllCompsMVP(Manager.createMultipleValuedParameter(UMLOclStringManager.getAllComponentsQuery()));

		// Sets the target node
		setTargetNodesMVP(Manager.createMultipleValuedParameter(UMLOclStringManager.getNodesQuery(umlTargetNodes)));

		params.add(getAllCompsMVP());

		getParameters().addAll(params);
	}

	@Override
	public RefactoringAction clone(RSolution solution) {

		UMLMvComponentToNN cloned = new UMLMvComponentToNN((UMLRSolution) solution);

		cloned.setNumOfChanges(this.getNumOfChanges());
		cloned.setCost(this.getCost());
		cloned.setName(this.getName());

		try {
			((UMLRSolution) solution).getDirtyIModel().deleteElement(cloned.getUmlTargetNodes().get(0));
		} catch (EolRuntimeException e) {
			System.err.println("[ERROR] the cleanUp method has generated an error, while removing the node --> "
					+ umlTargetNodes.get(0).getName());
			e.printStackTrace();
		}

		cloned.setUmlCompToMove(this.umlCompToMove);
		cloned.setUmlTargetNodes(this.umlTargetNodes);

		cloned.parameters = this.getParameters();
		cloned.pre = this.getPre();
		cloned.post = this.getPost();

		return cloned;

	}

	public void setUmlCompToMove(Component c) {
		this.umlCompToMove = c;
	}

	public void setUmlTargetNodes(List<Node> n) {
		umlTargetNodes.clear();
		umlTargetNodes.addAll(n);
	}


	@Override
	public String toString() {
		String nodes = "";
		for (Node n : umlTargetNodes)
			nodes += " " + n.getName();
		return "Moving --> " + umlCompToMove.getName() + " to --> " + nodes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sourceModelPath == null) ? 0 : sourceModelPath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UMLMvComponentToNN other = (UMLMvComponentToNN) obj;
		if (sourceModelPath == null) {
			if (other.sourceModelPath != null)
				return false;
		} else if (!sourceModelPath.equals(other.sourceModelPath))
			return false;
		return true;
	}

}
