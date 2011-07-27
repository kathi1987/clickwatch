/**
 * 
 */
package de.hub.clickwatch.analysis.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Lars George
 * 
 */
public class TransformationDialog extends Dialog implements ILaunchConfigurationDelegate {

	protected TransformationDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Label label = new Label(composite, SWT.NONE);
		label.setText("Configure the transformation");

		createTransformationLanguageSelectionGroup(composite);

		return composite;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(400, 300);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);

		newShell.setText("Transformation");
	}

	/**
	 * creates the language transformation part of the dialog
	 * 
	 * @param parent
	 */
	protected void createTransformationLanguageSelectionGroup(Composite parent) {
		Group transformationLanguageGroup = new Group(parent, SWT.NONE);
		transformationLanguageGroup.setFont(parent.getFont());
		transformationLanguageGroup.setText("Transformation language");
		transformationLanguageGroup.setLayoutData(new GridData(SWT.FILL,
				SWT.TOP, true, false));
		transformationLanguageGroup.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(transformationLanguageGroup,
				SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		composite.setLayout(new GridLayout(2, false));

		// languages selection
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.horizontalSpan = 1;
		ComboViewer languagesCombo = new ComboViewer(composite, SWT.READ_ONLY);
		languagesCombo.setContentProvider(ArrayContentProvider.getInstance());
		String[] languagesArr = {"Xtend2", "Xpand", "Java"};
		languagesCombo.setInput(languagesArr);
	}

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		
	}
}
