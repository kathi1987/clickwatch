package de.hub.clickwatch.test.internal;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IErrorAdapter.IErrorListener;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.test.AbstractClickwatchTest;
import de.hub.clickwatch.util.ClickSocketTestImpl;

public class ErrorAdapterTest extends AbstractClickwatchTest {
	
	private int errorCount = 0;
	
	private class ErrorClickSocket extends ClickSocketTestImpl {
		
		private final boolean errorDuringConnect;
		private final boolean errorDuringWrite;
		private final boolean errorDuringRead;
		
		private ErrorClickSocket(boolean errorDuringConnect,
				boolean errorDuringWrite, boolean errorDuringRead) {
			super();
			this.errorDuringConnect = errorDuringConnect;
			this.errorDuringWrite = errorDuringWrite;
			this.errorDuringRead = errorDuringRead;
		}

		@Override
		public void connect(String host, int port, int timeout)
				throws IOException {
			if (errorDuringConnect) {
				throw new RuntimeException("test error");
			}
		}

		@Override
		public void handleWrite(String element, String handler, String value) {
			if (errorDuringWrite) {
				throw new RuntimeException("test error");
			}
		}
		
		@Override
		public String getValue(String element, String handler) {
			if (errorDuringRead) {
				throw new RuntimeException("test error");
			} else {
				return "";
			}
		}
	};
	
	private final IErrorListener errorListener = new IErrorListener() {		
		@Override
		public void handlerError(String message, Throwable e) {
			if (errorCount == 0) {
				Assert.assertEquals("test error", e.getMessage());
			}
			errorCount++;
		}
	};

	@Test
	public void testErrorDuringConnect() throws Exception {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wClickSocketImpl(new ErrorClickSocket(true, false, false))
				.wDebug(4, getNullPrintStream()).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection(null, "0");
		IErrorAdapter errorAdapter = connection.getAdapter(IErrorAdapter.class);
		errorAdapter.addErrorListener(errorListener);		
		Assert.assertEquals(0, errorCount);
		connection.getAdapter(IHandlerAdapter.class).getHandler("test/test");
		Thread.sleep(100);
		Assert.assertTrue(errorCount >= 1);
	}
	
	@Test
	public void testErrorDuringRead() throws Exception {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wClickSocketImpl(new ErrorClickSocket(false, false, true))
				.wDebug(4, getNullPrintStream()).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection(null, "0");
		IErrorAdapter errorAdapter = connection.getAdapter(IErrorAdapter.class);
		errorAdapter.addErrorListener(errorListener);		
		Assert.assertEquals(0, errorCount);
		connection.getAdapter(IHandlerAdapter.class).getHandler("test/test");
		Thread.sleep(100);
		Assert.assertEquals(1, errorCount);
	}
	
	@Test
	public void testErrorDuringWrite() throws Exception {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wClickSocketImpl(new ErrorClickSocket(false, true, false))
				.wDebug(4, getNullPrintStream()).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection(null, "0");
		IErrorAdapter errorAdapter = connection.getAdapter(IErrorAdapter.class);
		errorAdapter.addErrorListener(errorListener);
		Assert.assertEquals(0, errorCount);
		connection.getAdapter(IHandlerAdapter.class).getHandler("test/test");
		Assert.assertEquals(0, errorCount);
		Handler handlerToWrite = connection.getAdapter(IValueAdapter.class).create("test/test", 0, "test");
		connection.getAdapter(IHandlerAdapter.class).setHandler(handlerToWrite);
		Thread.sleep(100);
		Assert.assertEquals(1, errorCount);
	}
}
