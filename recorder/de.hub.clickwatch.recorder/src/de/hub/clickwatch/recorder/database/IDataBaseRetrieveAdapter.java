package de.hub.clickwatch.recorder.database;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;

public interface IDataBaseRetrieveAdapter {

	public void initialize(ExperimentDescr experiment);
	
	public void set(String nodeId, long time);
	
	public Handler retrieve(String handlerId);
	
	public Handler[] retrieve(String[] handlerId);
	
}
