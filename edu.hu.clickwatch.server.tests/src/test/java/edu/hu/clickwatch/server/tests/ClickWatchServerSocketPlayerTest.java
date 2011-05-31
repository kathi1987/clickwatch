package edu.hu.clickwatch.server.tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;


import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.server.configuration.ClickWatchServerSetup;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeAdapter;
import edu.hu.clickwatch.server.node.INodeAdapter;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayer;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayerSocket;

public class ClickWatchServerSocketPlayerTest  {
	/** */
	private Injector mInjector = null;
	
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
	
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickWatchServerNodeAdapter.class;
	}
	
	protected void additionalSetUp() { }

	protected AbstractModule[] getAdditionalModules() {
		edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayer.PlayerModule player =  new ClickWatchServerSocketPlayer.PlayerModule();
		return new AbstractModule[] { player };
	}
	
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickWatchServerSocketPlayerSocket.class;
	}
	
	@Test
	public void testWithRecord() {
		INodeAdapter nodeAdapter = mInjector.getInstance(INodeAdapter.class);
		((ClickWatchServerNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
		nodeAdapter.connect();
		nodeAdapter.retrieve("", "");
	}
}

