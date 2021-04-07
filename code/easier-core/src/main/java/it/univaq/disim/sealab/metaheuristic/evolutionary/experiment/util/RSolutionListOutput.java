package it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

import org.uma.jmetal.solution.Solution;
import org.uma.jmetal.util.JMetalException;
import org.uma.jmetal.util.fileoutput.FileOutputContext;
import org.uma.jmetal.util.fileoutput.SolutionListOutput;
import org.uma.jmetal.util.fileoutput.impl.DefaultFileOutputContext;

import it.univaq.disim.sealab.metaheuristic.utils.Configurator;

public class RSolutionListOutput {

	private FileOutputContext varFileContext;
	private FileOutputContext funFileContext;
	private String varFileName = "VAR";
	private String funFileName = "FUN";
	private String separator = "\t";
	private List<RPointSolution> solutionList;
	private boolean selectFeasibleSolutions;
	private List<Boolean> isObjectiveToBeMinimized;

	public RSolutionListOutput(List<RPointSolution> solutionList) {
		varFileContext = new DefaultFileOutputContext(varFileName);
		funFileContext = new DefaultFileOutputContext(funFileName);
		varFileContext.setSeparator(separator);
		funFileContext.setSeparator(separator);
		this.solutionList = solutionList;
		selectFeasibleSolutions = false;
		isObjectiveToBeMinimized = null;
	}

	public RSolutionListOutput setVarFileOutputContext(FileOutputContext fileContext) {
		varFileContext = fileContext;

		return this;
	}

	public RSolutionListOutput setFunFileOutputContext(FileOutputContext fileContext) {
		funFileContext = fileContext;

		return this;
	}

	public RSolutionListOutput setObjectiveMinimizingObjectiveList(List<Boolean> isObjectiveToBeMinimized) {
		this.isObjectiveToBeMinimized = isObjectiveToBeMinimized;

		return this;
	}

	public RSolutionListOutput selectFeasibleSolutions() {
		selectFeasibleSolutions = true;
		return this;
	}

	public RSolutionListOutput setSeparator(String separator) {
		this.separator = separator;
		varFileContext.setSeparator(this.separator);
		funFileContext.setSeparator(this.separator);

		return this;
	}

	public void print() {
		if (isObjectiveToBeMinimized == null) {
			printObjectivesToFile(funFileContext, solutionList);
		} else {
			printObjectivesToFile(funFileContext, solutionList, isObjectiveToBeMinimized);
		}
		printVariablesToFile(varFileContext, solutionList);
	}

	public void printVariablesToFile(FileOutputContext context, List<? extends Solution<?>> solutionList) {
		BufferedWriter bufferedWriter = context.getFileWriter();

		try {
			// prints the header of the file
			bufferedWriter.write("solID" + context.getSeparator() + "perfQ" + context.getSeparator() + "#changes"
					+ context.getSeparator() + "pas" + context.getSeparator() + "reliability" + context.getSeparator()
					+ "actions" + context.getSeparator());
			bufferedWriter.newLine();
			if (solutionList.size() > 0) {
				int numberOfVariables = solutionList.get(0).getNumberOfVariables();
				for (int i = 0; i < solutionList.size(); i++) {
					for (int j = 0; j < numberOfVariables; j++) {
						bufferedWriter.write(solutionList.get(i).getVariableValueString(j) + context.getSeparator());
					}
					bufferedWriter.newLine();
				}
			}

			bufferedWriter.close();
		} catch (IOException e) {
			throw new JMetalException("Error writing data ", e);
		}

	}

	public void printObjectivesToFile(FileOutputContext context, List<RPointSolution> solutionList) {
		BufferedWriter bufferedWriter = context.getFileWriter();

		try {
			// prints the header of the file
			/*
			 * with PAs String header =
			 * String.format("solID%sperfQ%s#changes%spas%sreliability%s",
			 * context.getSeparator(), context.getSeparator(), context.getSeparator(),
			 * context.getSeparator(), context.getSeparator());
			 */
			String header;
			// without PAs
			if(Configurator.eINSTANCE.getObjectives() == 4)
				header = String.format("solID%sperfQ%s#changes%spas%sreliability%s", context.getSeparator(),
					context.getSeparator(), context.getSeparator(), context.getSeparator(),context.getSeparator());
			else
				header = String.format("solID%sperfQ%s#changes%sreliability%s", context.getSeparator(),
						context.getSeparator(), context.getSeparator(), context.getSeparator()); 
			bufferedWriter.write(header);
			bufferedWriter.newLine();
			if (solutionList.size() > 0) {
				int numberOfObjectives = solutionList.get(0).getNumberOfObjectives();
				for (int i = 0; i < solutionList.size(); i++) {
					bufferedWriter.write(solutionList.get(i).getID() + context.getSeparator());
					for (int j = 0; j < numberOfObjectives; j++) {
//						if (j == 0 && !RPointSolution.isWorsen())
//							bufferedWriter.write((-1 * solutionList.get(i).getObjective(j)) + context.getSeparator());
//						else
						bufferedWriter.write(solutionList.get(i).getObjective(j) + context.getSeparator());
					}
					bufferedWriter.newLine();
				}
			}

			bufferedWriter.close();
		} catch (IOException e) {
			throw new JMetalException("Error printing objecives to file: ", e);
		}
	}

	public void printObjectivesToFile(FileOutputContext context, List<? extends Solution<?>> solutionList,
			List<Boolean> minimizeObjective) {
		BufferedWriter bufferedWriter = context.getFileWriter();

		try {
			if (solutionList.size() > 0) {
				int numberOfObjectives = solutionList.get(0).getNumberOfObjectives();
				if (numberOfObjectives != minimizeObjective.size()) {
					throw new JMetalException(
							"The size of list minimizeObjective is not correct: " + minimizeObjective.size());
				}
				for (int i = 0; i < solutionList.size(); i++) {
					for (int j = 0; j < numberOfObjectives; j++) {
						if (minimizeObjective.get(j)) {
							bufferedWriter.write(solutionList.get(i).getObjective(j) + context.getSeparator());
						} else {
							bufferedWriter.write(-1.0 * solutionList.get(i).getObjective(j) + context.getSeparator());
						}
					}
					bufferedWriter.newLine();
				}
			}

			bufferedWriter.close();
		} catch (IOException e) {
			throw new JMetalException("Error printing objecives to file: ", e);
		}
	}

	/*
	 * Wrappers for printing with default configuration
	 */
	public void printObjectivesToFile(String fileName) throws IOException {
		printObjectivesToFile(new DefaultFileOutputContext(fileName), solutionList);
	}

	public void printObjectivesToFile(String fileName, List<Boolean> minimizeObjective) throws IOException {
		printObjectivesToFile(new DefaultFileOutputContext(fileName), solutionList, minimizeObjective);
	}

	public void printVariablesToFile(String fileName) throws IOException {
		printVariablesToFile(new DefaultFileOutputContext(fileName), solutionList);
	}

}
