package de.hub.clickwatch.connection.internal;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;

public interface IInternalNodeConnection extends INodeConnection {

	/**
	 * Returns the {@link INodeConnection}'s socket and ensures exclusive use
	 * until the socket is released. The call blocks until the socket is
	 * available.
	 * 
	 * @return the connected socket or null if the socket could not connect.
	 */
	public IClickSocket acquireSocket();

	/**
	 * Releases a previously acquired socket. 
	 */
	public void releaseSocket();
	
	/**
	 * Returns a specific socket implementation based on the
	 * {@link INodeConnection}'s actual socket, that will block with each
	 * operation until the actual socket is available.
	 */
	public IClickSocket getBlockingSocket();
	
	public void createError(String message, Throwable e);

}
