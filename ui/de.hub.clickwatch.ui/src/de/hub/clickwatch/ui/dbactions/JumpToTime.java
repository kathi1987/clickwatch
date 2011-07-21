package de.hub.clickwatch.ui.dbactions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.cwdatabase.DataBaseUtil;
import de.hub.clickwatch.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.cwdatabase.presentation.CWDataBaseEditor;
import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.provider.TimeStampLabelProvider;
import de.hub.clickwatch.ui.connection.MergingNodeAdapterMergeConfiguration;
import de.hub.clickwatch.ui.modelactions.AbstractAction;

public class JumpToTime extends AbstractAction<ExperimentDescr> {
	
	@Inject private DataBaseUtil dataBaseUtil;
	@Inject private Merger merger;
	
	public class InputDialog extends Dialog {
		
		private long selection = -1;
		private Scale scale = null;
		private Text text = null;
		private final long from, to;
		
		public InputDialog(Shell parent, long from, long to) {
			super(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
			this.from = from;
			this.to = to;						
		}

		public void open() {
			// Create the dialog window
			Shell shell = new Shell(getParent(), getStyle());
			shell.setText(getText());
			createContents(shell);
			shell.pack();
			shell.open();
			
	        // Move the dialog to the center of the top level shell.
	        Rectangle shellBounds = shell.getBounds();
	        Point dialogSize = shell.getSize();

	        shell.setLocation(
	          shellBounds.x + (shellBounds.width - dialogSize.x) / 2,
	          shellBounds.y + (shellBounds.height - dialogSize.y) / 2);
			
			Display display = getParent().getDisplay();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}

		/**
		 * Creates the dialog's contents
		 */
		private void createContents(final Shell shell) {
			shell.setLayout(new GridLayout(2, true));

			Label label = new Label(shell, SWT.NONE);
			label.setText("TODO");
			GridData data = new GridData();
			data.horizontalSpan = 2;
			label.setLayoutData(data);
			
			// scale
			scale = new Scale(shell, SWT.HORIZONTAL);
			scale.setMaximum(100);
			scale.setMaximum(0);
			data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			scale.setLayoutData(data);
			scale.addSelectionListener(new SelectionListener() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					text.setText("" + ((((to-from)*scale.getSelection())/100) + from));
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			// input box
			text = new Text(shell, SWT.BORDER);
		
			text.setText(""+from);
			data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			text.setLayoutData(data);

			// Create the OK button and add a handler
			// so that pressing it will set input
			// to the entered value
			Button ok = new Button(shell, SWT.PUSH);
			ok.setText("Exec");
			data = new GridData(GridData.FILL_HORIZONTAL);
			ok.setLayoutData(data);
			ok.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					boolean exception = false;
					try {
						selection = new Long(text.getText());
					} catch (NumberFormatException e) {
						exception = true;
					}
					if (exception) {
						MessageDialog.openError(shell, "Invalid time", "The entered time is not valid");
						selection = -1;
					} else {				
						shell.close();
					}
				}
			});

			// Create the cancel button and add a handler
			// so that pressing it will set input to null
			Button cancel = new Button(shell, SWT.PUSH);
			cancel.setText("Cancel");
			data = new GridData(GridData.FILL_HORIZONTAL);
			cancel.setLayoutData(data);
			cancel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					shell.close();
				}
			});

			// Set the OK button as the default, so
			// user can type input and press Enter
			// to dismiss
			shell.setDefaultButton(ok);
		}

		public long getSelection() {
			return selection;
		}
	}	
	
	@Override
	public void run(IAction action) {
		final ExperimentDescr experimimentDescr = selectedObjects.get(0);
		
		InputDialog dialog = new InputDialog(shell, experimimentDescr.getStart(), experimimentDescr.getEnd());
		dialog.open();
		final long time = dialog.getSelection();
		if (time < 0) {
			return;
		}
		
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(shell);
		try {
			progressMonitorDialog.run(false, false, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) {
					Network networkTimeCopy = experimimentDescr.getNetworkTimeCopy();
					if (networkTimeCopy == null) {
						networkTimeCopy = EcoreUtil.copy(experimimentDescr.getNetwork());
						experimimentDescr.setNetworkTimeCopy(networkTimeCopy);
					}
					
					networkTimeCopy.setName("NTC at " + new TimeStampLabelProvider().getText(time));
					
					monitor.beginTask("resetting nodes to new time", networkTimeCopy.getNodes().size());
					for (Node currentNode: networkTimeCopy.getNodes()) {
						Node nodeTimeCopy = dataBaseUtil.getNode(experimimentDescr, currentNode.getINetAddress(), time);
						// merge
						getMergeConfiguration().getChanges().clear();
						
						merger.merge(currentNode, nodeTimeCopy);
						EcoreUtil.delete(nodeTimeCopy);
			
						if (editor != null) {
							((CWDataBaseEditor)editor).markChanges(currentNode, getMergeConfiguration().getChanges());
						}
						monitor.worked(1);
					}
					monitor.done();
				}
			});
		} catch (Exception e) {
			MessageDialog.openError(shell, "Exception", e.getLocalizedMessage());
		} 
	}
	
	private MergingNodeAdapterMergeConfiguration getMergeConfiguration() {
		return (MergingNodeAdapterMergeConfiguration)merger.getConfiguration();
	}
}
