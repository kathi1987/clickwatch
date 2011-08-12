package de.hub.clickwatch.analysis.results.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.visualization.IVisualizationInputProvider;

public class ResultsVisualizationInputProvider implements IVisualizationInputProvider {

	@Override
	public Object getInput(IWorkbenchPart part, ISelection selection) {
		List<Result> result = new ArrayList<Result>();
		if (selection instanceof IStructuredSelection) {			
			for (Object input :((IStructuredSelection)selection).toArray()) {
				if (input instanceof Result) {
					result.add((Result)input);
				}	
			}			
		}
		if (result.isEmpty()) {
			return null;	
		} else {
			return result;
		}		
	}
}
