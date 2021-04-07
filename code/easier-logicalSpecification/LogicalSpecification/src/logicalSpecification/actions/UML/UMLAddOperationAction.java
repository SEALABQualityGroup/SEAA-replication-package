/**
 */
package logicalSpecification.actions.UML;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Operation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddOperationAction#getOpToAddSVP <em>Op To Add SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompSVP <em>Target Comp SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddOperationAction#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompOpsMVP <em>Target Comp Ops MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddOperationAction#getUmlOpToAdd <em>Uml Op To Add</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.UMLAddOperationAction#getUmlTargetComp <em>Uml Target Comp</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddOperationAction()
 * @model
 * @generated
 */
public interface UMLAddOperationAction extends UMLAddAction {
	/**
	 * Returns the value of the '<em><b>Op To Add SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op To Add SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op To Add SVP</em>' reference.
	 * @see #setOpToAddSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddOperationAction_OpToAddSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getOpToAddSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getOpToAddSVP <em>Op To Add SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op To Add SVP</em>' reference.
	 * @see #getOpToAddSVP()
	 * @generated
	 */
	void setOpToAddSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Target Comp SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Comp SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Comp SVP</em>' reference.
	 * @see #setTargetCompSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddOperationAction_TargetCompSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getTargetCompSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompSVP <em>Target Comp SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Comp SVP</em>' reference.
	 * @see #getTargetCompSVP()
	 * @generated
	 */
	void setTargetCompSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddOperationAction_AllCompsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllCompsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getAllCompsMVP <em>All Comps MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Comps MVP</em>' reference.
	 * @see #getAllCompsMVP()
	 * @generated
	 */
	void setAllCompsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Target Comp Ops MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Comp Ops MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Comp Ops MVP</em>' reference.
	 * @see #setTargetCompOpsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddOperationAction_TargetCompOpsMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getTargetCompOpsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getTargetCompOpsMVP <em>Target Comp Ops MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Comp Ops MVP</em>' reference.
	 * @see #getTargetCompOpsMVP()
	 * @generated
	 */
	void setTargetCompOpsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Uml Op To Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Op To Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Op To Add</em>' attribute.
	 * @see #setUmlOpToAdd(Operation)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddOperationAction_UmlOpToAdd()
	 * @model dataType="logicalSpecification.actions.UML.Operation" required="true"
	 * @generated
	 */
	Operation getUmlOpToAdd();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getUmlOpToAdd <em>Uml Op To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Op To Add</em>' attribute.
	 * @see #getUmlOpToAdd()
	 * @generated
	 */
	void setUmlOpToAdd(Operation value);

	/**
	 * Returns the value of the '<em><b>Uml Target Comp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Target Comp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Target Comp</em>' attribute.
	 * @see #setUmlTargetComp(Component)
	 * @see logicalSpecification.actions.UML.UMLPackage#getUMLAddOperationAction_UmlTargetComp()
	 * @model dataType="logicalSpecification.actions.UML.Component" required="true"
	 * @generated
	 */
	Component getUmlTargetComp();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.UML.UMLAddOperationAction#getUmlTargetComp <em>Uml Target Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Target Comp</em>' attribute.
	 * @see #getUmlTargetComp()
	 * @generated
	 */
	void setUmlTargetComp(Component value);

} // UMLAddOperationAction
