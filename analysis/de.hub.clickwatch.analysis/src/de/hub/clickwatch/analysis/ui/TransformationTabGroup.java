package de.hub.clickwatch.analysis.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;

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
				new TransformationParametersTab() };
		setTabs(tabs);

	}

}
