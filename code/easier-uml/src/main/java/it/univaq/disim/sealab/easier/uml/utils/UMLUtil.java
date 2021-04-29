package it.univaq.disim.sealab.easier.uml.utils;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.papyrus.MARTE.MARTEPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.PAM.PAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.SAM.SAMPackage;
import org.eclipse.papyrus.MARTE.utils.MarteResource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.profile.standard.StandardPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

public class UMLUtil {

	private ResourceSet resourceSet;
	private Map<URI, URI> uriMap;

	public UMLUtil() {
		resourceSet = new ResourceSetImpl();
		uriMap = resourceSet.getURIConverter().getURIMap();
		UMLResourcesUtil.init(resourceSet);
	}

	public UMLUtil packageRegistering() throws URISyntaxException {

		// UMLPackage.eINSTANCE.eClass();
		// EcorePackage.eINSTANCE.eClass();
		// Ecore2XMLPackage.eINSTANCE.eClass();
		// MARTEPackage.eINSTANCE.eClass();
		// GQAMPackage.eINSTANCE.eClass();
		// SAMPackage.eINSTANCE.eClass();
		// PAMPackage.eINSTANCE.eClass();

		initLocalRegistry();
//		initGlobalRegistry();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);

//		URI uri = URI.createURI("jar:file:/Users/peo12/workspaces/pakimor-unique/easier-uml/src/main/resources/libs/org.eclipse.uml2.uml.resources_5.5.0.v20181203-1331.jar!/");
//		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
//		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
//		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));
		
		/*
		 * It is needed to link the MARTE jar plugin to the system. It is requested in case of a standalone application
		 */
		String marteJarString = "jar:" + getClass()
				.getResource("/libs/org.eclipse.papyrus.marte.static.profile_1.2.0.201803031506.jar").toString() + "!/";

		URI marteJar = URI.createURI(marteJarString);
		uriMap.put(URI.createURI("pathmap://Papyrus_PROFILES/"), marteJar.appendSegment("resources").appendSegment(""));

		/*
		 * Must add the pathmap of the Parent package to the UMLPlugin' getEPackageNsURIToProfileLocationMap()
		 * The AnalysisModel package has been added as follows
		 */
		String PROFILES_PATHMAP = "pathmap://Papyrus_PROFILES/"; //$NON-NLS-1$
		// FROM model.uml #_4bV20APMEdyuUt-4qHuVvQ 
		// MARTE FROM MARTE.profile.uml #_zaC5cAPHEdyeNfbOYuD9pg 
		// GQAM FROM MARTE.profile.uml #_4bV20APMEdyuUt-4qHuVvQ 
		// MARTE_AnlysisModel FROM MARTE.profile.uml #_u8y4wAPMEdyuUt-4qHuVvQ
		String MARTE_PROFILE_URI = PROFILES_PATHMAP + "MARTE.profile.uml#_u8y4wAPMEdyuUt-4qHuVvQ";
		URI marteProfileURI = URI.createURI(MARTE_PROFILE_URI);
		UMLPlugin.getEPackageNsURIToProfileLocationMap().put(MARTEPackage.eNS_URI, marteProfileURI);

		return this;
	}

	public void initLocalRegistry() {
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(MARTEPackage.eNS_URI, MARTEPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GQAMPackage.eNS_URI, GQAMPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(SAMPackage.eNS_URI, SAMPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(PAMPackage.eNS_URI, PAMPackage.eINSTANCE);
	}

//	public void initGlobalRegistry() {
//		EPackage.Registry.INSTANCE.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(Ecore2XMLPackage.eNS_URI, Ecore2XMLPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(MARTEPackage.eNS_URI, MARTEPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(GQAMPackage.eNS_URI, GQAMPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(SAMPackage.eNS_URI, SAMPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(PAMPackage.eNS_URI, PAMPackage.eINSTANCE);
//
//	}

	public Model loadUMLModel(Path pathToModel) {

		Resource resource = resourceSet.getResource(URI.createURI(pathToModel.toString()), true);
		Model m = (Model) EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.Literals.MODEL);

		if (m == null) {
			System.err.println("Model: load failed!");
			System.exit(1);
		}
		return m;
	}

	public static void main(String[] args) throws URISyntaxException {

		UMLUtil umlUtil = new UMLUtil();
		Path pathToModel = Paths.get(umlUtil.getClass().getResource("/models/model.uml").toURI());
		Model m = umlUtil.packageRegistering().loadUMLModel(pathToModel);

		System.out.println(m.getOwnedElements().get(1).getAppliedStereotypes());

	}
}
