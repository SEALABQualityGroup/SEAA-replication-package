package it.univaq.disim.sealab.metaheuristic.evolutionary.experiment.util;

import java.util.List;

import org.uma.jmetal.util.point.util.PointSolution;

public class RPointSolution extends PointSolution {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int ID;

	private static boolean worsen;

	public RPointSolution(int numberOfObjectives) {
		super(numberOfObjectives);
	}

	public RPointSolution() {
		super(4);
	}

	public RPointSolution setID(int id) {
		this.ID = id;
		return this;
	}

	public RPointSolution setPointSolution(final List<String> obj) {

		for (int i = 0; i < obj.size(); i++) {
//			if (i==0 !worsen) 
//				super.setObjective(i, (-1 * Double.parseDouble(obj.get(i))));
//			else
				super.setObjective(i, Double.parseDouble(obj.get(i)));
		}

		return this;
	}

	public int getID() {
		return ID;
	}

	public static void setWorsen(boolean w) {
		worsen = w;
	}

	public static boolean isWorsen() {
		return worsen;
	}
}
