/**
 */
package logicalSpecification.antipatterns.performance;

import logicalSpecification.LogicalSpecificationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logicalSpecification.antipatterns.performance.PerformanceFactory
 * @model kind="package"
 * @generated
 */
public interface PerformancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "performance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim.seagroup/logicalSpecification/antipatterns/performance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logicalSpecificationPerformanceAntipatterns";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerformancePackage eINSTANCE = logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl.init();

	/**
	 * The meta object id for the '{@link logicalSpecification.antipatterns.performance.impl.PerformanceAntipatternImpl <em>Antipattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.antipatterns.performance.impl.PerformanceAntipatternImpl
	 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getPerformanceAntipattern()
	 * @generated
	 */
	int PERFORMANCE_ANTIPATTERN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN__NAME = LogicalSpecificationPackage.ANTIPATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Lola4raps Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN__LOLA4RAPS_ROOT = LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN__PARAMETERS = LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN__FORMULA = LogicalSpecificationPackage.ANTIPATTERN__FORMULA;

	/**
	 * The number of structural features of the '<em>Antipattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN_FEATURE_COUNT = LogicalSpecificationPackage.ANTIPATTERN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION = LogicalSpecificationPackage.ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN___PARTIAL_DETECTION = LogicalSpecificationPackage.ANTIPATTERN___PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION = LogicalSpecificationPackage.ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN___FULL_DETECTION = LogicalSpecificationPackage.ANTIPATTERN___FULL_DETECTION;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN___LOG = LogicalSpecificationPackage.ANTIPATTERN___LOG;

	/**
	 * The operation id for the '<em>Create Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN___CREATE_FORMULA = LogicalSpecificationPackage.ANTIPATTERN___CREATE_FORMULA;

	/**
	 * The number of operations of the '<em>Antipattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_ANTIPATTERN_OPERATION_COUNT = LogicalSpecificationPackage.ANTIPATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.antipatterns.performance.impl.BlobPAImpl <em>Blob PA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.antipatterns.performance.impl.BlobPAImpl
	 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getBlobPA()
	 * @generated
	 */
	int BLOB_PA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__NAME = PERFORMANCE_ANTIPATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Lola4raps Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__LOLA4RAPS_ROOT = PERFORMANCE_ANTIPATTERN__LOLA4RAPS_ROOT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__PARAMETERS = PERFORMANCE_ANTIPATTERN__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__FORMULA = PERFORMANCE_ANTIPATTERN__FORMULA;

	/**
	 * The feature id for the '<em><b>Fnum Client Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__FNUM_CLIENT_CONNECTS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fnum Supplier Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__FNUM_SUPPLIER_CONNECTS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fnum Sent Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__FNUM_SENT_MSGS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fnum Received Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__FNUM_RECEIVED_MSGS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fhw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__FHW_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fnet Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__FNET_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tmax Client Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__TMAX_CLIENT_CONNECTS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tmax Supplier Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__TMAX_SUPPLIER_CONNECTS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tmax Sent Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__TMAX_SENT_MSGS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tmax Received Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__TMAX_RECEIVED_MSGS_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tmax Hw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__TMAX_HW_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tmin Net Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__TMIN_NET_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Contextual Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA__CONTEXTUAL_ELEMENT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Blob PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA_FEATURE_COUNT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___SET_PARAMETERS_FOR_FULL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___FULL_DETECTION = PERFORMANCE_ANTIPATTERN___FULL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___CREATE_FORMULA = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA___LOG = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Blob PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_PA_OPERATION_COUNT = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl <em>Cps PA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.antipatterns.performance.impl.CpsPAImpl
	 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getCpsPA()
	 * @generated
	 */
	int CPS_PA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__NAME = PERFORMANCE_ANTIPATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Lola4raps Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__LOLA4RAPS_ROOT = PERFORMANCE_ANTIPATTERN__LOLA4RAPS_ROOT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__PARAMETERS = PERFORMANCE_ANTIPATTERN__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__FORMULA = PERFORMANCE_ANTIPATTERN__FORMULA;

	/**
	 * The feature id for the '<em><b>Fqueue Length SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__FQUEUE_LENGTH_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fover Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__FOVER_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Funder Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__FUNDER_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fop Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__FOP_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tmax Queue Length SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__TMAX_QUEUE_LENGTH_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tmax Over Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__TMAX_OVER_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tmin Under Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__TMIN_UNDER_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tmax Op Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__TMAX_OP_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contextual Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA__CONTEXTUAL_ELEMENT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Cps PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA_FEATURE_COUNT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___SET_PARAMETERS_FOR_FULL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___FULL_DETECTION = PERFORMANCE_ANTIPATTERN___FULL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___CREATE_FORMULA = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___PARTIAL_DETECTION__DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA___LOG = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cps PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPS_PA_OPERATION_COUNT = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl <em>Paf PA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.antipatterns.performance.impl.PafPAImpl
	 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getPafPA()
	 * @generated
	 */
	int PAF_PA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__NAME = PERFORMANCE_ANTIPATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Lola4raps Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__LOLA4RAPS_ROOT = PERFORMANCE_ANTIPATTERN__LOLA4RAPS_ROOT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__PARAMETERS = PERFORMANCE_ANTIPATTERN__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__FORMULA = PERFORMANCE_ANTIPATTERN__FORMULA;

	/**
	 * The feature id for the '<em><b>Fres Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__FRES_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fop Prob Exec SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__FOP_PROB_EXEC_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fhw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__FHW_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fservice Throughput SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__FSERVICE_THROUGHPUT_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tmax Res Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__TMAX_RES_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Top Prob Exec SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__TOP_PROB_EXEC_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tmax Hw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__TMAX_HW_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tmin Service Throughput SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Contextual Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA__CONTEXTUAL_ELEMENT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Paf PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA_FEATURE_COUNT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___SET_PARAMETERS_FOR_FULL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___FULL_DETECTION = PERFORMANCE_ANTIPATTERN___FULL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___CREATE_FORMULA = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA___LOG = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Paf PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAF_PA_OPERATION_COUNT = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl <em>Ep PA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.antipatterns.performance.impl.EpPAImpl
	 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getEpPA()
	 * @generated
	 */
	int EP_PA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__NAME = PERFORMANCE_ANTIPATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Lola4raps Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__LOLA4RAPS_ROOT = PERFORMANCE_ANTIPATTERN__LOLA4RAPS_ROOT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__PARAMETERS = PERFORMANCE_ANTIPATTERN__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FORMULA = PERFORMANCE_ANTIPATTERN__FORMULA;

	/**
	 * The feature id for the '<em><b>Fover Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FOVER_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Funder Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FUNDER_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fover Demand Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FOVER_DEMAND_PROB_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fdemand Sum Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FDEMAND_SUM_PROB_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Funder Demand Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FUNDER_DEMAND_PROB_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fhw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FHW_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fservice Response Time SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__FSERVICE_RESPONSE_TIME_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tmax Over Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__TMAX_OVER_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tmin Under Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__TMIN_UNDER_DEMAND_MVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tdemands Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__TDEMANDS_PROB_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tmax Hw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__TMAX_HW_UTIL_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tmax Service Response Time SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Contextual Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA__CONTEXTUAL_ELEMENT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Ep PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA_FEATURE_COUNT = PERFORMANCE_ANTIPATTERN_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___PARTIAL_DETECTION = PERFORMANCE_ANTIPATTERN___PARTIAL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___SET_PARAMETERS_FOR_FULL_DETECTION = PERFORMANCE_ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___FULL_DETECTION = PERFORMANCE_ANTIPATTERN___FULL_DETECTION;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___CREATE_FORMULA = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA___LOG = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ep PA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_PA_OPERATION_COUNT = PERFORMANCE_ANTIPATTERN_OPERATION_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link logicalSpecification.antipatterns.performance.PerformanceAntipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antipattern</em>'.
	 * @see logicalSpecification.antipatterns.performance.PerformanceAntipattern
	 * @generated
	 */
	EClass getPerformanceAntipattern();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.antipatterns.performance.BlobPA <em>Blob PA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob PA</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA
	 * @generated
	 */
	EClass getBlobPA();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numClientConnectsSVP <em>Fnum Client Connects SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fnum Client Connects SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getF_numClientConnectsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_F_numClientConnectsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numSupplierConnectsSVP <em>Fnum Supplier Connects SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fnum Supplier Connects SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getF_numSupplierConnectsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_F_numSupplierConnectsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numSentMsgsSVP <em>Fnum Sent Msgs SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fnum Sent Msgs SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getF_numSentMsgsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_F_numSentMsgsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numReceivedMsgsSVP <em>Fnum Received Msgs SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fnum Received Msgs SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getF_numReceivedMsgsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_F_numReceivedMsgsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fhw Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getF_hwUtilSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_F_hwUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_netUtilSVP <em>Fnet Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fnet Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getF_netUtilSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_F_netUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxClientConnectsSVP <em>Tmax Client Connects SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Client Connects SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getT_maxClientConnectsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_T_maxClientConnectsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxSupplierConnectsSVP <em>Tmax Supplier Connects SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Supplier Connects SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getT_maxSupplierConnectsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_T_maxSupplierConnectsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxSentMsgsSVP <em>Tmax Sent Msgs SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Sent Msgs SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getT_maxSentMsgsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_T_maxSentMsgsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxReceivedMsgsSVP <em>Tmax Received Msgs SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Received Msgs SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getT_maxReceivedMsgsSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_T_maxReceivedMsgsSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Hw Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getT_maxHwUtilSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_T_maxHwUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_minNetUtilSVP <em>Tmin Net Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmin Net Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getT_minNetUtilSVP()
	 * @see #getBlobPA()
	 * @generated
	 */
	EReference getBlobPA_T_minNetUtilSVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.antipatterns.performance.BlobPA#getContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Element</em>'.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#getContextualElement()
	 * @see #getBlobPA()
	 * @generated
	 */
	EAttribute getBlobPA_ContextualElement();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.BlobPA#setParametersForPartialDetection(double, double, double, double) <em>Set Parameters For Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#setParametersForPartialDetection(double, double, double, double)
	 * @generated
	 */
	EOperation getBlobPA__SetParametersForPartialDetection__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.BlobPA#setParametersForFullDetection(double, double, double, double, double, double) <em>Set Parameters For Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#setParametersForFullDetection(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getBlobPA__SetParametersForFullDetection__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.BlobPA#createFormula() <em>Create Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Formula</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#createFormula()
	 * @generated
	 */
	EOperation getBlobPA__CreateFormula();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.BlobPA#partialDetection(double, double, double, double) <em>Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#partialDetection(double, double, double, double)
	 * @generated
	 */
	EOperation getBlobPA__PartialDetection__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.BlobPA#fullDetection(double, double, double, double, double, double) <em>Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#fullDetection(double, double, double, double, double, double)
	 * @generated
	 */
	EOperation getBlobPA__FullDetection__double_double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.BlobPA#log() <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.BlobPA#log()
	 * @generated
	 */
	EOperation getBlobPA__Log();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.antipatterns.performance.CpsPA <em>Cps PA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cps PA</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA
	 * @generated
	 */
	EClass getCpsPA();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_queueLengthSVP <em>Fqueue Length SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fqueue Length SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getF_queueLengthSVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_F_queueLengthSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_overUtilSVP <em>Fover Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fover Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getF_overUtilSVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_F_overUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_underUtilSVP <em>Funder Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Funder Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getF_underUtilSVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_F_underUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_opDemandMVP <em>Fop Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fop Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getF_opDemandMVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_F_opDemandMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxQueueLengthSVP <em>Tmax Queue Length SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Queue Length SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getT_maxQueueLengthSVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_T_maxQueueLengthSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxOverUtilSVP <em>Tmax Over Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Over Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getT_maxOverUtilSVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_T_maxOverUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_minUnderUtilSVP <em>Tmin Under Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmin Under Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getT_minUnderUtilSVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_T_minUnderUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxOpDemandMVP <em>Tmax Op Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Op Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getT_maxOpDemandMVP()
	 * @see #getCpsPA()
	 * @generated
	 */
	EReference getCpsPA_T_maxOpDemandMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.antipatterns.performance.CpsPA#getContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Element</em>'.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#getContextualElement()
	 * @see #getCpsPA()
	 * @generated
	 */
	EAttribute getCpsPA_ContextualElement();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.CpsPA#setParametersForPartialDetection(double) <em>Set Parameters For Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#setParametersForPartialDetection(double)
	 * @generated
	 */
	EOperation getCpsPA__SetParametersForPartialDetection__double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.CpsPA#setParametersForFullDetection(double, double, double, double) <em>Set Parameters For Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#setParametersForFullDetection(double, double, double, double)
	 * @generated
	 */
	EOperation getCpsPA__SetParametersForFullDetection__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.CpsPA#createFormula() <em>Create Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Formula</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#createFormula()
	 * @generated
	 */
	EOperation getCpsPA__CreateFormula();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.CpsPA#partialDetection(double) <em>Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#partialDetection(double)
	 * @generated
	 */
	EOperation getCpsPA__PartialDetection__double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.CpsPA#fullDetection(double, double, double, double) <em>Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#fullDetection(double, double, double, double)
	 * @generated
	 */
	EOperation getCpsPA__FullDetection__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.CpsPA#log() <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.CpsPA#log()
	 * @generated
	 */
	EOperation getCpsPA__Log();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.antipatterns.performance.PafPA <em>Paf PA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paf PA</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA
	 * @generated
	 */
	EClass getPafPA();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getF_resDemandMVP <em>Fres Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fres Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getF_resDemandMVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_F_resDemandMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getF_opProbExecSVP <em>Fop Prob Exec SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fop Prob Exec SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getF_opProbExecSVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_F_opProbExecSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fhw Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getF_hwUtilSVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_F_hwUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getF_serviceThroughputSVP <em>Fservice Throughput SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fservice Throughput SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getF_serviceThroughputSVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_F_serviceThroughputSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getT_maxResDemandMVP <em>Tmax Res Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Res Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getT_maxResDemandMVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_T_maxResDemandMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getT_opProbExecSVP <em>Top Prob Exec SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top Prob Exec SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getT_opProbExecSVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_T_opProbExecSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Hw Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getT_maxHwUtilSVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_T_maxHwUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.PafPA#getT_minServiceThroughputSVP <em>Tmin Service Throughput SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmin Service Throughput SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getT_minServiceThroughputSVP()
	 * @see #getPafPA()
	 * @generated
	 */
	EReference getPafPA_T_minServiceThroughputSVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.antipatterns.performance.PafPA#getContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Element</em>'.
	 * @see logicalSpecification.antipatterns.performance.PafPA#getContextualElement()
	 * @see #getPafPA()
	 * @generated
	 */
	EAttribute getPafPA_ContextualElement();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.PafPA#setParametersForPartialDetection(double, double) <em>Set Parameters For Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.PafPA#setParametersForPartialDetection(double, double)
	 * @generated
	 */
	EOperation getPafPA__SetParametersForPartialDetection__double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.PafPA#setParametersForFullDetection(double, double, double, double) <em>Set Parameters For Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.PafPA#setParametersForFullDetection(double, double, double, double)
	 * @generated
	 */
	EOperation getPafPA__SetParametersForFullDetection__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.PafPA#createFormula() <em>Create Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Formula</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.PafPA#createFormula()
	 * @generated
	 */
	EOperation getPafPA__CreateFormula();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.PafPA#partialDetection(double, double) <em>Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.PafPA#partialDetection(double, double)
	 * @generated
	 */
	EOperation getPafPA__PartialDetection__double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.PafPA#fullDetection(double, double, double, double) <em>Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.PafPA#fullDetection(double, double, double, double)
	 * @generated
	 */
	EOperation getPafPA__FullDetection__double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.PafPA#log() <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.PafPA#log()
	 * @generated
	 */
	EOperation getPafPA__Log();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.antipatterns.performance.EpPA <em>Ep PA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ep PA</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA
	 * @generated
	 */
	EClass getEpPA();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getF_overDemandMVP <em>Fover Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fover Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getF_overDemandMVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_F_overDemandMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getF_underDemandMVP <em>Funder Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Funder Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getF_underDemandMVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_F_underDemandMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getF_overDemandProbSVP <em>Fover Demand Prob SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fover Demand Prob SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getF_overDemandProbSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_F_overDemandProbSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getF_demandSumProbSVP <em>Fdemand Sum Prob SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fdemand Sum Prob SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getF_demandSumProbSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_F_demandSumProbSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getF_underDemandProbSVP <em>Funder Demand Prob SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Funder Demand Prob SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getF_underDemandProbSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_F_underDemandProbSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fhw Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getF_hwUtilSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_F_hwUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getF_serviceResponseTimeSVP <em>Fservice Response Time SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fservice Response Time SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getF_serviceResponseTimeSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_F_serviceResponseTimeSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxOverDemandMVP <em>Tmax Over Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Over Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getT_maxOverDemandMVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_T_maxOverDemandMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getT_minUnderDemandMVP <em>Tmin Under Demand MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmin Under Demand MVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getT_minUnderDemandMVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_T_minUnderDemandMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getT_demandsProbSVP <em>Tdemands Prob SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tdemands Prob SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getT_demandsProbSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_T_demandsProbSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Hw Util SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getT_maxHwUtilSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_T_maxHwUtilSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxServiceResponseTimeSVP <em>Tmax Service Response Time SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tmax Service Response Time SVP</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getT_maxServiceResponseTimeSVP()
	 * @see #getEpPA()
	 * @generated
	 */
	EReference getEpPA_T_maxServiceResponseTimeSVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.antipatterns.performance.EpPA#getContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Element</em>'.
	 * @see logicalSpecification.antipatterns.performance.EpPA#getContextualElement()
	 * @see #getEpPA()
	 * @generated
	 */
	EAttribute getEpPA_ContextualElement();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.EpPA#setParametersForPartialDetection(double, double, double) <em>Set Parameters For Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.EpPA#setParametersForPartialDetection(double, double, double)
	 * @generated
	 */
	EOperation getEpPA__SetParametersForPartialDetection__double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.EpPA#setParametersForFullDetection(double, double, double, double, double) <em>Set Parameters For Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.EpPA#setParametersForFullDetection(double, double, double, double, double)
	 * @generated
	 */
	EOperation getEpPA__SetParametersForFullDetection__double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.EpPA#createFormula() <em>Create Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Formula</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.EpPA#createFormula()
	 * @generated
	 */
	EOperation getEpPA__CreateFormula();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.EpPA#partialDetection(double, double, double) <em>Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Partial Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.EpPA#partialDetection(double, double, double)
	 * @generated
	 */
	EOperation getEpPA__PartialDetection__double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.EpPA#fullDetection(double, double, double, double, double) <em>Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Full Detection</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.EpPA#fullDetection(double, double, double, double, double)
	 * @generated
	 */
	EOperation getEpPA__FullDetection__double_double_double_double_double();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.antipatterns.performance.EpPA#log() <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see logicalSpecification.antipatterns.performance.EpPA#log()
	 * @generated
	 */
	EOperation getEpPA__Log();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PerformanceFactory getPerformanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logicalSpecification.antipatterns.performance.impl.PerformanceAntipatternImpl <em>Antipattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.antipatterns.performance.impl.PerformanceAntipatternImpl
		 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getPerformanceAntipattern()
		 * @generated
		 */
		EClass PERFORMANCE_ANTIPATTERN = eINSTANCE.getPerformanceAntipattern();

		/**
		 * The meta object literal for the '{@link logicalSpecification.antipatterns.performance.impl.BlobPAImpl <em>Blob PA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.antipatterns.performance.impl.BlobPAImpl
		 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getBlobPA()
		 * @generated
		 */
		EClass BLOB_PA = eINSTANCE.getBlobPA();

		/**
		 * The meta object literal for the '<em><b>Fnum Client Connects SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__FNUM_CLIENT_CONNECTS_SVP = eINSTANCE.getBlobPA_F_numClientConnectsSVP();

		/**
		 * The meta object literal for the '<em><b>Fnum Supplier Connects SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__FNUM_SUPPLIER_CONNECTS_SVP = eINSTANCE.getBlobPA_F_numSupplierConnectsSVP();

		/**
		 * The meta object literal for the '<em><b>Fnum Sent Msgs SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__FNUM_SENT_MSGS_SVP = eINSTANCE.getBlobPA_F_numSentMsgsSVP();

		/**
		 * The meta object literal for the '<em><b>Fnum Received Msgs SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__FNUM_RECEIVED_MSGS_SVP = eINSTANCE.getBlobPA_F_numReceivedMsgsSVP();

		/**
		 * The meta object literal for the '<em><b>Fhw Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__FHW_UTIL_SVP = eINSTANCE.getBlobPA_F_hwUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Fnet Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__FNET_UTIL_SVP = eINSTANCE.getBlobPA_F_netUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Client Connects SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__TMAX_CLIENT_CONNECTS_SVP = eINSTANCE.getBlobPA_T_maxClientConnectsSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Supplier Connects SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__TMAX_SUPPLIER_CONNECTS_SVP = eINSTANCE.getBlobPA_T_maxSupplierConnectsSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Sent Msgs SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__TMAX_SENT_MSGS_SVP = eINSTANCE.getBlobPA_T_maxSentMsgsSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Received Msgs SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__TMAX_RECEIVED_MSGS_SVP = eINSTANCE.getBlobPA_T_maxReceivedMsgsSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Hw Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__TMAX_HW_UTIL_SVP = eINSTANCE.getBlobPA_T_maxHwUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Tmin Net Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOB_PA__TMIN_NET_UTIL_SVP = eINSTANCE.getBlobPA_T_minNetUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Contextual Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOB_PA__CONTEXTUAL_ELEMENT = eINSTANCE.getBlobPA_ContextualElement();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOB_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getBlobPA__SetParametersForPartialDetection__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOB_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getBlobPA__SetParametersForFullDetection__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Formula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOB_PA___CREATE_FORMULA = eINSTANCE.getBlobPA__CreateFormula();

		/**
		 * The meta object literal for the '<em><b>Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOB_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getBlobPA__PartialDetection__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOB_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getBlobPA__FullDetection__double_double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOB_PA___LOG = eINSTANCE.getBlobPA__Log();

		/**
		 * The meta object literal for the '{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl <em>Cps PA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.antipatterns.performance.impl.CpsPAImpl
		 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getCpsPA()
		 * @generated
		 */
		EClass CPS_PA = eINSTANCE.getCpsPA();

		/**
		 * The meta object literal for the '<em><b>Fqueue Length SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__FQUEUE_LENGTH_SVP = eINSTANCE.getCpsPA_F_queueLengthSVP();

		/**
		 * The meta object literal for the '<em><b>Fover Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__FOVER_UTIL_SVP = eINSTANCE.getCpsPA_F_overUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Funder Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__FUNDER_UTIL_SVP = eINSTANCE.getCpsPA_F_underUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Fop Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__FOP_DEMAND_MVP = eINSTANCE.getCpsPA_F_opDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Queue Length SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__TMAX_QUEUE_LENGTH_SVP = eINSTANCE.getCpsPA_T_maxQueueLengthSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Over Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__TMAX_OVER_UTIL_SVP = eINSTANCE.getCpsPA_T_maxOverUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Tmin Under Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__TMIN_UNDER_UTIL_SVP = eINSTANCE.getCpsPA_T_minUnderUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Op Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPS_PA__TMAX_OP_DEMAND_MVP = eINSTANCE.getCpsPA_T_maxOpDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Contextual Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPS_PA__CONTEXTUAL_ELEMENT = eINSTANCE.getCpsPA_ContextualElement();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPS_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE = eINSTANCE.getCpsPA__SetParametersForPartialDetection__double();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPS_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getCpsPA__SetParametersForFullDetection__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Formula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPS_PA___CREATE_FORMULA = eINSTANCE.getCpsPA__CreateFormula();

		/**
		 * The meta object literal for the '<em><b>Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPS_PA___PARTIAL_DETECTION__DOUBLE = eINSTANCE.getCpsPA__PartialDetection__double();

		/**
		 * The meta object literal for the '<em><b>Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPS_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getCpsPA__FullDetection__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CPS_PA___LOG = eINSTANCE.getCpsPA__Log();

		/**
		 * The meta object literal for the '{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl <em>Paf PA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.antipatterns.performance.impl.PafPAImpl
		 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getPafPA()
		 * @generated
		 */
		EClass PAF_PA = eINSTANCE.getPafPA();

		/**
		 * The meta object literal for the '<em><b>Fres Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__FRES_DEMAND_MVP = eINSTANCE.getPafPA_F_resDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Fop Prob Exec SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__FOP_PROB_EXEC_SVP = eINSTANCE.getPafPA_F_opProbExecSVP();

		/**
		 * The meta object literal for the '<em><b>Fhw Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__FHW_UTIL_SVP = eINSTANCE.getPafPA_F_hwUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Fservice Throughput SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__FSERVICE_THROUGHPUT_SVP = eINSTANCE.getPafPA_F_serviceThroughputSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Res Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__TMAX_RES_DEMAND_MVP = eINSTANCE.getPafPA_T_maxResDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Top Prob Exec SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__TOP_PROB_EXEC_SVP = eINSTANCE.getPafPA_T_opProbExecSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Hw Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__TMAX_HW_UTIL_SVP = eINSTANCE.getPafPA_T_maxHwUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Tmin Service Throughput SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP = eINSTANCE.getPafPA_T_minServiceThroughputSVP();

		/**
		 * The meta object literal for the '<em><b>Contextual Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAF_PA__CONTEXTUAL_ELEMENT = eINSTANCE.getPafPA_ContextualElement();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAF_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE = eINSTANCE.getPafPA__SetParametersForPartialDetection__double_double();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAF_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getPafPA__SetParametersForFullDetection__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Formula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAF_PA___CREATE_FORMULA = eINSTANCE.getPafPA__CreateFormula();

		/**
		 * The meta object literal for the '<em><b>Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAF_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE = eINSTANCE.getPafPA__PartialDetection__double_double();

		/**
		 * The meta object literal for the '<em><b>Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAF_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getPafPA__FullDetection__double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAF_PA___LOG = eINSTANCE.getPafPA__Log();

		/**
		 * The meta object literal for the '{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl <em>Ep PA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.antipatterns.performance.impl.EpPAImpl
		 * @see logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl#getEpPA()
		 * @generated
		 */
		EClass EP_PA = eINSTANCE.getEpPA();

		/**
		 * The meta object literal for the '<em><b>Fover Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__FOVER_DEMAND_MVP = eINSTANCE.getEpPA_F_overDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Funder Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__FUNDER_DEMAND_MVP = eINSTANCE.getEpPA_F_underDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Fover Demand Prob SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__FOVER_DEMAND_PROB_SVP = eINSTANCE.getEpPA_F_overDemandProbSVP();

		/**
		 * The meta object literal for the '<em><b>Fdemand Sum Prob SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__FDEMAND_SUM_PROB_SVP = eINSTANCE.getEpPA_F_demandSumProbSVP();

		/**
		 * The meta object literal for the '<em><b>Funder Demand Prob SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__FUNDER_DEMAND_PROB_SVP = eINSTANCE.getEpPA_F_underDemandProbSVP();

		/**
		 * The meta object literal for the '<em><b>Fhw Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__FHW_UTIL_SVP = eINSTANCE.getEpPA_F_hwUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Fservice Response Time SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__FSERVICE_RESPONSE_TIME_SVP = eINSTANCE.getEpPA_F_serviceResponseTimeSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Over Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__TMAX_OVER_DEMAND_MVP = eINSTANCE.getEpPA_T_maxOverDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Tmin Under Demand MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__TMIN_UNDER_DEMAND_MVP = eINSTANCE.getEpPA_T_minUnderDemandMVP();

		/**
		 * The meta object literal for the '<em><b>Tdemands Prob SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__TDEMANDS_PROB_SVP = eINSTANCE.getEpPA_T_demandsProbSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Hw Util SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__TMAX_HW_UTIL_SVP = eINSTANCE.getEpPA_T_maxHwUtilSVP();

		/**
		 * The meta object literal for the '<em><b>Tmax Service Response Time SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP = eINSTANCE.getEpPA_T_maxServiceResponseTimeSVP();

		/**
		 * The meta object literal for the '<em><b>Contextual Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_PA__CONTEXTUAL_ELEMENT = eINSTANCE.getEpPA_ContextualElement();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EP_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getEpPA__SetParametersForPartialDetection__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EP_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getEpPA__SetParametersForFullDetection__double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Formula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EP_PA___CREATE_FORMULA = eINSTANCE.getEpPA__CreateFormula();

		/**
		 * The meta object literal for the '<em><b>Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EP_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getEpPA__PartialDetection__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EP_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getEpPA__FullDetection__double_double_double_double_double();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EP_PA___LOG = eINSTANCE.getEpPA__Log();

	}

} //PerformancePackage
