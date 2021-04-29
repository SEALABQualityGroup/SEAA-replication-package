package it.univaq.disim.sealab.metaheuristic.evolutionary.experiment;

import java.util.List;

import org.uma.jmetal.qualityindicator.impl.GenericIndicator;
import org.uma.jmetal.util.experiment.ExperimentBuilder;
import org.uma.jmetal.util.experiment.util.ExperimentAlgorithm;
import org.uma.jmetal.util.experiment.util.ExperimentProblem;

import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;

public class RExperimentBuilder<S extends RSolution, Result> extends ExperimentBuilder<S, Result> {

	public RExperimentBuilder(String experimentName) {
		super(experimentName);
	}
	
	/*
	 * public RExperimentBuilder<S, Result>
	 * setAlgorithmList(List<ExperimentAlgorithm<S, Result>> algorithmList) { //
	 * this.algorithmList = new ArrayList<>(algorithmList);
	 * super.setAlgorithmList(algorithmList); return this; }
	 * 
	 * public RExperimentBuilder<S, Result>
	 * setProblemList(List<ExperimentProblem<S>> problemList) { // this.problemList
	 * = problemList; super.setProblemList(problemList); return this; }
	 * 
	 * public RExperimentBuilder<S, Result> setExperimentBaseDirectory(String
	 * experimentBaseDirectory) { // this.experimentBaseDirectory =
	 * experimentBaseDirectory + "/" + experimentName;
	 * super.setExperimentBaseDirectory(experimentBaseDirectory); return this; }
	 * 
	 * public RExperimentBuilder<S, Result> setReferenceFrontDirectory(String
	 * referenceFrontDirectory) { // this.referenceFrontDirectory =
	 * referenceFrontDirectory;
	 * super.setReferenceFrontDirectory(referenceFrontDirectory); return this; }
	 * 
	 * public RExperimentBuilder<S, Result> setReferenceFrontFileNames(List<String>
	 * referenceFrontFileNames) { // this.referenceFrontFileNames =
	 * referenceFrontFileNames;
	 * super.setReferenceFrontFileNames(referenceFrontFileNames); return this; }
	 * 
	 * public RExperimentBuilder<S, Result>
	 * setIndicatorList(List<GenericIndicator<S>> indicatorList) { //
	 * this.indicatorList = indicatorList; super.setIndicatorList(indicatorList);
	 * return this; }
	 * 
	 * public RExperimentBuilder<S, Result> setOutputParetoFrontFileName(String
	 * outputParetoFrontFileName) { // this.outputParetoFrontFileName =
	 * outputParetoFrontFileName;
	 * super.setOutputParetoFrontFileName(outputParetoFrontFileName); return this; }
	 * 
	 * public RExperimentBuilder<S, Result> setOutputParetoSetFileName(String
	 * outputParetoSetFileName) { // this.outputParetoSetFileName =
	 * outputParetoSetFileName;
	 * super.setOutputParetoSetFileName(outputParetoSetFileName); return this; }
	 * 
	 * public RExperimentBuilder<S, Result> setIndependentRuns(int independentRuns)
	 * { // this.independentRuns = independentRuns;
	 * super.setIndependentRuns(independentRuns); return this; }
	 * 
	 * public RExperimentBuilder<S, Result> setNumberOfCores(int numberOfCores) { //
	 * this.numberOfCores = numberOfCores; super.setNumberOfCores(numberOfCores);
	 * return this; }
	 */

	public RExperiment<S, Result> build() {
		return new RExperiment<S, Result>(this);
	}

}
