package de.hub.clickwatch.model;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;


public class ClickControlNodeConnection extends AbstractNodeConnection {
	
	@Inject
	private INodeAdapter nodeAdapter;

	@Override
	public INodeAdapter getNodeAdapter() {
		return nodeAdapter;
	}

	@Override
	public void setUp(Node node) {
		super.setUp(node);
		
		EObject eContainer = node.eContainer();
		int timeout = 6000;
		if (eContainer != null && eContainer instanceof Network) {
			timeout = ((Network)eContainer).getTimeout();
		}
		((AbstractNodeAdapter)nodeAdapter).setUp(node.getINetAddress(), node.getPort(), timeout);
	}
}
