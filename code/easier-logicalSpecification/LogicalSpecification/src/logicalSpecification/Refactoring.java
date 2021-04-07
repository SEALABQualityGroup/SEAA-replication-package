/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.Refactoring#getActions <em>Actions</em>}</li>
 *   <li>{@link logicalSpecification.Refactoring#getPre <em>Pre</em>}</li>
 *   <li>{@link logicalSpecification.Refactoring#getPost <em>Post</em>}</li>
 *   <li>{@link logicalSpecification.Refactoring#getLola4rapsRoot <em>Lola4raps Root</em>}</li>
 *   <li>{@link logicalSpecification.Refactoring#getCost <em>Cost</em>}</li>
 *   <li>{@link logicalSpecification.Refactoring#getNumOfChanges <em>Num Of Changes</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getRefactoring()
 * @model
 * @generated
 */
public interface Refactoring extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link logicalSpecification.Action}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Action#getRefactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getRefactoring_Actions()
	 * @see logicalSpecification.Action#getRefactoring
	 * @model opposite="refactoring" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.PreCondition#getRefactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(PreCondition)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRefactoring_Pre()
	 * @see logicalSpecification.PreCondition#getRefactoring
	 * @model opposite="refactoring" containment="true"
	 * @generated
	 */
	PreCondition getPre();

	/**
	 * Sets the value of the '{@link logicalSpecification.Refactoring#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(PreCondition value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.PostCondition#getRefactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(PostCondition)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRefactoring_Post()
	 * @see logicalSpecification.PostCondition#getRefactoring
	 * @model opposite="refactoring" containment="true"
	 * @generated
	 */
	PostCondition getPost();

	/**
	 * Sets the value of the '{@link logicalSpecification.Refactoring#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(PostCondition value);

	/**
	 * Returns the value of the '<em><b>Lola4raps Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.LoLa4RAPSRoot#getRefactorings <em>Refactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lola4raps Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lola4raps Root</em>' container reference.
	 * @see #setLola4rapsRoot(LoLa4RAPSRoot)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRefactoring_Lola4rapsRoot()
	 * @see logicalSpecification.LoLa4RAPSRoot#getRefactorings
	 * @model opposite="refactorings" transient="false"
	 * @generated
	 */
	LoLa4RAPSRoot getLola4rapsRoot();

	/**
	 * Sets the value of the '{@link logicalSpecification.Refactoring#getLola4rapsRoot <em>Lola4raps Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lola4raps Root</em>' container reference.
	 * @see #getLola4rapsRoot()
	 * @generated
	 */
	void setLola4rapsRoot(LoLa4RAPSRoot value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(double)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRefactoring_Cost()
	 * @model default="0.0" required="true" derived="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link logicalSpecification.Refactoring#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Num Of Changes</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Changes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Changes</em>' attribute.
	 * @see #setNumOfChanges(double)
	 * @see logicalSpecification.LogicalSpecificationPackage#getRefactoring_NumOfChanges()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getNumOfChanges();

	/**
	 * Sets the value of the '{@link logicalSpecification.Refactoring#getNumOfChanges <em>Num Of Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Changes</em>' attribute.
	 * @see #getNumOfChanges()
	 * @generated
	 */
	void setNumOfChanges(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Refactoring cloneRefactoring();

} // Refactoring
