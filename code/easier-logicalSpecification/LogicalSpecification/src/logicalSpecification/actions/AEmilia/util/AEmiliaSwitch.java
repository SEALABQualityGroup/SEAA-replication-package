/**
 */
package logicalSpecification.actions.AEmilia.util;

import logicalSpecification.Action;
import logicalSpecification.AddAction;
import logicalSpecification.ChangeAction;
import logicalSpecification.DeleteAction;
import logicalSpecification.MoveAction;
import logicalSpecification.NamedElement;

import logicalSpecification.actions.AEmilia.*;

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
 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage
 * @generated
 */
public class AEmiliaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AEmiliaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaSwitch() {
		if (modelPackage == null) {
			modelPackage = AEmiliaPackage.eINSTANCE;
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
			case AEmiliaPackage.AEMILIA_ADD_ACTION: {
				AEmiliaAddAction aEmiliaAddAction = (AEmiliaAddAction)theEObject;
				T result = caseAEmiliaAddAction(aEmiliaAddAction);
				if (result == null) result = caseAddAction(aEmiliaAddAction);
				if (result == null) result = caseAction(aEmiliaAddAction);
				if (result == null) result = caseNamedElement(aEmiliaAddAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AEmiliaPackage.AEMILIA_DELETE_ACTION: {
				AEmiliaDeleteAction aEmiliaDeleteAction = (AEmiliaDeleteAction)theEObject;
				T result = caseAEmiliaDeleteAction(aEmiliaDeleteAction);
				if (result == null) result = caseDeleteAction(aEmiliaDeleteAction);
				if (result == null) result = caseAction(aEmiliaDeleteAction);
				if (result == null) result = caseNamedElement(aEmiliaDeleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AEmiliaPackage.AEMILIA_MOVE_ACTION: {
				AEmiliaMoveAction aEmiliaMoveAction = (AEmiliaMoveAction)theEObject;
				T result = caseAEmiliaMoveAction(aEmiliaMoveAction);
				if (result == null) result = caseMoveAction(aEmiliaMoveAction);
				if (result == null) result = caseAction(aEmiliaMoveAction);
				if (result == null) result = caseNamedElement(aEmiliaMoveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AEmiliaPackage.AEMILIA_CLONE_AEI_ACTION: {
				AEmiliaCloneAEIAction aEmiliaCloneAEIAction = (AEmiliaCloneAEIAction)theEObject;
				T result = caseAEmiliaCloneAEIAction(aEmiliaCloneAEIAction);
				if (result == null) result = caseAEmiliaAddAction(aEmiliaCloneAEIAction);
				if (result == null) result = caseAddAction(aEmiliaCloneAEIAction);
				if (result == null) result = caseAction(aEmiliaCloneAEIAction);
				if (result == null) result = caseNamedElement(aEmiliaCloneAEIAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION: {
				AEmiliaConstChangesAction aEmiliaConstChangesAction = (AEmiliaConstChangesAction)theEObject;
				T result = caseAEmiliaConstChangesAction(aEmiliaConstChangesAction);
				if (result == null) result = caseAEmiliaChangeAction(aEmiliaConstChangesAction);
				if (result == null) result = caseChangeAction(aEmiliaConstChangesAction);
				if (result == null) result = caseAction(aEmiliaConstChangesAction);
				if (result == null) result = caseNamedElement(aEmiliaConstChangesAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AEmiliaPackage.AEMILIA_CHANGE_ACTION: {
				AEmiliaChangeAction aEmiliaChangeAction = (AEmiliaChangeAction)theEObject;
				T result = caseAEmiliaChangeAction(aEmiliaChangeAction);
				if (result == null) result = caseChangeAction(aEmiliaChangeAction);
				if (result == null) result = caseAction(aEmiliaChangeAction);
				if (result == null) result = caseNamedElement(aEmiliaChangeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION: {
				AEmiliaRemoveClonedAEIAction aEmiliaRemoveClonedAEIAction = (AEmiliaRemoveClonedAEIAction)theEObject;
				T result = caseAEmiliaRemoveClonedAEIAction(aEmiliaRemoveClonedAEIAction);
				if (result == null) result = caseAEmiliaDeleteAction(aEmiliaRemoveClonedAEIAction);
				if (result == null) result = caseDeleteAction(aEmiliaRemoveClonedAEIAction);
				if (result == null) result = caseAction(aEmiliaRemoveClonedAEIAction);
				if (result == null) result = caseNamedElement(aEmiliaRemoveClonedAEIAction);
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
	public T caseAEmiliaAddAction(AEmiliaAddAction object) {
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
	public T caseAEmiliaDeleteAction(AEmiliaDeleteAction object) {
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
	public T caseAEmiliaMoveAction(AEmiliaMoveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clone AEI Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clone AEI Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEmiliaCloneAEIAction(AEmiliaCloneAEIAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Changes Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Changes Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEmiliaConstChangesAction(AEmiliaConstChangesAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEmiliaChangeAction(AEmiliaChangeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Cloned AEI Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Cloned AEI Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEmiliaRemoveClonedAEIAction(AEmiliaRemoveClonedAEIAction object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Change Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAction(ChangeAction object) {
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

} //AEmiliaSwitch
