/**
 */
package logicalSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.LogicalSpecificationPackage
 * @generated
 */
public interface LogicalSpecificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicalSpecificationFactory eINSTANCE = logicalSpecification.impl.LogicalSpecificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refactoring</em>'.
	 * @generated
	 */
	Refactoring createRefactoring();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Single Valued Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Valued Parameter</em>'.
	 * @generated
	 */
	SingleValuedParameter createSingleValuedParameter();

	/**
	 * Returns a new object of class '<em>Multiple Valued Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Valued Parameter</em>'.
	 * @generated
	 */
	MultipleValuedParameter createMultipleValuedParameter();

	/**
	 * Returns a new object of class '<em>Pre Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Condition</em>'.
	 * @generated
	 */
	PreCondition createPreCondition();

	/**
	 * Returns a new object of class '<em>Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Condition</em>'.
	 * @generated
	 */
	PostCondition createPostCondition();

	/**
	 * Returns a new object of class '<em>FOL Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FOL Specification</em>'.
	 * @generated
	 */
	FOLSpecification createFOLSpecification();

	/**
	 * Returns a new object of class '<em>Void Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Operator</em>'.
	 * @generated
	 */
	VoidOperator createVoidOperator();

	/**
	 * Returns a new object of class '<em>For All Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For All Operator</em>'.
	 * @generated
	 */
	ForAllOperator createForAllOperator();

	/**
	 * Returns a new object of class '<em>Exists Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exists Operator</em>'.
	 * @generated
	 */
	ExistsOperator createExistsOperator();

	/**
	 * Returns a new object of class '<em>Or Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Operator</em>'.
	 * @generated
	 */
	OrOperator createOrOperator();

	/**
	 * Returns a new object of class '<em>Not Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Operator</em>'.
	 * @generated
	 */
	NotOperator createNotOperator();

	/**
	 * Returns a new object of class '<em>And Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Operator</em>'.
	 * @generated
	 */
	AndOperator createAndOperator();

	/**
	 * Returns a new object of class '<em>Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equal Operator</em>'.
	 * @generated
	 */
	EqualOperator createEqualOperator();

	/**
	 * Returns a new object of class '<em>Greater Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Operator</em>'.
	 * @generated
	 */
	GreaterOperator createGreaterOperator();

	/**
	 * Returns a new object of class '<em>Greater Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Equal Operator</em>'.
	 * @generated
	 */
	GreaterEqualOperator createGreaterEqualOperator();

	/**
	 * Returns a new object of class '<em>Less Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Equal Operator</em>'.
	 * @generated
	 */
	LessEqualOperator createLessEqualOperator();

	/**
	 * Returns a new object of class '<em>Less Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Less Operator</em>'.
	 * @generated
	 */
	LessOperator createLessOperator();

	/**
	 * Returns a new object of class '<em>Antipattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Antipattern</em>'.
	 * @generated
	 */
	Antipattern createAntipattern();

	/**
	 * Returns a new object of class '<em>Lo La4 RAPS Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lo La4 RAPS Root</em>'.
	 * @generated
	 */
	LoLa4RAPSRoot createLoLa4RAPSRoot();

	/**
	 * Returns a new object of class '<em>Add Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Action</em>'.
	 * @generated
	 */
	AddAction createAddAction();

	/**
	 * Returns a new object of class '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Action</em>'.
	 * @generated
	 */
	DeleteAction createDeleteAction();

	/**
	 * Returns a new object of class '<em>Move Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Action</em>'.
	 * @generated
	 */
	MoveAction createMoveAction();

	/**
	 * Returns a new object of class '<em>Change Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Action</em>'.
	 * @generated
	 */
	ChangeAction createChangeAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogicalSpecificationPackage getLogicalSpecificationPackage();

} //LogicalSpecificationFactory
