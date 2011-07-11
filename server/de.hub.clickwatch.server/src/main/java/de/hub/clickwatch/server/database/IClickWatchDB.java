package de.hub.clickwatch.server.database;

import java.util.Collection;

public interface IClickWatchDB {
	public void addHandlerRecord(HandlerRecord pHandlerRecord);
	
	public void addExperimentRecord(MetaDataRecord pExperimentRecord);
	
	public Collection<HandlerRecord> getHandlerRecords(String pExperiment, String pNode, String pHandler, long pBegin, long pEnd);
	
	public Collection<MetaDataRecord> getMetaDataRecord(String pExperiment, String pNode);

	public void addHandlerRecords(Collection<HandlerRecord> pHandlerRecords);

	public void addExperimentRecords(Collection<MetaDataRecord> pExperimentRecords);
}
