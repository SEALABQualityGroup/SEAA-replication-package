package it.univaq.disim.sealab.epsilon;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.xml.XmlModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.uml2.common.util.CacheAdapter;

import it.univaq.disim.sealab.epsilon.eol.EasierUmlModel;

public abstract class EpsilonStandalone {

	protected IEolModule module;
	protected List<Variable> parameters = new ArrayList<>();
	protected List<IModel> model;

	protected Path metamodelPath;

	protected Path source;

	protected Object result;

	public abstract IEolModule createModule();

	/**
	 * It sets to the EOL file the given object @param obj
	 * 
	 * @param type specifies the obj type
	 * @return
	 */
	public EpsilonStandalone setParameter(Object targetObject, String type, String variableName) {
		EolModelElementType modelType = new EolModelElementType(type);
		Variable var = new Variable(variableName, targetObject, modelType);
		parameters.add(var);
		return this;
	}

	public EpsilonStandalone setParameter(EObject targetObj, String type) {
		setParameter(targetObj, type, "self");
		return this;
	}

	public EpsilonStandalone setModel(IModel m) {
		model.add(m);
		return this;
	}

	public abstract void postProcess(Path destFilePath);

	public abstract void preProcess();

	/**
	 * 
	 * @param mmaemiliaFilePath
	 * @param destFilePath
	 * @param ruleFilePath
	 * @throws Exception
	 */
	public void execute(Path destFilePath) throws Exception {

		doExecute();

		postProcess(destFilePath);

		module.getContext().getModelRepository().dispose();
	}

	public void execute() throws EolRuntimeException {

		doExecute();

	}

	public void storedOnDispose() {
		module.getContext().getModelRepository().dispose();
	}

	public EpsilonStandalone setModule(EolModule mod) {
		module = mod;
		return this;
	}

	public Path getSource() {
		return source;
	}

	public List<IModel> getModel() {
		return model;
	}

	protected void doExecute() throws EolRuntimeException {
		try {
			module.parse(getSource().toFile());
		} catch (Exception e) {
			System.err.println("[ERROR] File not found! " + getSource().toString());
			e.printStackTrace();
		}

		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
		}

