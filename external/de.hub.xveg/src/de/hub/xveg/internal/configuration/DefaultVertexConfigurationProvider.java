package de.hub.xveg.internal.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.configuration.DefaultVertexGraphicsConfiguration;
import de.hub.xveg.configuration.ICreateVertexConfiguration;
import de.hub.xveg.configuration.IVertexFeatureConfigurationProvider;
import de.hub.xveg.configuration.IVertexGraphicConfiguration;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public class DefaultVertexConfigurationProvider extends DefaultFeatureConfigurationProvider 
		implements IVertexFeatureConfigurationProvider<EObject> {
	
	public static final DefaultVertexConfigurationProvider INSTANCE = new DefaultVertexConfigurationProvider();

	@Override
	public ICreateVertexConfiguration<EObject> getCreateVertexConfiguration(
			VertexFeature feature) {
		
		@SuppressWarnings("unchecked")
		IVertexFeatureConfigurationProvider<EObject> configurationProvider = 
				(IVertexFeatureConfigurationProvider<EObject>)feature.getConfiguration();
		if (configurationProvider != null) {
			ICreateVertexConfiguration<EObject> configuration = configurationProvider.getCreateVertexConfiguration(feature);
			if (configuration != null) {
				return configuration;
			}
		}
		
		return new ICreateVertexConfiguration<EObject>() {
			@Override
			public EObject createVertex(VertexFeature feature) {
				return feature.getDiagramType().getDslFactory().create(feature.getElementClass());
			}
		};
	}

	@Override
	public IVertexGraphicConfiguration getVertixGraphicsConfiguration(
			VertexFeature feature, EObject object) {
		@SuppressWarnings("unchecked")
		IVertexFeatureConfigurationProvider<EObject> configurationProvider = 
				(IVertexFeatureConfigurationProvider<EObject>)feature.getConfiguration();
		if (configurationProvider != null) {
			IVertexGraphicConfiguration configuration = configurationProvider.getVertixGraphicsConfiguration(feature, object);
			if (configuration != null) {
				return configuration;
			}
		}
		
		return new DefaultVertexGraphicsConfiguration();
	}
}
