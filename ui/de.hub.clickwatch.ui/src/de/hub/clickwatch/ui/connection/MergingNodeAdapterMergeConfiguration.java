package de.hub.clickwatch.ui.connection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.hub.clickwatch.merge.DefaultMergeConfiguration;
import de.hub.clickwatch.model.ChangeMark;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;

public class MergingNodeAdapterMergeConfiguration extends DefaultMergeConfiguration {

	private static final EAttribute anyFeature = ClickWatchModelPackage.eINSTANCE.getHandler_Any();
	private static final EAttribute mixedFeature = ClickWatchModelPackage.eINSTANCE.getHandler_Mixed();
	private static final EAttribute valueFeature = ClickWatchModelPackage.eINSTANCE.getHandler_Value();
	private static final EClass handlerClass = ClickWatchModelPackage.eINSTANCE.getHandler();
	private static final EReference handlersFeature = ClickWatchModelPackage.eINSTANCE.getElement_Handlers();
	private static final EClass elementClass = ClickWatchModelPackage.eINSTANCE.getElement();
	private static final EReference elementsFeature = ClickWatchModelPackage.eINSTANCE.getNode_Elements();
	private static final EReference childrenFeature = ClickWatchModelPackage.eINSTANCE.getElement_Children();
	private static final EClass nodeClass = ClickWatchModelPackage.eINSTANCE.getNode();
	
	private Collection<ChangeMark> changes = new HashSet<ChangeMark>();
	private Map<String, Handler> newHandlerMap = new HashMap<String, Handler>();
	

	@Override
	public boolean consider(IContext context) {
		EClass containerClass = context.getContainer().eClass();
		EStructuralFeature feature = context.getFeature();
		if (containerClass == nodeClass) {
			return feature == elementsFeature;
		} else if (containerClass == elementClass) {
			return feature == handlersFeature || feature == childrenFeature;
		} else if (containerClass == handlerClass) {
			return feature == mixedFeature ||
					feature == anyFeature ||
					feature == valueFeature;
		} else {
			return super.consider(context);
		}
	}

	@Override
	public Object identity(IContext context, Object value) {
		if (value instanceof Element) {
			return ((Element)value).getName();
 		} else if (value instanceof Handler) {
 			return ((Handler)value).getName();
 		} else {
 			return super.identity(context, value);
 		}
	}

	@Override
	public boolean hasIdentity(IContext context) {
		EStructuralFeature feature = context.getFeature();
		return feature == elementsFeature || feature == handlersFeature || feature == childrenFeature ||
				super.hasIdentity(context);
	}
	
	@Override
	public void handleDiffernce(IContext context, Object oldValue,
			Object newValue, int index) {
		changes.add(new ChangeMark(context.getContainer(), context.getFeature(), newValue));
	}
	
	public Collection<ChangeMark> getChanges() {
		return changes;
	}
	
	public Map<String, Handler> getNewHandlerMap() {
		return newHandlerMap;
	}

	@Override
	public Object create(IContext context, Object newValue) {
		Object result = super.create(context, newValue);
		if (newValue instanceof Handler) {
			newHandlerMap.put(((Handler) newValue).getQualifiedName(), (Handler)result);
		} else if (result instanceof Element) {
			for (Handler handler: ((Element)result).getAllHandlers()) {
				newHandlerMap.put(((Handler)handler).getQualifiedName(), handler);	
			}
		}
		return result;
	}
}