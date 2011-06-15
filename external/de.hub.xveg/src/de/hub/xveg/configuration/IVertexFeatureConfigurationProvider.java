package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public interface IVertexFeatureConfigurationProvider<T extends EObject> extends IFeatureConfigurationProvider<T> {

	public ICreateVertexConfiguration<T> getCreateVertexConfiguration(VertexFeature feature);
	
	public IVertexGraphicConfiguration getVertixGraphicsConfiguration(VertexFeature feature, T object);
	
}
