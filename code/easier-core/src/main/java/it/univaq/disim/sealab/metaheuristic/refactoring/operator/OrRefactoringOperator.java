package it.univaq.disim.sealab.metaheuristic.refactoring.operator;

import java.util.Iterator;

import logicalSpecification.Operator;
import logicalSpecification.OrOperator;
import logicalSpecification.impl.OrOperatorImpl;

public class OrRefactoringOperator extends OrOperatorImpl implements RefactoringOperator{

	public boolean evaluateOperator(Object contextualElement) {//throws ParserException {
		// System.out.print("OR(");
		boolean app = false;
		Iterator<Operator> opsIterator = this.getArguments().iterator();
		while (opsIterator.hasNext()) {
			Operator appOp = opsIterator.next();
			// boolean app = false;
			app = app || appOp.evaluateOperator(contextualElement);
			/*
			if (appOp instanceof NotOperator)
				app = app || evaluateOperator((NotOperator) appOp, contextualElement);
			else if (appOp instanceof AndOperator)
				app = app || evaluateOperator((AndOperator) appOp, contextualElement);
			else if (appOp instanceof OrOperator)
				app = app || evaluateOperator((OrOperator) appOp, contextualElement);
			else if (appOp instanceof ForAllOperator)
				app = app || evaluateOperator((ForAllOperator) appOp, contextualElement);
			else if (appOp instanceof ExistsOperator)
				app = app || evaluateOperator((ExistsOperator) appOp, contextualElement);
			else if (appOp instanceof GreaterOperator)
				app = app || evaluateOperator((GreaterOperator) appOp, contextualElement);
			else if (appOp instanceof GreaterEqualOperator)
				app = app || evaluateOperator((GreaterEqualOperator) appOp, contextualElement);
			else if (appOp instanceof LessOperator)
				app = app || evaluateOperator((LessOperator) appOp, contextualElement);
			else if (appOp instanceof LessEqualOperator)
				app = app || evaluateOperator((LessEqualOperator) appOp, contextualElement);
			else
				app = app || evaluateOperator((EqualOperator) appOp, contextualElement);*/
			// if (opsIterator.hasNext())
			// System.out.print(", ");
			// if(app)
			// return true;
		}
		// System.out.print(")");
		return app;
	}
	
	public boolean equals(OrOperator op2) {
		if (op2 != null) {
			if (this.getArguments() != null && op2.getArguments() != null) {
				if (this.getArguments().size() == op2.getArguments().size()) {
					for (int i = 0; i < this.getArguments().size(); i++) {
						if (!this.getArguments().get(i).equals(op2.getArguments().get(i)))
							return false;
					}
					return true;
				}
			}
		}
		return false;
	}

	public boolean guarantees(Operator op2) {
		if (op2 != null) {
			if (this != op2) {
				if (this.getArguments() != null) {
					for (int i = 0; i < this.getArguments().size(); i++) {
						if (this.getArguments().get(i).guarantees(op2))
							return true;
					}
				}
			}
		}
		return false;
	}
}
