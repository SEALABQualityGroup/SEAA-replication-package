/**
 */
package logicalSpecification.antipatterns.performance.util;

import logicalSpecification.Antipattern;
import logicalSpecification.NamedElement;

import logicalSpecification.antipatterns.performance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.antipatterns.performance.PerformancePackage
 * @generated
 */
public class PerformanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerformancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PerformancePackage.eINSTANCE;
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
	protected PerformanceSwitch<Adapter> modelSwitch =
		new PerformanceSwitch<Adapter>() {
			@Override
			public Adapter casePerformanceAntipattern(PerformanceAntipattern object) {
				return createPerformanceAntipatternAdapter();
			}
			@Override
			public Adapter caseBlobPA(BlobPA object) {
				return createBlobPAAdapter();
			}
			@Override
			public Adapter caseCpsPA(CpsPA object) {
				return createCpsPAAdapter();
			}
			@Override
			public Adapter casePafPA(PafPA object) {
				return createPafPAAdapter();
			}
			@Override
			public Adapter caseEpPA(EpPA object) {
				return createEpPAAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAntipattern(Antipattern object) {
				return createAntipatternAdapter();
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
	 * Creates a new adapter for an object of class '{@link logicalSpecification.antipatterns.performance.PerformanceAntipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.antipatterns.performance.PerformanceAntipattern
	 * @generated
	 */
	public Adapter createPerformanceAntipatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.antipatterns.performance.BlobPA <em>Blob PA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.antipatterns.performance.BlobPA
	 * @generated
	 */
	public Adapter createBlobPAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.antipatterns.performance.CpsPA <em>Cps PA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.antipatterns.performance.CpsPA
	 * @generated
	 */
	public Adapter createCpsPAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.antipatterns.performance.PafPA <em>Paf PA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.antipatterns.performance.PafPA
	 * @generated
	 */
	public Adapter createPafPAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.antipatterns.performance.EpPA <em>Ep PA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.antipatterns.performance.EpPA
	 * @generated
	 */
	public Adapter createEpPAAdapter() {
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
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Antipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Antipattern
	 * @generated
	 */
	public Adapter createAntipatternAdapter() {
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

} //PerformanceAdapterFactory
