/**
 */
package logicalSpecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FOL Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.FOLSpecification#getCondition <em>Condition</em>}</li>
 *   <li>{@link logicalSpecification.FOLSpecification#getRootOperator <em>Root Operator</em>}</li>
 *   <li>{@link logicalSpecification.FOLSpecification#getAntipattern <em>Antipattern</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getFOLSpecification()
 * @model
 * @generated
 */
public interface FOLSpecification extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Condition#getConditionFormula <em>Condition Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' container reference.
	 * @see #setCondition(Condition)
	 * @see logicalSpecification.LogicalSpecificationPackage#getFOLSpecification_Condition()
	 * @see logicalSpecification.Condition#getConditionFormula
	 * @model opposite="conditionFormula" transient="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link logicalSpecification.FOLSpecification#getCondition <em>Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' container reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Root Operator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Operator#getFolspecification <em>Folspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Operator</em>' containment reference.
	 * @see #setRootOperator(Operator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getFOLSpecification_RootOperator()
	 * @see logicalSpecification.Operator#getFolspecification
	 * @model opposite="folspecification" containment="true" required="true"
	 * @generated
	 */
	Operator getRootOperator();

	/**
	 * Sets the value of the '{@link logicalSpecification.FOLSpecification#getRootOperator <em>Root Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Operator</em>' containment reference.
	 * @see #getRootOperator()
	 * @generated
	 */
	void setRootOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Antipattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Antipattern#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antipattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antipattern</em>' container reference.
	 * @see #setAntipattern(Antipattern)
	 * @see logicalSpecification.LogicalSpecificationPackage#getFOLSpecification_Antipattern()
	 * @see logicalSpecification.Antipattern#getFormula
	 * @model opposite="formula" transient="false"
	 * @generated
	 */
	Antipattern getAntipattern();

	/**
	 * Sets the value of the '{@link logicalSpecification.FOLSpecification#getAntipattern <em>Antipattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antipattern</em>' container reference.
	 * @see #getAntipattern()
	 * @generated
	 */
	void setAntipattern(Antipattern value);

} // FOLSpecification
