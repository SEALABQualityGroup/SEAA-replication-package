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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage
 * @generated
 */
public class AEmiliaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AEmiliaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AEmiliaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AEmiliaSwitch<Adapter> modelSwitch =
		new AEmiliaSwitch<Adapter>() {
			@Override
			public Adapter caseAEmiliaAddAction(AEmiliaAddAction object) {
				return createAEmiliaAddActionAdapter();
			}
			@Override
			public Adapter caseAEmiliaDeleteAction(AEmiliaDeleteAction object) {
				return createAEmiliaDeleteActionAdapter();
			}
			@Override
			public Adapter caseAEmiliaMoveAction(AEmiliaMoveAction object) {
				return createAEmiliaMoveActionAdapter();
			}
			@Override
			public Adapter caseAEmiliaCloneAEIAction(AEmiliaCloneAEIAction object) {
				return createAEmiliaCloneAEIActionAdapter();
			}
			@Override
			public Adapter caseAEmiliaConstChangesAction(AEmiliaConstChangesAction object) {
				return createAEmiliaConstChangesActionAdapter();
			}
			@Override
			public Adapter caseAEmiliaChangeAction(AEmiliaChangeAction object) {
				return createAEmiliaChangeActionAdapter();
			}
			@Override
			public Adapter caseAEmiliaRemoveClonedAEIAction(AEmiliaRemoveClonedAEIAction object) {
				return createAEmiliaRemoveClonedAEIActionAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseAddAction(AddAction object) {
				return createAddActionAdapter();
			}
			@Override
			public Adapter caseDeleteAction(DeleteAction object) {
				return createDeleteActionAdapter();
			}
			@Override
			public Adapter caseMoveAction(MoveAction object) {
				return createMoveActionAdapter();
			}
			@Override
			public Adapter caseChangeAction(ChangeAction object) {
				return createChangeActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.AEmilia.AEmiliaAddAction <em>Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaAddAction
	 * @generated
	 */
	public Adapter createAEmiliaAddActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.AEmilia.AEmiliaDeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaDeleteAction
	 * @generated
	 */
	public Adapter createAEmiliaDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.AEmilia.AEmiliaMoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaMoveAction
	 * @generated
	 */
	public Adapter createAEmiliaMoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction <em>Clone AEI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction
	 * @generated
	 */
	public Adapter createAEmiliaCloneAEIActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction <em>Const Changes Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction
	 * @generated
	 */
	public Adapter createAEmiliaConstChangesActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.AEmilia.AEmiliaChangeAction <em>Change Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaChangeAction
	 * @generated
	 */
	public Adapter createAEmiliaChangeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction <em>Remove Cloned AEI Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction
	 * @generated
	 */
	public Adapter createAEmiliaRemoveClonedAEIActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.AddAction <em>Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.AddAction
	 * @generated
	 */
	public Adapter createAddActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.DeleteAction
	 * @generated
	 */
	public Adapter createDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.MoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.MoveAction
	 * @generated
	 */
	public Adapter createMoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.ChangeAction <em>Change Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.ChangeAction
	 * @generated
	 */
	public Adapter createChangeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AEmiliaAdapterFactory
