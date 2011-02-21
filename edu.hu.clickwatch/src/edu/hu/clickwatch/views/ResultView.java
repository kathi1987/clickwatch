package edu.hu.clickwatch.views;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import edu.hu.clickwatch.XmlUtil;
import edu.hu.clickwatch.model.provider.ClickWatchModelItemProviderAdapterFactory;

public class ResultView extends ViewPart {
	
	private Action save = null;
	private TreeViewer treeViewer = null;
	private ComposedAdapterFactory adapterFactory;
	
	public void setInput(Object input) {
		treeViewer.setInput(input);
	}
	
	public ResultView() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ClickWatchModelItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	@Override
	public void createPartControl(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		new AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);
		
		makeActions();
		contributeToActionBars();		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(save);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(save);
	}
	
	private void makeActions() {
		save = new Action() {
			public void run() {
				save();
			}
		};
		save.setText("Save");
		save.setToolTipText("Save XSL stylesheet to file");
	}

	private void save() {

        FileDialog fd = new FileDialog(treeViewer.getTree().getShell(), SWT.SAVE);
        fd.setText("Save");
        fd.setFilterPath("D:/");
        String[] filterExt = { "*.xml", "*.*" };
        fd.setFilterExtensions(filterExt);
        String selFile = fd.open();
        System.out.println(selFile);
        
        try {
			PrintWriter out = new PrintWriter(new File(selFile));
	        String content = XmlUtil.serializeXml((EObject)(treeViewer.getInput()));
	        out.write(content);
	        out.close();
		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());
			MessageDialog.openError(treeViewer.getTree().getShell(),
					"Exception", "Exception " + e.getClass().getName()
							+ " occured: " + e.getMessage());
			return;
		}
	}
}
