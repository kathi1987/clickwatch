package de.hub.clickwatch.analysis.composition.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.hub.clickwatch.analysis.composition.Style;
import de.hub.clickwatch.analysis.composition.model.DataNode;
import de.hub.xveg.configuration.DefaultVertexGraphicsConfiguration;

public class CompositionVertexGraphicsConfiguration extends DefaultVertexGraphicsConfiguration {

	@Override
	protected void addAdditionalShapes(IAddContext context,
			ContainerShape containerShape) {
		super.addAdditionalShapes(context, containerShape);
		
        DataNode addedNode = (DataNode)dslObject;
        
        Shape dataShape = peCreateService.createShape(containerShape, false);
        Ellipse ellipse = gaService.createEllipse(dataShape);
        gaService.setLocationAndSize(ellipse, 5, 5, 5, 5);
        ellipse.setBackground(manageColor(Style.MODEL_MARKER_BACKGROUND));
        ellipse.setFilled(true);
        ellipse.setTransparency(addedNode.isHasData() ? 0.0 : 1.0);
	}

	@Override
	protected void layoutContent(EObject next) {
		if (next instanceof Ellipse &&
				((Ellipse)next).getWidth() == 5 && (((Ellipse)next).getHeight() == 5)) {
			((Ellipse)next).setTransparency(((DataNode)dslObject).isHasData() ? 0.0 : 1.0);			
		} else {
			super.layoutContent(next);
		}
	}

	@Override
	protected IReason updateContentIsNeeded(EObject content) {
		if (content instanceof Ellipse) {
			boolean pictogramHasModel = ((Ellipse)content).getTransparency() == 0;
			if (dslObject instanceof DataNode && ((DataNode)dslObject).isHasData() != pictogramHasModel) {
				return Reason.createTrueReason("Model status is out of date"); //$NON-NLS-1$
			} else {
				return null;
			}
		} else {
			return super.updateContentIsNeeded(content);
		}
	}

	@Override
	protected boolean updateContent(EObject content) {
		if (content instanceof Ellipse && dslObject instanceof DataNode) {
			Ellipse ellipse = (Ellipse) content;
			ellipse.setTransparency(((DataNode)dslObject).isHasData() ? 0.0: 1.0);
			return true;
		} else {	
			return super.updateContent(content);
		}
	}
}
