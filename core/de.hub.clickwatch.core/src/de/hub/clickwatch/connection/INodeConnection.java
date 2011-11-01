package de.hub.clickwatch.connection;

import com.google.inject.ImplementedBy;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.internal.NodeConnectionImpl;
import de.hub.clickwatch.model.Node;

/**
 * INodeConnection represents a connection to a node. {@link INodeConnection}s
 * use {@link IClickSocket}s to actually create a network connection to the node
 * and to retrieve data from the node. But {@link INodeConnection} abstracts
 * from details by providing a series of adapters that can perform various tasks
 * with this connection.
 * 
 * {@link INodeConnection} allows all adapters to acquire and use one
 * {@link IClickSocket}. Connecting and disconnecting the socket is handled
 * implicitly. 
 */
@ImplementedBy(NodeConnectionImpl.class)
public interface INodeConnection {

	public <T> T getAdapter(Class<T> adapterClass);
	
	public Node getNode();
	
	public void close();

}
