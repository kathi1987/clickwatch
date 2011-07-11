package de.hub.clickwatch.server.database;

public interface IClickWatchDB {
	public void addHandlerRecord();
	
	public void addExperimentRecord();
	
	public void getHandlerRecords(String pExperiment, String pNode, String pHandler, long pBegin, long pEnd);
	
	public void getMetaDataRecord(String pExperiment, String pNode);
}
