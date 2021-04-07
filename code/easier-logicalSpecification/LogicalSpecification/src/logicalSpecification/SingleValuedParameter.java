/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Valued Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.SingleValuedParameter#getExistsOperator <em>Exists Operator</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getSingleValuedParameter()
 * @model
 * @generated
 */
public interface SingleValuedParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Exists Operator</b></em>' reference list.
	 * The list contents are of type {@link logicalSpecification.ExistsOperator}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.ExistsOperator#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exists Operator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists Operator</em>' reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getSingleValuedParameter_ExistsOperator()
	 * @see logicalSpecification.ExistsOperator#getElement
	 * @model opposite="element"
	 * @generated
	 */
	EList<ExistsOperator> getExistsOperator();

} // SingleValuedParameter
