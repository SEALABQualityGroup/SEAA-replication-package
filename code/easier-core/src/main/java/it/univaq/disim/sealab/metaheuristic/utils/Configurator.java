package it.univaq.disim.sealab.metaheuristic.utils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.beust.jcommander.Parameter;

public class Configurator {

	public static Configurator eINSTANCE = new Configurator();

	@Parameter
	private List<String> parameters = new ArrayList<>();

	@Parameter(names = { "-h", "--help" }, help = true)
	private boolean help;

	@Parameter(names = { "-sor" }, description = "Use stochastic over-relaxation", arity = 0)
	private boolean sor = false;

	@Parameter(names = { "-e", "--experiment" }, description = "Execute experiment")
	private boolean experiment = true;

	@Parameter(names = { "-m", "--models" }, required = true, description = "List of models")
	private List<String> modelsPath = new ArrayList<>();

	@Parameter(names = { "--solver" }, description = "Set the solver {TTKernel, LQN} path")
	private String solver;

	@Parameter(names = { "-p", "--pareto" }, description = "Give the Reference pareto front file path")
	private String paretoFront;

	@Parameter(names = { "--maxCloning" }, description = "Set the max number of clones within a sequence")
	private List<Integer> maxCloning = Arrays.asList(3);

	@Parameter(names = { "--cloningWeight" }, description = "Set the architectural distance weight for a clone action")
	private List<Double> cloningWeight = Arrays.asList(1.5);

	@Parameter(names = {
			"--constChangesWeight" }, description = "Set the architectural distance weight for a const change action")
	private double constChangesWeight = 1;

	@Parameter(names = { "-r", "--independent_runs" }, description = "Set the number of independent runs")
	private int independetRuns = 31;

	@Parameter(names = { "--cleaningTmp" }, description = "Set to true for removing all temporary files")
	private boolean cleaningTmp = false;

	@Parameter(names = { "-outF", "--outputFolder" }, required = true, description = "Set the output root folder")
	private String outputFolder;

	@Parameter(names = { "-maxEval", "--maxEvaluation" }, required = true, description = "Set the maximum evaluations")
	private List<Integer> maxEval;

	@Parameter(names = { "-popSize", "--populationSize" }, required = true, description = "Set the population size")
	private int popSize;

	@Parameter(names = { "-xover", "--xoverProb" }, description = "Set the crossover probability")
	private double xover = 0.8;

	@Parameter(names = { "-mutation", "--mutationProb" }, description = "Set the mutation probability")
	private double mutation = 0.2;

	@Parameter(names = { "-dIndex",
			"--distributionIndex" }, description = "Set the distribution index for the mutation operator")
	private double distributionIndex = 20;

	@Parameter(names = { "-l", "--sequenceLength" }, description = "Set the length of a sequence")
	private List<Integer> length = Arrays.asList(4);

	@Parameter(names = { "-af", "--allowedFaiulures" }, description = "Set the maximunm number of failures")
	private int aw = 100;

	@Parameter(names = { "-a", "--actions" }, description = "Set the number of available actions")
	private int actions = 5; // clone, removeClone, const change, probability, size

	@Parameter(names = { "-tmpF", "--tempFolder" }, required = true, description = "It is the temporary file folder")
	private String tmpF = "/tmp/easier-test";

	@Parameter(names = { "-oclTemplate",
			"--oclTemplateFolder" }, required = true, description = "It is the ocl rule template file")
	private String oclTemplate;

	@Parameter(names = { "-evlTemplate",
			"--evlTemplateFolder" }, required = true, description = "It is the evl template file")
	private String evlTemplate;

	@Parameter(names = { "-ava",
			"--availability" }, description = "Enables availability calculattion over pareto solutions")
	private boolean ava = false;

	@Parameter(names = { "-wr", "--workloadRange" }, description = "Enables workload rage")
	private int wr = -1;

	@Parameter(names = { "-algo", "--algorithm" }, required = true, description = "List of algorithms")
	private List<String> algorithms = new ArrayList<>();

	@Parameter(names = { "-qI", "--qualityIndicator" }, required = true, description = "List of quality indicators")
	private List<String> qI = new ArrayList<>();

	@Parameter(names = { "-rf", "--refereceFront" }, description = "The absolut path to the reference front file (.rf)")
	private List<String> referenceFront;

	@Parameter(names = { "--genRF" }, description = "It allows the generation of reference front by tsv files")
	private boolean generateRF = false;

	@Parameter(names = { "--worsen" }, description = "It enables the generation of worsen models")
	private boolean worsen = false;

	@Parameter(names = { "-mmp", "--metamodel-path" }, description = "It points to the metamodel file")
	private String metamodelPath;

	@Parameter(names = { "--maxWorseModels",
			"-mwm" }, description = "It describes the maximum number of worse models extracted from the csv file, linked by --models paramter")
	private String maxWorseModels;
	
	@Parameter(names = { "--uml2lqn" }, description = "It points to the folder of the UML-2-LQN project")
	private String uml2lqn;
	
	@Parameter(names = {"--objectives", "--objs"}, description = "Number of objectives" )
	private int objectives = 4;
	
	public int getObjectives() {
		return objectives;
	}

	public Path getUml2Lqn() {
		return Paths.get(uml2lqn);
	}

	public int getMaxWorseModels() {
		if (maxWorseModels == null) {
			maxWorseModels = "5";
			EasierLogger.logger_
					.warning("[WARNING] the max number of worse models has been set to default value --> 5");

		}
		return Integer.valueOf(maxWorseModels);
	}

	public Path getMetamodelPath() {
		return Paths.get(metamodelPath);
	}

	public List<Path> getReferenceFront() {
		List<Path> paths = new ArrayList<>();
		if (referenceFront == null)
			return null;
		for (String s : referenceFront)
			paths.add(Paths.get(s));
		return paths;
	}

	public boolean isWorsen() {
		return worsen;
	}

	public boolean generateRF() {
		return generateRF;
	}

	public List<String> getQualityIndicators() {
		return qI;
	}

	public List<String> getAlgorithms() {
		return algorithms;
	}

	public int getWorkloadRange() {
		return wr;
	}

	public boolean hasAvailability() {
		return ava;
	}

	public Path getOclTemplate() {
		return Paths.get(oclTemplate);
	}

	public synchronized Path getEVLTemplate() {
		return Paths.get(evlTemplate);
	}

	public Path getTmpFolder() {
		return Paths.get(tmpF);
	}

	public int getActions() {
		return actions;
	}

	public int getAllowedFailures() {
		return aw;
	}

	public List<Integer> getLength() {
		return length;
	}

	public double getXoverProbabiliy() {
		return xover;
	}

	public double getMutationProbability() {
		return mutation;
	}

	public int getPopulationSize() {
		return popSize;
	}

	public List<Integer> getMaxEvaluation() {
		return maxEval;
	}

	public Path getOutputFolder() {
		return Paths.get(outputFolder);
	}

	public int getIndependetRuns() {
		return independetRuns;
	}

	public double getConstChangesWeight() {
		return constChangesWeight;
	}

	public List<Double> getCloningWeight() {
		return cloningWeight;
	}

	public List<Integer> getMaxCloning() {
		return maxCloning;
	}

	public boolean getExperiment() {
		return experiment;
	}

	public boolean isSor() {
		return sor;
	}

	public List<Path> getModelsPath() {
		List<Path> paths = new ArrayList<>();
		modelsPath.forEach(m -> paths.add(Paths.get(m)));
		return paths;
	}

	public Path getSolver() {
		return Paths.get(solver);
	}

	public double getDistributionIndex() {
		return 0;
	}

}
