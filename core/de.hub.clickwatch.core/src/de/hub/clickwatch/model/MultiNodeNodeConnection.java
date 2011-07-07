package de.hub.clickwatch.model;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.model.MultiNode;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.nodeadapter.MultiNodeAdapter;


public class MultiNodeNodeConnection extends UiNodeConnection {

	@Inject
	private MultiNodeAdapter nodeAdapter;

	@Override
	public INodeAdapter getNodeAdapter() {
		return nodeAdapter;
	}

	@Override
	public void setUp(Node node) {
		Preconditions.checkArgument(node instanceof MultiNode);
		super.setUp(node);
		nodeAdapter.setUp((MultiNode) node);
	}

	// TODO override runContinuousUpdate. A MultiNodeNodeConnection should
	// listen to changes in the model rather than update all 3 seconds

}
