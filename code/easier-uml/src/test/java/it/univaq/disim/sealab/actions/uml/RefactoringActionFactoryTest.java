package it.univaq.disim.sealab.actions.uml;

import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.univaq.disim.sealab.metaheuristic.actions.uml.RefactoringActionFactory;
import it.univaq.disim.sealab.metaheuristic.evolutionary.RSolution;
import it.univaq.disim.sealab.metaheuristic.evolutionary.UMLRProblem;
import it.univaq.disim.sealab.metaheuristic.evolutionary.UMLRSolution;

public class RefactoringActionFactoryTest {

	UMLRSolution sol;
	
	@Before
	public void init() {
		
		UMLRProblem<RSolution> p = new UMLRProblem<>(Paths.get("/tmp"), 4, 4, 10, 4);
		sol = (UMLRSolution) p.createSolution();
	}
	
	@Test
	public void getRandomActionTest() {
		
		
		Assert.assertNotNull(RefactoringActionFactory.getRandomAction(sol));
		
	}
	
}
