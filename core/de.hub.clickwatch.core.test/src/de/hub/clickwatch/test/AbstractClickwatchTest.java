package de.hub.clickwatch.test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.junit.BeforeClass;

import click.ControlSocket.HandlerInfo;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.util.ClickSocketTestImpl;

public abstract class AbstractClickwatchTest {
	
	@BeforeClass
	public static void setupClass() {
		ClickWatchStandaloneSetup.doSetup();
	}
	
	protected final PrintStream getNullPrintStream() {
		return new PrintStream(new OutputStream() {			
			@Override
			public void write(int b) throws IOException {
				// empty;
			}
		});
	}
	
	protected final URI getTestRecordURI() {
		return URI.createFileURI("resources/test_record.clickwatchmodel");
	}
	
	protected final class HandlerDescr extends HandlerInfo {
		private String value;
		
		private HandlerDescr(String element, String handler, boolean canRead, boolean canWrite, String value) {
			super(element, handler, canRead, canWrite);
			this.value = value;
		}
	}
	
	private class ClickSocketSpecificTestImpl extends ClickSocketTestImpl {
		@Override
		public HandlerInfo[] getHandlers() {
			return handlers();
		}

		@Override
		public String getValue(String element, String handlerName) {
			for(HandlerDescr handler: handlers()) {
				if (handler.getElementName().equals(element) && handler.getHandlerName().equals(handlerName)) {
					return handler.value;
				}
			}
			return null;
		}

		@Override
		public void handleWrite(String element, String handler, String value) {
			AbstractClickwatchTest.this.handlerWrite(element, handler, value);
		}
	}
	
	protected IClickSocket getTestClickSocket() {
		return new ClickSocketSpecificTestImpl();
	}
	
	protected final HandlerDescr createHander(String element, String handler, String value) {
		return new HandlerDescr(element, handler, true, true, value);
	}
	
	protected final HandlerDescr createHander(String element, String handler, boolean canRead, boolean canWrite, String value) {
		return new HandlerDescr(element, handler, canRead, canWrite, value);
	}
	
	protected void handlerWrite(String element, String handler, String value) {
		
	}
	
	protected HandlerDescr[] handlers() {
		return new HandlerDescr[] { };
	}
}
