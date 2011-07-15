package de.hub.clickwatch.connection.adapter;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;

public abstract class AbstractAdapter {

	protected IClickSocket clickSocket;
	protected INodeConnection connection;
	
	public void init(IClickSocket clickSocket, INodeConnection connection) {
		this.clickSocket = clickSocket;
		this.connection = connection;
	}
	
	public void clearCaches() {
		// empty
	}
}
