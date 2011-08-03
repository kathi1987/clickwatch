package de.hub.clickwatch.tests;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class HandlerAdapterStringValueTest extends AbstractAdapterTest {

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}
	
	@Override
	protected HandlerInfo[] getHandler() {
		return new HandlerInfo[] { 
				new HandlerInfo("e", "empty", true, true),
				new HandlerInfo("e", "notempty", true, true)
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
		IMetaDataAdapter metaDataAdapter = nodeConnection.getAdapter(IMetaDataAdapter.class);
		IPullHandlerAdapter handlerAdapter = nodeConnection.getAdapter(IPullHandlerAdapter.class);
		nodeConnection.connect();
		Node metaData = metaDataAdapter.pullAllMetaData();
		handlerAdapter.configure(metaData.getAllHandlers());
		Collection<Handler> handlers = handlerAdapter.pullHandler();
		
		Assert.assertEquals(2, handlers.size());
		for (Handler handler: handlers) {
			String name = handler.getName();
			Assert.assertEquals(getValue("", name.substring(name.lastIndexOf("/") + 1)), handler.getValue());
		}
	}
}
