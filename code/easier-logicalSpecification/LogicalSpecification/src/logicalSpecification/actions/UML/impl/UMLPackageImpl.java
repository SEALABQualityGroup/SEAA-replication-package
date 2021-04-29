/**
 */
package logicalSpecification.actions.UML.impl;

import logicalSpecification.LogicalSpecificationPackage;

import logicalSpecification.actions.AEmilia.AEmiliaPackage;

import logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl;

import logicalSpecification.actions.UML.UMLAddAction;
import logicalSpecification.actions.UML.UMLAddComponentAction;
import logicalSpecification.actions.UML.UMLAddNodeAction;
import logicalSpecification.actions.UML.UMLAddOperationAction;
import logicalSpecification.actions.UML.UMLDeleteAction;
import logicalSpecification.actions.UML.UMLDeleteComponentAction;
import logicalSpecification.actions.UML.UMLDeleteNodeAction;
import logicalSpecification.actions.UML.UMLDeleteOperationAction;
import logicalSpecification.actions.UML.UMLFactory;
import logicalSpecification.actions.UML.UMLMoveAction;
import logicalSpecification.actions.UML.UMLMoveComponentAction;
import logicalSpecification.actions.UML.UMLMoveOperationAction;
import logicalSpecification.actions.UML.UMLPackage;

import logicalSpecification.antipatterns.performance.PerformancePackage;

import logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl;

