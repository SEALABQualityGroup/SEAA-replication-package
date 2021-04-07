package it.univaq.disim.sealab.epsilon.eol;

import java.nio.file.Path;
import java.util.ArrayList;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

import it.univaq.disim.sealab.epsilon.EpsilonStandalone;

public class EOLStandalone extends EpsilonStandalone {

	public EOLStandalone() {
		module = createModule();
		model = new ArrayList<>();
	}

	@Override
	public IEolModule createModule() {
		return new EolModule();
	}

	@Override
	public Path getSource() {
		return source;
	}

	@Override
	public void postProcess(Path destFilePath) {
	}

	public Object getTarget() {

		return module.getContext().getFrameStack().get("target").getValue();

	}

	@Override
	public void preProcess() {
	}

	public void execute() throws EolRuntimeException {
		super.doExecute();
	}
	
	public void disposeModelRepository() {
		module.getContext().getModelRepository().dispose();
	}

}
