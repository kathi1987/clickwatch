package edu.hu.clickwatch;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickwatch.util.ILogger;

public class ClickWatchPluginActivator extends Plugin {
	
	private Injector injector = null;
	private static ClickWatchPluginActivator INSTANCE;

	public Injector getInjector() {
		return injector;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;	
		ClickWatchModule clickWatchModule = new ClickWatchModule();
		clickWatchModule.setLogger(new ILogger() {

			@Override
			public void log(int status, String message, Throwable exception) {
				getLog().log(new Status(status, "edu.hu.clickwatch", message, exception));
				System.err.println("ERROR: " + message + "\nView log for details. Model might be wrong.");
			}			
			
		});
		injector = Guice.createInjector(clickWatchModule);
		
	}
	
	public static ClickWatchPluginActivator getInstance() {
		return INSTANCE;
	}	
}
