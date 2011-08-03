package de.hub.clickwatch.connection.adapter;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.NodeConnection;

public abstract class AbstractAdapter {

	protected INodeConnection connection;
	
	public void init(INodeConnection connection) {
		this.connection = connection;
	}
	
	protected IClickSocket clickSocket() {
		return ((NodeConnection)connection).clickSocket();
	}
	
	public void clearCaches() {
		// empty
	}
}
