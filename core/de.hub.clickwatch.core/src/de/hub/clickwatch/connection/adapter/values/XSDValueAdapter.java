package de.hub.clickwatch.connection.adapter.values;

import java.util.HashMap;
import java.util.Map;

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
import com.google.inject.Inject;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;
import de.hub.emfxml.util.EmfXmlUtil;

public class XSDValueAdapter extends XmlValueAdapter {

@Inject private XmlModelRepository xmlModelRepository;
	
	public static final String XSD_HANDLER_NAME = "schema";
	private Map<String, EPackage> metaModels = new HashMap<String, EPackage>();
	private Map<String, EPackage> metaModelsForElementPaths = new HashMap<String, EPackage>();
	private static final EPackage NULL_PACKAGE = EcoreFactory.eINSTANCE.createEPackage();

	@Override
	public void setValue(Handler handler, String plainRealValue) {
		EPackage metaModel = getMetaModel(handler);
		if (metaModel == null) {
			super.setValue(handler, plainRealValue);
		} else {
			EObject documentRoot = EmfXmlUtil.deserializeModel(metaModel, plainRealValue);
			EObject modelValue = documentRoot.eContents().get(0);
			EcoreUtil.remove(modelValue);
			EcoreUtil.delete(documentRoot, true);
			
			EStructuralFeature valueFeature = null;
			for (EStructuralFeature aFeature: ((EClass)metaModel.getEClassifier("DocumentRoot")).getEStructuralFeatures()) {
				if (aFeature.getEType().isInstance(modelValue)) {
					valueFeature = aFeature;
				}
			}
			
			Preconditions.checkNotNull(valueFeature);
			
			handler.getMixed().clear();
			handler.getAny().clear();
			handler.getAny().add(FeatureMapUtil.createRawEntry(valueFeature, modelValue));
		}
	}

	
	@Override
	public String getPlainValue(Handler handler) {
		EPackage metaModel = getMetaModel(handler);
		if (metaModel == null) {
			return super.getPlainValue(handler);
		} else {
			FeatureMap mixed = handler.getMixed();
			Object modelValue;
			if (mixed.isEmpty()) {
				if (handler.getAny().isEmpty()) {
					modelValue = null;
				} else {
					modelValue = handler.getAny().getValue(0);
				}
			} else {
				modelValue = mixed.getValue(0);
			}
			Preconditions.checkState(modelValue instanceof EObject);
			return EmfXmlUtil.serializeModel(metaModel, (EObject)modelValue);	
		}
	}

	private EPackage getMetaModelFromXSD(String elementQualifiedName) {
		EPackage result = metaModelsForElementPaths.get(elementQualifiedName);
		if (result == null) {
			String xsdStr = readXSD(elementQualifiedName);	
			if (xsdStr == null) {
				result = NULL_PACKAGE;
			} else {
				URI xsdUri = URI.createURI(elementQualifiedName + ".xsd"); // URI decides whether nodes share xsd or not
				result = xmlModelRepository.loadMetaModelFromXSD(xsdUri, xsdStr);
			}
			metaModelsForElementPaths.put(elementQualifiedName, result);
		}
		return result;		
	}
	
	private String readXSD(String elementQualifiedName) {
		String result = null;
		try {
			boolean hasXsd = false;
			for(HandlerInfo hi: connection.getBlockingSocket().getElementHandlers(elementQualifiedName)) {
				if (hi.getHandlerName().equals(XSD_HANDLER_NAME)) {
					hasXsd = true;
				}
			}
			
			if (hasXsd) {
				result =  new String(connection.getBlockingSocket().read(elementQualifiedName, XSD_HANDLER_NAME));
			}
		} catch (Throwable e) {
			Throwables.propagate(e);
			return null;
		}
		
		if (result == null || result.trim().equals("") || !result.contains("<")) {
			return null;
		} else {
			return result;
		}
	}
	
	private EPackage getMetaModel(Handler handler) {
		String handlerQualifiedName = handler.getQualifiedName();
		EPackage result = metaModels.get(handlerQualifiedName);
		if (result == null) {
			EPackage metaModel = getMetaModelFromXSD(handlerQualifiedName.substring(0, handlerQualifiedName.lastIndexOf("/")));			
			if (metaModel == NULL_PACKAGE) {
				result = NULL_PACKAGE;
			} else {
				if (XSD_HANDLER_NAME.equals(handler.getName())) {
					result = NULL_PACKAGE;
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
						result = metaModel;
					} else {
						result = NULL_PACKAGE;
					}
				}
			}
			metaModels.put(handlerQualifiedName, result);
		} 
		
		if (result == NULL_PACKAGE) {
			return null;
		} else {
			return result;
		}
	}
}
