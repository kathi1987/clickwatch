package edu.hu.clickwatch.model;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

public class MultiNodeNodeConnection extends AbstractNodeConnection {

	@Inject
	private MultiNodeAdapter nodeAdapter;

	@Override
	protected INodeAdapter getNodeAdapter() {
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
