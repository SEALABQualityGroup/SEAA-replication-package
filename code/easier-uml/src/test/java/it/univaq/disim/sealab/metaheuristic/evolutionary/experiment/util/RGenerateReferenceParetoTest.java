package it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAII;
import org.uma.jmetal.algorithm.multiobjective.nsgaii.NSGAIIBuilder;
import org.uma.jmetal.operator.CrossoverOperator;
import org.uma.jmetal.operator.MutationOperator;
import org.uma.jmetal.operator.SelectionOperator;
import org.uma.jmetal.qualityindicator.impl.GenericIndicator;
import org.uma.jmetal.util.archive.impl.NonDominatedSolutionListArchive;
import org.uma.jmetal.util.evaluator.SolutionListEvaluator;
import org.uma.jmetal.util.experiment.Experiment;
import org.uma.jmetal.util.experiment.util.ExperimentAlgorithm;
import org.uma.jmetal.util.experiment.util.ExperimentProblem;
import org.uma.jmetal.util.solutionattribute.impl.GenericSolutionAttribute;

import it.univaq.disim.sealab.metaheuristic.evolutionary.RProblem;
import it.univaq.disim.sealab.metaheuristic.evolutionary.UMLRProblem;
import it.univaq.disim.sealab.metaheuristic.evolutionary.UMLRSolution;
import it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.RExperimentBuilder;
import it.univaq.disim.sealab.metaheuristic.evolutionary.factory.FactoryBuilder;
import it.univaq.disim.sealab.metaheuristic.evolutionary.nsgaii.CustomNSGAIIBuilder;
import it.univaq.disim.sealab.metaheuristic.evolutionary.operator.RMutation;
import it.univaq.disim.sealab.metaheuristic.evolutionary.operator.UMLRCrossover;
import it.univaq.disim.sealab.metaheuristic.evolutionary.operator.UMLRSolutionListEvaluator;
import it.univaq.disim.sealab.metaheuristic.utils.Configurator;

public class RGenerateReferenceParetoTest {

	private List<ExperimentProblem<UMLRSolution>> problemList;
	private List<ExperimentAlgorithm<UMLRSolution, List<UMLRSolution>>> algorithmList;
	private List<GenericIndicator<UMLRSolution>> qualityIndicators;
	private List<String> tags;
	Experiment<UMLRSolution, List<UMLRSolution>> experiment;

	@Before
	public void init() {

//		problemList = createProblem();
//		algorithmList = configureAlgorithmList(problemList);
//		qualityIndicators = configureIndicators();
//
//		tags = new ArrayList<>();
//		problemList.forEach(p -> tags.add(p.getTag() + ".rf"));
//
//		experiment = new RExperimentBuilder<UMLRSolution, List<UMLRSolution>>("Exp").setAlgorithmList(algorithmList)
//				.setProblemList(problemList).setExperimentBaseDirectory("/tmp/solution_no_pas_avg_igd")
//				.setReferenceFrontDirectory("/tmp/solution_no_pas_avg_igd").setReferenceFrontFileNames(tags)
//				.setOutputParetoFrontFileName("FUN").setOutputParetoSetFileName("VAR")
//				.setIndicatorList(qualityIndicators).setIndependentRuns(3).setNumberOfCores(1).build();
	}

