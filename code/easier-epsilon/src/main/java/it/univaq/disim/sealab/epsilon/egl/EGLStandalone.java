package it.univaq.disim.sealab.epsilon.egl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;

import it.univaq.disim.sealab.epsilon.EpsilonHelper;
import it.univaq.disim.sealab.epsilon.EpsilonStandalone;
import it.univaq.disim.sealab.epsilon.utility.Utility;

public class EGLStandalone extends EpsilonStandalone{

//	public static void main(String[] args) throws Exception {
//		new EGLStandalone().execute();
//	}
	
	public EGLStandalone() {
		module = createModule();
		model = new ArrayList<>();
	}
	
	
	@Override
	public IEolModule createModule() {
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}
	
//	public IModel getModel(Path mmaemiliaFilePath, Path metamodelPath) throws Exception {
//		this.metamodelPath = metamodelPath;
//		return getModel(mmaemiliaFilePath);
//	}

//	@Override
////	public IModel getModel(Path mmaemiliaFilePath) throws Exception {
//	public IModel getModel() {
////		return createEmfModel("aemilia", mmaemiliaFilePath, this.metamodelPath.toString(), true, true);
//		return model;
//	}
	
	public EpsilonStandalone setModel(Path modelPath) {
		model.add(createEmfModel("aemilia", modelPath, this.metamodelPath.toString(), true, true));
		return this;
	}

	@Override
	public Path getSource() {
		if(Files.exists(Paths.get("/tmp/rule_egl")))
			source = Paths.get("/tmp/rule_egl");
		if (source == null) {
			InputStream ruleIn = EpsilonHelper.class.getClassLoader().getResourceAsStream("egl/mmaemilia2aem.egl");
//			rulePath = Files.createTempFile("", "");
			source = Paths.get("/tmp/rule_egl");
			try {
				Files.copy(ruleIn, source);
			} catch (IOException e) {
				System.err.println("[ERROR] the getSource of the EGL engine has thrown an IOExection while copy files!");
				e.printStackTrace();
			}
		}
		return source;
//		return "egl/mmaemilia2aem.egl";
	}

	@Override
	public void postProcess(Path destFilePath) {
		String text = (String) result;
		Utility.saveStringToFile(text, destFilePath);
	}

	@Override
	public void preProcess() {
		// TODO Auto-generated method stub
	}
}
