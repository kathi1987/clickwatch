package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public interface IEdgeFeatureConfigurationProvider<T extends EObject> extends IFeatureConfigurationProvider<T> {

	public ICreateEdgeConfiguration<T> getCreateEdgeConfiguration(EdgeFeature feature);
	
	public IEdgeGraphicConfiguration getEdgeGraphicConfiguration(EdgeFeature feature, T object);
}
