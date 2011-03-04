package edu.hu.clickwatch.actions;

import org.eclipse.jface.action.IAction;

import edu.hu.clickwatch.ClickWatchPluginActivator;
import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.ClickControlNodeConnection;
import edu.hu.clickwatch.model.MultiNode;
import edu.hu.clickwatch.model.MultiNodeNodeConnection;
import edu.hu.clickwatch.model.Node;

/**
 * Establish a connection to the remote node via the click control element.
 *  
 * @author zubow
 */
public class Connect extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (node_it == null) {
			return;
		}
		
		AbstractNodeConnection nodeConnection = null;
		while (node_it.hasNext()) {
			Node node = node_it.next();
			if (node.getConnection() == null || !node.isConnected()) {
				if (node instanceof MultiNode) {
					nodeConnection = ClickWatchPluginActivator.getInstance().getInjector().getInstance(MultiNodeNodeConnection.class);
				} else {
					nodeConnection = ClickWatchPluginActivator.getInstance().getInjector().getInstance(ClickControlNodeConnection.class);
				}
				node.setConnection(nodeConnection);
				nodeConnection.setUp(node);
				nodeConnection.connect(editor);
			} else {
				System.out.println("Already connected");
			}
		}
	}
}
