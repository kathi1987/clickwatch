package edu.hu.clickwatch.server.tests;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import com.google.common.base.Throwables;


import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.server.XmlModelRepository;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeAdapter;
import edu.hu.clickwatch.server.node.INodeAdapter;
import edu.hu.clickwatch.server.socket.ClickWatchServerSocketPlayerSocket;
import edu.hu.clickwatch.server.tests.TestUtil.ClickSocketWrapper;

import click.ControlSocket.HandlerInfo;


public class ClickWatchNodeAdapterTest extends AbstractTest {

	protected static final String port = "7777";
	protected static final String iPAddress = "192.168.3.31";

	protected INodeAdapter modelAdapter = null;
	protected XmlModelRepository xmlModelRepository = null;
	protected ClickSocketWrapper clickSocketWrapper = null;
		
	private class ClickSocketDefaultTestImpl extends ClickWatchServerSocketPlayerSocket {

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
		return ClickWatchServerNodeAdapter.class;
	}

	@Override
	protected void additionalSetUp() {
		modelAdapter = getInjector().getInstance(INodeAdapter.class);
		xmlModelRepository = getInjector().getInstance(XmlModelRepository.class);
		clickSocketWrapper = (ClickSocketWrapper)getInjector().getInstance(IClickSocket.class);
		clickSocketWrapper.setSource(new ClickSocketDefaultTestImpl());
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
	
	@Test
	public void testConnect() {
		try {
			((ClickWatchServerNodeAdapter)modelAdapter).setUp(iPAddress, port);
			modelAdapter.connect();
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
		
		assertTrue(modelAdapter.isConnected());
		assertTrue(clickSocketWrapper.isConnected());
	}
	
	@Test
	public void testRetrieveAll() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		
		checkDefaultNode(node);
	}
	
	@Test
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
	
	@Test
	public void testRetrieveHandlerValue() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		checkDefaultNode(node);
		
		Handler handler = node.getElements().get(0).getHandlers().get(0);
		Object value = handler.getMixed().getValue(0);
		assertEquals("value", value);
	}
	
	@Test
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
		handler.getMixed().set(0, FeatureMapUtil.createTextEntry("newValue"));
		modelAdapter.updateHandlerValue(handler);
	}
	
	protected Object getNewHandlerValue(String strValue) {
		return strValue;
	}
	
	@Test
	public void testDisconnect() {
		testConnect();
		
		modelAdapter.disconnect();
		assertFalse(modelAdapter.isConnected());
		assertFalse(clickSocketWrapper.isConnected());
	}

}
