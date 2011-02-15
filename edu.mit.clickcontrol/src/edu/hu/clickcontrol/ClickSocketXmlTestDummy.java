package edu.hu.clickcontrol;

import com.google.common.base.Throwables;

public class ClickSocketXmlTestDummy extends ClickSocketTestDummy {

	@Override
	protected String getDefaultValue() {
		return "<foo><bar attr='one'>TEXT</bar><empty/></foo>";
	}

	@Override
	protected void updateAdditionalHandler(String elementName,
			String handlerName, char[] charArray) {
		// empty
		try {
			doWrite(elementName, handlerName, "<foo>BACK</foo>".toCharArray());
		} catch (Exception e) {
			Throwables.propagate(e);
		}
	}

}
