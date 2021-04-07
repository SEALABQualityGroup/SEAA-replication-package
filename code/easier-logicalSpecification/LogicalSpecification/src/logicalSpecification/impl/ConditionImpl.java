/**
 */
package logicalSpecification.impl;

import logicalSpecification.Condition;
import logicalSpecification.FOLSpecification;
import logicalSpecification.LogicalSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.ConditionImpl#getConditionFormula <em>Condition Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getConditionFormula() <em>Condition Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionFormula()
	 * @generated
	 * @ordered
	 */
	protected FOLSpecification conditionFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOLSpecification getConditionFormula() {
		return conditionFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionFormula(FOLSpecification newConditionFormula, NotificationChain msgs) {
		FOLSpecification oldConditionFormula = conditionFormula;
		conditionFormula = newConditionFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA, oldConditionFormula, newConditionFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionFormula(FOLSpecification newConditionFormula) {
		if (newConditionFormula != conditionFormula) {
			NotificationChain msgs = null;
			if (conditionFormula != null)
				msgs = ((InternalEObject)conditionFormula).eInverseRemove(this, LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION, FOLSpecification.class, msgs);
			if (newConditionFormula != null)
				msgs = ((InternalEObject)newConditionFormula).eInverseAdd(this, LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION, FOLSpecification.class, msgs);
			msgs = basicSetConditionFormula(newConditionFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA, newConditionFormula, newConditionFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA:
				if (conditionFormula != null)
					msgs = ((InternalEObject)conditionFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA, null, msgs);
				return basicSetConditionFormula((FOLSpecification)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA:
				return basicSetConditionFormula(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA:
				return getConditionFormula();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA:
				setConditionFormula((FOLSpecification)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA:
				setConditionFormula((FOLSpecification)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA:
				return conditionFormula != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
