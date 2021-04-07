/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.Action#getNumOfChanges <em>Num Of Changes</em>}</li>
 *   <li>{@link logicalSpecification.Action#getCost <em>Cost</em>}</li>
 *   <li>{@link logicalSpecification.Action#getRefactoring <em>Refactoring</em>}</li>
 *   <li>{@link logicalSpecification.Action#getParameters <em>Parameters</em>}</li>
 *   <li>{@link logicalSpecification.Action#getPre <em>Pre</em>}</li>
 *   <li>{@link logicalSpecification.Action#getPost <em>Post</em>}</li>
 *   <li>{@link logicalSpecification.Action#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NamedElement {
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
	 * @see logicalSpecification.LogicalSpecificationPackage#getAction_NumOfChanges()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getNumOfChanges();

	/**
	 * Sets the value of the '{@link logicalSpecification.Action#getNumOfChanges <em>Num Of Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Changes</em>' attribute.
	 * @see #getNumOfChanges()
	 * @generated
	 */
	void setNumOfChanges(double value);

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
	 * @see logicalSpecification.LogicalSpecificationPackage#getAction_Cost()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getCost();

	/**
	 * Sets the value of the '{@link logicalSpecification.Action#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(double value);

	/**
	 * Returns the value of the '<em><b>Refactoring</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Refactoring#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refactoring</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactoring</em>' container reference.
	 * @see #setRefactoring(Refactoring)
	 * @see logicalSpecification.LogicalSpecificationPackage#getAction_Refactoring()
	 * @see logicalSpecification.Refactoring#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	Refactoring getRefactoring();

	/**
	 * Sets the value of the '{@link logicalSpecification.Action#getRefactoring <em>Refactoring</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refactoring</em>' container reference.
	 * @see #getRefactoring()
	 * @generated
	 */
	void setRefactoring(Refactoring value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link logicalSpecification.Parameter}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Parameter#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getAction_Parameters()
	 * @see logicalSpecification.Parameter#getAction
	 * @model opposite="action" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.PreCondition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(PreCondition)
	 * @see logicalSpecification.LogicalSpecificationPackage#getAction_Pre()
	 * @see logicalSpecification.PreCondition#getAction
	 * @model opposite="action" containment="true"
	 * @generated
	 */
	PreCondition getPre();

	/**
	 * Sets the value of the '{@link logicalSpecification.Action#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(PreCondition value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.PostCondition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(PostCondition)
	 * @see logicalSpecification.LogicalSpecificationPackage#getAction_Post()
	 * @see logicalSpecification.PostCondition#getAction
	 * @model opposite="action" containment="true"
	 * @generated
	 */
	PostCondition getPost();

	/**
	 * Sets the value of the '{@link logicalSpecification.Action#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(PostCondition value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(Object)
	 * @see logicalSpecification.LogicalSpecificationPackage#getAction_Model()
	 * @model
	 * @generated
	 */
	Object getModel();

	/**
	 * Sets the value of the '{@link logicalSpecification.Action#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void log();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createPreCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createPostCondition();

} // Action
