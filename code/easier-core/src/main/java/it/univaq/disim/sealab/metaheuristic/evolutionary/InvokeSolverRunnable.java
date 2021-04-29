package it.univaq.disim.sealab.metaheuristic.evolutionary;

import java.io.IOException;

import org.uma.jmetal.problem.Problem;

public class InvokeSolverRunnable implements Runnable {

	private RSolution solution;

	public InvokeSolverRunnable(RSolution solution) {
		this.solution = solution;
	}

	@Override
	public void run() {
//		solution.executeRefactoring();
//		solution.applyTransformation();
		solution.invokeSolver();
	}
}
