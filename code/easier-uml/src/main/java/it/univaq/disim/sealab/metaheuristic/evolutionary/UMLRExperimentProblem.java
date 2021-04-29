package it.univaq.disim.sealab.metaheuristic.evolutionary;

import org.uma.jmetal.util.experiment.util.ExperimentProblem;

public class UMLRExperimentProblem<S extends UMLRSolution> extends ExperimentProblem<S> {

	private UMLRProblem<S> problem;
	private String tag;

	public UMLRExperimentProblem(UMLRProblem<S> problem, String tag) {
		super(problem, tag);
	    this.problem = problem;
	    this.tag = tag;
	  }

	public UMLRExperimentProblem(UMLRProblem<S> problem) {
		super(problem, problem.getName());
	    this.problem = problem;
	    this.tag = problem.getName() ;
	  }

	public UMLRProblem<S> getProblem() {
		return problem;
	}

	public String getTag() {
		return tag;
	}

}
