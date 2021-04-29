/**
 */
package logicalSpecification.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import logicalSpecification.Antipattern;
import logicalSpecification.FOLSpecification;
import logicalSpecification.LoLa4RAPSRoot;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.Parameter;

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
 * An implementation of the model object '<em><b>Antipattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.impl.AntipatternImpl#getLola4rapsRoot <em>Lola4raps Root</em>}</li>
 *   <li>{@link logicalSpecification.impl.AntipatternImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link logicalSpecification.impl.AntipatternImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntipatternImpl extends NamedElementImpl implements Antipattern {
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
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected FOLSpecification formula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntipatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.ANTIPATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoLa4RAPSRoot getLola4rapsRoot() {
		if (eContainerFeatureID() != LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT) return null;
		return (LoLa4RAPSRoot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLola4rapsRoot(LoLa4RAPSRoot newLola4rapsRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLola4rapsRoot, LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLola4rapsRoot(LoLa4RAPSRoot newLola4rapsRoot) {
		if (newLola4rapsRoot != eInternalContainer() || (eContainerFeatureID() != LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT && newLola4rapsRoot != null)) {
			if (EcoreUtil.isAncestor(this, newLola4rapsRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLola4rapsRoot != null)
				msgs = ((InternalEObject)newLola4rapsRoot).eInverseAdd(this, LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS, LoLa4RAPSRoot.class, msgs);
			msgs = basicSetLola4rapsRoot(newLola4rapsRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT, newLola4rapsRoot, newLola4rapsRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS, LogicalSpecificationPackage.PARAMETER__ANTIPATTERN);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOLSpecification getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(FOLSpecification newFormula, NotificationChain msgs) {
		FOLSpecification oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ANTIPATTERN__FORMULA, oldFormula, newFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(FOLSpecification newFormula) {
		if (newFormula != formula) {
			NotificationChain msgs = null;
			if (formula != null)
				msgs = ((InternalEObject)formula).eInverseRemove(this, LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN, FOLSpecification.class, msgs);
			if (newFormula != null)
				msgs = ((InternalEObject)newFormula).eInverseAdd(this, LogicalSpecificationPackage.FOL_SPECIFICATION__ANTIPATTERN, FOLSpecification.class, msgs);
			msgs = basicSetFormula(newFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogicalSpecificationPackage.ANTIPATTERN__FORMULA, newFormula, newFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForPartialDetection() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void partialDetection() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForFullDetection() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fullDetection() {
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
	public void createFormula() {
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
			case LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLola4rapsRoot((LoLa4RAPSRoot)otherEnd, msgs);
			case LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case LogicalSpecificationPackage.ANTIPATTERN__FORMULA:
				if (formula != null)
					msgs = ((InternalEObject)formula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalSpecificationPackage.ANTIPATTERN__FORMULA, null, msgs);
				return basicSetFormula((FOLSpecification)otherEnd, msgs);
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
			case LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT:
				return basicSetLola4rapsRoot(null, msgs);
			case LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case LogicalSpecificationPackage.ANTIPATTERN__FORMULA:
				return basicSetFormula(null, msgs);
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
			case LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT:
				return eInternalContainer().eInverseRemove(this, LogicalSpecificationPackage.LO_LA4_RAPS_ROOT__ANTIPATTERNS, LoLa4RAPSRoot.class, msgs);
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
			case LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT:
				return getLola4rapsRoot();
			case LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS:
				return getParameters();
			case LogicalSpecificationPackage.ANTIPATTERN__FORMULA:
				return getFormula();
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
			case LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT:
				setLola4rapsRoot((LoLa4RAPSRoot)newValue);
				return;
			case LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case LogicalSpecificationPackage.ANTIPATTERN__FORMULA:
				setFormula((FOLSpecification)newValue);
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
			case LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT:
				setLola4rapsRoot((LoLa4RAPSRoot)null);
				return;
			case LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS:
				getParameters().clear();
				return;
			case LogicalSpecificationPackage.ANTIPATTERN__FORMULA:
				setFormula((FOLSpecification)null);
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
			case LogicalSpecificationPackage.ANTIPATTERN__LOLA4RAPS_ROOT:
				return getLola4rapsRoot() != null;
			case LogicalSpecificationPackage.ANTIPATTERN__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case LogicalSpecificationPackage.ANTIPATTERN__FORMULA:
				return formula != null;
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
			case LogicalSpecificationPackage.ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION:
				setParametersForPartialDetection();
				return null;
			case LogicalSpecificationPackage.ANTIPATTERN___PARTIAL_DETECTION:
				partialDetection();
				return null;
			case LogicalSpecificationPackage.ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION:
				setParametersForFullDetection();
				return null;
			case LogicalSpecificationPackage.ANTIPATTERN___FULL_DETECTION:
				fullDetection();
				return null;
			case LogicalSpecificationPackage.ANTIPATTERN___LOG:
				log();
				return null;
			case LogicalSpecificationPackage.ANTIPATTERN___CREATE_FORMULA:
				createFormula();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AntipatternImpl
