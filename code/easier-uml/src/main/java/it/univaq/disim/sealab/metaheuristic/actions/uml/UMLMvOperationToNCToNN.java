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
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
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
import logicalSpecification.NotOperator;
import logicalSpecification.Parameter;
import logicalSpecification.PostCondition;
import logicalSpecification.PreCondition;
import logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl;

public class UMLMvOperationToNCToNN extends UMLMoveOperationActionImpl implements RefactoringAction {

	private final static String eolModulePath;

	private final static double VALUE_COST = 1.80;

	private final String sourceModelPath;

	private Node umlTargetNode;

	static {
		eolModulePath = Paths.get(FileSystems.getDefault().getPath("").toAbsolutePath().toString(), "..",
				"easier-refactoringLibrary", "easier-ref-operations", "mv_op_nc_nn.eol").toString();
	}

	public UMLMvOperationToNCToNN(UMLRSolution sol) {

		sourceModelPath = sol.getModelPath().toString();

		umlOpToMove = getRandomOperation(sol);
		umlTargetComp = createNewComponent(sol);
		umlTargetNode = createNewNode(sol);

		cost = calculateCost(sol);
		numOfChanges = cost;

		setParameters();
		createPreCondition();
		createPostCondition();

	}

	private double calculateCost(final UMLRSolution sol) {
		long msgs = sol.getDirtyIModel().allContents().stream().filter(Message.class::isInstance)
				.map(Message.class::cast).filter(m -> getUmlOpToMove().equals(m.getSignature())).count();
		return msgs * VALUE_COST;
	}

	// creates a new Node within the model
	private Node createNewNode(UMLRSolution sol) {

		org.eclipse.uml2.uml.Package deploymentView = null;
		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& "deployment_view".equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				deploymentView = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}

		Node newNode = UMLFactory.eINSTANCE.createNode();
		deploymentView.getPackagedElements().add(newNode);

