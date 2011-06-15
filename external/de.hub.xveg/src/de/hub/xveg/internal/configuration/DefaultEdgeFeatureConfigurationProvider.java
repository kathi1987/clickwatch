package de.hub.xveg.internal.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.configuration.DefaultEdgeGraphicsConfiguration;
import de.hub.xveg.configuration.ICreateEdgeConfiguration;
import de.hub.xveg.configuration.IEdgeFeatureConfigurationProvider;
import de.hub.xveg.configuration.IEdgeGraphicConfiguration;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public class DefaultEdgeFeatureConfigurationProvider extends
		DefaultFeatureConfigurationProvider implements
		IEdgeFeatureConfigurationProvider<EObject> {
	
	public static final DefaultEdgeFeatureConfigurationProvider INSTANCE = 
		new DefaultEdgeFeatureConfigurationProvider();

	@Override
	public ICreateEdgeConfiguration<EObject> getCreateEdgeConfiguration(
			EdgeFeature feature) {
		
		@SuppressWarnings("unchecked")
		IEdgeFeatureConfigurationProvider<EObject> configurationProvider = 
				(IEdgeFeatureConfigurationProvider<EObject>)feature.getConfiguration();
		if (configurationProvider != null) {
			ICreateEdgeConfiguration<EObject> configuration = configurationProvider.getCreateEdgeConfiguration(feature);
			if (configuration != null) {
				return configuration;
			}
		}
		
		return new ICreateEdgeConfiguration<EObject>() {

			@Override
			public EObject createEdge(EdgeFeature feature, EObject source,
					EObject target) {
				EObject edge = feature.getDiagramType().getDslFactory().create(feature.getElementClass());
				edge.eSet(feature.getSourceReference(), source);
				edge.eSet(feature.getTargetReference(), target);
				return edge;
			}

			@Override
			public boolean isPossible(EdgeFeature feature, EObject source,
					EObject target) {
				XvegFeature sourceFeature = feature.getDiagramType().getFeatureForObject(source);
				XvegFeature targetFeature = feature.getDiagramType().getFeatureForObject(target);
				return feature.getPossibleSourceFeatures().contains(sourceFeature) &&
						feature.getPossibleTargetFeatures().contains(targetFeature);
			}
			
		};
	}

	@Override
	public IEdgeGraphicConfiguration getEdgeGraphicConfiguration(
			EdgeFeature feature, EObject object) {
		@SuppressWarnings("unchecked")
		IEdgeFeatureConfigurationProvider<EObject> configurationProvider = 
			(IEdgeFeatureConfigurationProvider<EObject>)feature.getConfiguration();
		if (configurationProvider != null) {
			IEdgeGraphicConfiguration configuration = configurationProvider.getEdgeGraphicConfiguration(feature, object);
			if (configuration != null) {
				return configuration;
			}
		}
		
		return new DefaultEdgeGraphicsConfiguration();
	}
}
