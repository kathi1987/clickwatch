package de.hub.clickwatch.ui.actions;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import com.google.inject.Inject;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.model.SpecificMetaModelGenerator;
import de.hub.clickwatch.model.SpecificModelGenerator;
import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.ui.views.ResultView;


public class PerformXslTransformation extends org.eclipse.core.commands.AbstractHandler {

	@Inject
	private XmlModelRepository xmlModelRepository;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final Shell shell = window.getShell();
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
		try {
			dialog.run(false, false, new IRunnableWithProgress(){ 
			    public void run(IProgressMonitor monitor) { 
			        monitor.beginTask("Creating specific model, serializing it into XML, and running your XSLT ...", 100); 
			        // acquire input as EOBject
			        EObject input = null;
			        IEditorReference[] editors = window.getActivePage().getEditorReferences();
			        IEditorPart clickWatchEditor = null;
			        for (IEditorReference editor: editors) {
			        	if (editor.getEditor(false) instanceof ClickWatchModelEditor) {
			        		clickWatchEditor = editor.getEditor(false);
			        	}
			        }
			        
			        IEditorPart activeEditor = window.getActivePage().getActiveEditor();
			        if (!(activeEditor instanceof TextEditor)) {
			        	MessageDialog.openError(shell, "Error", "You somehow executed 'perform XSL' outside an XSL editor.");
			        	monitor.done();
			        	return;
			        }
			        
					if (clickWatchEditor != null) {
						ClickWatchModelEditor modelEditor = (ClickWatchModelEditor)clickWatchEditor;
						Object editorInput = modelEditor.getViewer().getInput();
						if (editorInput instanceof EObject) {
							input = (EObject)editorInput;
						} else if (editorInput instanceof Resource) {
							Resource resource = (Resource)editorInput;
							if (!resource.getContents().isEmpty()) {
								input = resource.getContents().get(0);	
							}							
						} else if (editorInput instanceof ResourceSet) {
							ResourceSet rs = (ResourceSet)editorInput;
							if (!rs.getResources().isEmpty()) {
								Resource resource = rs.getResources().get(0);	
								if (!resource.getContents().isEmpty()) {
									input = resource.getContents().get(0);
								}								
							}								
						}
					} else {
						MessageDialog.openWarning(shell, "Warning", "No open ClickWatch editor could be found.");
						monitor.done();
						return;
					}
					
					
					if (input == null) {
						MessageDialog.openError(shell,
								"Error", "No valid input in active editor");
						monitor.done();
						return;
					}
					monitor.worked(5);
					
					// create a specific model for input
					SpecificMetaModelGenerator smmg = new SpecificMetaModelGenerator();
					EPackage smm = smmg.generateMetaModel(input);
					SpecificModelGenerator smg = new SpecificModelGenerator(false);
					EObject smInput = smg.generateModel(smm, input);
					monitor.worked(25);
					
					// serialize specific model
					String inputAsString = xmlModelRepository.serializeXml(smInput);
					monitor.worked(20);
					
					// run XSLT
					String evalResult = null;
					String xsl = null;
					ITextEditor xslEditor = (ITextEditor)activeEditor;
					IDocumentProvider provider = xslEditor.getDocumentProvider();
					IDocument document = provider.getDocument(xslEditor.getEditorInput());
					xsl = document.get();
					try {
						evalResult = performEvaluation(inputAsString, xsl);
					} catch (Throwable e) {
						MessageDialog.openError(shell,
								"Exception", "Exception " + e.getClass().getName()
										+ " occured: " + e.getMessage());
						monitor.done();
						return;
					}
					monitor.worked(40);
					
					// show result
					if (evalResult == null) {
						MessageDialog.openError(shell,
								"Exception", "Exception: result xml is null");
						monitor.done();
						return; 
							
					} else {
						for(IViewReference viewRef: window.getActivePage().getViewReferences()) {
							final IViewPart view = viewRef.getView(false);
							if (view instanceof ResultView) {		
								((ResultView)view).setInput(evalResult);							
							}
						}	
					}
					monitor.worked(10);
			        monitor.done(); 
			    } 
			});
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"Unexpected exception, could not perform transformation.");
		} 
		return null;
	}

	private static TransformerFactory transFact = TransformerFactory.newInstance();
	
	private String performEvaluation(String inputXml, String xsl) {
		//System.setProperty("javax.xml.transform.TransformerFactory", "net.sf.saxon.TransformerFactoryImpl");	
		
		Source xmlSource = new StreamSource(new StringReader(inputXml));
	    Source xsltSource = new StreamSource(new StringReader(xsl));
	    StringWriter resWriter = new StringWriter();
	    Result result = new StreamResult(resWriter);

	    Transformer trans;
	    errorText = new StringBuffer();
	    firtErrorLine = -1;
	    TransformationErrorListener errorListener = new TransformationErrorListener();
		try {
			transFact.setErrorListener(errorListener);
			trans = transFact.newTransformer(xsltSource);
		    trans.transform(xmlSource, result);		
		} catch (Exception e) {
			String errors = errorText.toString().trim();
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			MessageDialog.openError(shell, "Error", "Error during transformation: " + e.getMessage() + 
					", caused by: \n" + errors);
			return "errors";
		} finally {
			if (firtErrorLine != -1) {
				IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				if (editor instanceof TextEditor) {
					int offset = -1;
					try {
						offset = ((TextEditor)editor).getDocumentProvider().getDocument(editor.getEditorInput()).getLineOffset(
								firtErrorLine == 0 ? 0 : firtErrorLine - 1);
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
					if (offset != -1) {
						((TextEditor)editor).setHighlightRange(offset, 0, true);
					}
				}
			}
		}
		
		String errors = errorText.toString().trim();		
		if (!errors.equals("")) {	
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			MessageDialog.openInformation(shell, "Warnings or even Errors during during transformation", errors);
		}
		
		String resStr = resWriter.toString();
		return resStr;
	}
	
	StringBuffer errorText = null;
	int firtErrorLine = 0;
	
	private class TransformationErrorListener implements ErrorListener {

		private String getErrorMessage(TransformerException e) {
			if (e.getLocator() != null && firtErrorLine == -1) {
				firtErrorLine = e.getLocator().getLineNumber();
			}
			return e.getMessage() + ((e.getLocator() == null) ? "": "[" + e.getLocator().getLineNumber() + ":" + e.getLocator().getColumnNumber() +"]") + "\n";
		}

		@Override
		public void error(TransformerException exception)
				throws TransformerException {
			errorText.append("Error: " + getErrorMessage(exception));
		}

		@Override
		public void fatalError(TransformerException exception)
				throws TransformerException {
			errorText.append("FatalError: " + getErrorMessage(exception));
		}

		@Override
		public void warning(TransformerException exception)
				throws TransformerException {
			errorText.append("Warning: " + getErrorMessage(exception));
		}
		
	}

}
