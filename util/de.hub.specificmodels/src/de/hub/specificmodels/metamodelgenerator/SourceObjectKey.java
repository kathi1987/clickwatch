package de.hub.specificmodels.metamodelgenerator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * {@link SourceObjectKey}s represent source model elements. This contains
 * values, objects and their references.
 * 
 * A source model element is either a root element, in this case the
 * {@link SourceObjectKey} only consists of the root element as value, or it is
 * a nested value, in this case a {@link SourceObjectKey} represents the value,
 * the feature that references this value and its containing object.
 */
public class SourceObjectKey {

	private final EObject object;
	private final EStructuralFeature feature;
	private final Object value;

	public SourceObjectKey(EObject object, EStructuralFeature feature,
			Object value) {
		super();
		this.object = object;
		this.feature = feature;
		this.value = value;
	}

	public EObject getObject() {
		return object;
	}

	public EStructuralFeature getFeature() {
		return feature;
	}

	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "SourceObjectKey [object=" + object + ", feature=" + feature
				+ ", value=" + value + "]";
	}
	
	public boolean isRoot() {
		return object == null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feature == null) ? 0 : feature.hashCode());
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SourceObjectKey other = (SourceObjectKey) obj;
		if (feature == null) {
			if (other.feature != null)
				return false;
		} else if (!feature.equals(other.feature))
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
