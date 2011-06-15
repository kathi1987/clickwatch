package edu.hu.clickwatch.analysis.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewAnalysisProjectWizard extends Wizard implements INewWizard {

	private WizardNewAnalysisCreationPage mainPage;
	private IWorkbench workbench;
	private IStructuredSelection selection;
	
	AnalysisProjectCreator creator = new AnalysisProjectCreator();

	public NewAnalysisProjectWizard() {
		setWindowTitle("New Analysis project");
		//setDefaultPageImageDescriptor(getImageDescriptor("icons/newxprj_wiz.png")); //$NON-NLS-1$
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	@Override
	public void addPages() {
		super.addPages();
		mainPage = new WizardNewAnalysisCreationPage("mainPage", this.selection); //$NON-NLS-1$
		addPage(mainPage);
	}
	
	private AnalysisProjectInfo getProjectInfo() {
		AnalysisProjectInfo result = new AnalysisProjectInfo();
		result.setClickWatchModel(mainPage.getClickWatchModel());
		result.setProjectName(mainPage.getProjectName());
		result.setLocationPath(mainPage.getLocationPath());
		result.setSelectedWorkingSets(mainPage.getSelectedWorkingSets());
		return result;
	}

	@Override
	public boolean performFinish() {
		final AnalysisProjectInfo info = getProjectInfo();
		IRunnableWithProgress op = new IRunnableWithProgress() {			
			@Override
			public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {			
				creator.setInfo(info);
				try {
					creator.run(monitor);
				}
				catch (Exception e) {
					throw new InvocationTargetException(e);
				}
				finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	
    /**
     * Returns an image descriptor for the image file at the given plug-in relative path
     * 
     * @param path
     *            the path
     * @return the image descriptor
     */
//    private ImageDescriptor getImageDescriptor(String path) {
//        return JcpUiActivator.imageDescriptorFromPlugin("com.webgambas.jcp.ui", path);
//    }
}