package de.hub.clickwatch.connection.adapter.values;

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

import de.hub.clickwatch.connection.adapter.internal.AbstractValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.util.ILogger;
import de.hub.emfxml.util.EmfXmlUtil;

public class XmlValueAdapter extends AbstractValueAdapter implements IValueAdapter {

    @Inject ILogger logger;
    
	@Override
	protected void setValue(Handler handler, String plainRealValue) {
		plainRealValue = EmfXmlUtil.stripProcessingInstructions(plainRealValue);
		XMLTypeDocumentRoot xml = null;
		try {
		    xml = (XMLTypeDocumentRoot)EmfXmlUtil.deserializeXml("<xml>" + plainRealValue + "</xml>");
		} catch (Exception e) {
		    logger.log(ILogger.WARNING, "could not parse handler value xml of handler " + handler.getQualifiedName() + ": " + plainRealValue, e);
		    return;
		}
		FeatureMap xmlRootMixed = ((AnyType)xml.getMixed().getValue(0)).getMixed();
		if (xmlRootMixed.size() > 0) {
			for(FeatureMap.Entry entry: xmlRootMixed) {
				Object anyValue = entry.getValue();
				if (!(anyValue == null || (anyValue instanceof String && "".equals(((String)anyValue).trim())))) {
					EStructuralFeature anyFeature = entry.getEStructuralFeature();
					FeatureMap map = anyValue instanceof String ? handler.getMixed() : handler.getAny();
					if (map.isEmpty()) {
						map.add(FeatureMapUtil.createRawEntry(anyFeature, anyValue));
					} else {
						map.set(0, FeatureMapUtil.createRawEntry(anyFeature, anyValue));
					}
					EcoreUtil.delete(xml, true);
					return;
				}
			}					
		}
	}

	@Override
	public String getPlainValue(Handler handler) {
		Object modelValue;
		FeatureMap any = handler.getAny();
		if (!any.isEmpty()) {
			modelValue = any.get(0);
		} else {
			FeatureMap mixed = handler.getMixed();
			if (mixed.isEmpty()) {
				modelValue = null;
			} else {
				modelValue = mixed.get(0);
			}
		}
		
		XMLTypeDocumentRoot xml = XMLTypeFactory.eINSTANCE.createXMLTypeDocumentRoot();
		if (modelValue == null) {
			return "";
		} if (modelValue instanceof String) {
			xml.getMixed().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), modelValue);
		} else if (modelValue instanceof FeatureMap.Entry) {
			FeatureMap.Entry fmeValue = (FeatureMap.Entry)modelValue;
			if (fmeValue.getValue() instanceof String) {
//				xml.getMixed().add(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), fmeValue.getValue());
				xml.getMixed().add(FeatureMapUtil.createEntry(fmeValue.getEStructuralFeature(), fmeValue.getValue()));
			} else {
				xml.getMixed().add(FeatureMapUtil.createEntry(fmeValue.getEStructuralFeature(), EcoreUtil.copy((EObject)fmeValue.getValue())));
			}
		} else {
			Preconditions.checkArgument(false);	
		}

		String xmlString = EmfXmlUtil.serializeXml(xml);
		xmlString = xmlString.substring(xmlString.indexOf("?>\n") + 3);
		
		EcoreUtil.delete(xml, true);
		
		return xmlString;
	}

	@Override
	public void moveValue(Handler source, Handler target) {
		FeatureMap any = target.getAny();
		any.clear();
		any.addAll(source.getAny());
		FeatureMap mixed = target.getMixed();
		mixed.clear();
		mixed.addAll(source.getMixed());
	}

	@Override
	public boolean valuesEquals(Handler h1, Handler h2) {
		return h1.equals(h2);
	}

	@Override
	public void clearValue(Handler handler) {
		handler.getAny().clear();
		handler.getMixed().clear();
	}

}
