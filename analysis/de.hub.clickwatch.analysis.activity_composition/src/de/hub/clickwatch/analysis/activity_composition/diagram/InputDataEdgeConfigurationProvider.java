package de.hub.clickwatch.analysis.activity_composition.diagram;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.analysis.activity_composition.model.DataNode;
import de.hub.clickwatch.analysis.activity_composition.model.InputEdge;
import de.hub.clickwatch.analysis.activity_composition.model.ModelFactory;
import de.hub.clickwatch.analysis.activity_composition.model.Transformation;
import de.hub.xveg.configuration.AbstractEdgeFeatureConfigurationProvider;
import de.hub.xveg.configuration.ICreateEdgeConfiguration;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public class InputDataEdgeConfigurationProvider extends
		AbstractEdgeFeatureConfigurationProvider<InputEdge> {

	@Override
	public ICreateEdgeConfiguration<InputEdge> getCreateEdgeConfiguration(
			EdgeFeature feature) {
		return new ICreateEdgeConfiguration<InputEdge>() {

			private InputEdge createInputDataEdge() {
				InputEdge edge = ModelFactory.eINSTANCE.createInputEdge();
				edge.setLabel("input");
				return edge;
			}

			@Override
			public InputEdge createEdge(EdgeFeature feature, EObject source,
					EObject target) {

				// create the edge
				InputEdge inputEdge = createInputDataEdge();

				// set the source and target links in the edge
				inputEdge.setSource((DataNode) source);
				inputEdge.setTarget((Transformation) target);

				((Transformation)target).getInput().add(inputEdge);
				
				return inputEdge;
			}

			@Override
			public boolean isPossible(EdgeFeature feature, EObject source,
					EObject target) {

				// only allow connections from DataNodes to transformations
				return source instanceof DataNode
						&& target instanceof Transformation;
			}
		};
	}

}
