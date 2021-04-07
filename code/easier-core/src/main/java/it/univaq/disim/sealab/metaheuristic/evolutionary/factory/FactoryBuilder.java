package it.univaq.disim.sealab.metaheuristic.evolutionary.factory;

import java.util.HashMap;
import java.util.Map;

import org.uma.jmetal.algorithm.multiobjective.spea2.SPEA2Builder;
import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.operator.MutationOperator;
import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.qualityindicator.impl.Epsilon;
import org.uma.jmetal.qualityindicator.impl.GeneralizedSpread;
import org.uma.jmetal.qualityindicator.impl.GenericIndicator;
import org.uma.jmetal.qualityindicator.impl.InvertedGenerationalDistance;
import org.uma.jmetal.qualityindicator.impl.InvertedGenerationalDistancePlus;
import org.uma.jmetal.qualityindicator.impl.Spread;
import org.uma.jmetal.qualityindicator.impl.hypervolume.PISAHypervolume;
import org.uma.jmetal.util.AlgorithmBuilder;

import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;
import it.univaq.disim.sealab.metaheuristic.evolutionary.nsgaii.CustomNSGAIIBuilder;

public class FactoryBuilder<S extends RSolution> {

	private final static String NSGA_II = "NSGA_II";
	private final static String SPEA2 = "SPEA2";
	
	private final static Map<String, Class> qualityIndicatorsMap = new HashMap<String, Class>() {{
		put("SPREAD", Spread.class);
		put("IGD+", InvertedGenerationalDistancePlus.class);
		put("IGD", InvertedGenerationalDistance.class);
		put("EPSILON", Epsilon.class);
		put("HYPER_VOLUME", PISAHypervolume.class);
		put("GENERALIZED_SPREAD", GeneralizedSpread.class);
	}}; 

	public FactoryBuilder() {}

	public AlgorithmBuilder<?> createBuilder(String builder, Problem<S> problem,
			CrossoverOperator<S> crossoverOperator, MutationOperator<S> mutationOperator) {
		
		AlgorithmBuilder<?> algo = null;
		
		if(builder.equals(NSGA_II))
			algo = new CustomNSGAIIBuilder<S>(problem, crossoverOperator, mutationOperator);
		if(builder.equals(SPEA2))
			algo = new SPEA2Builder<>(problem, crossoverOperator, mutationOperator);
		
		System.out.println("[ERROR] No available builders!!!");
		
		return algo;
	}
	
	public GenericIndicator<S> createQualityIndicators(String qI) {
		try {
			return (GenericIndicator<S>) qualityIndicatorsMap.get(qI).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("[ERROR]");
			e.printStackTrace();
		}
		
		System.out.println("[ERROR] no available quality indicators builder");
		return null;
	}

}
