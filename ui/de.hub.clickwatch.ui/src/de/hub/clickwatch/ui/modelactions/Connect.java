package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.PluginActivator;
import de.hub.clickwatch.ui.connection.UiHandlerEventListener;

/**
 * Establish a connection to the remote node via the click control element.
 */
public class Connect extends AbstractNodeAction {
	
	@Inject INodeConnectionProvider ncp;
	@Inject Provider<UiHandlerEventListener> handlerProvider;

	@Override
	public void run(IAction action) {
		if (selectedObjectsIterator == null) {
			return;
		}
		
		while (selectedObjectsIterator.hasNext()) {
			Node node = selectedObjectsIterator.next();
			INodeConnection nodeConnection = node.getConnection();
			if (nodeConnection == null) {
				INodeConnectionProvider ncp = PluginActivator.getInstance().getInjector().getInstance(INodeConnectionProvider.class);
				nodeConnection = ncp.createConnection(node);
				node.setConnection(nodeConnection);							
			}
			
			IHandlerEventAdapter hea = nodeConnection.getAdapter(IHandlerEventAdapter.class);
			UiHandlerEventListener handler = handlerProvider.get();
			handler.init(shell, node);
			hea.addEventListener(handler);
			
			if (node.eContainer() != null && node.eContainer() instanceof Network) {
				Network network = (Network) node.eContainer();					
				String elementFilter = network.getElementFilter() == null? "" : network.getElementFilter();
				String handlerFilter = network.getHandlerFilter() == null ? "" : network.getHandlerFilter();
				hea.start(elementFilter, handlerFilter);	
			} else {
				hea.start();
			}
			
			node.setConnected(true);
		}
	}
}
