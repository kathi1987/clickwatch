package de.hub.clickwatch.connection;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.model.Node;

/**
 * An {@link INodeConnectionProvider} allows to create {@link INodeConnection}s.
 * Whereby create does not mean that the connection is connected. This has to be
 * done on the {@link INodeConnection}. {@link INodeConnectionProvider}s are
 * usually singletons and should be created via injection.
 */
@ImplementedBy(NodeConnectionProvider.class)
public interface INodeConnectionProvider {

	public INodeConnection createConnection(String host, String port);
	
	public INodeConnection createConnection(Node node);
}
