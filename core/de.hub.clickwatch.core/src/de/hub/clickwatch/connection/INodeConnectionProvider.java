package de.hub.clickwatch.connection;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.internal.NodeConnectionProvider;
import de.hub.clickwatch.model.Node;

/**
 * An {@link INodeConnectionProvider} allows to create {@link INodeConnection}s.
 * Whereby create does not mean that the connection is connected. This has to be
 * done on the {@link INodeConnection}. {@link INodeConnectionProvider}s are
 * usually singletons and should be created via injection.
 */
@ImplementedBy(NodeConnectionProvider.class)
public interface INodeConnectionProvider {

    /**
     * Creates a {@link INodeConnection} for the given node. The connection is
     * automatically registered with the node (accessible through
     * {@link Node#getConnection()}). If the given node already has a
     * {@link INodeConnection} associated with it, the method returns that
     * already existing connection and no new connection is created.
     */
    public INodeConnection createConnection(Node node);

    /**
     * Creates an implicit {@link Node} with the given host and port. Further,
     * creates a {@link INodeConnection} for that node (see
     * {@link #createConnection(Node)}.
     */
    public INodeConnection createConnection(String host, String port);

}
