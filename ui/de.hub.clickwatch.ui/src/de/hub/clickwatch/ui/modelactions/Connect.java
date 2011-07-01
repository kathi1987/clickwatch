package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.PlatformUI;

import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.ClickControlNodeConnection;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.PluginActivator;

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
				nodeConnection = PluginActivator.getInstance().getInjector().getInstance(ClickControlNodeConnection.class);
				node.setConnection(nodeConnection);
				nodeConnection.setUp(node);
				nodeConnection.connect(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor());
			} else {
				System.out.println("Already connected");
			}
		}
	}
}
