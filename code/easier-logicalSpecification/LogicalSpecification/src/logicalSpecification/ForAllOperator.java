/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.ForAllOperator#getCollection <em>Collection</em>}</li>
 *   <li>{@link logicalSpecification.ForAllOperator#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getForAllOperator()
 * @model
 * @generated
 */
public interface ForAllOperator extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.MultipleValuedParameter#getForAllOperator <em>For All Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(MultipleValuedParameter)
	 * @see logicalSpecification.LogicalSpecificationPackage#getForAllOperator_Collection()
	 * @see logicalSpecification.MultipleValuedParameter#getForAllOperator
	 * @model opposite="forAllOperator" required="true"
	 * @generated
	 */
	MultipleValuedParameter getCollection();

	/**
	 * Sets the value of the '{@link logicalSpecification.ForAllOperator#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Operator#getForAlloperator <em>For Alloperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Operator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getForAllOperator_Argument()
	 * @see logicalSpecification.Operator#getForAlloperator
	 * @model opposite="forAlloperator" containment="true" required="true"
	 * @generated
	 */
	Operator getArgument();

	/**
	 * Sets the value of the '{@link logicalSpecification.ForAllOperator#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Operator value);

} // ForAllOperator
