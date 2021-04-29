package it.univaq.disim.sealab.metaheuristic.evolutionary;

import java.nio.file.Paths;
import java.rmi.UnexpectedException;
import java.util.concurrent.TimeUnit;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.junit.After;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

public class UMLRSolutionTest {

	
	private UMLRSolution solution;
	private String modelpath;
	
	 private static void logInfo(Description description, String status, long nanos) {
         String testName = description.getMethodName();
         System.out.println(String.format("Test %s %s, spent %d %s",
                                   testName, status, TimeUnit.NANOSECONDS.toMillis(nanos), TimeUnit.MILLISECONDS.toString() ));
     }
	
	
    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void succeeded(long nanos, Description description) {
            logInfo(description, "succeeded", nanos);
        }

        @Override
        protected void failed(long nanos, Throwable e, Description description) {
            logInfo(description, "failed", nanos);
        }

        @Override
        protected void skipped(long nanos, AssumptionViolatedException e, Description description) {
            logInfo(description, "skipped", nanos);
        }

        @Override
        protected void finished(long nanos, Description description) {
            logInfo(description, "finished", nanos);
        }
    };
	
	
	@Before
	public void setUp() {
		int allowedFailures = 100;
		int desired_length = 4;
		int populationSize = 4;
		int number_of_action = 5;
		
		//String modelpath = getClass().getResource("/models/model/automatedGuidedVehicle.uml").getFile();
		modelpath = "/home/peo/git/sealab/easier/easier-uml2lqnCaseStudy/train-ticket/train-ticket.uml";
		UMLRProblem<RSolution> p = new UMLRProblem<>(Paths.get(modelpath), desired_length, number_of_action, allowedFailures, populationSize);
		solution = (UMLRSolution) p.createSolution();
	}
	
	
	@Test
	public void coutingPAs() {
		solution.countingPAs();
		System.out.printf("# of Perf Antipatter %d of model %s",solution.getPAs(), modelpath);
	}
	
	@Test
	public void createRandomRefactoring() {
		solution.createRandomRefactoring();
	}
	
	@Test
	public void tryRandomPush() throws UnexpectedException, EolRuntimeException {
		solution.tryRandomPush();
	}
	
	@Test
	public void evaluatePerformance() {
		solution.evaluatePerformance();
	}
	
	@Test
	public void computeReliability() {
		solution.computeReliability();
		System.out.printf("Reliability %f of model %s",solution.getReliability(), modelpath);
	}
	
	
	@After
	public void tearDown() {
		solution = null;
	}

}
