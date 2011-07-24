package de.hub.clickwatch.recorder.ui;

import org.osgi.framework.BundleContext;

import com.google.inject.Module;

import de.hub.clickwatch.recorder.CWRecorderModule;

public class PluginActivator extends de.hub.clickwatch.ui.PluginActivator {
	
	private static PluginActivator INSTANCE;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	public static PluginActivator getInstance() {
		return INSTANCE;
	}

	@Override
	protected Module[] getAdditionalModules() {
		return new Module[] { new CWRecorderModule() };
	}	

}