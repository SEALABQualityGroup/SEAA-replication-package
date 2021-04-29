package it.univaq.sealab.umlreliability.elements;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.uml2.uml.CommunicationPath;

public class Link {

	private CommunicationPath element;
	private double failureProb;
	private Map<Scenario,Double> msgSize = new HashMap<>();
	
	public Link(CommunicationPath element) {
		this.element = element;
	}

	public CommunicationPath getElement() {
		return element;
	}

	public void setElement(CommunicationPath element) {
		this.element = element;
	}

	public double getFailureProb() {
		return failureProb;
	}

	public void setFailureProb(double failureProb) {
		this.failureProb = failureProb;
	}

	public Map<Scenario,Double> getMsgSize() {
		return msgSize;
	}

	public void setMsgSize(Map<Scenario,Double> msgSize) {
		this.msgSize = msgSize;
	}
}
