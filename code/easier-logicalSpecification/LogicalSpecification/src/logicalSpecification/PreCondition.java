/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.PreCondition#getAction <em>Action</em>}</li>
 *   <li>{@link logicalSpecification.PreCondition#getRefactoring <em>Refactoring</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getPreCondition()
 * @model
 * @generated
 */
public interface PreCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Action#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' container reference.
	 * @see #setAction(Action)
	 * @see logicalSpecification.LogicalSpecificationPackage#getPreCondition_Action()
	 * @see logicalSpecification.Action#getPre
	 * @model opposite="pre" transient="false"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link logicalSpecification.PreCondition#getAction <em>Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' container reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Refactoring</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Refactoring#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refactoring</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactoring</em>' container reference.
	 * @see #setRefactoring(Refactoring)
	 * @see logicalSpecification.LogicalSpecificationPackage#getPreCondition_Refactoring()
	 * @see logicalSpecification.Refactoring#getPre
	 * @model opposite="pre" transient="false"
	 * @generated
	 */
	Refactoring getRefactoring();

	/**
	 * Sets the value of the '{@link logicalSpecification.PreCondition#getRefactoring <em>Refactoring</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refactoring</em>' container reference.
	 * @see #getRefactoring()
	 * @generated
	 */
	void setRefactoring(Refactoring value);

} // PreCondition
