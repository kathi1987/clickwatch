package de.hub.xveg.internal.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.hub.xveg.internal.configuration.DefaultEdgeFeatureConfigurationProvider;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public class CreateEdgeFeature extends AbstractCreateConnectionFeature {

	private final EdgeFeature feature;

	public CreateEdgeFeature(IFeatureProvider fp, EdgeFeature feature) {
		super(fp, feature.getName(), "Create " + feature); //$NON-NLS-1$ //$NON-NLS-2$
		this.feature = feature;
	}

	public boolean canCreate(ICreateConnectionContext context) {
		EObject source = getVertex(context.getSourceAnchor());
		EObject target = getVertex(context.getTargetAnchor());
		if (source != null && target != null) {
			return DefaultEdgeFeatureConfigurationProvider.INSTANCE
					.getCreateEdgeConfiguration(feature).isPossible(feature,
							source, target);
		} else {
			return false;
		}
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		if (getVertex(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	public Connection create(ICreateConnectionContext context) {
		EObject source = getVertex(context.getSourceAnchor());
		EObject target = getVertex(context.getTargetAnchor());

		EObject newEdge = DefaultEdgeFeatureConfigurationProvider.INSTANCE
				.getCreateEdgeConfiguration(feature).createEdge(feature,
						source, target);

		getDiagram().eResource().getContents().add(newEdge);

		AddConnectionContext addContext = new AddConnectionContext(
				context.getSourceAnchor(), context.getTargetAnchor());
		addContext.setNewObject(newEdge);
		Connection newConnection = (Connection) getFeatureProvider()
				.addIfPossible(addContext);

		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return newConnection;
	}

	private EObject getVertex(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (obj instanceof EObject) {
				return (EObject) obj;
			}
		}
		return null;
	}
}