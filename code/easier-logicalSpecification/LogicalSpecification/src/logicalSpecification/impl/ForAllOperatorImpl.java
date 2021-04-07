/**
 */
package logicalSpecification.impl;

import logicalSpecification.ForAllOperator;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.Operator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For All Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.ForAllOperatorImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link logicalSpecification.impl.ForAllOperatorImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForAllOperatorImpl extends LogicalOperatorImpl implements ForAllOperator {
	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter collection;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected Operator argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForAllOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.FOR_ALL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject)collection;
			collection = (MultipleValuedParameter)eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION, oldCollection, collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollection(MultipleValuedParameter newCollection, NotificationChain msgs) {
		MultipleValuedParameter oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION, oldCollection, newCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(MultipleValuedParameter newCollection) {
		if (newCollection != collection) {
			NotificationChain msgs = null;
			if (collection != null)
				msgs = ((InternalEObject)collection).eInverseRemove(this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR, MultipleValuedParameter.class, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR, MultipleValuedParameter.class, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION, newCollection, newCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(Operator newArgument, NotificationChain msgs) {
		Operator oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT, oldArgument, newArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(Operator newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject)argument).eInverseRemove(this, LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR, Operator.class, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, LogicalSpecificationPackage.OPERATOR__FOR_ALLOPERATOR, Operator.class, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION:
				if (collection != null)
					msgs = ((InternalEObject)collection).eInverseRemove(this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR, MultipleValuedParameter.class, msgs);
				return basicSetCollection((MultipleValuedParameter)otherEnd, msgs);
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT:
				if (argument != null)
					msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT, null, msgs);
				return basicSetArgument((Operator)otherEnd, msgs);
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
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION:
				return basicSetCollection(null, msgs);
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT:
				return basicSetArgument(null, msgs);
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
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT:
				return getArgument();
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
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION:
				setCollection((MultipleValuedParameter)newValue);
				return;
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT:
				setArgument((Operator)newValue);
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
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION:
				setCollection((MultipleValuedParameter)null);
				return;
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT:
				setArgument((Operator)null);
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
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION:
				return collection != null;
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR__ARGUMENT:
				return argument != null;
		}
		return super.eIsSet(featureID);
	}

} //ForAllOperatorImpl
