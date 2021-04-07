package it.univaq.disim.sealab.metaheuristic.evolutionary.operator;

import java.io.Serializable;


public interface RepairRSolution extends Serializable {
  /**
   * Checks if a given value is between its bounds and repairs it otherwise
   * @param value The value to be checked
   * @param lowerBound
   * @param upperBound
   * @return The same value if it is between the limits or a repaired value otherwise
   */
  public double repairSolutionVariableValue(double value, double lowerBound, double upperBound) ;
}