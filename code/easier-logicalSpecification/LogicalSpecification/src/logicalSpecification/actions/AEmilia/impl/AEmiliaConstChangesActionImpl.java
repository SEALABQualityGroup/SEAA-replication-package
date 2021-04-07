/**
 */
package logicalSpecification.actions.AEmilia.impl;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction;
import logicalSpecification.actions.AEmilia.AEmiliaPackage;

import metamodel.mmaemilia.Headers.ConstInit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Changes Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl#getSourceConstInit <em>Source Const Init</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl#getFactorOfChange <em>Factor Of Change</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl#getSourceConstInitSVP <em>Source Const Init SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaConstChangesActionImpl#getAllConstInitsMVP <em>All Const Inits MVP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AEmiliaConstChangesActionImpl extends AEmiliaChangeActionImpl implements AEmiliaConstChangesAction {
	/**
	 * The default value of the '{@link #getSourceConstInit() <em>Source Const Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConstInit()
	 * @generated
	 * @ordered
	 */
	protected static final ConstInit SOURCE_CONST_INIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceConstInit() <em>Source Const Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConstInit()
	 * @generated
	 * @ordered
	 */
	protected ConstInit sourceConstInit = SOURCE_CONST_INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactorOfChange() <em>Factor Of Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorOfChange()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_OF_CHANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFactorOfChange() <em>Factor Of Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorOfChange()
	 * @generated
	 * @ordered
	 */
	protected double factorOfChange = FACTOR_OF_CHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceConstInitSVP() <em>Source Const Init SVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConstInitSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter sourceConstInitSVP;

	/**
	 * The cached value of the '{@link #getAllConstInitsMVP() <em>All Const Inits MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllConstInitsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allConstInitsMVP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AEmiliaConstChangesActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AEmiliaPackage.Literals.AEMILIA_CONST_CHANGES_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstInit getSourceConstInit() {
		return sourceConstInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConstInit(ConstInit newSourceConstInit) {
		ConstInit oldSourceConstInit = sourceConstInit;
		sourceConstInit = newSourceConstInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT, oldSourceConstInit, sourceConstInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFactorOfChange() {
		return factorOfChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactorOfChange(double newFactorOfChange) {
		double oldFactorOfChange = factorOfChange;
		factorOfChange = newFactorOfChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE, oldFactorOfChange, factorOfChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getSourceConstInitSVP() {
		return sourceConstInitSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceConstInitSVP(SingleValuedParameter newSourceConstInitSVP, NotificationChain msgs) {
		SingleValuedParameter oldSourceConstInitSVP = sourceConstInitSVP;
		sourceConstInitSVP = newSourceConstInitSVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP, oldSourceConstInitSVP, newSourceConstInitSVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceConstInitSVP(SingleValuedParameter newSourceConstInitSVP) {
		if (newSourceConstInitSVP != sourceConstInitSVP) {
			NotificationChain msgs = null;
			if (sourceConstInitSVP != null)
				msgs = ((InternalEObject)sourceConstInitSVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP, null, msgs);
			if (newSourceConstInitSVP != null)
				msgs = ((InternalEObject)newSourceConstInitSVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP, null, msgs);
			msgs = basicSetSourceConstInitSVP(newSourceConstInitSVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP, newSourceConstInitSVP, newSourceConstInitSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllConstInitsMVP() {
		return allConstInitsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllConstInitsMVP(MultipleValuedParameter newAllConstInitsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllConstInitsMVP = allConstInitsMVP;
		allConstInitsMVP = newAllConstInitsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP, oldAllConstInitsMVP, newAllConstInitsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllConstInitsMVP(MultipleValuedParameter newAllConstInitsMVP) {
		if (newAllConstInitsMVP != allConstInitsMVP) {
			NotificationChain msgs = null;
			if (allConstInitsMVP != null)
				msgs = ((InternalEObject)allConstInitsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP, null, msgs);
			if (newAllConstInitsMVP != null)
				msgs = ((InternalEObject)newAllConstInitsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP, null, msgs);
			msgs = basicSetAllConstInitsMVP(newAllConstInitsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP, newAllConstInitsMVP, newAllConstInitsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP:
				return basicSetSourceConstInitSVP(null, msgs);
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP:
				return basicSetAllConstInitsMVP(null, msgs);
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
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT:
				return getSourceConstInit();
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE:
				return getFactorOfChange();
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP:
				return getSourceConstInitSVP();
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP:
				return getAllConstInitsMVP();
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
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT:
				setSourceConstInit((ConstInit)newValue);
				return;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE:
				setFactorOfChange((Double)newValue);
				return;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP:
				setSourceConstInitSVP((SingleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP:
				setAllConstInitsMVP((MultipleValuedParameter)newValue);
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
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT:
				setSourceConstInit(SOURCE_CONST_INIT_EDEFAULT);
				return;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE:
				setFactorOfChange(FACTOR_OF_CHANGE_EDEFAULT);
				return;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP:
				setSourceConstInitSVP((SingleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP:
				setAllConstInitsMVP((MultipleValuedParameter)null);
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
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT:
				return SOURCE_CONST_INIT_EDEFAULT == null ? sourceConstInit != null : !SOURCE_CONST_INIT_EDEFAULT.equals(sourceConstInit);
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__FACTOR_OF_CHANGE:
				return factorOfChange != FACTOR_OF_CHANGE_EDEFAULT;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__SOURCE_CONST_INIT_SVP:
				return sourceConstInitSVP != null;
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION__ALL_CONST_INITS_MVP:
				return allConstInitsMVP != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sourceConstInit: ");
		result.append(sourceConstInit);
		result.append(", factorOfChange: ");
		result.append(factorOfChange);
		result.append(')');
		return result.toString();
	}

} //AEmiliaConstChangesActionImpl
