package de.hub.clickwatch.ui.modelactions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.model.SpecificMetaModelGenerator;
import de.hub.clickwatch.model.SpecificModelGenerator;


public class ShowXml implements IObjectActionDelegate {

	private Shell shell;
	private Resource resource;
	private String xml;

	@Inject
	XmlModelRepository xmlModelRepository;

	public ShowXml() {
		super();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	private class ShowXmlDialog extends TitleAreaDialog {

		private Text xmlText;
		private final String xml;

		public ShowXmlDialog(Shell parentShell, String xml) {
			super(parentShell);
			this.xml = xml;
		}

		@Override
		public void create() {
			super.create();
			setTitle("XML");
			setMessage("This XML represents your current ClickWatch model. This XML would be the input for your XSLT-transformations.",
					IMessageProvider.INFORMATION);

		}

		@Override
		protected Control createDialogArea(Composite parent) {
			GridLayout layout = new GridLayout();
			parent.setLayout(layout);

			GridData gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.verticalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.grabExcessVerticalSpace = true;
			gridData.widthHint = 500;
			gridData.heightHint = 500;

			xmlText = new Text(parent, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
			xmlText.setText(xml);
			xmlText.setEditable(false);
			xmlText.setLayoutData(gridData);			
			return parent;
		}

		@Override
		protected boolean isResizable() {
			return true;
		}
	}

	@Override
	public void run(IAction action) {
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
		try {
			dialog.run(true, false, new IRunnableWithProgress(){ 
			    public void run(IProgressMonitor monitor) { 
			        monitor.beginTask("Creating specific model and serializing it into XML ...", 100); 
			        EObject input = resource.getContents().get(0);
			        monitor.worked(20);

					SpecificMetaModelGenerator smmg = new SpecificMetaModelGenerator();
					EPackage smm = smmg.generateMetaModel(input);
					SpecificModelGenerator smg = new SpecificModelGenerator(false);
					EObject smInput = smg.generateModel(smm, input);
					monitor.worked(40);

					xml = xmlModelRepository.serializeXml(smInput);
					monitor.worked(40);
			        monitor.done(); 
			    } 
			});
		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(shell, "Clickwatch Error",
					"Unexpected exception, could not create xml");
			return;
		} 

		ShowXmlDialog xmlDialog = new ShowXmlDialog(shell, xml);
		xmlDialog.create();
		xmlDialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			resource = (Resource) ((IStructuredSelection) selection)
					.getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"You can only call this action on a Resource");
		}
	}

}
