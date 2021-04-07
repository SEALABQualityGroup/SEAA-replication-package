/**
 */
package logicalSpecification.actions.UML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.actions.UML.UMLPackage
 * @generated
 */
public interface UMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLFactory eINSTANCE = logicalSpecification.actions.UML.impl.UMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add Node Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Node Action</em>'.
	 * @generated
	 */
	UMLAddNodeAction createUMLAddNodeAction();

	/**
	 * Returns a new object of class '<em>Add Component Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Component Action</em>'.
	 * @generated
	 */
	UMLAddComponentAction createUMLAddComponentAction();

	/**
	 * Returns a new object of class '<em>Add Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Operation Action</em>'.
	 * @generated
	 */
	UMLAddOperationAction createUMLAddOperationAction();

	/**
	 * Returns a new object of class '<em>Delete Node Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Node Action</em>'.
	 * @generated
	 */
	UMLDeleteNodeAction createUMLDeleteNodeAction();

	/**
	 * Returns a new object of class '<em>Delete Component Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Component Action</em>'.
	 * @generated
	 */
	UMLDeleteComponentAction createUMLDeleteComponentAction();

	/**
	 * Returns a new object of class '<em>Delete Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Operation Action</em>'.
	 * @generated
	 */
	UMLDeleteOperationAction createUMLDeleteOperationAction();

	/**
	 * Returns a new object of class '<em>Move Component Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Component Action</em>'.
	 * @generated
	 */
	UMLMoveComponentAction createUMLMoveComponentAction();

	/**
	 * Returns a new object of class '<em>Move Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Operation Action</em>'.
	 * @generated
	 */
	UMLMoveOperationAction createUMLMoveOperationAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLPackage getUMLPackage();

} //UMLFactory
