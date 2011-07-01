package de.hub.clickwatch.analysis.ui;

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
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class WizardNewAnalysisCreationPage extends WizardNewProjectCreationPage {
	protected Text clickWatchModelField;
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
	public WizardNewAnalysisCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		this.selection = selection;
		setTitle("New Analysis project");
		setDescription("Creates a skeleton project with all you need to analyse a ClickWatch model.");
	}
	
	protected String getDefaultProjectName() {
		return "analysis";
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
		validatePage();
	}

	protected void setClickWatchModelFieldDefaults() {
		Object firstElement = selection.getFirstElement();
		if (firstElement != null && firstElement instanceof IFile) {
			IFile file = (IFile)firstElement;
			clickWatchModelField.setText(URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString());
		}
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

		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	protected void createLanguageSelectionGroup(Composite parent) {
		Group clickWatchModelGroup = new Group(parent, SWT.NONE);
		clickWatchModelGroup.setFont(parent.getFont());
		clickWatchModelGroup.setText("Generic ClickWatch model");
		clickWatchModelGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		clickWatchModelGroup.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(clickWatchModelGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(2, false));

		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		createBrowseButton(composite);
		
		clickWatchModelField = new Text(composite, SWT.BORDER);
		data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		clickWatchModelField.setLayoutData(data);
		clickWatchModelField.setFont(parent.getFont());

		Listener modifyListener = new Listener() {
			public void handleEvent(Event event) {
				setPageComplete(validatePage());
			}
		};
		clickWatchModelField.addListener(SWT.Modify, modifyListener);
	}

	protected void createBrowseButton(Composite composite) {
		Button browseButton = new Button(composite, SWT.NONE);
		browseButton.setText("Browse ...");
		prepareBrowseButton(browseButton);
	}
	
	private void prepareBrowseButton(Button browseButton) {
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

	public URI getClickWatchModel() {
		return URI.createURI(clickWatchModelField.getText(), true);
	}
	
	
}