package edu.hu.clickwatch.analysis.composition.features;

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import edu.hu.clickwatch.analysis.composition.Style;
import edu.hu.clickwatch.analysis.composition.model.ModelNode;
import edu.hu.clickwatch.analysis.composition.model.Node;

public class AddModelNodeFeature extends AbstractAddShapeFeature implements Style {
	

 
    public AddModelNodeFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    public boolean canAdd(IAddContext context) {
        if (canAdd(context.getNewObject())) {
            if (context.getTargetContainer() instanceof Diagram) {
                return true;
            }
        }
        return false;
    }
    
    protected boolean canAdd(Object newObject) {
    	return newObject instanceof ModelNode;
    }
    
    protected GraphicsAlgorithm addSpecificShape(IAddContext context, ContainerShape containerShape) {
    	ModelNode addedNode = (ModelNode)context.getNewObject();
    	IPeCreateService peCreateService = Graphiti.getPeCreateService();
    	IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
        stylizeShape(roundedRectangle);
        
        Shape shape = peCreateService.createShape(containerShape, false);
        Ellipse ellipse = gaService.createEllipse(shape);
        gaService.setLocationAndSize(ellipse, 5, 5, 5, 5);
        ellipse.setBackground(manageColor(Style.MODEL_MARKER_BACKGROUND));
        ellipse.setFilled(true);
        ellipse.setTransparency(addedNode.isHasModel() ? 0.0 : 1.0);
        
        return roundedRectangle;
    }
    
    protected void stylizeShape(GraphicsAlgorithm shape) {
    	shape.setForeground(manageColor(SHAPE_FOREGROUND));
    	shape.setBackground(manageColor(SHAPE_BACKGROUND));
    	shape.setLineWidth(2);
    }
 
    public PictogramElement add(IAddContext context) {
    	Node addedNode = (Node)context.getNewObject();
        Diagram targetDiagram = (Diagram) context.getTargetContainer();
 
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();
        
        ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
        
        int width = LayoutNodeHelper.getWidth(context.getWidth());
        int height = LayoutNodeHelper.getHeight(context.getHeight());
        
        GraphicsAlgorithm specificShape = addSpecificShape(context, containerShape);
        gaService.setLocationAndSize(specificShape, context.getX(), context.getY(), width, height);
        
        if (addedNode.eResource() == null) {
            getDiagram().eResource().getContents().add(addedNode);
        }

		link(containerShape, addedNode);
                
        Shape shape = peCreateService.createShape(containerShape, false);
        Text text = gaService.createDefaultText(shape, addedNode.getLabel());
        text.setForeground(manageColor(TEXT_FOREGROUND));
        text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
        text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
        text.getFont().setBold(true);
        text.getFont().setSize(12);
        gaService.setLocationAndSize(text, 0, 0, width, height);
 
        link(shape, addedNode);
        
		final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(containerShape);
		directEditingInfo.setPictogramElement(shape);
		directEditingInfo.setGraphicsAlgorithm(text);
        
		peCreateService.createChopboxAnchor(containerShape);	
 
        return containerShape;
    }
}
