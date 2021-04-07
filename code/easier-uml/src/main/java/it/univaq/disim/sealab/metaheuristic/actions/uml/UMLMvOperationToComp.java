package it.univaq.disim.sealab.metaheuristic.actions.uml;

import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
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
import logicalSpecification.AndOperator;
import logicalSpecification.ExistsOperator;
import logicalSpecification.FOLSpecification;
import logicalSpecification.NotOperator;
import logicalSpecification.Parameter;
import logicalSpecification.PostCondition;
import logicalSpecification.PreCondition;
import logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl;

public class UMLMvOperationToComp extends UMLMoveOperationActionImpl implements RefactoringAction {

	private final static String eolModulePath;

	private final static double VALUE_COST = 1.23;

	private final String sourceModelPath;

	static {
		eolModulePath = Paths.get(FileSystems.getDefault().getPath("").toAbsolutePath().toString(), "..",
				"easier-refactoringLibrary", "easier-ref-operations", "mv_op_comp.eol").toString();
	}

	public UMLMvOperationToComp(UMLRSolution sol) {

		sourceModelPath = sol.getModelPath().toString();

		umlOpToMove = getRandomOperation(sol);
		umlTargetComp = getRandomComponent(sol);

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

	// retrieves a random operation from the source model
	private Operation getRandomOperation(UMLRSolution sol) {
		org.eclipse.uml2.uml.Package dynamicView = getPackage("dynamic_view", sol);

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

	/**
	 * Returns the specific package identified by @param
	 * 
	 * @param pkgName is the name of the package
	 * @param sol
	 * @return
	 */
	private org.eclipse.uml2.uml.Package getPackage(final String pkgName, final UMLRSolution sol) {

		org.eclipse.uml2.uml.Model rootPackage = null;
		for (Object pkg : EcoreUtil.getObjectsByType(sol.getDirtyIModel().allContents(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Model) {
				rootPackage = (org.eclipse.uml2.uml.Model) pkg;
				break;
			}
		}

		org.eclipse.uml2.uml.Package returnPackage = null;
		for (Object pkg : EcoreUtil.getObjectsByType(rootPackage.getOwnedElements(), UMLPackage.Literals.PACKAGE)) {
			if (pkg instanceof org.eclipse.uml2.uml.Package
					&& pkgName.equals(((org.eclipse.uml2.uml.Package) pkg).getName())) {
				returnPackage = (org.eclipse.uml2.uml.Package) pkg;
				break;
			}
		}
		return returnPackage;
	}

	private Component getRandomComponent(UMLRSolution sol) {

		Package staticView = getPackage("static_view", sol);

		List<Object> cmps = new ArrayList<>(
				EcoreUtil.getObjectsByType(staticView.getOwnedElements(), UMLPackage.Literals.COMPONENT));
		Component cmp = null;
		do {
			cmp = (Component) cmps.get(JMetalRandom.getInstance().nextInt(0, cmps.size() - 1));
		} while (cmp.getOperations().contains(umlOpToMove));

		return cmp;
	}

	@Override
	public void execute() {

		EOLStandalone executor = new EOLStandalone();

		try {
			EasierUmlModel contextModel = EpsilonStandalone.createUmlModel(sourceModelPath);
			contextModel.setStoredOnDisposal(true);

			executor.setModel(contextModel);
			executor.setSource(Paths.get(eolModulePath));
			executor.setParameter(umlOpToMove.getName(), "String", "targetOperationName")
					.setParameter(umlTargetComp.getName(), "String", "targetComponentName");

			executor.execute();
		} catch (EolRuntimeException e) {
			System.err.println("Error in execution the eolmodule " + eolModulePath);
//			e.printStackTrace();
		}catch(URISyntaxException e2) {
			e2.printStackTrace();
		}
		executor.clearMemory();
		executor = null;
	}

	@Override
	public void createPreCondition() {
		PreCondition preCondition = Manager.createPreCondition();

		FOLSpecification specification = Manager.createFOLSpectification("MvOperationToComponentPreCondition");

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
		FOLSpecification specification = Manager.createFOLSpectification("MvOperationToComponentPostCondition");

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
		UMLMvOperationToComp cloned = new UMLMvOperationToComp((UMLRSolution) solution);

		cloned.setNumOfChanges(this.getNumOfChanges());
		cloned.setCost(this.getCost());
		cloned.setName(this.getName());
		
		cloned.umlOpToMove = this.umlOpToMove;
		cloned.umlTargetComp = this.umlTargetComp;

		cloned.parameters = this.getParameters();
		cloned.pre = this.getPre();
		cloned.post = this.getPost();

		return cloned;
	}


	@Override
	public String toString() {
		return "Move Operation --> " + umlOpToMove.getName() + " to Component -->  " + umlTargetComp.getName();
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
		UMLMvOperationToComp other = (UMLMvOperationToComp) obj;
		if (sourceModelPath == null) {
			if (other.sourceModelPath != null)
				return false;
		} else if (!sourceModelPath.equals(other.sourceModelPath))
			return false;
		return true;
	}

}
