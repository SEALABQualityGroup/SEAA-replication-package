package it.univaq.disim.sealab.epsilon;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import it.univaq.disim.sealab.epsilon.egl.EGLStandalone;
import it.univaq.disim.sealab.epsilon.evl.EVLStandalone;

public class EpsilonHelper {

	/**
	 * 
	 * @param mmaemiliaFilePath
	 * @param destFilePath
	 * @param ruleFilePath
	 */
	public static synchronized void generateAemFile(Path mmaemiliaFilePath, Path destFilePath) {

		try {
			// TODO NPE
//			final String easierEpsilonProject = Paths
//					.get(EpsilonHelper.class.getClassLoader().getResource("/").getFile(),
//							"../../../easier-epsilon/target/classes/")
//					.toString();

			EGLStandalone eglModule = new EGLStandalone();
			eglModule.setMetamodelPath(Paths.get("/tmp/mmAemlia.ecore"));
			eglModule.setModel(mmaemiliaFilePath);
			eglModule.execute(destFilePath);
			

		} catch (Exception e) {
			System.err.println("mmaemiliaFilePath  --> " + mmaemiliaFilePath);
			System.err.println("destFilePath  --> " + destFilePath);
			System.err.println("GetResource getFile NULL");
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param mmaemiliaFilePath
	 * @param ruleFilePath
	 * @return
	 */
	public static int aemiliaPasChecker(Path mmaemiliaFilePath, Path ruleFilePath) {
		 EVLStandalone module = new EVLStandalone();
		 try {
			module.setMetamodelPath(Paths.get("/tmp/mmAemilia.ecore"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 module.setModel(mmaemiliaFilePath);
		 module.setSource(ruleFilePath);
		 
		 return module.getPAs(null, null);
	}

}
