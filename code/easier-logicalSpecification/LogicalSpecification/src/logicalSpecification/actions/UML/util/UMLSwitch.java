/**
 */
package logicalSpecification.actions.UML.util;

import logicalSpecification.Action;
import logicalSpecification.AddAction;
import logicalSpecification.DeleteAction;
import logicalSpecification.MoveAction;
import logicalSpecification.NamedElement;

import logicalSpecification.actions.UML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see logicalSpecification.actions.UML.UMLPackage
 * @generated
 */
public class UMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLSwitch() {
		if (modelPackage == null) {
			modelPackage = UMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UMLPackage.UML_ADD_ACTION: {
				UMLAddAction umlAddAction = (UMLAddAction)theEObject;
				T result = caseUMLAddAction(umlAddAction);
				if (result == null) result = caseAddAction(umlAddAction);
				if (result == null) result = caseAction(umlAddAction);
				if (result == null) result = caseNamedElement(umlAddAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_DELETE_ACTION: {
				UMLDeleteAction umlDeleteAction = (UMLDeleteAction)theEObject;
				T result = caseUMLDeleteAction(umlDeleteAction);
				if (result == null) result = caseDeleteAction(umlDeleteAction);
				if (result == null) result = caseAction(umlDeleteAction);
				if (result == null) result = caseNamedElement(umlDeleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_MOVE_ACTION: {
				UMLMoveAction umlMoveAction = (UMLMoveAction)theEObject;
				T result = caseUMLMoveAction(umlMoveAction);
				if (result == null) result = caseMoveAction(umlMoveAction);
				if (result == null) result = caseAction(umlMoveAction);
				if (result == null) result = caseNamedElement(umlMoveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_ADD_NODE_ACTION: {
				UMLAddNodeAction umlAddNodeAction = (UMLAddNodeAction)theEObject;
				T result = caseUMLAddNodeAction(umlAddNodeAction);
				if (result == null) result = caseUMLAddAction(umlAddNodeAction);
				if (result == null) result = caseAddAction(umlAddNodeAction);
				if (result == null) result = caseAction(umlAddNodeAction);
				if (result == null) result = caseNamedElement(umlAddNodeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_ADD_COMPONENT_ACTION: {
				UMLAddComponentAction umlAddComponentAction = (UMLAddComponentAction)theEObject;
				T result = caseUMLAddComponentAction(umlAddComponentAction);
				if (result == null) result = caseUMLAddAction(umlAddComponentAction);
				if (result == null) result = caseAddAction(umlAddComponentAction);
				if (result == null) result = caseAction(umlAddComponentAction);
				if (result == null) result = caseNamedElement(umlAddComponentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_ADD_OPERATION_ACTION: {
				UMLAddOperationAction umlAddOperationAction = (UMLAddOperationAction)theEObject;
				T result = caseUMLAddOperationAction(umlAddOperationAction);
				if (result == null) result = caseUMLAddAction(umlAddOperationAction);
				if (result == null) result = caseAddAction(umlAddOperationAction);
				if (result == null) result = caseAction(umlAddOperationAction);
				if (result == null) result = caseNamedElement(umlAddOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_DELETE_NODE_ACTION: {
				UMLDeleteNodeAction umlDeleteNodeAction = (UMLDeleteNodeAction)theEObject;
				T result = caseUMLDeleteNodeAction(umlDeleteNodeAction);
				if (result == null) result = caseUMLDeleteAction(umlDeleteNodeAction);
				if (result == null) result = caseDeleteAction(umlDeleteNodeAction);
				if (result == null) result = caseAction(umlDeleteNodeAction);
				if (result == null) result = caseNamedElement(umlDeleteNodeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_DELETE_COMPONENT_ACTION: {
				UMLDeleteComponentAction umlDeleteComponentAction = (UMLDeleteComponentAction)theEObject;
				T result = caseUMLDeleteComponentAction(umlDeleteComponentAction);
				if (result == null) result = caseUMLDeleteAction(umlDeleteComponentAction);
				if (result == null) result = caseDeleteAction(umlDeleteComponentAction);
				if (result == null) result = caseAction(umlDeleteComponentAction);
				if (result == null) result = caseNamedElement(umlDeleteComponentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_DELETE_OPERATION_ACTION: {
				UMLDeleteOperationAction umlDeleteOperationAction = (UMLDeleteOperationAction)theEObject;
				T result = caseUMLDeleteOperationAction(umlDeleteOperationAction);
				if (result == null) result = caseUMLDeleteAction(umlDeleteOperationAction);
				if (result == null) result = caseDeleteAction(umlDeleteOperationAction);
				if (result == null) result = caseAction(umlDeleteOperationAction);
				if (result == null) result = caseNamedElement(umlDeleteOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_MOVE_COMPONENT_ACTION: {
				UMLMoveComponentAction umlMoveComponentAction = (UMLMoveComponentAction)theEObject;
				T result = caseUMLMoveComponentAction(umlMoveComponentAction);
				if (result == null) result = caseUMLMoveAction(umlMoveComponentAction);
				if (result == null) result = caseMoveAction(umlMoveComponentAction);
				if (result == null) result = caseAction(umlMoveComponentAction);
				if (result == null) result = caseNamedElement(umlMoveComponentAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UMLPackage.UML_MOVE_OPERATION_ACTION: {
				UMLMoveOperationAction umlMoveOperationAction = (UMLMoveOperationAction)theEObject;
				T result = caseUMLMoveOperationAction(umlMoveOperationAction);
				if (result == null) result = caseUMLMoveAction(umlMoveOperationAction);
				if (result == null) result = caseMoveAction(umlMoveOperationAction);
				if (result == null) result = caseAction(umlMoveOperationAction);
				if (result == null) result = caseNamedElement(umlMoveOperationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLAddAction(UMLAddAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLDeleteAction(UMLDeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLMoveAction(UMLMoveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Node Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Node Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLAddNodeAction(UMLAddNodeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Component Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Component Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLAddComponentAction(UMLAddComponentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLAddOperationAction(UMLAddOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Node Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Node Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLDeleteNodeAction(UMLDeleteNodeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Component Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Component Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLDeleteComponentAction(UMLDeleteComponentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLDeleteOperationAction(UMLDeleteOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Component Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Component Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLMoveComponentAction(UMLMoveComponentAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLMoveOperationAction(UMLMoveOperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAction(AddAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAction(DeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveAction(MoveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UMLSwitch
