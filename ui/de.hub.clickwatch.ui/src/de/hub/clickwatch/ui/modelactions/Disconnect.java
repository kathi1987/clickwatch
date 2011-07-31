package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.model.Node;


/**
 * Closes a connection to a remote node (click control element) 
 * 
 * @author zubow
 */
public class Disconnect extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (selectedObjectsIterator == null) {
			return;
		}
		
		while (selectedObjectsIterator.hasNext()) {
			Node node = selectedObjectsIterator.next();
			
			if (node.getConnection() != null) {
				INodeConnection oldConnection = (INodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}
		}
	}

}
