package edu.hu.clickwatch.model;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ChangeMark extends AdapterImpl {
	
	private final EObject object;
	private final int feature;
	// private final Object value;

	public ChangeMark(EObject object, EStructuralFeature feature, Object value) {
		super();
		this.object = object;
		if (feature != null) {
			this.feature = feature.getFeatureID();
		} else {
			this.feature = -1;
		}
		// this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + feature;
		result = prime * result + ((object == null) ? 0 : object.hashCode());
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
		ChangeMark other = (ChangeMark) obj;
		if (feature != other.feature)
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		return true;
	}
}