		model.forEach(m -> module.getContext().getModelRepository().addModel(m));

		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}

		preProcess();
		result = execute(module);
	}

	public Path getMetamodelPath() {
		return metamodelPath;
	}

	public EpsilonStandalone setMetamodelPath(Path mmPath) throws IOException {
		if (Files.exists(mmPath))
			metamodelPath = mmPath;
		if (metamodelPath == null) {
			InputStream mmIn = EpsilonHelper.class.getClassLoader().getResourceAsStream("metamodels/mmAEmilia.ecore");
			metamodelPath = mmPath;
			Files.copy(mmIn, metamodelPath);
		}
		return this;
	}

	public List<Variable> getParameters() {
		return parameters;
	}

	public void setSource(Path src) {
		source = src;
	}

	protected Object execute(IEolModule module) throws EolRuntimeException {
		return module.execute();
	}

	public synchronized EmfModel createEmfModel(String name, Path model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, model.toUri().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		try {
			emfModel.load(properties, (IRelativePathResolver) null);
		} catch (EolModelLoadingException e) {
			System.err.println("Error in loading the model with properties!");
			e.printStackTrace();
		}
		return emfModel;
	}

	public EmfModel createOutputEmfModel(String name, Path model, String metamodel) {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, model.toFile());
		properties.put(EmfModel.PROPERTY_READONLOAD, false);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, true);
		try {
			emfModel.load(properties, (IRelativePathResolver) null);
		} catch (EolModelLoadingException e) {
			System.err.println("Error in loading the model with properties!");
			e.printStackTrace();
		}

		emfModel.getResource().getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("uml",
				new org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl());

		return emfModel;
	}

	/**
	 * Loads the @param model as a UML model.
	 * 
	 * @param name            is the name in the Epsilon module
	 * @param model
	 * @param metamodelURI    is the metamodel nsURI
	 * @param readOnLoad      if true the model is read from the file system
	 * @param storeOnDisposal if true the mode is store in the file system
	 * @return the loaded model
	 * @throws EolModelLoadingException
	 * @throws URISyntaxException
	 */
	public static EasierUmlModel createUmlModel(String model) throws EolModelLoadingException, URISyntaxException {
		CachedResourceSet.getCache().clear();

		EasierUmlModel emfModel = new EasierUmlModel();

		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, "UML");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, false);
		properties.put(EmfModel.PROPERTY_EXPAND, true);
		properties.put(EmfModel.PROPERTY_MODEL_URI, URI.createFileURI(model));
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, null);// ,http://com.masdes.dam/profiles/Core/1.0");
		properties.put(EmfModel.PROPERTY_CACHED, false);
		properties.put(EmfModel.PROPERTY_CONCURRENT, false);
		properties.put(EmfModel.PROPERTY_READONLOAD, true);
		// by debugging an EOL run through a canonical execution (i.e., EOL running
		// configuration)
		properties.put("type", "UML");

		// reading the epsilon source code
		emfModel.load(properties, (IRelativePathResolver) null);

		return emfModel;
	}

	public XmlModel createXMLModel(String name, Path xmlFilePath, URI xsdURI, boolean readOnLoad,
			boolean storeOnDisposal) {
		// Load the XML document
		XmlModel xmlModel = new XmlModel();

		try {
			StringProperties properties = new StringProperties();
			properties.put(XmlModel.PROPERTY_NAME, name);
			properties.put(XmlModel.PROPERTY_XSD_URI, xsdURI);

			properties.put(EmfModel.PROPERTY_EXPAND, true);
			properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
			properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);

			properties.put(XmlModel.PROPERTY_MODEL_URI,
					org.eclipse.emf.common.util.URI.createFileURI(xmlFilePath.toString()));

			xmlModel.load(properties, (IRelativePathResolver) null);

		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlModel;
	}

	/**
	 * @param name            represents the name exploited within the module
	 * @param xmlFilePath     represents the path that points the xml file
	 * @param uri             represents the uri of the xml (null if not needed)
	 * @param readOnLoad      true when the file is already available, false when
	 *                        the file will be created by the routine
	 * @param storeOnDisposal true when we want to store changes, false otherwise
	 * @param cached          true to improve the performance
	 * @return
	 */
	public PlainXmlModel createPlainXMLModel(String name, Path xmlFilePath, boolean readOnLoad, boolean storeOnDisposal,
			boolean cached) {

		// thanks to Epsilon source code see
		// org.eclipse.epsilon.workflow/ant/org/eclipse/epsilon/workflow/tasks/xml/LoadXmlModel.java,
		// for the orginal version
		PlainXmlModel model = new PlainXmlModel();

		ResourceFactoryRegistryImpl.INSTANCE.getExtensionToFactoryMap().put("lqxo",
				new GenericXMLResourceFactoryImpl());

		StringProperties properties = new StringProperties();
		properties.put(PlainXmlModel.PROPERTY_NAME, name);
		properties.put(PlainXmlModel.PROPERTY_FILE, xmlFilePath.toString());
		properties.put(PlainXmlModel.PROPERTY_READONLOAD, true);
		properties.put("type", "lqxo");

		try {
			model.load(properties);
		} catch (EolModelLoadingException ex) {
			ex.printStackTrace();
		}
		return model;
	}

	public IEolModule getModule() {
		return module;
	}

	public synchronized void clearMemory() {
		
		this.getModule().getImports().clear();
		this.getModule().getComments().clear();
		this.module.getOperations().clear();
		this.module.getChildren().clear();
		
		this.getModule().getContext().dispose();
		this.getModule().getContext().getModelRepository().dispose();
		this.getModule().getContext().getFrameStack().dispose();

		
	}

}
