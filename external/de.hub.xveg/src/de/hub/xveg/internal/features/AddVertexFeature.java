package de.hub.xveg.internal.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.util.IColorConstant;

import de.hub.xveg.configuration.IVertexGraphicConfiguration;
import de.hub.xveg.internal.configuration.DefaultVertexConfigurationProvider;
import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public class AddVertexFeature extends AbstractAddShapeFeature {
 
	public AddVertexFeature(IFeatureProvider fp) {
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
    	return newObject instanceof EObject &&
    			((XvegFeatureProvider)getFeatureProvider()).getFeatureOfElement((EObject)newObject) != null;
    }
 
    public PictogramElement add(IAddContext context) {
    	final EObject object = (EObject)context.getNewObject();
		VertexFeature feature = (VertexFeature) ((XvegFeatureProvider) getFeatureProvider()).getFeatureOfElement(object);
		
		IVertexGraphicConfiguration configuration = 
				DefaultVertexConfigurationProvider.INSTANCE.getVertixGraphicsConfiguration(feature, object);
		return configuration.addGraphics(feature, context, new IVertexGraphicConfiguration.AddGraphicsHelper() {
			
			@Override
			public Color manageColor(IColorConstant color) {
				return AddVertexFeature.this.manageColor(color);
			}
			
			@Override
			public void link(PictogramElement pictogramElement) {
				AddVertexFeature.this.link(pictogramElement, object);				
			}
			
			@Override
			public void configureDirectEditing(PictogramElement mainPictogramElement,
					PictogramElement pictogramElement, GraphicsAlgorithm ga) {
				IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
				directEditingInfo.setMainPictogramElement(mainPictogramElement);
				directEditingInfo.setPictogramElement(pictogramElement);
				directEditingInfo.setGraphicsAlgorithm(ga);
			}
		});
    }
}
