package edu.hu.clickwatch.tests;

import junit.framework.TestCase;
import click.ControlSocket.HandlerInfo;

import com.google.common.base.Throwables;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class ClickControlNodeAdapterTest extends TestCase {

	protected static final String port = "7777";
	protected static final String iPAddress = "192.168.3.31";

	protected GuiceModule guiceModule = null;
	protected INodeAdapter modelAdapter = null;
	protected ClickSocketTestImpl clickSocket = null;
	protected XmlModelRepository xmlModelRepository = null;
		
	private class ClickSocketDefaultTestImpl extends ClickSocketTestImpl {

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
	protected void setUp() throws Exception {
		setUp(new ClickSocketDefaultTestImpl());
	}

	private void setUp(final ClickSocketTestImpl clickSocket) {
		this.clickSocket = clickSocket;
		guiceModule = new GuiceModule() {
			@Override
			protected void overrideConfigure() {
				bind(IClickSocket.class).toInstance(clickSocket);
				if (getClickControlNodeAdapterClass() != null) {
					bind(INodeAdapter.class).to(getClickControlNodeAdapterClass());
				}
			}			
		};
		Injector injector = Guice.createInjector(guiceModule);
		modelAdapter = injector.getInstance(INodeAdapter.class);
		xmlModelRepository = injector.getInstance(XmlModelRepository.class);
	}
	
	protected Class<? extends INodeAdapter> getClickControlNodeAdapterClass() {
		return ClickControlNodeAdapter.class;
	}
	
	private void checkDefaultNode(Node node) {		
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
		assertTrue(clickSocket.isConnected());
	}
	
	public void testRetrieveAll() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		
		checkDefaultNode(node);
		
		System.out.println(xmlModelRepository.serializeXml(node));
	}
	
	public void testRetrieveAllWithMultipleElements() {
		setUp(new ClickSocketDefaultTestImpl() {
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
		Object value = modelAdapter.getValueRepresentation(handler).get(handler);
		assertEquals("value", value);
	}
	
	public void testUpdateHandlerValue() {
		setUp(new ClickSocketDefaultTestImpl() {
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
		modelAdapter.updateHandlerValue(handler, "newValue");
	}
	
	protected Object getNewHandlerValue(String strValue) {
		return strValue;
	}
	
	public void testDisconnect() {
		testConnect();
		
		modelAdapter.disconnect();
		assertFalse(modelAdapter.isConnected());
		assertFalse(clickSocket.isConnected());
	}

}
