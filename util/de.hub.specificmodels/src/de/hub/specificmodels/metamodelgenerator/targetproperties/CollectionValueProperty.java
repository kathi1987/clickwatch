package de.hub.specificmodels.metamodelgenerator.targetproperties;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionValueProperty<T> implements ITargetProperty {
	
	private Collection<T> values = new ArrayList<T>();

	public Collection<T> get() {
		return values;
	}

	public void add(T value) {
		values.add(value);
	}
}
