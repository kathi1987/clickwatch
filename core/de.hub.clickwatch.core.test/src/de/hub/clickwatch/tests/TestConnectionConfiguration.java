package de.hub.clickwatch.tests;

import java.util.Collection;

import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.ChangeMark;
import de.hub.clickwatch.model.IConnectionConfiguration;
import de.hub.clickwatch.model.Node;

import junit.framework.Assert;


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
	public void registerModelChanges(AbstractNodeConnection connection, Node node, Collection<ChangeMark> changes) {
		// empty
	}

	@Override
	public void handleConnect(AbstractNodeConnection connection, Object context) {
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
