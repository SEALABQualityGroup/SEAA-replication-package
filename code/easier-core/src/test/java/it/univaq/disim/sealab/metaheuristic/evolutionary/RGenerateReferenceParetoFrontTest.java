package it.univaq.disim.sealab.metaheuristic.evolutionary;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Before;
import org.junit.Test;
import org.uma.jmetal.qualityindicator.impl.Epsilon;
import org.uma.jmetal.qualityindicator.impl.GeneralizedSpread;
import org.uma.jmetal.qualityindicator.impl.GenericIndicator;
import org.uma.jmetal.qualityindicator.impl.Hypervolume;
import org.uma.jmetal.qualityindicator.impl.InvertedGenerationalDistance;
import org.uma.jmetal.qualityindicator.impl.InvertedGenerationalDistancePlus;
import org.uma.jmetal.qualityindicator.impl.Spread;
import org.uma.jmetal.qualityindicator.impl.hypervolume.PISAHypervolume;
import org.uma.jmetal.solution.Solution;
import org.uma.jmetal.util.JMetalException;
import org.uma.jmetal.util.JMetalLogger;
import org.uma.jmetal.util.archive.impl.NonDominatedSolutionListArchive;
import org.uma.jmetal.util.experiment.Experiment;
import org.uma.jmetal.util.experiment.util.ExperimentAlgorithm;
import org.uma.jmetal.util.experiment.util.ExperimentProblem;
import org.uma.jmetal.util.front.Front;
import org.uma.jmetal.util.front.imp.ArrayFront;
import org.uma.jmetal.util.front.util.FrontNormalizer;
import org.uma.jmetal.util.front.util.FrontUtils;
import org.uma.jmetal.util.point.util.PointSolution;
import org.uma.jmetal.util.solutionattribute.impl.GenericSolutionAttribute;

import it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.util.RGenerateReferenceParetoFront;
import it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.util.RPointSolution;
import it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.util.RSolutionListOutput;
import it.univaq.disim.sealab.metaheuristic.evolutionary.factory.FactoryBuilder;
import it.univaq.disim.sealab.metaheuristic.utils.Configurator;

public class RGenerateReferenceParetoFrontTest {

	private RGenerateReferenceParetoFront _claz;

	@Before
	public void init() {
		_claz = new RGenerateReferenceParetoFront();
	}

	@Test
	public void generateRPointSolutionList() throws IOException {

//		String outputDirectoryName = "/mnt/store/research/uml2lqn/21102020/easier-output";
		String outputDirectoryName = "/home/peo/Downloads/mnt/ramdisk/easier-output";
		
		String baseDirectory = outputDirectoryName + "/referenceFront/Exp";

		String problemTag = "agv_Length_4_CloningWeight_1.5_MaxCloning_3";

		String[] algorithmTags = { "NSGAII", "SPEA2" };
		List<String> referenceFrontFileNames = new LinkedList<>();

		NonDominatedSolutionListArchive<RPointSolution> nonDominatedSolutionArchive = new NonDominatedSolutionListArchive<RPointSolution>();

		for (int j = 0; j < algorithmTags.length; j++) {
			String problemDirectory = baseDirectory + "/data/" + algorithmTags[j] + "/" + problemTag;

			for (int i = 0; i < 31; i++) {

				String varFileName = problemDirectory + "/VAR" + i + ".tsv";

				if (new File(varFileName).exists()) {

					List<RPointSolution> ptSolutionList = generateRPointSolutionList(varFileName);
					GenericSolutionAttribute<RPointSolution, String> solutionAttribute = new GenericSolutionAttribute<RPointSolution, String>();

					for (RPointSolution solution : ptSolutionList) {
						solutionAttribute.setAttribute(solution, algorithmTags[j]);
						nonDominatedSolutionArchive.add(solution);
					}
				}
			}
		}

		String referenceSetFileName = outputDirectoryName + "/" + problemTag + ".rf";
		referenceFrontFileNames.add(problemTag + ".rf");

		new RSolutionListOutput(nonDominatedSolutionArchive.getSolutionList())
				.printObjectivesToFile(referenceSetFileName);

		writeFilesWithTheSolutionsContributedByEachAlgorithm(outputDirectoryName, problemTag,
				nonDominatedSolutionArchive.getSolutionList());

	}

