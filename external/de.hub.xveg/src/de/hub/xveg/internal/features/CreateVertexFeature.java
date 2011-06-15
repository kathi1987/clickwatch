package de.hub.xveg.internal.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.hub.xveg.internal.configuration.DefaultVertexConfigurationProvider;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public class CreateVertexFeature extends AbstractCreateFeature {

	private final VertexFeature feature;

	public CreateVertexFeature(IFeatureProvider fp, VertexFeature feature) {
		super(fp, feature.getName(), "Create " + feature.getName());
		this.feature = feature;
	}

	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	public Object[] create(ICreateContext context) {
		EObject newVertex = DefaultVertexConfigurationProvider.INSTANCE
				.getCreateVertexConfiguration(feature).createVertex(feature);

		getDiagram().eResource().getContents().add(newVertex);

		// Use the following instead of the above line to store the model
		// data in a seperate file parallel to the diagram file
		// try {
		// try {
		// TutorialUtil.saveToModelFile(newClass, getDiagram());
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// } catch (CoreException e) {
		// e.printStackTrace();
		// }

		addGraphicalRepresentation(context, newVertex);
		getFeatureProvider().getDirectEditingInfo().setActive(true);
		return new Object[] { newVertex };
	}
}