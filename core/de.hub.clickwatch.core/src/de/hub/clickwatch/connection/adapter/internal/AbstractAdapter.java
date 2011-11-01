package de.hub.clickwatch.connection.adapter.internal;

import de.hub.clickwatch.connection.internal.IInternalNodeConnection;

public abstract class AbstractAdapter {

	protected IInternalNodeConnection connection;
	
	public void init(IInternalNodeConnection connection) {
		this.connection = connection;
	}
	
	public void dispose() {
	    // empty
	}
	
}
