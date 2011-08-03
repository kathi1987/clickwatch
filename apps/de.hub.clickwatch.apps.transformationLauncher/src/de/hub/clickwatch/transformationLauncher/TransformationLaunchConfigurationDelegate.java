package de.hub.clickwatch.transformationLauncher;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IClickWatchModelProvider;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.transformationLauncher.tabs.ClickwatchParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.ExperimentParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.MainParametersTab;

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
				ClickwatchParametersTab.ATTR_TRANSFORMATION_FILE, "");
		String sourceModelFile = configuration.getAttribute(
				ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE, "");

		String experimentID = configuration.getAttribute(
				ExperimentParametersTab.ATTR_EXPERIMENT_ID, "");
		String databaseURI = configuration.getAttribute(
				ExperimentParametersTab.ATTR_DATABASE_URI, "");

		Integer debugLevel = Integer.parseInt(configuration.getAttribute(
				MainParametersTab.ATTR_DEBUG_LEVEL, ""));
		String valueType = configuration.getAttribute(
				MainParametersTab.ATTR_VALUE_TYPE, "");

		// RUN MODE
		if (mode.equals(ILaunchManager.RUN_MODE)) {

			List<Class<?>> adapterClasses = new ArrayList<Class<?>>();
			adapterClasses.add(IInjectorProvider.class);
			adapterClasses.add(IClickWatchModelProvider.class);

			Class<IClickWatchMain> mainClass = null;
			String[] args = { "-uri \"" + sourceModelFile + "\"", "-obj root",
					"-e ", "-f " };

			ClickWatchExternalLauncher.launch(args, mainClass,
					adapterClasses.toArray(new Class[] {}));

		} else if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			// TODO: implement debug mode handling

		}
	}

}
