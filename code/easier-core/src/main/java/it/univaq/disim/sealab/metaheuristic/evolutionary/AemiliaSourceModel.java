package it.univaq.disim.sealab.metaheuristic.evolutionary;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import metamodel.mmaemilia.ArchitecturalInteraction;

public class AemiliaSourceModel extends SourceModel{

	private Map<String, List<ArchitecturalInteraction>> sourceModelPAs = new HashMap<>();

	public AemiliaSourceModel(final Path srcF) {
		super(srcF);
		this.extension = ".mmaemilia";
	}
	
	public Path getAem() {
		return Paths.get(sourceFolder.toString(), "model.aem");
	}

	public Path getRew() {
		return Paths.get(sourceFolder.toString(), "model.rew");
	}

	public int getNumberOfPerfAp() {
		if(numPAs == -1) {
			numPAs = 0;
			for (String key : sourceModelPAs.keySet()) {
				numPAs += sourceModelPAs.get(key).size();
			}
		}
		return numPAs;
	}

	public void setNumberOfPerfAp(int _numPAs) {
		this.numPAs = _numPAs;
	}

	public Map<String, List<ArchitecturalInteraction>> getSourceModelPAs() {
		return sourceModelPAs;
	}

	public void setSourceModelPAs(Map<String, List<ArchitecturalInteraction>> sourceModelPAs) {
		this.sourceModelPAs = sourceModelPAs;
	}
	

}
