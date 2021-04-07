/**
 */
package logicalSpecification.impl;

import java.util.Collection;

import logicalSpecification.ExistsOperator;
import logicalSpecification.ForAllOperator;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.MultipleValuedParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Valued Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.MultipleValuedParameterImpl#getForAllOperator <em>For All Operator</em>}</li>
 *   <li>{@link logicalSpecification.impl.MultipleValuedParameterImpl#getExistsOperator <em>Exists Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleValuedParameterImpl extends ParameterImpl implements MultipleValuedParameter {
	/**
	 * The cached value of the '{@link #getForAllOperator() <em>For All Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForAllOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<ForAllOperator> forAllOperator;

	/**
	 * The cached value of the '{@link #getExistsOperator() <em>Exists Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistsOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<ExistsOperator> existsOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleValuedParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.MULTIPLE_VALUED_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForAllOperator> getForAllOperator() {
		if (forAllOperator == null) {
			forAllOperator = new EObjectWithInverseResolvingEList<ForAllOperator>(ForAllOperator.class, this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR, LogicalSpecificationPackage.FOR_ALL_OPERATOR__COLLECTION);
		}
		return forAllOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExistsOperator> getExistsOperator() {
		if (existsOperator == null) {
			existsOperator = new EObjectWithInverseResolvingEList<ExistsOperator>(ExistsOperator.class, this, LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR, LogicalSpecificationPackage.EXISTS_OPERATOR__COLLECTION);
		}
		return existsOperator;
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
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForAllOperator()).basicAdd(otherEnd, msgs);
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExistsOperator()).basicAdd(otherEnd, msgs);
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
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR:
				return ((InternalEList<?>)getForAllOperator()).basicRemove(otherEnd, msgs);
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR:
				return ((InternalEList<?>)getExistsOperator()).basicRemove(otherEnd, msgs);
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
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR:
				return getForAllOperator();
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR:
				return getExistsOperator();
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
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR:
				getForAllOperator().clear();
				getForAllOperator().addAll((Collection<? extends ForAllOperator>)newValue);
				return;
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR:
				getExistsOperator().clear();
				getExistsOperator().addAll((Collection<? extends ExistsOperator>)newValue);
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
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR:
				getForAllOperator().clear();
				return;
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR:
				getExistsOperator().clear();
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
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR:
				return forAllOperator != null && !forAllOperator.isEmpty();
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR:
				return existsOperator != null && !existsOperator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultipleValuedParameterImpl
