package edu.hu.clickwatch.tests;

import junit.framework.TestCase;

import org.eclipse.core.runtime.IStatus;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.ClickSocketImpl;
import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.ClickWatchStandaloneSetup;
import edu.hu.clickwatch.merge.DefaultMergeConfiguration;
import edu.hu.clickwatch.merge.IMergeConfiguration;
import edu.hu.clickwatch.merge.MergeModule;
import edu.hu.clickwatch.model.ClickWatchNodeMergeConfiguration;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.util.ILogger;

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
