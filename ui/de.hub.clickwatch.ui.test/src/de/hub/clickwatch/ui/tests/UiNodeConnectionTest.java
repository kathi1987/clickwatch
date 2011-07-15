package de.hub.clickwatch.ui.tests;

import org.junit.Assert;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.tests.TestUtil;

public class UiNodeConnectionTest extends AbstractUITest {
	
	private INodeConnection connection = null;
	private Node node;
	private Object handlerAfterFirstUpdate = null;
	private Object xmlAfterFirstUpdate = null;

	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "resources/TestRecord.clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Test
	public void testWithRecord() throws Exception {
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		network.setElementFilter("device_wifi/link_stat");
		network.setHandlerFilter("bcast_stats");
		node = ClickWatchModelFactory.eINSTANCE.createNode();
		network.getNodes().add(node);
		node.setINetAddress("192.168.3.152");
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		connection = ncp.createConnection(node);
		connection.connect();
			
		Assert.assertNotNull(TestUtil.query(node, "192.168.3.152:n#device_wifi:e#link_stat:e#bcast_stats:h#entry:x"));
		Assert.assertTrue(!node.isConnected());
		
		Object handlerAtEnd = TestUtil.query(node, "192.168.3.152:n#device_wifi:e#link_stat:e#bcast_stats:h");
		Object xmlAtEnd = TestUtil.query(node, "192.168.3.152:n#device_wifi:e#link_stat:e#bcast_stats:h#entry:x");
		
		Assert.assertEquals(handlerAtEnd, handlerAfterFirstUpdate);
		Assert.assertEquals(xmlAtEnd, xmlAfterFirstUpdate);
	}

	@Override
	protected void runBetweenThreads(int run) {
		if (run == 2) {
			Assert.assertTrue(node.isConnected());
			xmlAfterFirstUpdate = TestUtil.query(node, "192.168.3.152:n#device_wifi:e#link_stat:e#bcast_stats:h#entry:x");
			Assert.assertNotNull(xmlAfterFirstUpdate);
			handlerAfterFirstUpdate = TestUtil.query(node, "192.168.3.152:n#device_wifi:e#link_stat:e#bcast_stats:h");		
		} else if (run > 20){
			connection.disconnect();	
		}
	}
	
}
