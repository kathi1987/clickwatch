package de.hub.clickwatch.test.internal;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.test.ClickwatchTest;

public class StringValueAdapterTest extends ClickwatchTest {
	
	@Override
	protected HandlerDescr[] handlers() {
		return new HandlerDescr[] {
			createHander("e", "empty", true, true, ""),
			createHander("e1", "notempty", true, true, "text")
		};
	}

	@Test
	public void test() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wClickSocketImpl(getTestClickSocket())
				.wDebugLvl(4)
				.wValueAdapterClass(StringValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		INodeAdapter handlerAdapter = nodeConnection.getAdapter(INodeAdapter.class);

		Collection<Handler> handlers = handlerAdapter.pullNode().getAllHandlers();
		
		Assert.assertEquals(handlers().length, handlers.size());
		for (Handler handler: handlers) {
			String name = handler.getName();
			if (name.equals("empty")) {
				Assert.assertEquals("", handler.getValue());
			} else if (name.equals("notempty")) {
				Assert.assertEquals("text", handler.getValue());
			} else {
				Assert.assertTrue(false);
			}
		}
	}
}
