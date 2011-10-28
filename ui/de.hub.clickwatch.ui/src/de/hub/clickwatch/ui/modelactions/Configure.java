package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.model.Node;


/**
 * Configures a node: setting WiFi driver specific stuff like channel and
 * txpower
 * 
 * @author zubow
 */
public class Configure extends AbstractNodeAction{

	/**
	 * Input dialog for setting-up wifi specific parameters 
	 */
	public class InputDialog extends Dialog {

		// mode
		public final static String MODE_MONITOR = "Monitor";
		public final static String MODE_MASTER = "Master";
		public final static String MODE_ADHOC = "Ad-Hoc";
		
		private String modeMessage;
		private String modeInput;
		
		// wifi type
		public final static String WIFI_TYPE_800 = "800";
		public final static String WIFI_TYPE_801 = "801";
		public final static String WIFI_TYPE_802 = "802";
		public final static String WIFI_TYPE_803 = "803";
		public final static String WIFI_TYPE_804 = "804";
		public final static String WIFI_TYPE_805 = "805";
		
		private String wifiTypeMessage;
		private String wifiTypeInput;

		// rf channel
		private String rfChanMessage;
		private String rfChanInput;
		// tx power
		private String txPowMessage;
		private String txPowInput;

		/**
		 * InputDialog constructor
		 * 
		 * @param parent
		 *            the parent
		 */
		public InputDialog(Shell parent) {
			// Pass the default styles here
			this(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		}

		/**
		 * InputDialog constructor
		 * 
		 * @param parent
		 *            the parent
		 * @param style
		 *            the style
		 */
		public InputDialog(Shell parent, int style) {
			// Let users override the default styles
			super(parent, style);
			setText("Node configuration");
			setModeMessage("802.11 mode");
			setModeInput(MODE_MONITOR);
			setWifiTypeMessage("WiFi header type:");
			setWifiTypeInput(WIFI_TYPE_805);
			setRfChanMessage("Rf channel:");
			setRfChanInput("1");
			setTxPowMessage("Tx power (dBm):");
			setTxPowInput("20");
		}

		public String getModeMessage() {
			return modeMessage;
		}

		public void setModeMessage(String modeMessage) {
			this.modeMessage = modeMessage;
		}

		public String getModeInput() {
			return modeInput;
		}

		public void setModeInput(String modeInput) {
			this.modeInput = modeInput;
		}

		public String getWifiTypeMessage() {
			return wifiTypeMessage;
		}

		public void setWifiTypeMessage(String wifiTypeMessage) {
			this.wifiTypeMessage = wifiTypeMessage;
		}

		public String getWifiTypeInput() {
			return wifiTypeInput;
		}

		public void setWifiTypeInput(String wifiTypeInput) {
			this.wifiTypeInput = wifiTypeInput;
		}

		public String getRfChanMessage() {
			return rfChanMessage;
		}

		public void setRfChanMessage(String rfChanMessage) {
			this.rfChanMessage = rfChanMessage;
		}

		public String getRfChanInput() {
			return rfChanInput;
		}

		public void setRfChanInput(String rfChanInput) {
			this.rfChanInput = rfChanInput;
		}
		
		public String getTxPowMessage() {
			return txPowMessage;
		}

		public void setTxPowMessage(String txPowMessage) {
			this.txPowMessage = txPowMessage;
		}

		public String getTxPowInput() {
			return txPowInput;
		}

		public void setTxPowInput(String txPowInput) {
			this.txPowInput = txPowInput;
		}

		/**
		 * Opens the dialog ...
		 */
		public void open() {
			// Create the dialog window
			Shell shell = new Shell(getParent(), getStyle());
			shell.setText(getText());
			createContents(shell);
			shell.pack();
			shell.open();
			Display display = getParent().getDisplay();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}

		/**
		 * Creates the dialog's contents
		 * 
		 * @param shell
		 *            the dialog window
		 */
		private void createContents(final Shell shell) {
			shell.setLayout(new GridLayout(2, true));

			//
			// WIFI
			//
			Label labelWifi = new Label(shell, SWT.NONE);
			labelWifi.setText("WiFi configuration");
			GridData data = new GridData();
			data.horizontalSpan = 2;
			labelWifi.setLayoutData(data);
			
			//
			// Mode
			Label label = new Label(shell, SWT.NONE);
			label.setText(modeMessage);
			data = new GridData();
			data.horizontalSpan = 2;
			label.setLayoutData(data);
			
			final Combo modeDropDown = new Combo(shell, SWT.DROP_DOWN | SWT.BORDER);
			modeDropDown.add(MODE_MONITOR);
			modeDropDown.add(MODE_MASTER);
			modeDropDown.add(MODE_ADHOC);
			modeDropDown.select(0);
			data = new GridData();
			data.horizontalSpan = 2;
			modeDropDown.setLayoutData(data);

			//
			// Wifi header type
			label = new Label(shell, SWT.NONE);
			label.setText(wifiTypeMessage);
			data = new GridData();
			data.horizontalSpan = 2;
			label.setLayoutData(data);
			
			final Combo wifiTypeDropDown = new Combo(shell, SWT.DROP_DOWN | SWT.BORDER);
			wifiTypeDropDown.add(WIFI_TYPE_800);
			wifiTypeDropDown.add(WIFI_TYPE_801);
			wifiTypeDropDown.add(WIFI_TYPE_802);
			wifiTypeDropDown.add(WIFI_TYPE_803);
			wifiTypeDropDown.add(WIFI_TYPE_804);
			wifiTypeDropDown.add(WIFI_TYPE_805);
			wifiTypeDropDown.select(5);
			data = new GridData();
			data.horizontalSpan = 2;
			wifiTypeDropDown.setLayoutData(data);
			
			//
			// Rf channel
			label = new Label(shell, SWT.NONE);
			label.setText(rfChanMessage);
			data = new GridData();
			data.horizontalSpan = 2;
			label.setLayoutData(data);

			// input box for rf channel
			final Text rfText = new Text(shell, SWT.BORDER);
			rfText.setText("1");
			data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			rfText.setLayoutData(data);

			//
			// Tx power
			label = new Label(shell, SWT.NONE);
			label.setText(txPowMessage);
			data = new GridData();
			data.horizontalSpan = 2;
			label.setLayoutData(data);

			// input box for rf channel
			final Text txPowText = new Text(shell, SWT.BORDER);
			txPowText.setText("20");
			data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			txPowText.setLayoutData(data);
			
			
			// Create the OK button and add a handler
			// so that pressing it will set input
			// to the entered value
			Button ok = new Button(shell, SWT.PUSH);
			ok.setText("OK");
			data = new GridData(GridData.FILL_HORIZONTAL);
			ok.setLayoutData(data);
			ok.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					rfChanInput = rfText.getText();
					txPowInput = txPowText.getText();
					modeInput = modeDropDown.getText();
					wifiTypeInput = wifiTypeDropDown.getText();
					shell.close();
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
					rfChanInput = null;
					txPowInput = null;
					modeInput = null;
					wifiTypeInput = null;
					shell.close();
				}
			});

