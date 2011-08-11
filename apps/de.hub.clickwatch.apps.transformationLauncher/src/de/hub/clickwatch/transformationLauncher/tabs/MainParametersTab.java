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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * 
 * @author Lars George
 * 
 */
public class MainParametersTab extends AbstractLaunchConfigurationTab {

	private final String TAB_NAME = "Main";

	/**
	 * The attribute constant to get the transformation file value of a
	 * ILaunchConfigurationWorkingCopy
	 */
	public static final String ATTR_TRANSFORMATION_FILE = "attr_transformation_file";
	public static final String ATTR_VALUE_TYPE = "attr_value_type";
	public static final String ATTR_DEBUG_LEVEL = "attr_debug_level";

	private Text transformationFile;
	private Combo valueType;
	private Combo debugLevel;

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

		Group mainGroup = new Group(parent, SWT.NONE);
		mainGroup.setFont(parent.getFont());
		mainGroup.setText("Main configurations");
		mainGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		mainGroup.setLayout(new GridLayout(1, false));

		// transformation file chooser
		Composite composite = new Composite(mainGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(3, false));

		Label transfLabel = new Label(composite, SWT.FILL);
		transfLabel.setText("File: ");

		transformationFile = new Text(composite, SWT.FILL);
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

		// value type chooser
		composite = new Composite(mainGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(2, false));

		transfLabel = new Label(composite, SWT.FILL);
		transfLabel.setText("Value Type: ");

		valueType = new Combo(composite, SWT.FILL);
		valueType.setItems(new String[] { "SPECIFIC", "STRING", "XML" });
		layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		valueType.select(0);
		valueType.setLayoutData(layoutData);

		// debug level
		composite = new Composite(mainGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(3, false));

		transfLabel = new Label(composite, SWT.FILL);
		transfLabel.setText("Debug level: ");

		debugLevel = new Combo(composite, SWT.FILL);
		debugLevel
				.setItems(new String[] { "Error", "Warning", "Info", "Debug" });
		debugLevel.select(1);
		layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		debugLevel.setLayoutData(layoutData);

		setControl(mainGroup);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();

	}

	/**
	 * sets the string parameter for the transformation file
	 * 
	 * @param uriString
	 */
	private void setTransfFile(String uriString) {
		transformationFile.setText(uriString);
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
			
			transformationFile.setText(configuration.getAttribute(
					MainParametersTab.ATTR_TRANSFORMATION_FILE, ""));
			
			int i = 0;
			String valueTypeConfigValue = configuration.getAttribute(
					MainParametersTab.ATTR_VALUE_TYPE, "");

			for (String item : this.valueType.getItems()) {
				if (item.equals(valueTypeConfigValue)) {
					valueType.select(i);
					break;
				}
				i++;
			}

			i = 0;
			String debugLevelConfigValue = configuration.getAttribute(
					MainParametersTab.ATTR_DEBUG_LEVEL, "");

			for (String item : this.debugLevel.getItems()) {
				if (item.equals(debugLevelConfigValue)) {
					debugLevel.select(i);
					break;
				}
				i++;
			}
		} catch (CoreException e) {
			valueType.select(0);
			debugLevel.select(1);
		}

	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);

		if (transformationFile.getText().equals(""))
			setErrorMessage("No transformation file given");

		return true;
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
		configuration.setAttribute(MainParametersTab.ATTR_TRANSFORMATION_FILE,
				transformationFile.getText());

		configuration.setAttribute(MainParametersTab.ATTR_DEBUG_LEVEL,
				debugLevel.getItem(debugLevel.getSelectionIndex()));

		configuration.setAttribute(MainParametersTab.ATTR_VALUE_TYPE,
				valueType.getItem(valueType.getSelectionIndex()));

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
