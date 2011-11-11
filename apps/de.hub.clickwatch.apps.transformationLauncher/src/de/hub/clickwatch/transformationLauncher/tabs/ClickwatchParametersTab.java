package de.hub.clickwatch.transformationLauncher.tabs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jdt.internal.debug.ui.JavaDebugImages;
import org.eclipse.jdt.internal.debug.ui.actions.ControlAccessibleListener;
import org.eclipse.jdt.internal.debug.ui.launcher.LauncherMessages;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.recorder.database.presentation.CWDataBaseEditor;
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
		createSourceModelGroup(comp);
		createVerticalSpacer(comp, 1);
		createModelObjectGroup(comp);

		setControl(comp);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	/**
	 * creates the visual components for the model object group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	protected void createModelObjectGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent, "Model object", 2, 1,
				GridData.FILL_HORIZONTAL);
		modelObject = SWTFactory.createSingleText(group, 1);
		modelObject.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});
		ControlAccessibleListener.addListener(modelObject, group.getText());
		Button selectModelObjectButton = createPushButton(group,
				LauncherMessages.AbstractJavaMainTab_1, null);
		selectModelObjectButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {

				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getLoadOptions().put(
						XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

				Resource modelResource = null;

				try {
					modelResource = resourceSet.getResource(
							URI.createURI(sourceModel.getText()), true);
				} catch (Exception e) {
					Status s = new Status(IStatus.ERROR, "not_used",
							"The given source model file is not valid: "
									+ sourceModel.getText(), null);
					StatusManager.getManager().handle(s, StatusManager.SHOW);
				}
				if (modelResource != null) {
					ClickWatchModelObjectChooser dialog = new ClickWatchModelObjectChooser(
							shell, modelResource);
					if (dialog.open() == Dialog.OK) {
						setModelObjectURI(dialog.getSelecteID());
					}
				}
			}
		});
	}

	/**
	 * creates the visual components for the source model group
	 * 
	 * @param parent
	 *            the component within this group shoul dbe created
	 */
	protected void createSourceModelGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent, "Source model", 2, 1,
				GridData.FILL_HORIZONTAL);
		sourceModel = SWTFactory.createSingleText(group, 1);
		sourceModel.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});

		ControlAccessibleListener.addListener(sourceModel, group.getText());
		Button selectSourceModelButton = createPushButton(group,
				LauncherMessages.AbstractJavaMainTab_1, null);
		selectSourceModelButton.addSelectionListener(new SelectionAdapter() {
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
					setSourceModelFile(uriString);
					setDirty(true);
					updateLaunchConfigurationDialog();
				}
			}
		});
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
				Object firstElement = ((IStructuredSelection) ((ClickWatchModelEditor) editorPart)
						.getSelection()).getFirstElement();
				if (firstElement instanceof EObject) {
					URI eProxyURI = EcoreUtil.getURI((EObject) firstElement);

					configuration.setAttribute(
							ClickwatchParametersTab.ATTR_MODEL_OBJECT,
							eProxyURI.fragment());

					configuration.setAttribute(
							ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE,
							URI.createPlatformResourceURI(
									eProxyURI.toPlatformString(true), true)
									.toString());
				}
			} else if (editorPart instanceof CWDataBaseEditor) {
				Object firstElement = ((IStructuredSelection) ((CWDataBaseEditor) editorPart)
						.getSelection()).getFirstElement();

				if (firstElement instanceof EObject) {
					URI eProxyURI = EcoreUtil.getURI((EObject) firstElement);

					configuration.setAttribute(
							RecordParametersTab.ATTR_RECORD_ID,
							eProxyURI.fragment());

					configuration.setAttribute(
							RecordParametersTab.ATTR_DATABASE_URI,
							URI.createPlatformResourceURI(
									eProxyURI.toPlatformString(true), true)
									.toString());
				}
			} else if (editorPart.getEditorInput() instanceof FileEditorInput) {
				FileEditorInput fInput = (FileEditorInput) editorPart
						.getEditorInput();
				if ((fInput.getFile().getFileExtension().endsWith("java") || fInput
						.getFile().getFileExtension().endsWith("xtend"))) {
					configuration.setAttribute(
							MainParametersTab.ATTR_TRANSFORMATION_FILE,
							URI.createPlatformResourceURI(
									fInput.getFile().getFullPath().toString(),
									true).toString());
				}			
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

	@Override
	public Image getImage() {
		return JavaDebugImages.get(JavaDebugImages.IMG_OBJS_THREAD_GROUP);

	}

}
