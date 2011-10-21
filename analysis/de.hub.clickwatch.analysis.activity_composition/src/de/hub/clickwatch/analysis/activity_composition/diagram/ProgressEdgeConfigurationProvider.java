package de.hub.clickwatch.analysis.activity_composition.diagram;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.analysis.activity_composition.model.ActionNode;
import de.hub.clickwatch.analysis.activity_composition.model.ModelFactory;
import de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge;
import de.hub.clickwatch.analysis.activity_composition.model.StartNode;
import de.hub.xveg.configuration.AbstractEdgeFeatureConfigurationProvider;
import de.hub.xveg.configuration.ICreateEdgeConfiguration;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

/**
 * The ProgressEdgeConfigurationProvider created new progress edges and checks
 * of certain connections are possible or not
 * 
 * @author Lars George
 * 
 */
public class ProgressEdgeConfigurationProvider extends
		AbstractEdgeFeatureConfigurationProvider<ProgressEdge> {

	@Override
	public ICreateEdgeConfiguration<ProgressEdge> getCreateEdgeConfiguration(
			EdgeFeature feature) {
		return new ICreateEdgeConfiguration<ProgressEdge>() {

			private ProgressEdge createProgressEdge() {
				ProgressEdge edge = ModelFactory.eINSTANCE.createProgressEdge();
				edge.setLabel("progress");
				return edge;
			}

			@Override
			public ProgressEdge createEdge(EdgeFeature feature, EObject source,
					EObject target) {

				// create the edge
				ProgressEdge progEdge = createProgressEdge();

				// set the source and target links in the edge
				progEdge.setSource((ActionNode) source);
				progEdge.setTarget((ActionNode) target);

				// tell the source that it has a new connection
				((ActionNode) source).setProgressConnection(progEdge);

				return progEdge;
			}

			@Override
			public boolean isPossible(EdgeFeature feature, EObject source,
					EObject target) {

				// only allow connections to action nodes, if they are no
				// StartNode and the source node has not already a conncetion
				return source instanceof ActionNode
						&& target instanceof ActionNode
						&& !(target instanceof StartNode)
						&& ((ActionNode) source).getProgressConnection() == null;
			}
		};
	}

}
