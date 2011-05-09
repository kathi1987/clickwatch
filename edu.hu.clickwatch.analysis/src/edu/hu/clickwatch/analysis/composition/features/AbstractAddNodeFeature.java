package edu.hu.clickwatch.analysis.composition.features;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import edu.hu.clickwatch.analysis.composition.StyleUtil;
import edu.hu.clickwatch.analysis.composition.model.Node;

public abstract class AbstractAddNodeFeature extends AbstractAddShapeFeature {

	// the additional size of the invisible rectangle at the right border
	// (this also equals the half width of the anchor to paint there)
	public static final int INVISIBLE_RECT_RIGHT = 6;


	public AbstractAddNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canAdd(IAddContext context) {
		// check if user wants to add a EClass
		final Object newObject = context.getNewObject();
		if (newObject instanceof EObject && objectClassThatCanBeAdded().isSuperTypeOf(((EObject)newObject).eClass())) {
			if (context.getTargetContainer() instanceof Diagram) {
				return true;
			}
		}
		return false;
	}
	
	protected abstract EClass objectClassThatCanBeAdded();
	
	protected abstract GraphicsAlgorithm addSpecifics(final IAddContext context, final ContainerShape containerShape);

	public PictogramElement add(IAddContext context) {
		final Diagram targetDiagram = (Diagram) context.getTargetContainer();
		final Node addedNode = (Node)context.getNewObject();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();
		final ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);

		final IGaService gaService = Graphiti.getGaService();
		final GraphicsAlgorithm specifics = addSpecifics(context, containerShape);
		
		// if addedClass has no resource we add it to the resource of the diagram
		// in a real scenario the business model would have its own resource
		if (addedNode.eResource() == null) {
			getDiagram().eResource().getContents().add(addedNode);
		}

		// create link and wire it
		link(containerShape, addedNode);

		// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);

//		// create an additional box relative anchor at middle-right
//		final BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);
//		boxAnchor.setRelativeWidth(1.0);
//		boxAnchor.setRelativeHeight(0.38); // Use golden section
//		// anchor references visible rectangle instead of invisible rectangle
//		boxAnchor.setReferencedGraphicsAlgorithm(specifics);
//		
//		// assign a graphics algorithm for the box relative anchor
//		//		final Rectangle boxRect = gaService.createEllipse(boxAnchor);
//		final Ellipse ellipse = gaService.createEllipse(boxAnchor);
//		ellipse.setFilled(true);
//		// anchor is located on the right border of the visible rectangle
//		// and touches the border of the invisible rectangle
//		final int w = INVISIBLE_RECT_RIGHT;
//		gaService.setLocationAndSize(ellipse, -w, -w, 2 * w, 2 * w);
//		//		final Color c = gaService.manageColor(getDiagram(), IColorConstant.DARK_BLUE);
//		//		boxRect.setBackground(c);
//		ellipse.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
		
		
		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	}
}
