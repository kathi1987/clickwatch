package de.hub.clickwatch.tests;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.util.Throwables;

public class ClickControlNodeXmlValuesAdapterTest extends ClickControlNodeAdapterTest {
	
	boolean useStandardTestValue = true;

	@Override
	protected Object getNewHandlerValue(String strValue) {
		return injector.getInstance(XmlModelRepository.class).createXMLText(strValue);
	}

	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlNodeXmlValuesAdapter.class;
	}
	
	@Override
	public void testConnect() {
		try {
			((ClickControlNodeXmlValuesAdapter)modelAdapter).setUp(iPAddress, port);
			modelAdapter.connect();
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
		
		assertTrue(modelAdapter.isConnected());
		assertTrue(clickSocketWrapper.isConnected());
	}

	public void testRetrieveWithXmlValues() {
		useStandardTestValue = false;
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		
		TestUtil.query(node, "elem:e/handler:h/foo:x/bar:x/TEST:t");
		
		useStandardTestValue = true;
	}

	@Override
	protected String getTestValue() {
		if (useStandardTestValue) {
			return super.getTestValue();
		} else {
			return "<foo><bar>TEST</bar></foo>";
		}
	}
	
	@Override
	public void testRetrieveHandlerValue() {
		testConnect();
		Node node = modelAdapter.retrieve(null, null);
		checkDefaultNode(node);
		
		Handler handler = node.getElements().get(0).getHandlers().get(0);
		Object value = handler.getMixed().getValue(0);
		assertEquals("value", value);
	}
	
	@Override
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
}
