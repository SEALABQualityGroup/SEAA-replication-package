/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getLogicalOperator()
 * @model abstract="true"
 * @generated
 */
public interface LogicalOperator extends Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean guarantees(Operator operator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean evaluateOperator(Operator operator);

} // LogicalOperator
