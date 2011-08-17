/**
 * 
 */
package de.hub.clickwatch.transformationLauncher.tabs;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Lars George
 * 
 */
public class RecordParametersTab extends AbstractLaunchConfigurationTab {

	public static final String ATTR_RECORD_ID = "attr_record_id";
	public static final String ATTR_DATABASE_URI = "attr_database_uri";

	private final String TAB_NAME = "Records";

	private Text databaseFile = null;
	private Text recordID = null;

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		final Shell shell = parent.getShell();

		// transformation file chooser
		Group textGroup = new Group(parent, SWT.NONE);
		textGroup.setFont(parent.getFont());
		textGroup.setText("Record configurations");
		textGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		textGroup.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(textGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(3, false));

		Label label = new Label(composite, SWT.FILL);
		label.setText("Database File: ");

		databaseFile = new Text(composite, SWT.FILL);
		GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		databaseFile.setLayoutData(layoutData);

		Button selectButton = new Button(composite, SWT.PUSH);
		selectButton.setText("...");
		selectButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				IFile file = null;

				IFile[] files = WorkspaceResourceDialog.openFileSelection(
						shell, null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					String uriString = URI.createPlatformResourceURI(
							file.getFullPath().toString(), true).toString();
					setDatabaseFile(uriString);
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			}
		});

		// databse uri
		composite = new Composite(textGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(2, false));

		label = new Label(composite, SWT.FILL);
		label.setText("Record ID: ");

		recordID = new Text(composite, SWT.FILL);
		layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		recordID.setLayoutData(layoutData);

		setControl(textGroup);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	/**
	 * sets the text of the gui element
	 * 
	 * @param uriString
	 */
	private void setDatabaseFile(String uriString) {
		databaseFile.setText(uriString);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.
	 * debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse
	 * .debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			recordID.setText(configuration.getAttribute(
					RecordParametersTab.ATTR_RECORD_ID, ""));

			databaseFile.setText(configuration.getAttribute(
					RecordParametersTab.ATTR_DATABASE_URI, ""));
		} catch (CoreException e) {
			recordID.setText("");
			databaseFile.setText("");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse
	 * .debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// set the values of the tab components in the configuration object
		configuration.setAttribute(RecordParametersTab.ATTR_RECORD_ID,
				recordID.getText());

		configuration.setAttribute(RecordParametersTab.ATTR_DATABASE_URI,
				databaseFile.getText());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	@Override
	public String getName() {
		return TAB_NAME;
	}

}
