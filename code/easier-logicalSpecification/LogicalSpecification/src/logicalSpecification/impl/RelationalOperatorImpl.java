/**
 */
package logicalSpecification.impl;

import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.Parameter;
import logicalSpecification.RelationalOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.RelationalOperatorImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link logicalSpecification.impl.RelationalOperatorImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link logicalSpecification.impl.RelationalOperatorImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationalOperatorImpl extends OperatorImpl implements RelationalOperator {
	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected double factor = FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected Parameter lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected Parameter rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.RELATIONAL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(double newFactor) {
		double oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.RELATIONAL_OPERATOR__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getLhs() {
		if (lhs != null && lhs.eIsProxy()) {
			InternalEObject oldLhs = (InternalEObject)lhs;
			lhs = (Parameter)eResolveProxy(oldLhs);
			if (lhs != oldLhs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS, oldLhs, lhs));
			}
		}
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(Parameter newLhs, NotificationChain msgs) {
		Parameter oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(Parameter newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR, Parameter.class, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR, Parameter.class, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getRhs() {
		if (rhs != null && rhs.eIsProxy()) {
			InternalEObject oldRhs = (InternalEObject)rhs;
			rhs = (Parameter)eResolveProxy(oldRhs);
			if (rhs != oldRhs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS, oldRhs, rhs));
			}
		}
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(Parameter newRhs, NotificationChain msgs) {
		Parameter oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(Parameter newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject)rhs).eInverseRemove(this, LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR, Parameter.class, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR, Parameter.class, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS:
				if (lhs != null)
					msgs = ((InternalEObject)lhs).eInverseRemove(this, LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR, Parameter.class, msgs);
				return basicSetLhs((Parameter)otherEnd, msgs);
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS:
				if (rhs != null)
					msgs = ((InternalEObject)rhs).eInverseRemove(this, LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR, Parameter.class, msgs);
				return basicSetRhs((Parameter)otherEnd, msgs);
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
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS:
				return basicSetLhs(null, msgs);
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS:
				return basicSetRhs(null, msgs);
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
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__FACTOR:
				return getFactor();
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS:
				if (resolve) return getLhs();
				return basicGetLhs();
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS:
				if (resolve) return getRhs();
				return basicGetRhs();
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
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__FACTOR:
				setFactor((Double)newValue);
				return;
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS:
				setLhs((Parameter)newValue);
				return;
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS:
				setRhs((Parameter)newValue);
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
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__FACTOR:
				setFactor(FACTOR_EDEFAULT);
				return;
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS:
				setLhs((Parameter)null);
				return;
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS:
				setRhs((Parameter)null);
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
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__FACTOR:
				return factor != FACTOR_EDEFAULT;
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS:
				return lhs != null;
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS:
				return rhs != null;
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
		result.append(" (factor: ");
		result.append(factor);
		result.append(')');
		return result.toString();
	}

} //RelationalOperatorImpl
