package it.univaq.disim.sealab.epsilon.etl;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.etl.EtlModule;

import it.univaq.disim.sealab.epsilon.EpsilonStandalone;

public class ETLStandalone extends EpsilonStandalone {

	final static String lqnMetamodel = "/home/peo/git/sealab/uml2lqn/org.univaq.uml2lqn/lqnxsd/lqn_renamed.xsd.ecore";

	public ETLStandalone() {
		source = Paths.get("/home/peo/git/sealab/uml2lqn/org.univaq.uml2lqn", "uml2lqn.etl");
		module = new EtlModule();
		model = new ArrayList<>();
	}

	public ETLStandalone(Path dest) {
		this();
	}

	@Override
	public IEolModule createModule() {
		return new EtlModule();
	}

	@Override
	public void postProcess(Path destFilePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void preProcess() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void clearMemory() {
		super.clearMemory();
		((EtlModule)this.module).getTransformationRules().clear();
	}


}
