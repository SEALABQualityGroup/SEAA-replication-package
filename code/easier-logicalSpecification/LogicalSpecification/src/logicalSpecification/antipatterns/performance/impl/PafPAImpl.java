/**
 */
package logicalSpecification.antipatterns.performance.impl;

import java.lang.reflect.InvocationTargetException;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.antipatterns.performance.PafPA;
import logicalSpecification.antipatterns.performance.PerformancePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paf PA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getF_resDemandMVP <em>Fres Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getF_opProbExecSVP <em>Fop Prob Exec SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getF_hwUtilSVP <em>Fhw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getF_serviceThroughputSVP <em>Fservice Throughput SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getT_maxResDemandMVP <em>Tmax Res Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getT_opProbExecSVP <em>Top Prob Exec SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getT_minServiceThroughputSVP <em>Tmin Service Throughput SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.impl.PafPAImpl#getContextualElement <em>Contextual Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PafPAImpl extends PerformanceAntipatternImpl implements PafPA {
	/**
	 * The cached value of the '{@link #getF_resDemandMVP() <em>Fres Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_resDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter f_resDemandMVP;

	/**
	 * The cached value of the '{@link #getF_opProbExecSVP() <em>Fop Prob Exec SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_opProbExecSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_opProbExecSVP;

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
	 * The cached value of the '{@link #getF_serviceThroughputSVP() <em>Fservice Throughput SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getF_serviceThroughputSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter f_serviceThroughputSVP;

	/**
	 * The cached value of the '{@link #getT_maxResDemandMVP() <em>Tmax Res Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_maxResDemandMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter t_maxResDemandMVP;

	/**
	 * The cached value of the '{@link #getT_opProbExecSVP() <em>Top Prob Exec SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_opProbExecSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_opProbExecSVP;

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
	 * The cached value of the '{@link #getT_minServiceThroughputSVP() <em>Tmin Service Throughput SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_minServiceThroughputSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter t_minServiceThroughputSVP;

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
	protected PafPAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PerformancePackage.Literals.PAF_PA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getF_resDemandMVP() {
		if (f_resDemandMVP != null && f_resDemandMVP.eIsProxy()) {
			InternalEObject oldF_resDemandMVP = (InternalEObject)f_resDemandMVP;
			f_resDemandMVP = (MultipleValuedParameter)eResolveProxy(oldF_resDemandMVP);
			if (f_resDemandMVP != oldF_resDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__FRES_DEMAND_MVP, oldF_resDemandMVP, f_resDemandMVP));
			}
		}
		return f_resDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetF_resDemandMVP() {
		return f_resDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_resDemandMVP(MultipleValuedParameter newF_resDemandMVP) {
		MultipleValuedParameter oldF_resDemandMVP = f_resDemandMVP;
		f_resDemandMVP = newF_resDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__FRES_DEMAND_MVP, oldF_resDemandMVP, f_resDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_opProbExecSVP() {
		if (f_opProbExecSVP != null && f_opProbExecSVP.eIsProxy()) {
			InternalEObject oldF_opProbExecSVP = (InternalEObject)f_opProbExecSVP;
			f_opProbExecSVP = (SingleValuedParameter)eResolveProxy(oldF_opProbExecSVP);
			if (f_opProbExecSVP != oldF_opProbExecSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__FOP_PROB_EXEC_SVP, oldF_opProbExecSVP, f_opProbExecSVP));
			}
		}
		return f_opProbExecSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_opProbExecSVP() {
		return f_opProbExecSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_opProbExecSVP(SingleValuedParameter newF_opProbExecSVP) {
		SingleValuedParameter oldF_opProbExecSVP = f_opProbExecSVP;
		f_opProbExecSVP = newF_opProbExecSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__FOP_PROB_EXEC_SVP, oldF_opProbExecSVP, f_opProbExecSVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__FHW_UTIL_SVP, oldF_hwUtilSVP, f_hwUtilSVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__FHW_UTIL_SVP, oldF_hwUtilSVP, f_hwUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getF_serviceThroughputSVP() {
		if (f_serviceThroughputSVP != null && f_serviceThroughputSVP.eIsProxy()) {
			InternalEObject oldF_serviceThroughputSVP = (InternalEObject)f_serviceThroughputSVP;
			f_serviceThroughputSVP = (SingleValuedParameter)eResolveProxy(oldF_serviceThroughputSVP);
			if (f_serviceThroughputSVP != oldF_serviceThroughputSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__FSERVICE_THROUGHPUT_SVP, oldF_serviceThroughputSVP, f_serviceThroughputSVP));
			}
		}
		return f_serviceThroughputSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetF_serviceThroughputSVP() {
		return f_serviceThroughputSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_serviceThroughputSVP(SingleValuedParameter newF_serviceThroughputSVP) {
		SingleValuedParameter oldF_serviceThroughputSVP = f_serviceThroughputSVP;
		f_serviceThroughputSVP = newF_serviceThroughputSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__FSERVICE_THROUGHPUT_SVP, oldF_serviceThroughputSVP, f_serviceThroughputSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getT_maxResDemandMVP() {
		if (t_maxResDemandMVP != null && t_maxResDemandMVP.eIsProxy()) {
			InternalEObject oldT_maxResDemandMVP = (InternalEObject)t_maxResDemandMVP;
			t_maxResDemandMVP = (MultipleValuedParameter)eResolveProxy(oldT_maxResDemandMVP);
			if (t_maxResDemandMVP != oldT_maxResDemandMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__TMAX_RES_DEMAND_MVP, oldT_maxResDemandMVP, t_maxResDemandMVP));
			}
		}
		return t_maxResDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetT_maxResDemandMVP() {
		return t_maxResDemandMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_maxResDemandMVP(MultipleValuedParameter newT_maxResDemandMVP) {
		MultipleValuedParameter oldT_maxResDemandMVP = t_maxResDemandMVP;
		t_maxResDemandMVP = newT_maxResDemandMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__TMAX_RES_DEMAND_MVP, oldT_maxResDemandMVP, t_maxResDemandMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_opProbExecSVP() {
		if (t_opProbExecSVP != null && t_opProbExecSVP.eIsProxy()) {
			InternalEObject oldT_opProbExecSVP = (InternalEObject)t_opProbExecSVP;
			t_opProbExecSVP = (SingleValuedParameter)eResolveProxy(oldT_opProbExecSVP);
			if (t_opProbExecSVP != oldT_opProbExecSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__TOP_PROB_EXEC_SVP, oldT_opProbExecSVP, t_opProbExecSVP));
			}
		}
		return t_opProbExecSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_opProbExecSVP() {
		return t_opProbExecSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_opProbExecSVP(SingleValuedParameter newT_opProbExecSVP) {
		SingleValuedParameter oldT_opProbExecSVP = t_opProbExecSVP;
		t_opProbExecSVP = newT_opProbExecSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__TOP_PROB_EXEC_SVP, oldT_opProbExecSVP, t_opProbExecSVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__TMAX_HW_UTIL_SVP, oldT_maxHwUtilSVP, t_maxHwUtilSVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__TMAX_HW_UTIL_SVP, oldT_maxHwUtilSVP, t_maxHwUtilSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getT_minServiceThroughputSVP() {
		if (t_minServiceThroughputSVP != null && t_minServiceThroughputSVP.eIsProxy()) {
			InternalEObject oldT_minServiceThroughputSVP = (InternalEObject)t_minServiceThroughputSVP;
			t_minServiceThroughputSVP = (SingleValuedParameter)eResolveProxy(oldT_minServiceThroughputSVP);
			if (t_minServiceThroughputSVP != oldT_minServiceThroughputSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PerformancePackage.PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP, oldT_minServiceThroughputSVP, t_minServiceThroughputSVP));
			}
		}
		return t_minServiceThroughputSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetT_minServiceThroughputSVP() {
		return t_minServiceThroughputSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_minServiceThroughputSVP(SingleValuedParameter newT_minServiceThroughputSVP) {
		SingleValuedParameter oldT_minServiceThroughputSVP = t_minServiceThroughputSVP;
		t_minServiceThroughputSVP = newT_minServiceThroughputSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP, oldT_minServiceThroughputSVP, t_minServiceThroughputSVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PerformancePackage.PAF_PA__CONTEXTUAL_ELEMENT, oldContextualElement, contextualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForPartialDetection(double T_maxResDemand, double T_opProbExec) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersForFullDetection(double T_maxResDemand, double T_opProbExec, double T_maxHwUtil, double T_minServiceThroughput) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int partialDetection(double T_maxResDemand, double T_opProbExec) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int fullDetection(double T_maxResDemand, double T_opProbExec, double T_maxHwUtil, double T_minServiceThroughput) {
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
			case PerformancePackage.PAF_PA__FRES_DEMAND_MVP:
				if (resolve) return getF_resDemandMVP();
				return basicGetF_resDemandMVP();
			case PerformancePackage.PAF_PA__FOP_PROB_EXEC_SVP:
				if (resolve) return getF_opProbExecSVP();
				return basicGetF_opProbExecSVP();
			case PerformancePackage.PAF_PA__FHW_UTIL_SVP:
				if (resolve) return getF_hwUtilSVP();
				return basicGetF_hwUtilSVP();
			case PerformancePackage.PAF_PA__FSERVICE_THROUGHPUT_SVP:
				if (resolve) return getF_serviceThroughputSVP();
				return basicGetF_serviceThroughputSVP();
			case PerformancePackage.PAF_PA__TMAX_RES_DEMAND_MVP:
				if (resolve) return getT_maxResDemandMVP();
				return basicGetT_maxResDemandMVP();
			case PerformancePackage.PAF_PA__TOP_PROB_EXEC_SVP:
				if (resolve) return getT_opProbExecSVP();
				return basicGetT_opProbExecSVP();
			case PerformancePackage.PAF_PA__TMAX_HW_UTIL_SVP:
				if (resolve) return getT_maxHwUtilSVP();
				return basicGetT_maxHwUtilSVP();
			case PerformancePackage.PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP:
				if (resolve) return getT_minServiceThroughputSVP();
				return basicGetT_minServiceThroughputSVP();
			case PerformancePackage.PAF_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.PAF_PA__FRES_DEMAND_MVP:
				setF_resDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__FOP_PROB_EXEC_SVP:
				setF_opProbExecSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__FHW_UTIL_SVP:
				setF_hwUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__FSERVICE_THROUGHPUT_SVP:
				setF_serviceThroughputSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__TMAX_RES_DEMAND_MVP:
				setT_maxResDemandMVP((MultipleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__TOP_PROB_EXEC_SVP:
				setT_opProbExecSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__TMAX_HW_UTIL_SVP:
				setT_maxHwUtilSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP:
				setT_minServiceThroughputSVP((SingleValuedParameter)newValue);
				return;
			case PerformancePackage.PAF_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.PAF_PA__FRES_DEMAND_MVP:
				setF_resDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__FOP_PROB_EXEC_SVP:
				setF_opProbExecSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__FHW_UTIL_SVP:
				setF_hwUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__FSERVICE_THROUGHPUT_SVP:
				setF_serviceThroughputSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__TMAX_RES_DEMAND_MVP:
				setT_maxResDemandMVP((MultipleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__TOP_PROB_EXEC_SVP:
				setT_opProbExecSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__TMAX_HW_UTIL_SVP:
				setT_maxHwUtilSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP:
				setT_minServiceThroughputSVP((SingleValuedParameter)null);
				return;
			case PerformancePackage.PAF_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.PAF_PA__FRES_DEMAND_MVP:
				return f_resDemandMVP != null;
			case PerformancePackage.PAF_PA__FOP_PROB_EXEC_SVP:
				return f_opProbExecSVP != null;
			case PerformancePackage.PAF_PA__FHW_UTIL_SVP:
				return f_hwUtilSVP != null;
			case PerformancePackage.PAF_PA__FSERVICE_THROUGHPUT_SVP:
				return f_serviceThroughputSVP != null;
			case PerformancePackage.PAF_PA__TMAX_RES_DEMAND_MVP:
				return t_maxResDemandMVP != null;
			case PerformancePackage.PAF_PA__TOP_PROB_EXEC_SVP:
				return t_opProbExecSVP != null;
			case PerformancePackage.PAF_PA__TMAX_HW_UTIL_SVP:
				return t_maxHwUtilSVP != null;
			case PerformancePackage.PAF_PA__TMIN_SERVICE_THROUGHPUT_SVP:
				return t_minServiceThroughputSVP != null;
			case PerformancePackage.PAF_PA__CONTEXTUAL_ELEMENT:
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
			case PerformancePackage.PAF_PA___SET_PARAMETERS_FOR_PARTIAL_DETECTION__DOUBLE_DOUBLE:
				setParametersForPartialDetection((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case PerformancePackage.PAF_PA___SET_PARAMETERS_FOR_FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				setParametersForFullDetection((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
				return null;
			case PerformancePackage.PAF_PA___PARTIAL_DETECTION__DOUBLE_DOUBLE:
				return partialDetection((Double)arguments.get(0), (Double)arguments.get(1));
			case PerformancePackage.PAF_PA___FULL_DETECTION__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
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

} //PafPAImpl
