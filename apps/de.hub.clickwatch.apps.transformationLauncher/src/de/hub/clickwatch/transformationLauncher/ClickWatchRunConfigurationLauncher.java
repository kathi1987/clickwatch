package de.hub.clickwatch.transformationLauncher;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.ClickWatchModuleUtil.ValueType;
import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IClickWatchModelProvider;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.main.impl.ArgumentsProvider;
import de.hub.clickwatch.main.impl.ClickWatchModelProvider;
import de.hub.clickwatch.main.impl.InjectorProvider;
import de.hub.clickwatch.main.impl.InjectorProvider.DataBaseType;
import de.hub.clickwatch.main.impl.ProgressMonitorProvider;
import de.hub.clickwatch.main.impl.RecordProvider;
import de.hub.clickwatch.main.impl.ResultsProvider;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;

/**
 * The Launcher for run configutations of transformations
 * 
 * 
 * @author Lars George
 * 
 */
public class ClickWatchRunConfigurationLauncher {
	private final Class<? extends IClickWatchMain> mainClass;
	private final InjectorProvider injProv;
	private final ClickWatchModelProvider clickProv;
	private final RecordProvider expProv;
	private final ResultsProvider resultProv;
	private final ArgumentsProvider argProv;
	private final ProgressMonitorProvider monitorProv;

	private Map<Class<?>, IClickWatchContextAdapter> adapters = new HashMap<Class<?>, IClickWatchContextAdapter>();

	/**
	 * launch a transformation script with the given configurations for a
	 * certain file
	 * 
	 * @param configuration
	 *            a hashmap containing the parameters to fill the adapters
	 * @param mainClass
	 *            the class file that should be called
	 */
	public static void launch(
			HashMap<ELaunchConfigurationParameters, Object> configuration,
			Class<? extends IClickWatchMain> mainClass) {

		standaloneSetUp();

		ClickWatchRunConfigurationLauncher launcher = new ClickWatchRunConfigurationLauncher(
				mainClass);

		if (launcher.initalizeInjectorProvider(configuration)
				&& launcher.initalizeRecordProvider(configuration)
				&& launcher.initalizeClickWatchModelProvider(configuration)
				&& launcher.initalizeResultProvider(configuration)
				&& launcher.initializeArgumentsProvider(configuration)
				&& launcher.initalizeProgressMonitorProvider(configuration)) {
			launcher.doLaunch();
		}
	}

	/**
	 * 
	 * @param configuration
	 * @return
	 */
	private boolean initalizeProgressMonitorProvider(
			HashMap<ELaunchConfigurationParameters, Object> configuration) {
		monitorProv.initialize(null, null);
		return true;
	}

	/**
	 * 
	 * @param configuration
	 * @return
	 */
	private boolean initalizeResultProvider(
			HashMap<ELaunchConfigurationParameters, Object> configuration) {
		resultProv.initialize(null, null);
		return true;
	}

	/**
	 * 
	 * @param configuration
	 * @return
	 */
	private boolean initializeArgumentsProvider(
			HashMap<ELaunchConfigurationParameters, Object> configuration) {

		String[] args = {};

		if (configuration
				.get(ELaunchConfigurationParameters.TransformationArguments) instanceof String[]) {
			args = (String[]) configuration
					.get(ELaunchConfigurationParameters.TransformationArguments);
		}

		argProv.initialize(args);
		return true;
	}

	/**
	 * 
	 * @param configuration
	 * @return
	 */
	private boolean initalizeInjectorProvider(
			HashMap<ELaunchConfigurationParameters, Object> configuration) {

		HandlerBehaviour hBehav = HandlerBehaviour.DEFAULT;
		if (configuration.get(ELaunchConfigurationParameters.HandlerBehaviour) != null)
			hBehav = (HandlerBehaviour) configuration
					.get(ELaunchConfigurationParameters.HandlerBehaviour);

		ValueType valType = ValueType.SPECIFIC;
		if (configuration.get(ELaunchConfigurationParameters.ValueType) != null) {
			// due to visibility reasons, the configuration can only hold string
			// values
			valType = ValueType.valueOf((String) configuration
					.get(ELaunchConfigurationParameters.ValueType));
		}

		Integer debugLev = 2;
		if (configuration.get(ELaunchConfigurationParameters.DebugLevel) != null)
			debugLev = (Integer) configuration
					.get(ELaunchConfigurationParameters.DebugLevel);

		DataBaseType dbType = DataBaseType.HBASE;
		if (configuration.get(ELaunchConfigurationParameters.DataBaseType) != null)
			dbType = (DataBaseType) configuration
					.get(ELaunchConfigurationParameters.DataBaseType);

		Integer handlerPerRec = 2000;
		if (configuration.get(ELaunchConfigurationParameters.HandlerPerRecord) != null)
			handlerPerRec = (Integer) configuration
					.get(ELaunchConfigurationParameters.HandlerPerRecord);

		Integer localUpdateInterval = 2000;
		if (configuration
				.get(ELaunchConfigurationParameters.LocalUpdateInterval) != null)
			localUpdateInterval = (Integer) configuration
					.get(ELaunchConfigurationParameters.LocalUpdateInterval);

		Integer remoteUpdateInterval = 2000;
		if (configuration
				.get(ELaunchConfigurationParameters.RemoteUpdateInterval) != null)
			remoteUpdateInterval = (Integer) configuration
					.get(ELaunchConfigurationParameters.RemoteUpdateInterval);

		URI recUri = null;
		if (configuration.get(ELaunchConfigurationParameters.RecordURI) != null
				&& configuration.get(ELaunchConfigurationParameters.RecordURI) != "")
			recUri = (URI) configuration
					.get(ELaunchConfigurationParameters.RecordURI);

		// call the init method
		injProv.initialize(hBehav, valType, debugLev, dbType, handlerPerRec,
				recUri, localUpdateInterval, remoteUpdateInterval);

		return true;
	}

