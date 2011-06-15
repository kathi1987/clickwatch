package edu.hu.clickwatch.server.tests;

import com.google.inject.Inject;

import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeAdapter;
import edu.hu.clickwatch.server.node.ClickWatchServerNodeConnection;
import edu.hu.clickwatch.server.node.INodeAdapter;


public class ClickWatchServerNodeConnectionTest extends ClickWatchServerNodeConnection {
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
	
	@Override
	public void runInExtraThread(Runnable runnable) {
		runnable.run();
	}

	@Override
	protected void runContinuousUpdate() {
		// empty
	}

	@Override
	protected void sleepUntilNextUpdate() {
		// empty
	}
	
}
