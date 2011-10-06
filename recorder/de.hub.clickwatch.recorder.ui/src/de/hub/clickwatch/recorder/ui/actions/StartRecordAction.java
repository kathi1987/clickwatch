package de.hub.clickwatch.recorder.ui.actions;


import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;

public class StartRecordAction extends AbstractRecordAction {

	@Override
	public void run(IAction action) {
		final NetworkRecorder networkRecorder = createInjector().getInstance(NetworkRecorder.class);
		final Record record = selectedObjects.get(0);
		record.setNetworkRecorder(networkRecorder);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				networkRecorder.start(record);		
			}
		}).start();
		
	}
}
