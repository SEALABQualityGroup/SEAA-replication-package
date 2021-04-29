package it.univaq.disim.sealab.metaheuristic.refactoring.operator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import it.univaq.disim.sealab.metaheuristic.managers.ocl.OclManager;
import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

public class ExistsInCollectionRefactoringOperator extends ExistsRefactoringOperator implements RefactoringOperator {

//	private OclManager oclManager;

	public ExistsInCollectionRefactoringOperator(SingleValuedParameter par, MultipleValuedParameter coll) {
		super(par, coll);
//		this.element = par;
//		this.collection = coll;
//		this.oclManager = oclMgr;
	}

	@SuppressWarnings("unchecked")
	public boolean evaluateOperator(Object contextualElement) {// throws ParserException {
		final Object el = OclManager.evaluateOCL(this.getElement().getResolvingExpr(), (EObject) contextualElement);
		if (el == null)
			return false;

		List<Object> coll = null;
		
		try {
//			coll = new ArrayList<Object>(
//				(HashSet<Object>) oclManager.evaluateOCL(this.getCollection().getResolvingExpr(), contextualElement));
			coll = (List<Object>) OclManager.evaluateOCL(this.getCollection().getResolvingExpr(), (EObject) contextualElement);
		} catch (ClassCastException e) {
			System.err.println("Error in evaluating the ExistsInCollectionRefOper");
			e.printStackTrace();
		}
		
		return coll.contains(el);
		
		/*// if (coll != null && contextualElement != null) {
		Iterator<Object> resIterator = coll.iterator();
		while (resIterator.hasNext()) {
			Object app = resIterator.next();
			if (el.equals(app))
				return true;
		}
//		}
		return false;*/
	}
}
