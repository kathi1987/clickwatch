package edu.hu.clickwatch.model;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import edu.hu.clickwatch.merge.DefaultMergeConfiguration;

public class ClickWatchMergeConfiguration extends DefaultMergeConfiguration {

	private static final EAttribute anyFeature = ClickWatchModelPackage.eINSTANCE.getHandler_Any();
	private static final EAttribute mixedFeature = ClickWatchModelPackage.eINSTANCE.getHandler_Mixed();
	private static final EClass handlerClass = ClickWatchModelPackage.eINSTANCE.getHandler();
	private static final EReference handlersFeature = ClickWatchModelPackage.eINSTANCE.getElement_Handlers();
	private static final EClass elementClass = ClickWatchModelPackage.eINSTANCE.getElement();
	private static final EReference elementsFeature = ClickWatchModelPackage.eINSTANCE.getNode_Elements();
	private static final EReference childrenFeature = ClickWatchModelPackage.eINSTANCE.getElement_Children();
	private static final EClass nodeClass = ClickWatchModelPackage.eINSTANCE.getNode();
	
	private Collection<ChangeMark> changes = new HashSet<ChangeMark>();

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
					feature == anyFeature;
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
		return feature == elementsFeature || feature == handlersFeature ||
				super.hasIdentity(context);
	}
	
	@Override
	public void handleDiffernce(IContext context, Object oldValue,
			Object newValue, int index) {
		changes.add(new ChangeMark(context.getContainer(), context.getFeature(), newValue));
	}

	public void reset() {
		changes.clear();
	}
	
	public Collection<ChangeMark> getChanges() {
		return changes;
	}

}
