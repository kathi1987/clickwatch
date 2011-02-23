package edu.hu.clickwatch.nodeadapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
			if (value == null) {
				return;
			}
			
			Preconditions.checkArgument(value instanceof EObject);

			EStructuralFeature valueFeature = null;
			for (EStructuralFeature aFeature: ((EClass)metaModel.getEClassifier("DocumentRoot")).getEStructuralFeatures()) {
				if (aFeature.getEType().isInstance(value)) {
					valueFeature = aFeature;
				}
			}
			
			Preconditions.checkNotNull(valueFeature);
			
			handler.getMixed().clear();
			handler.getAny().clear();
			handler.getAny().add(FeatureMapUtil.createRawEntry(valueFeature, value));
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
//			if (modelValue == null || realValue == null) {
//				return false;
//			}
//			
//			Preconditions.checkArgument(modelValue instanceof EObject);
//			Preconditions.checkArgument(realValue instanceof EObject);
//			
//			if (!modelValue.getClass().equals(realValue.getClass())) {
//				return false;
//			}
//			
//			String modelXml = xmlModelRepository.getOriginalXml((EObject)modelValue);
//			String realXml = xmlModelRepository.getOriginalXml((EObject)modelValue);
//			
//			if (modelXml != null && realXml != null) {
//				return modelXml.equals(realXml);
//			} else {
//				return xmlModelRepository.serializeModel(metaModel, (EObject)modelValue).
//						equals(xmlModelRepository.serializeModel(metaModel, (EObject)realValue));
//			}
			return eEquals(modelValue, realValue);
		}
		
		@Override
		public String createPlainRealValue(Object modelValue) {
			return xmlModelRepository.serializeModel(metaModel, (EObject)modelValue);
		}
		
		@Override
		public Object createModelValue(String plainRealValue) {
			plainRealValue = plainRealValue.replaceFirst("^<\\?[^\\?]+\\?>", "").trim();
			// TODO this is an ugly way to provide the schema URI
			if (!plainRealValue.contains("xsi:noNamespaceSchemaLocation")) {
				int xsdRefPos = plainRealValue.indexOf(">");
				if (xsdRefPos > 0) {
					if (plainRealValue.charAt(xsdRefPos - 1) == '/') {
						xsdRefPos -= 1;
					}
					plainRealValue = plainRealValue.substring(0, xsdRefPos) + 
							" xsi:noNamespaceSchemaLocation='" +
							metaModel.getNsURI() + "'" + plainRealValue.substring(xsdRefPos);
				}
			}
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
		String result = null;
		try {
			boolean hasXsd = false;
			String elementPath = element.getElementPath();
			for(HandlerInfo hi: getClickSocket().getElementHandlers(elementPath)) {
				if (hi.getHandlerName().equals(XSD_HANDLER_NAME)) {
					hasXsd = true;
				}
			}
			
			if (hasXsd) {
				result =  new String(getClickSocket().read(elementPath, XSD_HANDLER_NAME));
			}
		} catch (Throwable e) {
			Throwables.propagate(e);
			return null;
		}
		
		if (result == null || result.trim().equals("")) {
			return null;
		} else {
			return result;
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
					//result = new ConstantValueRepresentation(metaModel);
					result = defaultXmlValueRep;
				} else {
					EClass handlerClass = (EClass)metaModel.getEClassifier("handler");
					EEnum eEnum = (EEnum)handlerClass.getEStructuralFeature("name").getEType();
					EList<EEnumLiteral> eLiterals = eEnum.getELiterals();
					boolean handlerIsCoveredByXSD = false;
					for (EEnumLiteral eLiteral: eLiterals) {
						if (eLiteral.getLiteral().equals(handler.getName())) {
							handlerIsCoveredByXSD = true;
						}
					}
					if (handlerIsCoveredByXSD) {
						result = new XSDValueRepresentation(metaModel);
					} else {
						result = defaultXmlValueRep;
					}
				}
			}
			valueReps.put(handler, result);
		} 
		return result;
	}
	
	private boolean eEquals(Object one, Object two) {
		if ((one == null || two == null) && (one != two)) {
			return false;
		} else if (one instanceof EObject && two instanceof EObject) {
			EObject eOne = (EObject)one;
			EObject eTwo = (EObject)two;
			if (eOne.eClass() != eTwo.eClass()) {
				return false;
			}
			for(EStructuralFeature feature: eOne.eClass().getEAllStructuralFeatures()) {
				if (!feature.isDerived() && !isTimeIndicatingFeature(feature)) {
					if (!eEquals(eOne.eGet(feature), eTwo.eGet(feature))) {
						return false;
					}
				}
			}
			return true;
		} else if (one instanceof EList<?> && two instanceof EList<?>) {
			EList<?> lOne = (EList<?>)one;
			EList<?> lTwo = (EList<?>)two;
			if (lOne.size() != lTwo.size()) {
				return false;
			}
			int lOneSize = lOne.size();
			for (int i = 0; i < lOneSize; i++) {
				if (!eEquals(lOne.get(i), lTwo.get(i))) {
					return false;
				}
			}
			return true;
		} else {
			return one.equals(two);
		}
	}

	private boolean isTimeIndicatingFeature(EStructuralFeature feature) {
		String normalizedName = feature.getName().trim().toLowerCase();
		return normalizedName.equals("time") || normalizedName.equals("seq");
	}
	
}
