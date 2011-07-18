package de.hub.clickwatch.server.database;

public class RecordFactory {
	
	public static HandlerRecord createHandlerRecord(){
		return new HandlerRecord();
	}
	
	public static MetaDataRecord createMetaDataRecord(){
		return new MetaDataRecord();
	}
}
