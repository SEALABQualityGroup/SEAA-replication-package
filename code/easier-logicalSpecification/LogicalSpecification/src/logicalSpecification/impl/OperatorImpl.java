/**
 */
package logicalSpecification.impl;

import java.lang.reflect.InvocationTargetException;

import logicalSpecification.AndOperator;
import logicalSpecification.ExistsOperator;
import logicalSpecification.FOLSpecification;
import logicalSpecification.ForAllOperator;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.NotOperator;
import logicalSpecification.Operator;
import logicalSpecification.OrOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.OperatorImpl#getFolspecification <em>Folspecification</em>}</li>
 *   <li>{@link logicalSpecification.impl.OperatorImpl#getForAlloperator <em>For Alloperator</em>}</li>
 *   <li>{@link logicalSpecification.impl.OperatorImpl#getNotOperator <em>Not Operator</em>}</li>
 *   <li>{@link logicalSpecification.impl.OperatorImpl#getAndOperator <em>And Operator</em>}</li>
 *   <li>{@link logicalSpecification.impl.OperatorImpl#getOrOperator <em>Or Operator</em>}</li>
 *   <li>{@link logicalSpecification.impl.OperatorImpl#getExistsOperator <em>Exists Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperatorImpl extends MinimalEObjectImpl.Container implements Operator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOLSpecification getFolspecification() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION) return null;
		return (FOLSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolspecification(FOLSpecification newFolspecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFolspecification, LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolspecification(FOLSpecification newFolspecification) {
		if (newFolspecification != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION && newFolspecification != null)) {
			if (EcoreUtil.isAncestor(this, newFolspecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFolspecification != null)
				msgs = ((InternalEObject)newFolspecification).eInverseAdd(this, LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR, FOLSpecification.class, msgs);
			msgs = basicSetFolspecification(newFolspecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION, newFolspecification, newFolspecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllOperator getForAlloperator() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR) return null;
		return (ForAllOperator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForAlloperator(ForAllOperator newForAlloperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newForAlloperator, LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForAlloperator(ForAllOperator newForAlloperator) {
		if (newForAlloperator != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR && newForAlloperator != null)) {
			if (EcoreUtil.isAncestor(this, newForAlloperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newForAlloperator != null)
				msgs = ((InternalEObject)newForAlloperator).eInverseAdd(this, LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT, ForAllOperator.class, msgs);
			msgs = basicSetForAlloperator(newForAlloperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR, newForAlloperator, newForAlloperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOperator getNotOperator() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR) return null;
		return (NotOperator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotOperator(NotOperator newNotOperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNotOperator, LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotOperator(NotOperator newNotOperator) {
		if (newNotOperator != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR && newNotOperator != null)) {
			if (EcoreUtil.isAncestor(this, newNotOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNotOperator != null)
				msgs = ((InternalEObject)newNotOperator).eInverseAdd(this, LogicalSpecificationPackage.NOT_OPERATOR__ARGUMENT, NotOperator.class, msgs);
			msgs = basicSetNotOperator(newNotOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR, newNotOperator, newNotOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndOperator getAndOperator() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__AND_OPERATOR) return null;
		return (AndOperator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndOperator(AndOperator newAndOperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAndOperator, LogicalSpecificationPackage.OPERATOR__AND_OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAndOperator(AndOperator newAndOperator) {
		if (newAndOperator != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__AND_OPERATOR && newAndOperator != null)) {
			if (EcoreUtil.isAncestor(this, newAndOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAndOperator != null)
				msgs = ((InternalEObject)newAndOperator).eInverseAdd(this, LogicalSpecificationPackage.AND_OPERATOR__ARGUMENTS, AndOperator.class, msgs);
			msgs = basicSetAndOperator(newAndOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.OPERATOR__AND_OPERATOR, newAndOperator, newAndOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrOperator getOrOperator() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__OR_OPERATOR) return null;
		return (OrOperator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrOperator(OrOperator newOrOperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrOperator, LogicalSpecificationPackage.OPERATOR__OR_OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrOperator(OrOperator newOrOperator) {
		if (newOrOperator != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__OR_OPERATOR && newOrOperator != null)) {
			if (EcoreUtil.isAncestor(this, newOrOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrOperator != null)
				msgs = ((InternalEObject)newOrOperator).eInverseAdd(this, LogicalSpecificationPackage.OR_OPERATOR__ARGUMENTS, OrOperator.class, msgs);
			msgs = basicSetOrOperator(newOrOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.OPERATOR__OR_OPERATOR, newOrOperator, newOrOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistsOperator getExistsOperator() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR) return null;
		return (ExistsOperator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExistsOperator(ExistsOperator newExistsOperator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExistsOperator, LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistsOperator(ExistsOperator newExistsOperator) {
		if (newExistsOperator != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR && newExistsOperator != null)) {
			if (EcoreUtil.isAncestor(this, newExistsOperator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExistsOperator != null)
				msgs = ((InternalEObject)newExistsOperator).eInverseAdd(this, LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT, ExistsOperator.class, msgs);
			msgs = basicSetExistsOperator(newExistsOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR, newExistsOperator, newExistsOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluateOperator(Object contextualElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean guarantees(Operator op) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFolspecification((FOLSpecification)otherEnd, msgs);
			case LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetForAlloperator((ForAllOperator)otherEnd, msgs);
			case LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNotOperator((NotOperator)otherEnd, msgs);
			case LogicalSpecificationPackage.OPERATOR__AND_OPERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAndOperator((AndOperator)otherEnd, msgs);
			case LogicalSpecificationPackage.OPERATOR__OR_OPERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrOperator((OrOperator)otherEnd, msgs);
			case LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExistsOperator((ExistsOperator)otherEnd, msgs);
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
			case LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION:
				return basicSetFolspecification(null, msgs);
			case LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR:
				return basicSetForAlloperator(null, msgs);
			case LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR:
				return basicSetNotOperator(null, msgs);
			case LogicalSpecificationPackage.OPERATOR__AND_OPERATOR:
				return basicSetAndOperator(null, msgs);
			case LogicalSpecificationPackage.OPERATOR__OR_OPERATOR:
				return basicSetOrOperator(null, msgs);
			case LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR:
				return basicSetExistsOperator(null, msgs);
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
			case LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.FOL_SPECIFICATION__ROOT_OPERATOR, FOLSpecification.class, msgs);
			case LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT, ForAllOperator.class, msgs);
			case LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.NOT_OPERATOR__ARGUMENT, NotOperator.class, msgs);
			case LogicalSpecificationPackage.OPERATOR__AND_OPERATOR:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.AND_OPERATOR__ARGUMENTS, AndOperator.class, msgs);
			case LogicalSpecificationPackage.OPERATOR__OR_OPERATOR:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.OR_OPERATOR__ARGUMENTS, OrOperator.class, msgs);
			case LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT, ExistsOperator.class, msgs);
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
			case LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION:
				return getFolspecification();
			case LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR:
				return getForAlloperator();
			case LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR:
				return getNotOperator();
			case LogicalSpecificationPackage.OPERATOR__AND_OPERATOR:
				return getAndOperator();
			case LogicalSpecificationPackage.OPERATOR__OR_OPERATOR:
				return getOrOperator();
			case LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR:
				return getExistsOperator();
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
			case LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION:
				setFolspecification((FOLSpecification)newValue);
				return;
			case LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR:
				setForAlloperator((ForAllOperator)newValue);
				return;
			case LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR:
				setNotOperator((NotOperator)newValue);
				return;
			case LogicalSpecificationPackage.OPERATOR__AND_OPERATOR:
				setAndOperator((AndOperator)newValue);
				return;
			case LogicalSpecificationPackage.OPERATOR__OR_OPERATOR:
				setOrOperator((OrOperator)newValue);
				return;
			case LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR:
				setExistsOperator((ExistsOperator)newValue);
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
			case LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION:
				setFolspecification((FOLSpecification)null);
				return;
			case LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR:
				setForAlloperator((ForAllOperator)null);
				return;
			case LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR:
				setNotOperator((NotOperator)null);
				return;
			case LogicalSpecificationPackage.OPERATOR__AND_OPERATOR:
				setAndOperator((AndOperator)null);
				return;
			case LogicalSpecificationPackage.OPERATOR__OR_OPERATOR:
				setOrOperator((OrOperator)null);
				return;
			case LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR:
				setExistsOperator((ExistsOperator)null);
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
			case LogicalSpecificationPackage.OPERATOR__FOLSPECIFICATION:
				return getFolspecification() != null;
			case LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR:
				return getForAlloperator() != null;
			case LogicalSpecificationPackage.OPERATOR__NOT_OPERATOR:
				return getNotOperator() != null;
			case LogicalSpecificationPackage.OPERATOR__AND_OPERATOR:
				return getAndOperator() != null;
			case LogicalSpecificationPackage.OPERATOR__OR_OPERATOR:
				return getOrOperator() != null;
			case LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR:
				return getExistsOperator() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicalSpecificationPackage.OPERATOR___EVALUATE_OPERATOR__OBJECT:
				return evaluateOperator(arguments.get(0));
			case LogicalSpecificationPackage.OPERATOR___GUARANTEES__OPERATOR:
				return guarantees((Operator)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OperatorImpl
