package de.hub.clickwatch;

public interface INodeConnectionProvider {

	public INodeConnection createNodeConnect(String iNetAddress, String port);
	
}
