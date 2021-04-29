package it.univaq.disim.sealab.metaheuristic.evolutionary;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SourceModel {

	protected int numPAs = -1;

	protected Path sourceFolder;
	protected String extension;
	
	protected String name;

	public SourceModel(final Path srcF) {
		this.sourceFolder = srcF;
	}

	public Path getSourceFolder() {
		return sourceFolder;
	}

	public Path getModel() {
		return Paths.get(sourceFolder.toString(), name + extension);
	}
	
	public SourceModel setName(String n) {
		this.name = n;
		return this;
	}

	public String getFolderName() {
		return sourceFolder.getFileName().toString();
	}
	
	public void setExtension(String ext) {
		extension = ext;
	}
	
}
