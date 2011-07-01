package de.hub.clickwatch.examples;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class ClickWatchExamplesPluginActivator extends AbstractUIPlugin {
	
	private static ClickWatchExamplesPluginActivator INSTANCE;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	public static ClickWatchExamplesPluginActivator getInstance() {
		return INSTANCE;
	}	
}
