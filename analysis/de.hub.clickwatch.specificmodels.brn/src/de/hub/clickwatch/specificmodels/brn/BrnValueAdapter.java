package de.hub.clickwatch.specificmodels.brn;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;
import de.hub.emfxml.XmlModelRepository;
import de.hub.specificmodels.metamodelgenerator.DefaultTargetObjectCreator;

public class BrnValueAdapter extends XmlValueAdapter {
	
	public static final String HANDLER_CLASS = "handler_class";
	public static final String HANDLER_QUALIFIED_NAME ="handler_name";
	
	@Inject XmlModelRepository xmlModelRepository;
	private final Map<String, EPackage> metaModelCache = new HashMap<String, EPackage>();

	@Override
	public String getPlainValue(Handler handler) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clearValue(Handler handler) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveValue(Handler source, Handler target) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean valuesEquals(Handler h1, Handler h2) {
		return h1.equals(h2);
	}

	@Override
	protected void setValue(Handler handler, String plainValue) {
		if (handler.eClass() == ClickWatchModelPackage.eINSTANCE.getHandler()) {
			super.setValue(handler, plainValue);
		} else {
			// empty (everything is done in create)
		}
	}

	@Override
	protected Handler createNewHandler(String qualifiedName, String plainValue) {
		EPackage metaModel = getMetaModel(qualifiedName);
		if (metaModel != null) {
			String className = metaModel.getEAnnotation(
					DefaultTargetObjectCreator.ANNOTATION_SOURCE).getDetails().get(HANDLER_CLASS);
			StringBuffer xml = new StringBuffer();
			xml.append("<");
			xml.append(className);
			xml.append(" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
			xml.append(" ");
			xml.append("xsi:noNamespaceSchemaLocation=\"");
			xml.append(metaModel.getNsURI());
			xml.append("\">");
			xml.append(plainValue);
			xml.append("</");
			xml.append(className);
			xml.append(">");
			
			return (Handler)xmlModelRepository.deserializeModel(metaModel, 
					xml.toString());
		} else {
			return super.createNewHandler(qualifiedName, plainValue);
		}
	}
	
	private EPackage getMetaModel(String qualifiedName) {
		EPackage result = metaModelCache.get(qualifiedName);
		if (result == null) {
			String packageName = qualifiedName.replace("/","_");
			for(EPackage ePackage: BrnPackage.eINSTANCE.getESubpackages()) {			
				if (ePackage.getName().equals(packageName)) {
					result = ePackage;
					metaModelCache.put(qualifiedName, result);
				}
			}
		}
		return result;
	}

	@Override
	public void clearCaches() {
		metaModelCache.clear();
	}
}
