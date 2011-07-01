package edu.hu.clickwatch.analysis.composition.diagram;


import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.configuration.AbstractEdgeFeatureConfigurationProvider;
import de.hub.xveg.configuration.ICreateEdgeConfiguration;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;
import edu.hu.clickwatch.analysis.composition.model.CompositionFactory;
import edu.hu.clickwatch.analysis.composition.model.Node;
import edu.hu.clickwatch.analysis.composition.model.ParameterSpec;
import edu.hu.clickwatch.analysis.composition.model.ParameterSpecKind;
import edu.hu.clickwatch.analysis.composition.model.TargetSpec;
import edu.hu.clickwatch.analysis.composition.model.Transformation;

public class TransformationConfigurationProvider extends AbstractEdgeFeatureConfigurationProvider<Transformation> {

	@Override
	public ICreateEdgeConfiguration<Transformation> getCreateEdgeConfiguration(
			EdgeFeature feature) {
		return new ICreateEdgeConfiguration<Transformation>() {
			
			private Transformation createTransformation() {
				Transformation transformation = CompositionFactory.eINSTANCE.createTransformation();
				transformation.setLabel("Transformation"); //$NON-NLS-1$
				return transformation;
			}

			@Override
			public Transformation createEdge(EdgeFeature feature, EObject source,
					EObject target) {
				Transformation transformation = createTransformation();
				
				transformation.setSource((Node)source);
				transformation.setTarget((Node)target);
				
				ParameterSpec input = CompositionFactory.eINSTANCE.createParameterSpec();
				input.setKind(ParameterSpecKind.ROOT);
				ParameterSpec output = CompositionFactory.eINSTANCE.createParameterSpec();
				output.setKind(ParameterSpecKind.ROOT);
				transformation.setInput(input);
				transformation.setOutput(output);
				transformation.setTargetSpec(TargetSpec.ADD);
				
				return transformation;
			}

			@Override
			public boolean isPossible(EdgeFeature feature, EObject source,
					EObject target) {
				return source instanceof Node && target instanceof Node;
			}
		};
	}
	
}
