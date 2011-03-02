package edu.hu.clickwatch.merge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import edu.hu.clickwatch.util.ILogger;

@Singleton
public class Merger {

	@Inject private IMergeConfiguration configuration;
	@Inject private ILogger logger;
	
	public IMergeConfiguration getConfiguration() {
		return configuration;
	}
	
	private class MergeContext implements IMergeConfiguration.IContext {

		private final EObject container;
		private final Object owner;
		private final EStructuralFeature feature;
		
		private MergeContext(EObject container, Object owner,
				EStructuralFeature feature) {
			super();
			this.container = container;
			this.owner = owner;
			this.feature = feature;
		}

		public MergeContext createChildContext(EObject container, EStructuralFeature feature) {
			return new MergeContext(container, container, feature);
		}
		
		
		public MergeContext createChildContext(FeatureMap.Entry entry) {
			return new MergeContext(container, entry, entry.getEStructuralFeature());
		}

		@Override
		public EObject getContainer() {
			return container;
		}

		@Override
		public Object getOwner() {
			return owner;
		}

		@Override
		public EStructuralFeature getFeature() {
			return feature;
		}
	}
	
	private Map<Object, Item> createIdentityMap(MergeContext context, List<Object> list) {
		Map<Object, Item> map = new HashMap<Object, Item>();
		int size = list.size();
		for (int i = 0; i < size; i++) {
			Object value = list.get(i);
			map.put(configuration.identity(context, value), new Item(i, value));
		}
		return map;
	}
	
	private class Item {
		int index;
		Object object;
		Item(int index, Object object) {
			this.index = index;
			this.object = object;
		}
	}
	
	private void mergeListByIdentity(MergeContext context, 
			List<Object> lOldValue, List<Object> lNewValue) {
		final Map<Object, Item> oldIdentityMap = createIdentityMap(context, lOldValue);
		final Map<Object, Item> newIdentityMap = createIdentityMap(context, lNewValue);
		Set<Object> oldIdentities = oldIdentityMap.keySet();
		Set<Object> newIdentities = newIdentityMap.keySet();
		Item[] toRemove = new Item[oldIdentities.size()];
		for (Object oldIdentity: oldIdentities) {
			Item oldItem = oldIdentityMap.get(oldIdentity);
			Item newItem = newIdentityMap.get(oldIdentity);
			if (newItem == null) {
				toRemove[oldItem.index] = oldItem;
			} else {
				boolean equals = merge(context, oldItem.object, newItem.object);
				if (!equals) {
					Object newCreatedValue = configuration.create(context, newItem.object);
					lOldValue.set(oldItem.index, newCreatedValue);
					configuration.handleDiffernce(context, oldItem.object, newCreatedValue, oldItem.index);
					configuration.dispose(context, oldItem.object);					
				}
			}
		}
		for (int i = toRemove.length - 1; i >= 0; i--) {
			Item item = toRemove[i];
			if (item != null) {
				lOldValue.remove(item.index);
				configuration.handleDiffernce(context, item.object, null, item.index);
				configuration.dispose(context, item.object);
			}
		}
		for (Object newIdentity: newIdentities) {
			if (oldIdentityMap.get(newIdentity) == null) {
				Item newItem = newIdentityMap.get(newIdentity);
				Object newCreatedValue = configuration.create(context, newItem.object);
				lOldValue.add(newCreatedValue);
				configuration.handleDiffernce(context, null, newCreatedValue, lOldValue.size() - 1);
			}
		}
	}
	
