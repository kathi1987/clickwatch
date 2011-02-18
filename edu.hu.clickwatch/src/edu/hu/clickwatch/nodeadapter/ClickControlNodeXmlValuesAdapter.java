package edu.hu.clickwatch.nodeadapter;

import edu.hu.clickwatch.model.Handler;

/**
 * This adapter puts all values in a XML-container (i.e.
 * <value>orig_value</value>) and treats all values as xml.
 * 
 * @author Markus Scheidgen
 */
public class ClickControlNodeXmlValuesAdapter extends AbstractNodeAdapter {
	
	private static final IExtendedValueRepresentation defaultValueRepresentation = new DefaultXmlValueRepresentation();
	
	@Override
	protected IExtendedValueRepresentation getExtendedValueRepresentation(
			Handler handler) {
		return defaultValueRepresentation;
	}

}
