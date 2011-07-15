package de.hub.clickwatch.connection;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import de.hub.clickwatch.model.Node;

@Singleton
public class NodeConnectionProvider implements INodeConnectionProvider {

	@Inject
	Provider<INodeConnection> ncp;

	@Override
	public INodeConnection createConnection(String host, String port) {
		INodeConnection connection = ncp.get();
		if (connection instanceof NodeConnection) {
			((NodeConnection)connection).init(host, port);
		}
		return connection;
	}
	
	@Override
	public INodeConnection createConnection(Node node) {
		INodeConnection connection = ncp.get();
		if (connection instanceof NodeConnection) {
			((NodeConnection)connection).init(node);
		}
		return connection;
	}
	
}
