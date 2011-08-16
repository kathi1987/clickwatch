package de.hub.clickwatch.transformationLauncher;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import de.hub.clickwatch.transformationLauncher.tabs.ClickwatchParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.RecordParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.MainParametersTab;

/**
 * The tab group for transformation launch configurations
 * 
 * @author Lars George
 * 
 */
public class TransformationTabGroup extends AbstractLaunchConfigurationTabGroup {

	public TransformationTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new MainParametersTab(), new RecordParametersTab(),
				new ClickwatchParametersTab() };
		setTabs(tabs);

	}

}
