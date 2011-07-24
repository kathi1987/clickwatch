package de.hub.clickwatch.analysis.ui;

import org.osgi.framework.Bundle;

import com.google.inject.Injector;


public class GuiceAwareExecutableExtensionFactory extends de.hub.clickwatch.ui.GuiceAwareExecutableExtensionFactory {
	
	@Override
	protected Bundle getBundle() {
		return PluginActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PluginActivator.getInstance().getInjector();
	}
}
