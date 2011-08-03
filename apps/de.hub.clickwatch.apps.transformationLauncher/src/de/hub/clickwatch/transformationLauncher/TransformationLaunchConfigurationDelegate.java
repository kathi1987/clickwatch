package de.hub.clickwatch.transformationLauncher;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Options;
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

		// RUN MODE
		if (mode.equals(ILaunchManager.RUN_MODE)) {
			String transformationFile = configuration.getAttribute(
					TransformationParametersTab.ATTR_TRANSFORMATION_FILE,
					"");
			
			String sourceModelFile = configuration.getAttribute(
					TransformationParametersTab.ATTR_SOURCE_MODEL_FILE,
					"");

			List<Class<?>> adapterClasses = new ArrayList<Class<?>>();
			adapterClasses.add(IInjectorProvider.class);
			adapterClasses.add(IClickWatchModelProvider.class);
			
			Class<IClickWatchMain> mainClass = transformationFile;
			String[] args = { "-m \""+ sourceModelFile +"\"" };

			ClickWatchExternalLauncher.launch(args, mainClass,
					adapterClasses.toArray(new Class[] {}));

		} else if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			// TODO: implement debug mode handling

		}
	}

}
