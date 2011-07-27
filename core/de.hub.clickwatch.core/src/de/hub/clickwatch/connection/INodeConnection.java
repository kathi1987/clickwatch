package de.hub.clickwatch.connection;

import com.google.inject.ImplementedBy;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;

/**
 * INodeConnection represents a connection to a node. {@link INodeConnection}s
 * use {@link IClickSocket}s to actually create a network connection to the node
 * and to pull actual data from the node. But {@link INodeConnection} abstracts
 * from details by providing a series of adapters that can perform various tasks
 * with this connection.
 * 
 * {@link INodeConnection} allows all adapters to share on {@link IClickSocket},
 * and to get other adapters without referencing or creating them directly.
 * 
 * Adapters use each other an form a call hierarchy. {@link IMetaDataAdapter}
 * for example provides information about elements and handlers.
 * {@link IHandlerAdapter} allows to pull handler values. {@link IValueAdapter}
 * allows to serialize and de-serialize handler values. {@link IHandlerAdapter}
 * use {@link IValueAdapter} to deal with the values. {@link INodeAdapter} uses
 * {@link IMetaDataAdapter} and {@link IHandlerAdapter} to create a node
 * representation. Clients might add further adapters that use these adapters.
 */
@ImplementedBy(NodeConnection.class)
public interface INodeConnection {

	public void connect();

	public void disconnect();

	public boolean isConnected();

	public <T> T getAdapter(Class<T> adapterClass);
}
