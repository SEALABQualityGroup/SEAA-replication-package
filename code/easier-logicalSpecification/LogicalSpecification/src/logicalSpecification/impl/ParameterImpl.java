/**
 */
package logicalSpecification.impl;

import java.util.Collection;

import logicalSpecification.Action;
import logicalSpecification.Antipattern;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.Parameter;
import logicalSpecification.RelationalOperator;
import logicalSpecification.TypesEnum;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link logicalSpecification.impl.ParameterImpl#getAction <em>Action</em>}</li>
 *   <li>{@link logicalSpecification.impl.ParameterImpl#getResolvingExpr <em>Resolving Expr</em>}</li>
 *   <li>{@link logicalSpecification.impl.ParameterImpl#getLhsRelationalOperator <em>Lhs Relational Operator</em>}</li>
 *   <li>{@link logicalSpecification.impl.ParameterImpl#getRhsRelationalOperator <em>Rhs Relational Operator</em>}</li>
 *   <li>{@link logicalSpecification.impl.ParameterImpl#getAntipattern <em>Antipattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterImpl extends NamedElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypesEnum TYPE_EDEFAULT = TypesEnum.UML_OPERATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypesEnum type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolvingExpr() <em>Resolving Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvingExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLVING_EXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolvingExpr() <em>Resolving Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvingExpr()
	 * @generated
	 * @ordered
	 */
	protected String resolvingExpr = RESOLVING_EXPR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhsRelationalOperator() <em>Lhs Relational Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhsRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalOperator> lhsRelationalOperator;

	/**
	 * The cached value of the '{@link #getRhsRelationalOperator() <em>Rhs Relational Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhsRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalOperator> rhsRelationalOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypesEnum newType) {
		TypesEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.PARAMETER__ACTION) return null;
		return (Action)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAction, LogicalSpecificationPackage.PARAMETER__ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.PARAMETER__ACTION && newAction != null)) {
			if (EcoreUtil.isAncestor(this, newAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, LogicalSpecificationPackage.ACTION__PARAMETERS, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.PARAMETER__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolvingExpr() {
		return resolvingExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvingExpr(String newResolvingExpr) {
		String oldResolvingExpr = resolvingExpr;
		resolvingExpr = newResolvingExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.PARAMETER__RESOLVING_EXPR, oldResolvingExpr, resolvingExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationalOperator> getLhsRelationalOperator() {
		if (lhsRelationalOperator == null) {
			lhsRelationalOperator = new EObjectWithInverseResolvingEList<RelationalOperator>(RelationalOperator.class, this, LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR, LogicalSpecificationPackage.RELATIONAL_OPERATOR__LHS);
		}
		return lhsRelationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationalOperator> getRhsRelationalOperator() {
		if (rhsRelationalOperator == null) {
			rhsRelationalOperator = new EObjectWithInverseResolvingEList<RelationalOperator>(RelationalOperator.class, this, LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR, LogicalSpecificationPackage.RELATIONAL_OPERATOR__RHS);
		}
		return rhsRelationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Antipattern getAntipattern() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.PARAMETER__ANTIPATTERN) return null;
		return (Antipattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntipattern(Antipattern newAntipattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAntipattern, LogicalSpecificationPackage.PARAMETER__ANTIPATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntipattern(Antipattern newAntipattern) {
		if (newAntipattern != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.PARAMETER__ANTIPATTERN && newAntipattern != null)) {
			if (EcoreUtil.isAncestor(this, newAntipattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAntipattern != null)
				msgs = ((InternalEObject)newAntipattern).eInverseAdd(this, LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS, Antipattern.class, msgs);
			msgs = basicSetAntipattern(newAntipattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.PARAMETER__ANTIPATTERN, newAntipattern, newAntipattern));
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
			case LogicalSpecificationPackage.PARAMETER__ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAction((Action)otherEnd, msgs);
			case LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLhsRelationalOperator()).basicAdd(otherEnd, msgs);
			case LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRhsRelationalOperator()).basicAdd(otherEnd, msgs);
			case LogicalSpecificationPackage.PARAMETER__ANTIPATTERN:
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
			case LogicalSpecificationPackage.PARAMETER__ACTION:
				return basicSetAction(null, msgs);
			case LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR:
				return ((InternalEList<?>)getLhsRelationalOperator()).basicRemove(otherEnd, msgs);
			case LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR:
				return ((InternalEList<?>)getRhsRelationalOperator()).basicRemove(otherEnd, msgs);
			case LogicalSpecificationPackage.PARAMETER__ANTIPATTERN:
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
			case LogicalSpecificationPackage.PARAMETER__ACTION:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.ACTION__PARAMETERS, Action.class, msgs);
			case LogicalSpecificationPackage.PARAMETER__ANTIPATTERN:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS, Antipattern.class, msgs);
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
			case LogicalSpecificationPackage.PARAMETER__TYPE:
				return getType();
			case LogicalSpecificationPackage.PARAMETER__ACTION:
				return getAction();
			case LogicalSpecificationPackage.PARAMETER__RESOLVING_EXPR:
				return getResolvingExpr();
			case LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR:
				return getLhsRelationalOperator();
			case LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR:
				return getRhsRelationalOperator();
			case LogicalSpecificationPackage.PARAMETER__ANTIPATTERN:
				return getAntipattern();
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
			case LogicalSpecificationPackage.PARAMETER__TYPE:
				setType((TypesEnum)newValue);
				return;
			case LogicalSpecificationPackage.PARAMETER__ACTION:
				setAction((Action)newValue);
				return;
			case LogicalSpecificationPackage.PARAMETER__RESOLVING_EXPR:
				setResolvingExpr((String)newValue);
				return;
			case LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR:
				getLhsRelationalOperator().clear();
				getLhsRelationalOperator().addAll((Collection<? extends RelationalOperator>)newValue);
				return;
			case LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR:
				getRhsRelationalOperator().clear();
				getRhsRelationalOperator().addAll((Collection<? extends RelationalOperator>)newValue);
				return;
			case LogicalSpecificationPackage.PARAMETER__ANTIPATTERN:
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
			case LogicalSpecificationPackage.PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case LogicalSpecificationPackage.PARAMETER__ACTION:
				setAction((Action)null);
				return;
			case LogicalSpecificationPackage.PARAMETER__RESOLVING_EXPR:
				setResolvingExpr(RESOLVING_EXPR_EDEFAULT);
				return;
			case LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR:
				getLhsRelationalOperator().clear();
				return;
			case LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR:
				getRhsRelationalOperator().clear();
				return;
			case LogicalSpecificationPackage.PARAMETER__ANTIPATTERN:
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
			case LogicalSpecificationPackage.PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case LogicalSpecificationPackage.PARAMETER__ACTION:
				return getAction() != null;
			case LogicalSpecificationPackage.PARAMETER__RESOLVING_EXPR:
				return RESOLVING_EXPR_EDEFAULT == null ? resolvingExpr != null : !RESOLVING_EXPR_EDEFAULT.equals(resolvingExpr);
			case LogicalSpecificationPackage.PARAMETER__LHS_RELATIONAL_OPERATOR:
				return lhsRelationalOperator != null && !lhsRelationalOperator.isEmpty();
			case LogicalSpecificationPackage.PARAMETER__RHS_RELATIONAL_OPERATOR:
				return rhsRelationalOperator != null && !rhsRelationalOperator.isEmpty();
			case LogicalSpecificationPackage.PARAMETER__ANTIPATTERN:
				return getAntipattern() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", resolvingExpr: ");
		result.append(resolvingExpr);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
