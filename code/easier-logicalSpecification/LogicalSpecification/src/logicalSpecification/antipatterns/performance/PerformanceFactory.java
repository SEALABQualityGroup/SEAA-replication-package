/**
 */
package logicalSpecification.antipatterns.performance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.antipatterns.performance.PerformancePackage
 * @generated
 */
public interface PerformanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerformanceFactory eINSTANCE = logicalSpecification.antipatterns.performance.impl.PerformanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blob PA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob PA</em>'.
	 * @generated
	 */
	BlobPA createBlobPA();

	/**
	 * Returns a new object of class '<em>Cps PA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cps PA</em>'.
	 * @generated
	 */
	CpsPA createCpsPA();

	/**
	 * Returns a new object of class '<em>Paf PA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paf PA</em>'.
	 * @generated
	 */
	PafPA createPafPA();

	/**
	 * Returns a new object of class '<em>Ep PA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ep PA</em>'.
	 * @generated
	 */
	EpPA createEpPA();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PerformancePackage getPerformancePackage();

} //PerformanceFactory
