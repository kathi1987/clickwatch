package de.hub.clickwatch.analysis.ui.wizards;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class WizardNewClickWatchProjectCreationPage extends WizardNewProjectCreationPage {
	protected Text clickWatchModelField;
	protected Text clickWatchDataBaseField;
	private final IStructuredSelection selection;
	
	/**
	 * Constructs a new WizardNewXtextProjectCreationPage.
	 * 
	 * @param pageName
	 *            the name of the page
	 * 
	 * @param selection
	 *            The current selection. If the current selection includes workingsets the workingsets field is
	 *            initialized with the selection.
	 */
	public WizardNewClickWatchProjectCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		this.selection = selection;
		setTitle("New Analysis project");
		setDescription("Creates a skeleton project with all you need to work with ClickWatch.");
	}
	
	protected String getDefaultProjectName() {
		return "de.hub.clickwatch.example";
	}

	@Override
	public void createControl(Composite parent) {
		final String projectsuffix = findNextValidProjectSuffix("", getDefaultProjectName()); //$NON-NLS-1$ //$NON-NLS-2$
		// We need to set the initial project name before calling super.createControl()
		// This calls the validate page and since our controls are not yet created we need to check for
		// that case for avoiding an NPE
		setInitialProjectName("" + projectsuffix); //$NON-NLS-1$
		super.createControl(parent);
		createLanguageSelectionGroup((Composite) getControl());
		createWorkingSetGroup((Composite) getControl(), selection, getWorkingSetIdents());
		setDefaults(projectsuffix);
		Dialog.applyDialogFont(getControl());
	}

	protected String[] getWorkingSetIdents() {
		return new String[] { 
				"org.eclipse.jdt.ui.JavaWorkingSetPage", //$NON-NLS-1$
				"org.eclipse.pde.ui.pluginWorkingSet", //$NON-NLS-1$
				"org.eclipse.ui.resourceWorkingSetPage" //$NON-NLS-1$
		};
	}

	protected void setDefaults(String projectSuffix) {
		setClickWatchModelFieldDefaults();
		setClickWatchDataBaseFieldDefaults();
		validatePage();
	}

	protected void setClickWatchModelFieldDefaults() {
		clickWatchModelField.setText("ExampleModel.clickwatchmodel");
	}
	
	protected void setClickWatchDataBaseFieldDefaults() {
		clickWatchDataBaseField.setText("ExampleDataBase.cwdatabase");
	}

	protected int indexOfDefault(List<String> contributions) {
		int indexOf = contributions.indexOf(getDefaultConfigName());
		return indexOf != -1 ? indexOf : 0;
	}

	protected String getDefaultConfigName() {
		return "Standard";
	}
	
	/**
	 * Find the next available (default) DSL name
	 */
	protected String findNextValidProjectSuffix(final String prefix, final String name) {
		String candidate = name;
		int suffix = 1;
		while (ResourcesPlugin.getWorkspace().getRoot().getProject((prefix + "." + candidate).toLowerCase()).exists()) { //$NON-NLS-1$
			candidate = name + suffix;
			suffix++;
		}
		return candidate;
	}

	@Override
	protected boolean validatePage() {
		if (!super.validatePage())
			return false;
		
		if (clickWatchModelField == null) {
			setErrorMessage("You must select a .clickwatchmodel file.");
			return false;
		}
		if (clickWatchModelField.getText().length() == 0) {
			setErrorMessage("You must select a .clickwatchmodel file.");
			return false;
		}
		if (!clickWatchModelField.getText().endsWith(".clickwatchmodel")) {
			setErrorMessage("You must select a .clickwatchmodel file.");
			return false;
		}
		
		if (clickWatchDataBaseField == null) {
			setErrorMessage("You must select a .cwdatabase file.");
			return false;
		}
		if (clickWatchDataBaseField.getText().length() == 0) {
			setErrorMessage("You must select a .cwdatabase file.");
			return false;
		}
		if (!clickWatchDataBaseField.getText().endsWith(".cwdatabase")) {
			setErrorMessage("You must select a .cwdatabase file.");
			return false;
		}

		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	protected void createLanguageSelectionGroup(Composite parent) {
		Group clickWatchModelGroup = new Group(parent, SWT.NONE);
		clickWatchModelGroup.setFont(parent.getFont());
		clickWatchModelGroup.setText("ClickWatch files");
		clickWatchModelGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		clickWatchModelGroup.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(clickWatchModelGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(3, false));

		
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		Label lable = new Label(composite, SWT.NONE);
		lable.setText("Network model:");
		
		clickWatchModelField = new Text(composite, SWT.BORDER);
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		clickWatchModelField.setLayoutData(data);
		clickWatchModelField.setFont(parent.getFont());

		clickWatchModelField.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event event) {
				setPageComplete(validatePage());
			}
		});
		
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		createClickWatchModelBrowseButton(composite);

		
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		lable = new Label(composite, SWT.NONE);
		lable.setText("Data base:");	
		
		clickWatchDataBaseField = new Text(composite, SWT.BORDER);
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		clickWatchDataBaseField.setLayoutData(data);
		clickWatchDataBaseField.setFont(parent.getFont());

		clickWatchDataBaseField.addListener(SWT.Modify, new Listener() {
			public void handleEvent(Event event) {
				setPageComplete(validatePage());
			}
		});
		
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		createClickWatchModelBrowseButton(composite);
	}

	protected void createClickWatchModelBrowseButton(Composite composite) {
		Button browseButton = new Button(composite, SWT.NONE);
		browseButton.setText("Browse ...");
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				IFile file = null;
				IFile[] files = WorkspaceResourceDialog.openFileSelection(
						getShell(), null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					setClickWatchModelFieldDefaults();
				}
			}
		});   
	}
	
	protected void createClickWatchDataBaseBrowseButton(Composite composite) {
		Button browseButton = new Button(composite, SWT.NONE);
		browseButton.setText("Browse ...");
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				IFile file = null;
				IFile[] files = WorkspaceResourceDialog.openFileSelection(
						getShell(), null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					setClickWatchDataBaseFieldDefaults();
				}
			}
		});   
	}

	public URI getClickWatchModel() {
		return URI.createPlatformResourceURI(getProjectName() + "/resources/" + clickWatchModelField.getText(), true);
	}
	
	public URI getClickWatchDataBase() {
		return URI.createPlatformResourceURI(getProjectName() + "/resources/" + clickWatchDataBaseField.getText(), true);
	}
}