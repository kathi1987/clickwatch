package de.hub.clickwatch.tests;

import junit.framework.Assert;

import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class NodeAdapterTest extends AbstractAdapterTest {
	
	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}
	
	@Override
	protected HandlerInfo[] getHandler() {
		return new HandlerInfo[] { 
				new HandlerInfo("e", "empty", true, true),
				new HandlerInfo("e", "notempty", true, true),
				new HandlerInfo("e/e", "notempty", true, true),
		};
	}

	@Override
	protected String getValue(String element, String handler) {
		if (handler.equals("empty")) {
			return "";
		} else {
			return "text";
		}
	}

	@Test
	public void test() {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		INodeAdapter nodeAdapter = nodeConnection.getAdapter(INodeAdapter.class);
		
		nodeConnection.connect();
		Node node = nodeAdapter.pullNode();
		
		Assert.assertEquals(3, node.getAllHandlers().size());
		for (Handler handler: node.getAllHandlers()) {
			Assert.assertEquals(getValue("", handler.getName()), handler.getValue());
		}
		Assert.assertNotNull(node.getElement("e"));
		Assert.assertNotNull(node.getHandler("e/empty"));
		Assert.assertNotNull(node.getHandler("e/notempty"));
		Assert.assertNotNull(node.getHandler("e/e/notempty"));
		Assert.assertNotNull(node.getElement("e").getChild("e"));
		Assert.assertNotNull(node.getElement("e").getChild("e").getHandler("notempty"));
	}
}
