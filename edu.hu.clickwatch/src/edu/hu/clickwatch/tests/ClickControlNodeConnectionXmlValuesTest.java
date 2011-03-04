package edu.hu.clickwatch.tests;

import java.util.ConcurrentModificationException;

import click.ControlSocket.HandlerInfo;
import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.tests.TestUtil.ClickSocketWrapper;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketTestImpl;

public class ClickControlNodeConnectionXmlValuesTest extends AbstractTest {

	private int exit = 0;
	private Network network = null;
	
	private Throwable exception = null;
	
	private static final ClickWatchModelFactory factory = ClickWatchModelFactory.eINSTANCE;
	
	@Override
	protected void additionalSetUp() {
		exception = null;
		exit = 0;
		network = factory.createNetwork();
		((ClickSocketWrapper)injector.getInstance(IClickSocket.class)).setSource(TestUtil.createClickSocket(10, 1, false));
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
	
	public void testMultipleConnectionsPerNode() {
		final int numberOfConnections = 10;
		final int numberOfUpdates = 10;
		
		final Node node = createNode();
		
		for (int i = 0; i < numberOfConnections; i++) {
			runInExtraThread(new Runnable() {
				@Override
				public void run() {
					final NodeConnectionTestImpl connection = injector.getInstance(NodeConnectionTestImpl.class);
					connection.setUp(node);
					connection.connect(null);
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
	
	public void testMulitpleNodesWithOneConnectionPerNode() {
		final int numberOfNodes = 10;
		final int numberOfUpdates = 5;
		
		for (int i = 0; i < numberOfNodes; i++) {
			runInExtraThread(new Runnable() {
				@Override
				public void run() {
					final Node node = createNode();
					final NodeConnectionTestImpl connection = injector.getInstance(NodeConnectionTestImpl.class);
					connection.setUp(node);
					connection.connect(null);
					connection.getNodeAdapter().connect();
					
					for (int j = 0; j < numberOfUpdates; j++) {
						connection.runUpdate();						
					}	
					
					exit++;
				}
			});
		}
		
		waitForExit(numberOfNodes);
	}
	
	public void testParallelUpdatesOnSameNode() {
		final int numberOfUpdates = 30;
		
		final Node node = createNode();
		final NodeConnectionTestImpl connection = injector.getInstance(NodeConnectionTestImpl.class);
		connection.setUp(node);
		connection.connect(null);
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
	
	public void testFilter() {
		((ClickSocketWrapper)injector.getInstance(IClickSocket.class)).setSource(
				new ClickSocketTestImpl() {			
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
		final NodeConnectionTestImpl connection = injector.getInstance(NodeConnectionTestImpl.class);
		connection.setUp(node);
		connection.connect(null);
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
