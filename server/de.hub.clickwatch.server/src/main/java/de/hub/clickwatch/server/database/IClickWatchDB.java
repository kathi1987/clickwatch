package de.hub.clickwatch.server.database;

import java.util.Collection;

public interface IClickWatchDB {
	public void addHandlerRecord(HandlerRecord pHandlerRecord);
	
	public void addExperimentRecord(MetaDataRecord pExperimentRecord);
	
	public void addHandlerRecords(Collection<HandlerRecord> pHandlerRecords);

	public void addExperimentRecords(Collection<MetaDataRecord> pExperimentRecords);
	
	public void executeQueryFromFile(String pFile);
	
	public void executeQuery(final String pQuery);
}
