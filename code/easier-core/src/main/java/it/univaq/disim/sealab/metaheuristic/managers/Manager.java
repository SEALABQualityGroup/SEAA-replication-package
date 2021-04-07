package it.univaq.disim.sealab.metaheuristic.managers;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import it.univaq.disim.sealab.metaheuristic.actions.Refactoring;
import it.univaq.disim.sealab.metaheuristic.refactoring.operator.AndRefactoringOperator;
import it.univaq.disim.sealab.metaheuristic.refactoring.operator.ExistsInCollectionRefactoringOperator;
import it.univaq.disim.sealab.metaheuristic.refactoring.operator.ExistsRefactoringOperator;
import it.univaq.disim.sealab.metaheuristic.refactoring.operator.ForallRefactoringOperator;
import it.univaq.disim.sealab.metaheuristic.refactoring.operator.NotRefactoringOperator;
import logicalSpecification.AndOperator;
import logicalSpecification.ExistsOperator;
import logicalSpecification.FOLSpecification;
import logicalSpecification.ForAllOperator;
import logicalSpecification.LogicalSpecificationFactory;
import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.NotOperator;
import logicalSpecification.Operator;
import logicalSpecification.PostCondition;
import logicalSpecification.PreCondition;
import logicalSpecification.SingleValuedParameter;

public abstract class Manager {

	public static int REFACTORING_COUNTER = 0;

	public Manager() {
	}

	public static org.eclipse.emf.common.util.URI string2Uri(String stringToConvert) {
		URI uri = URI.createURI(stringToConvert);
		return uri;
	}

	public static PreCondition calculatePreCondition(Refactoring r) {
		PreCondition res = null;
		if (r != null) {
			if (r.getActions() != null) {
				if (r.getActions().size() == 1)
					res = r.getActions().get(0).getPre();
				if (r.getActions().size() > 1) {
					res = r.getActions().get(0).getPre();
					AndOperator resAnd = createAndOperator();
					for (int i = 1; i < r.getActions().size(); i++) {
						resAnd.getArguments()
								.addAll(((AndOperator) calculatePreCondition(res, r.getActions().get(i).getPre(),
										r.getActions().get(i - 1).getPost()).getConditionFormula().getRootOperator())
												.getArguments());
						res.getConditionFormula().setRootOperator(resAnd);
					}
				}
			}
		}
		return res;
	}

	public static PreCondition calculatePreCondition(PreCondition pre1, PreCondition pre2, PostCondition post1) {
		PreCondition res = null;
		if (pre1 == null)
			return pre2;
		if (pre2 == null)
			return pre1;
		res = LogicalSpecificationFactory.eINSTANCE.createPreCondition();
		FOLSpecification resFol = LogicalSpecificationFactory.eINSTANCE.createFOLSpecification();
		resFol.setRootOperator((((AndRefactoringOperator) pre1.getConditionFormula().getRootOperator())
				.append((AndOperator) reducePreCondition(pre2, post1).getConditionFormula().getRootOperator())));
		res.setConditionFormula(resFol);
		return res;
	}

	public static PreCondition reducePreCondition(PreCondition pre, PostCondition post) {
		PreCondition res = pre;
		if (res != null && post != null) {
			AndOperator resRootOp = (AndRefactoringOperator) res.getConditionFormula().getRootOperator();
			AndOperator postRootOp = (AndRefactoringOperator) post.getConditionFormula().getRootOperator();
			if (resRootOp != null && resRootOp.getArguments() != null && postRootOp != null) {
				ArrayList<Boolean> resRootOpDelArrayList = new ArrayList<Boolean>(resRootOp.getArguments().size());

				// TODO verify if needed. It shall set all elements to false and then
				// change them w.r.t. the guarantees method result.
				for (int i = 0; i < resRootOp.getArguments().size(); i++) {
					resRootOpDelArrayList.add(i, false);
				}

				// TODO verify if it is needed to check the entire list. Here the last element
				// is skipped
				for (int i = 0; i < resRootOp.getArguments().size() - 1; i++) {
					if (postRootOp.guarantees(resRootOp.getArguments().get(i))) {
						resRootOpDelArrayList.set(i, true);
					}
				}

				int i = 0;

				while (i < resRootOp.getArguments().size()) {
					if (resRootOpDelArrayList.get(i)) {
						resRootOp.getArguments().remove(i);
						resRootOpDelArrayList.remove(i);
					} else
						i++;
				}
			}
		}
		return res;
	}

	public PostCondition calculatePostCondition(Refactoring r) {

		if (r == null || r.getActions() == null)
			return null;
		if (r.getActions().size() == 1)
			return r.getActions().get(0).getPost();
		PostCondition res = r.getActions().get(0).getPost();
		for (int i = 1; i < r.getActions().size() - 1; i++) {
			res = reducePostCondition(calculatePostCondition(res, r.getActions().get(i).getPost()));
		}
		return res;
	}

