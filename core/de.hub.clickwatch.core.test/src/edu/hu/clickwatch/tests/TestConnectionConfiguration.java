package edu.hu.clickwatch.tests;

import java.util.Collection;

import junit.framework.Assert;

import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.ChangeMark;
import edu.hu.clickwatch.model.IConnectionConfiguration;
import edu.hu.clickwatch.model.Node;

public class TestConnectionConfiguration implements IConnectionConfiguration {

	@Override
	public void runInExtraThread(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void runInModelThread(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void registerModelChanges(Node node, Collection<ChangeMark> changes) {
		// empty
	}

	@Override
	public void handleConnect(AbstractNodeConnection connection) {
		// empty
	}

	@Override
	public void handleDisconnect(AbstractNodeConnection connection) {
		// empty
	}

	@Override
	public void handleIncident(int type, String message) {
		Assert.assertTrue("unexpected behavious", false);
	}

}
