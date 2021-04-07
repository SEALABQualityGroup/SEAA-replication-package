/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antipattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.Antipattern#getLola4rapsRoot <em>Lola4raps Root</em>}</li>
 *   <li>{@link logicalSpecification.Antipattern#getParameters <em>Parameters</em>}</li>
 *   <li>{@link logicalSpecification.Antipattern#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getAntipattern()
 * @model
 * @generated
 */
public interface Antipattern extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Lola4raps Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.LoLa4RAPSRoot#getAntipatterns <em>Antipatterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lola4raps Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lola4raps Root</em>' container reference.
	 * @see #setLola4rapsRoot(LoLa4RAPSRoot)
	 * @see logicalSpecification.LogicalSpecificationPackage#getAntipattern_Lola4rapsRoot()
	 * @see logicalSpecification.LoLa4RAPSRoot#getAntipatterns
	 * @model opposite="antipatterns" transient="false"
	 * @generated
	 */
	LoLa4RAPSRoot getLola4rapsRoot();

	/**
	 * Sets the value of the '{@link logicalSpecification.Antipattern#getLola4rapsRoot <em>Lola4raps Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lola4raps Root</em>' container reference.
	 * @see #getLola4rapsRoot()
	 * @generated
	 */
	void setLola4rapsRoot(LoLa4RAPSRoot value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link logicalSpecification.Parameter}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Parameter#getAntipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getAntipattern_Parameters()
	 * @see logicalSpecification.Parameter#getAntipattern
	 * @model opposite="antipattern" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.FOLSpecification#getAntipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(FOLSpecification)
	 * @see logicalSpecification.LogicalSpecificationPackage#getAntipattern_Formula()
	 * @see logicalSpecification.FOLSpecification#getAntipattern
	 * @model opposite="antipattern" containment="true" required="true"
	 * @generated
	 */
	FOLSpecification getFormula();

	/**
	 * Sets the value of the '{@link logicalSpecification.Antipattern#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(FOLSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setParametersForPartialDetection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void partialDetection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setParametersForFullDetection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fullDetection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void log();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createFormula();

} // Antipattern
