/**
 */
package logicalSpecification.antipatterns.performance;

import logicalSpecification.SingleValuedParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blob PA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numClientConnectsSVP <em>Fnum Client Connects SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numSupplierConnectsSVP <em>Fnum Supplier Connects SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numSentMsgsSVP <em>Fnum Sent Msgs SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numReceivedMsgsSVP <em>Fnum Received Msgs SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getF_netUtilSVP <em>Fnet Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxClientConnectsSVP <em>Tmax Client Connects SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxSupplierConnectsSVP <em>Tmax Supplier Connects SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxSentMsgsSVP <em>Tmax Sent Msgs SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxReceivedMsgsSVP <em>Tmax Received Msgs SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getT_minNetUtilSVP <em>Tmin Net Util SVP</em>}</li>
 *   <li>{@link logicalSpecification.antipatterns.performance.BlobPA#getContextualElement <em>Contextual Element</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA()
 * @model
 * @generated
 */
public interface BlobPA extends PerformanceAntipattern {
	/**
	 * Returns the value of the '<em><b>Fnum Client Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fnum Client Connects SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fnum Client Connects SVP</em>' reference.
	 * @see #setF_numClientConnectsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_F_numClientConnectsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_numClientConnectsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numClientConnectsSVP <em>Fnum Client Connects SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fnum Client Connects SVP</em>' reference.
	 * @see #getF_numClientConnectsSVP()
	 * @generated
	 */
	void setF_numClientConnectsSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fnum Supplier Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fnum Supplier Connects SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fnum Supplier Connects SVP</em>' reference.
	 * @see #setF_numSupplierConnectsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_F_numSupplierConnectsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_numSupplierConnectsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numSupplierConnectsSVP <em>Fnum Supplier Connects SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fnum Supplier Connects SVP</em>' reference.
	 * @see #getF_numSupplierConnectsSVP()
	 * @generated
	 */
	void setF_numSupplierConnectsSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fnum Sent Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fnum Sent Msgs SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fnum Sent Msgs SVP</em>' reference.
	 * @see #setF_numSentMsgsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_F_numSentMsgsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_numSentMsgsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numSentMsgsSVP <em>Fnum Sent Msgs SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fnum Sent Msgs SVP</em>' reference.
	 * @see #getF_numSentMsgsSVP()
	 * @generated
	 */
	void setF_numSentMsgsSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fnum Received Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fnum Received Msgs SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fnum Received Msgs SVP</em>' reference.
	 * @see #setF_numReceivedMsgsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_F_numReceivedMsgsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_numReceivedMsgsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_numReceivedMsgsSVP <em>Fnum Received Msgs SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fnum Received Msgs SVP</em>' reference.
	 * @see #getF_numReceivedMsgsSVP()
	 * @generated
	 */
	void setF_numReceivedMsgsSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_F_hwUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_hwUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_hwUtilSVP <em>Fhw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fhw Util SVP</em>' reference.
	 * @see #getF_hwUtilSVP()
	 * @generated
	 */
	void setF_hwUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Fnet Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fnet Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fnet Util SVP</em>' reference.
	 * @see #setF_netUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_F_netUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getF_netUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getF_netUtilSVP <em>Fnet Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fnet Util SVP</em>' reference.
	 * @see #getF_netUtilSVP()
	 * @generated
	 */
	void setF_netUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Client Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Client Connects SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Client Connects SVP</em>' reference.
	 * @see #setT_maxClientConnectsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_T_maxClientConnectsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxClientConnectsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxClientConnectsSVP <em>Tmax Client Connects SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Client Connects SVP</em>' reference.
	 * @see #getT_maxClientConnectsSVP()
	 * @generated
	 */
	void setT_maxClientConnectsSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Supplier Connects SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Supplier Connects SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Supplier Connects SVP</em>' reference.
	 * @see #setT_maxSupplierConnectsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_T_maxSupplierConnectsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxSupplierConnectsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxSupplierConnectsSVP <em>Tmax Supplier Connects SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Supplier Connects SVP</em>' reference.
	 * @see #getT_maxSupplierConnectsSVP()
	 * @generated
	 */
	void setT_maxSupplierConnectsSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Sent Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Sent Msgs SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Sent Msgs SVP</em>' reference.
	 * @see #setT_maxSentMsgsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_T_maxSentMsgsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxSentMsgsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxSentMsgsSVP <em>Tmax Sent Msgs SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Sent Msgs SVP</em>' reference.
	 * @see #getT_maxSentMsgsSVP()
	 * @generated
	 */
	void setT_maxSentMsgsSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmax Received Msgs SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmax Received Msgs SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmax Received Msgs SVP</em>' reference.
	 * @see #setT_maxReceivedMsgsSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_T_maxReceivedMsgsSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxReceivedMsgsSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxReceivedMsgsSVP <em>Tmax Received Msgs SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Received Msgs SVP</em>' reference.
	 * @see #getT_maxReceivedMsgsSVP()
	 * @generated
	 */
	void setT_maxReceivedMsgsSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_T_maxHwUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_maxHwUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_maxHwUtilSVP <em>Tmax Hw Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmax Hw Util SVP</em>' reference.
	 * @see #getT_maxHwUtilSVP()
	 * @generated
	 */
	void setT_maxHwUtilSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Tmin Net Util SVP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmin Net Util SVP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmin Net Util SVP</em>' reference.
	 * @see #setT_minNetUtilSVP(SingleValuedParameter)
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_T_minNetUtilSVP()
	 * @model required="true"
	 * @generated
	 */
	SingleValuedParameter getT_minNetUtilSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getT_minNetUtilSVP <em>Tmin Net Util SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmin Net Util SVP</em>' reference.
	 * @see #getT_minNetUtilSVP()
	 * @generated
	 */
	void setT_minNetUtilSVP(SingleValuedParameter value);

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
	 * @see logicalSpecification.antipatterns.performance.PerformancePackage#getBlobPA_ContextualElement()
	 * @model required="true"
	 * @generated
	 */
	Object getContextualElement();

	/**
	 * Sets the value of the '{@link logicalSpecification.antipatterns.performance.BlobPA#getContextualElement <em>Contextual Element</em>}' attribute.
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
	 * @model T_maxClientConnectsRequired="true" T_maxSupplierConnectsRequired="true" T_maxSentMsgsRequired="true" T_maxReceivedMsgsRequired="true"
	 * @generated
	 */
	void setParametersForPartialDetection(double T_maxClientConnects, double T_maxSupplierConnects, double T_maxSentMsgs, double T_maxReceivedMsgs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model T_maxClientConnectsRequired="true" T_maxSupplierConnectsRequired="true" T_maxSentMsgsRequired="true" T_maxReceivedMsgsRequired="true" T_maxHwUtilRequired="true" T_minNetUtilRequired="true"
	 * @generated
	 */
	void setParametersForFullDetection(double T_maxClientConnects, double T_maxSupplierConnects, double T_maxSentMsgs, double T_maxReceivedMsgs, double T_maxHwUtil, double T_minNetUtil);

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
	 * @model required="true" T_maxClientConnectsRequired="true" T_maxSupplierConnectsRequired="true" T_maxSentMsgsRequired="true" T_maxReceivedMsgsRequired="true"
	 * @generated
	 */
	int partialDetection(double T_maxClientConnects, double T_maxSupplierConnects, double T_maxSentMsgs, double T_maxReceivedMsgs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" T_maxClientConnectsRequired="true" T_maxSupplierConnectsRequired="true" T_maxSentMsgsRequired="true" T_maxReceivedMsgsRequired="true" T_maxHwUtilRequired="true" T_minNetUtilRequired="true"
	 * @generated
	 */
	int fullDetection(double T_maxClientConnects, double T_maxSupplierConnects, double T_maxSentMsgs, double T_maxReceivedMsgs, double T_maxHwUtil, double T_minNetUtil);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void log();

} // BlobPA
