/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.AndOperator#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getAndOperator()
 * @model
 * @generated
 */
public interface AndOperator extends LogicalOperator {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link logicalSpecification.Operator}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Operator#getAndOperator <em>And Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getAndOperator_Arguments()
	 * @see logicalSpecification.Operator#getAndOperator
	 * @model opposite="andOperator" containment="true" lower="2"
	 * @generated
	 */
	EList<Operator> getArguments();

} // AndOperator
