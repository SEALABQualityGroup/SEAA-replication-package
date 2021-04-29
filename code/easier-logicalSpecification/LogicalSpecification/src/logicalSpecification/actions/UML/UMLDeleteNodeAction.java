/**
 */
package logicalSpecification.actions.UML;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Node Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getNodeToDelSVP <em>Node To Del SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getAllNodesMVP <em>All Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getUmlNodeToDel <em>Uml Node To Del</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteNodeAction()
 * @model
 * @generated
 */
public interface UMLDeleteNodeAction extends UMLDeleteAction {
	/**
	 * Returns the value of the '<em><b>Node To Del SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node To Del SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node To Del SVP</em>' reference.
	 * @see #setNodeToDelSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteNodeAction_NodeToDelSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getNodeToDelSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getNodeToDelSVP <em>Node To Del SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To Del SVP</em>' reference.
	 * @see #getNodeToDelSVP()
	 * @generated
	 */
	void setNodeToDelSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Nodes MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Nodes MVP</em>' reference.
	 * @see #setAllNodesMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteNodeAction_AllNodesMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllNodesMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getAllNodesMVP <em>All Nodes MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Nodes MVP</em>' reference.
	 * @see #getAllNodesMVP()
	 * @generated
	 */
	void setAllNodesMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Uml Node To Del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Node To Del</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Node To Del</em>' attribute.
	 * @see #setUmlNodeToDel(Node)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLDeleteNodeAction_UmlNodeToDel()
	 * @model dataType="logicalSpecification.actions.UML.Node" required="true"
	 * @generated
	 */
	Node getUmlNodeToDel();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction#getUmlNodeToDel <em>Uml Node To Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Node To Del</em>' attribute.
	 * @see #getUmlNodeToDel()
	 * @generated
	 */
	void setUmlNodeToDel(Node value);

} // UMLDeleteNodeAction
