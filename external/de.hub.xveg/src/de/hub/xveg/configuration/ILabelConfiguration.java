package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public interface ILabelConfiguration<T extends EObject> {

	public String getLabel(XvegFeature feature, T object);
	
	public void setLabel(XvegFeature feature, T object, String label);
	
}
