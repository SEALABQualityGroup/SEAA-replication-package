package it.univaq.disim.sealab.metaheuristic.refactoring.operator;

import logicalSpecification.Operator;
import logicalSpecification.impl.NotOperatorImpl;

public class NotRefactoringOperator extends NotOperatorImpl implements RefactoringOperator {

	public NotRefactoringOperator(Operator operator) {
		super();
		this.argument = operator;
	}

	public NotRefactoringOperator() {
		super();
	}

	public boolean evaluateOperator(Object contextualElement) {// throws ParserException {
		// System.out.print("NOT(");
		return !this.getArgument().evaluateOperator(contextualElement);
		/*
		 * if (operator.getArgument() instanceof NotOperator) app =
		 * !evaluateOperator((NotOperator) operator.getArgument(), contextualElement);
		 * else if (operator.getArgument() instanceof AndOperator) app =
		 * !evaluateOperator((AndOperator) operator.getArgument(), contextualElement);
		 * else if (operator.getArgument() instanceof OrOperator) app =
		 * !evaluateOperator((OrOperator) operator.getArgument(), contextualElement);
		 * else if (operator.getArgument() instanceof ForAllOperator) app =
		 * !evaluateOperator((ForAllOperator) operator.getArgument(),
		 * contextualElement); else if (operator.getArgument() instanceof
		 * ExistsOperator) app = !evaluateOperator((ExistsOperator)
		 * operator.getArgument(), contextualElement); else if (operator.getArgument()
		 * instanceof GreaterOperator) app = !evaluateOperator((GreaterOperator)
		 * operator.getArgument(), contextualElement); else if (operator.getArgument()
		 * instanceof GreaterEqualOperator) app =
		 * !evaluateOperator((GreaterEqualOperator) operator.getArgument(),
		 * contextualElement); else if (operator.getArgument() instanceof LessOperator)
		 * app = !evaluateOperator((LessOperator) operator.getArgument(),
		 * contextualElement); else if (operator.getArgument() instanceof
		 * LessEqualOperator) app = !evaluateOperator((LessEqualOperator)
		 * operator.getArgument(), contextualElement); else app =
		 * !evaluateOperator((EqualOperator) operator.getArgument(), contextualElement);
		 */
		// System.out.print(")");
	}

	public boolean equals(NotRefactoringOperator op2) {
		if (op2 != null)
			return this.getArgument().equals(op2.getArgument());
		return false;
	}

	public boolean guarantees(Operator op2) {
		if (op2 != null) {
			if (this != op2)
				return this.getArgument().guarantees(op2);
			return true;
		}
		return false;
	}
}