	private void mergeListByIndices(MergeContext context, 
			List<Object> lOldValue, List<Object> lNewValue) {
		int oldValueSize = lOldValue.size();
		int newValueSize = lNewValue.size();
		int lOneSize = Math.min(oldValueSize, newValueSize);
		int i;
		for (i = 0; i < lOneSize; i++) {
			Object oldValue = lOldValue.get(i);
			Object newValue = lNewValue.get(i);
			boolean equals = merge(context, oldValue, newValue);
			if (!equals) {
				Object newCreatedValue = configuration.create(context, newValue);
				lOldValue.set(i, newCreatedValue);
				configuration.handleDiffernce(context, oldValue, newCreatedValue, i);
				configuration.dispose(context, oldValue);				
			}
		}
		int lastIndex = i;
		if (i < oldValueSize) {			
			for (; i < oldValueSize; i++) {
				Object oldValue = lOldValue.remove(lastIndex);					
				configuration.handleDiffernce(context, oldValue, null, lastIndex);
				configuration.dispose(context, oldValue);
			}
		} else if (i < newValueSize) {
			for (; i < newValueSize; i++) {
				Object newCreatedValue = configuration.create(context, lNewValue.get(i));
				lOldValue.add(newCreatedValue);
				configuration.handleDiffernce(context, null, newCreatedValue, lOldValue.size() - 1);
			}
		}
	}
	
	public synchronized boolean merge(EObject oldValue, EObject newValue) {
		return merge(new MergeContext(null, null, null), oldValue, newValue);
	}
	
	private boolean merge(MergeContext context, Object oldValue, Object newValue) {
		try {
			return mergeInternal(context, oldValue, newValue);
		} catch (Throwable e) {
			logger.log(IStatus.ERROR, "Exception during merge of " + context, e);
			return true;
		}
	}
	
	private boolean mergeInternal(MergeContext context, Object oldValue, Object newValue) {
		if (oldValue == null && newValue != null) {
			return false;
		} else if (newValue == null && oldValue != null) {
			return false;
		} else if (newValue == null && oldValue == null) {
			return true;
		}
		
		if (oldValue instanceof EObject && newValue instanceof EObject) {
			EObject eOldValue = (EObject)oldValue;
			EObject eNewValue = (EObject)newValue;
			EClass eOldClass = eOldValue.eClass();
			
			if (!eOldClass.getName().equals(eNewValue.eClass().getName())) {
				return false;
			}
			FeatureLoop: for (EStructuralFeature feature: eOldClass.getEAllStructuralFeatures()) {
				MergeContext childContext = context.createChildContext(eOldValue, feature);
				if (feature.isDerived() || !configuration.consider(childContext)) {
					continue FeatureLoop;
				}
				Object newFeatureValue = eNewValue.eGet(feature);
				Object oldFeatureValue = eOldValue.eGet(feature);
				boolean equals = merge(childContext, oldFeatureValue, newFeatureValue);
				if (!equals) {
					configuration.handleDiffernce(childContext, oldFeatureValue, newFeatureValue, 
							IMergeConfiguration.NO_INDEX);
					if (newFeatureValue == null) {
						eOldValue.eUnset(feature);							
					} else {
						eOldValue.eSet(feature, configuration.create(childContext, 
								newFeatureValue));
					}
					configuration.dispose(childContext, oldFeatureValue);
				}
			}
			return true;
		} else if (oldValue instanceof List && newValue instanceof List) {
			@SuppressWarnings("unchecked")
			List<Object> lOldValue = (List<Object>)oldValue;
			@SuppressWarnings("unchecked")
			List<Object> lNewValue = (List<Object>)newValue;
			if (configuration.hasIdentity(context)) {
				mergeListByIdentity(context, lOldValue, lNewValue);	
			} else {
				mergeListByIndices(context, lOldValue, lNewValue);
			}	
			return true;
		} else if (oldValue instanceof FeatureMap.Entry && newValue instanceof FeatureMap.Entry) {
			FeatureMap.Entry fOldValue = (FeatureMap.Entry)oldValue;
			FeatureMap.Entry fNewValue = (FeatureMap.Entry)newValue;
			
			if (!fOldValue.getEStructuralFeature().getName().equals(fNewValue.getEStructuralFeature().getName())) {
				return false;
			} else {
				Object oldEntryValue = fOldValue.getValue();
				Object newEntryValue = fNewValue.getValue();
				MergeContext childContext = context.createChildContext(fOldValue);
				boolean equals = merge(childContext, oldEntryValue, newEntryValue);
				if (!equals) {
					configuration.handleDiffernce(childContext, oldEntryValue, newEntryValue, 
							IMergeConfiguration.NO_INDEX);
				}
				return equals;
			}
		} else {
			return oldValue.equals(newValue);
		}
	}
}
