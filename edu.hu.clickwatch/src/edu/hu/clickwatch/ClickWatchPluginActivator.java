package edu.hu.clickwatch;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class ClickWatchPluginActivator extends AbstractUIPlugin {
	
	private static ClickWatchPluginActivator INSTANCE;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	public static ClickWatchPluginActivator getInstance() {
		return INSTANCE;
	}	
}
