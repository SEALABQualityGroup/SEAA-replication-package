/**
 */
package logicalSpecification.impl;

import logicalSpecification.ExistsOperator;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.Operator;
import logicalSpecification.SingleValuedParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exists Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.ExistsOperatorImpl#getElement <em>Element</em>}</li>
 *   <li>{@link logicalSpecification.impl.ExistsOperatorImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link logicalSpecification.impl.ExistsOperatorImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistsOperatorImpl extends LogicalOperatorImpl implements ExistsOperator {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter element;

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
	protected ExistsOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.EXISTS_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (SingleValuedParameter)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(SingleValuedParameter newElement, NotificationChain msgs) {
		SingleValuedParameter oldElement = element;
		element = newElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT, oldElement, newElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(SingleValuedParameter newElement) {
		if (newElement != element) {
			NotificationChain msgs = null;
			if (element != null)
				msgs = ((InternalEObject)element).eInverseRemove(this, LogicalSpecificationPackage.SINGLE_VALUED_PARAMETER__EXISTS_OPERATOR, SingleValuedParameter.class, msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, LogicalSpecificationPackage.SINGLE_VALUED_PARAMETER__EXISTS_OPERATOR, SingleValuedParameter.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT, newElement, newElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION, oldCollection, collection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION, oldCollection, newCollection);
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
				msgs = ((InternalEObject)collection).eInverseRemove(this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR, MultipleValuedParameter.class, msgs);
			if (newCollection != null)
				msgs = ((InternalEObject)newCollection).eInverseAdd(this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR, MultipleValuedParameter.class, msgs);
			msgs = basicSetCollection(newCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION, newCollection, newCollection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT, oldArgument, newArgument);
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
				msgs = ((InternalEObject)argument).eInverseRemove(this, LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR, Operator.class, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, LogicalSpecificationPackage.OPERATOR__EXISTS_OPERATOR, Operator.class, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT:
				if (element != null)
					msgs = ((InternalEObject)element).eInverseRemove(this, LogicalSpecificationPackage.SINGLE_VALUED_PARAMETER__EXISTS_OPERATOR, SingleValuedParameter.class, msgs);
				return basicSetElement((SingleValuedParameter)otherEnd, msgs);
			case LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION:
				if (collection != null)
					msgs = ((InternalEObject)collection).eInverseRemove(this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR, MultipleValuedParameter.class, msgs);
				return basicSetCollection((MultipleValuedParameter)otherEnd, msgs);
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT:
				if (argument != null)
					msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT, null, msgs);
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
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT:
				return basicSetElement(null, msgs);
			case LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION:
				return basicSetCollection(null, msgs);
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT:
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
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT:
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
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT:
				setElement((SingleValuedParameter)newValue);
				return;
			case LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION:
				setCollection((MultipleValuedParameter)newValue);
				return;
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT:
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
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT:
				setElement((SingleValuedParameter)null);
				return;
			case LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION:
				setCollection((MultipleValuedParameter)null);
				return;
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT:
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
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ELEMENT:
				return element != null;
			case LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION:
				return collection != null;
			case LogicalSpecificationPackage.EXISTS_OPERATOR__ARGUMENT:
				return argument != null;
		}
		return super.eIsSet(featureID);
	}

} //ExistsOperatorImpl
