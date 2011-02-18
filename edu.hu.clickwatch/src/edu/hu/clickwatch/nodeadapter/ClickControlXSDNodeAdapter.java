package edu.hu.clickwatch.nodeadapter;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

import com.google.common.base.Throwables;

import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;

public class ClickControlXSDNodeAdapter extends AbstractNodeAdapter {
	
	public static final String XSD_HANDLER_NAME = "schema";
	
	private Map<Handler, IExtendedValueRepresentation> valueReps = 
			new HashMap<Handler, AbstractNodeAdapter.IExtendedValueRepresentation>();
	
	private static final EPackage NULL_PACKAGE = EcoreFactory.eINSTANCE.createEPackage();
	private Map<String, EPackage> metaModelsForElementPaths = new HashMap<String, EPackage>();
	private static final DefaultXmlValueRepresentation defaultXmlValueRep = new DefaultXmlValueRepresentation();

	private class XSDValueRepresentation implements IExtendedValueRepresentation {
		
		final EPackage metaModel;
		
		public XSDValueRepresentation(EPackage metaModel) {
			this.metaModel = metaModel;
		}
		
		@Override
		public void set(Handler handler, Object value) {
			// TODO Auto-generated method stub			
		}
		
		@Override
		public boolean isNotificationChangingValue(Notification notification) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Object get(Handler handler) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean equalsModelValueRealityValue(Object modelValue,
				Object realValue) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public String createPlainRealValue(Object modelValue) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Object createModelValue(String plainRealValue) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	private EPackage getMetaModelFromXSD(Element element) {
		EPackage result = metaModelsForElementPaths.get(element.getElementPath());
		if (result == null) {
			String xsd = readXSD(element);	
			// TODO
		}
		return result;		
	}
	
	private String readXSD(Element element) {
		String xsd = null;
		try {
			xsd = new String(getClickSocket().read(element.getElementPath(), XSD_HANDLER_NAME));
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
		return xsd;
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
				result = new XSDValueRepresentation(metaModel);
			}
			valueReps.put(handler, result);
		} 
		return result;
	}
	
}
