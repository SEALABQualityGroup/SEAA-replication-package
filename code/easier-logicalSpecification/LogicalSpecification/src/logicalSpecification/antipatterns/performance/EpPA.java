/**
 */
package logicalSpecification.antipatterns.performance;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ep PA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getF_overDemandMVP <em>Fover Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getF_underDemandMVP <em>Funder Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getF_overDemandProbSVP <em>Fover Demand Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getF_demandSumProbSVP <em>Fdemand Sum Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getF_underDemandProbSVP <em>Funder Demand Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getF_serviceResponseTimeSVP <em>Fservice Response Time SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxOverDemandMVP <em>Tmax Over Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getT_minUnderDemandMVP <em>Tmin Under Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getT_demandsProbSVP <em>Tdemands Prob SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxServiceResponseTimeSVP <em>Tmax Service Response Time SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.EpPA#getContextualElement <em>Contextual Element</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA()
 * @model
 * @generated
 */
public interface EpPA extends PerformanceAntipattern {
	/**
	 * Returns the value of the '<em><b>Fover Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fover Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fover Demand MVP</em>' reference.
	 * @see #setF_overDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_F_overDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getF_overDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getF_overDemandMVP <em>Fover Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fover Demand MVP</em>' reference.
	 * @see #getF_overDemandMVP()
	 * @generated
	 */
	void setF_overDemandMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Funder Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funder Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funder Demand MVP</em>' reference.
	 * @see #setF_underDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_F_underDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getF_underDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getF_underDemandMVP <em>Funder Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funder Demand MVP</em>' reference.
	 * @see #getF_underDemandMVP()
	 * @generated
	 */
	void setF_underDemandMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fover Demand Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fover Demand Prob SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fover Demand Prob SVP</em>' reference.
	 * @see #setF_overDemandProbSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_F_overDemandProbSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_overDemandProbSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getF_overDemandProbSVP <em>Fover Demand Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fover Demand Prob SVP</em>' reference.
	 * @see #getF_overDemandProbSVP()
	 * @generated
	 */
	void setF_overDemandProbSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fdemand Sum Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fdemand Sum Prob SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fdemand Sum Prob SVP</em>' reference.
	 * @see #setF_demandSumProbSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_F_demandSumProbSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_demandSumProbSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getF_demandSumProbSVP <em>Fdemand Sum Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fdemand Sum Prob SVP</em>' reference.
	 * @see #getF_demandSumProbSVP()
	 * @generated
	 */
	void setF_demandSumProbSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Funder Demand Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funder Demand Prob SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funder Demand Prob SVP</em>' reference.
	 * @see #setF_underDemandProbSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_F_underDemandProbSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_underDemandProbSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getF_underDemandProbSVP <em>Funder Demand Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funder Demand Prob SVP</em>' reference.
	 * @see #getF_underDemandProbSVP()
	 * @generated
	 */
	void setF_underDemandProbSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fhw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fhw Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fhw Util SVP</em>' reference.
	 * @see #setF_hwUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_F_hwUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_hwUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhw Util SVP</em>' reference.
	 * @see #getF_hwUtilSVP()
	 * @generated
	 */
	void setF_hwUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fservice Response Time SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fservice Response Time SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fservice Response Time SVP</em>' reference.
	 * @see #setF_serviceResponseTimeSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_F_serviceResponseTimeSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_serviceResponseTimeSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getF_serviceResponseTimeSVP <em>Fservice Response Time SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fservice Response Time SVP</em>' reference.
	 * @see #getF_serviceResponseTimeSVP()
	 * @generated
	 */
	void setF_serviceResponseTimeSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Over Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Over Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Over Demand MVP</em>' reference.
	 * @see #setT_maxOverDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_T_maxOverDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getT_maxOverDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxOverDemandMVP <em>Tmax Over Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Over Demand MVP</em>' reference.
	 * @see #getT_maxOverDemandMVP()
	 * @generated
	 */
	void setT_maxOverDemandMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmin Under Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmin Under Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmin Under Demand MVP</em>' reference.
	 * @see #setT_minUnderDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_T_minUnderDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getT_minUnderDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getT_minUnderDemandMVP <em>Tmin Under Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmin Under Demand MVP</em>' reference.
	 * @see #getT_minUnderDemandMVP()
	 * @generated
	 */
	void setT_minUnderDemandMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tdemands Prob SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tdemands Prob SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tdemands Prob SVP</em>' reference.
	 * @see #setT_demandsProbSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_T_demandsProbSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_demandsProbSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getT_demandsProbSVP <em>Tdemands Prob SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tdemands Prob SVP</em>' reference.
	 * @see #getT_demandsProbSVP()
	 * @generated
	 */
	void setT_demandsProbSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Hw Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Hw Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Hw Util SVP</em>' reference.
	 * @see #setT_maxHwUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_T_maxHwUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxHwUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Hw Util SVP</em>' reference.
	 * @see #getT_maxHwUtilSVP()
	 * @generated
	 */
	void setT_maxHwUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Service Response Time SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Service Response Time SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Service Response Time SVP</em>' reference.
	 * @see #setT_maxServiceResponseTimeSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_T_maxServiceResponseTimeSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxServiceResponseTimeSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getT_maxServiceResponseTimeSVP <em>Tmax Service Response Time SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Service Response Time SVP</em>' reference.
	 * @see #getT_maxServiceResponseTimeSVP()
	 * @generated
	 */
	void setT_maxServiceResponseTimeSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Contextual Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextual Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Element</em>' attribute.
	 * @see #setContextualElement(Object)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getEpPA_ContextualElement()
	 * @model required="true"
	 * @generated
	 */
	Object getContextualElement();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.EpPA#getContextualElement <em>Contextual Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Element</em>' attribute.
	 * @see #getContextualElement()
	 * @generated
	 */
	void setContextualElement(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model T_maxOverDemandRequired="true" T_minUnderDemandRequired="true" T_demandsProbRequired="true"
	 * @generated
	 */
	void setParametersForPartialDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model T_maxOverDemandRequired="true" T_minUnderDemandRequired="true" T_demandsProbRequired="true" T_maxHwUtilRequired="true" T_maxServiceResponseTimeRequired="true"
	 * @generated
	 */
	void setParametersForFullDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb, double T_maxHwUtil, double T_maxServiceResponseTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createFormula();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" T_maxOverDemandRequired="true" T_minUnderDemandRequired="true" T_demandsProbRequired="true"
	 * @generated
	 */
	int partialDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" T_maxOverDemandRequired="true" T_minUnderDemandRequired="true" T_demandsProbRequired="true" T_maxHwUtilRequired="true" T_maxServiceResponseTimeRequired="true"
	 * @generated
	 */
	int fullDetection(double T_maxOverDemand, double T_minUnderDemand, double T_demandsProb, double T_maxHwUtil, double T_maxServiceResponseTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void log();

} // EpPA
