/**
 */
package logicalSpecification.actions.AEmilia;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import metamodel.mmaemilia.Headers.ConstInit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Changes Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInit <em>Source Const Init</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getFactorOfChange <em>Factor Of Change</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInitSVP <em>Source Const Init SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getAllConstInitsMVP <em>All Const Inits MVP</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaConstChangesAction()
 * @model
 * @generated
 */
public interface AEmiliaConstChangesAction extends AEmiliaChangeAction {
	/**
	 * Returns the value of the '<em><b>Source Const Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Const Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Const Init</em>' attribute.
	 * @see #setSourceConstInit(ConstInit)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaConstChangesAction_SourceConstInit()
	 * @model dataType="logicalSpecification.actions.AEmilia.ConstInit"
	 * @generated
	 */
	ConstInit getSourceConstInit();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInit <em>Source Const Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Const Init</em>' attribute.
	 * @see #getSourceConstInit()
	 * @generated
	 */
	void setSourceConstInit(ConstInit value);

	/**
	 * Returns the value of the '<em><b>Factor Of Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor Of Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor Of Change</em>' attribute.
	 * @see #setFactorOfChange(double)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaConstChangesAction_FactorOfChange()
	 * @model
	 * @generated
	 */
	double getFactorOfChange();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getFactorOfChange <em>Factor Of Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor Of Change</em>' attribute.
	 * @see #getFactorOfChange()
	 * @generated
	 */
	void setFactorOfChange(double value);

	/**
	 * Returns the value of the '<em><b>Source Const Init SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Const Init SVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Const Init SVP</em>' containment reference.
	 * @see #setSourceConstInitSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaConstChangesAction_SourceConstInitSVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleValuedParameter getSourceConstInitSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getSourceConstInitSVP <em>Source Const Init SVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Const Init SVP</em>' containment reference.
	 * @see #getSourceConstInitSVP()
	 * @generated
	 */
	void setSourceConstInitSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Const Inits MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Const Inits MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Const Inits MVP</em>' containment reference.
	 * @see #setAllConstInitsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaConstChangesAction_AllConstInitsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllConstInitsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction#getAllConstInitsMVP <em>All Const Inits MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Const Inits MVP</em>' containment reference.
	 * @see #getAllConstInitsMVP()
	 * @generated
	 */
	void setAllConstInitsMVP(MultipleValuedParameter value);

} // AEmiliaConstChangesAction
