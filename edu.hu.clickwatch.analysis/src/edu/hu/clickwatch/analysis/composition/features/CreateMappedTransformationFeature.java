package edu.hu.clickwatch.analysis.composition.features;

import org.eclipse.graphiti.features.IFeatureProvider;

import edu.hu.clickwatch.analysis.composition.model.CompositionFactory;
import edu.hu.clickwatch.analysis.composition.model.MappedTransformation;
import edu.hu.clickwatch.analysis.composition.model.Transformation;

public class CreateMappedTransformationFeature extends CreateTransformationFeature {

	public CreateMappedTransformationFeature(IFeatureProvider fp) {
		super(fp, "MappedTransformation", "create a mapped transformation");
	}

	@Override
	protected Transformation createTransformation() {
		MappedTransformation result = CompositionFactory.eINSTANCE.createMappedTransformation();
		result.setLabel("MappedTransformation");
		return result;
	}
	
}
