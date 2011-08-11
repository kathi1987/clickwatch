package de.hub.clickwatch.transformationLauncher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

import de.hub.clickwatch.transformationLauncher.tabs.ClickwatchParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.ExperimentParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.MainParametersTab;

/**
 * This class is used when a transformation should be performed as a shorcut
 * (run as -> transformation)
 * 
 * @author Lars George
 * 
 */
public class TransformationLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {				
		String file = "platform:/resource/de.hub.clickwatch.analysis.examples.xtend2/src/de/hub/clickwatch/analysis/examples/java/TestRunConfiguration2.java";
		Object selected =  ((IStructuredSelection)selection).getFirstElement();
		if(selected instanceof CompilationUnit)
		{
			file = ((CompilationUnit)selected).getJavaElement().getPath().toString() + ((CompilationUnit)selected).getJavaElement().getElementName();
		}
		
		launch(file, mode);
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		String file = "";
		launch(file, mode);
	}

	protected ILaunchConfigurationType getConfigurationType() {
		ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
		return lm
				.getLaunchConfigurationType("de.hub.clickwatch.analysis.ui.TransformationLaunchConfiguration");
	}

	private void launch(String transformationFile, String mode) {
		ILaunchConfiguration config = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			ILaunchConfigurationWorkingCopy wc = configType.newInstance(
					null,
					DebugPlugin
							.getDefault()
							.getLaunchManager()
							.generateLaunchConfigurationName(
									configType.getName()));

			wc.setAttribute(MainParametersTab.ATTR_TRANSFORMATION_FILE, transformationFile);
			wc.setAttribute(MainParametersTab.ATTR_VALUE_TYPE, "SPECIFIC");
			wc.setAttribute(MainParametersTab.ATTR_DEBUG_LEVEL, "Warning");
			wc.setAttribute(ExperimentParametersTab.ATTR_DATABASE_URI, "");
			wc.setAttribute(ExperimentParametersTab.ATTR_EXPERIMENT_ID, "");
			wc.setAttribute(ClickwatchParametersTab.ATTR_MODEL_OBJECT, "//@nodes.3/@elements.12");
			wc.setAttribute(ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE, "platform:/resource/de.hub.clickwatch.analysis.examples.composition/src/SeismoOutdoor.clickwatchmodel");
			

			config = wc.doSave();

			//DebugUITools.launch(config, mode);

		} catch (CoreException ce) {
		}
	}
}
