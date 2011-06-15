package de.hub.xveg.configuration;

import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.util.IColorConstant;

import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public interface IVertexGraphicConfiguration {

	public interface AddGraphicsHelper {
		public void link(PictogramElement pictogramElement);

		public Color manageColor(IColorConstant color);

		public void configureDirectEditing(
				PictogramElement mainPictogramElement,
				PictogramElement pictogramElement, GraphicsAlgorithm ga);
	}

	public PictogramElement addGraphics(VertexFeature feature,
			IAddContext addContext, AddGraphicsHelper helper);

	public boolean layoutGraphics(VertexFeature feature,
			ILayoutContext layoutContext);
	
	public IReason updateGraphicsNeeded(VertexFeature feature, IUpdateContext context);
	
	public boolean updateGraphics(VertexFeature feature, IUpdateContext context);
}
