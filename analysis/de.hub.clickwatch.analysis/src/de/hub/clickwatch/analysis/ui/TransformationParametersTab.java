package de.hub.clickwatch.analysis.ui;

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
 * The tab for a transformation launch configuration
 * 
 * @author Lars George
 * 
 */
public class TransformationParametersTab extends AbstractLaunchConfigurationTab {

	/**
	 * The attribute constant to get the transformation file value of a
	 * ILaunchConfigurationWorkingCopy
	 */
	public static final String ATTR_TRANSFORMATION_FILE = "attr_transformation_file";

	private final String TAB_NAME = "Transformation";
	private Text transformationFile;

	@Override
	public void createControl(Composite parent) {		
		
		final Shell shell = parent.getShell();

		// transformation file chooser
		Group transformationFileGroup = new Group(parent, SWT.NONE);
		transformationFileGroup.setFont(parent.getFont());
		transformationFileGroup.setText("Transformation File");
		transformationFileGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP,
				true, false));
		transformationFileGroup.setLayout(new GridLayout(2, false));

		Composite composite = new Composite(transformationFileGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(3, false));

		Label transfLabel = new Label(composite, SWT.FILL);
		transfLabel.setText("File: ");

		transformationFile = new Text(composite, SWT.FILL);
		transformationFile.setText("Test");
		GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		transformationFile.setLayoutData(layoutData);

		Button selectTransfButton = new Button(composite, SWT.PUSH);
		selectTransfButton.setText("...");
		selectTransfButton.addSelectionListener(new SelectionAdapter() {
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
					setTransfFile(uriString);
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			}
		});

		setControl(transformationFileGroup);
		
		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		
		if(transformationFile.getText().equals(""))
			setErrorMessage("No transformation file given");
			
		return true;
	} 
	
	
	
	/**
	 * sets the string parameter for the transformation file
	 * 
	 * @param uriString
	 */
	private void setTransfFile(String uriString) {
		transformationFile.setText(uriString);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			transformationFile.setText(configuration.getAttribute(
					TransformationParametersTab.ATTR_TRANSFORMATION_FILE, ""));
		} catch (CoreException e) {
			transformationFile.setText("");
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// set the values of the tab components in the configuration object
		configuration.setAttribute(
				TransformationParametersTab.ATTR_TRANSFORMATION_FILE,
				transformationFile.getText());
	}

	@Override
	public String getName() {
		return TAB_NAME;
	}

}
