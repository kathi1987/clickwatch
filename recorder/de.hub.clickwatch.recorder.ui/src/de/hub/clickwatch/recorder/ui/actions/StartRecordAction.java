package de.hub.clickwatch.recorder.ui.actions;

import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.recorder.database.Record;

public class StartRecordAction extends AbstractRecordAction {
    
	@Override
	public void run(IAction action) {	    
	    Record record = selectedObjects.get(0);
	    getRecorder(record).record(record);
	}
	
}
