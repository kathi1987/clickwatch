package edu.hu.clickwatch.model;

import com.google.inject.Inject;

public class ClickControlNodeConnection extends AbstractNodeConnection {
	
	@Inject
	private ClickControlNodeAdapter nodeAdapter;

	@Override
	protected INodeAdapter getNodeAdapter() {
		return nodeAdapter;
	}

	@Override
	public void setUp(Node node) {
		super.setUp(node);
		nodeAdapter.setUp(node.getINetAdress(), node.getPort());
	}
}