	/**
	 * 
	 * @param configuration
	 * @return
	 */
	private boolean initalizeRecordProvider(
			HashMap<ELaunchConfigurationParameters, Object> configuration) {

		URI dbUri = null;
		if (configuration.get(ELaunchConfigurationParameters.DataBaseURI) != null)
			dbUri = (URI) configuration
					.get(ELaunchConfigurationParameters.DataBaseURI);

		String expId = "";
		if (configuration.get(ELaunchConfigurationParameters.RecordId) != null)
			expId = (String) configuration
					.get(ELaunchConfigurationParameters.RecordId);

		expProv.initialize(dbUri, expId);
		return true;
	}

	/**
	 * 
	 * @param configuration
	 * @return
	 */
	private boolean initalizeClickWatchModelProvider(
			HashMap<ELaunchConfigurationParameters, Object> configuration) {

		URI cwModelFile = null;
		if (configuration
				.get(ELaunchConfigurationParameters.ClickWatchModelFile) != null)
			cwModelFile = (URI) configuration
					.get(ELaunchConfigurationParameters.ClickWatchModelFile);

		EObject cwObject = null;
		if (configuration.get(ELaunchConfigurationParameters.ClickWatchObject) != null)
			cwObject = (EObject) configuration
					.get(ELaunchConfigurationParameters.ClickWatchObject);

		clickProv.initialize(cwModelFile, cwObject);
		return true;
	}

	/**
	 * does the launching
	 */
	private void doLaunch() {
		IClickWatchContext ctx = createContext();
		IClickWatchMain main = ctx.getAdapter(IInjectorProvider.class)
				.getInjector().getInstance(mainClass);
		try {
			main.main(ctx);
		} catch (Exception e) {
			Status s = new Status(IStatus.ERROR, "not_used",
					"The following error occcured while executing the transformation: "
							+ e.toString(), null);
			StatusManager.getManager().handle(s, StatusManager.SHOW);
		}

	}

	/**
	 * private ctor for internal use only
	 * 
	 * @param mainClass
	 *            the main class that is called upon execution of the
	 *            transformation
	 * @param adapterClasses
	 *            adapter classes used for the execution (injected in the
	 *            context that is available to the executed script)
	 */
	private ClickWatchRunConfigurationLauncher(
			Class<? extends IClickWatchMain> mainClass) {
		this.mainClass = mainClass;

		Injector adapterInjector = Guice.createInjector();

		injProv = (InjectorProvider) adapterInjector
				.getInstance(IInjectorProvider.class);
		adapters.put(IInjectorProvider.class, injProv);

		expProv = (RecordProvider) adapterInjector
				.getInstance(IRecordProvider.class);
		adapters.put(IRecordProvider.class, expProv);

		clickProv = (ClickWatchModelProvider) adapterInjector
				.getInstance(IClickWatchModelProvider.class);
		adapters.put(IClickWatchModelProvider.class, clickProv);

		resultProv = (ResultsProvider) adapterInjector
				.getInstance(IResultsProvider.class);
		adapters.put(IResultsProvider.class, resultProv);

		monitorProv = (ProgressMonitorProvider) adapterInjector
				.getInstance(IProgressMonitorProvider.class);
		adapters.put(IProgressMonitorProvider.class, monitorProv);

		argProv = (ArgumentsProvider) adapterInjector
				.getInstance(IArgumentsProvider.class);
		adapters.put(IArgumentsProvider.class, argProv);
	
	}

	/**
	 * creates an empty IClickWatchContext
	 * 
	 * @return a newly created context object
	 */
	private IClickWatchContext createContext() {
		return new IClickWatchContext() {
			@SuppressWarnings("unchecked")
			@Override
			public <T> T getAdapter(Class<T> adapterClass) {
				Object adapter = adapters.get(adapterClass);
				if (adapter != null) {
					return (T) adapter;
				} else {
					return null;
				}
			}
		};
	}

	public static void standaloneSetUp() {
		ClickWatchStandaloneSetup.doSetup();
		CWRecorderStandaloneSetup.doSetup();
	}
}
