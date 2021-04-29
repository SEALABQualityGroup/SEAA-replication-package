package it.univaq.disim.sealab.metaheuristic.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.text.StringSubstitutor;

import it.univaq.disim.sealab.metaheuristic.actions.Refactoring;
import it.univaq.disim.sealab.metaheuristic.actions.RefactoringAction;
import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;
import logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction;
import logicalSpecification.actions.AEmilia.AEmiliaConstChangesAction;

public class FileUtils {

	public FileUtils() {
	}

	/**
	 * Recursively walk through sub-directories listing Aemilia files.
	 * 
	 * @param folder starting folder
	 * @return array of aemilia file paths
	 */
	public static Set<File> listFilesRecursively(final File folder) {
		Set<File> files = new HashSet<File>();
		if (folder == null || folder.listFiles() == null) {
			return files;
		}
		for (File entry : folder.listFiles()) {
			if (entry.isFile() && entry.getName().endsWith(".tsv")) {
				files.add(entry);
			} else if (entry.isDirectory()) {
				files.addAll(listFilesRecursively(entry));
			}
		}
		return files;
	}

	/**
	 * Recursively walk through sub-directories listing Aemilia files.
	 * 
	 * @param folder starting folder
	 * @return array of aemilia file paths
	 */
	public static Set<File> listFilesRecursively(final Path folder, String extension) {
		Set<File> files = new HashSet<File>();
		if (folder == null || folder.toFile().listFiles() == null) {
			return files;
		}
		for (File entry : folder.toFile().listFiles()) {
			if (entry.isFile() && entry.getName().endsWith(extension)) {
				files.add(entry);
			} else if (entry.isDirectory()) {
				files.addAll(listFilesRecursively(entry));
			}
		}
		return files;
	}

	/**
	 * Recursively walk through subdirectories listing Aemilia files.
	 * 
	 * @param folder starting folder
	 * @return array of aemilia file paths
	 */
	@Deprecated
	public static Set<File> listFilesRecursively(final File folder, String extension) {
		Set<File> files = new HashSet<File>();
		if (folder == null || folder.listFiles() == null) {
			return files;
		}
		for (File entry : folder.listFiles()) {
			if (entry.isFile() && entry.getName().endsWith(extension)) {
				files.add(entry);
			} else if (entry.isDirectory()) {
				files.addAll(listFilesRecursively(entry));
			}
		}
		return files;
	}

