package de.hub.clickwatch.recorder.ui.actions;


import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.recorder.database.cwdatabase.Record;

public class StopRecordAction extends AbstractRecordAction {

	@Override
	public void run(IAction action) {
		final Record record = selectedObjects.get(0);
		if (record.getNetworkRecorder() != null) {
			record.getNetworkRecorder().abort();
			record.setNetworkRecorder(null);
		}
	}
}
