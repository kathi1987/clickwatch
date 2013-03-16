package de.hub.clickwatch.analysis.results.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.ResultsPackage;
import de.hub.clickwatch.analysis.visualization.AbstractVisualizationInput;
import de.hub.clickwatch.analysis.visualization.IVisualizationInput;
import de.hub.clickwatch.analysis.visualization.IVisualizationInputProvider;

public class ResultsVisualizationInputProvider implements IVisualizationInputProvider {

	@Override
	public IVisualizationInput getInput(IWorkbenchPart part, ISelection selection) {
		final List<Result> results = new ArrayList<Result>();
		if (selection instanceof IStructuredSelection) {			
			for (Object input :((IStructuredSelection)selection).toArray()) {
				if (input instanceof Result) {
					results.add((Result)input);
				}	
			}			
		}
		if (results.isEmpty()) {
			return null;	
		} else {
			final AbstractVisualizationInput input = new AbstractVisualizationInput() {			
				@Override
				public Object getInputData() {
					return results;				//hier landet man während des Chartaufbaus irgendwann mal (nach Aufruf von input.getInputData() in VisualizationView)
				}
			};
			
			for (Result result: results) {
				result.eAdapters().add(new Adapter() {
					@Override
					public void notifyChanged(Notification notification) {
						if (notification.getFeature() == ResultsPackage.eINSTANCE.getResult_Timestamp()) {
							input.inputDataHasChanged();
						}
					}

					@Override
					public Notifier getTarget() {
						return null;
					}

					@Override
					public void setTarget(Notifier newTarget) {

					}

					@Override
					public boolean isAdapterForType(Object type) {
						return false;
					}					
				});
			}
			
			return input;
		}		
	}
}