		newNode.setName("New-Node_" + generateHash());
		return newNode;
	}

	// creates a new Component within the model
	private Component createNewComponent(UMLRSolution sol) {

		org.eclipse.uml2.uml.Package staticView = null;
		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& "static_view".equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				staticView = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}

		Component newComp = UMLFactory.eINSTANCE.createComponent();
		staticView.getPackagedElements().add(newComp);

		newComp.setName("New-Component_" + generateHash());
		return newComp;
	}

	private String generateHash() {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;

		return new Random().ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	// retrieves a random operation from the source model
	private Operation getRandomOperation(UMLRSolution sol) {
		org.eclipse.uml2.uml.Package dynamicView = null;
		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& "dynamic_view".equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				dynamicView = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}

		List<Object> usecases = new ArrayList<>(
				EcoreUtil.getObjectsByType(dynamicView.getOwnedElements(), UMLPackage.Literals.USE_CASE));

		UseCase uc = (UseCase) usecases.get(JMetalRandom.getInstance().nextInt(0, usecases.size() - 1));

		Message msg = null;

		// returns a random message from a random interaction. Moreover, the message has
		// not to be a "reply" message
		do {
			msg = ((Interaction) uc.getOwnedBehaviors().get(0)).getMessages().get(JMetalRandom.getInstance().nextInt(0,
					((Interaction) uc.getOwnedBehaviors().get(0)).getMessages().size() - 1));
		} while (msg.getMessageSort().toString().equals("reply"));

		return (Operation) msg.getSignature();
	}

	@Override
	public void execute() {

		EOLStandalone executor = new EOLStandalone();

		try {
			EasierUmlModel contextModel = EpsilonStandalone.createUmlModel(sourceModelPath);
			contextModel.setStoredOnDisposal(true);
			
			executor.setModel(contextModel);
			executor.setSource(Paths.get(eolModulePath));

			executor.setParameter(umlOpToMove.getName(), "String", "targetOperationName");
			executor.setParameter(umlTargetComp.getName(), "String", "newComponentName");
			executor.setParameter(umlTargetNode.getName(), "String", "newNodeName");

			executor.execute();
		} catch (EolRuntimeException e) {
			System.err.println("Error in execution the eolmodule " + eolModulePath);
//			e.printStackTrace();
		}catch (URISyntaxException e) {
			EasierLogger.logger_.severe(String.format("ERROR while reading the model", sourceModelPath));
		}

		executor.clearMemory();
	}

	@Override
	public void createPreCondition() {
		PreCondition preCondition = Manager.createPreCondition();

		FOLSpecification specification = Manager.createFOLSpectification("MvOperationToNCToNNPreCondition");

		ExistsOperator existsOpInOperations = Manager.createExistsInCollectionOperator(getOpToMoveSVP(),
				getAllOpsMVP());

		ExistsOperator existsTargetInComponents = Manager.createExistsInCollectionOperator(getTargetCompSVP(),
				getAllCompsMVP());
		ExistsOperator existsOpInOpsOfTarget = Manager.createExistsInCollectionOperator(getOpToMoveSVP(),
				getAllTargetCompOpsMVP());

		NotOperator notExistsOpInOpsOfTarget = Manager.createNotOperator(existsOpInOpsOfTarget);

		AndOperator andRoot = Manager.createAndOperator();
		andRoot.getArguments().add(existsOpInOperations);
		andRoot.getArguments().add(existsTargetInComponents);
		andRoot.getArguments().add(notExistsOpInOpsOfTarget);

		specification.setRootOperator(andRoot);
		preCondition.setConditionFormula(specification);
		setPre(preCondition);
	}

	@Override
	public void createPostCondition() {
		PostCondition postCondition = Manager.createPostCondition();
		FOLSpecification specification = Manager.createFOLSpectification("MvOperationToNCToNNPostCondition");

		ExistsOperator existsTargetInComponents = Manager.createExistsInCollectionOperator(getTargetCompSVP(),
				getAllCompsMVP());
		ExistsOperator existsOpInOpsOfTarget = Manager.createExistsInCollectionOperator(getOpToMoveSVP(),
				getAllTargetCompOpsMVP());

		AndOperator andRoot = Manager.createAndOperator();
		andRoot.getArguments().add(existsTargetInComponents);
		andRoot.getArguments().add(existsOpInOpsOfTarget);

		specification.setRootOperator(andRoot);
		postCondition.setConditionFormula(specification);
		setPost(postCondition);

	}

	@Override
	public void setParameters() {
		List<Parameter> moveOpParams = new ArrayList<>();

		setOpToMoveSVP(Manager.createSingleValueParameter(UMLOclStringManager.getOperationQuery(getUmlOpToMove())));
		moveOpParams.add(getOpToMoveSVP());

		setTargetCompSVP(Manager.createSingleValueParameter(UMLOclStringManager.getComponentQuery(getUmlTargetComp())));
		moveOpParams.add(getTargetCompSVP());

		setAllOpsMVP(Manager.createMultipleValuedParameter(UMLOclStringManager.getAllOperationsQuery()));
		moveOpParams.add(getAllOpsMVP());

		setAllCompsMVP(Manager.createMultipleValuedParameter(UMLOclStringManager.getAllComponentsQuery()));
		moveOpParams.add(getAllCompsMVP());

		setAllTargetCompOpsMVP(
				Manager.createMultipleValuedParameter(UMLOclStringManager.getOperationsOfQuery(getUmlTargetComp())));
		moveOpParams.add(getAllTargetCompOpsMVP());

		getParameters().addAll(moveOpParams);
	}

	@Override
	public RefactoringAction clone(RSolution solution) {
		UMLMvOperationToNCToNN cloned = new UMLMvOperationToNCToNN((UMLRSolution) solution);

		cloned.setNumOfChanges(this.getNumOfChanges());
		cloned.setCost(this.getCost());
		cloned.setName(this.getName());

		try {
			((UMLRSolution) solution).getDirtyIModel().deleteElement(cloned.getUmlTargetComp());
			((UMLRSolution) solution).getDirtyIModel().deleteElement(cloned.getUmlTargetNode());
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}

		cloned.umlOpToMove = this.umlOpToMove;
		cloned.umlTargetComp = this.umlTargetComp;
		cloned.umlTargetNode = this.umlTargetNode;

		cloned.parameters = this.getParameters();
		cloned.pre = this.getPre();
		cloned.post = this.getPost();

		return cloned;
	}

	public Node getUmlTargetNode() {
		return umlTargetNode;
	}

	public String toString() {
		return "Move Operation --> " + umlOpToMove.getName() + " to New Component --> " + umlTargetComp.getName()
				+ " deployed to a New Node -->" + umlTargetNode.getName();
	}

}
