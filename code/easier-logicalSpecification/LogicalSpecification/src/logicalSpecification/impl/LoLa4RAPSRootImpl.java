/**
 */
package logicalSpecification.impl;

import java.util.Collection;

import logicalSpecification.Antipattern;
import logicalSpecification.LoLa4RAPSRoot;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.Refactoring;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lo La4 RAPS Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.LoLa4RAPSRootImpl#getRefactorings <em>Refactorings</em>}</li>
 *   <li>{@link logicalSpecification.impl.LoLa4RAPSRootImpl#getAntipatterns <em>Antipatterns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoLa4RAPSRootImpl extends NamedElementImpl implements LoLa4RAPSRoot {
	/**
	 * The cached value of the '{@link #getRefactorings() <em>Refactorings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefactorings()
	 * @generated
	 * @ordered
	 */
	protected EList<Refactoring> refactorings;

	/**
	 * The cached value of the '{@link #getAntipatterns() <em>Antipatterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntipatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Antipattern> antipatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoLa4RAPSRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.LO_LA4_RAPS_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Refactoring> getRefactorings() {
		if (refactorings == null) {
			refactorings = new EObjectContainmentWithInverseEList<Refactoring>(Refactoring.class, this, LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS, LogicalSpecificationPackage.REFACTORING__LOLA4RAPS_ROOT);
		}
		return refactorings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Antipattern> getAntipatterns() {
		if (antipatterns == null) {
			antipatterns = new EObjectContainmentWithInverseEList<Antipattern>(Antipattern.class, this, LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS, LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT);
		}
		return antipatterns;
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
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefactorings()).basicAdd(otherEnd, msgs);
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAntipatterns()).basicAdd(otherEnd, msgs);
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
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS:
				return ((InternalEList<?>)getRefactorings()).basicRemove(otherEnd, msgs);
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS:
				return ((InternalEList<?>)getAntipatterns()).basicRemove(otherEnd, msgs);
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
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS:
				return getRefactorings();
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS:
				return getAntipatterns();
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
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS:
				getRefactorings().clear();
				getRefactorings().addAll((Collection<? extends Refactoring>)newValue);
				return;
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS:
				getAntipatterns().clear();
				getAntipatterns().addAll((Collection<? extends Antipattern>)newValue);
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
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS:
				getRefactorings().clear();
				return;
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS:
				getAntipatterns().clear();
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
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__REFACTORINGS:
				return refactorings != null && !refactorings.isEmpty();
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS:
				return antipatterns != null && !antipatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoLa4RAPSRootImpl
