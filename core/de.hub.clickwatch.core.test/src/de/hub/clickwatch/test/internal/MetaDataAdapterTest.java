package de.hub.clickwatch.test.internal;

import junit.framework.Assert;

import org.junit.Test;

import click.ControlSocket.HandlerInfo;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.test.AbstractClickwatchTest;

public class MetaDataAdapterTest extends AbstractClickwatchTest {

	@Override
	protected HandlerDescr[] handlers() {
		return new HandlerDescr[] {
			createHander("e1", "h1", true, true, ""),
			createHander("e1", "h2", true, false, ""),
			createHander("e1/e2", "h", true, true, ""),
			createHander("e2", "h", true, true, "")
		};
	}
	
	@Test
	public void test() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wClickSocketImpl(getTestClickSocket())
				.wDebugLvl(4).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		IMetaDataAdapter metaDataAdapter = nodeConnection.getAdapter(IMetaDataAdapter.class);
		Node metaData = metaDataAdapter.pullAllMetaData();
		
		for (HandlerInfo handlerInfo: handlers()) {
			Handler handler = metaData.getHandler(handlerInfo.getElementName() + "/" + handlerInfo.getHandlerName());
			Assert.assertNotNull(handler);
			Assert.assertEquals(handlerInfo.isCanRead(), handler.isCanRead());
			Assert.assertEquals(handlerInfo.isCanWrite(), handler.isCanWrite());
		}
	}
}
