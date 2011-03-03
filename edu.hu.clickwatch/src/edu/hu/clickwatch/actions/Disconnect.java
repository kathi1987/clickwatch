package edu.hu.clickwatch.actions;

import org.eclipse.jface.action.IAction;

import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.Node;

/**
 * Closes a connection to a remote node (click control element) 
 * 
 * @author zubow
 */
public class Disconnect extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (node_it == null) {
			return;
		}
		
		while (node_it.hasNext()) {
			Node node = node_it.next();
			
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}
		}
	}

}
