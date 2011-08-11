package de.hub.clickwatch.transformationLauncher.tabs;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorMapping;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.transformationLauncher.dialog.ClickWatchModelObjectChooser;

/**
 * The tab for a transformation launch configuration
 * 
 * @author Lars George
 * 
 */
public class ClickwatchParametersTab extends AbstractLaunchConfigurationTab {

	public static final String ATTR_SOURCE_MODEL_FILE = "attr_source_model_file";
	public static final String ATTR_MODEL_OBJECT = "attr_model_object";

	private final String TAB_NAME = "Clickwatch";
	private Text sourceModel;

	private Text modelObject;

	@Override
	public void createControl(Composite parent) {

		final Shell shell = parent.getShell();

		Group mainGroup = new Group(parent, SWT.NONE);
		mainGroup.setFont(parent.getFont());
		mainGroup.setText("Clickwatch configurations");
		mainGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		mainGroup.setLayout(new GridLayout(1, false));

		// source model
		Composite composite = new Composite(mainGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(3, false));

		Label transfLabel = new Label(composite, SWT.FILL);
		transfLabel.setText("Source model: ");

		sourceModel = new Text(composite, SWT.FILL);
		GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		sourceModel.setLayoutData(layoutData);

		Button selectSourceModelButton = new Button(composite, SWT.PUSH);
		selectSourceModelButton.setText("...");
		selectSourceModelButton.addSelectionListener(new SelectionAdapter() {
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
					setSourceModelFile(uriString);
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			}
		});

		// model object
		composite = new Composite(mainGroup, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(3, false));

		transfLabel = new Label(composite, SWT.FILL);
		transfLabel.setText("Model object: ");

		modelObject = new Text(composite, SWT.FILL);
		layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
		modelObject.setLayoutData(layoutData);

		Button selectModelObjectButton = new Button(composite, SWT.PUSH);
		selectModelObjectButton.setText("...");
		selectModelObjectButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {

				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getLoadOptions().put(
						XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
				Resource modelResource = resourceSet.getResource(
						URI.createURI(sourceModel.getText()), true);
				if (modelResource != null) {
					ClickWatchModelObjectChooser dialog = new ClickWatchModelObjectChooser(
							shell, modelResource);
					if (dialog.open() == Dialog.OK) {
						setModelObjectURI(dialog.getSelecteID());
					}
				}
			}
		});

		IEditorPart activeEditor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (activeEditor instanceof ClickWatchModelEditor) {
			Object firstElement = ((IStructuredSelection) ((ClickWatchModelEditor) activeEditor)
					.getSelection()).getFirstElement();
			if (firstElement instanceof EObject) {
				URI eProxyURI = EcoreUtil.getURI((EObject) firstElement);
				modelObject.setText(eProxyURI.toString());
			}
		}

		setControl(mainGroup);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);

		return true;
	}

	/**
	 * sets the string parameter for the source model in the gui
	 * 
	 * @param uriString
	 */
	private void setSourceModelFile(String uriString) {
		sourceModel.setText(uriString);
	}

	/**
	 * sets the string parameter for the model object in the gui
	 * 
	 * @param uriString
	 */
	private void setModelObjectURI(String uriString) {
		modelObject.setText(uriString);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {		

		IEditorReference[] editorReferences = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();

		// check every editor for selections that can be default values
		for (IEditorReference editorRef : editorReferences) {
			IEditorPart editorPart = editorRef.getEditor(true);
			
			// a clickwatch model?
			if (editorPart instanceof ClickWatchModelEditor) {
				Object firstElement = ((IStructuredSelection) ((ClickWatchModelEditor)editorPart)
						.getSelection()).getFirstElement();
				if (firstElement instanceof EObject) {
					URI eProxyURI = EcoreUtil.getURI((EObject) firstElement);

					configuration.setAttribute(
							ClickwatchParametersTab.ATTR_MODEL_OBJECT,
							eProxyURI.fragment());
				}
			}			
			else if (editorPart.getEditorInput() instanceof FileEditorInput) {				
				FileEditorInput fInput = (FileEditorInput)editorPart.getEditorInput();
				// System.out.println( fInput.getFile());
			}
						
		}
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {

			sourceModel.setText(configuration.getAttribute(
					ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE, ""));

			modelObject.setText(configuration.getAttribute(
					ClickwatchParametersTab.ATTR_MODEL_OBJECT, ""));

		} catch (CoreException e) {
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// set the values of the tab components in the configuration object

		configuration.setAttribute(
				ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE,
				sourceModel.getText());

		configuration.setAttribute(ClickwatchParametersTab.ATTR_MODEL_OBJECT,
				modelObject.getText());
	}

	@Override
	public String getName() {
		return TAB_NAME;
	}

}
