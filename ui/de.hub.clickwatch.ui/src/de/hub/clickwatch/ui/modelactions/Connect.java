package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.PluginActivator;

/**
 * Establish a connection to the remote node via the click control element.
 */
public class Connect extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (selectedObjectsIterator == null) {
			return;
		}
		
		while (selectedObjectsIterator.hasNext()) {
			Node node = selectedObjectsIterator.next();
			if (node.getConnection() == null || !node.isConnected()) {
				INodeConnectionProvider ncp = PluginActivator.getInstance().getInjector().getInstance(INodeConnectionProvider.class);
				INodeConnection nodeConnection = ncp.createConnection(node); 
				node.setConnection(nodeConnection);
				nodeConnection.connect();
			} else {
				System.out.println("Already connected");
			}
		}
	}
}
