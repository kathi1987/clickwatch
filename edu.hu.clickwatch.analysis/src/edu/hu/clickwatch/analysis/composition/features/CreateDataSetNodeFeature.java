package edu.hu.clickwatch.analysis.composition.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;

import edu.hu.clickwatch.analysis.composition.model.CompositionFactory;
import edu.hu.clickwatch.analysis.composition.model.Node;

public class CreateDataSetNodeFeature extends AbstractCreateNodeFeature {

	public CreateDataSetNodeFeature(IFeatureProvider fp) {
		super(fp, "DataSet", "Create DataSet"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	protected Node createNode(ICreateContext context) {
		Node result =  CompositionFactory.eINSTANCE.createDataSetNode();
		result.setLabel("DataSet");
		return result;
	}
}
