package de.hub.clickwatch.server.database;

public interface IRecord {

	public String createInsertStatement();

	public String createPreparedInsertStament();
}
