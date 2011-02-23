package edu.hu.clickwatch.nodeadapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.nodeadapter.AbstractNodeAdapter.IExtendedValueRepresentation;

public class DefaultXmlValueRepresentation implements IExtendedValueRepresentation {
	
	protected class ValueClass {
		private final Object value;
		private final EStructuralFeature feature;
		
		public ValueClass(Object value, EStructuralFeature feature) {
			super();
			this.value = value;
			this.feature = feature;
		}
	}
	
	@Inject
	private XmlModelRepository xmlModelRepository;
	
	protected DefaultXmlValueRepresentation() {
		// emtpy
	}
	
	@Override
	public void set(Handler handler, Object value) {
		if (value == null) {
			return;
		}
		
		if (value instanceof ValueClass) {
			Object anyValue = ((ValueClass)value).value;
			EStructuralFeature anyFeature = ((ValueClass)value).feature;
			
			if (anyValue instanceof String) {
				if (handler.getMixed().isEmpty()) {
					handler.getMixed().add(FeatureMapUtil.createRawEntry(anyFeature, anyValue));
				} else {
					handler.getMixed().set(0, FeatureMapUtil.createRawEntry(anyFeature, anyValue));
				}
			} else {
				if (handler.getAny().isEmpty()) {
					handler.getAny().add(FeatureMapUtil.createRawEntry(anyFeature, anyValue));
				} else {
					handler.getAny().set(0, FeatureMapUtil.createRawEntry(anyFeature, anyValue));
				}
			}
		} else {
			Preconditions.checkState(!(handler.getAny().isEmpty() && handler.getMixed().isEmpty()));
			if (handler.getAny().isEmpty()) {
				handler.getMixed().setValue(0, value);
			} else {
				handler.getAny().setValue(0, value);
			}
		}
	}
	
	@Override
	public boolean isNotificationChangingValue(Notification notification) {
		if (notification.getNotifier() instanceof Handler) {
			return notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Any() ||
					notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Mixed();
		} else {
			return true;
		}
	}
	
	@Override
	public Object get(Handler handler) {
		FeatureMap mixed = handler.getMixed();
		if (mixed.isEmpty()) {
			if (handler.getAny().isEmpty()) {
				return null;
			} else {
				return handler.getAny().getValue(0);
			}
		} else {
			return mixed.getValue(0);
		}
	}
	
	@Override
	public boolean equalsModelValueRealityValue(Object modelValue,
			Object realValue) {
		if (modelValue == null || realValue == null) {
			return false;
		}
		
		if (modelValue instanceof String) {
			return modelValue.equals(realValue);
		} else if (modelValue instanceof AnyType) {
			if (realValue instanceof AnyType) {
				return compareXml(((AnyType)modelValue).getMixed(), ((AnyType)realValue).getMixed());
			} else {
				return false;
			}
		} else {
			Preconditions.checkArgument(false, "unsupported model value types");
			return false;
		}
	}
	
	@Override
	public String createPlainRealValue(Object modelValue) {	
		XMLTypeDocumentRoot xml = XMLTypeFactory.eINSTANCE.createXMLTypeDocumentRoot();
		if (modelValue instanceof String) {
			xml.getMixed().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), modelValue);
		} else if (modelValue instanceof AnyType) {
			xml.getMixed().add(((EObject)modelValue).eContainingFeature(), EcoreUtil.copy((EObject)modelValue));
		} else {
			Preconditions.checkArgument(false);	
		}

		String xmlString = xmlModelRepository.serializeXml(xml);
		xmlString = xmlString.substring(xmlString.indexOf("?>\n") + 3);
		
		EcoreUtil.delete(xml, true);
		
		return xmlString;
	}
	
	@Override
	public Object createModelValue(String plainRealValue) {		
		plainRealValue = plainRealValue.replaceFirst("^<\\?[^\\?]+\\?>", "").trim();
		XMLTypeDocumentRoot xml = (XMLTypeDocumentRoot)xmlModelRepository.deserializeXml("<xml>" + plainRealValue + "</xml>");
		FeatureMap xmlRootMixed = ((AnyType)xml.getMixed().getValue(0)).getMixed();
		if (xmlRootMixed.size() > 0) {
			for(FeatureMap.Entry entry: xmlRootMixed) {
				Object anyValue = entry.getValue();
				if (!(anyValue == null || (anyValue instanceof String && "".equals(((String)anyValue).trim())))) {
					EStructuralFeature anyFeature = entry.getEStructuralFeature();
					xmlRootMixed.remove(anyValue);
					xmlRootMixed.remove(anyFeature);
					EcoreUtil.delete(xml, true);
					Preconditions.checkNotNull(anyValue);
					return new ValueClass(anyValue, anyFeature);		
				}
			}					
		}
		return new ValueClass("", XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text());
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
}
