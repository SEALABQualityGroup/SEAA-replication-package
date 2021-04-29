package it.univaq.disim.sealab.metaheuristic.refactoring.operator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import logicalSpecification.AndOperator;
import logicalSpecification.LogicalSpecificationFactory;
import logicalSpecification.Operator;
import logicalSpecification.impl.AndOperatorImpl;

public class AndRefactoringOperator extends AndOperatorImpl implements RefactoringOperator{
	
	private List<RefactoringOperator> listRefactoringOperators = new ArrayList<>();

	public boolean equals(AndOperator op2) {
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
						// TODO check java.lang.UnsupportedOperationException
						try {
							if (this.getArguments().get(i).guarantees(op2))
								return true;
						} catch (UnsupportedOperationException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return false;
	}

	public AndOperator append(AndOperator and1) {
		if (and1 == null) {
			return this;
		}
		if (this.getArguments() != null && and1.getArguments() != null) {
			AndOperator res = new AndRefactoringOperator();
			// res = LogicalSpecificationFactory.eINSTANCE.createAndOperator();
			res.getArguments().addAll(this.getArguments());
			res.getArguments().addAll(and1.getArguments());
			return res;
		}
		return null;
	}

	@Override
	public boolean evaluateOperator(Object contextualElement) {// throws ParserException {
		// System.out.print("AND(");
		boolean app = true;
		Iterator<Operator> opsIterator = this.getArguments().iterator();
		while (opsIterator.hasNext()) {
			Operator appOp = opsIterator.next();
			app = app && appOp.evaluateOperator(contextualElement);
			// boolean app = true;
			/*
			 * if (appOp instanceof NotOperator) app = app && evaluateOperator((NotOperator)
			 * appOp, contextualElement); else if (appOp instanceof AndOperator) app = app
			 * && appOp.evaluateOperator(contextualElement); else if (appOp instanceof
			 * OrOperator) app = app && evaluateOperator((OrOperator) appOp,
			 * contextualElement); else if (appOp instanceof ForAllOperator) app = app &&
			 * evaluateOperator((ForAllOperator) appOp, contextualElement); else if (appOp
			 * instanceof ExistsOperator) app = app && evaluateOperator((ExistsOperator)
			 * appOp, contextualElement); else if (appOp instanceof GreaterOperator) app =
			 * app && evaluateOperator((GreaterOperator) appOp, contextualElement); else if
			 * (appOp instanceof GreaterEqualOperator) app = app &&
			 * evaluateOperator((GreaterEqualOperator) appOp, contextualElement); else if
			 * (appOp instanceof LessOperator) app = app && evaluateOperator((LessOperator)
			 * appOp, contextualElement); else if (appOp instanceof LessEqualOperator) app =
			 * app && evaluateOperator((LessEqualOperator) appOp, contextualElement); else
			 * app = app && evaluateOperator((EqualOperator) appOp, contextualElement);
			 */
			// if (opsIterator.hasNext())
			// System.out.print(", ");
			// if(!app)
			// return false;
		}
		// System.out.print(")");
		return app;
	}
	
	public List<RefactoringOperator> getListOfOperators(){
		return listRefactoringOperators;
	}

//	@Override
//	public boolean evaluateOperator() {
//		// TODO Auto-generated method stub
//		for(RefactoringOperator op : listRefactoringOperators) {
//			if(!op.evaluateOperator())
//				return false;
//		}
//		return true;
//	}
}
