package de.hub.clickwatch.tests;

import junit.framework.Assert;

import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class MetaDataAdapterTest extends AbstractAdapterTest {

	@Override
	protected HandlerInfo[] getHandler() {
		return new HandlerInfo[] { 
				new HandlerInfo("e1", "h1", true, true),
				new HandlerInfo("e1", "h2", true, false),
				new HandlerInfo("e1/e2", "h", true, true),
				new HandlerInfo("e2", "h", true, true),
		};
	}
	
	@Test
	public void test() {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		IMetaDataAdapter metaDataAdapter = nodeConnection.getAdapter(IMetaDataAdapter.class);
		nodeConnection.connect();
		Node metaData = metaDataAdapter.pullAllMetaData();
		
		for (HandlerInfo handlerInfo: getHandler()) {
			Handler handler = metaData.getHandler(handlerInfo.getElementName() + "/" + handlerInfo.getHandlerName());
			Assert.assertNotNull(handler);
			Assert.assertEquals(handlerInfo.isCanRead(), handler.isCanRead());
			Assert.assertEquals(handlerInfo.isCanWrite(), handler.isCanWrite());
		}
	}
}
