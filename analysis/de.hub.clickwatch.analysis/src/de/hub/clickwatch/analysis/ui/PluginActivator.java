package de.hub.clickwatch.analysis.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class PluginActivator extends AbstractUIPlugin {
	
	// The plug-in ID
	public static final String PLUGIN_ID = "edu.hu.clickwatch.analysis"; //$NON-NLS-1$
	
	private static PluginActivator INSTANCE;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	public static PluginActivator getInstance() {
		return INSTANCE;
	}

}