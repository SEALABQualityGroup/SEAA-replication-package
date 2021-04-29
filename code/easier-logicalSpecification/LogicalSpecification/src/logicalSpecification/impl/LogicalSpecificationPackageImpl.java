/**
 */
package logicalSpecification.impl;

import logicalSpecification.Action;
import logicalSpecification.AddAction;
import logicalSpecification.AndOperator;
import logicalSpecification.Antipattern;
import logicalSpecification.ChangeAction;
import logicalSpecification.Condition;
import logicalSpecification.DeleteAction;
import logicalSpecification.EqualOperator;
import logicalSpecification.ExistsOperator;
import logicalSpecification.FOLSpecification;
import logicalSpecification.ForAllOperator;
import logicalSpecification.GreaterEqualOperator;
import logicalSpecification.GreaterOperator;
import logicalSpecification.LessEqualOperator;
import logicalSpecification.LessOperator;
import logicalSpecification.LoLa4RAPSRoot;
import logicalSpecification.LogicalOperator;
import logicalSpecification.LogicalSpecificationFactory;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.MoveAction;
import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.NamedElement;
import logicalSpecification.NotOperator;
import logicalSpecification.Operator;
import logicalSpecification.OrOperator;
import logicalSpecification.Parameter;
import logicalSpecification.PostCondition;
import logicalSpecification.PreCondition;
import logicalSpecification.Refactoring;
import logicalSpecification.RelationalOperator;
import logicalSpecification.SingleValuedParameter;
import logicalSpecification.TypesEnum;
import logicalSpecification.VoidOperator;

import logicalSpecification.actions.AEmilia.AEmiliaPackage;

import logicalSpecification.actions.AEmilia.impl.AEmiliaPackageImpl;

import logicalSpecification.actions.UML.UMLPackage;

import logicalSpecification.actions.UML.impl.UMLPackageImpl;

import logicalSpecification.antipatterns.performance.PerformancePackage;

