package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public class AbstractFeatureConfigurationProvider<T extends EObject> implements IFeatureConfigurationProvider<T> {

	@Override
	public ILabelConfiguration<T> getLabelConfiguration(XvegFeature feature,
			T object) {
		return null;
	}

}
