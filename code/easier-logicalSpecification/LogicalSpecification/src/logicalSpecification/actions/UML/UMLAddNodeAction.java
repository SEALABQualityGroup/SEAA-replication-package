/**
 */
package logicalSpecification.actions.UML;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Node Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getNodeToAddSVP <em>Node To Add SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getNeighborsMVP <em>Neighbors MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getCompsToDeployMVP <em>Comps To Deploy MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllNodesMVP <em>All Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlNodeToAdd <em>Uml Node To Add</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlNeighbors <em>Uml Neighbors</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlCompsToDeploy <em>Uml Comps To Deploy</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlSourcePackage <em>Uml Source Package</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction()
 * @model
 * @generated
 */
public interface UMLAddNodeAction extends UMLAddAction {
	/**
	 * Returns the value of the '<em><b>Node To Add SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node To Add SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node To Add SVP</em>' reference.
	 * @see #setNodeToAddSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_NodeToAddSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getNodeToAddSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getNodeToAddSVP <em>Node To Add SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To Add SVP</em>' reference.
	 * @see #getNodeToAddSVP()
	 * @generated
	 */
	void setNodeToAddSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Neighbors MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighbors MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors MVP</em>' reference.
	 * @see #setNeighborsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_NeighborsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getNeighborsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getNeighborsMVP <em>Neighbors MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighbors MVP</em>' reference.
	 * @see #getNeighborsMVP()
	 * @generated
	 */
	void setNeighborsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Comps To Deploy MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comps To Deploy MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comps To Deploy MVP</em>' reference.
	 * @see #setCompsToDeployMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_CompsToDeployMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getCompsToDeployMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getCompsToDeployMVP <em>Comps To Deploy MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comps To Deploy MVP</em>' reference.
	 * @see #getCompsToDeployMVP()
	 * @generated
	 */
	void setCompsToDeployMVP(MultipleValuedParameter value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_AllCompsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllCompsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllCompsMVP <em>All Comps MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Comps MVP</em>' reference.
	 * @see #getAllCompsMVP()
	 * @generated
	 */
	void setAllCompsMVP(MultipleValuedParameter value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_AllNodesMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllNodesMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllNodesMVP <em>All Nodes MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Nodes MVP</em>' reference.
	 * @see #getAllNodesMVP()
	 * @generated
	 */
	void setAllNodesMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Deployed Elems MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Deployed Elems MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Deployed Elems MVP</em>' reference.
	 * @see #setAllDeployedElemsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_AllDeployedElemsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllDeployedElemsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Deployed Elems MVP</em>' reference.
	 * @see #getAllDeployedElemsMVP()
	 * @generated
	 */
	void setAllDeployedElemsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Uml Node To Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Node To Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Node To Add</em>' attribute.
	 * @see #setUmlNodeToAdd(Node)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_UmlNodeToAdd()
	 * @model dataType="logicalSpecification.actions.UML.Node" required="true"
	 * @generated
	 */
	Node getUmlNodeToAdd();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlNodeToAdd <em>Uml Node To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Node To Add</em>' attribute.
	 * @see #getUmlNodeToAdd()
	 * @generated
	 */
	void setUmlNodeToAdd(Node value);

	/**
	 * Returns the value of the '<em><b>Uml Neighbors</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Neighbors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Neighbors</em>' attribute list.
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_UmlNeighbors()
	 * @model dataType="logicalSpecification.actions.UML.Node"
	 * @generated
	 */
	EList<Node> getUmlNeighbors();

	/**
	 * Returns the value of the '<em><b>Uml Comps To Deploy</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Comps To Deploy</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Comps To Deploy</em>' attribute list.
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_UmlCompsToDeploy()
	 * @model dataType="logicalSpecification.actions.UML.Component"
	 * @generated
	 */
	EList<Component> getUmlCompsToDeploy();

	/**
	 * Returns the value of the '<em><b>Uml Source Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Source Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Source Package</em>' attribute.
	 * @see #setUmlSourcePackage(org.eclipse.uml2.uml.Package)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddNodeAction_UmlSourcePackage()
	 * @model dataType="logicalSpecification.actions.UML.Package" required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getUmlSourcePackage();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddNodeAction#getUmlSourcePackage <em>Uml Source Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Source Package</em>' attribute.
	 * @see #getUmlSourcePackage()
	 * @generated
	 */
	void setUmlSourcePackage(org.eclipse.uml2.uml.Package value);

} // UMLAddNodeAction
