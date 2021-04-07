/**
 */
package logicalSpecification.antipatterns.performance.impl;

import java.lang.reflect.InvocationTargetException;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.antipatterns.performance.CpsPA;
import logicalSpecification.antipatterns.performance.PerformancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cps PA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getF_queueLengthSVP <em>Fqueue Length SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getF_overUtilSVP <em>Fover Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getF_underUtilSVP <em>Funder Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getF_opDemandMVP <em>Fop Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getT_maxQueueLengthSVP <em>Tmax Queue Length SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getT_maxOverUtilSVP <em>Tmax Over Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getT_minUnderUtilSVP <em>Tmin Under Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getT_maxOpDemandMVP <em>Tmax Op Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.CpsPAImpl#getContextualElement <em>Contextual Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpsPAImpl extends PerformanceAntipatternImpl implements CpsPA {
	/**
	 * The cached value of the '{@link #getF_queueLengthSVP() <em>Fqueue Length SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_queueLengthSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_queueLengthSVP;

	/**
	 * The cached value of the '{@link #getF_overUtilSVP() <em>Fover Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_overUtilSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_overUtilSVP;

	/**
	 * The cached value of the '{@link #getF_underUtilSVP() <em>Funder Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_underUtilSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_underUtilSVP;

	/**
	 * The cached value of the '{@link #getF_opDemandMVP() <em>Fop Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_opDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter f_opDemandMVP;

	/**
	 * The cached value of the '{@link #getT_maxQueueLengthSVP() <em>Tmax Queue Length SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_maxQueueLengthSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_maxQueueLengthSVP;

	/**
	 * The cached value of the '{@link #getT_maxOverUtilSVP() <em>Tmax Over Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_maxOverUtilSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_maxOverUtilSVP;

	/**
	 * The cached value of the '{@link #getT_minUnderUtilSVP() <em>Tmin Under Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_minUnderUtilSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_minUnderUtilSVP;

	/**
	 * The cached value of the '{@link #getT_maxOpDemandMVP() <em>Tmax Op Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_maxOpDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter t_maxOpDemandMVP;

	/**
	 * The default value of the '{@link #getContextualElement() <em>Contextual Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualElement()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONTEXTUAL_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextualElement() <em>Contextual Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualElement()
	 * @generated
	 * @ordered
	 */
	protected Object contextualElement = CONTEXTUAL_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpsPAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformancePackage.Literals.CPS_PA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_queueLengthSVP() {
		if (f_queueLengthSVP != null && f_queueLengthSVP.eIsProxy()) {
			InternalEObject oldF_queueLengthSVP = (InternalEObject)f_queueLengthSVP;
			f_queueLengthSVP = (SingleValuedParameter)eResolveProxy(oldF_queueLengthSVP);
			if (f_queueLengthSVP != oldF_queueLengthSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__FQUEUE_LENGTH_SVP, oldF_queueLengthSVP, f_queueLengthSVP));
			}
		}
		return f_queueLengthSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_queueLengthSVP() {
		return f_queueLengthSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_queueLengthSVP(SingleValuedParameter newF_queueLengthSVP) {
		SingleValuedParameter oldF_queueLengthSVP = f_queueLengthSVP;
		f_queueLengthSVP = newF_queueLengthSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__FQUEUE_LENGTH_SVP, oldF_queueLengthSVP, f_queueLengthSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_overUtilSVP() {
		if (f_overUtilSVP != null && f_overUtilSVP.eIsProxy()) {
			InternalEObject oldF_overUtilSVP = (InternalEObject)f_overUtilSVP;
			f_overUtilSVP = (SingleValuedParameter)eResolveProxy(oldF_overUtilSVP);
			if (f_overUtilSVP != oldF_overUtilSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__FOVER_UTIL_SVP, oldF_overUtilSVP, f_overUtilSVP));
			}
		}
		return f_overUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_overUtilSVP() {
		return f_overUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_overUtilSVP(SingleValuedParameter newF_overUtilSVP) {
		SingleValuedParameter oldF_overUtilSVP = f_overUtilSVP;
		f_overUtilSVP = newF_overUtilSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__FOVER_UTIL_SVP, oldF_overUtilSVP, f_overUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_underUtilSVP() {
		if (f_underUtilSVP != null && f_underUtilSVP.eIsProxy()) {
			InternalEObject oldF_underUtilSVP = (InternalEObject)f_underUtilSVP;
			f_underUtilSVP = (SingleValuedParameter)eResolveProxy(oldF_underUtilSVP);
			if (f_underUtilSVP != oldF_underUtilSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__FUNDER_UTIL_SVP, oldF_underUtilSVP, f_underUtilSVP));
			}
		}
		return f_underUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_underUtilSVP() {
		return f_underUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_underUtilSVP(SingleValuedParameter newF_underUtilSVP) {
		SingleValuedParameter oldF_underUtilSVP = f_underUtilSVP;
		f_underUtilSVP = newF_underUtilSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__FUNDER_UTIL_SVP, oldF_underUtilSVP, f_underUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getF_opDemandMVP() {
		if (f_opDemandMVP != null && f_opDemandMVP.eIsProxy()) {
			InternalEObject oldF_opDemandMVP = (InternalEObject)f_opDemandMVP;
			f_opDemandMVP = (MultipleValuedParameter)eResolveProxy(oldF_opDemandMVP);
			if (f_opDemandMVP != oldF_opDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__FOP_DEMAND_MVP, oldF_opDemandMVP, f_opDemandMVP));
			}
		}
		return f_opDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetF_opDemandMVP() {
		return f_opDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_opDemandMVP(MultipleValuedParameter newF_opDemandMVP) {
		MultipleValuedParameter oldF_opDemandMVP = f_opDemandMVP;
		f_opDemandMVP = newF_opDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__FOP_DEMAND_MVP, oldF_opDemandMVP, f_opDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_maxQueueLengthSVP() {
		if (t_maxQueueLengthSVP != null && t_maxQueueLengthSVP.eIsProxy()) {
			InternalEObject oldT_maxQueueLengthSVP = (InternalEObject)t_maxQueueLengthSVP;
			t_maxQueueLengthSVP = (SingleValuedParameter)eResolveProxy(oldT_maxQueueLengthSVP);
			if (t_maxQueueLengthSVP != oldT_maxQueueLengthSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__TMAX_QUEUE_LENGTH_SVP, oldT_maxQueueLengthSVP, t_maxQueueLengthSVP));
			}
		}
		return t_maxQueueLengthSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_maxQueueLengthSVP() {
		return t_maxQueueLengthSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_maxQueueLengthSVP(SingleValuedParameter newT_maxQueueLengthSVP) {
		SingleValuedParameter oldT_maxQueueLengthSVP = t_maxQueueLengthSVP;
		t_maxQueueLengthSVP = newT_maxQueueLengthSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__TMAX_QUEUE_LENGTH_SVP, oldT_maxQueueLengthSVP, t_maxQueueLengthSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_maxOverUtilSVP() {
		if (t_maxOverUtilSVP != null && t_maxOverUtilSVP.eIsProxy()) {
			InternalEObject oldT_maxOverUtilSVP = (InternalEObject)t_maxOverUtilSVP;
			t_maxOverUtilSVP = (SingleValuedParameter)eResolveProxy(oldT_maxOverUtilSVP);
			if (t_maxOverUtilSVP != oldT_maxOverUtilSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__TMAX_OVER_UTIL_SVP, oldT_maxOverUtilSVP, t_maxOverUtilSVP));
			}
		}
		return t_maxOverUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_maxOverUtilSVP() {
		return t_maxOverUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_maxOverUtilSVP(SingleValuedParameter newT_maxOverUtilSVP) {
		SingleValuedParameter oldT_maxOverUtilSVP = t_maxOverUtilSVP;
		t_maxOverUtilSVP = newT_maxOverUtilSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__TMAX_OVER_UTIL_SVP, oldT_maxOverUtilSVP, t_maxOverUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_minUnderUtilSVP() {
		if (t_minUnderUtilSVP != null && t_minUnderUtilSVP.eIsProxy()) {
			InternalEObject oldT_minUnderUtilSVP = (InternalEObject)t_minUnderUtilSVP;
			t_minUnderUtilSVP = (SingleValuedParameter)eResolveProxy(oldT_minUnderUtilSVP);
			if (t_minUnderUtilSVP != oldT_minUnderUtilSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__TMIN_UNDER_UTIL_SVP, oldT_minUnderUtilSVP, t_minUnderUtilSVP));
			}
		}
		return t_minUnderUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_minUnderUtilSVP() {
		return t_minUnderUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_minUnderUtilSVP(SingleValuedParameter newT_minUnderUtilSVP) {
		SingleValuedParameter oldT_minUnderUtilSVP = t_minUnderUtilSVP;
		t_minUnderUtilSVP = newT_minUnderUtilSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__TMIN_UNDER_UTIL_SVP, oldT_minUnderUtilSVP, t_minUnderUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getT_maxOpDemandMVP() {
		if (t_maxOpDemandMVP != null && t_maxOpDemandMVP.eIsProxy()) {
			InternalEObject oldT_maxOpDemandMVP = (InternalEObject)t_maxOpDemandMVP;
			t_maxOpDemandMVP = (MultipleValuedParameter)eResolveProxy(oldT_maxOpDemandMVP);
			if (t_maxOpDemandMVP != oldT_maxOpDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.CPS_PA__TMAX_OP_DEMAND_MVP, oldT_maxOpDemandMVP, t_maxOpDemandMVP));
			}
		}
		return t_maxOpDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetT_maxOpDemandMVP() {
		return t_maxOpDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_maxOpDemandMVP(MultipleValuedParameter newT_maxOpDemandMVP) {
		MultipleValuedParameter oldT_maxOpDemandMVP = t_maxOpDemandMVP;
		t_maxOpDemandMVP = newT_maxOpDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__TMAX_OP_DEMAND_MVP, oldT_maxOpDemandMVP, t_maxOpDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getContextualElement() {
		return contextualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualElement(Object newContextualElement) {
		Object oldContextualElement = contextualElement;
		contextualElement = newContextualElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.CPS_PA__CONTEXTUAL_ELEMENT, oldContextualElement, contextualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForPartialDetection(double T_maxOpDemand) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForFullDetection(double T_maxQueueLength, double T_maxOverUtil, double T_minUnderUtil, double T_maxOpDemand) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int partialDetection(double T_maxOpDemand) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int fullDetection(double T_maxQueueLength, double T_maxOverUtil, double T_minUnderUtil, double T_maxOpDemand) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PerformancePackage.CPS_PA__FQUEUE_LENGTH_SVP:
				if (resolve) return getF_queueLengthSVP();
				return basicGetF_queueLengthSVP();
			case PerformancePackage.CPS_PA__FOVER_UTIL_SVP:
				if (resolve) return getF_overUtilSVP();
				return basicGetF_overUtilSVP();
			case PerformancePackage.CPS_PA__FUNDER_UTIL_SVP:
				if (resolve) return getF_underUtilSVP();
				return basicGetF_underUtilSVP();
			case PerformancePackage.CPS_PA__FOP_DEMAND_MVP:
				if (resolve) return getF_opDemandMVP();
				return basicGetF_opDemandMVP();
			case PerformancePackage.CPS_PA__TMAX_QUEUE_LENGTH_SVP:
				if (resolve) return getT_maxQueueLengthSVP();
				return basicGetT_maxQueueLengthSVP();
			case PerformancePackage.CPS_PA__TMAX_OVER_UTIL_SVP:
				if (resolve) return getT_maxOverUtilSVP();
				return basicGetT_maxOverUtilSVP();
			case PerformancePackage.CPS_PA__TMIN_UNDER_UTIL_SVP:
				if (resolve) return getT_minUnderUtilSVP();
				return basicGetT_minUnderUtilSVP();
			case PerformancePackage.CPS_PA__TMAX_OP_DEMAND_MVP:
				if (resolve) return getT_maxOpDemandMVP();
				return basicGetT_maxOpDemandMVP();
			case PerformancePackage.CPS_PA__CONTEXTUAL_ELEMENT:
				return getContextualElement();
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
			case PerformancePackage.CPS_PA__FQUEUE_LENGTH_SVP:
				setF_queueLengthSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__FOVER_UTIL_SVP:
				setF_overUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__FUNDER_UTIL_SVP:
				setF_underUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__FOP_DEMAND_MVP:
				setF_opDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__TMAX_QUEUE_LENGTH_SVP:
				setT_maxQueueLengthSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__TMAX_OVER_UTIL_SVP:
				setT_maxOverUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__TMIN_UNDER_UTIL_SVP:
				setT_minUnderUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__TMAX_OP_DEMAND_MVP:
				setT_maxOpDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.CPS_PA__CONTEXTUAL_ELEMENT:
				setContextualElement(newValue);
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
			case PerformancePackage.CPS_PA__FQUEUE_LENGTH_SVP:
				setF_queueLengthSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__FOVER_UTIL_SVP:
				setF_overUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__FUNDER_UTIL_SVP:
				setF_underUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__FOP_DEMAND_MVP:
				setF_opDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__TMAX_QUEUE_LENGTH_SVP:
				setT_maxQueueLengthSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__TMAX_OVER_UTIL_SVP:
				setT_maxOverUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__TMIN_UNDER_UTIL_SVP:
				setT_minUnderUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__TMAX_OP_DEMAND_MVP:
				setT_maxOpDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.CPS_PA__CONTEXTUAL_ELEMENT:
				setContextualElement(CONTEXTUAL_ELEMENT_EDEFAULT);
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
			case PerformancePackage.CPS_PA__FQUEUE_LENGTH_SVP:
				return f_queueLengthSVP != null;
			case PerformancePackage.CPS_PA__FOVER_UTIL_SVP:
				return f_overUtilSVP != null;
			case PerformancePackage.CPS_PA__FUNDER_UTIL_SVP:
				return f_underUtilSVP != null;
			case PerformancePackage.CPS_PA__FOP_DEMAND_MVP:
				return f_opDemandMVP != null;
			case PerformancePackage.CPS_PA__TMAX_QUEUE_LENGTH_SVP:
				return t_maxQueueLengthSVP != null;
			case PerformancePackage.CPS_PA__TMAX_OVER_UTIL_SVP:
				return t_maxOverUtilSVP != null;
			case PerformancePackage.CPS_PA__TMIN_UNDER_UTIL_SVP:
				return t_minUnderUtilSVP != null;
			case PerformancePackage.CPS_PA__TMAX_OP_DEMAND_MVP:
				return t_maxOpDemandMVP != null;
			case PerformancePackage.CPS_PA__CONTEXTUAL_ELEMENT:
				return CONTEXTUAL_ELEMENT_EDEFAULT == null ? contextualElement != null : !CONTEXTUAL_ELEMENT_EDEFAULT.equals(contextualElement);
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
			case PerformancePackage.CPS_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE:
				setParametersForPartialDetection((Double)arguments.get(0));
				return null;
			case PerformancePackage.CPS_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				setParametersForFullDetection((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
				return null;
			case PerformancePackage.CPS_PA___PARTIAL_DETECTION__DOUBLE:
				return partialDetection((Double)arguments.get(0));
			case PerformancePackage.CPS_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return fullDetection((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
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
		result.append(" (contextualElement: ");
		result.append(contextualElement);
		result.append(')');
		return result.toString();
	}

} //CpsPAImpl
