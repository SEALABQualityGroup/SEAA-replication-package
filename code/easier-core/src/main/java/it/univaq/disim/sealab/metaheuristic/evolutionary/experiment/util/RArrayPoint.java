package it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.util;

import org.uma.jmetal.util.point.impl.ArrayPoint;

public class RArrayPoint extends ArrayPoint {
	
	private int ID;
	
	public RArrayPoint(int numberOfObjectives) {
		super(numberOfObjectives);
	}
	
	public RArrayPoint setID(final int id) {
		this.ID = id;
		return this;
	}
}
