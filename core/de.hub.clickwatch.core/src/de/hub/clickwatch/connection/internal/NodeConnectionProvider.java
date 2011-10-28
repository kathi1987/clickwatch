package de.hub.clickwatch.connection.internal;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.NodeBuilder;

@Singleton
public class NodeConnectionProvider implements INodeConnectionProvider {

	@Inject Provider<INodeConnection> ncp;
	@Inject Provider<NodeConnectionImpl> simpleNcp;

	@Override
	public INodeConnection createConnection(String host, String port) {
		INodeConnection connection = ncp.get();
		if (connection instanceof NodeConnectionImpl) {
			((NodeConnectionImpl)connection).init(NodeBuilder.newNodeBuilder().withINetAddress(host).withPort(port).build());
		}
		return connection;
	}
	
	@Override
	public INodeConnection createConnection(Node node) {
		INodeConnection connection = ncp.get();
		if (connection instanceof NodeConnectionImpl) {
			((NodeConnectionImpl)connection).init(node);
		}
		return connection;
	}

	@Override
	public INodeConnection createSimpleConnection(Node node) {
		INodeConnection connection = simpleNcp.get();
		if (connection instanceof NodeConnectionImpl) {
			((NodeConnectionImpl)connection).init(node);
		}
		return connection;
	}
	
}
