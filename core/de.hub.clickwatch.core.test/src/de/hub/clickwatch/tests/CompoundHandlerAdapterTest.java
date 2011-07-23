package de.hub.clickwatch.tests;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.Handler;

public class CompoundHandlerAdapterTest extends AbstractTest {

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketImpl.class;
	}

	@Override
	protected Class<? extends IHandlerAdapter> getHandlerAdapterClass() {
		return CompoundHandlerAdapter.class;
	}
	
	@Override
	protected int getLogLevel() {
		return 4;
	}

	//	@Ignore("requires a click setup on localhost")
	@Test
	public void test() throws Exception {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection("localhost", "7777");
		IHandlerAdapter handlerAdapter = nodeConnection.getAdapter(IHandlerAdapter.class);
		nodeConnection.connect();
		
		IMetaDataAdapter metaDataAdapter = nodeConnection.getAdapter(IMetaDataAdapter.class);
		handlerAdapter.configure(metaDataAdapter.pullAllMetaData().getAllHandlers());
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(300);		
			Collection<Handler> handlers = handlerAdapter.pullHandler();
			Assert.assertTrue(handlers.size() >= 6);
			boolean hasValue = false;
			for (Handler handler: handlers) {
				if (handler.getValue() != null && !handler.getValue().trim().equals("")) {
					hasValue = true;
				}
			}
			Assert.assertTrue(hasValue);
		}
	}
}
