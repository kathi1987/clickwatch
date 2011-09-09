/**
 * 
 */
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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
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
		Composite comp = SWTFactory.createComposite(parent, parent.getFont(),
				1, 1, GridData.FILL_BOTH);
		((GridLayout) comp.getLayout()).verticalSpacing = 0;
		createDatabaseFileGroup(comp);
		createVerticalSpacer(comp, 1);
		createRecordIDGroup(comp);

		setControl(comp);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	/**
	 * creates the visual components for the database file group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	protected void createDatabaseFileGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent, "Database file", 2, 1,
				GridData.FILL_HORIZONTAL);
		databaseFile = SWTFactory.createSingleText(group, 1);
		databaseFile.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});
		ControlAccessibleListener.addListener(databaseFile, group.getText());
		Button selectButton = createPushButton(group,
				LauncherMessages.AbstractJavaMainTab_1, null);
		selectButton.addSelectionListener(new SelectionAdapter() {
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
									"cwdatabase"))
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
					setDatabaseFile(uriString);
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			}
		});
	}

	/**
	 * creates the visual components for the record id group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	protected void createRecordIDGroup(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Record ID", 1, 1,
				GridData.FILL_HORIZONTAL);
		recordID = SWTFactory.createSingleText(group, 1);
		recordID.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});
		ControlAccessibleListener.addListener(recordID, group.getText());
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

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return JavaDebugImages.get(JavaDebugImages.IMG_VIEW_ARGUMENTS_TAB);
	}

}
