/**
 */
package logicalSpecification.actions.UML;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Component Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getCompToMoveSVP <em>Comp To Move SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getTargetNodesMVP <em>Target Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllArtifactsMVP <em>All Artifacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllTargetsMVP <em>All Targets MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllNodesMVP <em>All Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlCompToMove <em>Uml Comp To Move</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlTargetNodes <em>Uml Target Nodes</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlArtifacts <em>Uml Artifacts</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction()
 * @model
 * @generated
 */
public interface UMLMoveComponentAction extends UMLMoveAction {
	/**
	 * Returns the value of the '<em><b>Comp To Move SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp To Move SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp To Move SVP</em>' reference.
	 * @see #setCompToMoveSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_CompToMoveSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getCompToMoveSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getCompToMoveSVP <em>Comp To Move SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp To Move SVP</em>' reference.
	 * @see #getCompToMoveSVP()
	 * @generated
	 */
	void setCompToMoveSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_TargetNodesMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getTargetNodesMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getTargetNodesMVP <em>Target Nodes MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Nodes MVP</em>' reference.
	 * @see #getTargetNodesMVP()
	 * @generated
	 */
	void setTargetNodesMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Artifacts MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Artifacts MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Artifacts MVP</em>' reference.
	 * @see #setAllArtifactsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_AllArtifactsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllArtifactsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllArtifactsMVP <em>All Artifacts MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Artifacts MVP</em>' reference.
	 * @see #getAllArtifactsMVP()
	 * @generated
	 */
	void setAllArtifactsMVP(MultipleValuedParameter value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_AllCompsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllCompsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllCompsMVP <em>All Comps MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Comps MVP</em>' reference.
	 * @see #getAllCompsMVP()
	 * @generated
	 */
	void setAllCompsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Targets MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Targets MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Targets MVP</em>' reference.
	 * @see #setAllTargetsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_AllTargetsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllTargetsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllTargetsMVP <em>All Targets MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Targets MVP</em>' reference.
	 * @see #getAllTargetsMVP()
	 * @generated
	 */
	void setAllTargetsMVP(MultipleValuedParameter value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_AllNodesMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllNodesMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllNodesMVP <em>All Nodes MVP</em>}' reference.
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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_AllDeployedElemsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllDeployedElemsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Deployed Elems MVP</em>' reference.
	 * @see #getAllDeployedElemsMVP()
	 * @generated
	 */
	void setAllDeployedElemsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Uml Comp To Move</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Comp To Move</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Comp To Move</em>' attribute.
	 * @see #setUmlCompToMove(Component)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_UmlCompToMove()
	 * @model dataType="logicalSpecification.actions.UML.Component" required="true"
	 * @generated
	 */
	Component getUmlCompToMove();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLMoveComponentAction#getUmlCompToMove <em>Uml Comp To Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Comp To Move</em>' attribute.
	 * @see #getUmlCompToMove()
	 * @generated
	 */
	void setUmlCompToMove(Component value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_UmlTargetNodes()
	 * @model dataType="logicalSpecification.actions.UML.Node" required="true"
	 * @generated
	 */
	EList<Node> getUmlTargetNodes();

	/**
	 * Returns the value of the '<em><b>Uml Artifacts</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Artifacts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Artifacts</em>' attribute list.
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLMoveComponentAction_UmlArtifacts()
	 * @model dataType="logicalSpecification.actions.UML.Artifact"
	 * @generated
	 */
	EList<Artifact> getUmlArtifacts();

} // UMLMoveComponentAction
