package it.univaq.disim.sealab.metaheuristic.evolutionary.experiment;

import java.util.List;
import java.util.Map;

import org.uma.jmetal.algorithm.Algorithm;
import org.uma.jmetal.util.experiment.Experiment;

import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;

public class RExperiment<S extends RSolution, Result> extends Experiment<S, Result> {

	private List<Map.Entry<Algorithm<Result>, Long>> computingTimes;
	
	public RExperiment(RExperimentBuilder<S, Result> builder) {
		super(builder);
		computingTimes = null;
	}
	
	public void setComputingTime(final List<Map.Entry<Algorithm<Result>, Long>> ct) {
		computingTimes = ct;
	}
	
	public List<Map.Entry<Algorithm<Result>, Long>> getComputingTimes() { return computingTimes; }
}
