/**
 */
package logicalSpecification.antipatterns.performance.util;

import logicalSpecification.Antipattern;
import logicalSpecification.NamedElement;

import logicalSpecification.antipatterns.performance.*;

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
 * @see logicalSpecification.antipatterns.performance.PerformancePackage
 * @generated
 */
public class PerformanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerformancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceSwitch() {
		if (modelPackage == null) {
			modelPackage = PerformancePackage.eINSTANCE;
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
			case PerformancePackage.PERFORMANCE_ANTIPATTERN: {
				PerformanceAntipattern performanceAntipattern = (PerformanceAntipattern)theEObject;
				T result = casePerformanceAntipattern(performanceAntipattern);
				if (result == null) result = caseAntipattern(performanceAntipattern);
				if (result == null) result = caseNamedElement(performanceAntipattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.BLOB_PA: {
				BlobPA blobPA = (BlobPA)theEObject;
				T result = caseBlobPA(blobPA);
				if (result == null) result = casePerformanceAntipattern(blobPA);
				if (result == null) result = caseAntipattern(blobPA);
				if (result == null) result = caseNamedElement(blobPA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.CPS_PA: {
				CpsPA cpsPA = (CpsPA)theEObject;
				T result = caseCpsPA(cpsPA);
				if (result == null) result = casePerformanceAntipattern(cpsPA);
				if (result == null) result = caseAntipattern(cpsPA);
				if (result == null) result = caseNamedElement(cpsPA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.PAF_PA: {
				PafPA pafPA = (PafPA)theEObject;
				T result = casePafPA(pafPA);
				if (result == null) result = casePerformanceAntipattern(pafPA);
				if (result == null) result = caseAntipattern(pafPA);
				if (result == null) result = caseNamedElement(pafPA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PerformancePackage.EP_PA: {
				EpPA epPA = (EpPA)theEObject;
				T result = caseEpPA(epPA);
				if (result == null) result = casePerformanceAntipattern(epPA);
				if (result == null) result = caseAntipattern(epPA);
				if (result == null) result = caseNamedElement(epPA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antipattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antipattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceAntipattern(PerformanceAntipattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob PA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob PA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlobPA(BlobPA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cps PA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cps PA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpsPA(CpsPA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paf PA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paf PA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePafPA(PafPA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ep PA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ep PA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpPA(EpPA object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Antipattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antipattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntipattern(Antipattern object) {
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

} //PerformanceSwitch
