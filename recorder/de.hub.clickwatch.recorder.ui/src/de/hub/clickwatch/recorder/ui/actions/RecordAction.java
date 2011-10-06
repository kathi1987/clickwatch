package de.hub.clickwatch.recorder.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.text.NumberFormat;
import java.text.ParseException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.hub.clickwatch.recorder.INetworkRecorderStatusListener;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;

public class RecordAction extends AbstractRecordAction {
		
	public class InputDialog extends Dialog {
		
		private Text durationText = null;
		private long value;
		private final long defaultValue;
		
		public InputDialog(Shell parent, long pDefaultValue) {
			super(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
			this.defaultValue = pDefaultValue;		
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

		private void createContents(final Shell shell) {
			shell.setLayout(new GridLayout(2, true));

			Label label = new Label(shell, SWT.NONE);
			label.setText("Duration");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			
			durationText = new Text(shell, SWT.None);
			durationText.setText(NumberFormat.getIntegerInstance().format(defaultValue));
			
			// Create the OK button and add a handler
			// so that pressing it will set input
			// to the entered value
			Button ok = new Button(shell, SWT.PUSH);
			ok.setText("Record");
			data = new GridData(GridData.FILL_HORIZONTAL);
			ok.setLayoutData(data);
			ok.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					boolean exception = false;
					try {
						value = NumberFormat.getIntegerInstance().parse(durationText.getText()).longValue();
					} catch (ParseException e) {
						exception = true;
					}
					if (exception) {
						MessageDialog.openError(shell, "Invalid duration", "The entered duration is not valid");
						value = -1;
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
					value = -1;
					shell.close();
				}
			});

			// Set the OK button as the default, so
			// user can type input and press Enter
			// to dismiss
			shell.setDefaultButton(ok);
		}

		public long getValue() {
			return value;
		}
	}	
	
	@Override
	public void run(IAction action) {
		final NetworkRecorder networkRecorder = createInjector().getInstance(NetworkRecorder.class);
		
		final Record record = selectedObjects.get(0);
		InputDialog dialog = new InputDialog(shell, record.getDuration());
		dialog.open();
		final long duration = dialog.getValue();
		if (duration < 0) {
			return;
		}
		
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(shell);
		try {
			progressMonitorDialog.run(false, false, new IRunnableWithProgress() {		
				@Override
				public void run(final IProgressMonitor monitor) throws InvocationTargetException,
						InterruptedException {
					int tasks = (int)duration / 1000;
					monitor.beginTask("initialize recording", tasks + 3);
					monitor.worked(1);
					networkRecorder.addStatusListener(new INetworkRecorderStatusListener() {
						@Override
						public void report(String message) {
							monitor.setTaskName(message);
							monitor.worked(1);
						}						
					});
					networkRecorder.record(record, duration);
					monitor.done();
				}
			});
		} catch (Exception e) {
			MessageDialog.openError(shell, "Exception", "Exception during recording: " + e.getMessage());
		} 
	}
}
