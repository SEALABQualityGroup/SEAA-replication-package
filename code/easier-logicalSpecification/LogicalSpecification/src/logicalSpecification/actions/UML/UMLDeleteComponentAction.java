/**
 */
package logicalSpecification.actions.UML;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Component Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getCompToDelSVP <em>Comp To Del SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getUmlCompToDel <em>Uml Comp To Del</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteComponentAction()
 * @model
 * @generated
 */
public interface UMLDeleteComponentAction extends UMLDeleteAction {
	/**
	 * Returns the value of the '<em><b>Comp To Del SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp To Del SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp To Del SVP</em>' reference.
	 * @see #setCompToDelSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteComponentAction_CompToDelSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getCompToDelSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getCompToDelSVP <em>Comp To Del SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp To Del SVP</em>' reference.
	 * @see #getCompToDelSVP()
	 * @generated
	 */
	void setCompToDelSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Comps MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Comps MVP</em>' reference.
	 * @see #setAllCompsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteComponentAction_AllCompsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllCompsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getAllCompsMVP <em>All Comps MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Comps MVP</em>' reference.
	 * @see #getAllCompsMVP()
	 * @generated
	 */
	void setAllCompsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Uml Comp To Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Comp To Del</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Comp To Del</em>' attribute.
	 * @see #setUmlCompToDel(Component)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteComponentAction_UmlCompToDel()
	 * @model dataType="logicalSpecification.actions.UML.Component" required="true"
	 * @generated
	 */
	Component getUmlCompToDel();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction#getUmlCompToDel <em>Uml Comp To Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Comp To Del</em>' attribute.
	 * @see #getUmlCompToDel()
	 * @generated
	 */
	void setUmlCompToDel(Component value);

} // UMLDeleteComponentAction
