/**
 */
package logicalSpecification.actions.AEmilia;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage
 * @generated
 */
public interface AEmiliaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AEmiliaFactory eINSTANCE = logicalSpecification.actions.AEmilia.impl.AEmiliaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Clone AEI Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clone AEI Action</em>'.
	 * @generated
	 */
	AEmiliaCloneAEIAction createAEmiliaCloneAEIAction();

	/**
	 * Returns a new object of class '<em>Const Changes Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Changes Action</em>'.
	 * @generated
	 */
	AEmiliaConstChangesAction createAEmiliaConstChangesAction();

	/**
	 * Returns a new object of class '<em>Change Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Action</em>'.
	 * @generated
	 */
	AEmiliaChangeAction createAEmiliaChangeAction();

	/**
	 * Returns a new object of class '<em>Remove Cloned AEI Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Cloned AEI Action</em>'.
	 * @generated
	 */
	AEmiliaRemoveClonedAEIAction createAEmiliaRemoveClonedAEIAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AEmiliaPackage getAEmiliaPackage();

} //AEmiliaFactory
