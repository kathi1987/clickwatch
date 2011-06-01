package edu.hu.clickwatch.analysis.composition.features;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import edu.hu.clickwatch.analysis.composition.model.MeasureNode;

public class LayoutMeasureNodeFeature extends AbstractLayoutFeature {

	public LayoutMeasureNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof MeasureNode;
	}

	public boolean layout(ILayoutContext context) {
		IGaService gaService = Graphiti.getGaService();
		
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		
		int width = LayoutNodeHelper.getWidth(containerGa.getWidth());
		int height = LayoutNodeHelper.getHeight(containerGa.getHeight());
		
		Iterator<EObject> i = containerShape.eAllContents();
		while (i.hasNext()) {
			EObject next = i.next();
			if (next instanceof Ellipse) {
				Ellipse ellipse = (Ellipse)next;
				gaService.setLocationAndSize(ellipse, (width-24-4), 4, 24, 24);
			} else if (next instanceof Polyline) {
				Polyline polyline = (Polyline)next;
				int[] polylinePoints = LayoutNodeHelper.getRectangularPolylinePoints(width, height);
				for (int ii = 0; ii < 5; ii++) {
					polyline.getPoints().set(ii, gaService.createPoint(polylinePoints[ii*2], polylinePoints[ii*2+1]));
				}
			} else if (next instanceof GraphicsAlgorithm) {
				GraphicsAlgorithm ga = (GraphicsAlgorithm)next;
				gaService.setWidth(ga, width);
				gaService.setHeight(ga, height);
			}
		}

		return LayoutNodeHelper.sizeHasChanges(width, height);
	}

}
