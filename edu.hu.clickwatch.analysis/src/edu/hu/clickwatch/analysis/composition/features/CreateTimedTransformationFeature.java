package edu.hu.clickwatch.analysis.composition.features;

import org.eclipse.graphiti.features.IFeatureProvider;

import edu.hu.clickwatch.analysis.composition.model.CompositionFactory;
import edu.hu.clickwatch.analysis.composition.model.TimedTransformation;
import edu.hu.clickwatch.analysis.composition.model.Transformation;

public class CreateTimedTransformationFeature extends CreateTransformationFeature {

	public CreateTimedTransformationFeature(IFeatureProvider fp) {
		super(fp, "TimedTransformation", "create a timed transformation");
	}

	@Override
	protected Transformation createTransformation() {
		TimedTransformation result = CompositionFactory.eINSTANCE.createTimedTransformation();
		result.setLabel("new TimedTransformation");
		return result;
	}
	
}
