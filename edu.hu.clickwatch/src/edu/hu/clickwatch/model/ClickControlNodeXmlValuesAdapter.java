package edu.hu.clickwatch.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.common.base.Preconditions;

/**
 * This adapter puts all values in a XML-container (i.e.
 * <value>orig_value</value>) and treats all values as xml.
 * 
 * @author Markus Scheidgen
 */
public class ClickControlNodeXmlValuesAdapter extends AbstractXmlNodeAdapter {

	@Override
	protected void populateHandlerValueOfInternalNodeCopy(
			Handler internalHandlerCopy, String plainHandlerValue) {
		XMLTypeDocumentRoot xml = deserializeXml("<value>" + plainHandlerValue + "</value>");
		internalHandlerCopy.setValue((AnyType)((XMLTypeDocumentRoot)xml).getMixed().getValue(0));
	}

	@Override
	protected String getPlainHandlerValue(Object value) {
		Preconditions.checkArgument(value instanceof AnyType);
		
		AnyType valueAsXml = (AnyType)EcoreUtil.copy((EObject)value);
		
		XMLTypeDocumentRoot xml = deserializeXml("<value></value>");
		xml.getMixed().clear();
		xml.getMixed().addAll(valueAsXml.getMixed());

		String xmlString = serializeXml(xml);
		xmlString = xmlString.substring(xmlString.indexOf("?>\n") + 3);
		
		return xmlString;
	}
}
