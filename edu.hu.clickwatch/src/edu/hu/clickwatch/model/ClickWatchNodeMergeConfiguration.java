package edu.hu.clickwatch.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;

import edu.hu.clickwatch.merge.DefaultMergeConfiguration;

public class ClickWatchNodeMergeConfiguration extends DefaultMergeConfiguration {

	private static final EAttribute anyFeature = ClickWatchModelPackage.eINSTANCE.getHandler_Any();
	private static final EAttribute mixedFeature = ClickWatchModelPackage.eINSTANCE.getHandler_Mixed();
	private static final EClass handlerClass = ClickWatchModelPackage.eINSTANCE.getHandler();
	private static final EReference handlersFeature = ClickWatchModelPackage.eINSTANCE.getElement_Handlers();
	private static final EClass elementClass = ClickWatchModelPackage.eINSTANCE.getElement();
	private static final EReference elementsFeature = ClickWatchModelPackage.eINSTANCE.getNode_Elements();
	private static final EReference childrenFeature = ClickWatchModelPackage.eINSTANCE.getElement_Children();
	private static final EClass nodeClass = ClickWatchModelPackage.eINSTANCE.getNode();
	
	private Collection<ChangeMark> changes = new HashSet<ChangeMark>();
	private Node node;
	
	public void setNode(Node node) {
		this.node = node;
	}

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
		return feature == elementsFeature || feature == handlersFeature || feature == childrenFeature ||
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
	
	private Long getTime(Object value) {
		if (value instanceof FeatureMap.Entry) {
			return getTime(((FeatureMap.Entry)value).getValue());
		} else if (value instanceof AnyType) {
			AnyType anyValue = (AnyType)value;
			for (FeatureMap.Entry entry: anyValue.getAnyAttribute()) {
				if (entry.getEStructuralFeature().getName().toLowerCase().equals("time")) {
					Object timeValue = entry.getValue();
					if (timeValue instanceof String) {
						try {
							return new Long(((String)timeValue).replace(".", ""));
						} catch (NumberFormatException e) {
							
						}
					}
				}
			}
			return null;
		} else if (value instanceof EObject) {
			EObject eValue = (EObject)value;
			for (EAttribute attr: eValue.eClass().getEAllAttributes()) {
				if (attr.getName().toLowerCase().equals("time")) {
					Object timeValue = eValue.eGet(attr);
					if (timeValue instanceof String) {
						try {
							return new Long(((String)timeValue).replace(".", ""));
						} catch (NumberFormatException e) {
							
						}
					} else if (timeValue instanceof BigDecimal) {
						return ((BigDecimal)timeValue).multiply(new BigDecimal(1000000000)).longValue();
					}
				}
			}
			return null;
		} else {
			return null;
		}
	}
	
	private final static IsRecordedAdapter isRecordedAdapter = new IsRecordedAdapter();

	@Override
	public boolean isToAdd(IContext context, Object oldValue, Object newValue) {
		if (oldValue == null) {
			return false;
		}
		if (node.isRecording()) {
			Long oldValueTime = getTime(oldValue);
			if (newValue == null) {
				return oldValueTime != null;
			}
			Long newValueTime = getTime(newValue);
			if (newValueTime != null && oldValueTime != null) {
				return newValueTime != oldValueTime;
			} else {
				return false;
			}
		} else if (node.isHasRecord()) {
			if (oldValue instanceof FeatureMap.Entry) {
				FeatureMap.Entry fOldValue = (FeatureMap.Entry)oldValue;
				Object value = fOldValue.getValue();
				return 
						value instanceof EObject && 
						((EObject)value).eAdapters().contains(isRecordedAdapter) &&
						newValue == null;
			} else {
				return false;
			}
		} else {
			return false;	
		}
	}

	@Override
	public Object create(IContext context, Object newValue) {
		Object result = super.create(context, newValue);
		if (newValue instanceof EObject && getTime(newValue) != null && node.isRecording()) {
			((EObject)result).eAdapters().add(isRecordedAdapter);
			node.setHasRecord(true);
		}
		return result;
	}
}
