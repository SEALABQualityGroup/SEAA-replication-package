/**
 */
package logicalSpecification.actions.UML.util;

import logicalSpecification.Action;
import logicalSpecification.AddAction;
import logicalSpecification.DeleteAction;
import logicalSpecification.MoveAction;
import logicalSpecification.NamedElement;

import logicalSpecification.actions.UML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.actions.UML.UMLPackage
 * @generated
 */
public class UMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UMLPackage.eINSTANCE;
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
	protected UMLSwitch<Adapter> modelSwitch =
		new UMLSwitch<Adapter>() {
			@Override
			public Adapter caseUMLAddAction(UMLAddAction object) {
				return createUMLAddActionAdapter();
			}
			@Override
			public Adapter caseUMLDeleteAction(UMLDeleteAction object) {
				return createUMLDeleteActionAdapter();
			}
			@Override
			public Adapter caseUMLMoveAction(UMLMoveAction object) {
				return createUMLMoveActionAdapter();
			}
			@Override
			public Adapter caseUMLAddNodeAction(UMLAddNodeAction object) {
				return createUMLAddNodeActionAdapter();
			}
			@Override
			public Adapter caseUMLAddComponentAction(UMLAddComponentAction object) {
				return createUMLAddComponentActionAdapter();
			}
			@Override
			public Adapter caseUMLAddOperationAction(UMLAddOperationAction object) {
				return createUMLAddOperationActionAdapter();
			}
			@Override
			public Adapter caseUMLDeleteNodeAction(UMLDeleteNodeAction object) {
				return createUMLDeleteNodeActionAdapter();
			}
			@Override
			public Adapter caseUMLDeleteComponentAction(UMLDeleteComponentAction object) {
				return createUMLDeleteComponentActionAdapter();
			}
			@Override
			public Adapter caseUMLDeleteOperationAction(UMLDeleteOperationAction object) {
				return createUMLDeleteOperationActionAdapter();
			}
			@Override
			public Adapter caseUMLMoveComponentAction(UMLMoveComponentAction object) {
				return createUMLMoveComponentActionAdapter();
			}
			@Override
			public Adapter caseUMLMoveOperationAction(UMLMoveOperationAction object) {
				return createUMLMoveOperationActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLAddAction <em>Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLAddAction
	 * @generated
	 */
	public Adapter createUMLAddActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLDeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLDeleteAction
	 * @generated
	 */
	public Adapter createUMLDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLMoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLMoveAction
	 * @generated
	 */
	public Adapter createUMLMoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLAddNodeAction <em>Add Node Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLAddNodeAction
	 * @generated
	 */
	public Adapter createUMLAddNodeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLAddComponentAction <em>Add Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLAddComponentAction
	 * @generated
	 */
	public Adapter createUMLAddComponentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLAddOperationAction <em>Add Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLAddOperationAction
	 * @generated
	 */
	public Adapter createUMLAddOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLDeleteNodeAction <em>Delete Node Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLDeleteNodeAction
	 * @generated
	 */
	public Adapter createUMLDeleteNodeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLDeleteComponentAction <em>Delete Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLDeleteComponentAction
	 * @generated
	 */
	public Adapter createUMLDeleteComponentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLDeleteOperationAction <em>Delete Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLDeleteOperationAction
	 * @generated
	 */
	public Adapter createUMLDeleteOperationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLMoveComponentAction <em>Move Component Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLMoveComponentAction
	 * @generated
	 */
	public Adapter createUMLMoveComponentActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.actions.UML.UMLMoveOperationAction <em>Move Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.actions.UML.UMLMoveOperationAction
	 * @generated
	 */
	public Adapter createUMLMoveOperationActionAdapter() {
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

} //UMLAdapterFactory
