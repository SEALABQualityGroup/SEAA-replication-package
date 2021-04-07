/**
 */
package logicalSpecification.antipatterns.performance;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cps PA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getF_queueLengthSVP <em>Fqueue Length SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getF_overUtilSVP <em>Fover Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getF_underUtilSVP <em>Funder Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getF_opDemandMVP <em>Fop Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxQueueLengthSVP <em>Tmax Queue Length SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxOverUtilSVP <em>Tmax Over Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getT_minUnderUtilSVP <em>Tmin Under Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxOpDemandMVP <em>Tmax Op Demand MVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.CpsPA#getContextualElement <em>Contextual Element</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA()
 * @model
 * @generated
 */
public interface CpsPA extends PerformanceAntipattern {
	/**
	 * Returns the value of the '<em><b>Fqueue Length SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fqueue Length SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fqueue Length SVP</em>' reference.
	 * @see #setF_queueLengthSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_F_queueLengthSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_queueLengthSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_queueLengthSVP <em>Fqueue Length SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fqueue Length SVP</em>' reference.
	 * @see #getF_queueLengthSVP()
	 * @generated
	 */
	void setF_queueLengthSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fover Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fover Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fover Util SVP</em>' reference.
	 * @see #setF_overUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_F_overUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_overUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_overUtilSVP <em>Fover Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fover Util SVP</em>' reference.
	 * @see #getF_overUtilSVP()
	 * @generated
	 */
	void setF_overUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Funder Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funder Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funder Util SVP</em>' reference.
	 * @see #setF_underUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_F_underUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_underUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_underUtilSVP <em>Funder Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funder Util SVP</em>' reference.
	 * @see #getF_underUtilSVP()
	 * @generated
	 */
	void setF_underUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fop Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fop Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fop Demand MVP</em>' reference.
	 * @see #setF_opDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_F_opDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getF_opDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getF_opDemandMVP <em>Fop Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fop Demand MVP</em>' reference.
	 * @see #getF_opDemandMVP()
	 * @generated
	 */
	void setF_opDemandMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Queue Length SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Queue Length SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Queue Length SVP</em>' reference.
	 * @see #setT_maxQueueLengthSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_T_maxQueueLengthSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxQueueLengthSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxQueueLengthSVP <em>Tmax Queue Length SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Queue Length SVP</em>' reference.
	 * @see #getT_maxQueueLengthSVP()
	 * @generated
	 */
	void setT_maxQueueLengthSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Over Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Over Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Over Util SVP</em>' reference.
	 * @see #setT_maxOverUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_T_maxOverUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxOverUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxOverUtilSVP <em>Tmax Over Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Over Util SVP</em>' reference.
	 * @see #getT_maxOverUtilSVP()
	 * @generated
	 */
	void setT_maxOverUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmin Under Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmin Under Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmin Under Util SVP</em>' reference.
	 * @see #setT_minUnderUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_T_minUnderUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_minUnderUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_minUnderUtilSVP <em>Tmin Under Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmin Under Util SVP</em>' reference.
	 * @see #getT_minUnderUtilSVP()
	 * @generated
	 */
	void setT_minUnderUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Op Demand MVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Op Demand MVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Op Demand MVP</em>' reference.
	 * @see #setT_maxOpDemandMVP(MultipleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_T_maxOpDemandMVP()
	 * @model required="true"
	 * @generated
	 */
	MultipleValuedParameter getT_maxOpDemandMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getT_maxOpDemandMVP <em>Tmax Op Demand MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Op Demand MVP</em>' reference.
	 * @see #getT_maxOpDemandMVP()
	 * @generated
	 */
	void setT_maxOpDemandMVP(MultipleValuedParameter value);

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getCpsPA_ContextualElement()
	 * @model required="true"
	 * @generated
	 */
	Object getContextualElement();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.CpsPA#getContextualElement <em>Contextual Element</em>}' attribute.
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
	 * @model T_maxOpDemandRequired="true"
	 * @generated
	 */
	void setParametersForPartialDetection(double T_maxOpDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model T_maxQueueLengthRequired="true" T_maxOverUtilRequired="true" T_minUnderUtilRequired="true" T_maxOpDemandRequired="true"
	 * @generated
	 */
	void setParametersForFullDetection(double T_maxQueueLength, double T_maxOverUtil, double T_minUnderUtil, double T_maxOpDemand);

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
	 * @model required="true" T_maxOpDemandRequired="true"
	 * @generated
	 */
	int partialDetection(double T_maxOpDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" T_maxQueueLengthRequired="true" T_maxOverUtilRequired="true" T_minUnderUtilRequired="true" T_maxOpDemandRequired="true"
	 * @generated
	 */
	int fullDetection(double T_maxQueueLength, double T_maxOverUtil, double T_minUnderUtil, double T_maxOpDemand);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void log();

} // CpsPA
