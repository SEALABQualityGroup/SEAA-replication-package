/**
 */
package logicalSpecification.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import logicalSpecification.Action;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.Parameter;
import logicalSpecification.PostCondition;
import logicalSpecification.PreCondition;
import logicalSpecification.Refactoring;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.ActionImpl#getNumOfChanges <em>Num Of Changes</em>}</li>
 *   <li>{@link logicalSpecification.impl.ActionImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link logicalSpecification.impl.ActionImpl#getRefactoring <em>Refactoring</em>}</li>
 *   <li>{@link logicalSpecification.impl.ActionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link logicalSpecification.impl.ActionImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link logicalSpecification.impl.ActionImpl#getPost <em>Post</em>}</li>
 *   <li>{@link logicalSpecification.impl.ActionImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends NamedElementImpl implements Action {
	/**
	 * The default value of the '{@link #getNumOfChanges() <em>Num Of Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfChanges()
	 * @generated
	 * @ordered
	 */
	protected static final double NUM_OF_CHANGES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNumOfChanges() <em>Num Of Changes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfChanges()
	 * @generated
	 * @ordered
	 */
	protected double numOfChanges = NUM_OF_CHANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final double COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected double cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected PreCondition pre;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected PostCondition post;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final Object MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Object model = MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNumOfChanges() {
		return numOfChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfChanges(double newNumOfChanges) {
		double oldNumOfChanges = numOfChanges;
		numOfChanges = newNumOfChanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__NUM_OF_CHANGES, oldNumOfChanges, numOfChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(double newCost) {
		double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring getRefactoring() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.ACTION__REFACTORING) return null;
		return (Refactoring)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefactoring(Refactoring newRefactoring, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRefactoring, LogicalSpecificationPackage.ACTION__REFACTORING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefactoring(Refactoring newRefactoring) {
		if (newRefactoring != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.ACTION__REFACTORING && newRefactoring != null)) {
			if (EcoreUtil.isAncestor(this, newRefactoring))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRefactoring != null)
				msgs = ((InternalEObject)newRefactoring).eInverseAdd(this, LogicalSpecificationPackage.REFACTORING__ACTIONS, Refactoring.class, msgs);
			msgs = basicSetRefactoring(newRefactoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__REFACTORING, newRefactoring, newRefactoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, LogicalSpecificationPackage.ACTION__PARAMETERS, LogicalSpecificationPackage.PARAMETER__ACTION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(PreCondition newPre, NotificationChain msgs) {
		PreCondition oldPre = pre;
		pre = newPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__PRE, oldPre, newPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(PreCondition newPre) {
		if (newPre != pre) {
			NotificationChain msgs = null;
			if (pre != null)
				msgs = ((InternalEObject)pre).eInverseRemove(this, LogicalSpecificationPackage.PRE_CONDITION__ACTION, PreCondition.class, msgs);
			if (newPre != null)
				msgs = ((InternalEObject)newPre).eInverseAdd(this, LogicalSpecificationPackage.PRE_CONDITION__ACTION, PreCondition.class, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__PRE, newPre, newPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostCondition getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(PostCondition newPost, NotificationChain msgs) {
		PostCondition oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(PostCondition newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, LogicalSpecificationPackage.POST_CONDITION__ACTION, PostCondition.class, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, LogicalSpecificationPackage.POST_CONDITION__ACTION, PostCondition.class, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Object newModel) {
		Object oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ACTION__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void log() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPreCondition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPostCondition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogicalSpecificationPackage.ACTION__REFACTORING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRefactoring((Refactoring)otherEnd, msgs);
			case LogicalSpecificationPackage.ACTION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case LogicalSpecificationPackage.ACTION__PRE:
				if (pre != null)
					msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.ACTION__PRE, null, msgs);
				return basicSetPre((PreCondition)otherEnd, msgs);
			case LogicalSpecificationPackage.ACTION__POST:
				if (post != null)
					msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.ACTION__POST, null, msgs);
				return basicSetPost((PostCondition)otherEnd, msgs);
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
			case LogicalSpecificationPackage.ACTION__REFACTORING:
				return basicSetRefactoring(null, msgs);
			case LogicalSpecificationPackage.ACTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case LogicalSpecificationPackage.ACTION__PRE:
				return basicSetPre(null, msgs);
			case LogicalSpecificationPackage.ACTION__POST:
				return basicSetPost(null, msgs);
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
			case LogicalSpecificationPackage.ACTION__REFACTORING:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.REFACTORING__ACTIONS, Refactoring.class, msgs);
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
			case LogicalSpecificationPackage.ACTION__NUM_OF_CHANGES:
				return getNumOfChanges();
			case LogicalSpecificationPackage.ACTION__COST:
				return getCost();
			case LogicalSpecificationPackage.ACTION__REFACTORING:
				return getRefactoring();
			case LogicalSpecificationPackage.ACTION__PARAMETERS:
				return getParameters();
			case LogicalSpecificationPackage.ACTION__PRE:
				return getPre();
			case LogicalSpecificationPackage.ACTION__POST:
				return getPost();
			case LogicalSpecificationPackage.ACTION__MODEL:
				return getModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogicalSpecificationPackage.ACTION__NUM_OF_CHANGES:
				setNumOfChanges((Double)newValue);
				return;
			case LogicalSpecificationPackage.ACTION__COST:
				setCost((Double)newValue);
				return;
			case LogicalSpecificationPackage.ACTION__REFACTORING:
				setRefactoring((Refactoring)newValue);
				return;
			case LogicalSpecificationPackage.ACTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case LogicalSpecificationPackage.ACTION__PRE:
				setPre((PreCondition)newValue);
				return;
			case LogicalSpecificationPackage.ACTION__POST:
				setPost((PostCondition)newValue);
				return;
			case LogicalSpecificationPackage.ACTION__MODEL:
				setModel(newValue);
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
			case LogicalSpecificationPackage.ACTION__NUM_OF_CHANGES:
				setNumOfChanges(NUM_OF_CHANGES_EDEFAULT);
				return;
			case LogicalSpecificationPackage.ACTION__COST:
				setCost(COST_EDEFAULT);
				return;
			case LogicalSpecificationPackage.ACTION__REFACTORING:
				setRefactoring((Refactoring)null);
				return;
			case LogicalSpecificationPackage.ACTION__PARAMETERS:
				getParameters().clear();
				return;
			case LogicalSpecificationPackage.ACTION__PRE:
				setPre((PreCondition)null);
				return;
			case LogicalSpecificationPackage.ACTION__POST:
				setPost((PostCondition)null);
				return;
			case LogicalSpecificationPackage.ACTION__MODEL:
				setModel(MODEL_EDEFAULT);
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
			case LogicalSpecificationPackage.ACTION__NUM_OF_CHANGES:
				return numOfChanges != NUM_OF_CHANGES_EDEFAULT;
			case LogicalSpecificationPackage.ACTION__COST:
				return cost != COST_EDEFAULT;
			case LogicalSpecificationPackage.ACTION__REFACTORING:
				return getRefactoring() != null;
			case LogicalSpecificationPackage.ACTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case LogicalSpecificationPackage.ACTION__PRE:
				return pre != null;
			case LogicalSpecificationPackage.ACTION__POST:
				return post != null;
			case LogicalSpecificationPackage.ACTION__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
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
			case LogicalSpecificationPackage.ACTION___EXECUTE:
				execute();
				return null;
			case LogicalSpecificationPackage.ACTION___LOG:
				log();
				return null;
			case LogicalSpecificationPackage.ACTION___SET_PARAMETERS:
				setParameters();
				return null;
			case LogicalSpecificationPackage.ACTION___CREATE_PRE_CONDITION:
				createPreCondition();
				return null;
			case LogicalSpecificationPackage.ACTION___CREATE_POST_CONDITION:
				createPostCondition();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (numOfChanges: ");
		result.append(numOfChanges);
		result.append(", cost: ");
		result.append(cost);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
