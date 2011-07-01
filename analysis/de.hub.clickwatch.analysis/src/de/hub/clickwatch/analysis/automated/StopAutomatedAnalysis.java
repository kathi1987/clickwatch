package de.hub.clickwatch.analysis.automated;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class StopAutomatedAnalysis implements IObjectActionDelegate {

	@Override
	public void run(IAction action) {
		AutomatedAnalysisContainer.getInstance().stopAnalyis();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}

}
