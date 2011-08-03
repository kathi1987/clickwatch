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
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class HandlerAdapterXmlValuesTest extends AbstractAdapterTest {
	
	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return XmlValueAdapter.class;
	}
	
	@Override
	protected HandlerInfo[] getHandler() {
		return new HandlerInfo[] { 
				new HandlerInfo("e", "empty", true, true),
				new HandlerInfo("e", "notempty", true, true),
				new HandlerInfo("e", "xml", true, true)
		};
	}

	@Override
	protected String getValue(String element, String handler) {
		if (handler.equals("empty")) {
			return "";
		} else if (handler.equals("xml")){
			return "<foo><bar>TEST</bar></foo>";
		} else {
			return "TEST";
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
		
		Assert.assertEquals(3, handlers.size());
		for (Handler handler: handlers) {
			if (handler.getName().equals("e/empty")) {
				Assert.assertEquals(0, handler.getMixed().size());
				Assert.assertEquals(0, handler.getAny().size());
			} else if (handler.getName().equals("e/xml")){
				Assert.assertNotNull(TestUtil.query(handler, "e/xml:h#foo:x#bar[=TEST]:x"));
			} else {
				Assert.assertNotNull(TestUtil.query(handler, "e/notempty[=TEST]:x"));
			}
		}
	}
}
