package it.univaq.sealab.umlreliability.elements;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.uml2.uml.UseCase;

public class Scenario {

	private UseCase element;
	private double probability;
	private Set<Component> components = new HashSet<>();
	private Set<Link> links = new HashSet<>();
	
	public Scenario(final UseCase element) {
		this.element = element;
	}

	public UseCase getElement() {
		return element;
	}

	public void setElement(UseCase element) {
		this.element = element;
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}

	public Set<Component> getComponents() {
		return components;
	}

	public void setComponents(Set<Component> components) {
		this.components = components;
	}

	public Set<Link> getLinks() {
		return links;
	}

	public void setLinks(Set<Link> links) {
		this.links = links;
	}
}
