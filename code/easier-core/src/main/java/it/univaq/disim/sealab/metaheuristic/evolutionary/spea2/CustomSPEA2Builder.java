package it.univaq.disim.sealab.metaheuristic.evolutionary.spea2;

import org.uma.jmetal.algorithm.multiobjective.spea2.SPEA2;
import org.uma.jmetal.algorithm.multiobjective.spea2.SPEA2Builder;
import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.operator.MutationOperator;
import org.uma.jmetal.problem.Problem;

import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;

public class CustomSPEA2Builder<S extends RSolution> extends SPEA2Builder<S>{

	public CustomSPEA2Builder(Problem<S> problem, CrossoverOperator<S> crossoverOperator,
			MutationOperator<S> mutationOperator) {
		super(problem, crossoverOperator, mutationOperator);
		
	}
	
	public SPEA2<S> build() {
//		NSGAII<S> algorithm = null ;
		
		SPEA2<S> algorithm = new CustomSPEA2<S>(this.getProblem(), this.getMaxIterations(), this.getPopulationSize(),
				this.getCrossoverOperator(), this.getMutationOperator(), this.getSelectionOperator(), this.getSolutionListEvaluator());
	    return algorithm ;
	  }


}
