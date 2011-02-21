package edu.hu.clickwatch.nodeadapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.inject.Inject;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;

public class ClickControlXSDNodeAdapter extends AbstractNodeAdapter {
	
	@Inject
	private DefaultXmlValueRepresentation defaultXmlValueRep;
	
	@Inject
	private XmlModelRepository xmlModelRepository;
	
	public static final String XSD_HANDLER_NAME = "schema";
	
	private Map<Handler, IExtendedValueRepresentation> valueReps = 
			new HashMap<Handler, AbstractNodeAdapter.IExtendedValueRepresentation>();
	
	private static final EPackage NULL_PACKAGE = EcoreFactory.eINSTANCE.createEPackage();
	private Map<String, EPackage> metaModelsForElementPaths = new HashMap<String, EPackage>();

	private class XSDValueRepresentation implements IExtendedValueRepresentation {
		
		final EPackage metaModel;
		
		public XSDValueRepresentation(EPackage metaModel) {
			this.metaModel = metaModel;
		}
		
		@Override
		public void set(Handler handler, Object value) {
			Preconditions.checkArgument(value instanceof EObject);
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
			Preconditions.checkArgument(modelValue instanceof EObject);
			Preconditions.checkArgument(realValue instanceof EObject);
			
			String modelXml = xmlModelRepository.getOriginalXml((EObject)modelValue);
			String realXml = xmlModelRepository.getOriginalXml((EObject)modelValue);
			
			if (modelXml != null && realXml != null) {
				return modelXml.equals(realXml);
			} else {
				return xmlModelRepository.serializeModel(metaModel, (EObject)modelValue).
						equals(xmlModelRepository.serializeModel(metaModel, (EObject)realValue));
			}
		}
		
		@Override
		public String createPlainRealValue(Object modelValue) {
			return xmlModelRepository.serializeModel(metaModel, (EObject)modelValue);
		}
		
		@Override
		public Object createModelValue(String plainRealValue) {
			EObject documentRoot = xmlModelRepository.deserializeModel(metaModel, plainRealValue);
			EObject result = documentRoot.eContents().get(0);
			EcoreUtil.remove(result);
			EcoreUtil.delete(documentRoot, true);
			return result;
		}
	};
	
	private EPackage getMetaModelFromXSD(Element element) {
		String elementPath = element.getElementPath();
		EPackage result = metaModelsForElementPaths.get(elementPath);
		if (result == null) {
			String xsdStr = readXSD(element);	
			if (xsdStr == null) {
				result = NULL_PACKAGE;
			} else {
				URI xsdUri = URI.createURI(elementPath + ".xsd"); // URI decides whether nodes share xsd or not
				result = xmlModelRepository.loadMetaModelFromXSD(xsdUri, xsdStr);
			}
			metaModelsForElementPaths.put(elementPath, result);
		}
		return result;		
	}
	
	private String readXSD(Element element) {
		try {
			boolean hasXsd = false;
			String elementPath = element.getElementPath();
			for(HandlerInfo hi: getClickSocket().getElementHandlers(elementPath)) {
				if (hi.getHandlerName().equals(XSD_HANDLER_NAME)) {
					hasXsd = true;
				}
			}
			
			if (hasXsd) {
				return new String(getClickSocket().read(elementPath, XSD_HANDLER_NAME));
			} else {
				return null;
			}
		} catch (Throwable e) {
			Throwables.propagate(e);
			return null;
		}
	}

	@Override
	protected IExtendedValueRepresentation getExtendedValueRepresentation(Handler handler) {
		IExtendedValueRepresentation result = valueReps.get(handler);
		if (result == null) {
			Element element = (Element)handler.eContainer();
			EPackage metaModel = getMetaModelFromXSD(element);			
			if (metaModel == NULL_PACKAGE) {
				result = defaultXmlValueRep;
			} else {
				if (XSD_HANDLER_NAME.equals(handler.getName())) {
					result = new ConstantValueRepresentation(metaModel);
				} else {
					result = new XSDValueRepresentation(metaModel);
				}
			}
			valueReps.put(handler, result);
		} 
		return result;
	}
	
}
