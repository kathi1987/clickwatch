package de.hub.clickwatch.analysis.activity_composition.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeService;

import de.hub.clickwatch.analysis.activity_composition.model.ActionNode;
import de.hub.clickwatch.analysis.activity_composition.model.StartNode;
import de.hub.clickwatch.analysis.activity_composition.model.Transformation;
import de.hub.clickwatch.analysis.activity_composition.transformation.TransformationEngine;

/**
 * The feature to start the transformation
 * 
 * @author Lars George
 * 
 */
public class StartTransformationFeature extends AbstractCustomFeature {

	private boolean hasDoneChanges = false;

	public StartTransformationFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Start transformation";
	}

	@Override
	public String getDescription() {
		return "Starts the transformation process";
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		for (PictogramElement pe : context.getPictogramElements()) {
			Object o = getBusinessObjectForPictogramElement(pe);
			if (o instanceof StartNode) {
				return true;
			}
		}

		return false;
	}

	@Override
	public void execute(ICustomContext context) {
		for (PictogramElement pe : context.getPictogramElements()) {
			Object o = getBusinessObjectForPictogramElement(pe);
			if (o instanceof StartNode) {

				System.out.println("starting the transformation now");

				StartNode startNode = (StartNode) o;
				traverseNodes(startNode);

				break;
			}
		}
	}

	/**
	 * This method starts at an aciton node and follows all progress edges from
	 * there until there are no more edges to follow. Each transformation found
	 * on the way will be executed before the traversing moves on
	 * 
	 * @param node
	 *            the start node of the traversal process
	 */
	private void traverseNodes(ActionNode node) {

		if (node.getProgressConnection() != null
				&& node.getProgressConnection().getTarget() != null) {
			// perform the transformation
			if (node instanceof Transformation) {

				// create a new transformation engine object and perform the
				// transformation
				TransformationEngine transEngine = new TransformationEngine(
						(Transformation) node);
				transEngine.executeTransformation();
			}

			// recursive call to traverse all nodes
			traverseNodes(node.getProgressConnection().getTarget());
		}

	}

	@Override
	public boolean hasDoneChanges() {
		return this.hasDoneChanges;
	}

}
