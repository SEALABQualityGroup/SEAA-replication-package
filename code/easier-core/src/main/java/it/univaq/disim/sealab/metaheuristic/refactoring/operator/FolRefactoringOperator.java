package it.univaq.disim.sealab.metaheuristic.refactoring.operator;

import java.util.ArrayList;
import java.util.List;

import logicalSpecification.impl.FOLSpecificationImpl;

public class FolRefactoringOperator extends FOLSpecificationImpl implements RefactoringOperator{
	
	
	private List<RefactoringOperator> listRefactoringOperators = new ArrayList<>();

//	@Override
//	public boolean evaluateOperator(Object o) {
////		for(RefactoringOperator op : listRefactoringOperators) {
////			if(!op.evaluateOperator())
////				return false; //returns false when the first false is found
////		}
//		return true;
//	}
	
	public void addOperator(RefactoringOperator op) {
		listRefactoringOperators.add(op);
	}
	
	public List<RefactoringOperator> getListOfOperators(){
		return listRefactoringOperators;
	}

}
