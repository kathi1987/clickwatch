package de.hub.clickwatch.analysis.results.ui;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.visualization.IVisualizationInputProvider;

public class ResultsVisualizationInputProvider implements IVisualizationInputProvider {

	@Override
	public Object getInput(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object input = ((IStructuredSelection)selection).getFirstElement();
			if (input instanceof Result) {
				return input;
			}
		}
		return null;
	}
}
