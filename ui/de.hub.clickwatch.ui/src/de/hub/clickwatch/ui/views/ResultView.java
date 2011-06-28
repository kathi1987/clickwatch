package de.hub.clickwatch.ui.views;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.provider.ClickWatchReflectiveItemProviderAdapterFactory;

public class ResultView extends ViewPart {
	
	private static final String processingInstruction = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	
	private Action save = null;
	private StackLayout layout = null;
	private TreeViewer treeViewer = null;
	private TextViewer textViewer = null;
	private ComposedAdapterFactory adapterFactory;
	
	private String input = null;
	
	@Inject
	private XmlModelRepository xmlModelRepository; 
	
	public void setInput(Object input) {
		Preconditions.checkArgument(input != null && input instanceof String);
		String evalResult = (String)input;
		this.input = evalResult;
		EObject result = null;
		try {
			boolean xml = true;
			try {
				ByteArrayInputStream bais = new ByteArrayInputStream(evalResult.getBytes());
				DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(bais);
			} catch (Exception e) {
				xml = false;
			}
			if (xml) {
				result = xmlModelRepository.deserializeXml(evalResult);
			}
		} catch (Throwable e) {
			// we will display the text result instead.
		}
		
		// show result
		if (result == null && evalResult == null) {
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Exception", "Exception: result xml is null");
			this.input = null;
			this.treeViewer.setInput(null);
			this.textViewer.setInput(null);
			return; 
		} else {
			if (result == null) {
				if (evalResult.startsWith(processingInstruction) || evalResult.startsWith(processingInstruction.replace("\"", "'"))) {
					evalResult = evalResult.substring(processingInstruction.length());
				}
				this.input = evalResult;
				textViewer.setInput(new Document(evalResult));
				layout.topControl = textViewer.getControl();
				textViewer.getControl().getParent().layout();
			} else {
				treeViewer.setInput(result);
				layout.topControl = treeViewer.getControl();
				treeViewer.getControl().getParent().layout();
			}							

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
			String content = this.input;
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
