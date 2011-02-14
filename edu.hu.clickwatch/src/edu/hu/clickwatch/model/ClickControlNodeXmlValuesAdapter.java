package edu.hu.clickwatch.model;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
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
		internalHandlerCopy.getValue().addAll(
				((AnyType)xml.getMixed().getValue(0)).getMixed());
	}
	
	@Override
	protected void doUpdateHandlerValue(Handler handler, Object value) {
		Preconditions.checkArgument(value instanceof FeatureMap);
		
		FeatureMap valueAsXml = (FeatureMap)
			((Handler)EcoreUtil.copy(((EStructuralFeature.Setting)value).getEObject())).getValue();
		
		XMLTypeDocumentRoot xml = deserializeXml("<value></value>");
		xml.getMixed().clear();
		xml.getMixed().addAll(valueAsXml);

		String xmlString = serializeXml(xml);
		xmlString = xmlString.substring(xmlString.indexOf("?>\n") + 3);
		super.doUpdateHandlerValue(handler, xmlString);
	}

}
