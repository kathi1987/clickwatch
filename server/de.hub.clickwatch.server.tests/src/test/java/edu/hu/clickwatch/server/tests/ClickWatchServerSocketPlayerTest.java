package edu.hu.clickwatch.server.tests;

import org.junit.Test;

import com.google.inject.AbstractModule;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeAdapter;
import edu.hu.clickwatch.server.node.INodeAdapter;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayer;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayerSocket;

/**
 * 
 * @author Markus Scheidgen, Michael Frey
 */
public class ClickWatchServerSocketPlayerTest extends AbstractTest {
	
	/**
	 * A get-method which returns the implementation of an INodeAdapter interface
	 * @return The implementation of an INodeAdapter
	 */
	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickWatchServerNodeAdapter.class;
	}
	
	/**
	 *
	 * @return
	 */
	@Override
	protected AbstractModule[] getAdditionalModules() {
		return new AbstractModule[] { new ClickWatchServerSocketPlayer.PlayerModule() };
	}
	
	/**
	 * A get-method which returns the implementation of an IClickSocket interface
	 * @return The implementation of an IClicksocket
	 */
	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickWatchServerSocketPlayerSocket.class;
	}
	
	/**
	 * The methods tests if an node adapter is capable of establishing a recorded session and
	 * retrieving recorded data.
	 */
	@Test
	public void testWithRecord() {
		INodeAdapter nodeAdapter = getInjector().getInstance(INodeAdapter.class);
		((ClickWatchServerNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
		nodeAdapter.connect();
		nodeAdapter.retrieve("", "");
	}
}

