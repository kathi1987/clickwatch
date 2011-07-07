package de.hub.clickwatch.server;

import java.util.List;

public interface IClickWatchDB {
	
	public void addHandlerRecord(HandlerRecord record);
	
	public void addHandlerRecord(MetaDataRecord record);
	
	public List<HandlerRecord> getHandler(String experimentId, String nodeId, String qualifiedHandlerName, long from, long to);
	
	public List<MetaDataRecord> getMetaData(String experimentId, String nodeId, long from, long to);
	
}
