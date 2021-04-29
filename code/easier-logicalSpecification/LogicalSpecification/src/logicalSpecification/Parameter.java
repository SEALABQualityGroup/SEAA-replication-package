/**
 */
package logicalSpecification;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link logicalSpecification.Parameter#getAction <em>Action</em>}</li>
 *   <li>{@link logicalSpecification.Parameter#getResolvingExpr <em>Resolving Expr</em>}</li>
 *   <li>{@link logicalSpecification.Parameter#getLhsRelationalOperator <em>Lhs Relational Operator</em>}</li>
 *   <li>{@link logicalSpecification.Parameter#getRhsRelationalOperator <em>Rhs Relational Operator</em>}</li>
 *   <li>{@link logicalSpecification.Parameter#getAntipattern <em>Antipattern</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.LogicalSpecificationPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link logicalSpecification.TypesEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see logicalSpecification.TypesEnum
	 * @see #setType(TypesEnum)
	 * @see logicalSpecification.LogicalSpecificationPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	TypesEnum getType();

	/**
	 * Sets the value of the '{@link logicalSpecification.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see logicalSpecification.TypesEnum
	 * @see #getType()
	 * @generated
	 */
	void setType(TypesEnum value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' container reference.
	 * @see #setAction(Action)
	 * @see logicalSpecification.LogicalSpecificationPackage#getParameter_Action()
	 * @see logicalSpecification.Action#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link logicalSpecification.Parameter#getAction <em>Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' container reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Resolving Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolving Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolving Expr</em>' attribute.
	 * @see #setResolvingExpr(String)
	 * @see logicalSpecification.LogicalSpecificationPackage#getParameter_ResolvingExpr()
	 * @model required="true"
	 * @generated
	 */
	String getResolvingExpr();

	/**
	 * Sets the value of the '{@link logicalSpecification.Parameter#getResolvingExpr <em>Resolving Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolving Expr</em>' attribute.
	 * @see #getResolvingExpr()
	 * @generated
	 */
	void setResolvingExpr(String value);

	/**
	 * Returns the value of the '<em><b>Lhs Relational Operator</b></em>' reference list.
	 * The list contents are of type {@link logicalSpecification.RelationalOperator}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.RelationalOperator#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs Relational Operator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs Relational Operator</em>' reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getParameter_LhsRelationalOperator()
	 * @see logicalSpecification.RelationalOperator#getLhs
	 * @model opposite="lhs"
	 * @generated
	 */
	EList<RelationalOperator> getLhsRelationalOperator();

	/**
	 * Returns the value of the '<em><b>Rhs Relational Operator</b></em>' reference list.
	 * The list contents are of type {@link logicalSpecification.RelationalOperator}.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.RelationalOperator#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs Relational Operator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs Relational Operator</em>' reference list.
	 * @see logicalSpecification.LogicalSpecificationPackage#getParameter_RhsRelationalOperator()
	 * @see logicalSpecification.RelationalOperator#getRhs
	 * @model opposite="rhs"
	 * @generated
	 */
	EList<RelationalOperator> getRhsRelationalOperator();

	/**
	 * Returns the value of the '<em><b>Antipattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link logicalSpecification.Antipattern#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antipattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antipattern</em>' container reference.
	 * @see #setAntipattern(Antipattern)
	 * @see logicalSpecification.LogicalSpecificationPackage#getParameter_Antipattern()
	 * @see logicalSpecification.Antipattern#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	Antipattern getAntipattern();

	/**
	 * Sets the value of the '{@link logicalSpecification.Parameter#getAntipattern <em>Antipattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antipattern</em>' container reference.
	 * @see #getAntipattern()
	 * @generated
	 */
	void setAntipattern(Antipattern value);

} // Parameter
