/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.PostCondition#getAction <em>Action</em>}</li>
 *   <li>{@link logicalSpecification.PostCondition#getRefactoring <em>Refactoring</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getPostCondition()
 * @model
 * @generated
 */
public interface PostCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Action#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' container reference.
	 * @see #setAction(Action)
	 * @see logicalSpecification.LogicalSpecificationPackage#getPostCondition_Action()
	 * @see logicalSpecification.Action#getPost
	 * @model opposite="post" transient="false"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link logicalSpecification.PostCondition#getAction <em>Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' container reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Refactoring</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Refactoring#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refactoring</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactoring</em>' container reference.
	 * @see #setRefactoring(Refactoring)
	 * @see logicalSpecification.LogicalSpecificationPackage#getPostCondition_Refactoring()
	 * @see logicalSpecification.Refactoring#getPost
	 * @model opposite="post" transient="false"
	 * @generated
	 */
	Refactoring getRefactoring();

	/**
	 * Sets the value of the '{@link logicalSpecification.PostCondition#getRefactoring <em>Refactoring</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refactoring</em>' container reference.
	 * @see #getRefactoring()
	 * @generated
	 */
	void setRefactoring(Refactoring value);

} // PostCondition
