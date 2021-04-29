package it.univaq.disim.sealab.epsilon.evl;

import java.nio.file.Path;
import java.util.ArrayList;

import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.evl.EvlModule;

import it.univaq.disim.sealab.epsilon.EpsilonStandalone;

public class EVLStandalone extends EpsilonStandalone {

	/*
	 * It retrieves the evl file from the resources and then copies it to the tmp
	 * folder
	 */
	public EVLStandalone() {
		module = new EvlModule();
		
		model = new ArrayList<>();
	}

	@Override
	public IEolModule createModule() {
		return new EvlModule();
	}

	public EpsilonStandalone setModel(Path mmaemiliaFilePath) {
		model.add(createEmfModel("aemilia", mmaemiliaFilePath, this.metamodelPath.toString(), true, true));
		return this;
	}

	@Override
	public void postProcess(Path destFilePath) {
	}

	/**
	 * 
	 * @param mmaemiliaFilePath
	 * @return
	 */
	public int getPAs(Path mmaemiliaFilePath, Path rulePath) {
		return getPAs();
	}
	
	public int getPAs() {
		try {
			execute();
		} catch (Exception e) {
			System.err.println("Error in Performance antipattern detection using the file " + model.toString());
			e.printStackTrace();
		}
		int pas = ((EvlModule) this.module).getContext().getUnsatisfiedConstraints().size();
		return pas;
	}

	@Override
	public void preProcess() {
	}
	
//	@Override
//	public void clearMemory() {
//		super.clearMemory();
//		((EvlModule)this.module).getPre().clear();
//		((EvlModule)this.module).getContext().dispose();
//	}
	
}
