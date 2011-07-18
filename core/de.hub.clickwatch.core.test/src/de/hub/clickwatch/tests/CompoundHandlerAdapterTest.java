package de.hub.clickwatch.tests;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.model.Handler;

public class CompoundHandlerAdapterTest extends AbstractAdapterTest {
	
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
	
	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		//return ClickSocketWrapper.class;
		return ClickSocketImpl.class;
	}

	@Override
	protected Class<? extends IHandlerAdapter> getHandlerAdapterClass() {
		return CompoundHandlerAdapter.class;
	}
	
	@Override
	protected void additionalSetUp() {
		// empty but necessary (super is doing something for testing with
		// records that does not work with regular sockets.)
	}

	@Test
	public void test() {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection("localhost", "7777");
		IHandlerAdapter handlerAdapter = nodeConnection.getAdapter(IHandlerAdapter.class);
		nodeConnection.connect();

		Collection<Handler> handlers = handlerAdapter.pullHandler();
		Assert.assertTrue(handlers.size() == 2);
		boolean hasValue = false;
		for (Handler handler: handlers) {
			if (handler.getValue() != null && !handler.getValue().trim().equals("")) {
				hasValue = true;
			}
		}
		Assert.assertTrue(hasValue);
	}
}