	public PostCondition reducePostCondition(PostCondition post) {
		PostCondition res = post;
		if (res != null) {
			AndOperator resRootOp = (AndRefactoringOperator) res.getConditionFormula().getRootOperator();
			if (resRootOp != null && resRootOp.getArguments() != null && resRootOp.getArguments().size() > 1) {
				ArrayList<Boolean> resRootOpDelArrayList = new ArrayList<Boolean>(resRootOp.getArguments().size());
				for (int i = 0; i < resRootOp.getArguments().size(); i++) {
					resRootOpDelArrayList.add(i, false);
				}
				for (int i = 0; i < resRootOp.getArguments().size() - 1; i++) {
					boolean found = false;
					int j = i + 1;
					while (j < resRootOp.getArguments().size() && !found) {
						if (resRootOp.getArguments().get(i).equals(resRootOp.getArguments().get(j)))
							found = true;
						j++;
					}
					if (found) {
						resRootOpDelArrayList.set(i, true);
					}
				}
				int i = 0;
				while (i < resRootOp.getArguments().size()) {
					if (resRootOpDelArrayList.get(i)) {
						resRootOp.getArguments().remove(i);
						resRootOpDelArrayList.remove(i);
					} else
						i++;
				}
			}
		}
		return res;
	}

	public static boolean evaluateFOL(FOLSpecification folSpec, EObject context) throws ParserException {
		return folSpec.getRootOperator().evaluateOperator(context);
	}

	public PostCondition calculatePostCondition(PostCondition post1, PostCondition post2) {
		PostCondition res = null;
		if (post1 == null)
			return post2;
		if (post2 == null)
			return post1;
		res = LogicalSpecificationFactory.eINSTANCE.createPostCondition();
		FOLSpecification resFol = LogicalSpecificationFactory.eINSTANCE.createFOLSpecification();
		resFol.setRootOperator((((AndRefactoringOperator) post1.getConditionFormula().getRootOperator())
				.append((AndOperator) post2.getConditionFormula().getRootOperator())));
		res.setConditionFormula(resFol);
		return res;
	}

	public static SingleValuedParameter createSingleValueParameter(String expr) {
		SingleValuedParameter singleValuedParameter = LogicalSpecificationFactory.eINSTANCE
				.createSingleValuedParameter();
		singleValuedParameter.setResolvingExpr(expr);
		return singleValuedParameter;
	}

	public MultipleValuedParameter createMultipleValuedParameter() {
		MultipleValuedParameter multipleValuedParameter = LogicalSpecificationFactory.eINSTANCE
				.createMultipleValuedParameter();
		return multipleValuedParameter;
	}

	public static MultipleValuedParameter createMultipleValuedParameter(String expr) {
		MultipleValuedParameter multipleValuedParameter = LogicalSpecificationFactory.eINSTANCE
				.createMultipleValuedParameter();
		multipleValuedParameter.setResolvingExpr(expr);
		return multipleValuedParameter;
	}

	public static ForAllOperator createForAllOperator(MultipleValuedParameter collection) {
		return new ForallRefactoringOperator(collection);
	}

	public static ExistsOperator createExistsInCollectionOperator(SingleValuedParameter parameter,
			MultipleValuedParameter collection) {
		return new ExistsInCollectionRefactoringOperator(parameter, collection);
	}

	public static ExistsOperator createExistsOperator(MultipleValuedParameter collection) {
		return new ExistsRefactoringOperator(collection);
	}

	public static AndOperator createAndOperator() {
		return new AndRefactoringOperator();
	}

	public static FOLSpecification createFOLSpectification(String string) {
		FOLSpecification fol = LogicalSpecificationFactory.eINSTANCE.createFOLSpecification();
		fol.setName(string);
		return fol;
	}

	public static NotOperator createNotOperator() {
		return new NotRefactoringOperator();
	}

	public static NotOperator createNotOperator(Operator operator) {
		return new NotRefactoringOperator(operator);
	}

	public static PreCondition createPreCondition() {
		return LogicalSpecificationFactory.eINSTANCE.createPreCondition();
	}

	public static PostCondition createPostCondition() {
		return LogicalSpecificationFactory.eINSTANCE.createPostCondition();
	}

	public static int getREFACTORING_COUNTER() {
		return REFACTORING_COUNTER;
	}

	public static void setREFACTORING_COUNTER(int rEFACTORING_COUNTER) {
		REFACTORING_COUNTER = rEFACTORING_COUNTER;
	}
}
