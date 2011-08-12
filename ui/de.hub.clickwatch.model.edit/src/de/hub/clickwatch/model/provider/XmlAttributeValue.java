package de.hub.clickwatch.model.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;

public class XmlAttributeValue {

	private final EObject object;
	private final EStructuralFeature feature;
	private final FeatureMap.Entry entry;
	public XmlAttributeValue(EObject object, EStructuralFeature feature,
			FeatureMap.Entry entry) {
		super();
		this.object = object;
		this.feature = feature;
		this.entry = entry;
	}
	public EObject getObject() {
		return object;
	}
	public EStructuralFeature getFeature() {
		return feature;
	}
	public Object getValue() {
		return entry.getValue();
	}
	public FeatureMap.Entry getEntry() {
		return entry;
	}
	public String toString() {
		return getValue().toString();
	}
	
}
