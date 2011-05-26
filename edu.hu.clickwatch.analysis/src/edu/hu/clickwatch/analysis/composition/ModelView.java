package edu.hu.clickwatch.analysis.composition;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import edu.hu.clickwatch.analysis.composition.model.DataNode;
import edu.hu.clickwatch.analysis.composition.model.DataSetNode;
import edu.hu.clickwatch.analysis.composition.model.MeasureNode;
import edu.hu.clickwatch.analysis.composition.model.ModelNode;
import edu.hu.clickwatch.analysis.composition.model.ModelUtil;
import edu.hu.clickwatch.model.provider.ClickWatchModelItemProviderAdapterFactory;
import edu.hu.clickwatch.model.provider.ClickWatchReflectiveItemProviderAdapterFactory;

public class ModelView extends ViewPart implements ISelectionListener {

	public static final String ID = "edu.hu.clickwatch.analysis.composition.ModelView.ModelView";

	private TreeViewer treeViewer;
	private ComposedAdapterFactory adapterFactory;
	
	private void setInput(Object input) {
		treeViewer.setInput(input);
	}

	public ModelView() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ClickWatchModelItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ClickWatchReflectiveItemProviderAdapterFactory());
	}

	public void createPartControl(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		new AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);
		
		getViewSite().getPage().addSelectionListener(this);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
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
								setInput(model);
								return;
							} else if (node instanceof DataSetNode) {
								setInput(((DataSetNode)node).getData());
								return;
							} else if (node instanceof MeasureNode) {
								setInput(((MeasureNode)node).getData());
								return;
							}
						}
					}
				}
			}
			
		}
		
		setInput(null);
	}

	public void setFocus() {
		treeViewer.getControl().setFocus();
	}
}