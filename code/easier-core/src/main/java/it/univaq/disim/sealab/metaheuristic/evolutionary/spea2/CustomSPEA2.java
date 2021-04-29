package it.univaq.disim.sealab.metaheuristic.evolutionary.spea2;

import java.util.List;

import org.uma.jmetal.algorithm.multiobjective.spea2.SPEA2;
import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.operator.MutationOperator;
import org.uma.jmetal.operator.SelectionOperator;
import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.util.evaluator.SolutionListEvaluator;

import it.univaq.disim.sealab.metaheuristic.evolutionary.EasierAlgorithm;
import it.univaq.disim.sealab.metaheuristic.evolutionary.ProgressBar;
import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;

@SuppressWarnings("serial")
public class CustomSPEA2<S extends RSolution> extends SPEA2<S> implements EasierAlgorithm {

//	private String name;

	/**
	 * Constructor
	 */
	public CustomSPEA2(Problem<S> problem, int maxIterations, int populationSize,
			CrossoverOperator<S> crossoverOperator, MutationOperator<S> mutationOperator,
			SelectionOperator<List<S>, S> selectionOperator, SolutionListEvaluator<S> evaluator) {
		super(problem, maxIterations, populationSize, crossoverOperator, mutationOperator, selectionOperator,
				evaluator);
	}

	@Override
	protected boolean isStoppingConditionReached() {
		System.out.println(getName());
		ProgressBar.showBar(iterations, maxIterations);
		return super.isStoppingConditionReached();
	}

	public void clear() {
		
		for(S  sol : this.getPopulation()) {
			sol.setParents(null, null);
		}
		
		for(S  sol : this.archive) {
			sol.setParents(null, null);
		}
		
		this.getPopulation().clear();
		this.archive.clear();
	}

}
