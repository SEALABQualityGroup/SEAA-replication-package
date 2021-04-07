/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.OrOperator#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getOrOperator()
 * @model
 * @generated
 */
public interface OrOperator extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link logicalSpecification.Operator}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Operator#getOrOperator <em>Or Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getOrOperator_Arguments()
	 * @see logicalSpecification.Operator#getOrOperator
	 * @model opposite="orOperator" containment="true" lower="2"
	 * @generated
	 */
	EList<Operator> getArguments();

} // OrOperator
