/**
 */
package logicalSpecification.actions.AEmilia.impl;

import logicalSpecification.LogicalSpecificationPackage;

import logicalSpecification.actions.AEmilia.AEmiliaAddAction;
import logicalSpecification.actions.AEmilia.AEmiliaChangeAction;
import logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction;
import logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction;
import logicalSpecification.actions.AEmilia.AEmiliaDeleteAction;
import logicalSpecification.actions.AEmilia.AEmiliaFactory;
import logicalSpecification.actions.AEmilia.AEmiliaMoveAction;
import logicalSpecification.actions.AEmilia.AEmiliaPackage;
import logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction;

import logicalSpecification.actions.UML.UMLPackage;

import logicalSpecification.actions.UML.impl.UMLPackageImpl;

import logicalSpecification.antipatterns.performance.PerformancePackage;

import logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl;

import logicalSpecification.impl.LogicalSpecificationPackageImpl;

import metamodel.mmaemilia.AEmiliaSpecification;
import metamodel.mmaemilia.ArchiElemInstance;
import metamodel.mmaemilia.Attachment;
import metamodel.mmaemilia.ElemType;

import metamodel.mmaemilia.Headers.ConstInit;

import metamodel.mmaemilia.InputInteraction;
import metamodel.mmaemilia.OutputInteraction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AEmiliaPackageImpl extends EPackageImpl implements AEmiliaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEmiliaAddActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEmiliaDeleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEmiliaMoveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEmiliaCloneAEIActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEmiliaConstChangesActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEmiliaChangeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEmiliaRemoveClonedAEIActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elemTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputInteractionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType archiElemInstanceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputInteractionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attachmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aEmiliaSpecificationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constInitEDataType = null;

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
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AEmiliaPackageImpl() {
		super(eNS_URI, AEmiliaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AEmiliaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AEmiliaPackage init() {
		if (isInited) return (AEmiliaPackage)EPackage.Registry.INSTANCE.getEPackage(AEmiliaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAEmiliaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AEmiliaPackageImpl theAEmiliaPackage = registeredAEmiliaPackage instanceof AEmiliaPackageImpl ? (AEmiliaPackageImpl)registeredAEmiliaPackage : new AEmiliaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalSpecificationPackage.eNS_URI);
		LogicalSpecificationPackageImpl theLogicalSpecificationPackage = (LogicalSpecificationPackageImpl)(registeredPackage instanceof LogicalSpecificationPackageImpl ? registeredPackage : LogicalSpecificationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		UMLPackageImpl theUMLPackage = (UMLPackageImpl)(registeredPackage instanceof UMLPackageImpl ? registeredPackage : UMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);
		PerformancePackageImpl thePerformancePackage = (PerformancePackageImpl)(registeredPackage instanceof PerformancePackageImpl ? registeredPackage : PerformancePackage.eINSTANCE);

		// Create package meta-data objects
		theAEmiliaPackage.createPackageContents();
		theLogicalSpecificationPackage.createPackageContents();
		theUMLPackage.createPackageContents();
		thePerformancePackage.createPackageContents();

		// Initialize created meta-data
		theAEmiliaPackage.initializePackageContents();
		theLogicalSpecificationPackage.initializePackageContents();
		theUMLPackage.initializePackageContents();
		thePerformancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAEmiliaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AEmiliaPackage.eNS_URI, theAEmiliaPackage);
		return theAEmiliaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEmiliaAddAction() {
		return aEmiliaAddActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEmiliaDeleteAction() {
		return aEmiliaDeleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEmiliaMoveAction() {
		return aEmiliaMoveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEmiliaCloneAEIAction() {
		return aEmiliaCloneAEIActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaCloneAEIAction_SourceAEI() {
		return (EAttribute)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaCloneAEIAction_ClonedAEI() {
		return (EAttribute)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaCloneAEIAction_ListOfInputInteractions() {
		return (EAttribute)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaCloneAEIAction_ListOfOutputInteractions() {
		return (EAttribute)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaCloneAEIAction_ListOfNewAttachments() {
		return (EAttribute)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AeiToCloneSVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_ClonedAeiSVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllOrInteractsMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllInLocalInteractsMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllOutLocalInteractsMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllUniInteractsMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllLocalInteractsMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllAeisMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllInRemoteInteractsMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaCloneAEIAction_AllOutRemoteInteractsMVP() {
		return (EReference)aEmiliaCloneAEIActionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEmiliaConstChangesAction() {
		return aEmiliaConstChangesActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaConstChangesAction_SourceConstInit() {
		return (EAttribute)aEmiliaConstChangesActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaConstChangesAction_FactorOfChange() {
		return (EAttribute)aEmiliaConstChangesActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaConstChangesAction_SourceConstInitSVP() {
		return (EReference)aEmiliaConstChangesActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaConstChangesAction_AllConstInitsMVP() {
		return (EReference)aEmiliaConstChangesActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEmiliaChangeAction() {
		return aEmiliaChangeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEmiliaRemoveClonedAEIAction() {
		return aEmiliaRemoveClonedAEIActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaRemoveClonedAEIAction_SourceAEI() {
		return (EAttribute)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaRemoveClonedAEIAction_ClonedAEI() {
		return (EAttribute)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaRemoveClonedAEIAction_ListOfInputInteractions() {
		return (EAttribute)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaRemoveClonedAEIAction_ListOfOutputInteractions() {
		return (EAttribute)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAEmiliaRemoveClonedAEIAction_ListOfNewAttachments() {
		return (EAttribute)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AeiToCloneSVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_ClonedAeiSVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllOrInteractsMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllInLocalInteractsMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllOutLocalInteractsMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllUniInteractsMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllLocalInteractsMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllAeisMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllInRemoteInteractsMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEmiliaRemoveClonedAEIAction_AllOutRemoteInteractsMVP() {
		return (EReference)aEmiliaRemoveClonedAEIActionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElemType() {
		return elemTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputInteraction() {
		return inputInteractionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArchiElemInstance() {
		return archiElemInstanceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutputInteraction() {
		return outputInteractionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttachment() {
		return attachmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAEmiliaSpecification() {
		return aEmiliaSpecificationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstInit() {
		return constInitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaFactory getAEmiliaFactory() {
		return (AEmiliaFactory)getEFactoryInstance();
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
		aEmiliaAddActionEClass = createEClass(AEMILIA_ADD_ACTION);

		aEmiliaDeleteActionEClass = createEClass(AEMILIA_DELETE_ACTION);

		aEmiliaMoveActionEClass = createEClass(AEMILIA_MOVE_ACTION);

		aEmiliaCloneAEIActionEClass = createEClass(AEMILIA_CLONE_AEI_ACTION);
		createEAttribute(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__SOURCE_AEI);
		createEAttribute(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__CLONED_AEI);
		createEAttribute(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS);
		createEAttribute(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS);
		createEAttribute(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__AEI_TO_CLONE_SVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__CLONED_AEI_SVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_OR_INTERACTS_MVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_UNI_INTERACTS_MVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_AEIS_MVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP);
		createEReference(aEmiliaCloneAEIActionEClass, AEMILIA_CLONE_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP);

		aEmiliaConstChangesActionEClass = createEClass(AEMILIA_CONST_CHANGES_ACTION);
		createEAttribute(aEmiliaConstChangesActionEClass, AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT);
		createEAttribute(aEmiliaConstChangesActionEClass, AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE);
		createEReference(aEmiliaConstChangesActionEClass, AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP);
		createEReference(aEmiliaConstChangesActionEClass, AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP);

		aEmiliaChangeActionEClass = createEClass(AEMILIA_CHANGE_ACTION);

		aEmiliaRemoveClonedAEIActionEClass = createEClass(AEMILIA_REMOVE_CLONED_AEI_ACTION);
		createEAttribute(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI);
		createEAttribute(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI);
		createEAttribute(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS);
		createEAttribute(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS);
		createEAttribute(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP);
		createEReference(aEmiliaRemoveClonedAEIActionEClass, AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP);

		// Create data types
		elemTypeEDataType = createEDataType(ELEM_TYPE);
		inputInteractionEDataType = createEDataType(INPUT_INTERACTION);
		archiElemInstanceEDataType = createEDataType(ARCHI_ELEM_INSTANCE);
		outputInteractionEDataType = createEDataType(OUTPUT_INTERACTION);
		attachmentEDataType = createEDataType(ATTACHMENT);
		aEmiliaSpecificationEDataType = createEDataType(AEMILIA_SPECIFICATION);
		constInitEDataType = createEDataType(CONST_INIT);
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
		aEmiliaAddActionEClass.getESuperTypes().add(theLogicalSpecificationPackage.getAddAction());
		aEmiliaDeleteActionEClass.getESuperTypes().add(theLogicalSpecificationPackage.getDeleteAction());
		aEmiliaMoveActionEClass.getESuperTypes().add(theLogicalSpecificationPackage.getMoveAction());
		aEmiliaCloneAEIActionEClass.getESuperTypes().add(this.getAEmiliaAddAction());
		aEmiliaConstChangesActionEClass.getESuperTypes().add(this.getAEmiliaChangeAction());
		aEmiliaChangeActionEClass.getESuperTypes().add(theLogicalSpecificationPackage.getChangeAction());
		aEmiliaRemoveClonedAEIActionEClass.getESuperTypes().add(this.getAEmiliaDeleteAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(aEmiliaAddActionEClass, AEmiliaAddAction.class, "AEmiliaAddAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aEmiliaDeleteActionEClass, AEmiliaDeleteAction.class, "AEmiliaDeleteAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aEmiliaMoveActionEClass, AEmiliaMoveAction.class, "AEmiliaMoveAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aEmiliaCloneAEIActionEClass, AEmiliaCloneAEIAction.class, "AEmiliaCloneAEIAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAEmiliaCloneAEIAction_SourceAEI(), this.getArchiElemInstance(), "sourceAEI", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaCloneAEIAction_ClonedAEI(), this.getArchiElemInstance(), "clonedAEI", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaCloneAEIAction_ListOfInputInteractions(), this.getInputInteraction(), "listOfInputInteractions", null, 0, -1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaCloneAEIAction_ListOfOutputInteractions(), this.getOutputInteraction(), "listOfOutputInteractions", null, 0, -1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaCloneAEIAction_ListOfNewAttachments(), this.getAttachment(), "listOfNewAttachments", null, 0, -1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AeiToCloneSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "aeiToCloneSVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_ClonedAeiSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "clonedAeiSVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllOrInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOrInteractsMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllInLocalInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allInLocalInteractsMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllOutLocalInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOutLocalInteractsMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllUniInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allUniInteractsMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllLocalInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allLocalInteractsMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllAeisMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allAeisMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllInRemoteInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allInRemoteInteractsMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaCloneAEIAction_AllOutRemoteInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOutRemoteInteractsMVP", null, 1, 1, AEmiliaCloneAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aEmiliaConstChangesActionEClass, AEmiliaConstChangesAction.class, "AEmiliaConstChangesAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAEmiliaConstChangesAction_SourceConstInit(), this.getConstInit(), "sourceConstInit", null, 0, 1, AEmiliaConstChangesAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaConstChangesAction_FactorOfChange(), ecorePackage.getEDouble(), "factorOfChange", null, 0, 1, AEmiliaConstChangesAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaConstChangesAction_SourceConstInitSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "sourceConstInitSVP", null, 1, 1, AEmiliaConstChangesAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaConstChangesAction_AllConstInitsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allConstInitsMVP", null, 1, 1, AEmiliaConstChangesAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aEmiliaChangeActionEClass, AEmiliaChangeAction.class, "AEmiliaChangeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aEmiliaRemoveClonedAEIActionEClass, AEmiliaRemoveClonedAEIAction.class, "AEmiliaRemoveClonedAEIAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAEmiliaRemoveClonedAEIAction_SourceAEI(), this.getArchiElemInstance(), "sourceAEI", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaRemoveClonedAEIAction_ClonedAEI(), this.getArchiElemInstance(), "clonedAEI", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaRemoveClonedAEIAction_ListOfInputInteractions(), this.getInputInteraction(), "listOfInputInteractions", null, 0, -1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaRemoveClonedAEIAction_ListOfOutputInteractions(), this.getOutputInteraction(), "listOfOutputInteractions", null, 0, -1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAEmiliaRemoveClonedAEIAction_ListOfNewAttachments(), this.getAttachment(), "listOfNewAttachments", null, 0, -1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AeiToCloneSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "aeiToCloneSVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_ClonedAeiSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "clonedAeiSVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllOrInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOrInteractsMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllInLocalInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allInLocalInteractsMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllOutLocalInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOutLocalInteractsMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllUniInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allUniInteractsMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllLocalInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allLocalInteractsMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllAeisMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allAeisMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllInRemoteInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allInRemoteInteractsMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAEmiliaRemoveClonedAEIAction_AllOutRemoteInteractsMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "allOutRemoteInteractsMVP", null, 1, 1, AEmiliaRemoveClonedAEIAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(elemTypeEDataType, ElemType.class, "ElemType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputInteractionEDataType, InputInteraction.class, "InputInteraction", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(archiElemInstanceEDataType, ArchiElemInstance.class, "ArchiElemInstance", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputInteractionEDataType, OutputInteraction.class, "OutputInteraction", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(attachmentEDataType, Attachment.class, "Attachment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(aEmiliaSpecificationEDataType, AEmiliaSpecification.class, "AEmiliaSpecification", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(constInitEDataType, ConstInit.class, "ConstInit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //AEmiliaPackageImpl
