/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Valued Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.MultipleValuedParameter#getForAllOperator <em>For All Operator</em>}</li>
 *   <li>{@link logicalSpecification.MultipleValuedParameter#getExistsOperator <em>Exists Operator</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getMultipleValuedParameter()
 * @model
 * @generated
 */
public interface MultipleValuedParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>For All Operator</b></em>' reference list.
	 * The list contents are of type {@link logicalSpecification.ForAllOperator}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.ForAllOperator#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For All Operator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For All Operator</em>' reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getMultipleValuedParameter_ForAllOperator()
	 * @see logicalSpecification.ForAllOperator#getCollection
	 * @model opposite="collection"
	 * @generated
	 */
	EList<ForAllOperator> getForAllOperator();

	/**
	 * Returns the value of the '<em><b>Exists Operator</b></em>' reference list.
	 * The list contents are of type {@link logicalSpecification.ExistsOperator}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.ExistsOperator#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exists Operator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists Operator</em>' reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getMultipleValuedParameter_ExistsOperator()
	 * @see logicalSpecification.ExistsOperator#getCollection
	 * @model opposite="collection"
	 * @generated
	 */
	EList<ExistsOperator> getExistsOperator();

} // MultipleValuedParameter
