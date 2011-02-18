package edu.hu.clickwatch;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClickWatchPluginActivator extends AbstractUIPlugin {
	
	private Injector injector = null;
	private static ClickWatchPluginActivator INSTANCE;

	public Injector getInjector() {
		return injector;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		injector = Guice.createInjector(new GuiceModule());
	}
	
	public static ClickWatchPluginActivator getInstance() {
		return INSTANCE;
	}	
}
