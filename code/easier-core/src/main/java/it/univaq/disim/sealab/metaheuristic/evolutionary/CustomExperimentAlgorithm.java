package it.univaq.disim.sealab.metaheuristic.evolutionary;

import java.util.List;

import org.uma.jmetal.algorithm.Algorithm;
import org.uma.jmetal.util.experiment.util.ExperimentAlgorithm;

public class CustomExperimentAlgorithm<S extends RSolution, Result> extends ExperimentAlgorithm<S, Result> {

	public CustomExperimentAlgorithm(Algorithm<Result> algorithm, String problemTag, int run) {
		super(algorithm, algorithm.getName(), problemTag);
	}

//	public CustomExperimentAlgorithm(Algorithm<List<RSolution>> algorithm,
//			ExperimentProblem<RSolution> experimentProblem, int run) {
//		this((Algorithm<Result>) algorithm, experimentProblem.getTag(), run);
//	}
}
