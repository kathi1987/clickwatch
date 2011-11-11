package de.hub.clickwatch.transformationLauncher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut;
import org.eclipse.jdt.internal.core.CompilationUnit;
import org.eclipse.jdt.internal.debug.ui.JDIDebugUIPlugin;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.recorder.database.presentation.CWDataBaseEditor;
import de.hub.clickwatch.transformationLauncher.tabs.ClickwatchParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.MainParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.RecordParametersTab;

/**
 * This class is used when a transformation should be performed as a shorcut
 * (run as -> transformation)
 * 
 * @author Lars George
 * 
 */
public class TransformationLaunchShortcut extends JavaLaunchShortcut {

	private String modelObject = "";
	private String sourceModelFile = "";
	private String recordDatabaseFile = "";
	private String recordID = "";
	private String transformationFile = "";

	@Override
	public void launch(ISelection selection, String mode) {
		Object selected = ((IStructuredSelection) selection).getFirstElement();

		if (selected instanceof CompilationUnit) {
			try {
				transformationFile = URI
						.createPlatformResourceURI(
								((CompilationUnit) selected).getPath()
										.toString(), true).toString();
			} catch (Exception e) {
				Status s = new Status(IStatus.ERROR, "not_used", e.toString(),
						null);
				StatusManager.getManager().handle(s, StatusManager.SHOW);
			}
		} else if (selected instanceof File) {
			try {
				transformationFile = URI.createPlatformResourceURI(
						((File) selected).getFullPath().toString(), true)
						.toString();
			} catch (Exception e) {
				Status s = new Status(IStatus.ERROR, "not_used", e.toString(),
						null);
				StatusManager.getManager().handle(s, StatusManager.SHOW);
			}
		}
		tryFindClickWatchModel();
		tryFindRecordDatabase();

		this.launch(mode);
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		if (editor.getEditorInput() instanceof FileEditorInput) {
			FileEditorInput fInput = (FileEditorInput) editor.getEditorInput();

			transformationFile = URI.createPlatformResourceURI(
					fInput.getFile().getFullPath().toString(), true).toString();
		}

		if (!(transformationFile.endsWith(".xtend") || transformationFile
				.endsWith(".java"))) {
			Status s = new Status(
					IStatus.ERROR,
					"not_used",
					"No valid transformation file could be found (only .xtend and .java files are supported)).",
					null);
			StatusManager.getManager().handle(s, StatusManager.SHOW);

			return;
		}

		tryFindClickWatchModel();
		tryFindRecordDatabase();

		this.launch(mode);
	}

	/**
	 * Launches the given type in the specified mode.
	 * 
	 * @param type
	 *            type to launch
	 * @param mode
	 *            launch mode
	 * @since 3.5
	 */
	protected void launch(String mode) {
		ILaunchConfiguration config = this.findLaunchConfiguration();
		if (config == null) {
			config = this.createConfiguration();
		}
		if (config != null) {
			DebugUITools.launch(config, mode);
		}
	}

	protected ILaunchConfigurationType getConfigurationType() {
		ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
		return lm
				.getLaunchConfigurationType("de.hub.clickwatch.analysis.ui.TransformationLaunchConfiguration");
	}

