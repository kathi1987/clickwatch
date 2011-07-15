package de.hub.clickwatch.tests;

import click.ControlSocket.HandlerInfo;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.tests.TestUtil.ClickSocketWrapper;
import de.hub.clickwatch.util.ClickSocketTestImpl;

public class AbstractAdapterTest extends AbstractTest {
	
	protected XmlModelRepository xmlModelRepository = null;
	protected ClickSocketWrapper clickSocketWrapper = null;
		
	protected class ClickSocketDefaultTestImpl extends ClickSocketTestImpl {

		@Override
		public HandlerInfo[] getHandlers() {
			return AbstractAdapterTest.this.getHandler();
		}

		@Override
		public String getValue(String element, String handler) {
			return AbstractAdapterTest.this.getValue(element, handler);
		}

		@Override
		public void handleWrite(String element, String handler, String value) {
			AbstractAdapterTest.this.handleWrite(element, handler, value);
		}
	}
	
	protected HandlerInfo[] getHandler() {
		return new HandlerInfo[] { };
	}
	
	protected String getValue(String element, String handler) {
		return "";
	}

	protected void handleWrite(String element, String handler, String value) {
		// empty
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketWrapper.class;
	}

	@Override
	protected void additionalSetUp() {
		clickSocketWrapper = (ClickSocketWrapper)injector.getInstance(IClickSocket.class);
		clickSocketWrapper.setSource(new ClickSocketDefaultTestImpl());
	}
	
}
