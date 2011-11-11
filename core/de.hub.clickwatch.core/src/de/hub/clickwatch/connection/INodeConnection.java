package de.hub.clickwatch.connection;

import com.google.inject.ImplementedBy;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.internal.NodeConnection;
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
@ImplementedBy(NodeConnection.class)
public interface INodeConnection {

    public <T> T getAdapter(Class<T> adapterClass);

    public Node getNode();

    /**
     * Stops listening (see {@link IHandlerEventAdapter#stop()}) and closes the
     * connection. The connections object stays within the {@link Node} (see
     * {@link Node#getConnection()}, and {@link #getNode()}) and can be reused.
     * 
     * Runs asynchronous within the connections thread.
     */
    public void close();

    /**
     * Calls {@link #close()} and disposes all adapters afterwards, after that
     * is removes the connection from the associated node.
     * 
     * Runs asynchronous within the connections thread.
     */
    public void dispose();

    /**
     * Many operations on this connection are asynchronous. This method blocks
     * until all registered tasks are completed.
     */
    public void waitForOpenTasks();

}
