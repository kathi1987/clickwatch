package de.hub.clickwatch.analysis.activity_composition.diagram;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.analysis.activity_composition.model.DataNode;
import de.hub.clickwatch.analysis.activity_composition.model.ModelFactory;
import de.hub.clickwatch.analysis.activity_composition.model.OutputEdge;
import de.hub.clickwatch.analysis.activity_composition.model.Transformation;
import de.hub.xveg.configuration.AbstractEdgeFeatureConfigurationProvider;
import de.hub.xveg.configuration.ICreateEdgeConfiguration;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public class OutputDataEdgeConfigurationProvider extends
		AbstractEdgeFeatureConfigurationProvider<OutputEdge> {

	@Override
	public ICreateEdgeConfiguration<OutputEdge> getCreateEdgeConfiguration(
			EdgeFeature feature) {
		return new ICreateEdgeConfiguration<OutputEdge>() {

			private OutputEdge createOutputDataEdge() {
				OutputEdge edge = ModelFactory.eINSTANCE.createOutputEdge();
				edge.setLabel("output");
				return edge;
			}

			@Override
			public OutputEdge createEdge(EdgeFeature feature, EObject source,
					EObject target) {

				// create the edge
				OutputEdge outputEdge = createOutputDataEdge();

				// set the source and target links in the edge
				outputEdge.setSource((Transformation) source);
				outputEdge.setTarget((DataNode) target);

				return outputEdge;
			}

			@Override
			public boolean isPossible(EdgeFeature feature, EObject source,
					EObject target) {

				// only allow connections from DataNodes to transformations
				return target instanceof DataNode
						&& source instanceof Transformation;
			}
		};
	}

}
