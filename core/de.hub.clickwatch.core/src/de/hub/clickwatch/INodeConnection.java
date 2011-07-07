package de.hub.clickwatch;

public interface INodeConnection {

	public void connect();
	
	public void disconnect();
	
	public <T> T getAdapter(Class<T> adapterClass);
	
}
