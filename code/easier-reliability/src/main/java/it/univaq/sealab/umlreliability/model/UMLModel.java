package it.univaq.sealab.umlreliability.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UMLPlugin;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UMLModel {
	
	private static final Logger LOGGER = Logger.getLogger(UMLModel.class.getName());
	
	private Model model;
	private ResourceSet resourceSet;
	
	UMLModel(final String modelPath) {

		if (!new File(modelPath).exists()) {
			LOGGER.severe(String.format("File '%s' does not exist.", modelPath));
		}
		
		init();
		registerProfiles(getProfileApplications(modelPath));
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
	}
	
	private void registerProfiles(final List<String> profileApplications) {
		profileApplications.forEach(pa -> {
			final List<EPackage> pkgs = getProfilePackages(pa.substring(0, pa.indexOf('#')));
			if (pkgs != null) {
				getProfilePackages(pa.substring(0, pa.indexOf('#'))).forEach(p -> {
					resourceSet.getPackageRegistry().put(p.getNsURI(), p);
					UMLPlugin.getEPackageNsURIToProfileLocationMap().put(p.getNsURI(), URI.createURI(pa));
				});
			}
		});
	}
	
	private List<String> getProfileApplications(final String modelPath) {
		final String basePath = modelPath.substring(0, modelPath.lastIndexOf('/') + 1);		
		final List<String> profileApplications = new ArrayList<>();
		try {
			final Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(modelPath));
			final NodeList pas = doc.getElementsByTagName("profileApplication");
			for (int i = 0; i < pas.getLength(); i++) {
				final NodeList children = pas.item(i).getChildNodes();
				for (int j = 0; j < children.getLength(); j++) {
					final Node n = children.item(j);
					if (n.getNodeName().equals("appliedProfile")) {
						profileApplications.add(basePath + n.getAttributes().getNamedItem("href").getNodeValue());
					}
				}
			}
		} catch (SAXException | IOException | ParserConfigurationException e) {
			LOGGER.severe("Cannot read profile applications.");
			e.printStackTrace();
		}
		return profileApplications;
	}
	
	private static List<EPackage> getEPackagesFrom(final EObject root) {
		final List<EPackage> packages = new ArrayList<>();
		root.eAllContents().forEachRemaining(e -> {
			if (e.eClass().getName().equals("EPackage")) {
				packages.add((EPackage) e);
			}
		});
		return packages;
	}
	
	private List<EPackage> getProfilePackages(final String profilePath) {
		if (!new File(profilePath).exists()) {
			return null;
		}
		final Resource profile = resourceSet.getResource(URI.createURI(profilePath), true);
		if (profile == null) {
			LOGGER.severe(String.format("Cannot load resource: '%s'.", profilePath));
			return null;
		}
		return getEPackagesFrom(profile.getContents().get(0));
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
