package de.hub.clickwatch.ui.views;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import com.google.inject.Inject;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.provider.ClickWatchReflectiveItemProviderAdapterFactory;

public class ResultView extends ViewPart {
	
	private Action save = null;
	private StackLayout layout = null;
	private TreeViewer treeViewer = null;
	private TextViewer textViewer = null;
	private ComposedAdapterFactory adapterFactory;
	
	@Inject
	private XmlModelRepository xmlModelRepository; 
	
	public void setInput(Object input) {
		EObject currentInput = (EObject)treeViewer.getInput();
		if (currentInput != null) {
			treeViewer.setInput(null);
			EcoreUtil.delete(currentInput);
		}
		if (input instanceof EObject) {
			treeViewer.setInput(input);
			layout.topControl = treeViewer.getControl();
			treeViewer.getControl().getParent().layout();
		} else {
			textViewer.setInput(new Document(input.toString()));
			layout.topControl = textViewer.getControl();
			textViewer.getControl().getParent().layout();
		}	
	}
	
	public ResultView() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ClickWatchReflectiveItemProviderAdapterFactory());
	}

	@Override
	public void createPartControl(Composite parent) {
		layout = new StackLayout();
		parent.setLayout(layout);
		treeViewer = new TreeViewer(parent);
		
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		
		new AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);
		
		textViewer = new TextViewer(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		
		layout.topControl = treeViewer.getControl();
		
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
			String content = null;
			if (layout.topControl == treeViewer.getControl()) {
				content = xmlModelRepository.serializeXml((EObject)(treeViewer.getInput()));
			} else {
				content = textViewer.getDocument().get();
			}
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
