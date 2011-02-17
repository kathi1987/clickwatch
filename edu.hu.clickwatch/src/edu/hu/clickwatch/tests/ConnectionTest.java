package edu.hu.clickwatch.tests;

import java.util.ConcurrentModificationException;

import junit.framework.TestCase;

import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class ConnectionTest extends TestCase {

	private int exit = 0;
	private Injector injector = null;
	private Network network = null;
	
	private Throwable exception = null;
	
	private static final ClickWatchModelFactory factory = ClickWatchModelFactory.eINSTANCE;
	
	@Override
	public void setUp() {
		exception = null;
		exit = 0;
		final IClickSocket clickSocket = TestUtil.createClickSocket(10, 1, true);
		injector = Guice.createInjector(new GuiceModule() {
			@Override
			public void configure() {
				bind(IClickSocket.class).toInstance(clickSocket);
				bind(INodeAdapter.class).to(ClickControlNodeXmlValuesAdapter.class);
			}			
		});
		
		network = factory.createNetwork();
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
