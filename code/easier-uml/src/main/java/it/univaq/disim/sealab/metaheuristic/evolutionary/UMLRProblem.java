package it.univaq.disim.sealab.metaheuristic.evolutionary;

import java.nio.file.Path;

import it.univaq.disim.sealab.metaheuristic.utils.EasierLogger;

public class UMLRProblem<S extends RSolution> extends RProblem<S> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UMLRProblem(Path srcFolderPath, int desired_length, int length, int allowedFailures, int populationSize) {
		super(srcFolderPath.getParent(), srcFolderPath, desired_length, length,
				allowedFailures, populationSize);
	}

	public UMLRProblem(SourceModel srcModel, int desired_length, int length, int allowedFailures, int populationSize) {
		super(srcModel.getSourceFolder(), srcModel.getModel(), desired_length, length, allowedFailures, populationSize);

	}
	
	@Override
	public S createSolution() {
		return (S) new UMLRSolution(this);
	}

	public Path getSourceModelPath() {
		return sourceModelPath;
	}

	@Override
	/**
	 * The third objective is related to performance evaluation. In this case
	 * 2towers solver is invoked in order to solve the refactoring model. Actually,
	 * the number of Performance Antipatterns (PAs) in the model has been used as
	 * objective for the fitness function.
	 * 
	 */
	public void evaluate(S s) {

		UMLRSolution solution = (UMLRSolution) s;

		for (int i = 0; i < this.getNumberOfObjectives(); i++) {
			if (i == FIRST_OBJ) {
				final double quality = solution.getPerfQ();
				EasierLogger.logger_.info("SOLUTION #" + solution.getName() + ": Total number of perfQ --> " + quality);
				solution.setObjective(i, (-1 * quality)); //to be maximized
			} else if (i == SECOND_OBJ) {
				final double numOfChanges = solution.getNumOfChanges();
				EasierLogger.logger_
						.info("SOLUTION #" + solution.getName() + ": Total number of #changes --> " + numOfChanges);
				solution.setObjective(i, numOfChanges);
			} 
			else if (i == THIRD_OBJ) {
				final int pas = solution.getPAs();
				EasierLogger.logger_.info("SOLUTION #" + solution.getName() + ": Total number of PAs --> " + pas);
				solution.setObjective(i, pas);
			} 
			else if (i == FOURTH_OBJ) {
				final double reliability = solution.getReliability();
				EasierLogger.logger_.info("SOLUTION #" + solution.getName() + ": Total reliability --> " + reliability);
				solution.setObjective(i, (-1 * reliability));//to be maximized
			} else {
				System.out.println("\n" + i);
				throw new RuntimeException("unexpected behaviour!!!");
			}
		}
	}
}
