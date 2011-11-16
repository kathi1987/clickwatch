package de.hub.clickwatch.analysis.activity_composition.transformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.hub.clickwatch.analysis.activity_composition.Activator;
import de.hub.clickwatch.analysis.activity_composition.model.DataNode;
import de.hub.clickwatch.analysis.activity_composition.model.InputEdge;
import de.hub.clickwatch.analysis.activity_composition.model.ModelNode;
import de.hub.clickwatch.analysis.activity_composition.model.Transformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.database.cwdatabase.util.RecordUtil;
import de.hub.clickwatch.transformationLauncher.BundleHelper;
import de.hub.clickwatch.ui.PluginActivator;
import de.hub.emfxml.XmlModelRepository;

/**
 * This class handles all actions needed to execute a given transformation
 * object
 * 
 * @author Lars George
 * 
 */
public class TransformationEngine {

	private Transformation transformation;
	protected Injector injector;

	/**
	 * ctor with needed transformation
	 * 
	 * @param transformation
	 *            the transfromation that is handled by this tansformation
	 *            engine
	 */
	public TransformationEngine(Transformation transformation) {
		this.transformation = transformation;
		injector = PluginActivator.getInstance().getInjector();
	}

	/**
	 * performs all actions to execute the transformation that is handled by
	 * this transformation engine
	 */
	public void executeTransformation() {

		try {
			System.out.println("Transformation ["+ transformation.getLabel()  +"]");
			
			// is there a transformation given to be executed?
			String transformationFile = transformation.getTransformationFile();			
			if(transformationFile == null || transformationFile == "") {
				raiseWarning("Transformation could not be executed. No file given for '"+ transformation.getLabel() +"'");
				return;
			}

			ArrayList<Handler> inputHandler = new ArrayList<Handler>();
			DataBaseUtil util = injector.getInstance(DataBaseUtil.class);

			for (InputEdge inEdge : transformation.getInput()) {
				DataNode dataNode = inEdge.getSource();

				if (dataNode instanceof ModelNode) {
					ModelNode mNode = (ModelNode) dataNode;

					if (mNode.getModelResource() != null
							&& mNode.getModelResource().endsWith(
									"cwdatabase")) {
						
						String nodeID = "localhost:7777";
						Record rec = RecordUtil.buildRecord(
								"TestNodeName",  
								200, 
								100, 
								nodeID);

						String handlerID = "gps";
						long start = 0;
						long end = 0;
						
						inputHandler.add(util.getHandler(DataBaseUtil.createHandle(rec, nodeID, handlerID, start, end)));																
					} else
						raiseWarning("Oh a non clickwatch database input, sry not yet supported ("
								+ mNode.getLabel() + ")");
				} else
					raiseWarning("Input data other then ModelNodes are not yet supported");
			}
			//inputHandler.get(0).

			// get the servcice classes			
			IInputService inService = injector
					.getInstance(IInputService.class);
			IOutputService outService = injector
					.getInstance(IOutputService.class);

			
			URI u = URI.createURI(transformationFile);
			String bundleIdentifier = u.segment(1);

			Bundle bundle = BundleHelper
					.installBundleFromWorkspace(bundleIdentifier);

			bundle.start();

			Class<?> transformationClass = null;
			String transformationClassName = getFullClassName(u);

			try {
				// get the class for the transformation execution
				transformationClass = bundle.loadClass(transformationClassName);				
			} catch(ClassNotFoundException e) {
				raiseError("Transformation could not be execute. Transformationfile is not valid: "+ u.path());
				return;
			}


			// if the class is not already loaded, try it with the default
			// class loader
			if (transformationClass == null)
				transformationClass = Activator.getDefault()
						.getClass().getClassLoader()
						.loadClass(transformationClassName);

			// check if the interface is used in this class
			boolean hasCompositionInterface = false;
			for (Class<?> c : transformationClass.getInterfaces()) {
				if (c.equals(ICompositionTransformation.class)) {
					hasCompositionInterface = true;
					break;
				}
			}
			
			if (!hasCompositionInterface) {
				Status s = new Status(
						IStatus.ERROR,
						"not_used",
						"The transformation file does not use the interface ICompositionTransformation",
						null);
				StatusManager.getManager().handle(s, StatusManager.SHOW);

				return;
			}
			
			Class<ICompositionTransformation> mainClass = (Class<ICompositionTransformation>) transformationClass;
			ICompositionTransformation transformationInstance =  injector.getInstance(mainClass);
			transformationInstance.main(inService, outService);						
		
		} catch (Exception e) {
			raiseError("An error occurred in the transformation process: "
					+ e.getLocalizedMessage());
		}
	}

	/**
	 * method to show a warning to the user
	 * 
	 * @param msg
	 */
	private void raiseWarning(String msg) {
		Status myStatus = new Status(IStatus.WARNING, Activator.PLUGIN_ID, msg,
				null);
		StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
	}

	/**
	 * method to show an error to the user
	 * 
	 * @param string
	 */
	private void raiseError(String string) {
		Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
				string, null);
		StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
	}

	/**
	 * tries to read the meta model of the given model node from the gicen
	 * resource set
	 * 
	 * @param rs
	 * @param node
	 * @return
	 * @throws IOException
	 */
	private EPackage loadMetaModel(ResourceSet rs, ModelNode node)
			throws IOException {
		if (node.getModelResource() != null) {

			URI uri = URI.createURI(node.getModelResource());
			Resource metaModelResource = rs.getResource(uri, false);
			if (metaModelResource == null) {
				metaModelResource = rs.createResource(uri);
			}
			if (!metaModelResource.isLoaded()) {
				metaModelResource.load(XmlModelRepository
						.defaultLoadSaveOptions());
			}
			EPackage metaModel = (EPackage) metaModelResource.getContents()
					.get(0);
			EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
			return metaModel;

		} else {
			raiseError("no meta-model given");
			return null;
		}
	}

	/**
	 * Retrieves the full qualified class name (including package structure)
	 * 
	 * @param fileURI
	 * @return
	 */
	private String getFullClassName(URI fileURI) {
		String className = "";
		try {
			InputStream is = URIConverter.INSTANCE.createInputStream(fileURI);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			if (line.startsWith("package")) {
				className = line.substring(7).trim();
			}

			if (className.endsWith(";"))
				className = className.replaceAll(";", "");

			if (className != "")
				className += ".";

			className += fileURI.lastSegment().replaceAll(".java|.xtend", "");

		} catch (Exception e) {
			Status myStatus = new Status(IStatus.ERROR, "",
					"Could not find the class", null);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}

		return className;
	}
}
