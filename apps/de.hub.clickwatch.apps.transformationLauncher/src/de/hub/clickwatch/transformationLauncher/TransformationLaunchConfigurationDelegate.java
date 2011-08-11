package de.hub.clickwatch.transformationLauncher;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.Bundle;

import de.hub.clickwatch.main.ClickWatchRunConfigurationLauncher;
import de.hub.clickwatch.main.ELaunchConfigurationParameters;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.transformationLauncher.tabs.ClickwatchParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.ExperimentParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.MainParametersTab;
import de.hub.clickwatch.ui.PluginActivator;

/**
 * The delgate that is called upon the run of a transformation launch
 * configuration
 * 
 * @author Lars George
 * 
 */
public class TransformationLaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	@SuppressWarnings("unchecked")
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// reading the configuration values in the gui
		String transformationFile = configuration.getAttribute(
				MainParametersTab.ATTR_TRANSFORMATION_FILE, "");
		String debugLevel = configuration.getAttribute(
				MainParametersTab.ATTR_DEBUG_LEVEL, "");
		String valueType = configuration.getAttribute(
				MainParametersTab.ATTR_VALUE_TYPE, "");

		String sourceModelFile = configuration.getAttribute(
				ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE, "");
		String modelObject = configuration.getAttribute(
				ClickwatchParametersTab.ATTR_MODEL_OBJECT, "");

		String experimentID = configuration.getAttribute(
				ExperimentParametersTab.ATTR_EXPERIMENT_ID, "");
		String databaseURI = configuration.getAttribute(
				ExperimentParametersTab.ATTR_DATABASE_URI, "");

		// RUN MODE
		if (mode.equals(ILaunchManager.RUN_MODE)) {
			try {

				URI u = URI.createURI(transformationFile);
				String bundleIdentifier = u.segment(1);

				Bundle bundle = BundleHelper
						.installBundleFromWorkspace(bundleIdentifier);
				bundle.start();

				Class<?> transformationClass = null;
				String transformationClassName = getFullClassName(u);

				// get the class for the xtend2 execution
				transformationClass = bundle.loadClass(transformationClassName);

				// if the class is not already loaded, try it with the default
				// class loader
				if (transformationClass == null)
					transformationClass = PluginActivator.getInstance()
							.getClass().getClassLoader()
							.loadClass(transformationClassName);

				Class<IClickWatchMain> mainClass = (Class<IClickWatchMain>) transformationClass;

				// *******************************
				// build the configuration
				HashMap<ELaunchConfigurationParameters, Object> config = new HashMap<ELaunchConfigurationParameters, Object>();

				// *************
				// Main tab

				// transformatiopn file
				config.put(ELaunchConfigurationParameters.TransformationFile,
						URI.createURI(transformationFile));

				// value type
				config.put(ELaunchConfigurationParameters.ValueType, valueType);

				// debug level
				Integer debugLvl = 2;
				if (debugLevel.equals("Error"))
					debugLvl = 1;
				else if (debugLevel.equals("Warning"))
					debugLvl = 2;
				else if (debugLevel.equals("Info"))
					debugLvl = 3;
				else if (debugLevel.equals("Debug"))
					debugLvl = 4;
				config.put(ELaunchConfigurationParameters.DebugLevel, debugLvl);

				// *************
				// Experiment tab

				// *************
				// ClickWatch Model tab

				// source model file
				config.put(ELaunchConfigurationParameters.ClickWatchModelFile,
						URI.createURI(sourceModelFile));

				// model object
				if (modelObject != "") {
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getLoadOptions()
							.put(XMLResource.OPTION_EXTENDED_META_DATA,
									Boolean.TRUE);
					Resource modelResource = resourceSet.getResource(
							URI.createURI(sourceModelFile), true);

					// XPath path = XPathFactory.newInstance().newXPath();
					// XPathExpression expresison = path.compile(modelObject);
					// Object result = expresison.evaluate(modelResource);

					config.put(ELaunchConfigurationParameters.ClickWatchObject,
							modelResource.getEObject(modelObject));
				} else
					config.put(ELaunchConfigurationParameters.ClickWatchObject,
							null);

				ClickWatchRunConfigurationLauncher.launch(config, mainClass);
			} catch (Exception e) {

				System.out.println("Error: " + e);
			}

		} else if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			// TODO: implement debug mode handling

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
