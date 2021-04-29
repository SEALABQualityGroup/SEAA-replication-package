package it.univaq.sealab.umlreliability;

import java.util.List;

import it.univaq.sealab.umlreliability.elements.Component;
import it.univaq.sealab.umlreliability.elements.Link;
import it.univaq.sealab.umlreliability.elements.Scenario;

public class Reliability {

	private List<Scenario> scenarios;
	
	public Reliability(final List<Scenario> scenarios) {
		this.scenarios = scenarios;
	}
	
	public double compute() {
		double firstTerm = 1;
		
		for (Scenario scenario : scenarios) {
			
			double secondTerm = 1;
			double thirdTerm = 1;
			
			for (Component component : scenario.getComponents()) {
				secondTerm *= Math.pow(1 - component.getFailureProb(),
						component.getInvocations().getOrDefault(scenario, 0));
			}
			for (Link link : scenario.getLinks()) {
				thirdTerm *= Math.pow(1 - link.getFailureProb(),
						link.getMsgSize().getOrDefault(scenario, 0.0));
			}
			
			firstTerm -= scenario.getProbability() * (secondTerm * thirdTerm);
		}
		
		
		return firstTerm;
	}
}
