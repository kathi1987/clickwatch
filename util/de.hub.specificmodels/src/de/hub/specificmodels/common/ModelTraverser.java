package de.hub.specificmodels.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;

import com.google.common.base.Preconditions;


public class ModelTraverser {

	public interface Configuration {
		public void work(SourceObjectKey sok);
		public boolean ommitFeature(EStructuralFeature feature);
	}
	
	@SuppressWarnings("unchecked")
	public void traverseSourceModel(Configuration config, SourceObjectKey sok) {
		if (sok.isRoot()) {
			config.work(sok);
		} 
		Preconditions.checkArgument(sok.getValue() instanceof EObject);
		EObject sourceObject = (EObject)sok.getValue();
		Map<FeatureMap.Entry, FeatureMap> featureMapEntries = new HashMap<FeatureMap.Entry, FeatureMap>(); // uses to traverse potential double values (e.g. in "mixed" and in "any") only once
		for (EStructuralFeature feature : sourceObject.eClass().getEStructuralFeatures()) {
			if (!config.ommitFeature(feature)) {
				Object rawValue = sourceObject.eGet(feature);
				List<?> values = null;
				if (feature.isMany()) {
					values = (List<?>) rawValue;
				} else {
					values = new ArrayList<Object>();
					if (rawValue != null) {
						((List<Object>)values).add(rawValue);
					}
				}
				loop: for (Object value : values) {
					if (value instanceof FeatureMap.Entry) {
						FeatureMap.Entry fme = (FeatureMap.Entry)value;
						if (featureMapEntries.get(fme) == null) {
							featureMapEntries.put(fme, (FeatureMap)values);
						} else {
							continue loop;
						}	
					}
					SourceObjectKey childKey = createChildKey(sok, sourceObject, feature, value);
					config.work(childKey);
				}
				loop: for (Object value : values) {
					if (value instanceof FeatureMap.Entry) {
						FeatureMap.Entry fme = (FeatureMap.Entry)value;
						if (featureMapEntries.get(fme) != values) {
							continue loop;
						}	
					}
					SourceObjectKey childKey = createChildKey(sok, sourceObject, feature, value);
					if (feature instanceof EReference || (value instanceof FeatureMap.Entry && ((FeatureMap.Entry)value).getValue() instanceof EObject)) {
						if (feature instanceof EReference) {
							Preconditions.checkArgument(((EReference)feature).isContainment(), "non containment references are not supported");
						}
						traverseSourceModel(config, childKey);
					} 
				}				
			}
		}
	}
	
	private SourceObjectKey createChildKey(SourceObjectKey sourceObjectKey,
			EObject sourceObject, EStructuralFeature feature, Object value) {
		SourceObjectKey key;
		if (value instanceof FeatureMap.Entry) {
			FeatureMap.Entry fme = (FeatureMap.Entry)value;
			key = new SourceObjectKey(sourceObjectKey, sourceObject, fme.getEStructuralFeature(), fme.getValue());
		} else {
			key = new SourceObjectKey(sourceObject, feature, value);
		}
		return key;
	}

}
