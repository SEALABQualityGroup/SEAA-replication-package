/**
 */
package logicalSpecification.actions.UML;

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
 * @see logicalSpecification.actions.UML.UMLFactory
 * @model kind="package"
 * @generated
 */
public interface UMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim.seagroup/logicalSpecification/actions/uml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logicalSpecificationUMLActions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLPackage eINSTANCE = logicalSpecification.actions.UML.impl.UMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLAddActionImpl <em>Add Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLAddActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddAction()
	 * @generated
	 */
	int UML_ADD_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__NAME = LogicalSpecificationPackage.ADD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__NUM_OF_CHANGES = LogicalSpecificationPackage.ADD_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__COST = LogicalSpecificationPackage.ADD_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__REFACTORING = LogicalSpecificationPackage.ADD_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__PARAMETERS = LogicalSpecificationPackage.ADD_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__PRE = LogicalSpecificationPackage.ADD_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__POST = LogicalSpecificationPackage.ADD_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION__MODEL = LogicalSpecificationPackage.ADD_ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Add Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION_FEATURE_COUNT = LogicalSpecificationPackage.ADD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION___EXECUTE = LogicalSpecificationPackage.ADD_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION___LOG = LogicalSpecificationPackage.ADD_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION___SET_PARAMETERS = LogicalSpecificationPackage.ADD_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION___CREATE_PRE_CONDITION = LogicalSpecificationPackage.ADD_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION___CREATE_POST_CONDITION = LogicalSpecificationPackage.ADD_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Add Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_ACTION_OPERATION_COUNT = LogicalSpecificationPackage.ADD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLDeleteActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteAction()
	 * @generated
	 */
	int UML_DELETE_ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__NAME = LogicalSpecificationPackage.DELETE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__NUM_OF_CHANGES = LogicalSpecificationPackage.DELETE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__COST = LogicalSpecificationPackage.DELETE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__REFACTORING = LogicalSpecificationPackage.DELETE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__PARAMETERS = LogicalSpecificationPackage.DELETE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__PRE = LogicalSpecificationPackage.DELETE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__POST = LogicalSpecificationPackage.DELETE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION__MODEL = LogicalSpecificationPackage.DELETE_ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION_FEATURE_COUNT = LogicalSpecificationPackage.DELETE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION___EXECUTE = LogicalSpecificationPackage.DELETE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION___LOG = LogicalSpecificationPackage.DELETE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION___SET_PARAMETERS = LogicalSpecificationPackage.DELETE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION___CREATE_PRE_CONDITION = LogicalSpecificationPackage.DELETE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION___CREATE_POST_CONDITION = LogicalSpecificationPackage.DELETE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_ACTION_OPERATION_COUNT = LogicalSpecificationPackage.DELETE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLMoveActionImpl <em>Move Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLMoveActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLMoveAction()
	 * @generated
	 */
	int UML_MOVE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__NAME = LogicalSpecificationPackage.MOVE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__NUM_OF_CHANGES = LogicalSpecificationPackage.MOVE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__COST = LogicalSpecificationPackage.MOVE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__REFACTORING = LogicalSpecificationPackage.MOVE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__PARAMETERS = LogicalSpecificationPackage.MOVE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__PRE = LogicalSpecificationPackage.MOVE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__POST = LogicalSpecificationPackage.MOVE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION__MODEL = LogicalSpecificationPackage.MOVE_ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION_FEATURE_COUNT = LogicalSpecificationPackage.MOVE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION___EXECUTE = LogicalSpecificationPackage.MOVE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION___LOG = LogicalSpecificationPackage.MOVE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION___SET_PARAMETERS = LogicalSpecificationPackage.MOVE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION___CREATE_PRE_CONDITION = LogicalSpecificationPackage.MOVE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION___CREATE_POST_CONDITION = LogicalSpecificationPackage.MOVE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_ACTION_OPERATION_COUNT = LogicalSpecificationPackage.MOVE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl <em>Add Node Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddNodeAction()
	 * @generated
	 */
	int UML_ADD_NODE_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__NAME = UML_ADD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__NUM_OF_CHANGES = UML_ADD_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__COST = UML_ADD_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__REFACTORING = UML_ADD_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__PARAMETERS = UML_ADD_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__PRE = UML_ADD_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__POST = UML_ADD_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__MODEL = UML_ADD_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Node To Add SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP = UML_ADD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neighbors MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__NEIGHBORS_MVP = UML_ADD_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comps To Deploy MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP = UML_ADD_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__ALL_COMPS_MVP = UML_ADD_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__ALL_NODES_MVP = UML_ADD_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Deployed Elems MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP = UML_ADD_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uml Node To Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__UML_NODE_TO_ADD = UML_ADD_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uml Neighbors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__UML_NEIGHBORS = UML_ADD_ACTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Uml Comps To Deploy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY = UML_ADD_ACTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Uml Source Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE = UML_ADD_ACTION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Add Node Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION_FEATURE_COUNT = UML_ADD_ACTION_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION___EXECUTE = UML_ADD_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION___LOG = UML_ADD_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION___SET_PARAMETERS = UML_ADD_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION___CREATE_PRE_CONDITION = UML_ADD_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION___CREATE_POST_CONDITION = UML_ADD_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Add Node Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_NODE_ACTION_OPERATION_COUNT = UML_ADD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl <em>Add Component Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddComponentAction()
	 * @generated
	 */
	int UML_ADD_COMPONENT_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__NAME = UML_ADD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__NUM_OF_CHANGES = UML_ADD_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__COST = UML_ADD_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__REFACTORING = UML_ADD_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__PARAMETERS = UML_ADD_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__PRE = UML_ADD_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__POST = UML_ADD_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__MODEL = UML_ADD_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Component To Add SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP = UML_ADD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP = UML_ADD_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployed Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP = UML_ADD_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP = UML_ADD_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP = UML_ADD_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uml Comp To Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD = UML_ADD_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uml Source Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE = UML_ADD_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uml Target Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES = UML_ADD_ACTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Add Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION_FEATURE_COUNT = UML_ADD_ACTION_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION___EXECUTE = UML_ADD_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION___LOG = UML_ADD_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION___SET_PARAMETERS = UML_ADD_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION___CREATE_PRE_CONDITION = UML_ADD_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION___CREATE_POST_CONDITION = UML_ADD_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Add Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_COMPONENT_ACTION_OPERATION_COUNT = UML_ADD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl <em>Add Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddOperationAction()
	 * @generated
	 */
	int UML_ADD_OPERATION_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__NAME = UML_ADD_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__NUM_OF_CHANGES = UML_ADD_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__COST = UML_ADD_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__REFACTORING = UML_ADD_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__PARAMETERS = UML_ADD_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__PRE = UML_ADD_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__POST = UML_ADD_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__MODEL = UML_ADD_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Op To Add SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP = UML_ADD_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Comp SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP = UML_ADD_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP = UML_ADD_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Comp Ops MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP = UML_ADD_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uml Op To Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD = UML_ADD_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uml Target Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION__UML_TARGET_COMP = UML_ADD_ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Add Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION_FEATURE_COUNT = UML_ADD_ACTION_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION___EXECUTE = UML_ADD_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION___LOG = UML_ADD_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION___SET_PARAMETERS = UML_ADD_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION___CREATE_PRE_CONDITION = UML_ADD_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION___CREATE_POST_CONDITION = UML_ADD_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Add Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ADD_OPERATION_ACTION_OPERATION_COUNT = UML_ADD_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteNodeActionImpl <em>Delete Node Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLDeleteNodeActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteNodeAction()
	 * @generated
	 */
	int UML_DELETE_NODE_ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__NAME = UML_DELETE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__NUM_OF_CHANGES = UML_DELETE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__COST = UML_DELETE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__REFACTORING = UML_DELETE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__PARAMETERS = UML_DELETE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__PRE = UML_DELETE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__POST = UML_DELETE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__MODEL = UML_DELETE_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Node To Del SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__NODE_TO_DEL_SVP = UML_DELETE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__ALL_NODES_MVP = UML_DELETE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uml Node To Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION__UML_NODE_TO_DEL = UML_DELETE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delete Node Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION_FEATURE_COUNT = UML_DELETE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION___EXECUTE = UML_DELETE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION___LOG = UML_DELETE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION___SET_PARAMETERS = UML_DELETE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION___CREATE_PRE_CONDITION = UML_DELETE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION___CREATE_POST_CONDITION = UML_DELETE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Delete Node Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_NODE_ACTION_OPERATION_COUNT = UML_DELETE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteComponentActionImpl <em>Delete Component Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLDeleteComponentActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteComponentAction()
	 * @generated
	 */
	int UML_DELETE_COMPONENT_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__NAME = UML_DELETE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__NUM_OF_CHANGES = UML_DELETE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__COST = UML_DELETE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__REFACTORING = UML_DELETE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__PARAMETERS = UML_DELETE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__PRE = UML_DELETE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__POST = UML_DELETE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__MODEL = UML_DELETE_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Comp To Del SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP = UML_DELETE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP = UML_DELETE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uml Comp To Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL = UML_DELETE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delete Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION_FEATURE_COUNT = UML_DELETE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION___EXECUTE = UML_DELETE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION___LOG = UML_DELETE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION___SET_PARAMETERS = UML_DELETE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION___CREATE_PRE_CONDITION = UML_DELETE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION___CREATE_POST_CONDITION = UML_DELETE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Delete Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_COMPONENT_ACTION_OPERATION_COUNT = UML_DELETE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteOperationActionImpl <em>Delete Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLDeleteOperationActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteOperationAction()
	 * @generated
	 */
	int UML_DELETE_OPERATION_ACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__NAME = UML_DELETE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__NUM_OF_CHANGES = UML_DELETE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__COST = UML_DELETE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__REFACTORING = UML_DELETE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__PARAMETERS = UML_DELETE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__PRE = UML_DELETE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__POST = UML_DELETE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__MODEL = UML_DELETE_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Op To Del SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP = UML_DELETE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Ops MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP = UML_DELETE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uml Op To Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL = UML_DELETE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delete Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION_FEATURE_COUNT = UML_DELETE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION___EXECUTE = UML_DELETE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION___LOG = UML_DELETE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION___SET_PARAMETERS = UML_DELETE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION___CREATE_PRE_CONDITION = UML_DELETE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION___CREATE_POST_CONDITION = UML_DELETE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Delete Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DELETE_OPERATION_ACTION_OPERATION_COUNT = UML_DELETE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl <em>Move Component Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLMoveComponentAction()
	 * @generated
	 */
	int UML_MOVE_COMPONENT_ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__NAME = UML_MOVE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__NUM_OF_CHANGES = UML_MOVE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__COST = UML_MOVE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__REFACTORING = UML_MOVE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__PARAMETERS = UML_MOVE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__PRE = UML_MOVE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__POST = UML_MOVE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__MODEL = UML_MOVE_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Comp To Move SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP = UML_MOVE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Artifacts MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Targets MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Deployed Elems MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uml Comp To Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE = UML_MOVE_ACTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Uml Target Nodes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES = UML_MOVE_ACTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Uml Artifacts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS = UML_MOVE_ACTION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Move Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION_FEATURE_COUNT = UML_MOVE_ACTION_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION___EXECUTE = UML_MOVE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION___LOG = UML_MOVE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION___SET_PARAMETERS = UML_MOVE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION___CREATE_PRE_CONDITION = UML_MOVE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION___CREATE_POST_CONDITION = UML_MOVE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Move Component Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_COMPONENT_ACTION_OPERATION_COUNT = UML_MOVE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl <em>Move Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLMoveOperationAction()
	 * @generated
	 */
	int UML_MOVE_OPERATION_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__NAME = UML_MOVE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__NUM_OF_CHANGES = UML_MOVE_ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__COST = UML_MOVE_ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__REFACTORING = UML_MOVE_ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__PARAMETERS = UML_MOVE_ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__PRE = UML_MOVE_ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__POST = UML_MOVE_ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__MODEL = UML_MOVE_ACTION__MODEL;

	/**
	 * The feature id for the '<em><b>Op To Move SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP = UML_MOVE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Comp SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP = UML_MOVE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Ops MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Target Comp Ops MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP = UML_MOVE_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uml Op To Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE = UML_MOVE_ACTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uml Target Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP = UML_MOVE_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Move Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION_FEATURE_COUNT = UML_MOVE_ACTION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION___EXECUTE = UML_MOVE_ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION___LOG = UML_MOVE_ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION___SET_PARAMETERS = UML_MOVE_ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION___CREATE_PRE_CONDITION = UML_MOVE_ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION___CREATE_POST_CONDITION = UML_MOVE_ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Move Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_MOVE_OPERATION_ACTION_OPERATION_COUNT = UML_MOVE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Component</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Component
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 11;

	/**
	 * The meta object id for the '<em>Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Node
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 12;

	/**
	 * The meta object id for the '<em>Package</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Package
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 13;

	/**
	 * The meta object id for the '<em>Operation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Operation
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 14;

	/**
	 * The meta object id for the '<em>Artifact</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.uml.Artifact
	 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 15;


	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLAddAction <em>Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddAction
	 * @generated
	 */
	EClass getUMLAddAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLDeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteAction
	 * @generated
	 */
	EClass getUMLDeleteAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLMoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveAction
	 * @generated
	 */
	EClass getUMLMoveAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLAddNodeAction <em>Add Node Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Node Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction
	 * @generated
	 */
	EClass getUMLAddNodeAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getNodeToAddSVP <em>Node To Add SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node To Add SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getNodeToAddSVP()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EReference getUMLAddNodeAction_NodeToAddSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getNeighborsMVP <em>Neighbors MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Neighbors MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getNeighborsMVP()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EReference getUMLAddNodeAction_NeighborsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getCompsToDeployMVP <em>Comps To Deploy MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comps To Deploy MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getCompsToDeployMVP()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EReference getUMLAddNodeAction_CompsToDeployMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllCompsMVP <em>All Comps MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Comps MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getAllCompsMVP()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EReference getUMLAddNodeAction_AllCompsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllNodesMVP <em>All Nodes MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Nodes MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getAllNodesMVP()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EReference getUMLAddNodeAction_AllNodesMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Deployed Elems MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getAllDeployedElemsMVP()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EReference getUMLAddNodeAction_AllDeployedElemsMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlNodeToAdd <em>Uml Node To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Node To Add</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getUmlNodeToAdd()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EAttribute getUMLAddNodeAction_UmlNodeToAdd();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlNeighbors <em>Uml Neighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uml Neighbors</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getUmlNeighbors()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EAttribute getUMLAddNodeAction_UmlNeighbors();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlCompsToDeploy <em>Uml Comps To Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uml Comps To Deploy</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getUmlCompsToDeploy()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EAttribute getUMLAddNodeAction_UmlCompsToDeploy();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlSourcePackage <em>Uml Source Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Source Package</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction#getUmlSourcePackage()
	 * @see #getUMLAddNodeAction()
	 * @generated
	 */
	EAttribute getUMLAddNodeAction_UmlSourcePackage();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLAddComponentAction <em>Add Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Component Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction
	 * @generated
	 */
	EClass getUMLAddComponentAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getComponentToAddSVP <em>Component To Add SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component To Add SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getComponentToAddSVP()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EReference getUMLAddComponentAction_ComponentToAddSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getTargetNodesMVP <em>Target Nodes MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Nodes MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getTargetNodesMVP()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EReference getUMLAddComponentAction_TargetNodesMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getDeployedCompsMVP <em>Deployed Comps MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployed Comps MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getDeployedCompsMVP()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EReference getUMLAddComponentAction_DeployedCompsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getAllCompsMVP <em>All Comps MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Comps MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getAllCompsMVP()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EReference getUMLAddComponentAction_AllCompsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getAllNodesMVP <em>All Nodes MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Nodes MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getAllNodesMVP()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EReference getUMLAddComponentAction_AllNodesMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlCompToAdd <em>Uml Comp To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Comp To Add</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getUmlCompToAdd()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EAttribute getUMLAddComponentAction_UmlCompToAdd();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlSourcePackage <em>Uml Source Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Source Package</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getUmlSourcePackage()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EAttribute getUMLAddComponentAction_UmlSourcePackage();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlTargetNodes <em>Uml Target Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uml Target Nodes</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction#getUmlTargetNodes()
	 * @see #getUMLAddComponentAction()
	 * @generated
	 */
	EAttribute getUMLAddComponentAction_UmlTargetNodes();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLAddOperationAction <em>Add Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Operation Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction
	 * @generated
	 */
	EClass getUMLAddOperationAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getOpToAddSVP <em>Op To Add SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op To Add SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction#getOpToAddSVP()
	 * @see #getUMLAddOperationAction()
	 * @generated
	 */
	EReference getUMLAddOperationAction_OpToAddSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompSVP <em>Target Comp SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Comp SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompSVP()
	 * @see #getUMLAddOperationAction()
	 * @generated
	 */
	EReference getUMLAddOperationAction_TargetCompSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getAllCompsMVP <em>All Comps MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Comps MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction#getAllCompsMVP()
	 * @see #getUMLAddOperationAction()
	 * @generated
	 */
	EReference getUMLAddOperationAction_AllCompsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompOpsMVP <em>Target Comp Ops MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Comp Ops MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompOpsMVP()
	 * @see #getUMLAddOperationAction()
	 * @generated
	 */
	EReference getUMLAddOperationAction_TargetCompOpsMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getUmlOpToAdd <em>Uml Op To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Op To Add</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction#getUmlOpToAdd()
	 * @see #getUMLAddOperationAction()
	 * @generated
	 */
	EAttribute getUMLAddOperationAction_UmlOpToAdd();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getUmlTargetComp <em>Uml Target Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Target Comp</em>'.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction#getUmlTargetComp()
	 * @see #getUMLAddOperationAction()
	 * @generated
	 */
	EAttribute getUMLAddOperationAction_UmlTargetComp();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction <em>Delete Node Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Node Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteNodeAction
	 * @generated
	 */
	EClass getUMLDeleteNodeAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getNodeToDelSVP <em>Node To Del SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node To Del SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteNodeAction#getNodeToDelSVP()
	 * @see #getUMLDeleteNodeAction()
	 * @generated
	 */
	EReference getUMLDeleteNodeAction_NodeToDelSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getAllNodesMVP <em>All Nodes MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Nodes MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteNodeAction#getAllNodesMVP()
	 * @see #getUMLDeleteNodeAction()
	 * @generated
	 */
	EReference getUMLDeleteNodeAction_AllNodesMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getUmlNodeToDel <em>Uml Node To Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Node To Del</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteNodeAction#getUmlNodeToDel()
	 * @see #getUMLDeleteNodeAction()
	 * @generated
	 */
	EAttribute getUMLDeleteNodeAction_UmlNodeToDel();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction <em>Delete Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Component Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteComponentAction
	 * @generated
	 */
	EClass getUMLDeleteComponentAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getCompToDelSVP <em>Comp To Del SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp To Del SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteComponentAction#getCompToDelSVP()
	 * @see #getUMLDeleteComponentAction()
	 * @generated
	 */
	EReference getUMLDeleteComponentAction_CompToDelSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getAllCompsMVP <em>All Comps MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Comps MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteComponentAction#getAllCompsMVP()
	 * @see #getUMLDeleteComponentAction()
	 * @generated
	 */
	EReference getUMLDeleteComponentAction_AllCompsMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getUmlCompToDel <em>Uml Comp To Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Comp To Del</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteComponentAction#getUmlCompToDel()
	 * @see #getUMLDeleteComponentAction()
	 * @generated
	 */
	EAttribute getUMLDeleteComponentAction_UmlCompToDel();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction <em>Delete Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Operation Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteOperationAction
	 * @generated
	 */
	EClass getUMLDeleteOperationAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getOpToDelSVP <em>Op To Del SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op To Del SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteOperationAction#getOpToDelSVP()
	 * @see #getUMLDeleteOperationAction()
	 * @generated
	 */
	EReference getUMLDeleteOperationAction_OpToDelSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getAllOpsMVP <em>All Ops MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Ops MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteOperationAction#getAllOpsMVP()
	 * @see #getUMLDeleteOperationAction()
	 * @generated
	 */
	EReference getUMLDeleteOperationAction_AllOpsMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getUmlOpToDel <em>Uml Op To Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Op To Del</em>'.
	 * @see logicalSpecification.actions.UML.UMLDeleteOperationAction#getUmlOpToDel()
	 * @see #getUMLDeleteOperationAction()
	 * @generated
	 */
	EAttribute getUMLDeleteOperationAction_UmlOpToDel();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLMoveComponentAction <em>Move Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Component Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction
	 * @generated
	 */
	EClass getUMLMoveComponentAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getCompToMoveSVP <em>Comp To Move SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp To Move SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getCompToMoveSVP()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EReference getUMLMoveComponentAction_CompToMoveSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getTargetNodesMVP <em>Target Nodes MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Nodes MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getTargetNodesMVP()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EReference getUMLMoveComponentAction_TargetNodesMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllArtifactsMVP <em>All Artifacts MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Artifacts MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getAllArtifactsMVP()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EReference getUMLMoveComponentAction_AllArtifactsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllCompsMVP <em>All Comps MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Comps MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getAllCompsMVP()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EReference getUMLMoveComponentAction_AllCompsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllTargetsMVP <em>All Targets MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Targets MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getAllTargetsMVP()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EReference getUMLMoveComponentAction_AllTargetsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllNodesMVP <em>All Nodes MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Nodes MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getAllNodesMVP()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EReference getUMLMoveComponentAction_AllNodesMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Deployed Elems MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getAllDeployedElemsMVP()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EReference getUMLMoveComponentAction_AllDeployedElemsMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlCompToMove <em>Uml Comp To Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Comp To Move</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlCompToMove()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EAttribute getUMLMoveComponentAction_UmlCompToMove();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlTargetNodes <em>Uml Target Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uml Target Nodes</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlTargetNodes()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EAttribute getUMLMoveComponentAction_UmlTargetNodes();

	/**
	 * Returns the meta object for the attribute list '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlArtifacts <em>Uml Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uml Artifacts</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlArtifacts()
	 * @see #getUMLMoveComponentAction()
	 * @generated
	 */
	EAttribute getUMLMoveComponentAction_UmlArtifacts();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.actions.UML.UMLMoveOperationAction <em>Move Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Operation Action</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction
	 * @generated
	 */
	EClass getUMLMoveOperationAction();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveOperationAction#getOpToMoveSVP <em>Op To Move SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op To Move SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction#getOpToMoveSVP()
	 * @see #getUMLMoveOperationAction()
	 * @generated
	 */
	EReference getUMLMoveOperationAction_OpToMoveSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveOperationAction#getTargetCompSVP <em>Target Comp SVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Comp SVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction#getTargetCompSVP()
	 * @see #getUMLMoveOperationAction()
	 * @generated
	 */
	EReference getUMLMoveOperationAction_TargetCompSVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveOperationAction#getAllOpsMVP <em>All Ops MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Ops MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction#getAllOpsMVP()
	 * @see #getUMLMoveOperationAction()
	 * @generated
	 */
	EReference getUMLMoveOperationAction_AllOpsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveOperationAction#getAllCompsMVP <em>All Comps MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Comps MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction#getAllCompsMVP()
	 * @see #getUMLMoveOperationAction()
	 * @generated
	 */
	EReference getUMLMoveOperationAction_AllCompsMVP();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.actions.UML.UMLMoveOperationAction#getAllTargetCompOpsMVP <em>All Target Comp Ops MVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>All Target Comp Ops MVP</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction#getAllTargetCompOpsMVP()
	 * @see #getUMLMoveOperationAction()
	 * @generated
	 */
	EReference getUMLMoveOperationAction_AllTargetCompOpsMVP();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLMoveOperationAction#getUmlOpToMove <em>Uml Op To Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Op To Move</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction#getUmlOpToMove()
	 * @see #getUMLMoveOperationAction()
	 * @generated
	 */
	EAttribute getUMLMoveOperationAction_UmlOpToMove();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.actions.UML.UMLMoveOperationAction#getUmlTargetComp <em>Uml Target Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Target Comp</em>'.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction#getUmlTargetComp()
	 * @see #getUMLMoveOperationAction()
	 * @generated
	 */
	EAttribute getUMLMoveOperationAction_UmlTargetComp();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.uml2.uml.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Component</em>'.
	 * @see org.eclipse.uml2.uml.Component
	 * @model instanceClass="org.eclipse.uml2.uml.Component"
	 * @generated
	 */
	EDataType getComponent();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.uml2.uml.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node</em>'.
	 * @see org.eclipse.uml2.uml.Node
	 * @model instanceClass="org.eclipse.uml2.uml.Node"
	 * @generated
	 */
	EDataType getNode();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.uml2.uml.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Package</em>'.
	 * @see org.eclipse.uml2.uml.Package
	 * @model instanceClass="org.eclipse.uml2.uml.Package"
	 * @generated
	 */
	EDataType getPackage();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.uml2.uml.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation</em>'.
	 * @see org.eclipse.uml2.uml.Operation
	 * @model instanceClass="org.eclipse.uml2.uml.Operation"
	 * @generated
	 */
	EDataType getOperation();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.uml2.uml.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artifact</em>'.
	 * @see org.eclipse.uml2.uml.Artifact
	 * @model instanceClass="org.eclipse.uml2.uml.Artifact"
	 * @generated
	 */
	EDataType getArtifact();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLFactory getUMLFactory();

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
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLAddActionImpl <em>Add Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLAddActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddAction()
		 * @generated
		 */
		EClass UML_ADD_ACTION = eINSTANCE.getUMLAddAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLDeleteActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteAction()
		 * @generated
		 */
		EClass UML_DELETE_ACTION = eINSTANCE.getUMLDeleteAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLMoveActionImpl <em>Move Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLMoveActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLMoveAction()
		 * @generated
		 */
		EClass UML_MOVE_ACTION = eINSTANCE.getUMLMoveAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl <em>Add Node Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddNodeAction()
		 * @generated
		 */
		EClass UML_ADD_NODE_ACTION = eINSTANCE.getUMLAddNodeAction();

		/**
		 * The meta object literal for the '<em><b>Node To Add SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP = eINSTANCE.getUMLAddNodeAction_NodeToAddSVP();

		/**
		 * The meta object literal for the '<em><b>Neighbors MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_NODE_ACTION__NEIGHBORS_MVP = eINSTANCE.getUMLAddNodeAction_NeighborsMVP();

		/**
		 * The meta object literal for the '<em><b>Comps To Deploy MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP = eINSTANCE.getUMLAddNodeAction_CompsToDeployMVP();

		/**
		 * The meta object literal for the '<em><b>All Comps MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_NODE_ACTION__ALL_COMPS_MVP = eINSTANCE.getUMLAddNodeAction_AllCompsMVP();

		/**
		 * The meta object literal for the '<em><b>All Nodes MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_NODE_ACTION__ALL_NODES_MVP = eINSTANCE.getUMLAddNodeAction_AllNodesMVP();

		/**
		 * The meta object literal for the '<em><b>All Deployed Elems MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP = eINSTANCE.getUMLAddNodeAction_AllDeployedElemsMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Node To Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_NODE_ACTION__UML_NODE_TO_ADD = eINSTANCE.getUMLAddNodeAction_UmlNodeToAdd();

		/**
		 * The meta object literal for the '<em><b>Uml Neighbors</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_NODE_ACTION__UML_NEIGHBORS = eINSTANCE.getUMLAddNodeAction_UmlNeighbors();

		/**
		 * The meta object literal for the '<em><b>Uml Comps To Deploy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY = eINSTANCE.getUMLAddNodeAction_UmlCompsToDeploy();

		/**
		 * The meta object literal for the '<em><b>Uml Source Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE = eINSTANCE.getUMLAddNodeAction_UmlSourcePackage();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl <em>Add Component Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddComponentAction()
		 * @generated
		 */
		EClass UML_ADD_COMPONENT_ACTION = eINSTANCE.getUMLAddComponentAction();

		/**
		 * The meta object literal for the '<em><b>Component To Add SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP = eINSTANCE.getUMLAddComponentAction_ComponentToAddSVP();

		/**
		 * The meta object literal for the '<em><b>Target Nodes MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP = eINSTANCE.getUMLAddComponentAction_TargetNodesMVP();

		/**
		 * The meta object literal for the '<em><b>Deployed Comps MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP = eINSTANCE.getUMLAddComponentAction_DeployedCompsMVP();

		/**
		 * The meta object literal for the '<em><b>All Comps MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP = eINSTANCE.getUMLAddComponentAction_AllCompsMVP();

		/**
		 * The meta object literal for the '<em><b>All Nodes MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP = eINSTANCE.getUMLAddComponentAction_AllNodesMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Comp To Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD = eINSTANCE.getUMLAddComponentAction_UmlCompToAdd();

		/**
		 * The meta object literal for the '<em><b>Uml Source Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE = eINSTANCE.getUMLAddComponentAction_UmlSourcePackage();

		/**
		 * The meta object literal for the '<em><b>Uml Target Nodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES = eINSTANCE.getUMLAddComponentAction_UmlTargetNodes();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl <em>Add Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLAddOperationAction()
		 * @generated
		 */
		EClass UML_ADD_OPERATION_ACTION = eINSTANCE.getUMLAddOperationAction();

		/**
		 * The meta object literal for the '<em><b>Op To Add SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP = eINSTANCE.getUMLAddOperationAction_OpToAddSVP();

		/**
		 * The meta object literal for the '<em><b>Target Comp SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP = eINSTANCE.getUMLAddOperationAction_TargetCompSVP();

		/**
		 * The meta object literal for the '<em><b>All Comps MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP = eINSTANCE.getUMLAddOperationAction_AllCompsMVP();

		/**
		 * The meta object literal for the '<em><b>Target Comp Ops MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP = eINSTANCE.getUMLAddOperationAction_TargetCompOpsMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Op To Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD = eINSTANCE.getUMLAddOperationAction_UmlOpToAdd();

		/**
		 * The meta object literal for the '<em><b>Uml Target Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ADD_OPERATION_ACTION__UML_TARGET_COMP = eINSTANCE.getUMLAddOperationAction_UmlTargetComp();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteNodeActionImpl <em>Delete Node Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLDeleteNodeActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteNodeAction()
		 * @generated
		 */
		EClass UML_DELETE_NODE_ACTION = eINSTANCE.getUMLDeleteNodeAction();

		/**
		 * The meta object literal for the '<em><b>Node To Del SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DELETE_NODE_ACTION__NODE_TO_DEL_SVP = eINSTANCE.getUMLDeleteNodeAction_NodeToDelSVP();

		/**
		 * The meta object literal for the '<em><b>All Nodes MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DELETE_NODE_ACTION__ALL_NODES_MVP = eINSTANCE.getUMLDeleteNodeAction_AllNodesMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Node To Del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_DELETE_NODE_ACTION__UML_NODE_TO_DEL = eINSTANCE.getUMLDeleteNodeAction_UmlNodeToDel();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteComponentActionImpl <em>Delete Component Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLDeleteComponentActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteComponentAction()
		 * @generated
		 */
		EClass UML_DELETE_COMPONENT_ACTION = eINSTANCE.getUMLDeleteComponentAction();

		/**
		 * The meta object literal for the '<em><b>Comp To Del SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP = eINSTANCE.getUMLDeleteComponentAction_CompToDelSVP();

		/**
		 * The meta object literal for the '<em><b>All Comps MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP = eINSTANCE.getUMLDeleteComponentAction_AllCompsMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Comp To Del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL = eINSTANCE.getUMLDeleteComponentAction_UmlCompToDel();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLDeleteOperationActionImpl <em>Delete Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLDeleteOperationActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLDeleteOperationAction()
		 * @generated
		 */
		EClass UML_DELETE_OPERATION_ACTION = eINSTANCE.getUMLDeleteOperationAction();

		/**
		 * The meta object literal for the '<em><b>Op To Del SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP = eINSTANCE.getUMLDeleteOperationAction_OpToDelSVP();

		/**
		 * The meta object literal for the '<em><b>All Ops MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP = eINSTANCE.getUMLDeleteOperationAction_AllOpsMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Op To Del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL = eINSTANCE.getUMLDeleteOperationAction_UmlOpToDel();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl <em>Move Component Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLMoveComponentAction()
		 * @generated
		 */
		EClass UML_MOVE_COMPONENT_ACTION = eINSTANCE.getUMLMoveComponentAction();

		/**
		 * The meta object literal for the '<em><b>Comp To Move SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP = eINSTANCE.getUMLMoveComponentAction_CompToMoveSVP();

		/**
		 * The meta object literal for the '<em><b>Target Nodes MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP = eINSTANCE.getUMLMoveComponentAction_TargetNodesMVP();

		/**
		 * The meta object literal for the '<em><b>All Artifacts MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP = eINSTANCE.getUMLMoveComponentAction_AllArtifactsMVP();

		/**
		 * The meta object literal for the '<em><b>All Comps MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP = eINSTANCE.getUMLMoveComponentAction_AllCompsMVP();

		/**
		 * The meta object literal for the '<em><b>All Targets MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP = eINSTANCE.getUMLMoveComponentAction_AllTargetsMVP();

		/**
		 * The meta object literal for the '<em><b>All Nodes MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP = eINSTANCE.getUMLMoveComponentAction_AllNodesMVP();

		/**
		 * The meta object literal for the '<em><b>All Deployed Elems MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP = eINSTANCE.getUMLMoveComponentAction_AllDeployedElemsMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Comp To Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE = eINSTANCE.getUMLMoveComponentAction_UmlCompToMove();

		/**
		 * The meta object literal for the '<em><b>Uml Target Nodes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES = eINSTANCE.getUMLMoveComponentAction_UmlTargetNodes();

		/**
		 * The meta object literal for the '<em><b>Uml Artifacts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS = eINSTANCE.getUMLMoveComponentAction_UmlArtifacts();

		/**
		 * The meta object literal for the '{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl <em>Move Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getUMLMoveOperationAction()
		 * @generated
		 */
		EClass UML_MOVE_OPERATION_ACTION = eINSTANCE.getUMLMoveOperationAction();

		/**
		 * The meta object literal for the '<em><b>Op To Move SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP = eINSTANCE.getUMLMoveOperationAction_OpToMoveSVP();

		/**
		 * The meta object literal for the '<em><b>Target Comp SVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP = eINSTANCE.getUMLMoveOperationAction_TargetCompSVP();

		/**
		 * The meta object literal for the '<em><b>All Ops MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP = eINSTANCE.getUMLMoveOperationAction_AllOpsMVP();

		/**
		 * The meta object literal for the '<em><b>All Comps MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP = eINSTANCE.getUMLMoveOperationAction_AllCompsMVP();

		/**
		 * The meta object literal for the '<em><b>All Target Comp Ops MVP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP = eINSTANCE.getUMLMoveOperationAction_AllTargetCompOpsMVP();

		/**
		 * The meta object literal for the '<em><b>Uml Op To Move</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE = eINSTANCE.getUMLMoveOperationAction_UmlOpToMove();

		/**
		 * The meta object literal for the '<em><b>Uml Target Comp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP = eINSTANCE.getUMLMoveOperationAction_UmlTargetComp();

		/**
		 * The meta object literal for the '<em>Component</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Component
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getComponent()
		 * @generated
		 */
		EDataType COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em>Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Node
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getNode()
		 * @generated
		 */
		EDataType NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em>Package</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Package
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getPackage()
		 * @generated
		 */
		EDataType PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em>Operation</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Operation
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getOperation()
		 * @generated
		 */
		EDataType OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em>Artifact</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.uml.Artifact
		 * @see logicalSpecification.actions.UML.impl.UMLPackageImpl#getArtifact()
		 * @generated
		 */
		EDataType ARTIFACT = eINSTANCE.getArtifact();

	}

} //UMLPackage
