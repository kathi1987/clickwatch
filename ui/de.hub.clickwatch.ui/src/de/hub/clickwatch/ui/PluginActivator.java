package de.hub.clickwatch.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class PluginActivator extends AbstractUIPlugin {
	
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