	public List<RPointSolution> generateRPointSolutionList(String varFileName) {

		List<RPointSolution> ptList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(varFileName))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {

				String[] split = sCurrentLine.split(";");

				ptList.add(new RPointSolution().setID(Integer.parseInt(split[0]))
						.setPointSolution(Arrays.asList((Arrays.copyOfRange(split, 1, 5)))));
			}
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
		return ptList;
	}

	private void writeFilesWithTheSolutionsContributedByEachAlgorithm(String outputDirectoryName, String problemName,
			List<RPointSolution> nonDominatedSolutions) throws IOException {
		GenericSolutionAttribute<RPointSolution, String> solutionAttribute = new GenericSolutionAttribute<RPointSolution, String>();

		String[] algorithmTags = { "NSGAII", "SPEA2" };

		for (int j = 0; j < algorithmTags.length; j++) {
			List<RPointSolution> solutionsPerAlgorithm = new ArrayList<>();
			for (RPointSolution solution : nonDominatedSolutions) {
				if (algorithmTags[j].equals(solutionAttribute.getAttribute(solution))) {
					solutionsPerAlgorithm.add(solution);
				}
			}

			new RSolutionListOutput(solutionsPerAlgorithm)
					.printObjectivesToFile(outputDirectoryName + "/" + problemName + "." + algorithmTags[j] + ".rf");
		}
	}

	@Test
	public void computeIndicators() throws FileNotFoundException {

		String problemTag = "train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3";

		String[] algorithmTags = { "NSGAII", "SPEA2" };

//		String outputDirectoryName = "/mnt/store/research/uml2lqn/21102020/easier-output";
		String outputDirectoryName = "/tmp/easier-output-24";
		String baseDirectory = outputDirectoryName + "/referenceFront/Exp";

		List<GenericIndicator<PointSolution>> qIndicators = new ArrayList<>();
//		FactoryBuilder<RSolution> factory = new FactoryBuilder<RSolution>();
		List<String> qIs = Arrays.asList("SPREAD","IGD+","IGD","EPSILON","HYPER_VOLUME","GENERALIZED_SPREAD");
		qIndicators.add(new Spread<>());
		qIndicators.add(new InvertedGenerationalDistancePlus<>());
		qIndicators.add(new InvertedGenerationalDistance<>());
		qIndicators.add(new Epsilon<>());
		qIndicators.add(new PISAHypervolume<>());
		qIndicators.add(new GeneralizedSpread<>());

		for (GenericIndicator<PointSolution> indicator : qIndicators) {
			JMetalLogger.logger.info("Computing indicator: " + indicator.getName());

			for (int j = 0; j < algorithmTags.length; j++) {
				String algorithmDirectory;
				algorithmDirectory = baseDirectory + "/data/" + algorithmTags[j];

				String problemDirectory = algorithmDirectory + "/" + problemTag;

				String referenceFrontDirectory = outputDirectoryName;

				String referenceFrontName = "/mnt/store/research/uml2lqn/21102020/easier-output" + "/" + problemTag + "." + algorithmTags[j] + ".rf";
				

				JMetalLogger.logger.info("RF: " + referenceFrontName);

				Front referenceFront = new ArrayFront(removeSolID(referenceFrontName));

				FrontNormalizer frontNormalizer = new FrontNormalizer(referenceFront);

				try {
					Front normalizedReferenceFront = frontNormalizer.normalize(referenceFront);

					String qualityIndicatorFile = problemDirectory + "/" + indicator.getName();
					resetFile(qualityIndicatorFile);

					indicator.setReferenceParetoFront(normalizedReferenceFront);
					for (int i = 0; i < 31; i++) {
						String frontFileName = problemDirectory + "/FUN" + i + ".tsv";

						if (new File(frontFileName).exists()) { // in case of a not completed execution

							Front front = new ArrayFront(frontFileName);

							Front normalizedFront = frontNormalizer.normalize(front);
							List<PointSolution> normalizedPopulation = FrontUtils
									.convertFrontToSolutionList(normalizedFront);
							Double indicatorValue = (Double) indicator.evaluate(normalizedPopulation);
							JMetalLogger.logger.info(indicator.getName() + ": " + indicatorValue);

							writeQualityIndicatorValueToFile(indicatorValue, qualityIndicatorFile);
						}
					}
				} catch (JMetalException e) {
					e.printStackTrace();
				}
//				}
			}
		}
		try{
			findBestIndicatorFronts(qIndicators);
		} catch (JMetalException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void writeQualityIndicatorValueToFile(Double indicatorValue, String qualityIndicatorFile) {
		FileWriter os;
		try {
			os = new FileWriter(qualityIndicatorFile, true);
			os.write("" + indicatorValue + "\n");
			os.close();
		} catch (IOException ex) {
			throw new JMetalException("Error writing indicator file" + ex);
		}
	}

	public String removeSolID(String frontFileName) {

		File tmpFile;
		String tmpFileName = null;
		try {
			tmpFile = File.createTempFile("front", "");
			tmpFile.deleteOnExit();
			tmpFileName = tmpFile.getAbsolutePath();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		String readLine = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(frontFileName));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tmpFile))) {
			while ((readLine = reader.readLine()) != null) {
				if (readLine.contains("perfQ")) {

				} else {
					String line = readLine.split(" ", 2)[1];
					writer.write(line);
					writer.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tmpFileName;
	}
	
	public String readABS(String frontFileName) {

		File tmpFile;
		String tmpFileName = null;
		try {
			tmpFile = File.createTempFile("ABSfront", "");
			tmpFile.deleteOnExit();
			tmpFileName = tmpFile.getAbsolutePath();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		String readLine = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(frontFileName));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tmpFile))) {
			while ((readLine = reader.readLine()) != null) {
				if (readLine.contains("perfQ")) {

				} else {
					String[] obj = readLine.split(" ");
					String line = "";
					for(int i = 0; i<4;i++) {
						line += String.valueOf(Math.abs(Double.parseDouble(obj[i])));
						if(i<3)
							line += " ";
					}
					
					writer.write(line);
					writer.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tmpFileName;
	}

	public void findBestIndicatorFronts(List<GenericIndicator<PointSolution>> qIndicators) throws IOException {

		String[] algorithmTags = { "NSGAII", "SPEA2" };
		String problemTag = "train-ticket_Length_4_CloningWeight_1.5_MaxCloning_3";

//		String outputDirectoryName = "/mnt/store/research/uml2lqn/21102020/easier-output";
		String outputDirectoryName = "/tmp/easier-output-24";
		String baseDirectory = outputDirectoryName + "/referenceFront/Exp";

		for (GenericIndicator<?> indicator : qIndicators) {
			for (int j = 0; j < algorithmTags.length; j++) {
				String algorithmDirectory;
				algorithmDirectory = baseDirectory + "/data/" + algorithmTags[j];

//				for (ExperimentProblem<?> problem : experiment.getProblemList()) {
				String indicatorFileName = algorithmDirectory + "/" + problemTag + "/" + indicator.getName();
				Path indicatorFile = Paths.get(indicatorFileName);
				if (indicatorFile != null && Files.exists(indicatorFile)) {

					List<String> fileArray;
					fileArray = Files.readAllLines(indicatorFile, StandardCharsets.UTF_8);

					List<Pair<Double, Integer>> list = new ArrayList<>();

					for (int i = 0; i < fileArray.size(); i++) {
						Pair<Double, Integer> pair = new ImmutablePair<>(Double.parseDouble(fileArray.get(i)), i);
						list.add(pair);
					}

					Collections.sort(list, new Comparator<Pair<Double, Integer>>() {
						@Override
						public int compare(Pair<Double, Integer> pair1, Pair<Double, Integer> pair2) {
							if (Math.abs(pair1.getLeft()) > Math.abs(pair2.getLeft())) {
								return 1;
							} else if (Math.abs(pair1.getLeft()) < Math.abs(pair2.getLeft())) {
								return -1;
							} else {
								return 0;
							}
						}
					});
					String bestFunFileName;
					String bestVarFileName;
					String medianFunFileName;
					String medianVarFileName;

					String outputDirectory = algorithmDirectory + "/" + problemTag;

					bestFunFileName = outputDirectory + "/BEST_" + indicator.getName() + "_FUN.tsv";
					bestVarFileName = outputDirectory + "/BEST_" + indicator.getName() + "_VAR.tsv";
					medianFunFileName = outputDirectory + "/MEDIAN_" + indicator.getName() + "_FUN.tsv";
					medianVarFileName = outputDirectory + "/MEDIAN_" + indicator.getName() + "_VAR.tsv";
					if (indicator.isTheLowerTheIndicatorValueTheBetter()) {
						String bestFunFile = outputDirectory + "/FUN" + +list.get(0).getRight() + ".tsv";
						String bestVarFile = outputDirectory + "/VAR" + +list.get(0).getRight() + ".tsv";

						Files.copy(Paths.get(bestFunFile), Paths.get(bestFunFileName), REPLACE_EXISTING);
						Files.copy(Paths.get(bestVarFile), Paths.get(bestVarFileName), REPLACE_EXISTING);
					} else {
						String bestFunFile = outputDirectory + "/FUN" + +list.get(list.size() - 1).getRight() + ".tsv";
						String bestVarFile = outputDirectory + "/VAR" + +list.get(list.size() - 1).getRight() + ".tsv";

						Files.copy(Paths.get(bestFunFile), Paths.get(bestFunFileName), REPLACE_EXISTING);
						Files.copy(Paths.get(bestVarFile), Paths.get(bestVarFileName), REPLACE_EXISTING);
					}

					int medianIndex = list.size() / 2;
					String medianFunFile = outputDirectory + "/FUN" + +list.get(medianIndex).getRight() + ".tsv";
					String medianVarFile = outputDirectory + "/VAR" + +list.get(medianIndex).getRight() + ".tsv";

					Files.copy(Paths.get(medianFunFile), Paths.get(medianFunFileName), REPLACE_EXISTING);
					Files.copy(Paths.get(medianVarFile), Paths.get(medianVarFileName), REPLACE_EXISTING);
				}
			}
		}
	}
	
	/**
	 * Deletes a file or directory if it does exist
	 * 
	 * @param file
	 */
	private void resetFile(String file) {
		File f = new File(file);
		if (f.exists()) {
			JMetalLogger.logger.info("File " + file + " exist.");

			if (f.isDirectory()) {
				JMetalLogger.logger.info("File " + file + " is a directory. Deleting directory.");
				if (f.delete()) {
					JMetalLogger.logger.info("Directory successfully deleted.");
				} else {
					JMetalLogger.logger.info("Error deleting directory.");
				}
			} else {
				JMetalLogger.logger.info("File " + file + " is a file. Deleting file.");
				if (f.delete()) {
					JMetalLogger.logger.info("File succesfully deleted.");
				} else {
					JMetalLogger.logger.info("Error deleting file.");
				}
			}
		} else {
			JMetalLogger.logger.info("File " + file + " does NOT exist.");
		}
	}

}
