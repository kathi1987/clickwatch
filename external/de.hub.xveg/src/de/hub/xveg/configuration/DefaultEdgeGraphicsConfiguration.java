package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import de.hub.xveg.internal.configuration.DefaultFeatureConfigurationProvider;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public class DefaultEdgeGraphicsConfiguration implements IEdgeGraphicConfiguration {
	
	private EdgeFeature feature = null;
	
	protected EObject dslObject = null;
	protected IGaService gaService;
	protected IPeCreateService peCreateService;
	
	private void init() {
		peCreateService = Graphiti.getPeCreateService();
        gaService = Graphiti.getGaService();
	}
	
	private void init(IUpdateContext context) {
		init();
		dslObject = context.getPictogramElement().getLink().getBusinessObjects().get(0);
	}
		
	protected IReason updateContentIsNeeded(EObject content) {
		if (content instanceof Text) {
			Text text = (Text) content;
			String pictogramName = text.getValue();
			ILabelConfiguration<EObject> configuration = DefaultFeatureConfigurationProvider.INSTANCE.getLabelConfiguration(feature, dslObject);
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
			
			ILabelConfiguration<EObject> configuration = DefaultFeatureConfigurationProvider.INSTANCE.getLabelConfiguration(feature, dslObject);
			String businessName = configuration.getLabel(feature, dslObject);
			
			text.setValue(businessName);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public IReason updateGraphicsNeeded(EdgeFeature feature, IUpdateContext context) {
		this.feature = feature;
		init(context);
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof Connection) {
			Connection c = (Connection) pictogramElement;
			for (ConnectionDecorator decorator : c.getConnectionDecorators()) {
				IReason reason = updateContentIsNeeded(decorator.getGraphicsAlgorithm());
				if (reason != null) {
					return reason;
				}
			}
		}

		return Reason.createFalseReason();
	}

	@Override
	public boolean updateGraphics(EdgeFeature feature, IUpdateContext context) {
		this.feature = feature;
		init(context);
		PictogramElement pictogramElement = context.getPictogramElement();

		boolean hasChanged = false;
		if (pictogramElement instanceof Connection) {
			Connection c = (Connection)pictogramElement;
			for (ConnectionDecorator decorator: c.getConnectionDecorators()) {
				hasChanged = hasChanged || updateContent(decorator.getGraphicsAlgorithm());	
			}
		}
		return hasChanged;
	}
	
	
}
