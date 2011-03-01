package edu.hu.clickwatch.merge;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Diff {
	
	private final EObject object;
	private final EStructuralFeature feature;
	
	private final AddEntry addEntry;
	
	public interface AddEntry {
		public void addEntry(EObject object, EStructuralFeature feature, Object oldValue, Object newValue);
	}
	
	private Diff(EObject object, EStructuralFeature feature, AddEntry addEntry) {
		super();
		this.object = object;
		this.feature = feature;
		this.addEntry = addEntry;
	}
	
	public Diff(AddEntry addEntry) {
		this.object = null;
		this.feature = null;
		this.addEntry = addEntry;
	}

	public Diff getDiff(EObject object, EStructuralFeature feature) {
		return new Diff(object, feature, addEntry);
	}

	public Diff getDiff(EStructuralFeature feature) {
		return new Diff(object, feature, addEntry);
	}

	public void addEntry(Object oldValue, Object newValue) {
		if (addEntry != null) {
			addEntry.addEntry(object, feature, oldValue, newValue);
		}
	}
}
