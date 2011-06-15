package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public class AbstractVertexFeatureConfigurationProvider<T extends EObject> 
		extends AbstractFeatureConfigurationProvider<T> implements IVertexFeatureConfigurationProvider<T> {

	@Override
	public ICreateVertexConfiguration<T> getCreateVertexConfiguration(
			VertexFeature feature) {
		return null;
	}

	@Override
	public IVertexGraphicConfiguration getVertixGraphicsConfiguration(
			VertexFeature feature, T object) {
		return null;
	}
	

}
