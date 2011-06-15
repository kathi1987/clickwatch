package edu.hu.clickwatch.server.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ConcurrentModificationException;

import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.server.ClickWatchServer;
import edu.hu.clickwatch.server.node.ClickControlNodeConnection;
import edu.hu.clickwatch.server.node.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.server.node.INodeAdapter;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayerSocket;
import edu.hu.clickwatch.server.tests.TestUtil.ClickSocketWrapper;

/**
 * 
 */
public class ClickControlNodeConnectionXmlValuesTest extends AbstractTest {
    /** */
	private int exit = 0;
	/** */
	private Network network = null;
	/** */
	private Throwable exception = null;
	/** A instance of the ClickWatch model factory in order to create new nodes, networks, etc. */	
	private static final ClickWatchModelFactory factory = ClickWatchModelFactory.eINSTANCE;
	/** The path to the standard configuration file which is used in this junit test */
	private String mConfigurationFile = "src/test/resources/" + ClickWatchServerTest.class.getPackage().getName().replace(".", "/") + "/configuration.xml";
	
	@Override
	protected void additionalSetUp() {
		exception = null;
		exit = 0;
		network = factory.createNetwork();
		((ClickSocketWrapper)getInjector().getInstance(IClickSocket.class)).setSource(TestUtil.createClickSocket(10, 1, false));
		// Get the server instance
		ClickWatchServer server = getInjector().getInstance(ClickWatchServer.class);
		// Reset the configuration file and set a new configuration file
		server.setConfigurationFile(this.mConfigurationFile);
		// Read the configuration file
		server.readConfiguration();
	}
	
	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlNodeXmlValuesAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketWrapper.class;
	}
	
	private void waitForExit(int exit) {
		while (this.exit < exit && this.exit >= 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (exception != null) {
			assertTrue(exception.getClass().getSimpleName() + ": " + exception.getMessage(), false);
		}
	}
	
	private Node createNode() {
		Node node = factory.createNode();
		network.getNodes().add(node);
		return node;
	}
	
	@Test
	public void testMultipleConnectionsPerNode() {
		final int numberOfConnections = 10;
		final int numberOfUpdates = 10;
		
		final Node node = createNode();
		
		for (int i = 0; i < numberOfConnections; i++) {
			runInExtraThread(new Runnable() {
				@Override
				public void run() {
					final ClickControlNodeConnection connection = getInjector().getInstance(ClickControlNodeConnection.class);
					connection.setUp(node);
					connection.connect();
					connection.getNodeAdapter().connect();
					
					for (int j = 0; j < numberOfUpdates; j++) {
						connection.runUpdate();						
					}	
					
					exit++;
				}
			});
		}
		
		waitForExit(numberOfConnections);
	}
	
	@Test
	public void testParallelUpdatesOnSameNode() {
		final int numberOfUpdates = 30;
		
		final Node node = createNode();
		final ClickControlNodeConnection connection = getInjector().getInstance(ClickControlNodeConnection.class);
		connection.setUp(node);
		connection.connect();
		connection.getNodeAdapter().connect();
		
		for (int i = 0; i < numberOfUpdates; i++) {
			runInExtraThread(new Runnable() {
				@Override
				public void run() {
					connection.runUpdate();
					exit++;
				}
			});
		}
		
		waitForExit(numberOfUpdates);
	}
	
	@Test
	public void testFilter() {
		((ClickSocketWrapper)getInjector().getInstance(IClickSocket.class)).setSource(
				new ClickWatchServerSocketPlayerSocket() {			
			@Override
			public void handleWrite(String element, String handler, String value) {
				// emtpy
			}
			
			@Override
			public String getValue(String element, String handler) {
				return "<foo><bar>TEXT</bar></foo>";
			}
			
			@Override
			public HandlerInfo[] getHandler(String element) {
				return new HandlerInfo[] { new HandlerInfo(element, "h", true, true) };
			}
			
			@Override
			public String[] getElements() {
				return new String[] { "device_wifi/link_stat", "device_wifi/foo", "bar"};
			}
		});
		
		final Node node = createNode();
		final ClickControlNodeConnection connection = getInjector().getInstance(ClickControlNodeConnection.class);
		connection.setUp(node);
		connection.connect();
		//
		connection.getNodeAdapter().connect();
		
		network.setElementFilter("device_wifi/link_stat");
		connection.runUpdate();
	
		assertEquals(1, node.getElements().size());
		assertEquals(1, node.getElements().get(0).getChildren().size());
		
		network.setElementFilter("");
		connection.runUpdate();
		
		assertEquals(2, node.getElements().size());
		assertEquals(2, node.getElements().get(0).getChildren().size());
	}
	
	private void runInExtraThread(final Runnable runnable) {
		new Thread() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (ConcurrentModificationException e) {
					exit = -1;
					exception = e;
				} catch (final Throwable e) {
					exit = -1;
					exception = e;
				}
			}
		}.start();
	}
}
