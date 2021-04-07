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
 * A representation of the model object '<em><b>Add Component Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getComponentToAddSVP <em>Component To Add SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getTargetNodesMVP <em>Target Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getDeployedCompsMVP <em>Deployed Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getAllNodesMVP <em>All Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlCompToAdd <em>Uml Comp To Add</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlSourcePackage <em>Uml Source Package</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlTargetNodes <em>Uml Target Nodes</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction()
 * @model
 * @generated
 */
public interface UMLAddComponentAction extends UMLAddAction {
	/**
	 * Returns the value of the '<em><b>Component To Add SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component To Add SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component To Add SVP</em>' reference.
	 * @see #setComponentToAddSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_ComponentToAddSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getComponentToAddSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getComponentToAddSVP <em>Component To Add SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component To Add SVP</em>' reference.
	 * @see #getComponentToAddSVP()
	 * @generated
	 */
	void setComponentToAddSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Target Nodes MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Nodes MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Nodes MVP</em>' reference.
	 * @see #setTargetNodesMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_TargetNodesMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getTargetNodesMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getTargetNodesMVP <em>Target Nodes MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Nodes MVP</em>' reference.
	 * @see #getTargetNodesMVP()
	 * @generated
	 */
	void setTargetNodesMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Deployed Comps MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Comps MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Comps MVP</em>' reference.
	 * @see #setDeployedCompsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_DeployedCompsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getDeployedCompsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getDeployedCompsMVP <em>Deployed Comps MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Comps MVP</em>' reference.
	 * @see #getDeployedCompsMVP()
	 * @generated
	 */
	void setDeployedCompsMVP(MultipleValuedParameter value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_AllCompsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllCompsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getAllCompsMVP <em>All Comps MVP</em>}' reference.
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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_AllNodesMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllNodesMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getAllNodesMVP <em>All Nodes MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Nodes MVP</em>' reference.
	 * @see #getAllNodesMVP()
	 * @generated
	 */
	void setAllNodesMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Uml Comp To Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Comp To Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Comp To Add</em>' attribute.
	 * @see #setUmlCompToAdd(Component)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_UmlCompToAdd()
	 * @model dataType="logicalSpecification.actions.UML.Component" required="true"
	 * @generated
	 */
	Component getUmlCompToAdd();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlCompToAdd <em>Uml Comp To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Comp To Add</em>' attribute.
	 * @see #getUmlCompToAdd()
	 * @generated
	 */
	void setUmlCompToAdd(Component value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_UmlSourcePackage()
	 * @model dataType="logicalSpecification.actions.UML.Package" required="true"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getUmlSourcePackage();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddComponentAction#getUmlSourcePackage <em>Uml Source Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Source Package</em>' attribute.
	 * @see #getUmlSourcePackage()
	 * @generated
	 */
	void setUmlSourcePackage(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Uml Target Nodes</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Target Nodes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Target Nodes</em>' attribute list.
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddComponentAction_UmlTargetNodes()
	 * @model dataType="logicalSpecification.actions.UML.Node" required="true"
	 * @generated
	 */
	EList<Node> getUmlTargetNodes();

} // UMLAddComponentAction
