package de.hub.clickwatch.connection;


public interface INodeConnectionProvider {
	public INodeConnection createNodeConnect(String iNetAddress, String port);
}
