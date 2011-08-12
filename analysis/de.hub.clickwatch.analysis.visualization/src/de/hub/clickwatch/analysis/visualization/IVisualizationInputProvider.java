package de.hub.clickwatch.analysis.visualization;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public interface IVisualizationInputProvider {

	public Object getInput(IWorkbenchPart part, ISelection selection);
}
