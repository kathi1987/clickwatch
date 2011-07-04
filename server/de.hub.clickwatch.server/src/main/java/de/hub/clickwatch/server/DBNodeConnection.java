package de.hub.clickwatch.server;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;

public class DBNodeConnection extends AbstractNodeConnection {

	@Override
	public void setUp(Node node) {
		super.setUp(node);
		
		EObject eContainer = node.eContainer();
		int timeout = 6000;
		if (eContainer != null && eContainer instanceof Network) {
			timeout = ((Network)eContainer).getTimeout();
		}
		((AbstractNodeAdapter)getNodeAdapter()).setUp(node.getINetAddress(), node.getPort(), timeout);
	}
}
