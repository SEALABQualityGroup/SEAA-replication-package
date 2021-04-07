/**
 */
package logicalSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.Condition#getConditionFormula <em>Condition Formula</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Formula</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.FOLSpecification#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Formula</em>' containment reference.
	 * @see #setConditionFormula(FOLSpecification)
	 * @see logicalSpecification.LogicalSpecificationPackage#getCondition_ConditionFormula()
	 * @see logicalSpecification.FOLSpecification#getCondition
	 * @model opposite="condition" containment="true" required="true"
	 * @generated
	 */
	FOLSpecification getConditionFormula();

	/**
	 * Sets the value of the '{@link logicalSpecification.Condition#getConditionFormula <em>Condition Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Formula</em>' containment reference.
	 * @see #getConditionFormula()
	 * @generated
	 */
	void setConditionFormula(FOLSpecification value);

} // Condition
