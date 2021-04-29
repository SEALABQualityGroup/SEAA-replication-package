package it.univaq.disim.sealab.metaheuristic.actions;

import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;
import logicalSpecification.Action;

public interface RefactoringAction extends Action {

	public RefactoringAction clone(RSolution solution);

}
