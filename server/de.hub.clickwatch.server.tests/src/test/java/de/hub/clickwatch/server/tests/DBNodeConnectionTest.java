package de.hub.clickwatch.server.tests;


import java.math.BigInteger;

import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.cdo.CDOHandler;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.IConnectionConfiguration;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.ClickControlNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.server.DBNodeConnection;
import de.hub.clickwatch.tests.AbstractTest;
import de.hub.clickwatch.tests.TestConnectionConfiguration;

public class DBNodeConnectionTest extends AbstractTest {
	private Network network = null;
	
	
	private static final ClickWatchModelFactory factory = ClickWatchModelFactory.eINSTANCE;
	
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "src/test/resources/" + DBNodeConnectionTest.class.getPackage().getName().replace(".", "/") + "/" 
				+ DBNodeConnectionTest.class.getSimpleName() + ".clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record) };
	}
	
	
	
	@Override
	protected IConnectionConfiguration getConnectionConfiguration() {
		return new TestConnectionConfiguration() {
			@Override
			public void runInExtraThread(final Runnable runnable) {
				new Thread(runnable, "ConnectionConfiguration Thread").start();
			}
		};
	}

	private Node createNode() {
		Node node = factory.createNode();
		network.getNodes().add(node);
		return node;
	}
	
	@Override
	protected void additionalSetUp() {
		network = factory.createNetwork();
		network.setUpdateIntervall(1);
	}
	
	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlNodeAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Test
	public void testWithRecord() {
		DBNodeConnection nodeConnection = injector.getInstance(DBNodeConnection.class);
		Node node = createNode();
		node.setPort("7777");
		node.setINetAddress("192.168.3.152");
		nodeConnection.setUp(node);
		nodeConnection.setDatabaseHandler(new CDOHandler("127.0.0.1",  BigInteger.valueOf(2036) , "clicktest"));
		nodeConnection.connect(null);
		
		sleep();
		
		nodeConnection.disconnect();
	
		sleep();
	}
	
	private static void sleep(){
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
