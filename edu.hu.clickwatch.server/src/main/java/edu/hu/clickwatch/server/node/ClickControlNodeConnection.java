package edu.hu.clickwatch.server.node;

import com.google.inject.Inject;

import edu.hu.clickwatch.model.Node;

public class ClickControlNodeConnection extends ClickWatchServerNodeConnection {
	@Inject
	private INodeAdapter nodeAdapter;

	@Override
	public INodeAdapter getNodeAdapter() {
		return nodeAdapter;
	}

	@Override
	public void setUp(Node node) {
		super.setUp(node);
		((ClickWatchServerNodeAdapter)nodeAdapter).setUp(node.getINetAdress(), node.getPort());
	}	
}
