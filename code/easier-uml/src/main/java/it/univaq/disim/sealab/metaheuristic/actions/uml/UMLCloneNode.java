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

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
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
import logicalSpecification.SingleValuedParameter;
import logicalSpecification.actions.UML.UMLPackage;
import logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl;

public class UMLCloneNode extends UMLAddNodeActionImpl implements RefactoringAction {

	private final static Path eolModulePath;

	private final static double VALUE_COST = 1.23;

	private final String sourceModelPath;

	private Node targetObject, umlClonedNode;

	private SingleValuedParameter umlNodeToCloneSVP, umlClonedNodeSVP;

	static {
		eolModulePath = Paths.get(FileSystems.getDefault().getPath("").toAbsolutePath().toString(), "..",
				"easier-refactoringLibrary", "easier-ref-operations", "clone_node.eol");
	}

	public static Path getEolModulePath() {
		return eolModulePath;
	}

	public UMLCloneNode(UMLRSolution sol) {

		sourceModelPath = sol.getModelPath().toString();

		targetObject = getRandomNode(sol);

		umlClonedNode = createNewNode(sol);

		cost = calculateCost();
		numOfChanges = cost;

		setParameters();
		createPreCondition();
		createPostCondition();

	}

	private double calculateCost() {

		int cpSize = targetObject.getCommunicationPaths().size();

		int artSize = 0;

		targetObject.getDeployments().stream().flatMap(d -> d.getDeployedArtifacts().stream()).count();

		return (cpSize + artSize) * VALUE_COST;

	}

	private String generateHash() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;

		return new Random().ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	private Node createNewNode(UMLRSolution sol) {

		org.eclipse.uml2.uml.Package deploymentView = null;
		// Retrieves the deployment view package
		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& "deployment_view".equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				deploymentView = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}

		Node node = UMLFactory.eINSTANCE.createNode();
		node.setName(targetObject.getName() + "_" + generateHash());

		deploymentView.getPackagedElements().add(node);

