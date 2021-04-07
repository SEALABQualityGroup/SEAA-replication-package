package it.univaq.sealab.umlreliability.model;

import java.io.File;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Alloc.AllocPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.CoreElements.CoreElementsPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.NFPs.NFPsPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimePackage;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.DAM.DAMPackage;
import com.masdes.dam.Maintenance.MaintenancePackage;
import com.masdes.dam.Threats.ThreatsPackage;

public class UMLModelPapyrus {
	
	private static final Logger LOGGER = Logger.getLogger(UMLModelPapyrus.class.getName());
	               
	// MARTE       
	private static final String MARTE_BASE_PATHMAP = "pathmap://Papyrus_PROFILES/";
	private static final String MARTE_PROFILE = "MARTE.profile.uml#";
	private static final String MARTE_NFP_FRAGMENT = "_U_GAoAPMEdyuUt-4qHuVvQ";
	private static final String MARTE_TIME_FRAGMENT = "_WStkoAPMEdyuUt-4qHuVvQ";
	private static final String MARTE_GRM_FRAGMENT = "_XVWGUAPMEdyuUt-4qHuVv";
	private static final String MARTE_ALLOC_FRAGMENT = "_ar8OsAPMEdyuUt-4qHuVvQ";
	private static final String MARTE_CORE_ELEMENTS_FRAGMENT = "_-wEewECLEd6UTJZnztgOLw";
	private static final String MARTE_GQAM_FRAGMENT = "_4bV20APMEdyuUt-4qHuVvQ";
	               
	// DAM         
	private static final String DAM_BASE_PATHMAP = "pathmap://DAM_PROFILES/";
	private static final String DAM_PROFILE = "DAM.profile.uml#";
	private static final String DAM_PROFILE_FRAGMENT = "_dYZGQOI-EeKRk-i8_Z91aQ";
	private static final String DAM_CORE_FRAGMENT = "_DchGAOSiEeKuSu-I2xDxSA";
	private static final String DAM_THREATS_FRAGMENT = "_G1-xoOShEeKuSu-I2xDxSA";
	private static final String DAM_MAINTENANCE_FRAGMENT = "_rsXqkOShEeKuSu-I2xDxSA";

	private Model model;
	private ResourceSet resourceSet;
	
	public UMLModelPapyrus(final String modelPath) {
		if (!new File(modelPath).exists()) {
			LOGGER.severe(String.format("File '%s' does not exist.", modelPath));
		}
		
		init();
		model = loadModel(modelPath);
	}
	
	public Model getModel() {
		return model;
	}
	
	public ResourceSet getResourceSet() {
		return resourceSet;
	}
	
	private void init() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		UMLResourcesUtil.init(resourceSet);
		
		initMARTE();
		initDAM();
	}
	
	private void initMARTE() {
		final URI marteURI = URI.createURI(getClass().getResource("/umlprofiles").toString());
		resourceSet.getURIConverter().getURIMap().put(URI.createURI(MARTE_BASE_PATHMAP),
				marteURI.appendSegment(""));
		final String MARTE_PROFILES_PATHMAP = MARTE_BASE_PATHMAP + MARTE_PROFILE;
		
		// NFP
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(NFPsPackage.eNS_URI, URI.createURI(MARTE_PROFILES_PATHMAP + MARTE_NFP_FRAGMENT));
		resourceSet.getPackageRegistry().put(NFPsPackage.eNS_URI, NFPsPackage.eINSTANCE);
		
		// TIME
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(TimePackage.eNS_URI, URI.createURI(MARTE_PROFILES_PATHMAP + MARTE_TIME_FRAGMENT));
		resourceSet.getPackageRegistry().put(TimePackage.eNS_URI, TimePackage.eINSTANCE);
		
		// GRM
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(GRMPackage.eNS_URI, URI.createURI(MARTE_PROFILES_PATHMAP + MARTE_GRM_FRAGMENT));
		resourceSet.getPackageRegistry().put(GRMPackage.eNS_URI, GRMPackage.eINSTANCE);
		
		// Alloc		
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(AllocPackage.eNS_URI, URI.createURI(MARTE_PROFILES_PATHMAP + MARTE_ALLOC_FRAGMENT));
		resourceSet.getPackageRegistry().put(AllocPackage.eNS_URI, AllocPackage.eINSTANCE);
		
		// Core_Elements
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(CoreElementsPackage.eNS_URI, URI.createURI(MARTE_PROFILES_PATHMAP + MARTE_CORE_ELEMENTS_FRAGMENT));
		resourceSet.getPackageRegistry().put(CoreElementsPackage.eNS_URI, CoreElementsPackage.eINSTANCE);
		
		// GQAM
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(GQAMPackage.eNS_URI, URI.createURI(MARTE_PROFILES_PATHMAP + MARTE_GQAM_FRAGMENT));
		resourceSet.getPackageRegistry().put(GQAMPackage.eNS_URI, GQAMPackage.eINSTANCE);
	}
	
	private void initDAM() {
		final URI damURI = URI.createURI(getClass().getResource("/umlprofiles").toString());
		resourceSet.getURIConverter().getURIMap().put(URI.createURI(DAM_BASE_PATHMAP),
				damURI.appendSegment(""));
		final String DAM_PROFILES_PATHMAP = DAM_BASE_PATHMAP + DAM_PROFILE;
		
		// DAM_Profile
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(DAMPackage.eNS_URI, URI.createURI(DAM_PROFILES_PATHMAP + DAM_PROFILE_FRAGMENT));
		resourceSet.getPackageRegistry().put(DAMPackage.eNS_URI, DAMPackage.eINSTANCE);
		
		// Core
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(CorePackage.eNS_URI, URI.createURI(DAM_PROFILES_PATHMAP + DAM_CORE_FRAGMENT));
		resourceSet.getPackageRegistry().put(CorePackage.eNS_URI, CorePackage.eINSTANCE);
		
		// Threats
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(ThreatsPackage.eNS_URI, URI.createURI(DAM_PROFILES_PATHMAP + DAM_THREATS_FRAGMENT));
		resourceSet.getPackageRegistry().put(ThreatsPackage.eNS_URI, ThreatsPackage.eINSTANCE);
		
		// Maintenance
		UMLPlugin.getEPackageNsURIToProfileLocationMap()
			.put(MaintenancePackage.eNS_URI, URI.createURI(DAM_PROFILES_PATHMAP + DAM_MAINTENANCE_FRAGMENT));
		resourceSet.getPackageRegistry().put(MaintenancePackage.eNS_URI, MaintenancePackage.eINSTANCE);
	}
	
	private Model loadModel(final String modelPath) {
		final Resource model = resourceSet.getResource(URI.createURI(modelPath), true);
		if (model == null) {
			LOGGER.severe(String.format("Cannot load resource: '%s'.", modelPath));
			return null;
		}
		
		return (Model) model.getContents().get(0);
	}
}
