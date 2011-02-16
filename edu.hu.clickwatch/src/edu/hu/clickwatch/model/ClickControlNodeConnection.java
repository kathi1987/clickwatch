package edu.hu.clickwatch.model;

import com.google.inject.Inject;

import edu.hu.clickwatch.nodeadapter.ClickControlNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class ClickControlNodeConnection extends AbstractNodeConnection {
	
	@Inject
	private ClickControlNodeAdapter nodeAdapter;

	@Override
	public INodeAdapter getNodeAdapter() {
		return nodeAdapter;
	}

	@Override
	public void setUp(Node node) {
		super.setUp(node);
		nodeAdapter.setUp(node.getINetAdress(), node.getPort());
	}
}
