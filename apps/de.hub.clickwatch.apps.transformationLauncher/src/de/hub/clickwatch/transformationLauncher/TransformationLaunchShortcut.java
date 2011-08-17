package de.hub.clickwatch.transformationLauncher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.transformationLauncher.tabs.ClickwatchParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.RecordParametersTab;
import de.hub.clickwatch.transformationLauncher.tabs.MainParametersTab;

/**
 * This class is used when a transformation should be performed as a shorcut
 * (run as -> transformation)
 * 
 * @author Lars George
 * 
 */
public class TransformationLaunchShortcut implements ILaunchShortcut {

	private String modelObject = "";
	private String sourceModelFile = "";

	@Override
	public void launch(ISelection selection, String mode) {
		// String file =
		// "platform:/resource/de.hub.clickwatch.analysis.examples.xtend2/src/de/hub/clickwatch/analysis/examples/java/TestRunConfiguration2.java";
		String file = "";
		Object selected = ((IStructuredSelection) selection).getFirstElement();
		if (selected instanceof CompilationUnit) {
			file = ((CompilationUnit) selected).getJavaElement().getPath()
					.toString()
					+ ((CompilationUnit) selected).getJavaElement()
							.getElementName();
		}

		launch(file, mode);
	}

	@Override
	public void launch(IEditorPart editor, String mode) {

		String file = "";

		if (editor.getEditorInput() instanceof FileEditorInput) {
			FileEditorInput fInput = (FileEditorInput) editor.getEditorInput();

			file = URI.createPlatformResourceURI(
					fInput.getFile().getFullPath().toString(), true).toString();
		}

		launch(file, mode);
	}

	protected ILaunchConfigurationType getConfigurationType() {
		ILaunchManager lm = DebugPlugin.getDefault().getLaunchManager();
		return lm
				.getLaunchConfigurationType("de.hub.clickwatch.analysis.ui.TransformationLaunchConfiguration");
	}

	private void launch(String transformationFile, String mode) {

		tryFindClickWatchModel();

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
			wc.setAttribute(RecordParametersTab.ATTR_DATABASE_URI, "");
			wc.setAttribute(RecordParametersTab.ATTR_RECORD_ID, "");
			wc.setAttribute(ClickwatchParametersTab.ATTR_MODEL_OBJECT,
					modelObject);
			wc.setAttribute(ClickwatchParametersTab.ATTR_SOURCE_MODEL_FILE,
					sourceModelFile);

			config = wc.doSave();

			DebugUITools.launch(config, mode);

		} catch (CoreException ce) {
		}
	}

	private void tryFindClickWatchModel() {
		String ret = "";

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
}
