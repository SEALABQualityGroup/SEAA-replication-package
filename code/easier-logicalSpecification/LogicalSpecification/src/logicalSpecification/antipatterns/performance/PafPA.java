/**
 */
package logicalSpecification.antipatterns.performance;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paf PA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getF_resDemandMVP <em>Fres Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getF_opProbExecSVP <em>Fop Prob Exec SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getF_serviceThroughputSVP <em>Fservice Throughput SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getT_maxResDemandMVP <em>Tmax Res Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getT_opProbExecSVP <em>Top Prob Exec SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getT_minServiceThroughputSVP <em>Tmin Service Throughput SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.PafPA#getContextualElement <em>Contextual Element</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA()
 * @model
 * @generated
 */
public interface PafPA extends PerformanceAntipattern {
	/**
	 * Returns the value of the '<em><b>Fres Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fres Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fres Demand MVP</em>' reference.
	 * @see #setF_resDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_F_resDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getF_resDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getF_resDemandMVP <em>Fres Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fres Demand MVP</em>' reference.
	 * @see #getF_resDemandMVP()
	 * @generated
	 */
	void setF_resDemandMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fop Prob Exec SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fop Prob Exec SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fop Prob Exec SVP</em>' reference.
	 * @see #setF_opProbExecSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_F_opProbExecSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_opProbExecSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getF_opProbExecSVP <em>Fop Prob Exec SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fop Prob Exec SVP</em>' reference.
	 * @see #getF_opProbExecSVP()
	 * @generated
	 */
	void setF_opProbExecSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_F_hwUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_hwUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhw Util SVP</em>' reference.
	 * @see #getF_hwUtilSVP()
	 * @generated
	 */
	void setF_hwUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fservice Throughput SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fservice Throughput SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fservice Throughput SVP</em>' reference.
	 * @see #setF_serviceThroughputSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_F_serviceThroughputSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_serviceThroughputSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getF_serviceThroughputSVP <em>Fservice Throughput SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fservice Throughput SVP</em>' reference.
	 * @see #getF_serviceThroughputSVP()
	 * @generated
	 */
	void setF_serviceThroughputSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Res Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Res Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Res Demand MVP</em>' reference.
	 * @see #setT_maxResDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_T_maxResDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getT_maxResDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getT_maxResDemandMVP <em>Tmax Res Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Res Demand MVP</em>' reference.
	 * @see #getT_maxResDemandMVP()
	 * @generated
	 */
	void setT_maxResDemandMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Top Prob Exec SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Prob Exec SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Prob Exec SVP</em>' reference.
	 * @see #setT_opProbExecSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_T_opProbExecSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_opProbExecSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getT_opProbExecSVP <em>Top Prob Exec SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Prob Exec SVP</em>' reference.
	 * @see #getT_opProbExecSVP()
	 * @generated
	 */
	void setT_opProbExecSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_T_maxHwUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxHwUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Hw Util SVP</em>' reference.
	 * @see #getT_maxHwUtilSVP()
	 * @generated
	 */
	void setT_maxHwUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmin Service Throughput SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmin Service Throughput SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmin Service Throughput SVP</em>' reference.
	 * @see #setT_minServiceThroughputSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_T_minServiceThroughputSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_minServiceThroughputSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getT_minServiceThroughputSVP <em>Tmin Service Throughput SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmin Service Throughput SVP</em>' reference.
	 * @see #getT_minServiceThroughputSVP()
	 * @generated
	 */
	void setT_minServiceThroughputSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getPafPA_ContextualElement()
	 * @model required="true"
	 * @generated
	 */
	Object getContextualElement();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.PafPA#getContextualElement <em>Contextual Element</em>}' attribute.
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
	 * @model T_maxResDemandRequired="true" T_opProbExecRequired="true"
	 * @generated
	 */
	void setParametersForPartialDetection(double T_maxResDemand, double T_opProbExec);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model T_maxResDemandRequired="true" T_opProbExecRequired="true" T_maxHwUtilRequired="true" T_minServiceThroughputRequired="true"
	 * @generated
	 */
	void setParametersForFullDetection(double T_maxResDemand, double T_opProbExec, double T_maxHwUtil, double T_minServiceThroughput);

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
	 * @model required="true" T_maxResDemandRequired="true" T_opProbExecRequired="true"
	 * @generated
	 */
	int partialDetection(double T_maxResDemand, double T_opProbExec);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" T_maxResDemandRequired="true" T_opProbExecRequired="true" T_maxHwUtilRequired="true" T_minServiceThroughputRequired="true"
	 * @generated
	 */
	int fullDetection(double T_maxResDemand, double T_opProbExec, double T_maxHwUtil, double T_minServiceThroughput);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void log();

} // PafPA
