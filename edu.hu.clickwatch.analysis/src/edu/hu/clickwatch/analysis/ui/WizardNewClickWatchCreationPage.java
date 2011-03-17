package edu.hu.clickwatch.analysis.ui;

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
		return URI.createPlatformResourceURI(getProjectName() + "/" + clickWatchModelField.getText(), true);
	}

	@Override
	protected void setClickWatchModelFieldDefaults() {
		clickWatchModelField.setText("src/example.clickwatchmodel");
	}

	@Override
	protected String getDefaultProjectName() {
		return "clickwatch";
	}

	
	
}
