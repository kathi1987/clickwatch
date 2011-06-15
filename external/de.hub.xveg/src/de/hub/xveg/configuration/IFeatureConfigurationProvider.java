package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public interface IFeatureConfigurationProvider<T extends EObject> {
	
	public ILabelConfiguration<T> getLabelConfiguration(XvegFeature feature, T object);
	
}
