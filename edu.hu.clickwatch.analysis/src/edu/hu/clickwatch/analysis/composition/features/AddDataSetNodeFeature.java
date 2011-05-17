package edu.hu.clickwatch.analysis.composition.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import edu.hu.clickwatch.analysis.composition.model.DataSetNode;

public class AddDataSetNodeFeature extends AddModelNodeFeature {
	
	public AddDataSetNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected boolean canAdd(Object newObject) {
		return newObject instanceof DataSetNode;
	}

	@Override
	protected GraphicsAlgorithm addSpecificShape(IAddContext context, ContainerShape containerShape) {
    	IGaService gaService = Graphiti.getGaService();
    	
    	int width = LayoutNodeHelper.getWidth(context.getWidth());
    	int height = LayoutNodeHelper.getHeight(context.getHeight());
    	
    	Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
    	
    	Polyline polyline = gaService.createPolyline(invisibleRectangle, LayoutNodeHelper.getRectangularPolylinePoints(width, height));
    	polyline.setForeground(manageColor(DELIMETER_FOREGROUND));
    	polyline.setLineWidth(1);
    	polyline.setLineStyle(LineStyle.DASHDOT);
    	
    	Ellipse ellipse = gaService.createEllipse(invisibleRectangle);
    	stylizeShape(ellipse);
    	gaService.setLocationAndSize(ellipse, (width-24-8), 4, 20, 20);
    	ellipse = gaService.createEllipse(invisibleRectangle);
    	stylizeShape(ellipse);
    	gaService.setLocationAndSize(ellipse, (width-20-8), 6, 20, 20);
    	ellipse = gaService.createEllipse(invisibleRectangle);
    	stylizeShape(ellipse);
    	gaService.setLocationAndSize(ellipse, (width-16-8), 8, 20, 20);

        return invisibleRectangle;
	}
}
