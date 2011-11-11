package de.hub.clickwatch.recorder.ui.actions;

import org.eclipse.jface.action.IAction;

public class StopRecordAction extends AbstractRecordAction {

	@Override
	public void run(IAction action) {
		getRecorder(selectedObjects.get(0)).stop();
	}
}
