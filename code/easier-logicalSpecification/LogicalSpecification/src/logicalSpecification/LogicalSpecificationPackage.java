/**
 */
package logicalSpecification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see logicalSpecification.LogicalSpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface LogicalSpecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logicalSpecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim.seagroup/logicalSpecification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logicalSpecification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicalSpecificationPackage eINSTANCE = logicalSpecification.impl.LogicalSpecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.NamedElementImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.RefactoringImpl <em>Refactoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.RefactoringImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getRefactoring()
	 * @generated
	 */
	int REFACTORING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__PRE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__POST = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lola4raps Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__LOLA4RAPS_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__COST = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING__NUM_OF_CHANGES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Clone Refactoring</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING___CLONE_REFACTORING = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.ActionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NUM_OF_CHANGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COST = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REFACTORING = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PRE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__POST = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MODEL = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EXECUTE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___LOG = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___SET_PARAMETERS = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CREATE_PRE_CONDITION = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___CREATE_POST_CONDITION = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.ParameterImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolving Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RESOLVING_EXPR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lhs Relational Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LHS_RELATIONAL_OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rhs Relational Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RHS_RELATIONAL_OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Antipattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANTIPATTERN = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.SingleValuedParameterImpl <em>Single Valued Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.SingleValuedParameterImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getSingleValuedParameter()
	 * @generated
	 */
	int SINGLE_VALUED_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__ACTION = PARAMETER__ACTION;

	/**
	 * The feature id for the '<em><b>Resolving Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__RESOLVING_EXPR = PARAMETER__RESOLVING_EXPR;

	/**
	 * The feature id for the '<em><b>Lhs Relational Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__LHS_RELATIONAL_OPERATOR = PARAMETER__LHS_RELATIONAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Rhs Relational Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__RHS_RELATIONAL_OPERATOR = PARAMETER__RHS_RELATIONAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Antipattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__ANTIPATTERN = PARAMETER__ANTIPATTERN;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER__EXISTS_OPERATOR = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Valued Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Valued Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUED_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.MultipleValuedParameterImpl <em>Multiple Valued Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.MultipleValuedParameterImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getMultipleValuedParameter()
	 * @generated
	 */
	int MULTIPLE_VALUED_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__ACTION = PARAMETER__ACTION;

	/**
	 * The feature id for the '<em><b>Resolving Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__RESOLVING_EXPR = PARAMETER__RESOLVING_EXPR;

	/**
	 * The feature id for the '<em><b>Lhs Relational Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__LHS_RELATIONAL_OPERATOR = PARAMETER__LHS_RELATIONAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Rhs Relational Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__RHS_RELATIONAL_OPERATOR = PARAMETER__RHS_RELATIONAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Antipattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__ANTIPATTERN = PARAMETER__ANTIPATTERN;

	/**
	 * The feature id for the '<em><b>For All Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Valued Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Valued Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_VALUED_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.ConditionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Condition Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_FORMULA = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.PreConditionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Condition Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__CONDITION_FORMULA = CONDITION__CONDITION_FORMULA;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__ACTION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__REFACTORING = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.PostConditionImpl <em>Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.PostConditionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getPostCondition()
	 * @generated
	 */
	int POST_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Condition Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__CONDITION_FORMULA = CONDITION__CONDITION_FORMULA;

	/**
	 * The feature id for the '<em><b>Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__ACTION = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__REFACTORING = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.FOLSpecificationImpl <em>FOL Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.FOLSpecificationImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getFOLSpecification()
	 * @generated
	 */
	int FOL_SPECIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_SPECIFICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_SPECIFICATION__CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_SPECIFICATION__ROOT_OPERATOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Antipattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_SPECIFICATION__ANTIPATTERN = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FOL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_SPECIFICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FOL Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOL_SPECIFICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.OperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 23;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FOLSPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FOR_ALLOPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NOT_OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__AND_OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__OR_OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__EXISTS_OPERATOR = 5;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___EVALUATE_OPERATOR__OBJECT = 0;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR___GUARANTEES__OPERATOR = 1;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.LogicalOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__FOLSPECIFICATION = OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__FOR_ALLOPERATOR = OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__NOT_OPERATOR = OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__AND_OPERATOR = OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__OR_OPERATOR = OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__EXISTS_OPERATOR = OPERATOR__EXISTS_OPERATOR;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR___EVALUATE_OPERATOR__OBJECT = OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR___GUARANTEES__OPERATOR = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR = OPERATOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.VoidOperatorImpl <em>Void Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.VoidOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getVoidOperator()
	 * @generated
	 */
	int VOID_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR__FOLSPECIFICATION = LOGICAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR__FOR_ALLOPERATOR = LOGICAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR__NOT_OPERATOR = LOGICAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR__AND_OPERATOR = LOGICAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR__OR_OPERATOR = LOGICAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR__EXISTS_OPERATOR = LOGICAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The number of structural features of the '<em>Void Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR___EVALUATE_OPERATOR__OBJECT = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR___GUARANTEES__OPERATOR = LOGICAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR___EVALUATE_OPERATOR__OPERATOR = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR;

	/**
	 * The number of operations of the '<em>Void Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.ForAllOperatorImpl <em>For All Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.ForAllOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getForAllOperator()
	 * @generated
	 */
	int FOR_ALL_OPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__FOLSPECIFICATION = LOGICAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__FOR_ALLOPERATOR = LOGICAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__NOT_OPERATOR = LOGICAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__AND_OPERATOR = LOGICAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__OR_OPERATOR = LOGICAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__EXISTS_OPERATOR = LOGICAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__COLLECTION = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR__ARGUMENT = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For All Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR___EVALUATE_OPERATOR__OBJECT = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR___GUARANTEES__OPERATOR = LOGICAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR___EVALUATE_OPERATOR__OPERATOR = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR;

	/**
	 * The number of operations of the '<em>For All Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.ExistsOperatorImpl <em>Exists Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.ExistsOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getExistsOperator()
	 * @generated
	 */
	int EXISTS_OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__FOLSPECIFICATION = LOGICAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__FOR_ALLOPERATOR = LOGICAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__NOT_OPERATOR = LOGICAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__AND_OPERATOR = LOGICAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__OR_OPERATOR = LOGICAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__EXISTS_OPERATOR = LOGICAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__ELEMENT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__COLLECTION = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR__ARGUMENT = LOGICAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exists Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR___EVALUATE_OPERATOR__OBJECT = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR___GUARANTEES__OPERATOR = LOGICAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR___EVALUATE_OPERATOR__OPERATOR = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR;

	/**
	 * The number of operations of the '<em>Exists Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.OrOperatorImpl <em>Or Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.OrOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getOrOperator()
	 * @generated
	 */
	int OR_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__FOLSPECIFICATION = LOGICAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__FOR_ALLOPERATOR = LOGICAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__NOT_OPERATOR = LOGICAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__AND_OPERATOR = LOGICAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__OR_OPERATOR = LOGICAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__EXISTS_OPERATOR = LOGICAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR__ARGUMENTS = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR___EVALUATE_OPERATOR__OBJECT = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR___GUARANTEES__OPERATOR = LOGICAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR___EVALUATE_OPERATOR__OPERATOR = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR;

	/**
	 * The number of operations of the '<em>Or Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.NotOperatorImpl <em>Not Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.NotOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getNotOperator()
	 * @generated
	 */
	int NOT_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__FOLSPECIFICATION = LOGICAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__FOR_ALLOPERATOR = LOGICAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__NOT_OPERATOR = LOGICAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__AND_OPERATOR = LOGICAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__OR_OPERATOR = LOGICAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__EXISTS_OPERATOR = LOGICAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__ARGUMENT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR___EVALUATE_OPERATOR__OBJECT = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR___GUARANTEES__OPERATOR = LOGICAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR___EVALUATE_OPERATOR__OPERATOR = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR;

	/**
	 * The number of operations of the '<em>Not Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.AndOperatorImpl <em>And Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.AndOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAndOperator()
	 * @generated
	 */
	int AND_OPERATOR = 16;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__FOLSPECIFICATION = LOGICAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__FOR_ALLOPERATOR = LOGICAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__NOT_OPERATOR = LOGICAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__AND_OPERATOR = LOGICAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__OR_OPERATOR = LOGICAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__EXISTS_OPERATOR = LOGICAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR__ARGUMENTS = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR___EVALUATE_OPERATOR__OBJECT = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR___GUARANTEES__OPERATOR = LOGICAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR___EVALUATE_OPERATOR__OPERATOR = LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR;

	/**
	 * The number of operations of the '<em>And Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATOR_OPERATION_COUNT = LOGICAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.RelationalOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__FOLSPECIFICATION = OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__FOR_ALLOPERATOR = OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__NOT_OPERATOR = OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__AND_OPERATOR = OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__OR_OPERATOR = OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__EXISTS_OPERATOR = OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__FACTOR = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__LHS = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR__RHS = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR___EVALUATE_OPERATOR__OBJECT = OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR___GUARANTEES__OPERATOR = OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The number of operations of the '<em>Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.EqualOperatorImpl <em>Equal Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.EqualOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getEqualOperator()
	 * @generated
	 */
	int EQUAL_OPERATOR = 18;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__FOLSPECIFICATION = RELATIONAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__FOR_ALLOPERATOR = RELATIONAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__NOT_OPERATOR = RELATIONAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__AND_OPERATOR = RELATIONAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__OR_OPERATOR = RELATIONAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__EXISTS_OPERATOR = RELATIONAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__FACTOR = RELATIONAL_OPERATOR__FACTOR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__LHS = RELATIONAL_OPERATOR__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR__RHS = RELATIONAL_OPERATOR__RHS;

	/**
	 * The number of structural features of the '<em>Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR___EVALUATE_OPERATOR__OBJECT = RELATIONAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR___GUARANTEES__OPERATOR = RELATIONAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The number of operations of the '<em>Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATOR_OPERATION_COUNT = RELATIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.GreaterOperatorImpl <em>Greater Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.GreaterOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getGreaterOperator()
	 * @generated
	 */
	int GREATER_OPERATOR = 19;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__FOLSPECIFICATION = RELATIONAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__FOR_ALLOPERATOR = RELATIONAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__NOT_OPERATOR = RELATIONAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__AND_OPERATOR = RELATIONAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__OR_OPERATOR = RELATIONAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__EXISTS_OPERATOR = RELATIONAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__FACTOR = RELATIONAL_OPERATOR__FACTOR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__LHS = RELATIONAL_OPERATOR__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR__RHS = RELATIONAL_OPERATOR__RHS;

	/**
	 * The number of structural features of the '<em>Greater Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR___EVALUATE_OPERATOR__OBJECT = RELATIONAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR___GUARANTEES__OPERATOR = RELATIONAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The number of operations of the '<em>Greater Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATOR_OPERATION_COUNT = RELATIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.GreaterEqualOperatorImpl <em>Greater Equal Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.GreaterEqualOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getGreaterEqualOperator()
	 * @generated
	 */
	int GREATER_EQUAL_OPERATOR = 20;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__FOLSPECIFICATION = RELATIONAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__FOR_ALLOPERATOR = RELATIONAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__NOT_OPERATOR = RELATIONAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__AND_OPERATOR = RELATIONAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__OR_OPERATOR = RELATIONAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__EXISTS_OPERATOR = RELATIONAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__FACTOR = RELATIONAL_OPERATOR__FACTOR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__LHS = RELATIONAL_OPERATOR__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR__RHS = RELATIONAL_OPERATOR__RHS;

	/**
	 * The number of structural features of the '<em>Greater Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR___EVALUATE_OPERATOR__OBJECT = RELATIONAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR___GUARANTEES__OPERATOR = RELATIONAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The number of operations of the '<em>Greater Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQUAL_OPERATOR_OPERATION_COUNT = RELATIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.LessEqualOperatorImpl <em>Less Equal Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.LessEqualOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLessEqualOperator()
	 * @generated
	 */
	int LESS_EQUAL_OPERATOR = 21;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__FOLSPECIFICATION = RELATIONAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__FOR_ALLOPERATOR = RELATIONAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__NOT_OPERATOR = RELATIONAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__AND_OPERATOR = RELATIONAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__OR_OPERATOR = RELATIONAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__EXISTS_OPERATOR = RELATIONAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__FACTOR = RELATIONAL_OPERATOR__FACTOR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__LHS = RELATIONAL_OPERATOR__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR__RHS = RELATIONAL_OPERATOR__RHS;

	/**
	 * The number of structural features of the '<em>Less Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR___EVALUATE_OPERATOR__OBJECT = RELATIONAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR___GUARANTEES__OPERATOR = RELATIONAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The number of operations of the '<em>Less Equal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQUAL_OPERATOR_OPERATION_COUNT = RELATIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.LessOperatorImpl <em>Less Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.LessOperatorImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLessOperator()
	 * @generated
	 */
	int LESS_OPERATOR = 22;

	/**
	 * The feature id for the '<em><b>Folspecification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__FOLSPECIFICATION = RELATIONAL_OPERATOR__FOLSPECIFICATION;

	/**
	 * The feature id for the '<em><b>For Alloperator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__FOR_ALLOPERATOR = RELATIONAL_OPERATOR__FOR_ALLOPERATOR;

	/**
	 * The feature id for the '<em><b>Not Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__NOT_OPERATOR = RELATIONAL_OPERATOR__NOT_OPERATOR;

	/**
	 * The feature id for the '<em><b>And Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__AND_OPERATOR = RELATIONAL_OPERATOR__AND_OPERATOR;

	/**
	 * The feature id for the '<em><b>Or Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__OR_OPERATOR = RELATIONAL_OPERATOR__OR_OPERATOR;

	/**
	 * The feature id for the '<em><b>Exists Operator</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__EXISTS_OPERATOR = RELATIONAL_OPERATOR__EXISTS_OPERATOR;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__FACTOR = RELATIONAL_OPERATOR__FACTOR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__LHS = RELATIONAL_OPERATOR__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR__RHS = RELATIONAL_OPERATOR__RHS;

	/**
	 * The number of structural features of the '<em>Less Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Operator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR___EVALUATE_OPERATOR__OBJECT = RELATIONAL_OPERATOR___EVALUATE_OPERATOR__OBJECT;

	/**
	 * The operation id for the '<em>Guarantees</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR___GUARANTEES__OPERATOR = RELATIONAL_OPERATOR___GUARANTEES__OPERATOR;

	/**
	 * The number of operations of the '<em>Less Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATOR_OPERATION_COUNT = RELATIONAL_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.AntipatternImpl <em>Antipattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.AntipatternImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAntipattern()
	 * @generated
	 */
	int ANTIPATTERN = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lola4raps Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN__LOLA4RAPS_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN__FORMULA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Antipattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Partial Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN___PARTIAL_DETECTION = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Parameters For Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Full Detection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN___FULL_DETECTION = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN___LOG = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN___CREATE_FORMULA = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Antipattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTIPATTERN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.LoLa4RAPSRootImpl <em>Lo La4 RAPS Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.LoLa4RAPSRootImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLoLa4RAPSRoot()
	 * @generated
	 */
	int LO_LA4_RAPS_ROOT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_LA4_RAPS_ROOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_LA4_RAPS_ROOT__REFACTORINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Antipatterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_LA4_RAPS_ROOT__ANTIPATTERNS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lo La4 RAPS Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_LA4_RAPS_ROOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lo La4 RAPS Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LO_LA4_RAPS_ROOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.AddActionImpl <em>Add Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.AddActionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAddAction()
	 * @generated
	 */
	int ADD_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__NUM_OF_CHANGES = ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__COST = ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__REFACTORING = ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__PARAMETERS = ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__PRE = ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__POST = ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION__MODEL = ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Add Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION___EXECUTE = ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION___LOG = ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION___SET_PARAMETERS = ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION___CREATE_PRE_CONDITION = ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION___CREATE_POST_CONDITION = ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Add Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.DeleteActionImpl <em>Delete Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.DeleteActionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getDeleteAction()
	 * @generated
	 */
	int DELETE_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__NUM_OF_CHANGES = ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__COST = ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__REFACTORING = ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__PARAMETERS = ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__PRE = ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__POST = ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION__MODEL = ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION___EXECUTE = ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION___LOG = ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION___SET_PARAMETERS = ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION___CREATE_PRE_CONDITION = ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION___CREATE_POST_CONDITION = ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Delete Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.MoveActionImpl <em>Move Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.MoveActionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getMoveAction()
	 * @generated
	 */
	int MOVE_ACTION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__NUM_OF_CHANGES = ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__COST = ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__REFACTORING = ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__PARAMETERS = ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__PRE = ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__POST = ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION__MODEL = ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION___EXECUTE = ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION___LOG = ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION___SET_PARAMETERS = ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION___CREATE_PRE_CONDITION = ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION___CREATE_POST_CONDITION = ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Move Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.impl.ChangeActionImpl <em>Change Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.impl.ChangeActionImpl
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getChangeAction()
	 * @generated
	 */
	int CHANGE_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Changes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__NUM_OF_CHANGES = ACTION__NUM_OF_CHANGES;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__COST = ACTION__COST;

	/**
	 * The feature id for the '<em><b>Refactoring</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__REFACTORING = ACTION__REFACTORING;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__PARAMETERS = ACTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__PRE = ACTION__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__POST = ACTION__POST;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION__MODEL = ACTION__MODEL;

	/**
	 * The number of structural features of the '<em>Change Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION___EXECUTE = ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION___LOG = ACTION___LOG;

	/**
	 * The operation id for the '<em>Set Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION___SET_PARAMETERS = ACTION___SET_PARAMETERS;

	/**
	 * The operation id for the '<em>Create Pre Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION___CREATE_PRE_CONDITION = ACTION___CREATE_PRE_CONDITION;

	/**
	 * The operation id for the '<em>Create Post Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION___CREATE_POST_CONDITION = ACTION___CREATE_POST_CONDITION;

	/**
	 * The number of operations of the '<em>Change Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link logicalSpecification.TypesEnum <em>Types Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logicalSpecification.TypesEnum
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getTypesEnum()
	 * @generated
	 */
	int TYPES_ENUM = 30;

	/**
	 * The meta object id for the '<em>model</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getmodel()
	 * @generated
	 */
	int MODEL = 31;


	/**
	 * Returns the meta object for class '{@link logicalSpecification.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see logicalSpecification.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see logicalSpecification.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.Refactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring</em>'.
	 * @see logicalSpecification.Refactoring
	 * @generated
	 */
	EClass getRefactoring();

	/**
	 * Returns the meta object for the containment reference list '{@link logicalSpecification.Refactoring#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see logicalSpecification.Refactoring#getActions()
	 * @see #getRefactoring()
	 * @generated
	 */
	EReference getRefactoring_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.Refactoring#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see logicalSpecification.Refactoring#getPre()
	 * @see #getRefactoring()
	 * @generated
	 */
	EReference getRefactoring_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.Refactoring#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see logicalSpecification.Refactoring#getPost()
	 * @see #getRefactoring()
	 * @generated
	 */
	EReference getRefactoring_Post();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Refactoring#getLola4rapsRoot <em>Lola4raps Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lola4raps Root</em>'.
	 * @see logicalSpecification.Refactoring#getLola4rapsRoot()
	 * @see #getRefactoring()
	 * @generated
	 */
	EReference getRefactoring_Lola4rapsRoot();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.Refactoring#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see logicalSpecification.Refactoring#getCost()
	 * @see #getRefactoring()
	 * @generated
	 */
	EAttribute getRefactoring_Cost();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.Refactoring#getNumOfChanges <em>Num Of Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Changes</em>'.
	 * @see logicalSpecification.Refactoring#getNumOfChanges()
	 * @see #getRefactoring()
	 * @generated
	 */
	EAttribute getRefactoring_NumOfChanges();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Refactoring#cloneRefactoring() <em>Clone Refactoring</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone Refactoring</em>' operation.
	 * @see logicalSpecification.Refactoring#cloneRefactoring()
	 * @generated
	 */
	EOperation getRefactoring__CloneRefactoring();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see logicalSpecification.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.Action#getNumOfChanges <em>Num Of Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Changes</em>'.
	 * @see logicalSpecification.Action#getNumOfChanges()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_NumOfChanges();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.Action#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see logicalSpecification.Action#getCost()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Cost();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Action#getRefactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Refactoring</em>'.
	 * @see logicalSpecification.Action#getRefactoring()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Refactoring();

	/**
	 * Returns the meta object for the containment reference list '{@link logicalSpecification.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see logicalSpecification.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.Action#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see logicalSpecification.Action#getPre()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.Action#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see logicalSpecification.Action#getPost()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Post();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.Action#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see logicalSpecification.Action#getModel()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Model();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Action#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see logicalSpecification.Action#execute()
	 * @generated
	 */
	EOperation getAction__Execute();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Action#log() <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see logicalSpecification.Action#log()
	 * @generated
	 */
	EOperation getAction__Log();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Action#setParameters() <em>Set Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters</em>' operation.
	 * @see logicalSpecification.Action#setParameters()
	 * @generated
	 */
	EOperation getAction__SetParameters();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Action#createPreCondition() <em>Create Pre Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Pre Condition</em>' operation.
	 * @see logicalSpecification.Action#createPreCondition()
	 * @generated
	 */
	EOperation getAction__CreatePreCondition();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Action#createPostCondition() <em>Create Post Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Post Condition</em>' operation.
	 * @see logicalSpecification.Action#createPostCondition()
	 * @generated
	 */
	EOperation getAction__CreatePostCondition();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.SingleValuedParameter <em>Single Valued Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Valued Parameter</em>'.
	 * @see logicalSpecification.SingleValuedParameter
	 * @generated
	 */
	EClass getSingleValuedParameter();

	/**
	 * Returns the meta object for the reference list '{@link logicalSpecification.SingleValuedParameter#getExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exists Operator</em>'.
	 * @see logicalSpecification.SingleValuedParameter#getExistsOperator()
	 * @see #getSingleValuedParameter()
	 * @generated
	 */
	EReference getSingleValuedParameter_ExistsOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.MultipleValuedParameter <em>Multiple Valued Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Valued Parameter</em>'.
	 * @see logicalSpecification.MultipleValuedParameter
	 * @generated
	 */
	EClass getMultipleValuedParameter();

	/**
	 * Returns the meta object for the reference list '{@link logicalSpecification.MultipleValuedParameter#getForAllOperator <em>For All Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>For All Operator</em>'.
	 * @see logicalSpecification.MultipleValuedParameter#getForAllOperator()
	 * @see #getMultipleValuedParameter()
	 * @generated
	 */
	EReference getMultipleValuedParameter_ForAllOperator();

	/**
	 * Returns the meta object for the reference list '{@link logicalSpecification.MultipleValuedParameter#getExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exists Operator</em>'.
	 * @see logicalSpecification.MultipleValuedParameter#getExistsOperator()
	 * @see #getMultipleValuedParameter()
	 * @generated
	 */
	EReference getMultipleValuedParameter_ExistsOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see logicalSpecification.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see logicalSpecification.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Parameter#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Action</em>'.
	 * @see logicalSpecification.Parameter#getAction()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Action();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.Parameter#getResolvingExpr <em>Resolving Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolving Expr</em>'.
	 * @see logicalSpecification.Parameter#getResolvingExpr()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ResolvingExpr();

	/**
	 * Returns the meta object for the reference list '{@link logicalSpecification.Parameter#getLhsRelationalOperator <em>Lhs Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lhs Relational Operator</em>'.
	 * @see logicalSpecification.Parameter#getLhsRelationalOperator()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_LhsRelationalOperator();

	/**
	 * Returns the meta object for the reference list '{@link logicalSpecification.Parameter#getRhsRelationalOperator <em>Rhs Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rhs Relational Operator</em>'.
	 * @see logicalSpecification.Parameter#getRhsRelationalOperator()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_RhsRelationalOperator();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Parameter#getAntipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Antipattern</em>'.
	 * @see logicalSpecification.Parameter#getAntipattern()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Antipattern();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see logicalSpecification.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.Condition#getConditionFormula <em>Condition Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Formula</em>'.
	 * @see logicalSpecification.Condition#getConditionFormula()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ConditionFormula();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see logicalSpecification.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.PreCondition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Action</em>'.
	 * @see logicalSpecification.PreCondition#getAction()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_Action();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.PreCondition#getRefactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Refactoring</em>'.
	 * @see logicalSpecification.PreCondition#getRefactoring()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_Refactoring();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Condition</em>'.
	 * @see logicalSpecification.PostCondition
	 * @generated
	 */
	EClass getPostCondition();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.PostCondition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Action</em>'.
	 * @see logicalSpecification.PostCondition#getAction()
	 * @see #getPostCondition()
	 * @generated
	 */
	EReference getPostCondition_Action();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.PostCondition#getRefactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Refactoring</em>'.
	 * @see logicalSpecification.PostCondition#getRefactoring()
	 * @see #getPostCondition()
	 * @generated
	 */
	EReference getPostCondition_Refactoring();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.FOLSpecification <em>FOL Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FOL Specification</em>'.
	 * @see logicalSpecification.FOLSpecification
	 * @generated
	 */
	EClass getFOLSpecification();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.FOLSpecification#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Condition</em>'.
	 * @see logicalSpecification.FOLSpecification#getCondition()
	 * @see #getFOLSpecification()
	 * @generated
	 */
	EReference getFOLSpecification_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.FOLSpecification#getRootOperator <em>Root Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Operator</em>'.
	 * @see logicalSpecification.FOLSpecification#getRootOperator()
	 * @see #getFOLSpecification()
	 * @generated
	 */
	EReference getFOLSpecification_RootOperator();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.FOLSpecification#getAntipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Antipattern</em>'.
	 * @see logicalSpecification.FOLSpecification#getAntipattern()
	 * @see #getFOLSpecification()
	 * @generated
	 */
	EReference getFOLSpecification_Antipattern();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see logicalSpecification.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.LogicalOperator#guarantees(logicalSpecification.Operator) <em>Guarantees</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Guarantees</em>' operation.
	 * @see logicalSpecification.LogicalOperator#guarantees(logicalSpecification.Operator)
	 * @generated
	 */
	EOperation getLogicalOperator__Guarantees__Operator();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.LogicalOperator#evaluateOperator(logicalSpecification.Operator) <em>Evaluate Operator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate Operator</em>' operation.
	 * @see logicalSpecification.LogicalOperator#evaluateOperator(logicalSpecification.Operator)
	 * @generated
	 */
	EOperation getLogicalOperator__EvaluateOperator__Operator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.VoidOperator <em>Void Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Operator</em>'.
	 * @see logicalSpecification.VoidOperator
	 * @generated
	 */
	EClass getVoidOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.ForAllOperator <em>For All Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All Operator</em>'.
	 * @see logicalSpecification.ForAllOperator
	 * @generated
	 */
	EClass getForAllOperator();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.ForAllOperator#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see logicalSpecification.ForAllOperator#getCollection()
	 * @see #getForAllOperator()
	 * @generated
	 */
	EReference getForAllOperator_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.ForAllOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see logicalSpecification.ForAllOperator#getArgument()
	 * @see #getForAllOperator()
	 * @generated
	 */
	EReference getForAllOperator_Argument();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.ExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists Operator</em>'.
	 * @see logicalSpecification.ExistsOperator
	 * @generated
	 */
	EClass getExistsOperator();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.ExistsOperator#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see logicalSpecification.ExistsOperator#getElement()
	 * @see #getExistsOperator()
	 * @generated
	 */
	EReference getExistsOperator_Element();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.ExistsOperator#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see logicalSpecification.ExistsOperator#getCollection()
	 * @see #getExistsOperator()
	 * @generated
	 */
	EReference getExistsOperator_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.ExistsOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see logicalSpecification.ExistsOperator#getArgument()
	 * @see #getExistsOperator()
	 * @generated
	 */
	EReference getExistsOperator_Argument();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.OrOperator <em>Or Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Operator</em>'.
	 * @see logicalSpecification.OrOperator
	 * @generated
	 */
	EClass getOrOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link logicalSpecification.OrOperator#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see logicalSpecification.OrOperator#getArguments()
	 * @see #getOrOperator()
	 * @generated
	 */
	EReference getOrOperator_Arguments();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.NotOperator <em>Not Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Operator</em>'.
	 * @see logicalSpecification.NotOperator
	 * @generated
	 */
	EClass getNotOperator();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.NotOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see logicalSpecification.NotOperator#getArgument()
	 * @see #getNotOperator()
	 * @generated
	 */
	EReference getNotOperator_Argument();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.AndOperator <em>And Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Operator</em>'.
	 * @see logicalSpecification.AndOperator
	 * @generated
	 */
	EClass getAndOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link logicalSpecification.AndOperator#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see logicalSpecification.AndOperator#getArguments()
	 * @see #getAndOperator()
	 * @generated
	 */
	EReference getAndOperator_Arguments();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Operator</em>'.
	 * @see logicalSpecification.RelationalOperator
	 * @generated
	 */
	EClass getRelationalOperator();

	/**
	 * Returns the meta object for the attribute '{@link logicalSpecification.RelationalOperator#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see logicalSpecification.RelationalOperator#getFactor()
	 * @see #getRelationalOperator()
	 * @generated
	 */
	EAttribute getRelationalOperator_Factor();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.RelationalOperator#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see logicalSpecification.RelationalOperator#getLhs()
	 * @see #getRelationalOperator()
	 * @generated
	 */
	EReference getRelationalOperator_Lhs();

	/**
	 * Returns the meta object for the reference '{@link logicalSpecification.RelationalOperator#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see logicalSpecification.RelationalOperator#getRhs()
	 * @see #getRelationalOperator()
	 * @generated
	 */
	EReference getRelationalOperator_Rhs();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.EqualOperator <em>Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Operator</em>'.
	 * @see logicalSpecification.EqualOperator
	 * @generated
	 */
	EClass getEqualOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.GreaterOperator <em>Greater Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Operator</em>'.
	 * @see logicalSpecification.GreaterOperator
	 * @generated
	 */
	EClass getGreaterOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.GreaterEqualOperator <em>Greater Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Equal Operator</em>'.
	 * @see logicalSpecification.GreaterEqualOperator
	 * @generated
	 */
	EClass getGreaterEqualOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.LessEqualOperator <em>Less Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Equal Operator</em>'.
	 * @see logicalSpecification.LessEqualOperator
	 * @generated
	 */
	EClass getLessEqualOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.LessOperator <em>Less Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Operator</em>'.
	 * @see logicalSpecification.LessOperator
	 * @generated
	 */
	EClass getLessOperator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see logicalSpecification.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Operator#getFolspecification <em>Folspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Folspecification</em>'.
	 * @see logicalSpecification.Operator#getFolspecification()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Folspecification();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Operator#getForAlloperator <em>For Alloperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>For Alloperator</em>'.
	 * @see logicalSpecification.Operator#getForAlloperator()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_ForAlloperator();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Operator#getNotOperator <em>Not Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Not Operator</em>'.
	 * @see logicalSpecification.Operator#getNotOperator()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_NotOperator();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Operator#getAndOperator <em>And Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>And Operator</em>'.
	 * @see logicalSpecification.Operator#getAndOperator()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_AndOperator();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Operator#getOrOperator <em>Or Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Or Operator</em>'.
	 * @see logicalSpecification.Operator#getOrOperator()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_OrOperator();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Operator#getExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Exists Operator</em>'.
	 * @see logicalSpecification.Operator#getExistsOperator()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_ExistsOperator();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Operator#evaluateOperator(java.lang.Object) <em>Evaluate Operator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate Operator</em>' operation.
	 * @see logicalSpecification.Operator#evaluateOperator(java.lang.Object)
	 * @generated
	 */
	EOperation getOperator__EvaluateOperator__Object();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Operator#guarantees(logicalSpecification.Operator) <em>Guarantees</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Guarantees</em>' operation.
	 * @see logicalSpecification.Operator#guarantees(logicalSpecification.Operator)
	 * @generated
	 */
	EOperation getOperator__Guarantees__Operator();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.Antipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antipattern</em>'.
	 * @see logicalSpecification.Antipattern
	 * @generated
	 */
	EClass getAntipattern();

	/**
	 * Returns the meta object for the container reference '{@link logicalSpecification.Antipattern#getLola4rapsRoot <em>Lola4raps Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Lola4raps Root</em>'.
	 * @see logicalSpecification.Antipattern#getLola4rapsRoot()
	 * @see #getAntipattern()
	 * @generated
	 */
	EReference getAntipattern_Lola4rapsRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link logicalSpecification.Antipattern#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see logicalSpecification.Antipattern#getParameters()
	 * @see #getAntipattern()
	 * @generated
	 */
	EReference getAntipattern_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link logicalSpecification.Antipattern#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see logicalSpecification.Antipattern#getFormula()
	 * @see #getAntipattern()
	 * @generated
	 */
	EReference getAntipattern_Formula();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Antipattern#setParametersForPartialDetection() <em>Set Parameters For Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Partial Detection</em>' operation.
	 * @see logicalSpecification.Antipattern#setParametersForPartialDetection()
	 * @generated
	 */
	EOperation getAntipattern__SetParametersForPartialDetection();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Antipattern#partialDetection() <em>Partial Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Partial Detection</em>' operation.
	 * @see logicalSpecification.Antipattern#partialDetection()
	 * @generated
	 */
	EOperation getAntipattern__PartialDetection();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Antipattern#setParametersForFullDetection() <em>Set Parameters For Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Parameters For Full Detection</em>' operation.
	 * @see logicalSpecification.Antipattern#setParametersForFullDetection()
	 * @generated
	 */
	EOperation getAntipattern__SetParametersForFullDetection();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Antipattern#fullDetection() <em>Full Detection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Full Detection</em>' operation.
	 * @see logicalSpecification.Antipattern#fullDetection()
	 * @generated
	 */
	EOperation getAntipattern__FullDetection();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Antipattern#log() <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see logicalSpecification.Antipattern#log()
	 * @generated
	 */
	EOperation getAntipattern__Log();

	/**
	 * Returns the meta object for the '{@link logicalSpecification.Antipattern#createFormula() <em>Create Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Formula</em>' operation.
	 * @see logicalSpecification.Antipattern#createFormula()
	 * @generated
	 */
	EOperation getAntipattern__CreateFormula();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.LoLa4RAPSRoot <em>Lo La4 RAPS Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lo La4 RAPS Root</em>'.
	 * @see logicalSpecification.LoLa4RAPSRoot
	 * @generated
	 */
	EClass getLoLa4RAPSRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link logicalSpecification.LoLa4RAPSRoot#getRefactorings <em>Refactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refactorings</em>'.
	 * @see logicalSpecification.LoLa4RAPSRoot#getRefactorings()
	 * @see #getLoLa4RAPSRoot()
	 * @generated
	 */
	EReference getLoLa4RAPSRoot_Refactorings();

	/**
	 * Returns the meta object for the containment reference list '{@link logicalSpecification.LoLa4RAPSRoot#getAntipatterns <em>Antipatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Antipatterns</em>'.
	 * @see logicalSpecification.LoLa4RAPSRoot#getAntipatterns()
	 * @see #getLoLa4RAPSRoot()
	 * @generated
	 */
	EReference getLoLa4RAPSRoot_Antipatterns();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.AddAction <em>Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Action</em>'.
	 * @see logicalSpecification.AddAction
	 * @generated
	 */
	EClass getAddAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Action</em>'.
	 * @see logicalSpecification.DeleteAction
	 * @generated
	 */
	EClass getDeleteAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.MoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Action</em>'.
	 * @see logicalSpecification.MoveAction
	 * @generated
	 */
	EClass getMoveAction();

	/**
	 * Returns the meta object for class '{@link logicalSpecification.ChangeAction <em>Change Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Action</em>'.
	 * @see logicalSpecification.ChangeAction
	 * @generated
	 */
	EClass getChangeAction();

	/**
	 * Returns the meta object for enum '{@link logicalSpecification.TypesEnum <em>Types Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Types Enum</em>'.
	 * @see logicalSpecification.TypesEnum
	 * @generated
	 */
	EEnum getTypesEnum();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>model</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getmodel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicalSpecificationFactory getLogicalSpecificationFactory();

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
		 * The meta object literal for the '{@link logicalSpecification.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.NamedElementImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.RefactoringImpl <em>Refactoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.RefactoringImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getRefactoring()
		 * @generated
		 */
		EClass REFACTORING = eINSTANCE.getRefactoring();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFACTORING__ACTIONS = eINSTANCE.getRefactoring_Actions();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFACTORING__PRE = eINSTANCE.getRefactoring_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFACTORING__POST = eINSTANCE.getRefactoring_Post();

		/**
		 * The meta object literal for the '<em><b>Lola4raps Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFACTORING__LOLA4RAPS_ROOT = eINSTANCE.getRefactoring_Lola4rapsRoot();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING__COST = eINSTANCE.getRefactoring_Cost();

		/**
		 * The meta object literal for the '<em><b>Num Of Changes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING__NUM_OF_CHANGES = eINSTANCE.getRefactoring_NumOfChanges();

		/**
		 * The meta object literal for the '<em><b>Clone Refactoring</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFACTORING___CLONE_REFACTORING = eINSTANCE.getRefactoring__CloneRefactoring();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.ActionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Num Of Changes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NUM_OF_CHANGES = eINSTANCE.getAction_NumOfChanges();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__COST = eINSTANCE.getAction_Cost();

		/**
		 * The meta object literal for the '<em><b>Refactoring</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__REFACTORING = eINSTANCE.getAction_Refactoring();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PRE = eINSTANCE.getAction_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__POST = eINSTANCE.getAction_Post();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__MODEL = eINSTANCE.getAction_Model();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___EXECUTE = eINSTANCE.getAction__Execute();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___LOG = eINSTANCE.getAction__Log();

		/**
		 * The meta object literal for the '<em><b>Set Parameters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___SET_PARAMETERS = eINSTANCE.getAction__SetParameters();

		/**
		 * The meta object literal for the '<em><b>Create Pre Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CREATE_PRE_CONDITION = eINSTANCE.getAction__CreatePreCondition();

		/**
		 * The meta object literal for the '<em><b>Create Post Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___CREATE_POST_CONDITION = eINSTANCE.getAction__CreatePostCondition();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.SingleValuedParameterImpl <em>Single Valued Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.SingleValuedParameterImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getSingleValuedParameter()
		 * @generated
		 */
		EClass SINGLE_VALUED_PARAMETER = eINSTANCE.getSingleValuedParameter();

		/**
		 * The meta object literal for the '<em><b>Exists Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VALUED_PARAMETER__EXISTS_OPERATOR = eINSTANCE.getSingleValuedParameter_ExistsOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.MultipleValuedParameterImpl <em>Multiple Valued Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.MultipleValuedParameterImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getMultipleValuedParameter()
		 * @generated
		 */
		EClass MULTIPLE_VALUED_PARAMETER = eINSTANCE.getMultipleValuedParameter();

		/**
		 * The meta object literal for the '<em><b>For All Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR = eINSTANCE.getMultipleValuedParameter_ForAllOperator();

		/**
		 * The meta object literal for the '<em><b>Exists Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR = eINSTANCE.getMultipleValuedParameter_ExistsOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.ParameterImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__ACTION = eINSTANCE.getParameter_Action();

		/**
		 * The meta object literal for the '<em><b>Resolving Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__RESOLVING_EXPR = eINSTANCE.getParameter_ResolvingExpr();

		/**
		 * The meta object literal for the '<em><b>Lhs Relational Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__LHS_RELATIONAL_OPERATOR = eINSTANCE.getParameter_LhsRelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Rhs Relational Operator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__RHS_RELATIONAL_OPERATOR = eINSTANCE.getParameter_RhsRelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Antipattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__ANTIPATTERN = eINSTANCE.getParameter_Antipattern();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.ConditionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION_FORMULA = eINSTANCE.getCondition_ConditionFormula();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.PreConditionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__ACTION = eINSTANCE.getPreCondition_Action();

		/**
		 * The meta object literal for the '<em><b>Refactoring</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__REFACTORING = eINSTANCE.getPreCondition_Refactoring();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.PostConditionImpl <em>Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.PostConditionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getPostCondition()
		 * @generated
		 */
		EClass POST_CONDITION = eINSTANCE.getPostCondition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_CONDITION__ACTION = eINSTANCE.getPostCondition_Action();

		/**
		 * The meta object literal for the '<em><b>Refactoring</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_CONDITION__REFACTORING = eINSTANCE.getPostCondition_Refactoring();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.FOLSpecificationImpl <em>FOL Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.FOLSpecificationImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getFOLSpecification()
		 * @generated
		 */
		EClass FOL_SPECIFICATION = eINSTANCE.getFOLSpecification();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOL_SPECIFICATION__CONDITION = eINSTANCE.getFOLSpecification_Condition();

		/**
		 * The meta object literal for the '<em><b>Root Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOL_SPECIFICATION__ROOT_OPERATOR = eINSTANCE.getFOLSpecification_RootOperator();

		/**
		 * The meta object literal for the '<em><b>Antipattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOL_SPECIFICATION__ANTIPATTERN = eINSTANCE.getFOLSpecification_Antipattern();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.LogicalOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Guarantees</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGICAL_OPERATOR___GUARANTEES__OPERATOR = eINSTANCE.getLogicalOperator__Guarantees__Operator();

		/**
		 * The meta object literal for the '<em><b>Evaluate Operator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR = eINSTANCE.getLogicalOperator__EvaluateOperator__Operator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.VoidOperatorImpl <em>Void Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.VoidOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getVoidOperator()
		 * @generated
		 */
		EClass VOID_OPERATOR = eINSTANCE.getVoidOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.ForAllOperatorImpl <em>For All Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.ForAllOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getForAllOperator()
		 * @generated
		 */
		EClass FOR_ALL_OPERATOR = eINSTANCE.getForAllOperator();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ALL_OPERATOR__COLLECTION = eINSTANCE.getForAllOperator_Collection();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ALL_OPERATOR__ARGUMENT = eINSTANCE.getForAllOperator_Argument();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.ExistsOperatorImpl <em>Exists Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.ExistsOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getExistsOperator()
		 * @generated
		 */
		EClass EXISTS_OPERATOR = eINSTANCE.getExistsOperator();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTS_OPERATOR__ELEMENT = eINSTANCE.getExistsOperator_Element();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTS_OPERATOR__COLLECTION = eINSTANCE.getExistsOperator_Collection();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTS_OPERATOR__ARGUMENT = eINSTANCE.getExistsOperator_Argument();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.OrOperatorImpl <em>Or Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.OrOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getOrOperator()
		 * @generated
		 */
		EClass OR_OPERATOR = eINSTANCE.getOrOperator();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_OPERATOR__ARGUMENTS = eINSTANCE.getOrOperator_Arguments();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.NotOperatorImpl <em>Not Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.NotOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getNotOperator()
		 * @generated
		 */
		EClass NOT_OPERATOR = eINSTANCE.getNotOperator();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_OPERATOR__ARGUMENT = eINSTANCE.getNotOperator_Argument();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.AndOperatorImpl <em>And Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.AndOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAndOperator()
		 * @generated
		 */
		EClass AND_OPERATOR = eINSTANCE.getAndOperator();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_OPERATOR__ARGUMENTS = eINSTANCE.getAndOperator_Arguments();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.RelationalOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EClass RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_OPERATOR__FACTOR = eINSTANCE.getRelationalOperator_Factor();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_OPERATOR__LHS = eINSTANCE.getRelationalOperator_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_OPERATOR__RHS = eINSTANCE.getRelationalOperator_Rhs();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.EqualOperatorImpl <em>Equal Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.EqualOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getEqualOperator()
		 * @generated
		 */
		EClass EQUAL_OPERATOR = eINSTANCE.getEqualOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.GreaterOperatorImpl <em>Greater Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.GreaterOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getGreaterOperator()
		 * @generated
		 */
		EClass GREATER_OPERATOR = eINSTANCE.getGreaterOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.GreaterEqualOperatorImpl <em>Greater Equal Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.GreaterEqualOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getGreaterEqualOperator()
		 * @generated
		 */
		EClass GREATER_EQUAL_OPERATOR = eINSTANCE.getGreaterEqualOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.LessEqualOperatorImpl <em>Less Equal Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.LessEqualOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLessEqualOperator()
		 * @generated
		 */
		EClass LESS_EQUAL_OPERATOR = eINSTANCE.getLessEqualOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.LessOperatorImpl <em>Less Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.LessOperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLessOperator()
		 * @generated
		 */
		EClass LESS_OPERATOR = eINSTANCE.getLessOperator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.OperatorImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Folspecification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__FOLSPECIFICATION = eINSTANCE.getOperator_Folspecification();

		/**
		 * The meta object literal for the '<em><b>For Alloperator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__FOR_ALLOPERATOR = eINSTANCE.getOperator_ForAlloperator();

		/**
		 * The meta object literal for the '<em><b>Not Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__NOT_OPERATOR = eINSTANCE.getOperator_NotOperator();

		/**
		 * The meta object literal for the '<em><b>And Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__AND_OPERATOR = eINSTANCE.getOperator_AndOperator();

		/**
		 * The meta object literal for the '<em><b>Or Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__OR_OPERATOR = eINSTANCE.getOperator_OrOperator();

		/**
		 * The meta object literal for the '<em><b>Exists Operator</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__EXISTS_OPERATOR = eINSTANCE.getOperator_ExistsOperator();

		/**
		 * The meta object literal for the '<em><b>Evaluate Operator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___EVALUATE_OPERATOR__OBJECT = eINSTANCE.getOperator__EvaluateOperator__Object();

		/**
		 * The meta object literal for the '<em><b>Guarantees</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATOR___GUARANTEES__OPERATOR = eINSTANCE.getOperator__Guarantees__Operator();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.AntipatternImpl <em>Antipattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.AntipatternImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAntipattern()
		 * @generated
		 */
		EClass ANTIPATTERN = eINSTANCE.getAntipattern();

		/**
		 * The meta object literal for the '<em><b>Lola4raps Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTIPATTERN__LOLA4RAPS_ROOT = eINSTANCE.getAntipattern_Lola4rapsRoot();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTIPATTERN__PARAMETERS = eINSTANCE.getAntipattern_Parameters();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTIPATTERN__FORMULA = eINSTANCE.getAntipattern_Formula();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION = eINSTANCE.getAntipattern__SetParametersForPartialDetection();

		/**
		 * The meta object literal for the '<em><b>Partial Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANTIPATTERN___PARTIAL_DETECTION = eINSTANCE.getAntipattern__PartialDetection();

		/**
		 * The meta object literal for the '<em><b>Set Parameters For Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION = eINSTANCE.getAntipattern__SetParametersForFullDetection();

		/**
		 * The meta object literal for the '<em><b>Full Detection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANTIPATTERN___FULL_DETECTION = eINSTANCE.getAntipattern__FullDetection();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANTIPATTERN___LOG = eINSTANCE.getAntipattern__Log();

		/**
		 * The meta object literal for the '<em><b>Create Formula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANTIPATTERN___CREATE_FORMULA = eINSTANCE.getAntipattern__CreateFormula();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.LoLa4RAPSRootImpl <em>Lo La4 RAPS Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.LoLa4RAPSRootImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getLoLa4RAPSRoot()
		 * @generated
		 */
		EClass LO_LA4_RAPS_ROOT = eINSTANCE.getLoLa4RAPSRoot();

		/**
		 * The meta object literal for the '<em><b>Refactorings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_LA4_RAPS_ROOT__REFACTORINGS = eINSTANCE.getLoLa4RAPSRoot_Refactorings();

		/**
		 * The meta object literal for the '<em><b>Antipatterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LO_LA4_RAPS_ROOT__ANTIPATTERNS = eINSTANCE.getLoLa4RAPSRoot_Antipatterns();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.AddActionImpl <em>Add Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.AddActionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getAddAction()
		 * @generated
		 */
		EClass ADD_ACTION = eINSTANCE.getAddAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.DeleteActionImpl <em>Delete Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.DeleteActionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getDeleteAction()
		 * @generated
		 */
		EClass DELETE_ACTION = eINSTANCE.getDeleteAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.MoveActionImpl <em>Move Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.MoveActionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getMoveAction()
		 * @generated
		 */
		EClass MOVE_ACTION = eINSTANCE.getMoveAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.impl.ChangeActionImpl <em>Change Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.impl.ChangeActionImpl
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getChangeAction()
		 * @generated
		 */
		EClass CHANGE_ACTION = eINSTANCE.getChangeAction();

		/**
		 * The meta object literal for the '{@link logicalSpecification.TypesEnum <em>Types Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logicalSpecification.TypesEnum
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getTypesEnum()
		 * @generated
		 */
		EEnum TYPES_ENUM = eINSTANCE.getTypesEnum();

		/**
		 * The meta object literal for the '<em>model</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see logicalSpecification.impl.LogicalSpecificationPackageImpl#getmodel()
		 * @generated
		 */
		EDataType MODEL = eINSTANCE.getmodel();

	}

} //LogicalSpecificationPackage