import logicalSpecification.impl.LogicalSpecificationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLPackageImpl extends EPackageImpl implements UMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAddActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDeleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlMoveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAddNodeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAddComponentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAddOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDeleteNodeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDeleteComponentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDeleteOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlMoveComponentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlMoveOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType packageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType artifactEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see logicalSpecification.actions.UML.UMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UMLPackageImpl() {
		super(eNS_URI, UMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UMLPackage init() {
		if (isInited) return (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UMLPackageImpl theUMLPackage = registeredUMLPackage instanceof UMLPackageImpl ? (UMLPackageImpl)registeredUMLPackage : new UMLPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalSpecificationPackage.eNS_URI);
		LogicalSpecificationPackageImpl theLogicalSpecificationPackage = (LogicalSpecificationPackageImpl)(registeredPackage instanceof LogicalSpecificationPackageImpl ? registeredPackage : LogicalSpecificationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AEmiliaPackage.eNS_URI);
		AEmiliaPackageImpl theAEmiliaPackage = (AEmiliaPackageImpl)(registeredPackage instanceof AEmiliaPackageImpl ? registeredPackage : AEmiliaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);
		PerformancePackageImpl thePerformancePackage = (PerformancePackageImpl)(registeredPackage instanceof PerformancePackageImpl ? registeredPackage : PerformancePackage.eINSTANCE);

		// Create package meta-data objects
		theUMLPackage.createPackageContents();
		theLogicalSpecificationPackage.createPackageContents();
		theAEmiliaPackage.createPackageContents();
		thePerformancePackage.createPackageContents();

		// Initialize created meta-data
		theUMLPackage.initializePackageContents();
		theLogicalSpecificationPackage.initializePackageContents();
		theAEmiliaPackage.initializePackageContents();
		thePerformancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, theUMLPackage);
		return theUMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLAddAction() {
		return umlAddActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLDeleteAction() {
		return umlDeleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLMoveAction() {
		return umlMoveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLAddNodeAction() {
		return umlAddNodeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddNodeAction_NodeToAddSVP() {
		return (EReference)umlAddNodeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddNodeAction_NeighborsMVP() {
		return (EReference)umlAddNodeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddNodeAction_CompsToDeployMVP() {
		return (EReference)umlAddNodeActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddNodeAction_AllCompsMVP() {
		return (EReference)umlAddNodeActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddNodeAction_AllNodesMVP() {
		return (EReference)umlAddNodeActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddNodeAction_AllDeployedElemsMVP() {
		return (EReference)umlAddNodeActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddNodeAction_UmlNodeToAdd() {
		return (EAttribute)umlAddNodeActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddNodeAction_UmlNeighbors() {
		return (EAttribute)umlAddNodeActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddNodeAction_UmlCompsToDeploy() {
		return (EAttribute)umlAddNodeActionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddNodeAction_UmlSourcePackage() {
		return (EAttribute)umlAddNodeActionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLAddComponentAction() {
		return umlAddComponentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddComponentAction_ComponentToAddSVP() {
		return (EReference)umlAddComponentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddComponentAction_TargetNodesMVP() {
		return (EReference)umlAddComponentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddComponentAction_DeployedCompsMVP() {
		return (EReference)umlAddComponentActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddComponentAction_AllCompsMVP() {
		return (EReference)umlAddComponentActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddComponentAction_AllNodesMVP() {
		return (EReference)umlAddComponentActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddComponentAction_UmlCompToAdd() {
		return (EAttribute)umlAddComponentActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddComponentAction_UmlSourcePackage() {
		return (EAttribute)umlAddComponentActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddComponentAction_UmlTargetNodes() {
		return (EAttribute)umlAddComponentActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLAddOperationAction() {
		return umlAddOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddOperationAction_OpToAddSVP() {
		return (EReference)umlAddOperationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddOperationAction_TargetCompSVP() {
		return (EReference)umlAddOperationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddOperationAction_AllCompsMVP() {
		return (EReference)umlAddOperationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLAddOperationAction_TargetCompOpsMVP() {
		return (EReference)umlAddOperationActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddOperationAction_UmlOpToAdd() {
		return (EAttribute)umlAddOperationActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLAddOperationAction_UmlTargetComp() {
		return (EAttribute)umlAddOperationActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLDeleteNodeAction() {
		return umlDeleteNodeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLDeleteNodeAction_NodeToDelSVP() {
		return (EReference)umlDeleteNodeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLDeleteNodeAction_AllNodesMVP() {
		return (EReference)umlDeleteNodeActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLDeleteNodeAction_UmlNodeToDel() {
		return (EAttribute)umlDeleteNodeActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLDeleteComponentAction() {
		return umlDeleteComponentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLDeleteComponentAction_CompToDelSVP() {
		return (EReference)umlDeleteComponentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLDeleteComponentAction_AllCompsMVP() {
		return (EReference)umlDeleteComponentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLDeleteComponentAction_UmlCompToDel() {
		return (EAttribute)umlDeleteComponentActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLDeleteOperationAction() {
		return umlDeleteOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLDeleteOperationAction_OpToDelSVP() {
		return (EReference)umlDeleteOperationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLDeleteOperationAction_AllOpsMVP() {
		return (EReference)umlDeleteOperationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLDeleteOperationAction_UmlOpToDel() {
		return (EAttribute)umlDeleteOperationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLMoveComponentAction() {
		return umlMoveComponentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveComponentAction_CompToMoveSVP() {
		return (EReference)umlMoveComponentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveComponentAction_TargetNodesMVP() {
		return (EReference)umlMoveComponentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveComponentAction_AllArtifactsMVP() {
		return (EReference)umlMoveComponentActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveComponentAction_AllCompsMVP() {
		return (EReference)umlMoveComponentActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveComponentAction_AllTargetsMVP() {
		return (EReference)umlMoveComponentActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveComponentAction_AllNodesMVP() {
		return (EReference)umlMoveComponentActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveComponentAction_AllDeployedElemsMVP() {
		return (EReference)umlMoveComponentActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLMoveComponentAction_UmlCompToMove() {
		return (EAttribute)umlMoveComponentActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLMoveComponentAction_UmlTargetNodes() {
		return (EAttribute)umlMoveComponentActionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLMoveComponentAction_UmlArtifacts() {
		return (EAttribute)umlMoveComponentActionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLMoveOperationAction() {
		return umlMoveOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveOperationAction_OpToMoveSVP() {
		return (EReference)umlMoveOperationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveOperationAction_TargetCompSVP() {
		return (EReference)umlMoveOperationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveOperationAction_AllOpsMVP() {
		return (EReference)umlMoveOperationActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveOperationAction_AllCompsMVP() {
		return (EReference)umlMoveOperationActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLMoveOperationAction_AllTargetCompOpsMVP() {
		return (EReference)umlMoveOperationActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLMoveOperationAction_UmlOpToMove() {
		return (EAttribute)umlMoveOperationActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLMoveOperationAction_UmlTargetComp() {
		return (EAttribute)umlMoveOperationActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComponent() {
		return componentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNode() {
		return nodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPackage() {
		return packageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperation() {
		return operationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArtifact() {
		return artifactEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLFactory getUMLFactory() {
		return (UMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		umlAddActionEClass = createEClass(UML_ADD_ACTION);

		umlDeleteActionEClass = createEClass(UML_DELETE_ACTION);

		umlMoveActionEClass = createEClass(UML_MOVE_ACTION);

		umlAddNodeActionEClass = createEClass(UML_ADD_NODE_ACTION);
		createEReference(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP);
		createEReference(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__NEIGHBORS_MVP);
		createEReference(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP);
		createEReference(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__ALL_COMPS_MVP);
		createEReference(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__ALL_NODES_MVP);
		createEReference(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP);
		createEAttribute(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__UML_NODE_TO_ADD);
		createEAttribute(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__UML_NEIGHBORS);
		createEAttribute(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY);
		createEAttribute(umlAddNodeActionEClass, UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE);

		umlAddComponentActionEClass = createEClass(UML_ADD_COMPONENT_ACTION);
		createEReference(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP);
		createEReference(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP);
		createEReference(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP);
		createEReference(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP);
		createEReference(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP);
		createEAttribute(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD);
		createEAttribute(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE);
		createEAttribute(umlAddComponentActionEClass, UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES);

		umlAddOperationActionEClass = createEClass(UML_ADD_OPERATION_ACTION);
		createEReference(umlAddOperationActionEClass, UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP);
		createEReference(umlAddOperationActionEClass, UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP);
		createEReference(umlAddOperationActionEClass, UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP);
		createEReference(umlAddOperationActionEClass, UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP);
		createEAttribute(umlAddOperationActionEClass, UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD);
		createEAttribute(umlAddOperationActionEClass, UML_ADD_OPERATION_ACTION__UML_TARGET_COMP);

		umlDeleteNodeActionEClass = createEClass(UML_DELETE_NODE_ACTION);
		createEReference(umlDeleteNodeActionEClass, UML_DELETE_NODE_ACTION__NODE_TO_DEL_SVP);
		createEReference(umlDeleteNodeActionEClass, UML_DELETE_NODE_ACTION__ALL_NODES_MVP);
		createEAttribute(umlDeleteNodeActionEClass, UML_DELETE_NODE_ACTION__UML_NODE_TO_DEL);

		umlDeleteComponentActionEClass = createEClass(UML_DELETE_COMPONENT_ACTION);
		createEReference(umlDeleteComponentActionEClass, UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP);
		createEReference(umlDeleteComponentActionEClass, UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP);
		createEAttribute(umlDeleteComponentActionEClass, UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL);

		umlDeleteOperationActionEClass = createEClass(UML_DELETE_OPERATION_ACTION);
		createEReference(umlDeleteOperationActionEClass, UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP);
		createEReference(umlDeleteOperationActionEClass, UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP);
		createEAttribute(umlDeleteOperationActionEClass, UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL);

		umlMoveComponentActionEClass = createEClass(UML_MOVE_COMPONENT_ACTION);
		createEReference(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP);
		createEReference(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP);
		createEReference(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP);
		createEReference(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP);
		createEReference(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP);
		createEReference(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP);
		createEReference(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP);
		createEAttribute(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE);
		createEAttribute(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES);
		createEAttribute(umlMoveComponentActionEClass, UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS);

		umlMoveOperationActionEClass = createEClass(UML_MOVE_OPERATION_ACTION);
		createEReference(umlMoveOperationActionEClass, UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP);
		createEReference(umlMoveOperationActionEClass, UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP);
		createEReference(umlMoveOperationActionEClass, UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP);
		createEReference(umlMoveOperationActionEClass, UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP);
		createEReference(umlMoveOperationActionEClass, UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP);
		createEAttribute(umlMoveOperationActionEClass, UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE);
		createEAttribute(umlMoveOperationActionEClass, UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP);

		// Create data types
		componentEDataType = createEDataType(COMPONENT);
		nodeEDataType = createEDataType(NODE);
		packageEDataType = createEDataType(PACKAGE);
		operationEDataType = createEDataType(OPERATION);
		artifactEDataType = createEDataType(ARTIFACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LogicalSpecificationPackage theLogicalSpecificationPackage = (LogicalSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(LogicalSpecificationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		umlAddActionEClass.getESuperTypes().add(theLogicalSpecificationPackage.getAddAction());
		umlDeleteActionEClass.getESuperTypes().add(theLogicalSpecificationPackage.getDeleteAction());
		umlMoveActionEClass.getESuperTypes().add(theLogicalSpecificationPackage.getMoveAction());
		umlAddNodeActionEClass.getESuperTypes().add(this.getUMLAddAction());
		umlAddComponentActionEClass.getESuperTypes().add(this.getUMLAddAction());
		umlAddOperationActionEClass.getESuperTypes().add(this.getUMLAddAction());
		umlDeleteNodeActionEClass.getESuperTypes().add(this.getUMLDeleteAction());
		umlDeleteComponentActionEClass.getESuperTypes().add(this.getUMLDeleteAction());
		umlDeleteOperationActionEClass.getESuperTypes().add(this.getUMLDeleteAction());
		umlMoveComponentActionEClass.getESuperTypes().add(this.getUMLMoveAction());
		umlMoveOperationActionEClass.getESuperTypes().add(this.getUMLMoveAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(umlAddActionEClass, UMLAddAction.class, "UMLAddAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlDeleteActionEClass, UMLDeleteAction.class, "UMLDeleteAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlMoveActionEClass, UMLMoveAction.class, "UMLMoveAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlAddNodeActionEClass, UMLAddNodeAction.class, "UMLAddNodeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLAddNodeAction_NodeToAddSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "nodeToAddSVP", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddNodeAction_NeighborsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "neighborsMVP", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddNodeAction_CompsToDeployMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "compsToDeployMVP", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddNodeAction_AllCompsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allCompsMVP", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddNodeAction_AllNodesMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allNodesMVP", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddNodeAction_AllDeployedElemsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allDeployedElemsMVP", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddNodeAction_UmlNodeToAdd(), this.getNode(), "umlNodeToAdd", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddNodeAction_UmlNeighbors(), this.getNode(), "umlNeighbors", null, 0, -1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddNodeAction_UmlCompsToDeploy(), this.getComponent(), "umlCompsToDeploy", null, 0, -1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddNodeAction_UmlSourcePackage(), this.getPackage(), "umlSourcePackage", null, 1, 1, UMLAddNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlAddComponentActionEClass, UMLAddComponentAction.class, "UMLAddComponentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLAddComponentAction_ComponentToAddSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "componentToAddSVP", null, 1, 1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddComponentAction_TargetNodesMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "targetNodesMVP", null, 1, 1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddComponentAction_DeployedCompsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "deployedCompsMVP", null, 1, 1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddComponentAction_AllCompsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allCompsMVP", null, 1, 1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddComponentAction_AllNodesMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allNodesMVP", null, 1, 1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddComponentAction_UmlCompToAdd(), this.getComponent(), "umlCompToAdd", null, 1, 1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddComponentAction_UmlSourcePackage(), this.getPackage(), "umlSourcePackage", null, 1, 1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddComponentAction_UmlTargetNodes(), this.getNode(), "umlTargetNodes", null, 1, -1, UMLAddComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlAddOperationActionEClass, UMLAddOperationAction.class, "UMLAddOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLAddOperationAction_OpToAddSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "opToAddSVP", null, 1, 1, UMLAddOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddOperationAction_TargetCompSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "targetCompSVP", null, 1, 1, UMLAddOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddOperationAction_AllCompsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allCompsMVP", null, 1, 1, UMLAddOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLAddOperationAction_TargetCompOpsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "targetCompOpsMVP", null, 1, 1, UMLAddOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddOperationAction_UmlOpToAdd(), this.getOperation(), "umlOpToAdd", null, 1, 1, UMLAddOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLAddOperationAction_UmlTargetComp(), this.getComponent(), "umlTargetComp", null, 1, 1, UMLAddOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlDeleteNodeActionEClass, UMLDeleteNodeAction.class, "UMLDeleteNodeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLDeleteNodeAction_NodeToDelSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "nodeToDelSVP", null, 1, 1, UMLDeleteNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLDeleteNodeAction_AllNodesMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allNodesMVP", null, 1, 1, UMLDeleteNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLDeleteNodeAction_UmlNodeToDel(), this.getNode(), "umlNodeToDel", null, 1, 1, UMLDeleteNodeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlDeleteComponentActionEClass, UMLDeleteComponentAction.class, "UMLDeleteComponentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLDeleteComponentAction_CompToDelSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "compToDelSVP", null, 1, 1, UMLDeleteComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLDeleteComponentAction_AllCompsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allCompsMVP", null, 1, 1, UMLDeleteComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLDeleteComponentAction_UmlCompToDel(), this.getComponent(), "umlCompToDel", null, 1, 1, UMLDeleteComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlDeleteOperationActionEClass, UMLDeleteOperationAction.class, "UMLDeleteOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLDeleteOperationAction_OpToDelSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "opToDelSVP", null, 1, 1, UMLDeleteOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLDeleteOperationAction_AllOpsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOpsMVP", null, 1, 1, UMLDeleteOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLDeleteOperationAction_UmlOpToDel(), this.getOperation(), "umlOpToDel", null, 1, 1, UMLDeleteOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlMoveComponentActionEClass, UMLMoveComponentAction.class, "UMLMoveComponentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLMoveComponentAction_CompToMoveSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "compToMoveSVP", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveComponentAction_TargetNodesMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "targetNodesMVP", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveComponentAction_AllArtifactsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allArtifactsMVP", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveComponentAction_AllCompsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allCompsMVP", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveComponentAction_AllTargetsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allTargetsMVP", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveComponentAction_AllNodesMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allNodesMVP", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveComponentAction_AllDeployedElemsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allDeployedElemsMVP", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLMoveComponentAction_UmlCompToMove(), this.getComponent(), "umlCompToMove", null, 1, 1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLMoveComponentAction_UmlTargetNodes(), this.getNode(), "umlTargetNodes", null, 1, -1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLMoveComponentAction_UmlArtifacts(), this.getArtifact(), "umlArtifacts", null, 0, -1, UMLMoveComponentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlMoveOperationActionEClass, UMLMoveOperationAction.class, "UMLMoveOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLMoveOperationAction_OpToMoveSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "opToMoveSVP", null, 1, 1, UMLMoveOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveOperationAction_TargetCompSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "targetCompSVP", null, 1, 1, UMLMoveOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveOperationAction_AllOpsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOpsMVP", null, 1, 1, UMLMoveOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveOperationAction_AllCompsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allCompsMVP", null, 1, 1, UMLMoveOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLMoveOperationAction_AllTargetCompOpsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allTargetCompOpsMVP", null, 1, 1, UMLMoveOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLMoveOperationAction_UmlOpToMove(), this.getOperation(), "umlOpToMove", null, 1, 1, UMLMoveOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLMoveOperationAction_UmlTargetComp(), this.getComponent(), "umlTargetComp", null, 1, 1, UMLMoveOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(componentEDataType, Component.class, "Component", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeEDataType, Node.class, "Node", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(packageEDataType, org.eclipse.uml2.uml.Package.class, "Package", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationEDataType, Operation.class, "Operation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(artifactEDataType, Artifact.class, "Artifact", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //UMLPackageImpl
