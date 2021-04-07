/**
 */
package logicalSpecification.antipatterns.performance.impl;

import logicalSpecification.LogicalSpecificationPackage;

import logicalSpecification.actions.AEmilia.AEmiliaPackage;

import logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl;

import logicalSpecification.actions.UML.UMLPackage;

import logicalSpecification.actions.UML.impl.UMLPackageImpl;

import logicalSpecification.antipatterns.performance.BlobPA;
import logicalSpecification.antipatterns.performance.CpsPA;
import logicalSpecification.antipatterns.performance.EpPA;
import logicalSpecification.antipatterns.performance.PafPA;
import logicalSpecification.antipatterns.performance.PerformanceAntipattern;
import logicalSpecification.antipatterns.performance.PerformanceFactory;
import logicalSpecification.antipatterns.performance.PerformancePackage;

import logicalSpecification.impl.LogicalSpecificationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformancePackageImpl extends EPackageImpl implements PerformancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceAntipatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobPAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpsPAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pafPAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epPAEClass = null;

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PerformancePackageImpl() {
		super(eNS_URI, PerformanceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PerformancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PerformancePackage init() {
		if (isInited) return (PerformancePackage)EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPerformancePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PerformancePackageImpl thePerformancePackage = registeredPerformancePackage instanceof PerformancePackageImpl ? (PerformancePackageImpl)registeredPerformancePackage : new PerformancePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogicalSpecificationPackage.eNS_URI);
		LogicalSpecificationPackageImpl theLogicalSpecificationPackage = (LogicalSpecificationPackageImpl)(registeredPackage instanceof LogicalSpecificationPackageImpl ? registeredPackage : LogicalSpecificationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		UMLPackageImpl theUMLPackage = (UMLPackageImpl)(registeredPackage instanceof UMLPackageImpl ? registeredPackage : UMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AEmiliaPackage.eNS_URI);
		AEmiliaPackageImpl theAEmiliaPackage = (AEmiliaPackageImpl)(registeredPackage instanceof AEmiliaPackageImpl ? registeredPackage : AEmiliaPackage.eINSTANCE);

		// Create package meta-data objects
		thePerformancePackage.createPackageContents();
		theLogicalSpecificationPackage.createPackageContents();
		theUMLPackage.createPackageContents();
		theAEmiliaPackage.createPackageContents();

		// Initialize created meta-data
		thePerformancePackage.initializePackageContents();
		theLogicalSpecificationPackage.initializePackageContents();
		theUMLPackage.initializePackageContents();
		theAEmiliaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePerformancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PerformancePackage.eNS_URI, thePerformancePackage);
		return thePerformancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceAntipattern() {
		return performanceAntipatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlobPA() {
		return blobPAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_F_numClientConnectsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_F_numSupplierConnectsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_F_numSentMsgsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_F_numReceivedMsgsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_F_hwUtilSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_F_netUtilSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_T_maxClientConnectsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_T_maxSupplierConnectsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_T_maxSentMsgsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_T_maxReceivedMsgsSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_T_maxHwUtilSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlobPA_T_minNetUtilSVP() {
		return (EReference)blobPAEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlobPA_ContextualElement() {
		return (EAttribute)blobPAEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlobPA__SetParametersForPartialDetection__double_double_double_double() {
		return blobPAEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlobPA__SetParametersForFullDetection__double_double_double_double_double_double() {
		return blobPAEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlobPA__CreateFormula() {
		return blobPAEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlobPA__PartialDetection__double_double_double_double() {
		return blobPAEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlobPA__FullDetection__double_double_double_double_double_double() {
		return blobPAEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlobPA__Log() {
		return blobPAEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpsPA() {
		return cpsPAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_F_queueLengthSVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_F_overUtilSVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_F_underUtilSVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_F_opDemandMVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_T_maxQueueLengthSVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_T_maxOverUtilSVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_T_minUnderUtilSVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCpsPA_T_maxOpDemandMVP() {
		return (EReference)cpsPAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpsPA_ContextualElement() {
		return (EAttribute)cpsPAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpsPA__SetParametersForPartialDetection__double() {
		return cpsPAEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpsPA__SetParametersForFullDetection__double_double_double_double() {
		return cpsPAEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpsPA__CreateFormula() {
		return cpsPAEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpsPA__PartialDetection__double() {
		return cpsPAEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpsPA__FullDetection__double_double_double_double() {
		return cpsPAEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpsPA__Log() {
		return cpsPAEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPafPA() {
		return pafPAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_F_resDemandMVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_F_opProbExecSVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_F_hwUtilSVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_F_serviceThroughputSVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_T_maxResDemandMVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_T_opProbExecSVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_T_maxHwUtilSVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPafPA_T_minServiceThroughputSVP() {
		return (EReference)pafPAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPafPA_ContextualElement() {
		return (EAttribute)pafPAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPafPA__SetParametersForPartialDetection__double_double() {
		return pafPAEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPafPA__SetParametersForFullDetection__double_double_double_double() {
		return pafPAEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPafPA__CreateFormula() {
		return pafPAEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPafPA__PartialDetection__double_double() {
		return pafPAEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPafPA__FullDetection__double_double_double_double() {
		return pafPAEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPafPA__Log() {
		return pafPAEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpPA() {
		return epPAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_F_overDemandMVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_F_underDemandMVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_F_overDemandProbSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_F_demandSumProbSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_F_underDemandProbSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_F_hwUtilSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_F_serviceResponseTimeSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_T_maxOverDemandMVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_T_minUnderDemandMVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_T_demandsProbSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_T_maxHwUtilSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpPA_T_maxServiceResponseTimeSVP() {
		return (EReference)epPAEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpPA_ContextualElement() {
		return (EAttribute)epPAEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEpPA__SetParametersForPartialDetection__double_double_double() {
		return epPAEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEpPA__SetParametersForFullDetection__double_double_double_double_double() {
		return epPAEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEpPA__CreateFormula() {
		return epPAEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEpPA__PartialDetection__double_double_double() {
		return epPAEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEpPA__FullDetection__double_double_double_double_double() {
		return epPAEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEpPA__Log() {
		return epPAEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceFactory getPerformanceFactory() {
		return (PerformanceFactory)getEFactoryInstance();
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
		performanceAntipatternEClass = createEClass(PERFORMANCE_ANTIPATTERN);

		blobPAEClass = createEClass(BLOB_PA);
		createEReference(blobPAEClass, BLOB_PA__FNUM_CLIENT_CONNECTS_SVP);
		createEReference(blobPAEClass, BLOB_PA__FNUM_SUPPLIER_CONNECTS_SVP);
		createEReference(blobPAEClass, BLOB_PA__FNUM_SENT_MSGS_SVP);
		createEReference(blobPAEClass, BLOB_PA__FNUM_RECEIVED_MSGS_SVP);
		createEReference(blobPAEClass, BLOB_PA__FHW_UTIL_SVP);
		createEReference(blobPAEClass, BLOB_PA__FNET_UTIL_SVP);
		createEReference(blobPAEClass, BLOB_PA__TMAX_CLIENT_CONNECTS_SVP);
		createEReference(blobPAEClass, BLOB_PA__TMAX_SUPPLIER_CONNECTS_SVP);
		createEReference(blobPAEClass, BLOB_PA__TMAX_SENT_MSGS_SVP);
		createEReference(blobPAEClass, BLOB_PA__TMAX_RECEIVED_MSGS_SVP);
		createEReference(blobPAEClass, BLOB_PA__TMAX_HW_UTIL_SVP);
		createEReference(blobPAEClass, BLOB_PA__TMIN_NET_UTIL_SVP);
		createEAttribute(blobPAEClass, BLOB_PA__CONTEXTUAL_ELEMENT);
		createEOperation(blobPAEClass, BLOB_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(blobPAEClass, BLOB_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(blobPAEClass, BLOB_PA___CREATE_FORMULA);
		createEOperation(blobPAEClass, BLOB_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(blobPAEClass, BLOB_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(blobPAEClass, BLOB_PA___LOG);

		cpsPAEClass = createEClass(CPS_PA);
		createEReference(cpsPAEClass, CPS_PA__FQUEUE_LENGTH_SVP);
		createEReference(cpsPAEClass, CPS_PA__FOVER_UTIL_SVP);
		createEReference(cpsPAEClass, CPS_PA__FUNDER_UTIL_SVP);
		createEReference(cpsPAEClass, CPS_PA__FOP_DEMAND_MVP);
		createEReference(cpsPAEClass, CPS_PA__TMAX_QUEUE_LENGTH_SVP);
		createEReference(cpsPAEClass, CPS_PA__TMAX_OVER_UTIL_SVP);
		createEReference(cpsPAEClass, CPS_PA__TMIN_UNDER_UTIL_SVP);
		createEReference(cpsPAEClass, CPS_PA__TMAX_OP_DEMAND_MVP);
		createEAttribute(cpsPAEClass, CPS_PA__CONTEXTUAL_ELEMENT);
		createEOperation(cpsPAEClass, CPS_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE);
		createEOperation(cpsPAEClass, CPS_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(cpsPAEClass, CPS_PA___CREATE_FORMULA);
		createEOperation(cpsPAEClass, CPS_PA___PARTIAL_DETECTION__DOUBLE);
		createEOperation(cpsPAEClass, CPS_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(cpsPAEClass, CPS_PA___LOG);

		pafPAEClass = createEClass(PAF_PA);
		createEReference(pafPAEClass, PAF_PA__FRES_DEMAND_MVP);
		createEReference(pafPAEClass, PAF_PA__FOP_PROB_EXEC_SVP);
		createEReference(pafPAEClass, PAF_PA__FHW_UTIL_SVP);
		createEReference(pafPAEClass, PAF_PA__FSERVICE_THROUGHPUT_SVP);
		createEReference(pafPAEClass, PAF_PA__TMAX_RES_DEMAND_MVP);
		createEReference(pafPAEClass, PAF_PA__TOP_PROB_EXEC_SVP);
		createEReference(pafPAEClass, PAF_PA__TMAX_HW_UTIL_SVP);
		createEReference(pafPAEClass, PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP);
		createEAttribute(pafPAEClass, PAF_PA__CONTEXTUAL_ELEMENT);
		createEOperation(pafPAEClass, PAF_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE);
		createEOperation(pafPAEClass, PAF_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(pafPAEClass, PAF_PA___CREATE_FORMULA);
		createEOperation(pafPAEClass, PAF_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE);
		createEOperation(pafPAEClass, PAF_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(pafPAEClass, PAF_PA___LOG);

		epPAEClass = createEClass(EP_PA);
		createEReference(epPAEClass, EP_PA__FOVER_DEMAND_MVP);
		createEReference(epPAEClass, EP_PA__FUNDER_DEMAND_MVP);
		createEReference(epPAEClass, EP_PA__FOVER_DEMAND_PROB_SVP);
		createEReference(epPAEClass, EP_PA__FDEMAND_SUM_PROB_SVP);
		createEReference(epPAEClass, EP_PA__FUNDER_DEMAND_PROB_SVP);
		createEReference(epPAEClass, EP_PA__FHW_UTIL_SVP);
		createEReference(epPAEClass, EP_PA__FSERVICE_RESPONSE_TIME_SVP);
		createEReference(epPAEClass, EP_PA__TMAX_OVER_DEMAND_MVP);
		createEReference(epPAEClass, EP_PA__TMIN_UNDER_DEMAND_MVP);
		createEReference(epPAEClass, EP_PA__TDEMANDS_PROB_SVP);
		createEReference(epPAEClass, EP_PA__TMAX_HW_UTIL_SVP);
		createEReference(epPAEClass, EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP);
		createEAttribute(epPAEClass, EP_PA__CONTEXTUAL_ELEMENT);
		createEOperation(epPAEClass, EP_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(epPAEClass, EP_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(epPAEClass, EP_PA___CREATE_FORMULA);
		createEOperation(epPAEClass, EP_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(epPAEClass, EP_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(epPAEClass, EP_PA___LOG);
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
		performanceAntipatternEClass.getESuperTypes().add(theLogicalSpecificationPackage.getAntipattern());
		blobPAEClass.getESuperTypes().add(this.getPerformanceAntipattern());
		cpsPAEClass.getESuperTypes().add(this.getPerformanceAntipattern());
		pafPAEClass.getESuperTypes().add(this.getPerformanceAntipattern());
		epPAEClass.getESuperTypes().add(this.getPerformanceAntipattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(performanceAntipatternEClass, PerformanceAntipattern.class, "PerformanceAntipattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blobPAEClass, BlobPA.class, "BlobPA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlobPA_F_numClientConnectsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_numClientConnectsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_F_numSupplierConnectsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_numSupplierConnectsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_F_numSentMsgsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_numSentMsgsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_F_numReceivedMsgsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_numReceivedMsgsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_F_hwUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_hwUtilSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_F_netUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_netUtilSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_T_maxClientConnectsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxClientConnectsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_T_maxSupplierConnectsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxSupplierConnectsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_T_maxSentMsgsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxSentMsgsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_T_maxReceivedMsgsSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxReceivedMsgsSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_T_maxHwUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxHwUtilSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlobPA_T_minNetUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_minNetUtilSVP", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlobPA_ContextualElement(), ecorePackage.getEJavaObject(), "contextualElement", null, 1, 1, BlobPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBlobPA__SetParametersForPartialDetection__double_double_double_double(), null, "setParametersForPartialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxClientConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSupplierConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSentMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxReceivedMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBlobPA__SetParametersForFullDetection__double_double_double_double_double_double(), null, "setParametersForFullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxClientConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSupplierConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSentMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxReceivedMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxHwUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minNetUtil", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBlobPA__CreateFormula(), null, "createFormula", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBlobPA__PartialDetection__double_double_double_double(), ecorePackage.getEInt(), "partialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxClientConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSupplierConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSentMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxReceivedMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBlobPA__FullDetection__double_double_double_double_double_double(), ecorePackage.getEInt(), "fullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxClientConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSupplierConnects", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxSentMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxReceivedMsgs", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxHwUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minNetUtil", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBlobPA__Log(), null, "log", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cpsPAEClass, CpsPA.class, "CpsPA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCpsPA_F_queueLengthSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_queueLengthSVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCpsPA_F_overUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_overUtilSVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCpsPA_F_underUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_underUtilSVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCpsPA_F_opDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "F_opDemandMVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCpsPA_T_maxQueueLengthSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxQueueLengthSVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCpsPA_T_maxOverUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxOverUtilSVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCpsPA_T_minUnderUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_minUnderUtilSVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCpsPA_T_maxOpDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "T_maxOpDemandMVP", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpsPA_ContextualElement(), ecorePackage.getEJavaObject(), "contextualElement", null, 1, 1, CpsPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCpsPA__SetParametersForPartialDetection__double(), null, "setParametersForPartialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOpDemand", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCpsPA__SetParametersForFullDetection__double_double_double_double(), null, "setParametersForFullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxQueueLength", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOverUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minUnderUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOpDemand", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCpsPA__CreateFormula(), null, "createFormula", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCpsPA__PartialDetection__double(), ecorePackage.getEInt(), "partialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOpDemand", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCpsPA__FullDetection__double_double_double_double(), ecorePackage.getEInt(), "fullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxQueueLength", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOverUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minUnderUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOpDemand", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCpsPA__Log(), null, "log", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pafPAEClass, PafPA.class, "PafPA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPafPA_F_resDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "F_resDemandMVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPafPA_F_opProbExecSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_opProbExecSVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPafPA_F_hwUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_hwUtilSVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPafPA_F_serviceThroughputSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_serviceThroughputSVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPafPA_T_maxResDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "T_maxResDemandMVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPafPA_T_opProbExecSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_opProbExecSVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPafPA_T_maxHwUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxHwUtilSVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPafPA_T_minServiceThroughputSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_minServiceThroughputSVP", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPafPA_ContextualElement(), ecorePackage.getEJavaObject(), "contextualElement", null, 1, 1, PafPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPafPA__SetParametersForPartialDetection__double_double(), null, "setParametersForPartialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxResDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_opProbExec", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPafPA__SetParametersForFullDetection__double_double_double_double(), null, "setParametersForFullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxResDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_opProbExec", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxHwUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minServiceThroughput", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPafPA__CreateFormula(), null, "createFormula", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPafPA__PartialDetection__double_double(), ecorePackage.getEInt(), "partialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxResDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_opProbExec", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPafPA__FullDetection__double_double_double_double(), ecorePackage.getEInt(), "fullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxResDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_opProbExec", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxHwUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minServiceThroughput", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPafPA__Log(), null, "log", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(epPAEClass, EpPA.class, "EpPA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEpPA_F_overDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "F_overDemandMVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_F_underDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "F_underDemandMVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_F_overDemandProbSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_overDemandProbSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_F_demandSumProbSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_demandSumProbSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_F_underDemandProbSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_underDemandProbSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_F_hwUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_hwUtilSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_F_serviceResponseTimeSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "F_serviceResponseTimeSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_T_maxOverDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "T_maxOverDemandMVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_T_minUnderDemandMVP(), theLogicalSpecificationPackage.getMultipleValuedParameter(), null, "T_minUnderDemandMVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_T_demandsProbSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_demandsProbSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_T_maxHwUtilSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxHwUtilSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpPA_T_maxServiceResponseTimeSVP(), theLogicalSpecificationPackage.getSingleValuedParameter(), null, "T_maxServiceResponseTimeSVP", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpPA_ContextualElement(), ecorePackage.getEJavaObject(), "contextualElement", null, 1, 1, EpPA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEpPA__SetParametersForPartialDetection__double_double_double(), null, "setParametersForPartialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOverDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minUnderDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_demandsProb", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEpPA__SetParametersForFullDetection__double_double_double_double_double(), null, "setParametersForFullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOverDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minUnderDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_demandsProb", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxHwUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxServiceResponseTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEpPA__CreateFormula(), null, "createFormula", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEpPA__PartialDetection__double_double_double(), ecorePackage.getEInt(), "partialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOverDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minUnderDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_demandsProb", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEpPA__FullDetection__double_double_double_double_double(), ecorePackage.getEInt(), "fullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxOverDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_minUnderDemand", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_demandsProb", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxHwUtil", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "T_maxServiceResponseTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEpPA__Log(), null, "log", 1, 1, IS_UNIQUE, IS_ORDERED);
	}

} //PerformancePackageImpl
