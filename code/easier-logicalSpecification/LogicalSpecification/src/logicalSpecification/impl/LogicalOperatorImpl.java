/**
 */
package logicalSpecification.impl;

import java.lang.reflect.InvocationTargetException;

import logicalSpecification.LogicalOperator;
import logicalSpecification.LogicalSpecificationPackage;
import logicalSpecification.Operator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LogicalOperatorImpl extends OperatorImpl implements LogicalOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicalSpecificationPackage.Literals.LOGICAL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean evaluateOperator(Operator operator) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicalSpecificationPackage.LOGICAL_OPERATOR___EVALUATE_OPERATOR__OPERATOR:
				return evaluateOperator((Operator)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LogicalOperatorImpl
