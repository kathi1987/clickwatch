package de.hub.clickwatch.transformationLauncher.tabs;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.internal.debug.ui.JavaDebugImages;
import org.eclipse.jdt.internal.debug.ui.actions.ControlAccessibleListener;
import org.eclipse.jdt.internal.debug.ui.launcher.LauncherMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
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
		Composite comp = SWTFactory.createComposite(parent, parent.getFont(),
				1, 1, GridData.FILL_BOTH);
		((GridLayout) comp.getLayout()).verticalSpacing = 0;
		createTransformationFileGroup(comp);
		createVerticalSpacer(comp, 1);
		createValueTypeGroup(comp);
		createVerticalSpacer(comp, 1);
		createDebugLevelGroup(comp);

		setControl(comp);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	/**
	 * creates the visual components for the transformation file group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	protected void createTransformationFileGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent, "Transformation File", 2,
				1, GridData.FILL_HORIZONTAL);
		transformationFile = SWTFactory.createSingleText(group, 1);
		// transformationFile.addModifyListener(fListener);
		ControlAccessibleListener.addListener(transformationFile,
				group.getText());
		Button selectTransfButton = createPushButton(group,
				LauncherMessages.AbstractJavaMainTab_1, null);
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
	}

	/**
	 * creates the visual components for the value type group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	private void createValueTypeGroup(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Value Type", 2, 1,
				GridData.FILL_HORIZONTAL);
		valueType = SWTFactory.createCombo(group, SWT.FILL, 5, 5, new String[] {
				"SPECIFIC", "STRING", "XML" });
		valueType.select(0);
	}

	/**
	 * creates the visual components for the debug level group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	private void createDebugLevelGroup(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Debug Level", 2, 1,
				GridData.FILL_HORIZONTAL);
		debugLevel = SWTFactory.createCombo(group, SWT.FILL, 5, 5,
				new String[] { "Error", "Warning", "Info", "Debug" });
		debugLevel.select(2);
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

		//if (transformationFile.getText().equals(""))
		//	setErrorMessage("No transformation file given");

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
	
	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return JavaDebugImages.get(JavaDebugImages.IMG_OBJS_MONITOR);
	}

}
