/**
 */
package logicalSpecification.util;

import logicalSpecification.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see logicalSpecification.LogicalSpecificationPackage
 * @generated
 */
public class LogicalSpecificationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicalSpecificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSpecificationSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicalSpecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogicalSpecificationPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.REFACTORING: {
				Refactoring refactoring = (Refactoring)theEObject;
				T result = caseRefactoring(refactoring);
				if (result == null) result = caseNamedElement(refactoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.SINGLE_VALUED_PARAMETER: {
				SingleValuedParameter singleValuedParameter = (SingleValuedParameter)theEObject;
				T result = caseSingleValuedParameter(singleValuedParameter);
				if (result == null) result = caseParameter(singleValuedParameter);
				if (result == null) result = caseNamedElement(singleValuedParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.MULTIPLE_VALUED_PARAMETER: {
				MultipleValuedParameter multipleValuedParameter = (MultipleValuedParameter)theEObject;
				T result = caseMultipleValuedParameter(multipleValuedParameter);
				if (result == null) result = caseParameter(multipleValuedParameter);
				if (result == null) result = caseNamedElement(multipleValuedParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.PRE_CONDITION: {
				PreCondition preCondition = (PreCondition)theEObject;
				T result = casePreCondition(preCondition);
				if (result == null) result = caseCondition(preCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.POST_CONDITION: {
				PostCondition postCondition = (PostCondition)theEObject;
				T result = casePostCondition(postCondition);
				if (result == null) result = caseCondition(postCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.FOL_SPECIFICATION: {
				FOLSpecification folSpecification = (FOLSpecification)theEObject;
				T result = caseFOLSpecification(folSpecification);
				if (result == null) result = caseNamedElement(folSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.LOGICAL_OPERATOR: {
				LogicalOperator logicalOperator = (LogicalOperator)theEObject;
				T result = caseLogicalOperator(logicalOperator);
				if (result == null) result = caseOperator(logicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.VOID_OPERATOR: {
				VoidOperator voidOperator = (VoidOperator)theEObject;
				T result = caseVoidOperator(voidOperator);
				if (result == null) result = caseLogicalOperator(voidOperator);
				if (result == null) result = caseOperator(voidOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.FOR_ALL_OPERATOR: {
				ForAllOperator forAllOperator = (ForAllOperator)theEObject;
				T result = caseForAllOperator(forAllOperator);
				if (result == null) result = caseLogicalOperator(forAllOperator);
				if (result == null) result = caseOperator(forAllOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.EXISTS_OPERATOR: {
				ExistsOperator existsOperator = (ExistsOperator)theEObject;
				T result = caseExistsOperator(existsOperator);
				if (result == null) result = caseLogicalOperator(existsOperator);
				if (result == null) result = caseOperator(existsOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.OR_OPERATOR: {
				OrOperator orOperator = (OrOperator)theEObject;
				T result = caseOrOperator(orOperator);
				if (result == null) result = caseLogicalOperator(orOperator);
				if (result == null) result = caseOperator(orOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.NOT_OPERATOR: {
				NotOperator notOperator = (NotOperator)theEObject;
				T result = caseNotOperator(notOperator);
				if (result == null) result = caseLogicalOperator(notOperator);
				if (result == null) result = caseOperator(notOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.AND_OPERATOR: {
				AndOperator andOperator = (AndOperator)theEObject;
				T result = caseAndOperator(andOperator);
				if (result == null) result = caseLogicalOperator(andOperator);
				if (result == null) result = caseOperator(andOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.RELATIONAL_OPERATOR: {
				RelationalOperator relationalOperator = (RelationalOperator)theEObject;
				T result = caseRelationalOperator(relationalOperator);
				if (result == null) result = caseOperator(relationalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.EQUAL_OPERATOR: {
				EqualOperator equalOperator = (EqualOperator)theEObject;
				T result = caseEqualOperator(equalOperator);
				if (result == null) result = caseRelationalOperator(equalOperator);
				if (result == null) result = caseOperator(equalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.GREATER_OPERATOR: {
				GreaterOperator greaterOperator = (GreaterOperator)theEObject;
				T result = caseGreaterOperator(greaterOperator);
				if (result == null) result = caseRelationalOperator(greaterOperator);
				if (result == null) result = caseOperator(greaterOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.GREATER_EQUAL_OPERATOR: {
				GreaterEqualOperator greaterEqualOperator = (GreaterEqualOperator)theEObject;
				T result = caseGreaterEqualOperator(greaterEqualOperator);
				if (result == null) result = caseRelationalOperator(greaterEqualOperator);
				if (result == null) result = caseOperator(greaterEqualOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.LESS_EQUAL_OPERATOR: {
				LessEqualOperator lessEqualOperator = (LessEqualOperator)theEObject;
				T result = caseLessEqualOperator(lessEqualOperator);
				if (result == null) result = caseRelationalOperator(lessEqualOperator);
				if (result == null) result = caseOperator(lessEqualOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.LESS_OPERATOR: {
				LessOperator lessOperator = (LessOperator)theEObject;
				T result = caseLessOperator(lessOperator);
				if (result == null) result = caseRelationalOperator(lessOperator);
				if (result == null) result = caseOperator(lessOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.ANTIPATTERN: {
				Antipattern antipattern = (Antipattern)theEObject;
				T result = caseAntipattern(antipattern);
				if (result == null) result = caseNamedElement(antipattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.LO_LA4_RAPS_ROOT: {
				LoLa4RAPSRoot loLa4RAPSRoot = (LoLa4RAPSRoot)theEObject;
				T result = caseLoLa4RAPSRoot(loLa4RAPSRoot);
				if (result == null) result = caseNamedElement(loLa4RAPSRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.ADD_ACTION: {
				AddAction addAction = (AddAction)theEObject;
				T result = caseAddAction(addAction);
				if (result == null) result = caseAction(addAction);
				if (result == null) result = caseNamedElement(addAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.DELETE_ACTION: {
				DeleteAction deleteAction = (DeleteAction)theEObject;
				T result = caseDeleteAction(deleteAction);
				if (result == null) result = caseAction(deleteAction);
				if (result == null) result = caseNamedElement(deleteAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.MOVE_ACTION: {
				MoveAction moveAction = (MoveAction)theEObject;
				T result = caseMoveAction(moveAction);
				if (result == null) result = caseAction(moveAction);
				if (result == null) result = caseNamedElement(moveAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalSpecificationPackage.CHANGE_ACTION: {
				ChangeAction changeAction = (ChangeAction)theEObject;
				T result = caseChangeAction(changeAction);
				if (result == null) result = caseAction(changeAction);
				if (result == null) result = caseNamedElement(changeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refactoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefactoring(Refactoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Valued Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Valued Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValuedParameter(SingleValuedParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Valued Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Valued Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleValuedParameter(MultipleValuedParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreCondition(PreCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostCondition(PostCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FOL Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FOL Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFOLSpecification(FOLSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperator(LogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoidOperator(VoidOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For All Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For All Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForAllOperator(ForAllOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistsOperator(ExistsOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrOperator(OrOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotOperator(NotOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndOperator(AndOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalOperator(RelationalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualOperator(EqualOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterOperator(GreaterOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Equal Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterEqualOperator(GreaterEqualOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Equal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Equal Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessEqualOperator(LessEqualOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessOperator(LessOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Antipattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Antipattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAntipattern(Antipattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lo La4 RAPS Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lo La4 RAPS Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoLa4RAPSRoot(LoLa4RAPSRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAction(AddAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAction(DeleteAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveAction(MoveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAction(ChangeAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogicalSpecificationSwitch
