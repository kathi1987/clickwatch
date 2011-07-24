package de.hub.clickwatch.analysis.ui;

import org.osgi.framework.BundleContext;

public class PluginActivator extends de.hub.clickwatch.recorder.ui.PluginActivator {
	
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