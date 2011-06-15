package de.hub.xveg.configuration;

import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;

import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public interface IEdgeGraphicConfiguration {

	public IReason updateGraphicsNeeded(EdgeFeature feature, IUpdateContext context);
	
	public boolean updateGraphics(EdgeFeature feature, IUpdateContext context);
}