	protected ILaunchConfiguration findLaunchConfiguration() {
		List candidateConfigs = Collections.EMPTY_LIST;
		try {
			ILaunchConfiguration[] configs = DebugPlugin.getDefault()
					.getLaunchManager()
					.getLaunchConfigurations(getConfigurationType());
			candidateConfigs = new ArrayList(configs.length);
			for (int i = 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				if (config.getAttribute(
						MainParametersTab.ATTR_TRANSFORMATION_FILE, "").equals(
						transformationFile)
						&& config.getAttribute(
								ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE,
								"").equals(sourceModelFile)
						&& config.getAttribute(
								ClickwatchParametersTab.ATTR_MODEL_OBJECT, "")
								.equals(modelObject)
						&& config.getAttribute(
								MainParametersTab.ATTR_VALUE_TYPE, "").equals(
								"SPECIFIC")
						&& config.getAttribute(
								MainParametersTab.ATTR_DEBUG_LEVEL, "").equals(
								"Warning")
						&& config.getAttribute(
								RecordParametersTab.ATTR_DATABASE_URI, "")
								.equals(recordDatabaseFile)
						&& config.getAttribute(
								RecordParametersTab.ATTR_RECORD_ID, "").equals(
								recordID)) {
					candidateConfigs.add(config);
				}
			}
		} catch (CoreException e) {
			JDIDebugUIPlugin.log(e);
		}
		int candidateCount = candidateConfigs.size();
		if (candidateCount == 1) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		} else if (candidateCount > 1) {
			return chooseConfiguration(candidateConfigs);
		}
		return null;
	}

	private void tryFindClickWatchModel() {

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

					modelObject = eProxyURI.fragment();

					sourceModelFile = URI.createPlatformResourceURI(
							eProxyURI.toPlatformString(true), true).toString();
				}
			}
		}
	}

	private void tryFindRecordDatabase() {
		IEditorReference[] editorReferences = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();

		// check every editor for selections that can be default values
		for (IEditorReference editorRef : editorReferences) {
			IEditorPart editorPart = editorRef.getEditor(true);

			// a cw database editor?
			if (editorPart instanceof CWDataBaseEditor) {
				Object firstElement = ((IStructuredSelection) ((CWDataBaseEditor) editorPart)
						.getSelection()).getFirstElement();
				if (firstElement instanceof EObject) {
					URI eProxyURI = EcoreUtil.getURI((EObject) firstElement);

					recordID = eProxyURI.fragment();

					recordDatabaseFile = URI.createPlatformResourceURI(
							eProxyURI.toPlatformString(true), true).toString();
				}
			}
		}
	}

	protected ILaunchConfiguration createConfiguration() {

		ILaunchConfiguration config = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			ILaunchConfigurationWorkingCopy wc = configType.newInstance(
					null,
					DebugPlugin
							.getDefault()
							.getLaunchManager()
							.generateLaunchConfigurationName(
									configType.getName()));

			wc.setAttribute(MainParametersTab.ATTR_TRANSFORMATION_FILE,
					transformationFile);
			wc.setAttribute(MainParametersTab.ATTR_VALUE_TYPE, "SPECIFIC");
			wc.setAttribute(MainParametersTab.ATTR_DEBUG_LEVEL, "Warning");
			wc.setAttribute(MainParametersTab.ATTR_HANDLER_PER_RECORD, "2000");
			wc.setAttribute(MainParametersTab.ATTR_DATABASE_TYPE, "HBASE");
			wc.setAttribute(MainParametersTab.ATTR_HANDLER_BEHAVIOUR, "DEFAULT");
			wc.setAttribute(MainParametersTab.ATTR_RECORD_URI, "");

			if (recordDatabaseFile != null && recordDatabaseFile != "")
				wc.setAttribute(RecordParametersTab.ATTR_DATABASE_URI,
						recordDatabaseFile);
			wc.setAttribute(RecordParametersTab.ATTR_RECORD_ID, recordID);

			wc.setAttribute(ClickwatchParametersTab.ATTR_MODEL_OBJECT,
					modelObject);
			wc.setAttribute(ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE,
					sourceModelFile);

			config = wc.doSave();
		} catch (Exception e) {
			Status s = new Status(IStatus.ERROR, "not_used", e.toString(), null);
			StatusManager.getManager().handle(s, StatusManager.SHOW);
		}
		return config;
	}

	@Override
	protected IType[] findTypes(Object[] elements, IRunnableContext context)
			throws InterruptedException, CoreException {
		Set result = new HashSet();

		return (IType[]) result.toArray(new IType[result.size()]);
	}

	@Override
	protected String getTypeSelectionTitle() {
		return "Select";
	}

	@Override
	protected String getEditorEmptyMessage() {
		return "Editor empty";
	}

	@Override
	protected String getSelectionEmptyMessage() {
		return "Select existing configuration";
	}

	@Override
	protected ILaunchConfiguration createConfiguration(IType type) {
		// TODO Auto-generated method stub
		return null;
	}
}