		return node;

	}

	// Returns a random Node to be cloned
	private Node getRandomNode(UMLRSolution sol) {

		org.eclipse.uml2.uml.Package deploymentView = null;
		org.eclipse.uml2.uml.Model rootPackage = null;

		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Model) {
				rootPackage = (org.eclipse.uml2.uml.Model) pkg;
				break;
			}
		}

		for (Object pkg : EcoreUtil.getObjectsByType(rootPackage.getOwnedElements(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& "deployment_view".equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				deploymentView = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}
		List<Object> nodes = new ArrayList<>(
				EcoreUtil.getObjectsByType(deploymentView.getOwnedElements(), UMLPackage.Literals.NODE));
		return (Node) nodes.get(JMetalRandom.getInstance().nextInt(0, nodes.size() - 1));
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
			executor.setParameter(targetObject.getName(), "String", "targetNodeName");
			executor.setParameter(umlClonedNode.getName(), "String", "clonedNodeName");

			executor.execute();
		} catch (EolRuntimeException e) {
			System.err.println("Error in execution the eolmodule " + eolModulePath);
			System.err.println(String.format("No Node called '%s' ", targetObject.getName()));
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

		FOLSpecification specification = Manager.createFOLSpectification("CloneNodePreCondition");

		ExistsOperator existsTargetInNodes = Manager.createExistsInCollectionOperator(umlNodeToCloneSVP,
				getAllNodesMVP());

		AndOperator andRoot = Manager.createAndOperator();
		andRoot.getArguments().add(existsTargetInNodes);

		specification.setRootOperator(andRoot);
		preCondition.setConditionFormula(specification);
		setPre(preCondition);
	}

	@Override
	public void createPostCondition() {
		PostCondition postCondition = Manager.createPostCondition();
		FOLSpecification specification = Manager.createFOLSpectification("CloneNodePostCondition");

		ExistsOperator existsTargetInNodes = Manager.createExistsInCollectionOperator(umlNodeToCloneSVP,
				getAllNodesMVP());

		ExistsOperator existsClonedInNodes = Manager.createExistsInCollectionOperator(umlClonedNodeSVP,
				getAllNodesMVP());

		AndOperator andRoot = Manager.createAndOperator();
		andRoot.getArguments().add(existsTargetInNodes);
		andRoot.getArguments().add(existsClonedInNodes);

		specification.setRootOperator(andRoot);
		postCondition.setConditionFormula(specification);
		setPost(postCondition);

	}

	@Override
	public void setParameters() {
		List<Parameter> params = new ArrayList<>();

		// checks wheter the random node exists within the model
		umlNodeToCloneSVP = Manager.createSingleValueParameter(UMLOclStringManager.getNodeQuery(targetObject));
		umlClonedNodeSVP = Manager.createSingleValueParameter(UMLOclStringManager.getNodeQuery(umlClonedNode));

		params.add(umlNodeToCloneSVP);
		params.add(umlClonedNodeSVP);

		setAllNodesMVP(Manager.createMultipleValuedParameter(UMLOclStringManager.getAllNodesQuery()));

		params.add(getAllNodesMVP());
		getParameters().addAll(params);
	}

	@Override
	public RefactoringAction clone(RSolution solution) {

		UMLCloneNode cloned = new UMLCloneNode((UMLRSolution) solution);

		cloned.setNumOfChanges(this.getNumOfChanges());
		cloned.setCost(this.getCost());
		cloned.setName(this.getName());

		try {
			((UMLRSolution) solution).getDirtyIModel().deleteElement(cloned.getClonedNode());
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}

		cloned.setTargetObject(this.targetObject);
		cloned.setUmlClonedNode(this.umlClonedNode);

		cloned.parameters = this.getParameters();
		cloned.pre = this.getPre();
		cloned.post = this.getPost();

		return cloned;

	}

	public Node getTargetObject() {
		return this.targetObject;
	}

	public Node getClonedNode() {
		return this.umlClonedNode;
	}

	public void setUmlClonedNode(Node n) {
		this.umlClonedNode = n;
	}

	public void setTargetObject(Node n) {
		this.targetObject = n;
	}

	@Override
	public String toString() {
		return "Cloning --> " + targetObject.getName() + " with -->  " + umlClonedNode.getName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sourceModelPath == null) ? 0 : sourceModelPath.hashCode());
		result = prime * result + ((targetObject == null) ? 0 : targetObject.hashCode());
		result = prime * result + ((umlClonedNode == null) ? 0 : umlClonedNode.hashCode());
		result = prime * result + ((umlClonedNodeSVP == null) ? 0 : umlClonedNodeSVP.hashCode());
		result = prime * result + ((umlNodeToCloneSVP == null) ? 0 : umlNodeToCloneSVP.hashCode());
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
		UMLCloneNode other = (UMLCloneNode) obj;
		if (sourceModelPath == null) {
			if (other.sourceModelPath != null)
				return false;
		} else if (!sourceModelPath.equals(other.sourceModelPath))
			return false;
		if (targetObject == null) {
			if (other.targetObject != null)
				return false;
		} else if (!targetObject.equals(other.targetObject))
			return false;
		if (umlClonedNode == null) {
			if (other.umlClonedNode != null)
				return false;
		} else if (!umlClonedNode.equals(other.umlClonedNode))
			return false;
		if (umlClonedNodeSVP == null) {
			if (other.umlClonedNodeSVP != null)
				return false;
		} else if (!umlClonedNodeSVP.equals(other.umlClonedNodeSVP))
			return false;
		if (umlNodeToCloneSVP == null) {
			if (other.umlNodeToCloneSVP != null)
				return false;
		} else if (!umlNodeToCloneSVP.equals(other.umlNodeToCloneSVP))
			return false;
		return true;
	}

}