	@Test
	public void generateSuperReferenceParetoTest() throws IOException {

//		new RGenerateReferenceParetoFront(experiment).run();

		List<RPointSolution> ptList = new ArrayList<>();
		List<String> referenceFronts;
		NonDominatedSolutionListArchive<RPointSolution> nonDominatedSolutionArchive = new NonDominatedSolutionListArchive<RPointSolution>();

		String problemName = "solution_with_pas_rel_090";//"solution_with_pas_rel"; //"solution_no_pas_avg_igd"
		String problemFolderName = "/mnt/research/easier/tunig";
		try (Stream<Path> walk = Files.walk(Paths.get(
				String.format("%s/%s/referenceFront", problemFolderName, problemName)))) {
			referenceFronts = walk.filter(p -> !Files.isDirectory(p)) // not a directory
					.map(p -> p.toString())// .toLowerCase()) // convert path to string
					.filter(f -> f.endsWith("rf") && !f.contains("NSGAII")) // check end with
					.collect(Collectors.toList()); // collect all matched to a List
		}

		for (String front : referenceFronts) {

			try (BufferedReader br = new BufferedReader(new FileReader(front))) {

				String sCurrentLine;
				final int numObjs = 4;
				while ((sCurrentLine = br.readLine()) != null) {

					if (!sCurrentLine.contains("solID")) {

						String[] split = sCurrentLine.split(" ");

						ptList.add(new RPointSolution(numObjs).setID(Integer.parseInt(split[0]))
								.setPointSolution(Arrays.asList((Arrays.copyOfRange(split, 1, numObjs + 1)))));
					}
				}

			} catch (IOException | NumberFormatException e) {
				e.printStackTrace();
			}
		}

		GenericSolutionAttribute<RPointSolution, String> solutionAttribute = new GenericSolutionAttribute<RPointSolution, String>();

		for (RPointSolution solution : ptList) {
			solutionAttribute.setAttribute(solution, "NSGAII");
			nonDominatedSolutionArchive.add(solution);
		}

		new RSolutionListOutput(nonDominatedSolutionArchive.getSolutionList()).printObjectivesToFile(
				String.format("%s/%s/referenceFront/super-reference-pareto.rf", problemFolderName, problemName));

	}

	@Test
	public void generateParetoPerProblem() throws IOException {

		List<String> varSolutions;

		String problemName = "solution_with_pas_rel_090";//"solution_with_pas_rel"; //"solution_no_pas_avg_igd"
		String problemFolderName = "/mnt/research/easier/tunig";
		String problemFolder = String.format(
				"%s/%s/referenceFront/Exp/data/NSGAII/train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_",
				problemFolderName, problemName);

		// int[] evals = { 12, 22, 32, 42, 52, 62, 72 };
		int maxEvols = 72; //142

		for (int i = 72; i <= maxEvols; i += 10) {

			String solutionFolder = problemFolder + i;
			NonDominatedSolutionListArchive<RPointSolution> nonDominatedSolutionArchive = new NonDominatedSolutionListArchive<RPointSolution>();

			try (Stream<Path> walk = Files.walk(Paths.get(solutionFolder))) {
				varSolutions = walk.filter(p -> !Files.isDirectory(p)) // not a directory
						.map(p -> p.toString())// .toLowerCase()) // convert path to string
						.filter(f -> f.endsWith("tsv") && f.contains("VAR") && !f.contains("IGD+")) // check end with
						.collect(Collectors.toList()); // collect all matched to a List
			}

			for (String varFileName : varSolutions) {

				List<RPointSolution> ptSolutionList = generateRPointSolutionList(varFileName);
				GenericSolutionAttribute<RPointSolution, String> solutionAttribute = new GenericSolutionAttribute<RPointSolution, String>();

				for (RPointSolution solution : ptSolutionList) {
					solutionAttribute.setAttribute(solution, "NSGAII");
					nonDominatedSolutionArchive.add(solution);
				}
			}

			new RSolutionListOutput(nonDominatedSolutionArchive.getSolutionList()).printObjectivesToFile(String.format(
					"%s/%s/referenceFront/train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3_MaxEval_%d.rf",
					problemFolderName,problemName, i));
		}
	}

	public List<RPointSolution> generateRPointSolutionList(String varFileName) {

		List<RPointSolution> ptList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(varFileName))) {

			String sCurrentLine;
			final int numObjs = 4;
			while ((sCurrentLine = br.readLine()) != null) {

				String[] split = sCurrentLine.split(";");

				ptList.add(new RPointSolution(numObjs).setID(Integer.parseInt(split[0]))
						.setPointSolution(Arrays.asList((Arrays.copyOfRange(split, 1, numObjs + 1)))));
			}
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
		return ptList;
	}
}
