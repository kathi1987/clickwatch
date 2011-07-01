package de.hub.clickwatch.analysis.composition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import de.hub.clickwatch.analysis.composition.model.DataNode;
import de.hub.clickwatch.analysis.composition.model.DataSetNode;
import de.hub.clickwatch.analysis.composition.model.MeasureNode;
import de.hub.clickwatch.analysis.composition.model.ModelNode;
import de.hub.clickwatch.analysis.composition.model.ModelUtil;


public abstract class AbstractDataView extends ViewPart implements ISelectionListener {
	
	protected abstract void setInput(DataNode node, Object input);

	public AbstractDataView() {
	}

	public void createPartControl(Composite parent) {		
		getViewSite().getPage().addSelectionListener(this);
	}

	@Override
	public final void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (part instanceof IDiagramEditor) {
			PictogramElement[] pes = ((IDiagramEditor)part).getSelectedPictogramElements();
			if (pes.length > 0) {
				EObject[] bos = Graphiti.getLinkService().getAllBusinessObjectsForLinkedPictogramElement(pes[0]);
				if (bos.length > 0) {
					EObject bo = bos[0];
					if (bo instanceof DataNode) {
						DataNode node = (DataNode)bo;
						if (node.isHasData()) {
							if (node instanceof ModelNode) {
								Resource model = ModelUtil.getModelFromModelNode((ModelNode)node);
								setInput(node, model);
								return;
							} else if (node instanceof DataSetNode) {
								setInput(node, ((DataSetNode)node).getData());
								return;
							} else if (node instanceof MeasureNode) {
								setInput(node, ((MeasureNode)node).getData());
								return;
							}
						}
					}
				}
			}
			
		}
		
		setInput(null, null);
	}

	@Override
	public void setFocus() {
		//empty
	}
	
}