			// Set the OK button as the default, so
			// user can type input and press Enter
			// to dismiss
			shell.setDefaultButton(ok);
		}
	}

	@Override
	public void run(IAction action) {
		if (selectedObjects == null || selectedObjects.isEmpty()) {
			return;
		}

		// present a blocking formular dialog
		InputDialog diag = new InputDialog(editor.getSite().getShell());
		diag.open();
		String mode = diag.getModeInput();
		String wifiType = diag.getWifiTypeInput();
		String rfChan = diag.getRfChanInput();
		String txPow = diag.getTxPowInput();

		String cmd = "./initdriver.sh " + mode + " " + wifiType + " " + rfChan + " " + txPow;
		
		//  create n parallel execution threads
		ExecWorkerThread[] workerThreads = new ExecWorkerThread[selectedObjects.size()];
		for (int idx=0; idx<selectedObjects.size(); idx++) {
			final Node node = selectedObjects.get(idx);

			// disconnect if connected
			if (node.getConnection() != null) {
				INodeConnection oldConnection = (INodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.close();
			}

			workerThreads[idx] = new ExecWorkerThread(node.getINetAddress(), cmd);
			workerThreads[idx].start();
		}
		
		// sync point: wait until all worker threads are finished
		for (int i=0; i<workerThreads.length; i++) {
			try {
				workerThreads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