	public static void simpleSolutionWriterToCSV(RSolution rSolution) {
		try (FileWriter fw = new FileWriter(
				Paths.get(Configurator.eINSTANCE.getOutputFolder().toString(),
						rSolution.getProblem().getName() + "_solutions.csv").toFile(),
				true)) {
			List<String> line = new ArrayList<String>();
			line.addAll(Arrays.asList("SolID", "PerfQ", "ArchDist", "PAs"));
			CSVUtils.writeHeader(fw, line);
			line.clear();
			line.add(String.valueOf(rSolution.getName()));
			line.add(String.valueOf(rSolution.getPerfQ()));
			line.add(String.valueOf(rSolution.getNumOfChanges()));
			line.add(String.valueOf(rSolution.getPAs()));
			CSVUtils.writeLine(fw, line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeAnalyzableFile(final RSolution solution) {
		try (FileWriter analyzableCSV = new FileWriter(
				Paths.get(Configurator.eINSTANCE.getOutputFolder().toString(), "pareto",
						solution.getProblem().getName() + "_analyzableResults.csv").toFile(),
				true)) {

			List<String> line = new ArrayList<String>();
			/*String solID = "( "
					+ Configurator.eINSTANCE.getMaxEvaluation() / Configurator.eINSTANCE.getPopulationSize()
					+ "-" + Configurator.eINSTANCE.getPopulationSize() + " ) " + ":" + solution.getName();*/
			line.add(String.valueOf(solution.getName()));
			line.add(String.valueOf(solution.getPerfQ()));
			line.add(String.valueOf(solution.getNumOfChanges()));
			line.add(String.valueOf(solution.getPAs()));

			final Refactoring ref = solution.getVariableValue(0);

			for (RefactoringAction action : ref.getActions()) {
				if (action.getName() == null)
					action.setName(action.getClass().getSimpleName());

				String target = action instanceof AEmiliaConstChangesAction
						? ((AEmiliaConstChangesAction) action).getSourceConstInit().getName()
						: ((AEmiliaCloneAEIAction) action).getSourceAEI().getInstanceName();
				String factor = action instanceof AEmiliaConstChangesAction
						? Double.toString(((AEmiliaConstChangesAction) action).getFactorOfChange())
						: "NULL";
				line.addAll(Arrays.asList(target, factor));

			}
			CSVUtils.writeLine(analyzableCSV, line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static synchronized void moveTmpFile(final Path sourceFolder, final Path destFolder) {
		destFolder.toFile().mkdirs();
		try {
			org.apache.commons.io.FileUtils.copyDirectory(sourceFolder.toFile(), destFolder.toFile());
		} catch (IOException e) {
			EasierLogger.logger_.warning("[WARNING] Copying tmp folder failed!!!");
			e.printStackTrace();
			return;
		}
		try {
			org.apache.commons.io.FileUtils.cleanDirectory(sourceFolder.toFile());
		} catch (IOException e) {
			EasierLogger.logger_.warning("[WARNING] Cleaning tmp folder failed!!!");
			e.printStackTrace();
		}

	}

	public static List<String> getParetoSolIDs(final List<Path> paretoReferenceFront) {
		List<String> solIDs = new ArrayList<>();
		for (Path path : paretoReferenceFront) {
			try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					solIDs.add(sCurrentLine.split(" ")[0]);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return solIDs;
	}

	public static void fillTemplateKeywords(final Path sourceFile, final Path destination,
			final Map<String, String> keywords) {
		try {
			String templateString = fileToString(sourceFile, Charset.defaultCharset());
			StringSubstitutor sub = new StringSubstitutor(keywords);
			String resolvedString = sub.replace(templateString);

			File f = destination.toFile();
			f.getParentFile().mkdirs();
			f.createNewFile();

			PrintWriter out = new PrintWriter(destination.toFile());
			out.print(resolvedString);
			out.close();

		} catch (IOException e) {
			System.err.println("Error in filling the threshold and EVL pas checker file!");
			e.printStackTrace();
		}
	}

	public static String fileToString(Path path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(path);
		return new String(encoded, encoding);
	}

	@Deprecated
	public static String fileToString(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static List<Path> extractModelPaths(Path csvWithSolutions, int worseSolutions) {
		Path repository = csvWithSolutions.getParent().resolve("tmp");
		BufferedReader csvReader;
		List<Path> modelPaths = new ArrayList<>();
		try {
			csvReader = new BufferedReader(new FileReader(csvWithSolutions.toFile()));
			csvReader.close();

			List<String> lines = Files.readAllLines(csvWithSolutions);

			List<Solution> sols = new ArrayList<>();

			// remove the header
			lines.remove(0);
			for (String line : lines) {
				sols.add(new Solution(line));
			}
			Collections.sort(sols);

			Path defualtRew = Paths.get(
					"/home/peo/git/sealab/easier/easier-aemilia/src/main/resources/models/FTA/workload_5/model.rew");

			for (int i = 0; i < worseSolutions; i++) {
				int id = sols.get(i).id;

				Path targetFolder = repository.resolve(String.valueOf(id / 100)).resolve(String.valueOf(id));
				modelPaths.add(targetFolder);

				// copy the aem file
				Files.copy(targetFolder.resolve(String.valueOf(id + ".aem")), targetFolder.resolve("model.aem"),
						StandardCopyOption.REPLACE_EXISTING);
				// copy the rew file
				Files.copy(defualtRew, targetFolder.resolve("model.rew"), StandardCopyOption.REPLACE_EXISTING);
				// copy the val file
				Files.copy(targetFolder.resolve(String.valueOf(id + ".aem.val")), targetFolder.resolve("model.val"),
						StandardCopyOption.REPLACE_EXISTING);
				// copy the rewmapping file
				Files.copy(targetFolder.resolve(String.valueOf(id + ".rewmapping")),
						targetFolder.resolve("model.rewmapping"), StandardCopyOption.REPLACE_EXISTING);
				// copy the mmaemilia file
				Files.copy(targetFolder.resolve(String.valueOf(id + ".mmaemilia")),
						targetFolder.resolve("model.mmaemilia"), StandardCopyOption.REPLACE_EXISTING);
			}

		} catch (IOException e) {
			System.err.println("Error while extracting info from the pareto file");
			e.printStackTrace();
		}

		return modelPaths;
	}

	// aimed at sorting solutions within csv file
	// at 0 --> solution id
	// at 1 --> perfQ
	private static class Solution implements Comparable<Solution> {

		int id;
		double perfQ;

		Solution(String line) {

			id = Integer.valueOf(line.split(";")[0]);
			perfQ = Double.valueOf(line.split(";")[1]);
		}

		@Override
		public int compareTo(Solution s) {
			return (s.perfQ < this.perfQ) ? 1 : -1;

		}

	}

}
