/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lo La4 RAPS Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.LoLa4RAPSRoot#getRefactorings <em>Refactorings</em>}</li>
 *   <li>{@link logicalSpecification.LoLa4RAPSRoot#getAntipatterns <em>Antipatterns</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getLoLa4RAPSRoot()
 * @model
 * @generated
 */
public interface LoLa4RAPSRoot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Refactorings</b></em>' containment reference list.
	 * The list contents are of type {@link logicalSpecification.Refactoring}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Refactoring#getLola4rapsRoot <em>Lola4raps Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refactorings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactorings</em>' containment reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getLoLa4RAPSRoot_Refactorings()
	 * @see logicalSpecification.Refactoring#getLola4rapsRoot
	 * @model opposite="lola4rapsRoot" containment="true"
	 * @generated
	 */
	EList<Refactoring> getRefactorings();

	/**
	 * Returns the value of the '<em><b>Antipatterns</b></em>' containment reference list.
	 * The list contents are of type {@link logicalSpecification.Antipattern}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Antipattern#getLola4rapsRoot <em>Lola4raps Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antipatterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antipatterns</em>' containment reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getLoLa4RAPSRoot_Antipatterns()
	 * @see logicalSpecification.Antipattern#getLola4rapsRoot
	 * @model opposite="lola4rapsRoot" containment="true"
	 * @generated
	 */
	EList<Antipattern> getAntipatterns();

} // LoLa4RAPSRoot
