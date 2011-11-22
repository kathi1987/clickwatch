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

import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.impl.InjectorProvider.DataBaseType;
import de.hub.clickwatch.transformationLauncher.tabs.ArgumentsParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.ClickwatchParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.MainParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.RecordParametersTab;
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
		String handlerBehaviour = configuration.getAttribute(
				MainParametersTab.ATTR_HANDLER_BEHAVIOUR, "");
		String databaseType = configuration.getAttribute(
				MainParametersTab.ATTR_DATABASE_TYPE, "");
		String handlerPerRecord = configuration.getAttribute(
				MainParametersTab.ATTR_HANDLER_PER_RECORD, "");
		String recordURI = configuration.getAttribute(
				MainParametersTab.ATTR_RECORD_URI, "");
		String localUpdateInterval = configuration.getAttribute(
				MainParametersTab.ATTR_LOCAL_UPDATE_INTERVAL, "");
		String remoteUpdateInterval = configuration.getAttribute(
				MainParametersTab.ATTR_REMOTE_UPDATE_INTERVAL, "");

		String sourceModelFile = configuration.getAttribute(
				ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE, "");
		String modelObject = configuration.getAttribute(
				ClickwatchParametersTab.ATTR_MODEL_OBJECT, "");

		String recordID = configuration.getAttribute(
				RecordParametersTab.ATTR_RECORD_ID, "");
		String databaseURI = configuration.getAttribute(
				RecordParametersTab.ATTR_DATABASE_URI, "");

		String transformationArguments = configuration.getAttribute(
				ArgumentsParametersTab.ATTR_TRANSFORMATION_ARGUMENTS, "");

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

				// get the class for the transformation execution
				transformationClass = bundle.loadClass(transformationClassName);

				// if the class is not already loaded, try it with the default
				// class loader
				if (transformationClass == null)
					transformationClass = PluginActivator.getInstance()
							.getClass().getClassLoader()
							.loadClass(transformationClassName);

				// check if the interface is used in this class
				boolean hasMainInterface = false;
				for (Class<?> c : transformationClass.getInterfaces()) {
					if (c.equals(IClickWatchMain.class)) {
						hasMainInterface = true;
						break;
					}
				}
				if (!hasMainInterface) {
					Status s = new Status(
							IStatus.ERROR,
							"not_used",
							"The transformation file does not use the interface IClickWatchMain",
							null);
					StatusManager.getManager().handle(s, StatusManager.SHOW);

					return;
				}

				Class<IClickWatchMain> mainClass = (Class<IClickWatchMain>) transformationClass;

				// *******************************
				// build the configuration
				HashMap<ELaunchConfigurationParameters, Object> config = new HashMap<ELaunchConfigurationParameters, Object>();

				// *************
				// Main tab

				// transformatiopn file
				config.put(ELaunchConfigurationParameters.TransformationFile,
						URI.createURI(transformationFile));

				// record uri
				if (recordURI != "" && recordID != null)
					config.put(ELaunchConfigurationParameters.RecordURI,
							URI.createURI(recordURI));

				// handler per record
				if (handlerPerRecord != null && handlerPerRecord != "")
					config.put(ELaunchConfigurationParameters.HandlerPerRecord,
						Integer.parseInt(handlerPerRecord));

				// local update interval
				int localUpdateIntervalParsed = 1000;
				try {
					localUpdateIntervalParsed = Integer.parseInt(localUpdateInterval);
				} catch (NumberFormatException e) {
					// TODO log error
				}
				config.put(ELaunchConfigurationParameters.LocalUpdateInterval,
						localUpdateIntervalParsed);
				
				// remote update interval
				int remoteUpdateIntervalParsed = 3000;
				try {
					Integer.parseInt(remoteUpdateInterval);
				} catch (Exception e) {
					// TODO logError
				}				
				config.put(ELaunchConfigurationParameters.RemoteUpdateInterval,
						remoteUpdateIntervalParsed);

				// database type
				if (databaseType != null && databaseType != "")
					config.put(ELaunchConfigurationParameters.DataBaseType,
						DataBaseType.valueOf(databaseType));

				// handler behaviour
				if (handlerBehaviour != null && handlerBehaviour != "")
					config.put(ELaunchConfigurationParameters.HandlerBehaviour,
						HandlerBehaviour.valueOf(handlerBehaviour));

				// value type
				if (valueType != null && valueType != "")
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
				// Arguments tab
				if (transformationArguments != null)
					config.put(
							ELaunchConfigurationParameters.TransformationArguments,
							transformationArguments.split(" "));

				// *************
				// Record tab

				config.put(ELaunchConfigurationParameters.DataBaseURI,
						URI.createURI(databaseURI));

				config.put(ELaunchConfigurationParameters.RecordId, recordID);

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

					config.put(ELaunchConfigurationParameters.ClickWatchObject,
							modelResource.getEObject(modelObject));
				} else
					config.put(ELaunchConfigurationParameters.ClickWatchObject,
							null);

				ClickWatchRunConfigurationLauncher.launch(config, mainClass);
			} catch (Exception e) {

				Status s = new Status(IStatus.ERROR, "not_used", e.toString(),
						null);
				StatusManager.getManager().handle(s, StatusManager.SHOW);
			}

		} else if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			Status s = new Status(IStatus.ERROR, "not_used",
					"Debug execution mode not yet supported", null);
			StatusManager.getManager().handle(s, StatusManager.SHOW);
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
