/**
 */
package logicalSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.Operator#getFolspecification <em>Folspecification</em>}</li>
 *   <li>{@link logicalSpecification.Operator#getForAlloperator <em>For Alloperator</em>}</li>
 *   <li>{@link logicalSpecification.Operator#getNotOperator <em>Not Operator</em>}</li>
 *   <li>{@link logicalSpecification.Operator#getAndOperator <em>And Operator</em>}</li>
 *   <li>{@link logicalSpecification.Operator#getOrOperator <em>Or Operator</em>}</li>
 *   <li>{@link logicalSpecification.Operator#getExistsOperator <em>Exists Operator</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends EObject {
	/**
	 * Returns the value of the '<em><b>Folspecification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.FOLSpecification#getRootOperator <em>Root Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folspecification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folspecification</em>' container reference.
	 * @see #setFolspecification(FOLSpecification)
	 * @see logicalSpecification.LogicalSpecificationPackage#getOperator_Folspecification()
	 * @see logicalSpecification.FOLSpecification#getRootOperator
	 * @model opposite="rootOperator" transient="false"
	 * @generated
	 */
	FOLSpecification getFolspecification();

	/**
	 * Sets the value of the '{@link logicalSpecification.Operator#getFolspecification <em>Folspecification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folspecification</em>' container reference.
	 * @see #getFolspecification()
	 * @generated
	 */
	void setFolspecification(FOLSpecification value);

	/**
	 * Returns the value of the '<em><b>For Alloperator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.ForAllOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Alloperator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Alloperator</em>' container reference.
	 * @see #setForAlloperator(ForAllOperator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getOperator_ForAlloperator()
	 * @see logicalSpecification.ForAllOperator#getArgument
	 * @model opposite="argument" transient="false"
	 * @generated
	 */
	ForAllOperator getForAlloperator();

	/**
	 * Sets the value of the '{@link logicalSpecification.Operator#getForAlloperator <em>For Alloperator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Alloperator</em>' container reference.
	 * @see #getForAlloperator()
	 * @generated
	 */
	void setForAlloperator(ForAllOperator value);

	/**
	 * Returns the value of the '<em><b>Not Operator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.NotOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Operator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Operator</em>' container reference.
	 * @see #setNotOperator(NotOperator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getOperator_NotOperator()
	 * @see logicalSpecification.NotOperator#getArgument
	 * @model opposite="argument" transient="false"
	 * @generated
	 */
	NotOperator getNotOperator();

	/**
	 * Sets the value of the '{@link logicalSpecification.Operator#getNotOperator <em>Not Operator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Operator</em>' container reference.
	 * @see #getNotOperator()
	 * @generated
	 */
	void setNotOperator(NotOperator value);

	/**
	 * Returns the value of the '<em><b>And Operator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.AndOperator#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Operator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Operator</em>' container reference.
	 * @see #setAndOperator(AndOperator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getOperator_AndOperator()
	 * @see logicalSpecification.AndOperator#getArguments
	 * @model opposite="arguments" transient="false"
	 * @generated
	 */
	AndOperator getAndOperator();

	/**
	 * Sets the value of the '{@link logicalSpecification.Operator#getAndOperator <em>And Operator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Operator</em>' container reference.
	 * @see #getAndOperator()
	 * @generated
	 */
	void setAndOperator(AndOperator value);

	/**
	 * Returns the value of the '<em><b>Or Operator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.OrOperator#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Operator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Operator</em>' container reference.
	 * @see #setOrOperator(OrOperator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getOperator_OrOperator()
	 * @see logicalSpecification.OrOperator#getArguments
	 * @model opposite="arguments" transient="false"
	 * @generated
	 */
	OrOperator getOrOperator();

	/**
	 * Sets the value of the '{@link logicalSpecification.Operator#getOrOperator <em>Or Operator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Operator</em>' container reference.
	 * @see #getOrOperator()
	 * @generated
	 */
	void setOrOperator(OrOperator value);

	/**
	 * Returns the value of the '<em><b>Exists Operator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.ExistsOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exists Operator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exists Operator</em>' container reference.
	 * @see #setExistsOperator(ExistsOperator)
	 * @see logicalSpecification.LogicalSpecificationPackage#getOperator_ExistsOperator()
	 * @see logicalSpecification.ExistsOperator#getArgument
	 * @model opposite="argument" transient="false"
	 * @generated
	 */
	ExistsOperator getExistsOperator();

	/**
	 * Sets the value of the '{@link logicalSpecification.Operator#getExistsOperator <em>Exists Operator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exists Operator</em>' container reference.
	 * @see #getExistsOperator()
	 * @generated
	 */
	void setExistsOperator(ExistsOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean evaluateOperator(Object contextualElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" opRequired="true"
	 * @generated
	 */
	boolean guarantees(Operator op);

} // Operator
