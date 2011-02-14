package edu.hu.clickwatch.model;

import junit.framework.TestCase;

import com.google.common.base.Throwables;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.ClickSocketTestImpl;
import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;

public class ClickControlNodeAdapterTest extends TestCase {

	private static final String port = "7777";
	private static final String iPAddress = "192.168.3.31";
	
	private INodeAdapter modelAdapter = null;
	
	@Override
	public void setUp() {
		Injector injector = Guice.createInjector(new GuiceModule() {

			@Override
			public void configure() {
				bind(IClickSocket.class).to(ClickSocketTestImpl.class);
				bind(ClickControlNodeAdapter.class).to(ClickControlNodeXmlValuesAdapter.class);
			}
			
		});
		modelAdapter = injector.getInstance(ClickControlNodeAdapter.class);
	}
	
	public void testConnect() {
		try {
			((ClickControlNodeAdapter)modelAdapter).setUp(iPAddress, port);
			modelAdapter.connect();
			assertTrue(modelAdapter.isConnected());
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
	}
	
	public void testRetrieveAll() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		
		assertTrue(node.getElements().size() == 2);
		assertTrue(node.getElements().get(0).getHandlers().size() == 2);
		assertTrue(node.getElements().get(0).getHandlers().get(0).getValue().get(0).getValue().equals("value"));
	}
	
	public void testRetrieveHandlerValue() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		String value = modelAdapter.retrieveHandlerValue(node.getElements().get(0).getHandlers().get(0));
		assertTrue(value.equals("value"));
	}
	
	public void testUpdateHandlerValue() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		
		Handler handler = node.getElements().get(0).getHandlers().get(0);
		handler.getValue().setValue(0, "newValue");
		modelAdapter.updateHandlerValue(handler, handler.getValue());
		String value = modelAdapter.retrieveHandlerValue(handler);
		assertTrue(value.equals("newValue"));
	}
	
	public void testDisconnect() {
		testConnect();
		modelAdapter.disconnect();
		assertFalse(modelAdapter.isConnected());
	}

}
