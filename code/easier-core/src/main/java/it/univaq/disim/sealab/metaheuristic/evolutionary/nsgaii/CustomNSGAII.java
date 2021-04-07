package it.univaq.disim.sealab.metaheuristic.evolutionary.nsgaii;

import java.util.List;

import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAII;
import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.operator.MutationOperator;
import org.uma.jmetal.operator.SelectionOperator;
import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.util.evaluator.SolutionListEvaluator;

import it.univaq.disim.sealab.metaheuristic.evolutionary.EasierAlgorithm;
import it.univaq.disim.sealab.metaheuristic.evolutionary.ProgressBar;
import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;

@SuppressWarnings("serial")
public class CustomNSGAII<S extends RSolution> extends NSGAII<S> implements EasierAlgorithm {

//	private ProgressBar pbar;
//	private MutableInt done;
//	private MutableInt total;
	
//	private String name;

	/**
	 * Constructor
	 */
	public CustomNSGAII(Problem<S> problem, int maxIterations, int populationSize,
			CrossoverOperator<S> crossoverOperator, MutationOperator<S> mutationOperator,
			SelectionOperator<List<S>, S> selectionOperator, SolutionListEvaluator <S> evaluator) {
		super((Problem<S>)problem, maxIterations, populationSize, crossoverOperator, mutationOperator, selectionOperator,
				evaluator);
	}
	
	@Override
	protected boolean isStoppingConditionReached() {
		System.out.println(this.getName());
		ProgressBar.showBar((evaluations/getMaxPopulationSize()), (maxEvaluations/getMaxPopulationSize()));
		return super.isStoppingConditionReached();
	}

	@Override
	public String getDescription() {
		return "Nondominated Sorting Genetic Algorithm version II. Version using measures";
	}
	
	public void clear() {
		for(S  sol : this.getPopulation()) {
			sol.setParents(null, null);
		}
		this.getPopulation().clear();
	}
	
}
