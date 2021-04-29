/**
 */
package logicalSpecification.actions.UML;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getOpToDelSVP <em>Op To Del SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getAllOpsMVP <em>All Ops MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getUmlOpToDel <em>Uml Op To Del</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteOperationAction()
 * @model
 * @generated
 */
public interface UMLDeleteOperationAction extends UMLDeleteAction {
	/**
	 * Returns the value of the '<em><b>Op To Del SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op To Del SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op To Del SVP</em>' reference.
	 * @see #setOpToDelSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteOperationAction_OpToDelSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getOpToDelSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getOpToDelSVP <em>Op To Del SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op To Del SVP</em>' reference.
	 * @see #getOpToDelSVP()
	 * @generated
	 */
	void setOpToDelSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Ops MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Ops MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Ops MVP</em>' reference.
	 * @see #setAllOpsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteOperationAction_AllOpsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllOpsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getAllOpsMVP <em>All Ops MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Ops MVP</em>' reference.
	 * @see #getAllOpsMVP()
	 * @generated
	 */
	void setAllOpsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Uml Op To Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Op To Del</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Op To Del</em>' attribute.
	 * @see #setUmlOpToDel(Operation)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteOperationAction_UmlOpToDel()
	 * @model dataType="logicalSpecification.actions.UML.Operation" required="true"
	 * @generated
	 */
	Operation getUmlOpToDel();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction#getUmlOpToDel <em>Uml Op To Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Op To Del</em>' attribute.
	 * @see #getUmlOpToDel()
	 * @generated
	 */
	void setUmlOpToDel(Operation value);

} // UMLDeleteOperationAction
