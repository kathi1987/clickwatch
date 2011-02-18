package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.nodeadapter.AbstractNodeAdapter.IExtendedValueRepresentation;

public class DefaultXmlValueRepresentation implements IExtendedValueRepresentation {
	
	@Inject
	private XmlModelRepository xmlRepo;
	
	protected DefaultXmlValueRepresentation() {
		// emtpy
	}
	
	@Override
	public void set(Handler handler, Object value) {
		handler.setValue((EObject)value);
	}
	
	@Override
	public boolean isNotificationChangingValue(Notification notification) {
		if (notification.getNotifier() instanceof Handler) {
			return notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Value();
		} else {
			return true;
		}
	}
	
	@Override
	public Object get(Handler handler) {
		return handler.getValue();
	}
	
	@Override
	public boolean equalsModelValueRealityValue(Object modelValue,
			Object realValue) {
//		return createPlainRealValue(modelValue).equals(createPlainRealValue(realValue));
		return compareXml(((AnyType)modelValue).getMixed(), ((AnyType)realValue).getMixed());
	}
	
	@Override
	public String createPlainRealValue(Object modelValue) {
		Preconditions.checkArgument(modelValue instanceof AnyType);
		
		AnyType valueAsXml = (AnyType)EcoreUtil.copy((EObject)modelValue);
		
		XMLTypeDocumentRoot xml = deserializeXml("<value></value>");
		xml.getMixed().clear();
		xml.getMixed().addAll(valueAsXml.getMixed());

		String xmlString = serializeXml(xml);
		xmlString = xmlString.substring(xmlString.indexOf("?>\n") + 3);
		
		EcoreUtil.delete(xml, true);
		
		return xmlString;
	}
	
	@Override
	public Object createModelValue(String plainRealValue) {	
		XMLTypeDocumentRoot xml = deserializeXml("<value>" + plainRealValue + "</value>");
		Object result = xml.getMixed().getValue(0); 
		xml.getMixed().remove(0);
		EcoreUtil.delete(xml, true);
		Preconditions.checkNotNull(result);
		return result;
	}
	
	private static boolean compareXml(FeatureMap v1, FeatureMap v2) {
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

	private XMLTypeDocumentRoot deserializeXml(String xml) {
		return (XMLTypeDocumentRoot)xmlRepo.deserializeXml(xml);
	}
	
	private String serializeXml(XMLTypeDocumentRoot xml) {
		return xmlRepo.serializeXml(xml);
	}
}
