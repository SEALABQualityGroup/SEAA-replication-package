/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.RelationalOperator#getFactor <em>Factor</em>}</li>
 *   <li>{@link logicalSpecification.RelationalOperator#getLhs <em>Lhs</em>}</li>
 *   <li>{@link logicalSpecification.RelationalOperator#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getRelationalOperator()
 * @model abstract="true"
 * @generated
 */
public interface RelationalOperator extends Operator {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(double)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRelationalOperator_Factor()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link logicalSpecification.RelationalOperator#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Parameter#getLhsRelationalOperator <em>Lhs Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' reference.
	 * @see #setLhs(Parameter)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRelationalOperator_Lhs()
	 * @see logicalSpecification.Parameter#getLhsRelationalOperator
	 * @model opposite="lhsRelationalOperator" required="true"
	 * @generated
	 */
	Parameter getLhs();

	/**
	 * Sets the value of the '{@link logicalSpecification.RelationalOperator#getLhs <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Parameter value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Parameter#getRhsRelationalOperator <em>Rhs Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(Parameter)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRelationalOperator_Rhs()
	 * @see logicalSpecification.Parameter#getRhsRelationalOperator
	 * @model opposite="rhsRelationalOperator" required="true"
	 * @generated
	 */
	Parameter getRhs();

	/**
	 * Sets the value of the '{@link logicalSpecification.RelationalOperator#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Parameter value);

} // RelationalOperator
