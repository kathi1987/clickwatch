package edu.hu.clickwatch.tests;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.util.Throwables;

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
}