import logicalSpecification.antipatterns.performance.impl.PerformancePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicalSpecificationPackageImpl extends EPackageImpl implements LogicalSpecificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValuedParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleValuedParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forAllOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existsOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEqualOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEqualOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antipatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loLa4RAPSRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typesEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see logicalSpecification.LogicalSpecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogicalSpecificationPackageImpl() {
		super(eNS_URI, LogicalSpecificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LogicalSpecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogicalSpecificationPackage init() {
		if (isInited) return (LogicalSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(LogicalSpecificationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogicalSpecificationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogicalSpecificationPackageImpl theLogicalSpecificationPackage = registeredLogicalSpecificationPackage instanceof LogicalSpecificationPackageImpl ? (LogicalSpecificationPackageImpl)registeredLogicalSpecificationPackage : new LogicalSpecificationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		UMLPackageImpl theUMLPackage = (UMLPackageImpl)(registeredPackage instanceof UMLPackageImpl ? registeredPackage : UMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AEmiliaPackage.eNS_URI);
		AEmiliaPackageImpl theAEmiliaPackage = (AEmiliaPackageImpl)(registeredPackage instanceof AEmiliaPackageImpl ? registeredPackage : AEmiliaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);
		PerformancePackageImpl thePerformancePackage = (PerformancePackageImpl)(registeredPackage instanceof PerformancePackageImpl ? registeredPackage : PerformancePackage.eINSTANCE);

		// Create package meta-data objects
		theLogicalSpecificationPackage.createPackageContents();
		theUMLPackage.createPackageContents();
		theAEmiliaPackage.createPackageContents();
		thePerformancePackage.createPackageContents();

		// Initialize created meta-data
		theLogicalSpecificationPackage.initializePackageContents();
		theUMLPackage.initializePackageContents();
		theAEmiliaPackage.initializePackageContents();
		thePerformancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogicalSpecificationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogicalSpecificationPackage.eNS_URI, theLogicalSpecificationPackage);
		return theLogicalSpecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefactoring() {
		return refactoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefactoring_Actions() {
		return (EReference)refactoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefactoring_Pre() {
		return (EReference)refactoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefactoring_Post() {
		return (EReference)refactoringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefactoring_Lola4rapsRoot() {
		return (EReference)refactoringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefactoring_Cost() {
		return (EAttribute)refactoringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefactoring_NumOfChanges() {
		return (EAttribute)refactoringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRefactoring__CloneRefactoring() {
		return refactoringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_NumOfChanges() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Cost() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Refactoring() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Parameters() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Pre() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Post() {
		return (EReference)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Model() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Execute() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Log() {
		return actionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__SetParameters() {
		return actionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__CreatePreCondition() {
		return actionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__CreatePostCondition() {
		return actionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValuedParameter() {
		return singleValuedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleValuedParameter_ExistsOperator() {
		return (EReference)singleValuedParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleValuedParameter() {
		return multipleValuedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleValuedParameter_ForAllOperator() {
		return (EReference)multipleValuedParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultipleValuedParameter_ExistsOperator() {
		return (EReference)multipleValuedParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Action() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_ResolvingExpr() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_LhsRelationalOperator() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_RhsRelationalOperator() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Antipattern() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ConditionFormula() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreCondition() {
		return preConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreCondition_Action() {
		return (EReference)preConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreCondition_Refactoring() {
		return (EReference)preConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostCondition() {
		return postConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostCondition_Action() {
		return (EReference)postConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostCondition_Refactoring() {
		return (EReference)postConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFOLSpecification() {
		return folSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFOLSpecification_Condition() {
		return (EReference)folSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFOLSpecification_RootOperator() {
		return (EReference)folSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFOLSpecification_Antipattern() {
		return (EReference)folSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalOperator() {
		return logicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogicalOperator__Guarantees__Operator() {
		return logicalOperatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogicalOperator__EvaluateOperator__Operator() {
		return logicalOperatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidOperator() {
		return voidOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForAllOperator() {
		return forAllOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForAllOperator_Collection() {
		return (EReference)forAllOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForAllOperator_Argument() {
		return (EReference)forAllOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistsOperator() {
		return existsOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistsOperator_Element() {
		return (EReference)existsOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistsOperator_Collection() {
		return (EReference)existsOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistsOperator_Argument() {
		return (EReference)existsOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrOperator() {
		return orOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrOperator_Arguments() {
		return (EReference)orOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotOperator() {
		return notOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotOperator_Argument() {
		return (EReference)notOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndOperator() {
		return andOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndOperator_Arguments() {
		return (EReference)andOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalOperator() {
		return relationalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalOperator_Factor() {
		return (EAttribute)relationalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalOperator_Lhs() {
		return (EReference)relationalOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalOperator_Rhs() {
		return (EReference)relationalOperatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualOperator() {
		return equalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterOperator() {
		return greaterOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterEqualOperator() {
		return greaterEqualOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessEqualOperator() {
		return lessEqualOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessOperator() {
		return lessOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Folspecification() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_ForAlloperator() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_NotOperator() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_AndOperator() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_OrOperator() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_ExistsOperator() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperator__EvaluateOperator__Object() {
		return operatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperator__Guarantees__Operator() {
		return operatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntipattern() {
		return antipatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntipattern_Lola4rapsRoot() {
		return (EReference)antipatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntipattern_Parameters() {
		return (EReference)antipatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntipattern_Formula() {
		return (EReference)antipatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAntipattern__SetParametersForPartialDetection() {
		return antipatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAntipattern__PartialDetection() {
		return antipatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAntipattern__SetParametersForFullDetection() {
		return antipatternEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAntipattern__FullDetection() {
		return antipatternEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAntipattern__Log() {
		return antipatternEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAntipattern__CreateFormula() {
		return antipatternEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoLa4RAPSRoot() {
		return loLa4RAPSRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoLa4RAPSRoot_Refactorings() {
		return (EReference)loLa4RAPSRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoLa4RAPSRoot_Antipatterns() {
		return (EReference)loLa4RAPSRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAction() {
		return addActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteAction() {
		return deleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveAction() {
		return moveActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAction() {
		return changeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypesEnum() {
		return typesEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getmodel() {
		return modelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSpecificationFactory getLogicalSpecificationFactory() {
		return (LogicalSpecificationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		refactoringEClass = createEClass(REFACTORING);
		createEReference(refactoringEClass, REFACTORING__ACTIONS);
		createEReference(refactoringEClass, REFACTORING__PRE);
		createEReference(refactoringEClass, REFACTORING__POST);
		createEReference(refactoringEClass, REFACTORING__LOLA4RAPS_ROOT);
		createEAttribute(refactoringEClass, REFACTORING__COST);
		createEAttribute(refactoringEClass, REFACTORING__NUM_OF_CHANGES);
		createEOperation(refactoringEClass, REFACTORING___CLONE_REFACTORING);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NUM_OF_CHANGES);
		createEAttribute(actionEClass, ACTION__COST);
		createEReference(actionEClass, ACTION__REFACTORING);
		createEReference(actionEClass, ACTION__PARAMETERS);
		createEReference(actionEClass, ACTION__PRE);
		createEReference(actionEClass, ACTION__POST);
		createEAttribute(actionEClass, ACTION__MODEL);
		createEOperation(actionEClass, ACTION___EXECUTE);
		createEOperation(actionEClass, ACTION___LOG);
		createEOperation(actionEClass, ACTION___SET_PARAMETERS);
		createEOperation(actionEClass, ACTION___CREATE_PRE_CONDITION);
		createEOperation(actionEClass, ACTION___CREATE_POST_CONDITION);

		singleValuedParameterEClass = createEClass(SINGLE_VALUED_PARAMETER);
		createEReference(singleValuedParameterEClass, SINGLE_VALUED_PARAMETER__EXISTS_OPERATOR);

		multipleValuedParameterEClass = createEClass(MULTIPLE_VALUED_PARAMETER);
		createEReference(multipleValuedParameterEClass, MULTIPLE_VALUED_PARAMETER__FOR_ALL_OPERATOR);
		createEReference(multipleValuedParameterEClass, MULTIPLE_VALUED_PARAMETER__EXISTS_OPERATOR);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__ACTION);
		createEAttribute(parameterEClass, PARAMETER__RESOLVING_EXPR);
		createEReference(parameterEClass, PARAMETER__LHS_RELATIONAL_OPERATOR);
		createEReference(parameterEClass, PARAMETER__RHS_RELATIONAL_OPERATOR);
		createEReference(parameterEClass, PARAMETER__ANTIPATTERN);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__CONDITION_FORMULA);

		preConditionEClass = createEClass(PRE_CONDITION);
		createEReference(preConditionEClass, PRE_CONDITION__ACTION);
		createEReference(preConditionEClass, PRE_CONDITION__REFACTORING);

		postConditionEClass = createEClass(POST_CONDITION);
		createEReference(postConditionEClass, POST_CONDITION__ACTION);
		createEReference(postConditionEClass, POST_CONDITION__REFACTORING);

		folSpecificationEClass = createEClass(FOL_SPECIFICATION);
		createEReference(folSpecificationEClass, FOL_SPECIFICATION__CONDITION);
		createEReference(folSpecificationEClass, FOL_SPECIFICATION__ROOT_OPERATOR);
		createEReference(folSpecificationEClass, FOL_SPECIFICATION__ANTIPATTERN);

		logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);
		createEOperation(logicalOperatorEClass, LOGICAL_OPERATOR___GUARANTEES__OPERATOR);
		createEOperation(logicalOperatorEClass, LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR);

		voidOperatorEClass = createEClass(VOID_OPERATOR);

		forAllOperatorEClass = createEClass(FOR_ALL_OPERATOR);
		createEReference(forAllOperatorEClass, FOR_ALL_OPERATOR__COLLECTION);
		createEReference(forAllOperatorEClass, FOR_ALL_OPERATOR__ARGUMENT);

		existsOperatorEClass = createEClass(EXISTS_OPERATOR);
		createEReference(existsOperatorEClass, EXISTS_OPERATOR__ELEMENT);
		createEReference(existsOperatorEClass, EXISTS_OPERATOR__COLLECTION);
		createEReference(existsOperatorEClass, EXISTS_OPERATOR__ARGUMENT);

		orOperatorEClass = createEClass(OR_OPERATOR);
		createEReference(orOperatorEClass, OR_OPERATOR__ARGUMENTS);

		notOperatorEClass = createEClass(NOT_OPERATOR);
		createEReference(notOperatorEClass, NOT_OPERATOR__ARGUMENT);

		andOperatorEClass = createEClass(AND_OPERATOR);
		createEReference(andOperatorEClass, AND_OPERATOR__ARGUMENTS);

		relationalOperatorEClass = createEClass(RELATIONAL_OPERATOR);
		createEAttribute(relationalOperatorEClass, RELATIONAL_OPERATOR__FACTOR);
		createEReference(relationalOperatorEClass, RELATIONAL_OPERATOR__LHS);
		createEReference(relationalOperatorEClass, RELATIONAL_OPERATOR__RHS);

		equalOperatorEClass = createEClass(EQUAL_OPERATOR);

		greaterOperatorEClass = createEClass(GREATER_OPERATOR);

		greaterEqualOperatorEClass = createEClass(GREATER_EQUAL_OPERATOR);

		lessEqualOperatorEClass = createEClass(LESS_EQUAL_OPERATOR);

		lessOperatorEClass = createEClass(LESS_OPERATOR);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__FOLSPECIFICATION);
		createEReference(operatorEClass, OPERATOR__FOR_ALLOPERATOR);
		createEReference(operatorEClass, OPERATOR__NOT_OPERATOR);
		createEReference(operatorEClass, OPERATOR__AND_OPERATOR);
		createEReference(operatorEClass, OPERATOR__OR_OPERATOR);
		createEReference(operatorEClass, OPERATOR__EXISTS_OPERATOR);
		createEOperation(operatorEClass, OPERATOR___EVALUATE_OPERATOR__OBJECT);
		createEOperation(operatorEClass, OPERATOR___GUARANTEES__OPERATOR);

		antipatternEClass = createEClass(ANTIPATTERN);
		createEReference(antipatternEClass, ANTIPATTERN__LOLA4RAPS_ROOT);
		createEReference(antipatternEClass, ANTIPATTERN__PARAMETERS);
		createEReference(antipatternEClass, ANTIPATTERN__FORMULA);
		createEOperation(antipatternEClass, ANTIPATTERN___SET_PARAMETERS_FOR_PARTIAL_DETECTION);
		createEOperation(antipatternEClass, ANTIPATTERN___PARTIAL_DETECTION);
		createEOperation(antipatternEClass, ANTIPATTERN___SET_PARAMETERS_FOR_FULL_DETECTION);
		createEOperation(antipatternEClass, ANTIPATTERN___FULL_DETECTION);
		createEOperation(antipatternEClass, ANTIPATTERN___LOG);
		createEOperation(antipatternEClass, ANTIPATTERN___CREATE_FORMULA);

		loLa4RAPSRootEClass = createEClass(LO_LA4_RAPS_ROOT);
		createEReference(loLa4RAPSRootEClass, LO_LA4_RAPS_ROOT__REFACTORINGS);
		createEReference(loLa4RAPSRootEClass, LO_LA4_RAPS_ROOT__ANTIPATTERNS);

		addActionEClass = createEClass(ADD_ACTION);

		deleteActionEClass = createEClass(DELETE_ACTION);

		moveActionEClass = createEClass(MOVE_ACTION);

		changeActionEClass = createEClass(CHANGE_ACTION);

		// Create enums
		typesEnumEEnum = createEEnum(TYPES_ENUM);

		// Create data types
		modelEDataType = createEDataType(MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		AEmiliaPackage theAEmiliaPackage = (AEmiliaPackage)EPackage.Registry.INSTANCE.getEPackage(AEmiliaPackage.eNS_URI);
		PerformancePackage thePerformancePackage = (PerformancePackage)EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theUMLPackage);
		getESubpackages().add(theAEmiliaPackage);
		getESubpackages().add(thePerformancePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		refactoringEClass.getESuperTypes().add(this.getNamedElement());
		actionEClass.getESuperTypes().add(this.getNamedElement());
		singleValuedParameterEClass.getESuperTypes().add(this.getParameter());
		multipleValuedParameterEClass.getESuperTypes().add(this.getParameter());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		preConditionEClass.getESuperTypes().add(this.getCondition());
		postConditionEClass.getESuperTypes().add(this.getCondition());
		folSpecificationEClass.getESuperTypes().add(this.getNamedElement());
		logicalOperatorEClass.getESuperTypes().add(this.getOperator());
		voidOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		forAllOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		existsOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		orOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		notOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		andOperatorEClass.getESuperTypes().add(this.getLogicalOperator());
		relationalOperatorEClass.getESuperTypes().add(this.getOperator());
		equalOperatorEClass.getESuperTypes().add(this.getRelationalOperator());
		greaterOperatorEClass.getESuperTypes().add(this.getRelationalOperator());
		greaterEqualOperatorEClass.getESuperTypes().add(this.getRelationalOperator());
		lessEqualOperatorEClass.getESuperTypes().add(this.getRelationalOperator());
		lessOperatorEClass.getESuperTypes().add(this.getRelationalOperator());
		antipatternEClass.getESuperTypes().add(this.getNamedElement());
		loLa4RAPSRootEClass.getESuperTypes().add(this.getNamedElement());
		addActionEClass.getESuperTypes().add(this.getAction());
		deleteActionEClass.getESuperTypes().add(this.getAction());
		moveActionEClass.getESuperTypes().add(this.getAction());
		changeActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactoringEClass, Refactoring.class, "Refactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefactoring_Actions(), this.getAction(), this.getAction_Refactoring(), "actions", null, 0, -1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefactoring_Pre(), this.getPreCondition(), this.getPreCondition_Refactoring(), "pre", null, 0, 1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefactoring_Post(), this.getPostCondition(), this.getPostCondition_Refactoring(), "post", null, 0, 1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefactoring_Lola4rapsRoot(), this.getLoLa4RAPSRoot(), this.getLoLa4RAPSRoot_Refactorings(), "lola4rapsRoot", null, 0, 1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactoring_Cost(), ecorePackage.getEDouble(), "cost", "0.0", 1, 1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactoring_NumOfChanges(), ecorePackage.getEDouble(), "numOfChanges", "0.0", 1, 1, Refactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRefactoring__CloneRefactoring(), this.getRefactoring(), "cloneRefactoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_NumOfChanges(), ecorePackage.getEDouble(), "numOfChanges", "0.0", 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Cost(), ecorePackage.getEDouble(), "cost", "0.0", 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Refactoring(), this.getRefactoring(), this.getRefactoring_Actions(), "refactoring", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Parameters(), this.getParameter(), this.getParameter_Action(), "parameters", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Pre(), this.getPreCondition(), this.getPreCondition_Action(), "pre", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Post(), this.getPostCondition(), this.getPostCondition_Action(), "post", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Model(), ecorePackage.getEJavaObject(), "model", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__Execute(), null, "execute", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__Log(), null, "log", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__SetParameters(), null, "setParameters", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__CreatePreCondition(), null, "createPreCondition", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__CreatePostCondition(), null, "createPostCondition", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(singleValuedParameterEClass, SingleValuedParameter.class, "SingleValuedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleValuedParameter_ExistsOperator(), this.getExistsOperator(), this.getExistsOperator_Element(), "existsOperator", null, 0, -1, SingleValuedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleValuedParameterEClass, MultipleValuedParameter.class, "MultipleValuedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleValuedParameter_ForAllOperator(), this.getForAllOperator(), this.getForAllOperator_Collection(), "forAllOperator", null, 0, -1, MultipleValuedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultipleValuedParameter_ExistsOperator(), this.getExistsOperator(), this.getExistsOperator_Collection(), "existsOperator", null, 0, -1, MultipleValuedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), this.getTypesEnum(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Action(), this.getAction(), this.getAction_Parameters(), "action", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ResolvingExpr(), ecorePackage.getEString(), "resolvingExpr", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_LhsRelationalOperator(), this.getRelationalOperator(), this.getRelationalOperator_Lhs(), "lhsRelationalOperator", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_RhsRelationalOperator(), this.getRelationalOperator(), this.getRelationalOperator_Rhs(), "rhsRelationalOperator", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Antipattern(), this.getAntipattern(), this.getAntipattern_Parameters(), "antipattern", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_ConditionFormula(), this.getFOLSpecification(), this.getFOLSpecification_Condition(), "conditionFormula", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preConditionEClass, PreCondition.class, "PreCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreCondition_Action(), this.getAction(), this.getAction_Pre(), "action", null, 0, 1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreCondition_Refactoring(), this.getRefactoring(), this.getRefactoring_Pre(), "refactoring", null, 0, 1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postConditionEClass, PostCondition.class, "PostCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostCondition_Action(), this.getAction(), this.getAction_Post(), "action", null, 0, 1, PostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostCondition_Refactoring(), this.getRefactoring(), this.getRefactoring_Post(), "refactoring", null, 0, 1, PostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folSpecificationEClass, FOLSpecification.class, "FOLSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFOLSpecification_Condition(), this.getCondition(), this.getCondition_ConditionFormula(), "condition", null, 0, 1, FOLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFOLSpecification_RootOperator(), this.getOperator(), this.getOperator_Folspecification(), "rootOperator", null, 1, 1, FOLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFOLSpecification_Antipattern(), this.getAntipattern(), this.getAntipattern_Formula(), "antipattern", null, 0, 1, FOLSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getLogicalOperator__Guarantees__Operator(), ecorePackage.getEBoolean(), "guarantees", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperator(), "operator", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogicalOperator__EvaluateOperator__Operator(), ecorePackage.getEBoolean(), "evaluateOperator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperator(), "operator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(voidOperatorEClass, VoidOperator.class, "VoidOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forAllOperatorEClass, ForAllOperator.class, "ForAllOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForAllOperator_Collection(), this.getMultipleValuedParameter(), this.getMultipleValuedParameter_ForAllOperator(), "collection", null, 1, 1, ForAllOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForAllOperator_Argument(), this.getOperator(), this.getOperator_ForAlloperator(), "argument", null, 1, 1, ForAllOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existsOperatorEClass, ExistsOperator.class, "ExistsOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistsOperator_Element(), this.getSingleValuedParameter(), this.getSingleValuedParameter_ExistsOperator(), "element", null, 0, 1, ExistsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExistsOperator_Collection(), this.getMultipleValuedParameter(), this.getMultipleValuedParameter_ExistsOperator(), "collection", null, 1, 1, ExistsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExistsOperator_Argument(), this.getOperator(), this.getOperator_ExistsOperator(), "argument", null, 0, 1, ExistsOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orOperatorEClass, OrOperator.class, "OrOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrOperator_Arguments(), this.getOperator(), this.getOperator_OrOperator(), "arguments", null, 2, -1, OrOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notOperatorEClass, NotOperator.class, "NotOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotOperator_Argument(), this.getOperator(), this.getOperator_NotOperator(), "argument", null, 1, 1, NotOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andOperatorEClass, AndOperator.class, "AndOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndOperator_Arguments(), this.getOperator(), this.getOperator_AndOperator(), "arguments", null, 2, -1, AndOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalOperatorEClass, RelationalOperator.class, "RelationalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalOperator_Factor(), ecorePackage.getEDouble(), "factor", "1.0", 1, 1, RelationalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalOperator_Lhs(), this.getParameter(), this.getParameter_LhsRelationalOperator(), "lhs", null, 1, 1, RelationalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalOperator_Rhs(), this.getParameter(), this.getParameter_RhsRelationalOperator(), "rhs", null, 1, 1, RelationalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalOperatorEClass, EqualOperator.class, "EqualOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterOperatorEClass, GreaterOperator.class, "GreaterOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterEqualOperatorEClass, GreaterEqualOperator.class, "GreaterEqualOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEqualOperatorEClass, LessEqualOperator.class, "LessEqualOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessOperatorEClass, LessOperator.class, "LessOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Folspecification(), this.getFOLSpecification(), this.getFOLSpecification_RootOperator(), "folspecification", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_ForAlloperator(), this.getForAllOperator(), this.getForAllOperator_Argument(), "forAlloperator", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_NotOperator(), this.getNotOperator(), this.getNotOperator_Argument(), "notOperator", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_AndOperator(), this.getAndOperator(), this.getAndOperator_Arguments(), "andOperator", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_OrOperator(), this.getOrOperator(), this.getOrOperator_Arguments(), "orOperator", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_ExistsOperator(), this.getExistsOperator(), this.getExistsOperator_Argument(), "existsOperator", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOperator__EvaluateOperator__Object(), ecorePackage.getEBoolean(), "evaluateOperator", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "contextualElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperator__Guarantees__Operator(), ecorePackage.getEBoolean(), "guarantees", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperator(), "op", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(antipatternEClass, Antipattern.class, "Antipattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntipattern_Lola4rapsRoot(), this.getLoLa4RAPSRoot(), this.getLoLa4RAPSRoot_Antipatterns(), "lola4rapsRoot", null, 0, 1, Antipattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntipattern_Parameters(), this.getParameter(), this.getParameter_Antipattern(), "parameters", null, 0, -1, Antipattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntipattern_Formula(), this.getFOLSpecification(), this.getFOLSpecification_Antipattern(), "formula", null, 1, 1, Antipattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAntipattern__SetParametersForPartialDetection(), null, "setParametersForPartialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAntipattern__PartialDetection(), null, "partialDetection", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAntipattern__SetParametersForFullDetection(), null, "setParametersForFullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAntipattern__FullDetection(), null, "fullDetection", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAntipattern__Log(), null, "log", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAntipattern__CreateFormula(), null, "createFormula", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(loLa4RAPSRootEClass, LoLa4RAPSRoot.class, "LoLa4RAPSRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoLa4RAPSRoot_Refactorings(), this.getRefactoring(), this.getRefactoring_Lola4rapsRoot(), "refactorings", null, 0, -1, LoLa4RAPSRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoLa4RAPSRoot_Antipatterns(), this.getAntipattern(), this.getAntipattern_Lola4rapsRoot(), "antipatterns", null, 0, -1, LoLa4RAPSRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addActionEClass, AddAction.class, "AddAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveActionEClass, MoveAction.class, "MoveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeActionEClass, ChangeAction.class, "ChangeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(typesEnumEEnum, TypesEnum.class, "TypesEnum");
		addEEnumLiteral(typesEnumEEnum, TypesEnum.UML_OPERATION);
		addEEnumLiteral(typesEnumEEnum, TypesEnum.UML_COMPONENT);
		addEEnumLiteral(typesEnumEEnum, TypesEnum.UML_NODE);
		addEEnumLiteral(typesEnumEEnum, TypesEnum.REAL);

		// Initialize data types
		initEDataType(modelEDataType, Object.class, "model", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LogicalSpecificationPackageImpl
