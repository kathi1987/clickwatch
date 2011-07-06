package de.hub.clickwatch.model;

import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.util.Throwables;

/**
 * Instances of this class represent a connection to a remote node. It uses a
 * {@link Node} to configure this connection. It takes the node address, port,
 * the containing {@link Network} and its update value, timeout and filter into
 * account.
 * 
 * This class uses a {@link INodeAdapter} to retrieve new copies of the remote
 * Node. Concrete implementations have to decide what is to do with these
 * copies.
 * 
 * Remote node copies are retrieved continuously, until the connection is
 * disconnected.
 * 
 * An {@link IConnectionConfiguration} is used to execute different actions in
 * different threads. Anything concerning the node is done in the "gui"-thread.
 * Retrieval of remote copies is done in an "extra thread".
 */
public abstract class AbstractNodeConnection {

	@Inject
	private INodeAdapter nodeAdapter;
	@Inject
	protected IConnectionConfiguration configuration;

	private Node node;
	public final static int UPDATE_INTERVALL_DEFAULT = 5000;

	private boolean isScheduledForDisconnect = false;
	private boolean hasError = false;

	private boolean validateFilter(String newFilter, String type) {
		if (newFilter == null || newFilter.trim().equals("")) {
			return true;
		}

		try {
			java.util.regex.Pattern.compile(newFilter);
		} catch (PatternSyntaxException pe) {
			configuration.handleIncident(IConnectionConfiguration.ERROR, "The "
					+ type + " filter is malformed. Ignoring filter.");
			return false;
		}
		return true;
	}

	public void setUp(Node node) {
		Preconditions.checkNotNull(node);
		this.node = node;
	}

	/**
	 * Runnable for retrieving the current configuration of a node and updating
	 * the model with this configuration continuously. Should be run in extra
	 * thread.
	 */
	private class ContinuousUpdateRunnable implements Runnable {
		@Override
		public void run() {
			try {
				if (!getNodeAdapter().isConnected()) {
					getNodeAdapter().connect();
				}
				while (!isScheduledForDisconnect()) {
					runUpdate();
				}
			} catch (final Exception ex) {
				configuration.runInModelThread(new Runnable() {
					@Override
					public void run() {
						configuration.handleIncident(
								IConnectionConfiguration.ERROR, "Exception "
										+ ex.getClass().getName()
										+ " occured: " + ex.getMessage());
					}
				});
				System.out.println("Exception " + ex.getClass().getName()
						+ " occured:\n" + ex.getMessage());
			} finally {
				getNodeAdapter().disconnect();
				configuration.runInModelThread(new Runnable() {
					@Override
					public void run() {
						node.setConnected(false);
					}
				});
				cleanUp();
			}
		}
	}

	/**
	 * Gets a new remote node copy, forwards it to
	 * {@link AbstractNodeConnection#updateNode(Node)} and sleeps until
	 * disconnect or the next update.
	 */
	public final void runUpdate() {
		node.setRetrieving(true);
		String elemFilter = getNetwork().getElementFilter();
		String handFilter = getNetwork().getHandlerFilter();
		validateFilter(elemFilter, "element");
		validateFilter(elemFilter, "handler");
		final Node updatedNodeCopy = getNodeAdapter().retrieve(elemFilter,
				handFilter);

		updateNode(updatedNodeCopy);

		node.setRetrieving(false);
		sleepUntilNextUpdate();
	}

	/**
	 * Specific implementations of this class can use this callback to do
	 * something with the remote node copy in each update.
	 * 
	 * @param updatedNodeCopy is the remote node copy.
	 */
	protected abstract void updateNode(final Node updatedNodeCopy);

	protected void sleepUntilNextUpdate() {
		try {
			int updateIntervall = getNetwork().getUpdateIntervall();
			if (updateIntervall == 0) {
				Thread.sleep(UPDATE_INTERVALL_DEFAULT);
			} else {
				Thread.sleep(updateIntervall);
			}
		} catch (InterruptedException e) {
			Throwables.propagate(e);
		}
	}

	/**
	 * Instances of this class do not disconnect directly on user request, but
	 * schedule a disconnect. The next time the updating thread is awake it will
	 * disconnect.
	 * 
	 * @return true, iff this instance should disconnect in the next possible
	 *         moment.
	 */
	private synchronized boolean isScheduledForDisconnect() {
		return isScheduledForDisconnect || hasError;
	}

	/**
	 * Connects to the remote node and starts continuous updates of the model
	 * with new data from the remote node.
	 * 
	 * @param context
	 *            is forwarded to {@link IConnectionConfiguration} and allows
	 *            context specific configuration behavior.
	 */
	public void connect(Object context) {
		configuration.handleConnect(this, context);

		if (node.isConnected()) {
			return;
		}

		runContinuousUpdate();
	}

	private Network getNetwork() {
		EObject container = node.eContainer();
		if (container instanceof Network) {
			return (Network) container;
		} else {
			Preconditions.checkArgument(false,
					"Node must be contained in a network");
			return null;
		}
	}

	protected void runContinuousUpdate() {
		configuration.runInExtraThread(new ContinuousUpdateRunnable());
	}

	/**
	 * Disconnects from the remote note in the next possible moment.
	 */
	public synchronized void disconnect() {
		configuration.handleDisconnect(this);
		isScheduledForDisconnect = true;
	}
	
	/**
	 * Runs after disconnect is called and the update runnable is finished.
	 */
	protected void cleanUp() {
		// emtpy
	}

	protected Node getNode() {
		return node;
	}

	public INodeAdapter getNodeAdapter() {
		return nodeAdapter;
	}
}
