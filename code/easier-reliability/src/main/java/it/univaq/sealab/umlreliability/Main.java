package it.univaq.sealab.umlreliability;

import it.univaq.sealab.umlreliability.model.UMLModelPapyrus;

public class Main {
	
	public static void main(String[] args) throws MissingTagException {
		
		final UMLReliability uml = new UMLReliability(new UMLModelPapyrus(args[0]).getModel());
		final Reliability reliability = new Reliability(uml.getScenarios()); 
		
		System.out.println(reliability.compute());
	}
}
