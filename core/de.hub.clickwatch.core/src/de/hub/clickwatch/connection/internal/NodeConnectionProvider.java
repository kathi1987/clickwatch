package de.hub.clickwatch.connection.internal;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.NodeBuilder;
import de.hub.clickwatch.util.Tasks;

@Singleton
public class NodeConnectionProvider implements INodeConnectionProvider {

	@Inject Provider<INodeConnection> ncp;
	@Inject Tasks tasks;

	@Override
	public INodeConnection createConnection(String host, String port) {
	    Node node = NodeBuilder.newNodeBuilder().withINetAddress(host).withPort(port).build();
	    return createConnection(node);		
	}
	
	@Override
	public INodeConnection createConnection(final Node node) {
		INodeConnection connection = node.getConnection();
		if (connection == null) {
		    connection = ncp.get();
		    final INodeConnection fConnection = connection;
		    tasks.dispatchTask(connection, new Runnable() {                
                @Override
                public void run() {              
                    if (fConnection instanceof NodeConnection) {
                        ((NodeConnection)fConnection).init(node);
                    }
                    node.setConnection(fConnection);        
                }
            });		
		    tasks.waitForCompletion(connection);
		}
		return connection;
	}
}
