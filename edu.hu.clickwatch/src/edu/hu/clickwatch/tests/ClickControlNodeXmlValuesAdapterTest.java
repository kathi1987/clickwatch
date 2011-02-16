package edu.hu.clickwatch.tests;

import edu.hu.clickwatch.XmlUtil;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class ClickControlNodeXmlValuesAdapterTest extends ClickControlNodeAdapterTest {

	@Override
	protected Object getNewHandlerValue(String strValue) {
		return XmlUtil.createXMLText(strValue);
	}

	@Override
	protected Class<? extends INodeAdapter> getClickControlNodeAdapterClass() {
		return ClickControlNodeXmlValuesAdapter.class;
	}
	
}
