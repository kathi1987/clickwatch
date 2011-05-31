package edu.hu.clickwatch.server.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.server.ClickWatchServerModule;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayer;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayerSocket;

/**
 * 
 */
public class ClickWatchServerModuleTest extends AbstractTest {
	/** */
	private ClickWatchServerSocketPlayer player = null;
	/** */
	private Injector mInjector = null;
	
	@Test
	public void recorderServerTest(){
		//
		final String file = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/record.clickwatchmodel";
		//
		mInjector = Guice.createInjector(new ClickWatchServerModule() {
			@Override
			protected void overrideConfigure() {
				//
				java.net.URI uri = new File(file).toURI();
				//
				player = new ClickWatchServerSocketPlayer();
				//
				player.initialize(URI.createURI(uri.toString()));
				//
				bind(ClickWatchServerSocketPlayer.class).toInstance(player);
				//
				bind(IClickSocket.class).to(ClickWatchServerSocketPlayerSocket.class);	
			}
		});
		assertNotNull(mInjector.getInstance(ClickWatchServerSocketPlayer.class));
	}
	
	@Test
	public void standaloneServerTest(){
		/*
		final String file = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
		mModule.setClickWatchServerType(ClickWatchServerType.STANDALONE, file);
		*/		
	}
	

}
