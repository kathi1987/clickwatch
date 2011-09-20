package de.hub.clickwatch.transformationLauncher.tabs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
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
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
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
	public static final String ATTR_HANDLER_BEHAVIOUR = "attr_handler_behaviour";
	public static final String ATTR_DATABASE_TYPE = "attr_database_type";
	public static final String ATTR_RECORD_URI = "attr_record_uri";
	public static final String ATTR_HANDLER_PER_RECORD = "attr_handler_per_record";

	private Text transformationFile;
	private Text handlerPerRecord;
	private Text recordURI;

	private Combo valueType;
	private Combo debugLevel;
	private Combo handlerBehaviour;
	private Combo databaseType;

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
		createHandlerBehaviourGroup(comp);
		createVerticalSpacer(comp, 1);
		createValueTypeGroup(comp);
		createVerticalSpacer(comp, 1);
		createDebugLevelGroup(comp);
		createVerticalSpacer(comp, 1);
		createDatabaseTypeGroup(comp);
		createVerticalSpacer(comp, 1);
		createHandlerPerRecordGroup(comp);
		createVerticalSpacer(comp, 1);
		createRecordURIGroup(comp);

		setControl(comp);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	/**
	 * creates the visual components for the handler per record group
	 * 
	 * @param parent
	 *            the component within this group should be created
	 */
	private void createHandlerPerRecordGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent, "Handler per record", 1,
				1, GridData.FILL_HORIZONTAL);
		handlerPerRecord = SWTFactory.createSingleText(group, 1);
		handlerPerRecord.addVerifyListener(new VerifyListener() {

			@Override
			public void verifyText(VerifyEvent e) {
				switch (e.keyCode) {
				case SWT.BS: // Backspace
				case SWT.DEL: // Delete
				case SWT.HOME: // Home
				case SWT.END: // End
				case SWT.ARROW_LEFT: // Left arrow
				case SWT.ARROW_RIGHT: // Right arrow
					return;
				}

				// only numbers are allowed
				try {
					Integer.parseInt(e.text);
				} catch (NumberFormatException nfe) {
					e.doit = false;
				}
			}
		});

		handlerPerRecord.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});
	}

	/**
	 * creates the visual components for the record uri group
	 * 
	 * @param parent
	 *            the component within this group should be created
	 */
	private void createRecordURIGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent, "Record URI", 2, 1,
				GridData.FILL_HORIZONTAL);
		recordURI = SWTFactory.createSingleText(group, 1);
		recordURI.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});

		ControlAccessibleListener.addListener(recordURI, group.getText());
		Button selectTransfButton = createPushButton(group,
				LauncherMessages.AbstractJavaMainTab_1, null);
		selectTransfButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				IFile file = null;
				List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
				filters.add(new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement,
							Object element) {
						// show projects, folders and ClickWatch-model files
						if (element instanceof Project
								|| element instanceof Folder)
							return true;

						if ((element instanceof File))
							if (((File) element).getFileExtension().equals(
									"clickwatchmodel"))
								return true;
						return false;
					}
				});

				IFile[] files = WorkspaceResourceDialog.openFileSelection(
						shell, null, null, false, null, filters);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					String uriString = URI.createPlatformResourceURI(
							file.getFullPath().toString(), true).toString();
					setRecordURI(uriString);
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			}
		});
	}

	/**
	 * creates the visual components for the transformation file group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	private void createTransformationFileGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent, "Transformation File", 2,
				1, GridData.FILL_HORIZONTAL);
		transformationFile = SWTFactory.createSingleText(group, 1);
		transformationFile.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});

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
	 *            the component within this group should be created
	 */
	private void createValueTypeGroup(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Value Type", 2, 1,
				GridData.FILL_HORIZONTAL);
		valueType = SWTFactory.createCombo(group, SWT.FILL, 5, 5, new String[] {
				"SPECIFIC", "STRING", "XML" });
		valueType.select(0);
		valueType.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * creates the visual components for the debug level group
	 * 
	 * @param parent
	 *            the component within this group should be created
	 */
	private void createDebugLevelGroup(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Debug Level", 2, 1,
				GridData.FILL_HORIZONTAL);
		debugLevel = SWTFactory.createCombo(group, SWT.FILL, 5, 5,
				new String[] { "Error", "Warning", "Info", "Debug" });
		debugLevel.select(2);
		debugLevel.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * creates the visual components for the handler behaviour group
	 * 
	 * @param parent
	 *            the component within this group should be created
	 */
	private void createHandlerBehaviourGroup(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Handler Behaviour", 1, 1,
				GridData.FILL_HORIZONTAL);
		handlerBehaviour = SWTFactory.createCombo(group, SWT.FILL, 5, 5,
				new String[] { "DEFAULT", "COMPOUND", "COMPOUND_RECORDING",
						"COMPOUND_RECORDING_DIFFERENCES" });
		handlerBehaviour.select(0);
		handlerBehaviour.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * creates the visual components for the database type group
	 * 
	 * @param parent
	 *            the component within this group should be created
	 */
	private void createDatabaseTypeGroup(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Database Type", 1, 1,
				GridData.FILL_HORIZONTAL);
		databaseType = SWTFactory.createCombo(group, SWT.FILL, 5, 5,
				new String[] { "HBASE", "DUMMY", "EMF", "LOGFILE" });
		databaseType.select(0);
		databaseType.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	/**
	 * sets the string parameter for the transformation file
	 * 
	 * @param uriString
	 */
	private void setTransfFile(String uriString) {
		transformationFile.setText(uriString);
	}

	/**
	 * sets the string parameter for the record uri
	 * 
	 * @param uriString
	 */
	private void setRecordURI(String uriString) {
		recordURI.setText(uriString);
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
		configuration.setAttribute(MainParametersTab.ATTR_TRANSFORMATION_FILE,
				"");

		configuration.setAttribute(MainParametersTab.ATTR_DEBUG_LEVEL,
				"Warning");

		configuration.setAttribute(MainParametersTab.ATTR_VALUE_TYPE, "STRING");

		configuration.setAttribute(MainParametersTab.ATTR_HANDLER_BEHAVIOUR,
				"DEFAULT");

		configuration.setAttribute(MainParametersTab.ATTR_DATABASE_TYPE,
				"HBASE");

		configuration.setAttribute(MainParametersTab.ATTR_HANDLER_PER_RECORD,
				"2000");

		configuration.setAttribute(MainParametersTab.ATTR_RECORD_URI, "");
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
			// record uri
			recordURI.setText(configuration.getAttribute(
					MainParametersTab.ATTR_RECORD_URI, ""));

			// transformation file
			transformationFile.setText(configuration.getAttribute(
					MainParametersTab.ATTR_TRANSFORMATION_FILE, ""));

			// handler per record
			handlerPerRecord.setText(configuration.getAttribute(
					MainParametersTab.ATTR_HANDLER_PER_RECORD, ""));

			// value type
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

			// debug level
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

			// handler behaviour
			i = 0;
			String handlerBehaviourConfigValue = configuration.getAttribute(
					MainParametersTab.ATTR_HANDLER_BEHAVIOUR, "");

			for (String item : this.handlerBehaviour.getItems()) {
				if (item.equals(handlerBehaviourConfigValue)) {
					handlerBehaviour.select(i);
					break;
				}
				i++;
			}

			// database type
			i = 0;
			String databaseTypeConfigValue = configuration.getAttribute(
					MainParametersTab.ATTR_DATABASE_TYPE, "");

			for (String item : this.databaseType.getItems()) {
				if (item.equals(databaseTypeConfigValue)) {
					databaseType.select(i);
					break;
				}
				i++;
			}

		} catch (CoreException e) {
			valueType.select(0);
			handlerBehaviour.select(0);
			debugLevel.select(1);
			databaseType.select(0);
			handlerPerRecord.setText("2000");
		}

	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);

		// if (transformationFile.getText().equals(""))
		// setErrorMessage("No transformation file given");

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

		configuration.setAttribute(MainParametersTab.ATTR_HANDLER_BEHAVIOUR,
				handlerBehaviour.getItem(handlerBehaviour.getSelectionIndex()));

		configuration.setAttribute(MainParametersTab.ATTR_DATABASE_TYPE,
				databaseType.getItem(databaseType.getSelectionIndex()));

		configuration.setAttribute(MainParametersTab.ATTR_HANDLER_PER_RECORD,
				handlerPerRecord.getText());

		configuration.setAttribute(MainParametersTab.ATTR_RECORD_URI,
				recordURI.getText());
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
