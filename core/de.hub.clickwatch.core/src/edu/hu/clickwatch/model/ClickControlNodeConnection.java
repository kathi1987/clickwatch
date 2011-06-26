package edu.hu.clickwatch.model;

import com.google.inject.Inject;

import edu.hu.clickwatch.nodeadapter.AbstractNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

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
		((AbstractNodeAdapter)nodeAdapter).setUp(node.getINetAdress(), node.getPort());
	}
}
