/**
 */
package logicalSpecification.util;

import logicalSpecification.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see logicalSpecification.LogicalSpecificationPackage
 * @generated
 */
public class LogicalSpecificationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicalSpecificationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSpecificationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogicalSpecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalSpecificationSwitch<Adapter> modelSwitch =
		new LogicalSpecificationSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseRefactoring(Refactoring object) {
				return createRefactoringAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseSingleValuedParameter(SingleValuedParameter object) {
				return createSingleValuedParameterAdapter();
			}
			@Override
			public Adapter caseMultipleValuedParameter(MultipleValuedParameter object) {
				return createMultipleValuedParameterAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter casePreCondition(PreCondition object) {
				return createPreConditionAdapter();
			}
			@Override
			public Adapter casePostCondition(PostCondition object) {
				return createPostConditionAdapter();
			}
			@Override
			public Adapter caseFOLSpecification(FOLSpecification object) {
				return createFOLSpecificationAdapter();
			}
			@Override
			public Adapter caseLogicalOperator(LogicalOperator object) {
				return createLogicalOperatorAdapter();
			}
			@Override
			public Adapter caseVoidOperator(VoidOperator object) {
				return createVoidOperatorAdapter();
			}
			@Override
			public Adapter caseForAllOperator(ForAllOperator object) {
				return createForAllOperatorAdapter();
			}
			@Override
			public Adapter caseExistsOperator(ExistsOperator object) {
				return createExistsOperatorAdapter();
			}
			@Override
			public Adapter caseOrOperator(OrOperator object) {
				return createOrOperatorAdapter();
			}
			@Override
			public Adapter caseNotOperator(NotOperator object) {
				return createNotOperatorAdapter();
			}
			@Override
			public Adapter caseAndOperator(AndOperator object) {
				return createAndOperatorAdapter();
			}
			@Override
			public Adapter caseRelationalOperator(RelationalOperator object) {
				return createRelationalOperatorAdapter();
			}
			@Override
			public Adapter caseEqualOperator(EqualOperator object) {
				return createEqualOperatorAdapter();
			}
			@Override
			public Adapter caseGreaterOperator(GreaterOperator object) {
				return createGreaterOperatorAdapter();
			}
			@Override
			public Adapter caseGreaterEqualOperator(GreaterEqualOperator object) {
				return createGreaterEqualOperatorAdapter();
			}
			@Override
			public Adapter caseLessEqualOperator(LessEqualOperator object) {
				return createLessEqualOperatorAdapter();
			}
			@Override
			public Adapter caseLessOperator(LessOperator object) {
				return createLessOperatorAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseAntipattern(Antipattern object) {
				return createAntipatternAdapter();
			}
			@Override
			public Adapter caseLoLa4RAPSRoot(LoLa4RAPSRoot object) {
				return createLoLa4RAPSRootAdapter();
			}
			@Override
			public Adapter caseAddAction(AddAction object) {
				return createAddActionAdapter();
			}
			@Override
			public Adapter caseDeleteAction(DeleteAction object) {
				return createDeleteActionAdapter();
			}
			@Override
			public Adapter caseMoveAction(MoveAction object) {
				return createMoveActionAdapter();
			}
			@Override
			public Adapter caseChangeAction(ChangeAction object) {
				return createChangeActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Refactoring <em>Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Refactoring
	 * @generated
	 */
	public Adapter createRefactoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.SingleValuedParameter <em>Single Valued Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.SingleValuedParameter
	 * @generated
	 */
	public Adapter createSingleValuedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.MultipleValuedParameter <em>Multiple Valued Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.MultipleValuedParameter
	 * @generated
	 */
	public Adapter createMultipleValuedParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.PreCondition
	 * @generated
	 */
	public Adapter createPreConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.PostCondition
	 * @generated
	 */
	public Adapter createPostConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.FOLSpecification <em>FOL Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.FOLSpecification
	 * @generated
	 */
	public Adapter createFOLSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.LogicalOperator
	 * @generated
	 */
	public Adapter createLogicalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.VoidOperator <em>Void Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.VoidOperator
	 * @generated
	 */
	public Adapter createVoidOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.ForAllOperator <em>For All Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.ForAllOperator
	 * @generated
	 */
	public Adapter createForAllOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.ExistsOperator <em>Exists Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.ExistsOperator
	 * @generated
	 */
	public Adapter createExistsOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.OrOperator <em>Or Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.OrOperator
	 * @generated
	 */
	public Adapter createOrOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.NotOperator <em>Not Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.NotOperator
	 * @generated
	 */
	public Adapter createNotOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.AndOperator <em>And Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.AndOperator
	 * @generated
	 */
	public Adapter createAndOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.RelationalOperator
	 * @generated
	 */
	public Adapter createRelationalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.EqualOperator <em>Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.EqualOperator
	 * @generated
	 */
	public Adapter createEqualOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.GreaterOperator <em>Greater Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.GreaterOperator
	 * @generated
	 */
	public Adapter createGreaterOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.GreaterEqualOperator <em>Greater Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.GreaterEqualOperator
	 * @generated
	 */
	public Adapter createGreaterEqualOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.LessEqualOperator <em>Less Equal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.LessEqualOperator
	 * @generated
	 */
	public Adapter createLessEqualOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.LessOperator <em>Less Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.LessOperator
	 * @generated
	 */
	public Adapter createLessOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.Antipattern <em>Antipattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.Antipattern
	 * @generated
	 */
	public Adapter createAntipatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.LoLa4RAPSRoot <em>Lo La4 RAPS Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.LoLa4RAPSRoot
	 * @generated
	 */
	public Adapter createLoLa4RAPSRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.AddAction <em>Add Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.AddAction
	 * @generated
	 */
	public Adapter createAddActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.DeleteAction
	 * @generated
	 */
	public Adapter createDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.MoveAction <em>Move Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.MoveAction
	 * @generated
	 */
	public Adapter createMoveActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link logicalSpecification.ChangeAction <em>Change Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see logicalSpecification.ChangeAction
	 * @generated
	 */
	public Adapter createChangeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogicalSpecificationAdapterFactory
