//package it.univaq.disim.sealab.epsilon;
//
//import java.net.URISyntaxException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import org.eclipse.epsilon.eol.IEolModule;
//import org.eclipse.epsilon.eol.models.IModel;
//import org.junit.Before;
//import org.junit.Test;
//
//import it.univaq.disim.sealab.epsilon.egl.EGLStandalone;
//
//public class EpsilonStandaloneTest {
//
//	private Path mmaemiliaFilePath;
//	private final int MAX_THREADS = 64;
//	
//	@Before
//	public void init() throws URISyntaxException {
//		mmaemiliaFilePath = Paths.get(getClass().getResource("/mm/mmAEmilia.ecore").toURI());
//	}
//	
//	
//	@Test
//	public void createEmfModelTestMultiThread() throws Exception {
//		Path destFilePath; 
//		for(int i = 0; i < MAX_THREADS ; i++) {
//			destFilePath = Files.createTempFile("thread-" + String.valueOf(i), "");
//			
//			new EGLStandalone().setMetamodelPath(mmaemiliaFilePath).setModel(destFilePath).execute(destFilePath);
//		}
//	}
//	
//}
