package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.common.base.Preconditions;

import edu.hu.clickwatch.XmlUtil;
import edu.hu.clickwatch.model.Handler;

/**
 * This adapter puts all values in a XML-container (i.e.
 * <value>orig_value</value>) and treats all values as xml.
 * 
 * @author Markus Scheidgen
 */
public class ClickControlNodeXmlValuesAdapter extends ClickControlNodeAdapter {
	
	@Override
	public boolean determineHandlerHasChangedInModel(Notification notification) {
		if (notification.getNotifier() instanceof Handler) {
			return super.determineHandlerHasChangedInModel(notification);
		} else {
			return true;
		}
	}
	
	@Override
	public boolean determineHandlerHasChangedInReality(Handler modelCopy,
			Handler realityCopy) {
		return !compareXml(modelCopy.getValue().getMixed(), realityCopy.getValue().getMixed());
	}

	private boolean compareXml(FeatureMap v1, FeatureMap v2) {
		if (v1.size() != v2.size()) {
			return false;
		}
		int i = 0;
		for (FeatureMap.Entry e1: v1) {
			FeatureMap.Entry e2 = v2.get(i++);

			if (!e1.getEStructuralFeature().getName().equals(e2.getEStructuralFeature().getName())) {
				return false;
			}
			if (e1.getValue() instanceof AnyType && e2.getValue() instanceof AnyType) {
				if (!compareXml(((AnyType)e1.getValue()).getMixed(), ((AnyType)e2.getValue()).getMixed())) {
					return false;
				}
			} else {
				if (!e1.getValue().equals(e2.getValue())) {
					return false;
				}
			}
		}
		return true;
	}

	protected static XMLTypeDocumentRoot deserializeXml(String xml) {
		return (XMLTypeDocumentRoot)XmlUtil.deserializeXml(xml);
	}
	
	protected static String serializeXml(XMLTypeDocumentRoot xml) {
		return XmlUtil.serializeXml(xml);
	}

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
