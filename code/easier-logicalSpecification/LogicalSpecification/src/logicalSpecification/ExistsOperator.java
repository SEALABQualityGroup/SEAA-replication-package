/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exists Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.ExistsOperator#getElement <em>Element</em>}</li>
 *   <li>{@link logicalSpecification.ExistsOperator#getCollection <em>Collection</em>}</li>
 *   <li>{@link logicalSpecification.ExistsOperator#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getExistsOperator()
 * @model
 * @generated
 */
public interface ExistsOperator extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.SingleValuedParameter#getExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(SingleValuedParameter)
	 * @see logicalSpecification.LogicalSpecificationPackage#getExistsOperator_Element()
	 * @see logicalSpecification.SingleValuedParameter#getExistsOperator
	 * @model opposite="existsOperator"
	 * @generated
	 */
	SingleValuedParameter getElement();

	/**
	 * Sets the value of the '{@link logicalSpecification.ExistsOperator#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.MultipleValuedParameter#getExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(MultipleValuedParameter)
	 * @see logicalSpecification.LogicalSpecificationPackage#getExistsOperator_Collection()
	 * @see logicalSpecification.MultipleValuedParameter#getExistsOperator
	 * @model opposite="existsOperator" required="true"
	 * @generated
	 */
	MultipleValuedParameter getCollection();

	/**
	 * Sets the value of the '{@link logicalSpecification.ExistsOperator#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Operator#getExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Operator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getExistsOperator_Argument()
	 * @see logicalSpecification.Operator#getExistsOperator
	 * @model opposite="existsOperator" containment="true"
	 * @generated
	 */
	Operator getArgument();

	/**
	 * Sets the value of the '{@link logicalSpecification.ExistsOperator#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Operator value);

} // ExistsOperator
