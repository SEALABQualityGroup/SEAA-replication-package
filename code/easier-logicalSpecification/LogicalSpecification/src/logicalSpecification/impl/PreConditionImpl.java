/**
 */
package logicalSpecification.impl;

import logicalSpecification.Action;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.PreCondition;
import logicalSpecification.Refactoring;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.PreConditionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link logicalSpecification.impl.PreConditionImpl#getRefactoring <em>Refactoring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreConditionImpl extends ConditionImpl implements PreCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.PRE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.PRE_CONDITION__ACTION) return null;
		return (Action)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAction, LogicalSpecificationPackage.PRE_CONDITION__ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.PRE_CONDITION__ACTION && newAction != null)) {
			if (EcoreUtil.isAncestor(this, newAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, LogicalSpecificationPackage.ACTION__PRE, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.PRE_CONDITION__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring getRefactoring() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.PRE_CONDITION__REFACTORING) return null;
		return (Refactoring)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefactoring(Refactoring newRefactoring, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRefactoring, LogicalSpecificationPackage.PRE_CONDITION__REFACTORING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefactoring(Refactoring newRefactoring) {
		if (newRefactoring != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.PRE_CONDITION__REFACTORING && newRefactoring != null)) {
			if (EcoreUtil.isAncestor(this, newRefactoring))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRefactoring != null)
				msgs = ((InternalEObject)newRefactoring).eInverseAdd(this, LogicalSpecificationPackage.REFACTORING__PRE, Refactoring.class, msgs);
			msgs = basicSetRefactoring(newRefactoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.PRE_CONDITION__REFACTORING, newRefactoring, newRefactoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.PRE_CONDITION__ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAction((Action)otherEnd, msgs);
			case LogicalSpecificationPackage.PRE_CONDITION__REFACTORING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRefactoring((Refactoring)otherEnd, msgs);
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
			case LogicalSpecificationPackage.PRE_CONDITION__ACTION:
				return basicSetAction(null, msgs);
			case LogicalSpecificationPackage.PRE_CONDITION__REFACTORING:
				return basicSetRefactoring(null, msgs);
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
			case LogicalSpecificationPackage.PRE_CONDITION__ACTION:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.ACTION__PRE, Action.class, msgs);
			case LogicalSpecificationPackage.PRE_CONDITION__REFACTORING:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.REFACTORING__PRE, Refactoring.class, msgs);
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
			case LogicalSpecificationPackage.PRE_CONDITION__ACTION:
				return getAction();
			case LogicalSpecificationPackage.PRE_CONDITION__REFACTORING:
				return getRefactoring();
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
			case LogicalSpecificationPackage.PRE_CONDITION__ACTION:
				setAction((Action)newValue);
				return;
			case LogicalSpecificationPackage.PRE_CONDITION__REFACTORING:
				setRefactoring((Refactoring)newValue);
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
			case LogicalSpecificationPackage.PRE_CONDITION__ACTION:
				setAction((Action)null);
				return;
			case LogicalSpecificationPackage.PRE_CONDITION__REFACTORING:
				setRefactoring((Refactoring)null);
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
			case LogicalSpecificationPackage.PRE_CONDITION__ACTION:
				return getAction() != null;
			case LogicalSpecificationPackage.PRE_CONDITION__REFACTORING:
				return getRefactoring() != null;
		}
		return super.eIsSet(featureID);
	}

} //PreConditionImpl
