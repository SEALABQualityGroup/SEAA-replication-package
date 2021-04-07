/**
 */
package logicalSpecification.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import logicalSpecification.Action;
import logicalSpecification.LoLa4RAPSRoot;
import logicalSpecification.LogicalSpecificationPackage;
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
 * An implementation of the model object '<em><b>Refactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.RefactoringImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link logicalSpecification.impl.RefactoringImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link logicalSpecification.impl.RefactoringImpl#getPost <em>Post</em>}</li>
 *   <li>{@link logicalSpecification.impl.RefactoringImpl#getLola4rapsRoot <em>Lola4raps Root</em>}</li>
 *   <li>{@link logicalSpecification.impl.RefactoringImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link logicalSpecification.impl.RefactoringImpl#getNumOfChanges <em>Num Of Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefactoringImpl extends NamedElementImpl implements Refactoring {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefactoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.REFACTORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, LogicalSpecificationPackage.REFACTORING__ACTIONS, LogicalSpecificationPackage.ACTION__REFACTORING);
		}
		return actions;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.REFACTORING__PRE, oldPre, newPre);
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
				msgs = ((InternalEObject)pre).eInverseRemove(this, LogicalSpecificationPackage.PRE_CONDITION__REFACTORING, PreCondition.class, msgs);
			if (newPre != null)
				msgs = ((InternalEObject)newPre).eInverseAdd(this, LogicalSpecificationPackage.PRE_CONDITION__REFACTORING, PreCondition.class, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.REFACTORING__PRE, newPre, newPre));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.REFACTORING__POST, oldPost, newPost);
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
				msgs = ((InternalEObject)post).eInverseRemove(this, LogicalSpecificationPackage.POST_CONDITION__REFACTORING, PostCondition.class, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, LogicalSpecificationPackage.POST_CONDITION__REFACTORING, PostCondition.class, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.REFACTORING__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoLa4RAPSRoot getLola4rapsRoot() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT) return null;
		return (LoLa4RAPSRoot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLola4rapsRoot(LoLa4RAPSRoot newLola4rapsRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLola4rapsRoot, LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLola4rapsRoot(LoLa4RAPSRoot newLola4rapsRoot) {
		if (newLola4rapsRoot != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT && newLola4rapsRoot != null)) {
			if (EcoreUtil.isAncestor(this, newLola4rapsRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLola4rapsRoot != null)
				msgs = ((InternalEObject)newLola4rapsRoot).eInverseAdd(this, LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS, LoLa4RAPSRoot.class, msgs);
			msgs = basicSetLola4rapsRoot(newLola4rapsRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT, newLola4rapsRoot, newLola4rapsRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.REFACTORING__COST, oldCost, cost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.REFACTORING__NUM_OF_CHANGES, oldNumOfChanges, numOfChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refactoring cloneRefactoring() {
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
			case LogicalSpecificationPackage.REFACTORING__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case LogicalSpecificationPackage.REFACTORING__PRE:
				if (pre != null)
					msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.REFACTORING__PRE, null, msgs);
				return basicSetPre((PreCondition)otherEnd, msgs);
			case LogicalSpecificationPackage.REFACTORING__POST:
				if (post != null)
					msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.REFACTORING__POST, null, msgs);
				return basicSetPost((PostCondition)otherEnd, msgs);
			case LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLola4rapsRoot((LoLa4RAPSRoot)otherEnd, msgs);
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
			case LogicalSpecificationPackage.REFACTORING__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case LogicalSpecificationPackage.REFACTORING__PRE:
				return basicSetPre(null, msgs);
			case LogicalSpecificationPackage.REFACTORING__POST:
				return basicSetPost(null, msgs);
			case LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT:
				return basicSetLola4rapsRoot(null, msgs);
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
			case LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS, LoLa4RAPSRoot.class, msgs);
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
			case LogicalSpecificationPackage.REFACTORING__ACTIONS:
				return getActions();
			case LogicalSpecificationPackage.REFACTORING__PRE:
				return getPre();
			case LogicalSpecificationPackage.REFACTORING__POST:
				return getPost();
			case LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT:
				return getLola4rapsRoot();
			case LogicalSpecificationPackage.REFACTORING__COST:
				return getCost();
			case LogicalSpecificationPackage.REFACTORING__NUM_OF_CHANGES:
				return getNumOfChanges();
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
			case LogicalSpecificationPackage.REFACTORING__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case LogicalSpecificationPackage.REFACTORING__PRE:
				setPre((PreCondition)newValue);
				return;
			case LogicalSpecificationPackage.REFACTORING__POST:
				setPost((PostCondition)newValue);
				return;
			case LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT:
				setLola4rapsRoot((LoLa4RAPSRoot)newValue);
				return;
			case LogicalSpecificationPackage.REFACTORING__COST:
				setCost((Double)newValue);
				return;
			case LogicalSpecificationPackage.REFACTORING__NUM_OF_CHANGES:
				setNumOfChanges((Double)newValue);
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
			case LogicalSpecificationPackage.REFACTORING__ACTIONS:
				getActions().clear();
				return;
			case LogicalSpecificationPackage.REFACTORING__PRE:
				setPre((PreCondition)null);
				return;
			case LogicalSpecificationPackage.REFACTORING__POST:
				setPost((PostCondition)null);
				return;
			case LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT:
				setLola4rapsRoot((LoLa4RAPSRoot)null);
				return;
			case LogicalSpecificationPackage.REFACTORING__COST:
				setCost(COST_EDEFAULT);
				return;
			case LogicalSpecificationPackage.REFACTORING__NUM_OF_CHANGES:
				setNumOfChanges(NUM_OF_CHANGES_EDEFAULT);
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
			case LogicalSpecificationPackage.REFACTORING__ACTIONS:
				return actions != null && !actions.isEmpty();
			case LogicalSpecificationPackage.REFACTORING__PRE:
				return pre != null;
			case LogicalSpecificationPackage.REFACTORING__POST:
				return post != null;
			case LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT:
				return getLola4rapsRoot() != null;
			case LogicalSpecificationPackage.REFACTORING__COST:
				return cost != COST_EDEFAULT;
			case LogicalSpecificationPackage.REFACTORING__NUM_OF_CHANGES:
				return numOfChanges != NUM_OF_CHANGES_EDEFAULT;
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
			case LogicalSpecificationPackage.REFACTORING___CLONE_REFACTORING:
				return cloneRefactoring();
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", numOfChanges: ");
		result.append(numOfChanges);
		result.append(')');
		return result.toString();
	}

} //RefactoringImpl
