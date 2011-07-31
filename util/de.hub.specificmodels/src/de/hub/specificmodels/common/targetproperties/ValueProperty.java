package de.hub.specificmodels.common.targetproperties;

public class ValueProperty<T> implements ITargetProperty {
	
	private T value;

	public ValueProperty(T defaultValue) {
		this.value = defaultValue;
	}

	public T get() {
		return value;
	}

	public void set(T value) {
		this.value = value;
	}
}
