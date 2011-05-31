package edu.hu.clickwatch.server.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.ClickSocketImpl;
import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.server.configuration.ClickWatchServerSetup;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeAdapter;
import edu.hu.clickwatch.server.node.INodeAdapter;

/** 
 * 
 * @author Michael Frey
 */
public class AbstractTest {
	/** */
	private Injector mInjector = null;
	
	/**
	 *  
	 */
	@Before
	public void initialize(){
		// Set up namespaces for ClickWatch model
		ClickWatchServerSetup.initialize();
		// Initialize the injector
		mInjector = Guice.createInjector(createModule());
		// Additional modules which should be added
		additionalSetUp();
	}
	
	protected AbstractModule createModule() {
		return new TestModule();
	}
	
	protected class TestModule extends AbstractModule {
		@Override
		protected void configure() {
			//install(new MergeModule());
			for (AbstractModule additionalModule: getAdditionalModules()) {
				install(additionalModule);
			};
			bind(INodeAdapter.class).to(getNodeAdapterClass());
			//bind(IMergeConfiguration.class).to(getMergeConfigurationClass());
			bind(IClickSocket.class).to(getClickSocketClass());		
				
		}
	}
	
	protected AbstractModule[] getAdditionalModules() {
		return new AbstractModule[] {};
	}
	
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		//return ClickControlXSDNodeAdapter.class;
		return ClickWatchServerNodeAdapter.class;
	}

	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketImpl.class;
	}

	public Injector getInjector() {
		return mInjector;
	}
	
	protected void additionalSetUp() { }
}
