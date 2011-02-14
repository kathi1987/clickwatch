package edu.hu.clickwatch.model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import edu.hu.clickwatch.XmlUtil;

public class AbstractXmlNodeAdapter extends ClickControlNodeAdapter {
	
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
		return !compareXml(modelCopy.getValue(), realityCopy.getValue());
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
}
