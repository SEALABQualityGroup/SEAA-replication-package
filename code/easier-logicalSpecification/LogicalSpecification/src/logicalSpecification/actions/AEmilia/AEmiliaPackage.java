/**
 */
package logicalSpecification.actions.AEmilia;

import logicalSpecification.LogicalSpecificationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see logicalSpecification.actions.AEmilia.AEmiliaFactory
 * @model kind="package"
 * @generated
 */
public interface AEmiliaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AEmilia";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim.seagroup/logicalSpecification/actions/aemilia";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logicalSpecificationAEmiliaActions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AEmiliaPackage eINSTANCE = logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl.init();

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaAddActionImpl <em>Add Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaAddActionImpl
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaAddAction()
	 * @generated
	 */
	int AEMILIA_ADD_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__NAME = LogicalSpecificationPackage.ADD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__NUM_OF_CHANGES = LogicalSpecificationPackage.ADD_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__COST = LogicalSpecificationPackage.ADD_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__REFACTORING = LogicalSpecificationPackage.ADD_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__PARAMETERS = LogicalSpecificationPackage.ADD_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__PRE = LogicalSpecificationPackage.ADD_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__POST = LogicalSpecificationPackage.ADD_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION__MODEL = LogicalSpecificationPackage.ADD_ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Add Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION_FEATURE_COUNT = LogicalSpecificationPackage.ADD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION___EXECUTE = LogicalSpecificationPackage.ADD_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION___LOG = LogicalSpecificationPackage.ADD_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION___SET_PARAMETERS = LogicalSpecificationPackage.ADD_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION___CREATE_PRE_CONDITION = LogicalSpecificationPackage.ADD_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION___CREATE_POST_CONDITION = LogicalSpecificationPackage.ADD_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Add Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_ADD_ACTION_OPERATION_COUNT = LogicalSpecificationPackage.ADD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaDeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaDeleteActionImpl
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaDeleteAction()
	 * @generated
	 */
	int AEMILIA_DELETE_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__NAME = LogicalSpecificationPackage.DELETE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__NUM_OF_CHANGES = LogicalSpecificationPackage.DELETE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__COST = LogicalSpecificationPackage.DELETE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__REFACTORING = LogicalSpecificationPackage.DELETE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__PARAMETERS = LogicalSpecificationPackage.DELETE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__PRE = LogicalSpecificationPackage.DELETE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__POST = LogicalSpecificationPackage.DELETE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION__MODEL = LogicalSpecificationPackage.DELETE_ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION_FEATURE_COUNT = LogicalSpecificationPackage.DELETE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION___EXECUTE = LogicalSpecificationPackage.DELETE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION___LOG = LogicalSpecificationPackage.DELETE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION___SET_PARAMETERS = LogicalSpecificationPackage.DELETE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION___CREATE_PRE_CONDITION = LogicalSpecificationPackage.DELETE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION___CREATE_POST_CONDITION = LogicalSpecificationPackage.DELETE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_DELETE_ACTION_OPERATION_COUNT = LogicalSpecificationPackage.DELETE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaMoveActionImpl <em>Move Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaMoveActionImpl
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaMoveAction()
	 * @generated
	 */
	int AEMILIA_MOVE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__NAME = LogicalSpecificationPackage.MOVE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__NUM_OF_CHANGES = LogicalSpecificationPackage.MOVE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__COST = LogicalSpecificationPackage.MOVE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__REFACTORING = LogicalSpecificationPackage.MOVE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__PARAMETERS = LogicalSpecificationPackage.MOVE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__PRE = LogicalSpecificationPackage.MOVE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__POST = LogicalSpecificationPackage.MOVE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION__MODEL = LogicalSpecificationPackage.MOVE_ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION_FEATURE_COUNT = LogicalSpecificationPackage.MOVE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION___EXECUTE = LogicalSpecificationPackage.MOVE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION___LOG = LogicalSpecificationPackage.MOVE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION___SET_PARAMETERS = LogicalSpecificationPackage.MOVE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION___CREATE_PRE_CONDITION = LogicalSpecificationPackage.MOVE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION___CREATE_POST_CONDITION = LogicalSpecificationPackage.MOVE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_MOVE_ACTION_OPERATION_COUNT = LogicalSpecificationPackage.MOVE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaCloneAEIActionImpl <em>Clone AEI Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaCloneAEIActionImpl
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaCloneAEIAction()
	 * @generated
	 */
	int AEMILIA_CLONE_AEI_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__NAME = AEMILIA_ADD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__NUM_OF_CHANGES = AEMILIA_ADD_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__COST = AEMILIA_ADD_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__REFACTORING = AEMILIA_ADD_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__PARAMETERS = AEMILIA_ADD_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__PRE = AEMILIA_ADD_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__POST = AEMILIA_ADD_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__MODEL = AEMILIA_ADD_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Source AEI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__SOURCE_AEI = AEMILIA_ADD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloned AEI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__CLONED_AEI = AEMILIA_ADD_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Of Input Interactions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS = AEMILIA_ADD_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Of Output Interactions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS = AEMILIA_ADD_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>List Of New Attachments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS = AEMILIA_ADD_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aei To Clone SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__AEI_TO_CLONE_SVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cloned Aei SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__CLONED_AEI_SVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>All Or Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_OR_INTERACTS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All In Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>All Out Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>All Uni Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_UNI_INTERACTS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>All Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>All Aeis MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_AEIS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>All In Remote Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>All Out Remote Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP = AEMILIA_ADD_ACTION_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Clone AEI Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION_FEATURE_COUNT = AEMILIA_ADD_ACTION_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION___EXECUTE = AEMILIA_ADD_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION___LOG = AEMILIA_ADD_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION___SET_PARAMETERS = AEMILIA_ADD_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION___CREATE_PRE_CONDITION = AEMILIA_ADD_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION___CREATE_POST_CONDITION = AEMILIA_ADD_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Clone AEI Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CLONE_AEI_ACTION_OPERATION_COUNT = AEMILIA_ADD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaChangeActionImpl <em>Change Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaChangeActionImpl
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaChangeAction()
	 * @generated
	 */
	int AEMILIA_CHANGE_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__NAME = LogicalSpecificationPackage.CHANGE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__NUM_OF_CHANGES = LogicalSpecificationPackage.CHANGE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__COST = LogicalSpecificationPackage.CHANGE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__REFACTORING = LogicalSpecificationPackage.CHANGE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__PARAMETERS = LogicalSpecificationPackage.CHANGE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__PRE = LogicalSpecificationPackage.CHANGE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__POST = LogicalSpecificationPackage.CHANGE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION__MODEL = LogicalSpecificationPackage.CHANGE_ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Change Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION_FEATURE_COUNT = LogicalSpecificationPackage.CHANGE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION___EXECUTE = LogicalSpecificationPackage.CHANGE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION___LOG = LogicalSpecificationPackage.CHANGE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION___SET_PARAMETERS = LogicalSpecificationPackage.CHANGE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION___CREATE_PRE_CONDITION = LogicalSpecificationPackage.CHANGE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION___CREATE_POST_CONDITION = LogicalSpecificationPackage.CHANGE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Change Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CHANGE_ACTION_OPERATION_COUNT = LogicalSpecificationPackage.CHANGE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl <em>Const Changes Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaConstChangesAction()
	 * @generated
	 */
	int AEMILIA_CONST_CHANGES_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__NAME = AEMILIA_CHANGE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__NUM_OF_CHANGES = AEMILIA_CHANGE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__COST = AEMILIA_CHANGE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__REFACTORING = AEMILIA_CHANGE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__PARAMETERS = AEMILIA_CHANGE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__PRE = AEMILIA_CHANGE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__POST = AEMILIA_CHANGE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__MODEL = AEMILIA_CHANGE_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Source Const Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT = AEMILIA_CHANGE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factor Of Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE = AEMILIA_CHANGE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Const Init SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP = AEMILIA_CHANGE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Const Inits MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP = AEMILIA_CHANGE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Const Changes Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION_FEATURE_COUNT = AEMILIA_CHANGE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION___EXECUTE = AEMILIA_CHANGE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION___LOG = AEMILIA_CHANGE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION___SET_PARAMETERS = AEMILIA_CHANGE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION___CREATE_PRE_CONDITION = AEMILIA_CHANGE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION___CREATE_POST_CONDITION = AEMILIA_CHANGE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Const Changes Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_CONST_CHANGES_ACTION_OPERATION_COUNT = AEMILIA_CHANGE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl <em>Remove Cloned AEI Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__NAME = AEMILIA_DELETE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__NUM_OF_CHANGES = AEMILIA_DELETE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__COST = AEMILIA_DELETE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__REFACTORING = AEMILIA_DELETE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__PARAMETERS = AEMILIA_DELETE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__PRE = AEMILIA_DELETE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__POST = AEMILIA_DELETE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__MODEL = AEMILIA_DELETE_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Source AEI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloned AEI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>List Of Input Interactions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>List Of Output Interactions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>List Of New Attachments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aei To Clone SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cloned Aei SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>All Or Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All In Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>All Out Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>All Uni Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>All Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>All Aeis MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>All In Remote Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>All Out Remote Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Remove Cloned AEI Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION_FEATURE_COUNT = AEMILIA_DELETE_ACTION_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION___EXECUTE = AEMILIA_DELETE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION___LOG = AEMILIA_DELETE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION___SET_PARAMETERS = AEMILIA_DELETE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION___CREATE_PRE_CONDITION = AEMILIA_DELETE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION___CREATE_POST_CONDITION = AEMILIA_DELETE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Remove Cloned AEI Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEMILIA_REMOVE_CLONED_AEI_ACTION_OPERATION_COUNT = AEMILIA_DELETE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Elem Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.mmaemilia.ElemType
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getElemType()
	 * @generated
	 */
	int ELEM_TYPE = 7;

	/**
	 * The meta object id for the '<em>Input Interaction</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.mmaemilia.InputInteraction
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getInputInteraction()
	 * @generated
	 */
	int INPUT_INTERACTION = 8;

	/**
	 * The meta object id for the '<em>Archi Elem Instance</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.mmaemilia.ArchiElemInstance
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getArchiElemInstance()
	 * @generated
	 */
	int ARCHI_ELEM_INSTANCE = 9;

	/**
	 * The meta object id for the '<em>Output Interaction</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.mmaemilia.OutputInteraction
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getOutputInteraction()
	 * @generated
	 */
	int OUTPUT_INTERACTION = 10;

	/**
	 * The meta object id for the '<em>Attachment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.mmaemilia.Attachment
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 11;

	/**
	 * The meta object id for the '<em>Specification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.mmaemilia.AEmiliaSpecification
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaSpecification()
	 * @generated
	 */
	int AEMILIA_SPECIFICATION = 12;

	/**
	 * The meta object id for the '<em>Const Init</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel.mmaemilia.Headers.ConstInit
	 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getConstInit()
	 * @generated
	 */
	int CONST_INIT = 13;


	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.AEmilia.AEmiliaAddAction <em>Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Action</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaAddAction
	 * @generated
	 */
	EClass getAEmiliaAddAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.AEmilia.AEmiliaDeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaDeleteAction
	 * @generated
	 */
	EClass getAEmiliaDeleteAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.AEmilia.AEmiliaMoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Action</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaMoveAction
	 * @generated
	 */
	EClass getAEmiliaMoveAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction <em>Clone AEI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone AEI Action</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction
	 * @generated
	 */
	EClass getAEmiliaCloneAEIAction();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getSourceAEI <em>Source AEI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source AEI</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getSourceAEI()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaCloneAEIAction_SourceAEI();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAEI <em>Cloned AEI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloned AEI</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAEI()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaCloneAEIAction_ClonedAEI();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfInputInteractions <em>List Of Input Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Input Interactions</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfInputInteractions()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaCloneAEIAction_ListOfInputInteractions();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfOutputInteractions <em>List Of Output Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Output Interactions</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfOutputInteractions()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaCloneAEIAction_ListOfOutputInteractions();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfNewAttachments <em>List Of New Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of New Attachments</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfNewAttachments()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaCloneAEIAction_ListOfNewAttachments();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAeiToCloneSVP <em>Aei To Clone SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aei To Clone SVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAeiToCloneSVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AeiToCloneSVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAeiSVP <em>Cloned Aei SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloned Aei SVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAeiSVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_ClonedAeiSVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOrInteractsMVP <em>All Or Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Or Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOrInteractsMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllOrInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInLocalInteractsMVP <em>All In Local Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All In Local Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInLocalInteractsMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllInLocalInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutLocalInteractsMVP <em>All Out Local Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Out Local Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutLocalInteractsMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllOutLocalInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllUniInteractsMVP <em>All Uni Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Uni Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllUniInteractsMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllUniInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllLocalInteractsMVP <em>All Local Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Local Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllLocalInteractsMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllLocalInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllAeisMVP <em>All Aeis MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Aeis MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllAeisMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllAeisMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInRemoteInteractsMVP <em>All In Remote Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All In Remote Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInRemoteInteractsMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllInRemoteInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutRemoteInteractsMVP <em>All Out Remote Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Out Remote Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutRemoteInteractsMVP()
	 * @see #getAEmiliaCloneAEIAction()
	 * @generated
	 */
	EReference getAEmiliaCloneAEIAction_AllOutRemoteInteractsMVP();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction <em>Const Changes Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Changes Action</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction
	 * @generated
	 */
	EClass getAEmiliaConstChangesAction();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInit <em>Source Const Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Const Init</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInit()
	 * @see #getAEmiliaConstChangesAction()
	 * @generated
	 */
	EAttribute getAEmiliaConstChangesAction_SourceConstInit();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getFactorOfChange <em>Factor Of Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor Of Change</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getFactorOfChange()
	 * @see #getAEmiliaConstChangesAction()
	 * @generated
	 */
	EAttribute getAEmiliaConstChangesAction_FactorOfChange();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInitSVP <em>Source Const Init SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Const Init SVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInitSVP()
	 * @see #getAEmiliaConstChangesAction()
	 * @generated
	 */
	EReference getAEmiliaConstChangesAction_SourceConstInitSVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getAllConstInitsMVP <em>All Const Inits MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Const Inits MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getAllConstInitsMVP()
	 * @see #getAEmiliaConstChangesAction()
	 * @generated
	 */
	EReference getAEmiliaConstChangesAction_AllConstInitsMVP();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.AEmilia.AEmiliaChangeAction <em>Change Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Action</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaChangeAction
	 * @generated
	 */
	EClass getAEmiliaChangeAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction <em>Remove Cloned AEI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Cloned AEI Action</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction
	 * @generated
	 */
	EClass getAEmiliaRemoveClonedAEIAction();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getSourceAEI <em>Source AEI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source AEI</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getSourceAEI()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaRemoveClonedAEIAction_SourceAEI();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getClonedAEI <em>Cloned AEI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloned AEI</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getClonedAEI()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaRemoveClonedAEIAction_ClonedAEI();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getListOfInputInteractions <em>List Of Input Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Input Interactions</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getListOfInputInteractions()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaRemoveClonedAEIAction_ListOfInputInteractions();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getListOfOutputInteractions <em>List Of Output Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Output Interactions</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getListOfOutputInteractions()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaRemoveClonedAEIAction_ListOfOutputInteractions();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getListOfNewAttachments <em>List Of New Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of New Attachments</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getListOfNewAttachments()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EAttribute getAEmiliaRemoveClonedAEIAction_ListOfNewAttachments();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAeiToCloneSVP <em>Aei To Clone SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aei To Clone SVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAeiToCloneSVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AeiToCloneSVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getClonedAeiSVP <em>Cloned Aei SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cloned Aei SVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getClonedAeiSVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_ClonedAeiSVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllOrInteractsMVP <em>All Or Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Or Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllOrInteractsMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllOrInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllInLocalInteractsMVP <em>All In Local Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All In Local Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllInLocalInteractsMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllInLocalInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllOutLocalInteractsMVP <em>All Out Local Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Out Local Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllOutLocalInteractsMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllOutLocalInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllUniInteractsMVP <em>All Uni Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Uni Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllUniInteractsMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllUniInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllLocalInteractsMVP <em>All Local Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Local Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllLocalInteractsMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllLocalInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllAeisMVP <em>All Aeis MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Aeis MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllAeisMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllAeisMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllInRemoteInteractsMVP <em>All In Remote Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All In Remote Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllInRemoteInteractsMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllInRemoteInteractsMVP();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllOutRemoteInteractsMVP <em>All Out Remote Interacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>All Out Remote Interacts MVP</em>'.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction#getAllOutRemoteInteractsMVP()
	 * @see #getAEmiliaRemoveClonedAEIAction()
	 * @generated
	 */
	EReference getAEmiliaRemoveClonedAEIAction_AllOutRemoteInteractsMVP();

	/**
	 * Returns the meta object for data type '{@link metamodel.mmaemilia.ElemType <em>Elem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Elem Type</em>'.
	 * @see metamodel.mmaemilia.ElemType
	 * @model instanceClass="metamodel.mmaemilia.ElemType"
	 * @generated
	 */
	EDataType getElemType();

	/**
	 * Returns the meta object for data type '{@link metamodel.mmaemilia.InputInteraction <em>Input Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Interaction</em>'.
	 * @see metamodel.mmaemilia.InputInteraction
	 * @model instanceClass="metamodel.mmaemilia.InputInteraction"
	 * @generated
	 */
	EDataType getInputInteraction();

	/**
	 * Returns the meta object for data type '{@link metamodel.mmaemilia.ArchiElemInstance <em>Archi Elem Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Archi Elem Instance</em>'.
	 * @see metamodel.mmaemilia.ArchiElemInstance
	 * @model instanceClass="metamodel.mmaemilia.ArchiElemInstance"
	 * @generated
	 */
	EDataType getArchiElemInstance();

	/**
	 * Returns the meta object for data type '{@link metamodel.mmaemilia.OutputInteraction <em>Output Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Interaction</em>'.
	 * @see metamodel.mmaemilia.OutputInteraction
	 * @model instanceClass="metamodel.mmaemilia.OutputInteraction"
	 * @generated
	 */
	EDataType getOutputInteraction();

	/**
	 * Returns the meta object for data type '{@link metamodel.mmaemilia.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Attachment</em>'.
	 * @see metamodel.mmaemilia.Attachment
	 * @model instanceClass="metamodel.mmaemilia.Attachment"
	 * @generated
	 */
	EDataType getAttachment();

	/**
	 * Returns the meta object for data type '{@link metamodel.mmaemilia.AEmiliaSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Specification</em>'.
	 * @see metamodel.mmaemilia.AEmiliaSpecification
	 * @model instanceClass="metamodel.mmaemilia.AEmiliaSpecification"
	 * @generated
	 */
	EDataType getAEmiliaSpecification();

	/**
	 * Returns the meta object for data type '{@link metamodel.mmaemilia.Headers.ConstInit <em>Const Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Const Init</em>'.
	 * @see metamodel.mmaemilia.Headers.ConstInit
	 * @model instanceClass="metamodel.mmaemilia.Headers.ConstInit"
	 * @generated
	 */
	EDataType getConstInit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AEmiliaFactory getAEmiliaFactory();

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
		 * The meta object literal for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaAddActionImpl <em>Add Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaAddActionImpl
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaAddAction()
		 * @generated
		 */
		EClass AEMILIA_ADD_ACTION = eINSTANCE.getAEmiliaAddAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaDeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaDeleteActionImpl
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaDeleteAction()
		 * @generated
		 */
		EClass AEMILIA_DELETE_ACTION = eINSTANCE.getAEmiliaDeleteAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaMoveActionImpl <em>Move Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaMoveActionImpl
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaMoveAction()
		 * @generated
		 */
		EClass AEMILIA_MOVE_ACTION = eINSTANCE.getAEmiliaMoveAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaCloneAEIActionImpl <em>Clone AEI Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaCloneAEIActionImpl
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaCloneAEIAction()
		 * @generated
		 */
		EClass AEMILIA_CLONE_AEI_ACTION = eINSTANCE.getAEmiliaCloneAEIAction();

		/**
		 * The meta object literal for the '<em><b>Source AEI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_CLONE_AEI_ACTION__SOURCE_AEI = eINSTANCE.getAEmiliaCloneAEIAction_SourceAEI();

		/**
		 * The meta object literal for the '<em><b>Cloned AEI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_CLONE_AEI_ACTION__CLONED_AEI = eINSTANCE.getAEmiliaCloneAEIAction_ClonedAEI();

		/**
		 * The meta object literal for the '<em><b>List Of Input Interactions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_CLONE_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS = eINSTANCE.getAEmiliaCloneAEIAction_ListOfInputInteractions();

		/**
		 * The meta object literal for the '<em><b>List Of Output Interactions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_CLONE_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS = eINSTANCE.getAEmiliaCloneAEIAction_ListOfOutputInteractions();

		/**
		 * The meta object literal for the '<em><b>List Of New Attachments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_CLONE_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS = eINSTANCE.getAEmiliaCloneAEIAction_ListOfNewAttachments();

		/**
		 * The meta object literal for the '<em><b>Aei To Clone SVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__AEI_TO_CLONE_SVP = eINSTANCE.getAEmiliaCloneAEIAction_AeiToCloneSVP();

		/**
		 * The meta object literal for the '<em><b>Cloned Aei SVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__CLONED_AEI_SVP = eINSTANCE.getAEmiliaCloneAEIAction_ClonedAeiSVP();

		/**
		 * The meta object literal for the '<em><b>All Or Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_OR_INTERACTS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllOrInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All In Local Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllInLocalInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Out Local Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllOutLocalInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Uni Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_UNI_INTERACTS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllUniInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Local Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllLocalInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Aeis MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_AEIS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllAeisMVP();

		/**
		 * The meta object literal for the '<em><b>All In Remote Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllInRemoteInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Out Remote Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CLONE_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP = eINSTANCE.getAEmiliaCloneAEIAction_AllOutRemoteInteractsMVP();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl <em>Const Changes Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaConstChangesAction()
		 * @generated
		 */
		EClass AEMILIA_CONST_CHANGES_ACTION = eINSTANCE.getAEmiliaConstChangesAction();

		/**
		 * The meta object literal for the '<em><b>Source Const Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT = eINSTANCE.getAEmiliaConstChangesAction_SourceConstInit();

		/**
		 * The meta object literal for the '<em><b>Factor Of Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE = eINSTANCE.getAEmiliaConstChangesAction_FactorOfChange();

		/**
		 * The meta object literal for the '<em><b>Source Const Init SVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP = eINSTANCE.getAEmiliaConstChangesAction_SourceConstInitSVP();

		/**
		 * The meta object literal for the '<em><b>All Const Inits MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP = eINSTANCE.getAEmiliaConstChangesAction_AllConstInitsMVP();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaChangeActionImpl <em>Change Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaChangeActionImpl
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaChangeAction()
		 * @generated
		 */
		EClass AEMILIA_CHANGE_ACTION = eINSTANCE.getAEmiliaChangeAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl <em>Remove Cloned AEI Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaRemoveClonedAEIAction()
		 * @generated
		 */
		EClass AEMILIA_REMOVE_CLONED_AEI_ACTION = eINSTANCE.getAEmiliaRemoveClonedAEIAction();

		/**
		 * The meta object literal for the '<em><b>Source AEI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI = eINSTANCE.getAEmiliaRemoveClonedAEIAction_SourceAEI();

		/**
		 * The meta object literal for the '<em><b>Cloned AEI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI = eINSTANCE.getAEmiliaRemoveClonedAEIAction_ClonedAEI();

		/**
		 * The meta object literal for the '<em><b>List Of Input Interactions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS = eINSTANCE.getAEmiliaRemoveClonedAEIAction_ListOfInputInteractions();

		/**
		 * The meta object literal for the '<em><b>List Of Output Interactions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS = eINSTANCE.getAEmiliaRemoveClonedAEIAction_ListOfOutputInteractions();

		/**
		 * The meta object literal for the '<em><b>List Of New Attachments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS = eINSTANCE.getAEmiliaRemoveClonedAEIAction_ListOfNewAttachments();

		/**
		 * The meta object literal for the '<em><b>Aei To Clone SVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AeiToCloneSVP();

		/**
		 * The meta object literal for the '<em><b>Cloned Aei SVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_ClonedAeiSVP();

		/**
		 * The meta object literal for the '<em><b>All Or Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllOrInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All In Local Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllInLocalInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Out Local Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllOutLocalInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Uni Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllUniInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Local Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllLocalInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Aeis MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllAeisMVP();

		/**
		 * The meta object literal for the '<em><b>All In Remote Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllInRemoteInteractsMVP();

		/**
		 * The meta object literal for the '<em><b>All Out Remote Interacts MVP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP = eINSTANCE.getAEmiliaRemoveClonedAEIAction_AllOutRemoteInteractsMVP();

		/**
		 * The meta object literal for the '<em>Elem Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.mmaemilia.ElemType
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getElemType()
		 * @generated
		 */
		EDataType ELEM_TYPE = eINSTANCE.getElemType();

		/**
		 * The meta object literal for the '<em>Input Interaction</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.mmaemilia.InputInteraction
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getInputInteraction()
		 * @generated
		 */
		EDataType INPUT_INTERACTION = eINSTANCE.getInputInteraction();

		/**
		 * The meta object literal for the '<em>Archi Elem Instance</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.mmaemilia.ArchiElemInstance
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getArchiElemInstance()
		 * @generated
		 */
		EDataType ARCHI_ELEM_INSTANCE = eINSTANCE.getArchiElemInstance();

		/**
		 * The meta object literal for the '<em>Output Interaction</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.mmaemilia.OutputInteraction
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getOutputInteraction()
		 * @generated
		 */
		EDataType OUTPUT_INTERACTION = eINSTANCE.getOutputInteraction();

		/**
		 * The meta object literal for the '<em>Attachment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.mmaemilia.Attachment
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAttachment()
		 * @generated
		 */
		EDataType ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em>Specification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.mmaemilia.AEmiliaSpecification
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getAEmiliaSpecification()
		 * @generated
		 */
		EDataType AEMILIA_SPECIFICATION = eINSTANCE.getAEmiliaSpecification();

		/**
		 * The meta object literal for the '<em>Const Init</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel.mmaemilia.Headers.ConstInit
		 * @see logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl#getConstInit()
		 * @generated
		 */
		EDataType CONST_INIT = eINSTANCE.getConstInit();

	}

} //AEmiliaPackage
