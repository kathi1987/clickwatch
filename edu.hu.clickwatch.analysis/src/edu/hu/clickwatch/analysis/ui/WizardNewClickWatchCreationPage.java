package edu.hu.clickwatch.analysis.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;

public class WizardNewClickWatchCreationPage extends WizardNewAnalysisCreationPage {

	public WizardNewClickWatchCreationPage(String pageName,
			IStructuredSelection selection) {
		super(pageName, selection);
	}

	@Override
	protected void createBrowseButton(Composite composite) {
		// empty
	}

	@Override
	public URI getClickWatchModel() {
		return URI.createPlatformResourceURI("", true);
	}

	@Override
	protected void setClickWatchModelFieldDefaults(IFile file) {
		clickWatchModelField.setText("example.clickwatchmodel");
	}

	
}
