/**
 */
package logicalSpecification.antipatterns.performance.impl;

import java.lang.reflect.InvocationTargetException;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.antipatterns.performance.EpPA;
import logicalSpecification.antipatterns.performance.PerformancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ep PA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getF_overDemandMVP <em>Fover Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getF_underDemandMVP <em>Funder Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getF_overDemandProbSVP <em>Fover Demand Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getF_demandSumProbSVP <em>Fdemand Sum Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getF_underDemandProbSVP <em>Funder Demand Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getF_hwUtilSVP <em>Fhw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getF_serviceResponseTimeSVP <em>Fservice Response Time SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getT_maxOverDemandMVP <em>Tmax Over Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getT_minUnderDemandMVP <em>Tmin Under Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getT_demandsProbSVP <em>Tdemands Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getT_maxServiceResponseTimeSVP <em>Tmax Service Response Time SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.EpPAImpl#getContextualElement <em>Contextual Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EpPAImpl extends PerformanceAntipatternImpl implements EpPA {
	/**
	 * The cached value of the '{@link #getF_overDemandMVP() <em>Fover Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_overDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter f_overDemandMVP;

	/**
	 * The cached value of the '{@link #getF_underDemandMVP() <em>Funder Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_underDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter f_underDemandMVP;

	/**
	 * The cached value of the '{@link #getF_overDemandProbSVP() <em>Fover Demand Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_overDemandProbSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_overDemandProbSVP;

	/**
	 * The cached value of the '{@link #getF_demandSumProbSVP() <em>Fdemand Sum Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_demandSumProbSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_demandSumProbSVP;

	/**
	 * The cached value of the '{@link #getF_underDemandProbSVP() <em>Funder Demand Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_underDemandProbSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_underDemandProbSVP;

	/**
	 * The cached value of the '{@link #getF_hwUtilSVP() <em>Fhw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_hwUtilSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_hwUtilSVP;

	/**
	 * The cached value of the '{@link #getF_serviceResponseTimeSVP() <em>Fservice Response Time SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_serviceResponseTimeSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_serviceResponseTimeSVP;

	/**
	 * The cached value of the '{@link #getT_maxOverDemandMVP() <em>Tmax Over Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_maxOverDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter t_maxOverDemandMVP;

	/**
	 * The cached value of the '{@link #getT_minUnderDemandMVP() <em>Tmin Under Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_minUnderDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter t_minUnderDemandMVP;

	/**
	 * The cached value of the '{@link #getT_demandsProbSVP() <em>Tdemands Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_demandsProbSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_demandsProbSVP;

	/**
	 * The cached value of the '{@link #getT_maxHwUtilSVP() <em>Tmax Hw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_maxHwUtilSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_maxHwUtilSVP;

	/**
	 * The cached value of the '{@link #getT_maxServiceResponseTimeSVP() <em>Tmax Service Response Time SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_maxServiceResponseTimeSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_maxServiceResponseTimeSVP;

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
	protected EpPAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformancePackage.Literals.EP_PA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getF_overDemandMVP() {
		if (f_overDemandMVP != null && f_overDemandMVP.eIsProxy()) {
			InternalEObject oldF_overDemandMVP = (InternalEObject)f_overDemandMVP;
			f_overDemandMVP = (MultipleValuedParameter)eResolveProxy(oldF_overDemandMVP);
			if (f_overDemandMVP != oldF_overDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__FOVER_DEMAND_MVP, oldF_overDemandMVP, f_overDemandMVP));
			}
		}
		return f_overDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetF_overDemandMVP() {
		return f_overDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_overDemandMVP(MultipleValuedParameter newF_overDemandMVP) {
		MultipleValuedParameter oldF_overDemandMVP = f_overDemandMVP;
		f_overDemandMVP = newF_overDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__FOVER_DEMAND_MVP, oldF_overDemandMVP, f_overDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getF_underDemandMVP() {
		if (f_underDemandMVP != null && f_underDemandMVP.eIsProxy()) {
			InternalEObject oldF_underDemandMVP = (InternalEObject)f_underDemandMVP;
			f_underDemandMVP = (MultipleValuedParameter)eResolveProxy(oldF_underDemandMVP);
			if (f_underDemandMVP != oldF_underDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__FUNDER_DEMAND_MVP, oldF_underDemandMVP, f_underDemandMVP));
			}
		}
		return f_underDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetF_underDemandMVP() {
		return f_underDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_underDemandMVP(MultipleValuedParameter newF_underDemandMVP) {
		MultipleValuedParameter oldF_underDemandMVP = f_underDemandMVP;
		f_underDemandMVP = newF_underDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__FUNDER_DEMAND_MVP, oldF_underDemandMVP, f_underDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_overDemandProbSVP() {
		if (f_overDemandProbSVP != null && f_overDemandProbSVP.eIsProxy()) {
			InternalEObject oldF_overDemandProbSVP = (InternalEObject)f_overDemandProbSVP;
			f_overDemandProbSVP = (SingleValuedParameter)eResolveProxy(oldF_overDemandProbSVP);
			if (f_overDemandProbSVP != oldF_overDemandProbSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__FOVER_DEMAND_PROB_SVP, oldF_overDemandProbSVP, f_overDemandProbSVP));
			}
		}
		return f_overDemandProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_overDemandProbSVP() {
		return f_overDemandProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_overDemandProbSVP(SingleValuedParameter newF_overDemandProbSVP) {
		SingleValuedParameter oldF_overDemandProbSVP = f_overDemandProbSVP;
		f_overDemandProbSVP = newF_overDemandProbSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__FOVER_DEMAND_PROB_SVP, oldF_overDemandProbSVP, f_overDemandProbSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_demandSumProbSVP() {
		if (f_demandSumProbSVP != null && f_demandSumProbSVP.eIsProxy()) {
			InternalEObject oldF_demandSumProbSVP = (InternalEObject)f_demandSumProbSVP;
			f_demandSumProbSVP = (SingleValuedParameter)eResolveProxy(oldF_demandSumProbSVP);
			if (f_demandSumProbSVP != oldF_demandSumProbSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__FDEMAND_SUM_PROB_SVP, oldF_demandSumProbSVP, f_demandSumProbSVP));
			}
		}
		return f_demandSumProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_demandSumProbSVP() {
		return f_demandSumProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_demandSumProbSVP(SingleValuedParameter newF_demandSumProbSVP) {
		SingleValuedParameter oldF_demandSumProbSVP = f_demandSumProbSVP;
		f_demandSumProbSVP = newF_demandSumProbSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__FDEMAND_SUM_PROB_SVP, oldF_demandSumProbSVP, f_demandSumProbSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_underDemandProbSVP() {
		if (f_underDemandProbSVP != null && f_underDemandProbSVP.eIsProxy()) {
			InternalEObject oldF_underDemandProbSVP = (InternalEObject)f_underDemandProbSVP;
			f_underDemandProbSVP = (SingleValuedParameter)eResolveProxy(oldF_underDemandProbSVP);
			if (f_underDemandProbSVP != oldF_underDemandProbSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__FUNDER_DEMAND_PROB_SVP, oldF_underDemandProbSVP, f_underDemandProbSVP));
			}
		}
		return f_underDemandProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_underDemandProbSVP() {
		return f_underDemandProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_underDemandProbSVP(SingleValuedParameter newF_underDemandProbSVP) {
		SingleValuedParameter oldF_underDemandProbSVP = f_underDemandProbSVP;
		f_underDemandProbSVP = newF_underDemandProbSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__FUNDER_DEMAND_PROB_SVP, oldF_underDemandProbSVP, f_underDemandProbSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_hwUtilSVP() {
		if (f_hwUtilSVP != null && f_hwUtilSVP.eIsProxy()) {
			InternalEObject oldF_hwUtilSVP = (InternalEObject)f_hwUtilSVP;
			f_hwUtilSVP = (SingleValuedParameter)eResolveProxy(oldF_hwUtilSVP);
			if (f_hwUtilSVP != oldF_hwUtilSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__FHW_UTIL_SVP, oldF_hwUtilSVP, f_hwUtilSVP));
			}
		}
		return f_hwUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_hwUtilSVP() {
		return f_hwUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_hwUtilSVP(SingleValuedParameter newF_hwUtilSVP) {
		SingleValuedParameter oldF_hwUtilSVP = f_hwUtilSVP;
		f_hwUtilSVP = newF_hwUtilSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__FHW_UTIL_SVP, oldF_hwUtilSVP, f_hwUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_serviceResponseTimeSVP() {
		if (f_serviceResponseTimeSVP != null && f_serviceResponseTimeSVP.eIsProxy()) {
			InternalEObject oldF_serviceResponseTimeSVP = (InternalEObject)f_serviceResponseTimeSVP;
			f_serviceResponseTimeSVP = (SingleValuedParameter)eResolveProxy(oldF_serviceResponseTimeSVP);
			if (f_serviceResponseTimeSVP != oldF_serviceResponseTimeSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__FSERVICE_RESPONSE_TIME_SVP, oldF_serviceResponseTimeSVP, f_serviceResponseTimeSVP));
			}
		}
		return f_serviceResponseTimeSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_serviceResponseTimeSVP() {
		return f_serviceResponseTimeSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_serviceResponseTimeSVP(SingleValuedParameter newF_serviceResponseTimeSVP) {
		SingleValuedParameter oldF_serviceResponseTimeSVP = f_serviceResponseTimeSVP;
		f_serviceResponseTimeSVP = newF_serviceResponseTimeSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__FSERVICE_RESPONSE_TIME_SVP, oldF_serviceResponseTimeSVP, f_serviceResponseTimeSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getT_maxOverDemandMVP() {
		if (t_maxOverDemandMVP != null && t_maxOverDemandMVP.eIsProxy()) {
			InternalEObject oldT_maxOverDemandMVP = (InternalEObject)t_maxOverDemandMVP;
			t_maxOverDemandMVP = (MultipleValuedParameter)eResolveProxy(oldT_maxOverDemandMVP);
			if (t_maxOverDemandMVP != oldT_maxOverDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__TMAX_OVER_DEMAND_MVP, oldT_maxOverDemandMVP, t_maxOverDemandMVP));
			}
		}
		return t_maxOverDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetT_maxOverDemandMVP() {
		return t_maxOverDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_maxOverDemandMVP(MultipleValuedParameter newT_maxOverDemandMVP) {
		MultipleValuedParameter oldT_maxOverDemandMVP = t_maxOverDemandMVP;
		t_maxOverDemandMVP = newT_maxOverDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__TMAX_OVER_DEMAND_MVP, oldT_maxOverDemandMVP, t_maxOverDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getT_minUnderDemandMVP() {
		if (t_minUnderDemandMVP != null && t_minUnderDemandMVP.eIsProxy()) {
			InternalEObject oldT_minUnderDemandMVP = (InternalEObject)t_minUnderDemandMVP;
			t_minUnderDemandMVP = (MultipleValuedParameter)eResolveProxy(oldT_minUnderDemandMVP);
			if (t_minUnderDemandMVP != oldT_minUnderDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__TMIN_UNDER_DEMAND_MVP, oldT_minUnderDemandMVP, t_minUnderDemandMVP));
			}
		}
		return t_minUnderDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetT_minUnderDemandMVP() {
		return t_minUnderDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_minUnderDemandMVP(MultipleValuedParameter newT_minUnderDemandMVP) {
		MultipleValuedParameter oldT_minUnderDemandMVP = t_minUnderDemandMVP;
		t_minUnderDemandMVP = newT_minUnderDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__TMIN_UNDER_DEMAND_MVP, oldT_minUnderDemandMVP, t_minUnderDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_demandsProbSVP() {
		if (t_demandsProbSVP != null && t_demandsProbSVP.eIsProxy()) {
			InternalEObject oldT_demandsProbSVP = (InternalEObject)t_demandsProbSVP;
			t_demandsProbSVP = (SingleValuedParameter)eResolveProxy(oldT_demandsProbSVP);
			if (t_demandsProbSVP != oldT_demandsProbSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__TDEMANDS_PROB_SVP, oldT_demandsProbSVP, t_demandsProbSVP));
			}
		}
		return t_demandsProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_demandsProbSVP() {
		return t_demandsProbSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_demandsProbSVP(SingleValuedParameter newT_demandsProbSVP) {
		SingleValuedParameter oldT_demandsProbSVP = t_demandsProbSVP;
		t_demandsProbSVP = newT_demandsProbSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__TDEMANDS_PROB_SVP, oldT_demandsProbSVP, t_demandsProbSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_maxHwUtilSVP() {
		if (t_maxHwUtilSVP != null && t_maxHwUtilSVP.eIsProxy()) {
			InternalEObject oldT_maxHwUtilSVP = (InternalEObject)t_maxHwUtilSVP;
			t_maxHwUtilSVP = (SingleValuedParameter)eResolveProxy(oldT_maxHwUtilSVP);
			if (t_maxHwUtilSVP != oldT_maxHwUtilSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__TMAX_HW_UTIL_SVP, oldT_maxHwUtilSVP, t_maxHwUtilSVP));
			}
		}
		return t_maxHwUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_maxHwUtilSVP() {
		return t_maxHwUtilSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_maxHwUtilSVP(SingleValuedParameter newT_maxHwUtilSVP) {
		SingleValuedParameter oldT_maxHwUtilSVP = t_maxHwUtilSVP;
		t_maxHwUtilSVP = newT_maxHwUtilSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__TMAX_HW_UTIL_SVP, oldT_maxHwUtilSVP, t_maxHwUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_maxServiceResponseTimeSVP() {
		if (t_maxServiceResponseTimeSVP != null && t_maxServiceResponseTimeSVP.eIsProxy()) {
			InternalEObject oldT_maxServiceResponseTimeSVP = (InternalEObject)t_maxServiceResponseTimeSVP;
			t_maxServiceResponseTimeSVP = (SingleValuedParameter)eResolveProxy(oldT_maxServiceResponseTimeSVP);
			if (t_maxServiceResponseTimeSVP != oldT_maxServiceResponseTimeSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP, oldT_maxServiceResponseTimeSVP, t_maxServiceResponseTimeSVP));
			}
		}
		return t_maxServiceResponseTimeSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_maxServiceResponseTimeSVP() {
		return t_maxServiceResponseTimeSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_maxServiceResponseTimeSVP(SingleValuedParameter newT_maxServiceResponseTimeSVP) {
		SingleValuedParameter oldT_maxServiceResponseTimeSVP = t_maxServiceResponseTimeSVP;
		t_maxServiceResponseTimeSVP = newT_maxServiceResponseTimeSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP, oldT_maxServiceResponseTimeSVP, t_maxServiceResponseTimeSVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.EP_PA__CONTEXTUAL_ELEMENT, oldContextualElement, contextualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForPartialDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForFullDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb, double T_maxHwUtil, double T_maxServiceResponseTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int partialDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int fullDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb, double T_maxHwUtil, double T_maxServiceResponseTime) {
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
			case PerformancePackage.EP_PA__FOVER_DEMAND_MVP:
				if (resolve) return getF_overDemandMVP();
				return basicGetF_overDemandMVP();
			case PerformancePackage.EP_PA__FUNDER_DEMAND_MVP:
				if (resolve) return getF_underDemandMVP();
				return basicGetF_underDemandMVP();
			case PerformancePackage.EP_PA__FOVER_DEMAND_PROB_SVP:
				if (resolve) return getF_overDemandProbSVP();
				return basicGetF_overDemandProbSVP();
			case PerformancePackage.EP_PA__FDEMAND_SUM_PROB_SVP:
				if (resolve) return getF_demandSumProbSVP();
				return basicGetF_demandSumProbSVP();
			case PerformancePackage.EP_PA__FUNDER_DEMAND_PROB_SVP:
				if (resolve) return getF_underDemandProbSVP();
				return basicGetF_underDemandProbSVP();
			case PerformancePackage.EP_PA__FHW_UTIL_SVP:
				if (resolve) return getF_hwUtilSVP();
				return basicGetF_hwUtilSVP();
			case PerformancePackage.EP_PA__FSERVICE_RESPONSE_TIME_SVP:
				if (resolve) return getF_serviceResponseTimeSVP();
				return basicGetF_serviceResponseTimeSVP();
			case PerformancePackage.EP_PA__TMAX_OVER_DEMAND_MVP:
				if (resolve) return getT_maxOverDemandMVP();
				return basicGetT_maxOverDemandMVP();
			case PerformancePackage.EP_PA__TMIN_UNDER_DEMAND_MVP:
				if (resolve) return getT_minUnderDemandMVP();
				return basicGetT_minUnderDemandMVP();
			case PerformancePackage.EP_PA__TDEMANDS_PROB_SVP:
				if (resolve) return getT_demandsProbSVP();
				return basicGetT_demandsProbSVP();
			case PerformancePackage.EP_PA__TMAX_HW_UTIL_SVP:
				if (resolve) return getT_maxHwUtilSVP();
				return basicGetT_maxHwUtilSVP();
			case PerformancePackage.EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP:
				if (resolve) return getT_maxServiceResponseTimeSVP();
				return basicGetT_maxServiceResponseTimeSVP();
			case PerformancePackage.EP_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.EP_PA__FOVER_DEMAND_MVP:
				setF_overDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__FUNDER_DEMAND_MVP:
				setF_underDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__FOVER_DEMAND_PROB_SVP:
				setF_overDemandProbSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__FDEMAND_SUM_PROB_SVP:
				setF_demandSumProbSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__FUNDER_DEMAND_PROB_SVP:
				setF_underDemandProbSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__FHW_UTIL_SVP:
				setF_hwUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__FSERVICE_RESPONSE_TIME_SVP:
				setF_serviceResponseTimeSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__TMAX_OVER_DEMAND_MVP:
				setT_maxOverDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__TMIN_UNDER_DEMAND_MVP:
				setT_minUnderDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__TDEMANDS_PROB_SVP:
				setT_demandsProbSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__TMAX_HW_UTIL_SVP:
				setT_maxHwUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP:
				setT_maxServiceResponseTimeSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.EP_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.EP_PA__FOVER_DEMAND_MVP:
				setF_overDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__FUNDER_DEMAND_MVP:
				setF_underDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__FOVER_DEMAND_PROB_SVP:
				setF_overDemandProbSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__FDEMAND_SUM_PROB_SVP:
				setF_demandSumProbSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__FUNDER_DEMAND_PROB_SVP:
				setF_underDemandProbSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__FHW_UTIL_SVP:
				setF_hwUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__FSERVICE_RESPONSE_TIME_SVP:
				setF_serviceResponseTimeSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__TMAX_OVER_DEMAND_MVP:
				setT_maxOverDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__TMIN_UNDER_DEMAND_MVP:
				setT_minUnderDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__TDEMANDS_PROB_SVP:
				setT_demandsProbSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__TMAX_HW_UTIL_SVP:
				setT_maxHwUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP:
				setT_maxServiceResponseTimeSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.EP_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.EP_PA__FOVER_DEMAND_MVP:
				return f_overDemandMVP != null;
			case PerformancePackage.EP_PA__FUNDER_DEMAND_MVP:
				return f_underDemandMVP != null;
			case PerformancePackage.EP_PA__FOVER_DEMAND_PROB_SVP:
				return f_overDemandProbSVP != null;
			case PerformancePackage.EP_PA__FDEMAND_SUM_PROB_SVP:
				return f_demandSumProbSVP != null;
			case PerformancePackage.EP_PA__FUNDER_DEMAND_PROB_SVP:
				return f_underDemandProbSVP != null;
			case PerformancePackage.EP_PA__FHW_UTIL_SVP:
				return f_hwUtilSVP != null;
			case PerformancePackage.EP_PA__FSERVICE_RESPONSE_TIME_SVP:
				return f_serviceResponseTimeSVP != null;
			case PerformancePackage.EP_PA__TMAX_OVER_DEMAND_MVP:
				return t_maxOverDemandMVP != null;
			case PerformancePackage.EP_PA__TMIN_UNDER_DEMAND_MVP:
				return t_minUnderDemandMVP != null;
			case PerformancePackage.EP_PA__TDEMANDS_PROB_SVP:
				return t_demandsProbSVP != null;
			case PerformancePackage.EP_PA__TMAX_HW_UTIL_SVP:
				return t_maxHwUtilSVP != null;
			case PerformancePackage.EP_PA__TMAX_SERVICE_RESPONSE_TIME_SVP:
				return t_maxServiceResponseTimeSVP != null;
			case PerformancePackage.EP_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.EP_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE:
				setParametersForPartialDetection((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case PerformancePackage.EP_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				setParametersForFullDetection((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4));
				return null;
			case PerformancePackage.EP_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE_DOUBLE:
				return partialDetection((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case PerformancePackage.EP_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return fullDetection((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4));
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

} //EpPAImpl
