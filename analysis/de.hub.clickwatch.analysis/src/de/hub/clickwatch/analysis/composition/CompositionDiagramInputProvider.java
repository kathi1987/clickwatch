package de.hub.clickwatch.analysis.composition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import de.hub.clickwatch.analysis.composition.model.DataNode;
import de.hub.clickwatch.analysis.visualization.IVisualizationInputProvider;

public class CompositionDiagramInputProvider implements IVisualizationInputProvider {

	@Override
	public Object getInput(IWorkbenchPart part, ISelection selection) {
		if (part instanceof IDiagramEditor) {
			PictogramElement[] pes = ((IDiagramEditor)part).getSelectedPictogramElements();
			if (pes.length > 0) {
				EObject[] bos = Graphiti.getLinkService().getAllBusinessObjectsForLinkedPictogramElement(pes[0]);
				if (bos.length > 0) {
					EObject bo = bos[0];
					if (bo instanceof DataNode) {
						DataNode node = (DataNode)bo;
						if (node.isHasData()) {
							return node;
//							if (node instanceof ModelNode) {
//								Resource model = ModelUtil.getModelFromModelNode((ModelNode)node);
//								setInput(node, model);
//								return;
//							} else if (node instanceof DataSetNode) {
//								setInput(node, ((DataSetNode)node).getData());
//								return;
//							} else if (node instanceof MeasureNode) {
//								setInput(node, ((MeasureNode)node).getData());
//								return;
//							}
						}
					}
				}
			}
			
		}
		
		return null;
	}

}
