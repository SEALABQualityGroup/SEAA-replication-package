/**
 */
package logicalSpecification.impl;

import logicalSpecification.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalSpecificationFactoryImpl extends EFactoryImpl implements LogicalSpecificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicalSpecificationFactory init() {
		try {
			LogicalSpecificationFactory theLogicalSpecificationFactory = (LogicalSpecificationFactory)EPackage.Registry.INSTANCE.getEFactory(LogicalSpecificationPackage.eNS_URI);
			if (theLogicalSpecificationFactory != null) {
				return theLogicalSpecificationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicalSpecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSpecificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogicalSpecificationPackage.REFACTORING: return createRefactoring();
			case LogicalSpecificationPackage.ACTION: return createAction();
			case LogicalSpecificationPackage.SINGLE_VALUED_PARAMETER: return createSingleValuedParameter();
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER: return createMultipleValuedParameter();
			case LogicalSpecificationPackage.PRE_CONDITION: return createPreCondition();
			case LogicalSpecificationPackage.POST_CONDITION: return createPostCondition();
			case LogicalSpecificationPackage.FOL_SPECIFICATION: return createFOLSpecification();
			case LogicalSpecificationPackage.VOID_OPERATOR: return createVoidOperator();
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR: return createForAllOperator();
			case LogicalSpecificationPackage.EXISTS_OPERATOR: return createExistsOperator();
			case LogicalSpecificationPackage.OR_OPERATOR: return createOrOperator();
			case LogicalSpecificationPackage.NOT_OPERATOR: return createNotOperator();
			case LogicalSpecificationPackage.AND_OPERATOR: return createAndOperator();
			case LogicalSpecificationPackage.EQUAL_OPERATOR: return createEqualOperator();
			case LogicalSpecificationPackage.GREATER_OPERATOR: return createGreaterOperator();
			case LogicalSpecificationPackage.GREATER_EQUAL_OPERATOR: return createGreaterEqualOperator();
			case LogicalSpecificationPackage.LESS_EQUAL_OPERATOR: return createLessEqualOperator();
			case LogicalSpecificationPackage.LESS_OPERATOR: return createLessOperator();
			case LogicalSpecificationPackage.ANTIPATTERN: return createAntipattern();
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT: return createLoLa4RAPSRoot();
			case LogicalSpecificationPackage.ADD_ACTION: return createAddAction();
			case LogicalSpecificationPackage.DELETE_ACTION: return createDeleteAction();
			case LogicalSpecificationPackage.MOVE_ACTION: return createMoveAction();
			case LogicalSpecificationPackage.CHANGE_ACTION: return createChangeAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LogicalSpecificationPackage.TYPES_ENUM:
				return createTypesEnumFromString(eDataType, initialValue);
			case LogicalSpecificationPackage.MODEL:
				return createmodelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LogicalSpecificationPackage.TYPES_ENUM:
				return convertTypesEnumToString(eDataType, instanceValue);
			case LogicalSpecificationPackage.MODEL:
				return convertmodelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring createRefactoring() {
		RefactoringImpl refactoring = new RefactoringImpl();
		return refactoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter createSingleValuedParameter() {
		SingleValuedParameterImpl singleValuedParameter = new SingleValuedParameterImpl();
		return singleValuedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter createMultipleValuedParameter() {
		MultipleValuedParameterImpl multipleValuedParameter = new MultipleValuedParameterImpl();
		return multipleValuedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition createPreCondition() {
		PreConditionImpl preCondition = new PreConditionImpl();
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostCondition createPostCondition() {
		PostConditionImpl postCondition = new PostConditionImpl();
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOLSpecification createFOLSpecification() {
		FOLSpecificationImpl folSpecification = new FOLSpecificationImpl();
		return folSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidOperator createVoidOperator() {
		VoidOperatorImpl voidOperator = new VoidOperatorImpl();
		return voidOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllOperator createForAllOperator() {
		ForAllOperatorImpl forAllOperator = new ForAllOperatorImpl();
		return forAllOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsOperator createExistsOperator() {
		ExistsOperatorImpl existsOperator = new ExistsOperatorImpl();
		return existsOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrOperator createOrOperator() {
		OrOperatorImpl orOperator = new OrOperatorImpl();
		return orOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOperator createNotOperator() {
		NotOperatorImpl notOperator = new NotOperatorImpl();
		return notOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndOperator createAndOperator() {
		AndOperatorImpl andOperator = new AndOperatorImpl();
		return andOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualOperator createEqualOperator() {
		EqualOperatorImpl equalOperator = new EqualOperatorImpl();
		return equalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterOperator createGreaterOperator() {
		GreaterOperatorImpl greaterOperator = new GreaterOperatorImpl();
		return greaterOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterEqualOperator createGreaterEqualOperator() {
		GreaterEqualOperatorImpl greaterEqualOperator = new GreaterEqualOperatorImpl();
		return greaterEqualOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessEqualOperator createLessEqualOperator() {
		LessEqualOperatorImpl lessEqualOperator = new LessEqualOperatorImpl();
		return lessEqualOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessOperator createLessOperator() {
		LessOperatorImpl lessOperator = new LessOperatorImpl();
		return lessOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antipattern createAntipattern() {
		AntipatternImpl antipattern = new AntipatternImpl();
		return antipattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoLa4RAPSRoot createLoLa4RAPSRoot() {
		LoLa4RAPSRootImpl loLa4RAPSRoot = new LoLa4RAPSRootImpl();
		return loLa4RAPSRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAction createAddAction() {
		AddActionImpl addAction = new AddActionImpl();
		return addAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAction createDeleteAction() {
		DeleteActionImpl deleteAction = new DeleteActionImpl();
		return deleteAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveAction createMoveAction() {
		MoveActionImpl moveAction = new MoveActionImpl();
		return moveAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAction createChangeAction() {
		ChangeActionImpl changeAction = new ChangeActionImpl();
		return changeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesEnum createTypesEnumFromString(EDataType eDataType, String initialValue) {
		TypesEnum result = TypesEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypesEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createmodelFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmodelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSpecificationPackage getLogicalSpecificationPackage() {
		return (LogicalSpecificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicalSpecificationPackage getPackage() {
		return LogicalSpecificationPackage.eINSTANCE;
	}

} //LogicalSpecificationFactoryImpl
