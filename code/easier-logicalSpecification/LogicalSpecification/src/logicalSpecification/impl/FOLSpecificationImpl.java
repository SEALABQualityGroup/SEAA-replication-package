/**
 */
package logicalSpecification.impl;

import logicalSpecification.Antipattern;
import logicalSpecification.Condition;
import logicalSpecification.FOLSpecification;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.Operator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FOL Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.FOLSpecificationImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link logicalSpecification.impl.FOLSpecificationImpl#getRootOperator <em>Root Operator</em>}</li>
 *   <li>{@link logicalSpecification.impl.FOLSpecificationImpl#getAntipattern <em>Antipattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FOLSpecificationImpl extends NamedElementImpl implements FOLSpecification {
	/**
	 * The cached value of the '{@link #getRootOperator() <em>Root Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator rootOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FOLSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.FOL_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION) return null;
		return (Condition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCondition, LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION && newCondition != null)) {
			if (EcoreUtil.isAncestor(this, newCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getRootOperator() {
		return rootOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootOperator(Operator newRootOperator, NotificationChain msgs) {
		Operator oldRootOperator = rootOperator;
		rootOperator = newRootOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR, oldRootOperator, newRootOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootOperator(Operator newRootOperator) {
		if (newRootOperator != rootOperator) {
			NotificationChain msgs = null;
			if (rootOperator != null)
				msgs = ((InternalEObject)rootOperator).eInverseRemove(this, LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION, Operator.class, msgs);
			if (newRootOperator != null)
				msgs = ((InternalEObject)newRootOperator).eInverseAdd(this, LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION, Operator.class, msgs);
			msgs = basicSetRootOperator(newRootOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR, newRootOperator, newRootOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antipattern getAntipattern() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN) return null;
		return (Antipattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntipattern(Antipattern newAntipattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAntipattern, LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntipattern(Antipattern newAntipattern) {
		if (newAntipattern != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN && newAntipattern != null)) {
			if (EcoreUtil.isAncestor(this, newAntipattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAntipattern != null)
				msgs = ((InternalEObject)newAntipattern).eInverseAdd(this, LogicalSpecificationPackage.ANTIPATTERN__FORMULA, Antipattern.class, msgs);
			msgs = basicSetAntipattern(newAntipattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN, newAntipattern, newAntipattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCondition((Condition)otherEnd, msgs);
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR:
				if (rootOperator != null)
					msgs = ((InternalEObject)rootOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR, null, msgs);
				return basicSetRootOperator((Operator)otherEnd, msgs);
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAntipattern((Antipattern)otherEnd, msgs);
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
			case LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION:
				return basicSetCondition(null, msgs);
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR:
				return basicSetRootOperator(null, msgs);
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN:
				return basicSetAntipattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.CONDITION__CONDITION_FORMULA, Condition.class, msgs);
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.ANTIPATTERN__FORMULA, Antipattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION:
				return getCondition();
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR:
				return getRootOperator();
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN:
				return getAntipattern();
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
			case LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION:
				setCondition((Condition)newValue);
				return;
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR:
				setRootOperator((Operator)newValue);
				return;
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN:
				setAntipattern((Antipattern)newValue);
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
			case LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION:
				setCondition((Condition)null);
				return;
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR:
				setRootOperator((Operator)null);
				return;
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN:
				setAntipattern((Antipattern)null);
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
			case LogicalSpecificationPackage.FOL_SPECIFICATION__CONDITION:
				return getCondition() != null;
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR:
				return rootOperator != null;
			case LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN:
				return getAntipattern() != null;
		}
		return super.eIsSet(featureID);
	}

} //FOLSpecificationImpl
