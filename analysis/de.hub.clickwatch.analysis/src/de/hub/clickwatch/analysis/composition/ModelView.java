package de.hub.clickwatch.analysis.composition;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;

import de.hub.clickwatch.analysis.composition.model.DataNode;
import de.hub.clickwatch.model.provider.ClickWatchModelItemProviderAdapterFactory;
import de.hub.clickwatch.model.provider.ClickWatchReflectiveItemProviderAdapterFactory;


public class ModelView extends AbstractDataView {

	public static final String ID = "edu.hu.clickwatch.analysis.composition.ModelView.ModelView";

	private TreeViewer treeViewer;
	private ComposedAdapterFactory adapterFactory;
	
	protected void setInput(DataNode node, Object input) {
		treeViewer.setInput(input);
	}

	public ModelView() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ClickWatchModelItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ClickWatchReflectiveItemProviderAdapterFactory());
	}

	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		new AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);
	}

	public void setFocus() {
		treeViewer.getControl().setFocus();
	}
}