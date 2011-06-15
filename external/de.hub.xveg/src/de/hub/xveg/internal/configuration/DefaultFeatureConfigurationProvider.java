package de.hub.xveg.internal.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.configuration.IFeatureConfigurationProvider;
import de.hub.xveg.configuration.ILabelConfiguration;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public class DefaultFeatureConfigurationProvider implements IFeatureConfigurationProvider<EObject> {
	
	public static final DefaultFeatureConfigurationProvider INSTANCE = new DefaultFeatureConfigurationProvider();
	
	@Override
	public ILabelConfiguration<EObject> getLabelConfiguration(
			XvegFeature feature, EObject object) {
		
		@SuppressWarnings("unchecked")
		IFeatureConfigurationProvider<EObject> configurationProvider = feature.getConfiguration();
		if (configurationProvider != null) {
			ILabelConfiguration<EObject> configuration = configurationProvider.getLabelConfiguration(feature, object);
			if (configuration != null) {
				return configuration;
			}
		}
		
		return new ILabelConfiguration<EObject>() {

			@Override
			public String getLabel(XvegFeature feature, EObject object) {
				return "TODO";
			}

			@Override
			public void setLabel(XvegFeature feature, EObject object,
					String label) {
				// empty
			}
			
		};
	}
}
