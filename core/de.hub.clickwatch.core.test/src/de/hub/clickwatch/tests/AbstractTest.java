package de.hub.clickwatch.tests;

import junit.framework.TestCase;

import org.eclipse.core.runtime.IStatus;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.merge.MergeModule;
import de.hub.clickwatch.model.ClickWatchNodeMergeConfiguration;
import de.hub.clickwatch.model.IConnectionConfiguration;
import de.hub.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.util.ILogger;


public class AbstractTest extends TestCase {
	
	protected Injector injector;
	
	public final void setUp() {
		ClickWatchStandaloneSetup.doSetup();
		injector = Guice.createInjector(createModule());
		additionalSetUp();
	}
	
	protected AbstractModule createModule() {
		return new TestModule();
	}
	
	protected class TestModule extends AbstractModule {
		
		@Override
		protected void configure() {
			install(new MergeModule());
			for (AbstractModule additionalModule: getAdditionalModules()) {
				install(additionalModule);
			}
			bind(ILogger.class).toInstance(new ILogger() {				
				@Override
				public void log(int status, String message, Throwable exception) {
					if (status == IStatus.ERROR) {
						System.err.println("ERROR: " + message);
						exception.printStackTrace(System.err);
					} else {
						System.out.println(message);
					}
				}
			});
			bind(INodeAdapter.class).to(getNodeAdapterClass());
			bind(IMergeConfiguration.class).to(getMergeConfigurationClass());
			bind(IClickSocket.class).to(getClickSocketClass());
			bind(IConnectionConfiguration.class).to(TestConnectionConfiguration.class);
		}
		
	}
	
	protected AbstractModule[] getAdditionalModules() {
		return new AbstractModule[] {};
	}

	protected Class<? extends IMergeConfiguration> getMergeConfigurationClass() {
		return ClickWatchNodeMergeConfiguration.class;
	}

	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlXSDNodeAdapter.class;
	}

	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketImpl.class;
	}

	protected void additionalSetUp() {
		
	}
}
