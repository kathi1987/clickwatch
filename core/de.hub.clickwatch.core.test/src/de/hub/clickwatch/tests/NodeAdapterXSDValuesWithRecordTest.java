package de.hub.clickwatch.tests;

import org.junit.Assert;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XSDValueAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;

public class NodeAdapterXSDValuesWithRecordTest extends AbstractTest {

	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "resources/" + NodeAdapterWithRecordTest.class.getSimpleName() + ".clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, true) };
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return XSDValueAdapter.class;
	}

	@Test
	public void testWithRecord() {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");
		connection.connect();
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		
		Node node = nodeAdapter.pullNode();
		Assert.assertNotNull(TestUtil.query(node, "192.168.3.152:n#device_wifi:e"));
	}
}
