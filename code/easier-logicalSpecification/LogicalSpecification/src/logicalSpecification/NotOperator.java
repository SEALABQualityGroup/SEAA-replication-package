/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.NotOperator#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getNotOperator()
 * @model
 * @generated
 */
public interface NotOperator extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Operator#getNotOperator <em>Not Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Operator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getNotOperator_Argument()
	 * @see logicalSpecification.Operator#getNotOperator
	 * @model opposite="notOperator" containment="true" required="true"
	 * @generated
	 */
	Operator getArgument();

	/**
	 * Sets the value of the '{@link logicalSpecification.NotOperator#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Operator value);

} // NotOperator
