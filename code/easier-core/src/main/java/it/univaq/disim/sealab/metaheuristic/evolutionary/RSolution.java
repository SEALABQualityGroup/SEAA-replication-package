package it.univaq.disim.sealab.metaheuristic.evolutionary;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.uma.jmetal.solution.impl.AbstractGenericSolution;

import it.univaq.disim.sealab.metaheuristic.actions.Refactoring;
import it.univaq.disim.sealab.metaheuristic.actions.RefactoringAction;

public abstract class RSolution extends AbstractGenericSolution<Refactoring, RProblem<?>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected Path modelPath;
	
	protected boolean refactored;
	protected boolean crossovered;
	protected boolean mutated;
	
	protected static int SOLUTION_COUNTER = 0;
	
	protected int name;
	
	protected double perfQ;
	protected int numPAs;
	protected double reliability;
	public static final int VARIABLE_INDEX;
	
	protected RSolution[] parents;
	
	public static int MutationCounter = 0;
	public static int XOverCounter = 0;
	
	
	static {
		VARIABLE_INDEX = 0;
	}

	protected RSolution(RProblem<?> problem) {
		super(problem);
		crossovered = false;
		mutated = false;
		refactored = false;
	}

	public RProblem<?> getProblem(){
		return problem;
	}

	public abstract void countingPAs();

	public abstract double evaluatePerformance();

	public abstract void executeRefactoring();

	public abstract void applyTransformation();
	public abstract void computeReliability();

	public abstract boolean alter(int i);

	public abstract void invokeSolver();
	public abstract boolean isFeasible(Refactoring ref);
	
	public abstract void freeMemory();

	public RefactoringAction getActionAt(int index) {
		return getVariableValue(VARIABLE_INDEX).getActions().get(index);
	}

	public Path getModelPath() {
		return modelPath;
	}
	
	public double getReliability() {
		return reliability;
	}
	
	public void setRefactored() {
		this.refactored = true;
	}
	
	public boolean isRefactored() {
		return refactored;
	}
	
	public void setCrossovered() {
		this.crossovered = true;
		XOverCounter++;
	}

	public void setMutated() {
		this.mutated = true;
		MutationCounter++;
	}
	
	public boolean isMutated() {
		return mutated;
	}

	public boolean isCrossovered() {
		return crossovered;
	}
	
	public double getPerfQ() {
		return perfQ;
	}

	public void setPerfQ(float perfQ) {
		this.perfQ = perfQ;
	}

	public double getNumOfChanges() {
		double changes = 0.0;
		Refactoring r = this.getVariableValue(0);
		for (RefactoringAction action : r.getActions()) {
			changes += action.getNumOfChanges();
		}
		return changes;
	}
	
	public int getPAs() {
		return numPAs;
	}
	
	public int getName() {
		return name;
	}

	public static synchronized int getCounter() {
		return SOLUTION_COUNTER++;
	}

	public void setName() {
		this.name = getCounter();
	}
	
	protected void resetParents() {
		if (this.parents != null) {
			this.parents[0] = null;
			this.parents[1] = null;
		}
	}
	
	public RSolution[] getParents() {
		return parents;
	}
	
	public void setParents(RSolution parent1, RSolution parent2) {
		this.parents[0] = parent1;
		this.parents[1] = parent2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (crossovered ? 1231 : 1237);
		result = prime * result + ((modelPath == null) ? 0 : modelPath.hashCode());
		result = prime * result + (mutated ? 1231 : 1237);
		result = prime * result + name;
		result = prime * result + numPAs;
		result = prime * result + Arrays.hashCode(parents);
		long temp;
		temp = Double.doubleToLongBits(perfQ);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (refactored ? 1231 : 1237);
		result = prime * result + ((getVariableValue(VARIABLE_INDEX) == null) ? 0 : getVariableValue(VARIABLE_INDEX).hashCode());
		temp = Double.doubleToLongBits(reliability);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RSolution other = (RSolution) obj;
		if (crossovered != other.crossovered)
			return false;
		if (modelPath == null) {
			if (other.modelPath != null)
				return false;
		} else if (!modelPath.equals(other.modelPath))
			return false;
		if (mutated != other.mutated)
			return false;
		if (name != other.name)
			return false;
		if (numPAs != other.numPAs)
			return false;
		if (!Arrays.equals(parents, other.parents))
			return false;
		if (Double.doubleToLongBits(perfQ) != Double.doubleToLongBits(other.perfQ))
			return false;
		if (refactored != other.refactored)
			return false;
		if (getVariableValue(VARIABLE_INDEX) == null) {
			if (other.getVariableValue(VARIABLE_INDEX) != null)
				return false;
		} else if (!getVariableValue(VARIABLE_INDEX).equals(other.getVariableValue(VARIABLE_INDEX)))
			return false;
		if (Double.doubleToLongBits(reliability) != Double.doubleToLongBits(other.reliability))
			return false;
		return true;
	}
	
	
}
