package edu.hu.clickwatch.server;

import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.LogService;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.inject.Inject;

import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

/**
 * The class is responsible for a connection to a single node. It holds the update interval
 * for a specific node, a list of filters as well as a connection to the database in order
 * to store handler values of a single node
 * 
 * @author Michael Frey, Markus Scheidgen
 */
public class NodeConnection {
	/** Update interval to a node */
	private long mUpdateInterval = 5000;
	/** Connection is scheduled for disconnect */ 
	private boolean isScheduledForDisconnect = false;
	/** The connected node */ 
	private Node mNode;
	/** Indicates if an error has occured */ 
	private boolean mHasError = false;
	/** A node adapter which holds the actual connection to a node */
	@Inject
	private INodeAdapter mNodeAdapter;	
	/** A list with filters for a single node */
	private ArrayList<String> mFilterList;
	/** Access to the OSGi log service */
	private LogService mLogService = null;
	
	public NodeConnection(){
		mLogService = ServerPluginActivator.getInstance().getLogService();
	}
	
	public long getUpdateInterval() {
		return mUpdateInterval;
	}

	public void setUpdateInterval(final long pUpdateInterval) {
		this.mUpdateInterval = pUpdateInterval;
	}
	
	private boolean validateFilter(final String pNewFilter, final String pType) {
		if(pNewFilter == null || pNewFilter.trim().equals("")) {
			return true;	
		}
		
		try {
			java.util.regex.Pattern.compile(pNewFilter);
		} catch (PatternSyntaxException pe) {
			mLogService.log(LogService.LOG_WARNING, "Malformed Filter: " + "The " + pType + " filter is malformed. Ignoring filter.");
			return false;
		}
		return true;
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
		return isScheduledForDisconnect || mHasError;
	}
	
	protected Node getNode() {
		return mNode;
	}
	
	public void setUp(Node pNode) {
		Preconditions.checkNotNull(pNode);
		this.mNode = pNode;
	}

	public INodeAdapter getNodeAdapter() {
		return mNodeAdapter;
	}

	
	public boolean setFilter(String pFilter, String pType){
		if(this.validateFilter(pFilter, pType)){
			// TODO: This should be fixed to an hashmap, otherwise the type information gets lost
			this.mFilterList.add(pFilter);
			
		}	
		return false;
	}
	
	public boolean removeFilter(String pFilter){
		// TODO: Implement method which removes a certain filter from the list
		return false;
	}
		
	/**
	 * 
	 */
	protected void sleepUntilNextUpdate() {
		try {
			long updateIntervall = getNetwork().getUpdateIntervall();
			if (updateIntervall == 0) {
				Thread.sleep(mUpdateInterval);
			} else {
				Thread.sleep(updateIntervall);
			}
		} catch (InterruptedException e) {
			Throwables.propagate(e);
		}
	}
	
	/**
	 * 
	 */
	private Network getNetwork() {
		EObject container = this.mNode.eContainer();
		if (container instanceof Network) {
			return (Network)container;
		} else {
			Preconditions.checkArgument(false, "Node must be contained in a network");
			return null;
		}
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
			} catch (final Exception e) {
				mLogService.log(LogService.LOG_ERROR, "Exception " + e.getClass().getName() + " occurred: " + e.getMessage() + "."); 
			} finally {
				getNodeAdapter().disconnect();
				runThread(new Runnable() {
					@Override
					public void run() {
						mNode.setConnected(false);
					}
				});
			}
		}
	}
	
	protected void runThread(final Runnable runnable) {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (RuntimeException e) {
					mHasError = true;
					mLogService.log(LogService.LOG_ERROR, "Exception " + e.getClass().getName() + " occurred: " + e.getMessage() + ". Node is forced to disconnect."); 
				}
			}
		}).start();
	}
	
	public void runUpdate() {
		mNode.setRetrieving(true);
		String elemFilter = getNetwork().getElementFilter();
		String handFilter = getNetwork().getHandlerFilter();
		validateFilter(elemFilter, "Element");
		validateFilter(handFilter, "Handler");
		final Node updatedNodeCopy = getNodeAdapter().retrieve(elemFilter, handFilter);
		runThread(new Runnable() {
			@Override
			public void run() {
				/*
				((ClickWatchNodeMergeConfiguration)merger.getConfiguration()).reset();
				modelChangeListener.setMode(HandlerModelAdapter.LISTEN_FOR_ADAPTER);
				merger.merge(mNode, updatedNodeCopy);
				modelChangeListener.setMode(HandlerModelAdapter.LISTEN_FOR_USER);
				*/
				mNode.setConnected(true);
			}
		});
		EcoreUtil.delete(updatedNodeCopy, true);
		mNode.setRetrieving(false);
		sleepUntilNextUpdate();
	}
}
