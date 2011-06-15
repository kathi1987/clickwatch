package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public class AbstractEdgeFeatureConfigurationProvider<T extends EObject>
		extends AbstractFeatureConfigurationProvider<T> implements
		IEdgeFeatureConfigurationProvider<T> {

	@Override
	public ICreateEdgeConfiguration<T> getCreateEdgeConfiguration(
			EdgeFeature feature) {
		return null;
	}

	@Override
	public IEdgeGraphicConfiguration getEdgeGraphicConfiguration(
			EdgeFeature feature, T object) {
		return null;
	}
}
