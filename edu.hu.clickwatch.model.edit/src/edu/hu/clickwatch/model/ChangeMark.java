package edu.hu.clickwatch.model;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ChangeMark extends AdapterImpl {
	
	private final EObject object;
	private final EStructuralFeature feature;
	private final Object value;
	
	private final long timeStamp;

	private ChangeMark(EObject object, EStructuralFeature feature, Object value) {
		super();
		this.object = object;
		this.feature = feature;
		this.value = value;
		
		timeStamp = System.currentTimeMillis();
	}
	
	public boolean isDirectChange(EObject object) {
		return object == this.object;
	}
	
	public boolean isActive() {
		return System.currentTimeMillis() - timeStamp < 2000;
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

	public static void addChangeMark(EObject object, EStructuralFeature feature, Object value) {
		Iterator<Adapter> it = object.eAdapters().iterator();
		while (it.hasNext()) {
			if (it.next() instanceof ChangeMark) {
				it.remove();
			}
		}
		ChangeMark changeMark = new ChangeMark(object, feature, value);
		while (object != null) {
			object.eAdapters().add(changeMark);
			if (object instanceof Handler) {
				((Handler)object).setWatch(true);
			}
			object = object.eContainer();
		}
	}

	public static ChangeMark getChangeMark(EObject object) {
		Iterator<Adapter> it = object.eAdapters().iterator();
		while (it.hasNext()) {
			Adapter next = it.next();
			if (next instanceof ChangeMark) {
				return (ChangeMark)next; 
			}
		}
		return null;
	}
}
