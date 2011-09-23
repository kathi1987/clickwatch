/**
 * 
 */
package de.hub.clickwatch.transformationLauncher.tabs;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jdt.internal.debug.ui.JavaDebugImages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Xerxekyran
 * 
 */
public class ArgumentsParametersTab extends AbstractLaunchConfigurationTab {

	private final String TAB_NAME = "Arguments";

	public static final String ATTR_TRANSFORMATION_ARGUMENTS = "attr_transformation_arguments";

	private Text transformationArguments;

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
		createTransformationArgumentsGroup(comp);
		
		setControl(comp);

		// schedule an update job so every change is noticed
		scheduleUpdateJob();
	}

	/**
	 * creates the visual components for the transformation arguments group
	 * 
	 * @param parent
	 *            the component within this group should be created
	 */
	private void createTransformationArgumentsGroup(Composite parent) {

		final Shell shell = parent.getShell();

		Group group = SWTFactory.createGroup(parent,
				"Transformation Arguments", 1, 1, GridData.FILL_HORIZONTAL);
		transformationArguments = new Text(group, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
		transformationArguments.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});
		
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 60;
		gd.widthHint = 100;
		transformationArguments.setLayoutData(gd);
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
		configuration.setAttribute(
				ArgumentsParametersTab.ATTR_TRANSFORMATION_ARGUMENTS, "");
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
			transformationArguments.setText(configuration.getAttribute(
					ArgumentsParametersTab.ATTR_TRANSFORMATION_ARGUMENTS, ""));
		} catch (CoreException e) {
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
		configuration.setAttribute(
				ArgumentsParametersTab.ATTR_TRANSFORMATION_ARGUMENTS,
				transformationArguments.getText());

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
