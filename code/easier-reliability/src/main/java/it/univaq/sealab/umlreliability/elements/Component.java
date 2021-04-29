package it.univaq.sealab.umlreliability.elements;

import java.util.HashMap;
import java.util.Map;

public class Component {

	private org.eclipse.uml2.uml.Component element;
	private double failureProb;
	private Map<Scenario,Integer> invocations = new HashMap<>();
	
	public Component(final org.eclipse.uml2.uml.Component element) {
		this.element = element;
	}

	public org.eclipse.uml2.uml.Component getElement() {
		return element;
	}

	public void setElement(org.eclipse.uml2.uml.Component element) {
		this.element = element;
	}

	public double getFailureProb() {
		return failureProb;
	}

	public void setFailureProb(double failureProb) {
		this.failureProb = failureProb;
	}

	public Map<Scenario, Integer> getInvocations() {
		return invocations;
	}

	public void setInvocations(Map<Scenario, Integer> invocations) {
		this.invocations = invocations;
	}
}
