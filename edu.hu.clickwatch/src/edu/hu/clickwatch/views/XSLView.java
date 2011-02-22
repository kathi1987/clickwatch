package edu.hu.clickwatch.views;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IStructuredModel;
import org.eclipse.wst.sse.ui.internal.StructuredTextViewer;
import org.eclipse.wst.xml.core.internal.provisional.contenttype.ContentTypeIdForXML;
import org.eclipse.wst.xsl.ui.internal.StructuredTextViewerConfigurationXSL;

import com.google.common.base.Throwables;
import com.google.inject.Inject;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.presentation.ClickWatchModelEditor;

public class XSLView extends ViewPart {
	
	@Inject
	private XmlModelRepository xmlModelRepository;
	
	private ISourceViewer viewer = null;
	private Action evaluate = null;
	private Action validate = null;
	private Action load = null;
	private Action save = null;
	private EObject currentResult = null;
	
	// XSLT transformer
	private TransformerFactory transFact;

	public XSLView() {
		initXslProcessor();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		SourceViewerConfiguration sourceViewerConfiguration = new StructuredTextViewerConfigurationXSL();

		viewer = new StructuredTextViewer(parent, null, null, false, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		viewer.getTextWidget().setFont(JFaceResources.getFont("org.eclipse.wst.sse.ui.textfont")); //$NON-NLS-1$
		IStructuredModel scratchModel = StructuredModelManager.getModelManager().createUnManagedStructuredModelFor(
						ContentTypeIdForXML.ContentTypeID_XML);
		IDocument document = scratchModel.getStructuredDocument();
		document.set(createBlankSheet());
		viewer.configure(sourceViewerConfiguration);
		viewer.setDocument(document);
		
		makeActions();
		contributeToActionBars();		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	private String createBlankSheet() {
		StringBuffer result = new StringBuffer();
		result.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		result.append("<xsl:stylesheet version=\"1.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n");
		result.append("    <xsl:template match=\"/\">\n");
		result.append("        <xsl:copy-of select=\".\"/>\n");
		result.append("    </xsl:template>\n");
		result.append("</xsl:stylesheet>\n");
		return result.toString();
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(load);
		manager.add(save);
		manager.add(validate);
		manager.add(evaluate);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(load);
		manager.add(save);
		manager.add(validate);
		manager.add(evaluate);
	}
	
	private void makeActions() {
		load = new Action() {
			public void run() {
				load();
			}
		};
		load.setText("Load");
		load.setToolTipText("Load XSL stylesheet from file");

		save = new Action() {
			public void run() {
				save();
			}
		};
		save.setText("Save");
		save.setToolTipText("Save XSL stylesheet to file");

		validate = new Action() {
			public void run() {
				validate();
			}
		};
		validate.setText("Validate");
		validate.setToolTipText("Validate XSL stylesheet");
		evaluate = new Action() {
			public void run() {
				evaluate();
			}
		};
		evaluate.setText("Perform XSLT");
		evaluate.setToolTipText("Perform XSL transformation on current Network model");
	}

	private void save() {

        FileDialog fd = new FileDialog(viewer.getTextWidget().getShell(), SWT.SAVE);
        fd.setText("Save");
        fd.setFilterPath("D:/");
        String[] filterExt = { "*.xslt", "*.xsl", "*.*" };
        fd.setFilterExtensions(filterExt);
        String selFile = fd.open();
        System.out.println(selFile);
        
        try {
			PrintWriter out = new PrintWriter(new File(selFile));
	        String content = viewer.getDocument().get();
	        out.write(content);
	        out.close();
		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());
			MessageDialog.openError(viewer.getTextWidget().getShell(),
					"Exception", "Exception " + e.getClass().getName()
							+ " occured: " + e.getMessage());
			return;
		}
	}
	
	private void load() {

		// select resource for deployment
		FileDialog fd = new FileDialog(viewer.getTextWidget().getShell(), SWT.OPEN);
        fd.setText("Open");
        String[] filterExt = { "*.xslt", "*.xsl", "*.*" };
        fd.setFilterExtensions(filterExt);
        String lfile = fd.open();
        
        if (lfile == null) {
        	return;
        }

        try {
	        String fileContent = readFileAsString(lfile);
	        viewer.getDocument().set(fileContent);
        } catch (Exception e) {
			System.out.println("error: " + e.getMessage());
			MessageDialog.openError(viewer.getTextWidget().getShell(),
					"Exception", "Exception " + e.getClass().getName()
							+ " occured: " + e.getMessage());
			return;
        }
    }

	private void validate() {
		String xsl = viewer.getDocument().get();

		try {
			Source xsltSource = new StreamSource(new StringReader(xsl));
		    Transformer trans = transFact.newTransformer(xsltSource);
		} catch (Throwable e) {
			// TODO error
			System.out.println("error: " + e.getMessage());
			MessageDialog.openError(viewer.getTextWidget().getShell(),
					"Validation failed", "Exception " + e.getClass().getName()
							+ " occured: " + e.getMessage());
			return;
		}
	}


	private void evaluate() {
		IEditorPart activeEditor = getViewSite().getPage().getActiveEditor();
		if (!(activeEditor instanceof ClickWatchModelEditor)) {
			return;
		}
		
		ClickWatchModelEditor modelEditor = (ClickWatchModelEditor)activeEditor;
		Object editorInput = modelEditor.getViewer().getInput();
		EObject input = null;
		if (editorInput instanceof EObject) {
			input = (EObject)editorInput;
		} else if (editorInput instanceof Resource) {
			Resource resource = (Resource)editorInput;
			if (resource.getContents().isEmpty()) {
				return;
			}
			input = resource.getContents().get(0);
		} else if (editorInput instanceof ResourceSet) {
			ResourceSet rs = (ResourceSet)editorInput;
			if (rs.getResources().isEmpty()) {
				return;
			}
			Resource resource = rs.getResources().get(0);
			if (resource.getContents().isEmpty()) {
				return;
			}
			input = resource.getContents().get(0);
		}
		
		if (input == null) {
			return;
		}
		
		String inputAsString = xmlModelRepository.serializeXml(input);
		
		String evalResult = null;
		try {
			evalResult = performEvaluation(inputAsString, viewer.getDocument().get());
		} catch (Throwable e) {
			// TODO error
			System.out.println("error: " + e.getMessage());
			MessageDialog.openError(viewer.getTextWidget().getShell(),
					"Exception", "Exception " + e.getClass().getName()
							+ " occured: " + e.getMessage());
			return;
		}
		
		EObject result = null;
		
		try {
			result = xmlModelRepository.deserializeXml(evalResult);
		} catch (Throwable e) {
			System.out.println("error: " + e.getMessage());
			MessageDialog.openError(viewer.getTextWidget().getShell(),
					"Exception", "Exception " + e.getClass().getName()
							+ " occured: " + e.getMessage());
			return;
		}
		
		if (result == null) {
			System.out.println("error: result xml is null");
			MessageDialog.openError(viewer.getTextWidget().getShell(),
					"Exception", "Exception: result xml is null");
			return;
		} else {
			for(IViewReference viewRef: getViewSite().getPage().getViewReferences()) {
				IViewPart view = viewRef.getView(false);
				if (view instanceof ResultView) {
					((ResultView)view).setInput(result);
					if (currentResult != null) {
						EcoreUtil.delete(currentResult, true);			
					}
					currentResult = result;
				}
			}
		}
	}

	private void initXslProcessor() {
		
	    // create an instance of TransformerFactory
	    transFact = TransformerFactory.newInstance();
	}
	
	private String performEvaluation(String inputXml, String xsl) {

		System.out.println("#perfom eval for:\n");
		System.out.println(inputXml);
		System.out.println("\n#with sheet:\n");
		System.out.println(xsl);

		// hack
		inputXml = inputXml.replaceAll("\n", "");
		inputXml = inputXml.replaceAll("\t", "");
		xsl = xsl.replaceAll("\n", "");
		xsl = xsl.replaceAll("\t", "");
		
		Source xmlSource = new StreamSource(new StringReader(inputXml));
	    Source xsltSource = new StreamSource(new StringReader(xsl));
	    StringWriter resWriter = new StringWriter();
	    Result result = new StreamResult(resWriter);

	    Transformer trans;
		try {
			trans = transFact.newTransformer(xsltSource);
		    trans.transform(xmlSource, result);		
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		
		String resStr = resWriter.toString();
		// hack
		resStr = resStr.replaceAll("\n", "");
		resStr = resStr.replaceAll("\t", "");
		System.out.println("\n#result:\n");
		System.out.println(resStr);
		
		return resStr;
	}

    private static String readFileAsString(String filePath) throws java.io.IOException {
        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
        return fileData.toString();
    }
}
