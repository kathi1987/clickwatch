package de.hub.clickwatch.analysis.activity_composition.diagram.graphicsConfigurations;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.hub.clickwatch.analysis.activity_composition.diagram.DefaultFeatureConfigurtationProvider;
import de.hub.clickwatch.analysis.activity_composition.diagram.DefaultStyle;
import de.hub.clickwatch.analysis.activity_composition.diagram.Style;
import de.hub.xveg.configuration.DefaultVertexGraphicsConfiguration;
import de.hub.xveg.configuration.ILabelConfiguration;
import de.hub.xveg.xvegfeaturemodel.StyleInfo;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public class DataNodeGraphicsConfiguration extends
		DefaultVertexGraphicsConfiguration {

	private AddGraphicsHelper helper = null;
	private VertexFeature feature = null;

	protected int width = -1;
	protected int height = -1;

	protected EObject dslObject = null;
	protected IGaService gaService;
	protected IPeCreateService peCreateService;

	private void init() {
		peCreateService = Graphiti.getPeCreateService();
		gaService = Graphiti.getGaService();
	}

	private void init(IAddContext context) {
		init();
		dslObject = (EObject) context.getNewObject();
		this.width = getWidth(context.getWidth());
		this.height = getHeight(context.getHeight());
	}

	private void init(ILayoutContext context) {
		init();
		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		if (!context.getPictogramElement().getLink().getBusinessObjects()
				.isEmpty()) {
			dslObject = context.getPictogramElement().getLink()
					.getBusinessObjects().get(0);
		} else {
			dslObject = null;
		}
		width = getWidth(containerGa.getWidth());
		height = getHeight(containerGa.getHeight());
	}

	private void init(IUpdateContext context) {
		init();
		dslObject = context.getPictogramElement().getLink()
				.getBusinessObjects().get(0);
	}

	protected void layoutContent(EObject next) {
		IGaService gaService = Graphiti.getGaService();
		if (next instanceof GraphicsAlgorithm) {
			GraphicsAlgorithm ga = (GraphicsAlgorithm) next;
			gaService.setWidth(ga, width);
			gaService.setHeight(ga, height);
		}
	}

	@Override
	public boolean layoutGraphics(VertexFeature feature, ILayoutContext context) {
		init(context);

		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		Iterator<EObject> i = containerShape.eAllContents();
		while (i.hasNext()) {
			EObject next = i.next();
			layoutContent(next);
		}
		return sizeHasChanges(width, height);
	}

	protected GraphicsAlgorithm addSpecificShape(IAddContext context,
			ContainerShape containerShape) {
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(
				containerShape, 2, 2);
		stylize(roundedRectangle);
		return roundedRectangle;
	}

	protected void addAdditionalShapes(IAddContext context,
			ContainerShape containerShape) {
		// emtpy
	}

	protected void stylize(GraphicsAlgorithm shape) {
		StyleInfo style = feature.getStyle() == null ? DefaultStyle.INSTANCE
				: feature.getStyle();
		shape.setForeground(helper.manageColor(Style.SHAPE_FOREGROUND));
		shape.setBackground(helper.manageColor(Style.SHAPE_BACKGROUND));
		shape.setLineWidth(2);
	}

	protected Color manageColor(IColorConstant color) {
		return helper.manageColor(color);
	}

	@Override
	public PictogramElement addGraphics(VertexFeature feature,
			IAddContext context, AddGraphicsHelper helper) {
		init(context);
		this.feature = feature;
		this.helper = helper;

		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		StyleInfo style = feature.getStyle() == null ? DefaultStyle.INSTANCE
				: feature.getStyle();

		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);
		helper.link(containerShape);

		GraphicsAlgorithm specificShape = addSpecificShape(context,
				containerShape);
		addAdditionalShapes(context, containerShape);

		gaService.setLocationAndSize(specificShape, context.getX(),
				context.getY(), width, height);

		if (dslObject.eResource() == null) {
			targetDiagram.eResource().getContents().add(dslObject);
		}

		helper.link(containerShape);
		Shape shape = peCreateService.createShape(containerShape, false);

		String label = DefaultFeatureConfigurtationProvider.INSTANCE
				.getLabelConfiguration(feature, dslObject).getLabel(feature,
						dslObject);

		Text text = gaService.createDefaultText(targetDiagram, shape, label);
		text.setForeground(helper.manageColor(Style.SHAPE_FOREGROUND));
		text.setBackground(helper.manageColor(Style.SHAPE_BACKGROUND));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);

		text.getFont().setBold(style.isBoldFont());
		text.getFont().setSize(style.getFontSize());
		gaService.setLocationAndSize(text, 0, 0, width, height);

		helper.link(shape);

		helper.configureDirectEditing(containerShape, shape, text);
		peCreateService.createChopboxAnchor(containerShape);

		return containerShape;
	}

	public static int MIN_HEIGHT = 40;
	public static int MIN_WIDTH = 40;

	public int getWidth(int width) {
		return width < MIN_WIDTH ? MIN_WIDTH : width;
	}

	public int getHeight(int height) {
		return height < MIN_HEIGHT ? MIN_HEIGHT : height;
	}

	public boolean sizeHasChanges(int width, int height) {
		return width != MIN_WIDTH || height != MIN_HEIGHT;
	}

	protected IReason updateContentIsNeeded(EObject content) {
		if (content instanceof Text) {
			Text text = (Text) content;
			String pictogramName = text.getValue();
			ILabelConfiguration<EObject> configuration = DefaultFeatureConfigurtationProvider.INSTANCE
					.getLabelConfiguration(feature, dslObject);
			String dslName = configuration.getLabel(feature, dslObject);
			boolean updateNameNeeded = ((pictogramName == null && dslName != null) || (pictogramName != null && !pictogramName
					.equals(dslName)));

			if (updateNameNeeded) {
				return Reason.createTrueReason("Name is out of date"); //$NON-NLS-1$
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	protected boolean updateContent(EObject content) {
		if (content instanceof Text) {
			Text text = (Text) content;

			ILabelConfiguration<EObject> configuration = DefaultFeatureConfigurtationProvider.INSTANCE
					.getLabelConfiguration(feature, dslObject);
			String businessName = configuration.getLabel(feature, dslObject);

			text.setValue(businessName);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public IReason updateGraphicsNeeded(VertexFeature feature,
			IUpdateContext context) {
		this.feature = feature;
		init(context);
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				IReason reason = updateContentIsNeeded(shape
						.getGraphicsAlgorithm());
				if (reason != null) {
					return reason;
				}
			}
		}

		return Reason.createFalseReason();
	}

	@Override
	public boolean updateGraphics(VertexFeature feature, IUpdateContext context) {
		this.feature = feature;
		init(context);
		PictogramElement pictogramElement = context.getPictogramElement();

		boolean hasChanged = false;
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (updateContent(shape.getGraphicsAlgorithm())) {
					hasChanged = true;
				}
			}
			return hasChanged;
		}
		return hasChanged;
	}

}
