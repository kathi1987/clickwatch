package de.hub.clickwatch.tests;

import click.ControlSocket.HandlerInfo;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.ClickControlNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.tests.TestUtil.ClickSocketWrapper;
import de.hub.clickwatch.util.ClickSocketTestImpl;
import de.hub.clickwatch.util.Throwables;

public class ClickControlNodeAdapterTest extends AbstractTest {

	protected static final String port = "7777";
	protected static final String iPAddress = "192.168.3.31";

	protected INodeAdapter modelAdapter = null;
	protected XmlModelRepository xmlModelRepository = null;
	protected ClickSocketWrapper clickSocketWrapper = null;
		
	protected class ClickSocketDefaultTestImpl extends ClickSocketTestImpl {

		@Override
		public void handleWrite(String element, String handler, String value) {
			assertTrue("newValue".equals(value));
		}

		@Override
		public String getValue(String element, String handler) {
			return getTestValue();
		}

		@Override
		public HandlerInfo[] getHandler(String element) {
			return new HandlerInfo[] { new HandlerInfo("elem", "handler", true,
					true) };
		}

		@Override
		public String[] getElements() {
			return new String[] { "elem" };
		}
	}
	
	protected String getTestValue() {
		return "value";
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketWrapper.class;
	}

	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlNodeAdapter.class;
	}

	@Override
	protected void additionalSetUp() {
		modelAdapter = injector.getInstance(INodeAdapter.class);
		xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		clickSocketWrapper = (ClickSocketWrapper)injector.getInstance(IClickSocket.class);
		clickSocketWrapper.setSource(new ClickSocketDefaultTestImpl());
	}
		
	protected void checkDefaultNode(Node node) {		
		assertEquals(1, node.getElements().size());
		assertEquals("elem", node.getElements().get(0).getName());
		assertEquals(1, node.getElements().get(0).getHandlers().size());
		assertEquals("handler", node.getElements().get(0).getHandlers().get(0).getName());
		TestUtil.query(node, "elem:e/handler:h/value:t");
		assertEquals(true, node.getElements().get(0).getHandlers().get(0).isCanRead());
		assertEquals(true, node.getElements().get(0).getHandlers().get(0).isCanWrite());
	}
	
	public void testConnect() {
		try {
			((ClickControlNodeAdapter)modelAdapter).setUp(iPAddress, port);
			modelAdapter.connect();
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
		
		assertTrue(modelAdapter.isConnected());
		assertTrue(clickSocketWrapper.isConnected());
	}
	
	public void testRetrieveAll() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		
		checkDefaultNode(node);
	}
	
	public void testRetrieveAllWithMultipleElements() {
		clickSocketWrapper.setSource(new ClickSocketDefaultTestImpl() {
			@Override
			public String[] getElements() {
				return new String[] { "e1", "e2", "e3" };
			}
		});
		
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		
		assertEquals(3, node.getElements().size());
		
		for (int i = 0; i < 3; i++) {
			TestUtil.query(node, "e" + (i+1) + ":e/handler:h/value:t");
			assertEquals(true, node.getElements().get(i).getHandlers().get(0).isCanRead());
			assertEquals(true, node.getElements().get(i).getHandlers().get(0).isCanWrite());
		}
	}
	
	public void testRetrieveHandlerValue() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		checkDefaultNode(node);
		
		Handler handler = node.getElements().get(0).getHandlers().get(0);
		Object value = handler.getValue();
		assertEquals("value", value);
	}
	
	public void testUpdateHandlerValue() {
		clickSocketWrapper.setSource(new ClickSocketDefaultTestImpl() {
			@Override
			public void handleWrite(String element, String handler, String value) {
				assertEquals("newValue", value);
				assertEquals("elem", element);
				assertEquals("handler", handler);
			}
		});
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		checkDefaultNode(node);
		
		Handler handler = node.getElements().get(0).getHandlers().get(0);
		handler.setValue("newValue");
		modelAdapter.updateHandlerValue(handler);
	}
	
	protected Object getNewHandlerValue(String strValue) {
		return strValue;
	}
	
	public void testDisconnect() {
		testConnect();
		
		modelAdapter.disconnect();
		assertFalse(modelAdapter.isConnected());
		assertFalse(clickSocketWrapper.isConnected());
	}

}
