package edu.hu.clickwatch.server.node;

import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
//import org.osgi.service.log.LogService;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.inject.Inject;

import edu.hu.clickwatch.cdo.CDOHandler;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;

/**
 * The class is responsible for a connection to a single node. It holds the update interval
 * for a specific node, a list of filters as well as a connection to the database in order
 * to store handler values of a single node in a database. 
 * 
 * Storing values of a node in database is optional. If a database connection is not set, 
 * values of a node are written to a plain text file. 
 * 
 * @author Michael Frey, Markus Scheidgen
 */
public class ClickWatchServerNodeConnection {
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
	/** Access to the OSGi log service */
	//private LogService mLogService = null;
	/** An model adapter for a single node */
	private final HandlerModelAdapter mModelChangeListener = new HandlerModelAdapter(); 
	/** The element filter of a node */
	private String mElementFilter = "";
	/** The handler filter of a node */
	private String mHandlerFilter = "";
	/** The connection to a CDO database */
	private CDOHandler mDatabaseHandler;
	
	public ClickWatchServerNodeConnection(){
		// mLogService = ServerPluginActivator.getInstance().getLogService();
	}
	
	public ClickWatchServerNodeConnection(final CDOHandler pDatabaseHandler){
		super();
		this.mDatabaseHandler = pDatabaseHandler;
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
			//mLogService.log(LogService.LOG_WARNING, "Malformed Filter: " + "The " + pType + " filter is malformed. Ignoring filter.");
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
	
	public boolean removeFilter(String pFilter){
		// TODO: Implement method which removes a certain filter from the list
		return false;
	}
		
	/**
	 * 
	 */
	protected void sleepUntilNextUpdate() {
		try {
			Thread.sleep(mUpdateInterval);
		} catch (InterruptedException e) {
			Throwables.propagate(e);
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
				//mLogService.log(LogService.LOG_ERROR, "Exception " + e.getClass().getName() + " occurred: " + e.getMessage() + "."); 
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
				//	mLogService.log(LogService.LOG_ERROR, "Exception " + e.getClass().getName() + " occurred: " + e.getMessage() + ". Node is forced to disconnect."); 
				}
			}
		}).start();
	}
	
	public void runUpdate() {
		mNode.setRetrieving(true);
		// TODO: Does this really work?
		validateFilter(mElementFilter, "Element");
		validateFilter(mHandlerFilter, "Handler");
		final Node updatedNodeCopy = getNodeAdapter().retrieve(mElementFilter, mHandlerFilter);
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
		if(this.mDatabaseHandler != null){
		// Add content to the database
		this.mDatabaseHandler.openSession();
		this.mDatabaseHandler.openTransaction(updatedNodeCopy);
		this.mDatabaseHandler.commitTransaction();
		this.mDatabaseHandler.closeTransaction();
		this.mDatabaseHandler.closeSession();
		}
		EcoreUtil.delete(updatedNodeCopy, true);
		mNode.setRetrieving(false);
		sleepUntilNextUpdate();
	}
	
	/**
	 * Runnable used to write a handler value. Should be run in extra thread.
	 */
	private class SetValueInRealityRunnable implements Runnable {
		final Handler handler;

		public SetValueInRealityRunnable(Handler handler) {
			super();
			this.handler = handler;
		}

		@Override
		public void run() {
			if (getNodeAdapter().isConnected()) {
				getNodeAdapter().updateHandlerValue(handler);
			}
		}
	}
	
	protected void runInExtraThread(final Runnable runnable) {
		new Thread() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (final RuntimeException e) {
					runThread(new Runnable() {
						@Override
						public void run() {
						//	mLogService.log(LogService.LOG_ERROR, "Exception " + e.getClass().getName() + " occured: " + e.getMessage());
						}
					});
				}
			}
		}.start();
	}
	
	public final void propagateHandlerValueChangeToReality(Handler pHandler) {
		if (mNode.isConnected()) {
			runInExtraThread(new SetValueInRealityRunnable(pHandler));
		}
	}
	
	protected void runContinuousUpdate() {
		runInExtraThread(new ContinuousUpdateRunnable());
	}
	
	/**
	 * Connects to the remote node and starts continuous updates of the model
	 * with new data from the remote node.
	 * 
	 * @param editorPart
	 *            , the editor part to open message windows and to listen for
	 *            close to realise automatic disconnect on editor close.
	 */
	public void connect() {
		if (mNode.isConnected()) {
			return;
		}
		mNode.eAdapters().add(mModelChangeListener);
		runContinuousUpdate();
	}
	
	/**
	 * Disconnects from the remote note in the next possible moment.
	 */
	public synchronized void disconnect() {
		mNode.eAdapters().remove(mModelChangeListener);
		isScheduledForDisconnect = true;
	}

	/**
	 * EMF adapter used to listen to handler changes in the model. Is the value
	 * of handler changed, the value is also written to the handler in the real
	 * node.
	 */
	private class HandlerModelAdapter extends EContentAdapter {

		private int mode = LISTEN_FOR_USER;

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			if (notification.getEventType() != Notification.REMOVING_ADAPTER) {
				Object notifier = notification.getNotifier();
				if (notifier instanceof Node || notifier instanceof Element) {
					return;
				}
				while (notifier != null && 
						notifier instanceof EObject && !(notifier instanceof Handler)) {
					notifier = ((EObject)notifier).eContainer();
				}
				if (notifier != null && notifier instanceof Handler) {
					Handler handler = (Handler)notifier;
					
					if (isNotificationChangingValue(notification)) {
						if (mode == LISTEN_FOR_USER) {
							handlerUserNotification(notification, handler);
						} else if (mode == LISTEN_FOR_ADAPTER) {
							handlerAdapterNotification(notification, handler);
						} else {
							Preconditions.checkState(false);
						}
					}
					if (ClickWatchModelPackage.eINSTANCE.getHandler_Watch().equals(
							notification.getFeature())) {
						if (notification.getNewBooleanValue()) {
							((Element) handler.eContainer()).setWatch(true);
						}
					}	
				}
			}
			
		}
		
		private boolean isNotificationChangingValue(Notification notification) {
			if (notification.getNotifier() instanceof Handler) {
				return notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Any() ||
						notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Mixed();
			} else {
				return true;
			}
		}

		private void handlerAdapterNotification(Notification notification, Handler handler) {
			if (handler.isWatch() || ((Element) handler.eContainer()).isWatch()) {
				handler.setChanged(true);
			}
		}

		private void handlerUserNotification(Notification notification, Handler handler) {
			propagateHandlerValueChangeToReality(handler);
		}
		
		public static final int LISTEN_FOR_USER = 0;
		
		public static final int LISTEN_FOR_ADAPTER = 1;
		/*
		public void setMode(final int mode) {
			this.mode = mode;
		}*/
	};

	
	public boolean setHandlerFilter(final String pHandlerFilter){
		if(this.validateFilter(pHandlerFilter, "Handler")){
			mHandlerFilter = pHandlerFilter;
			return true;
		}
		return false;
	}
	
	public boolean setElementFilter(final String pElementFilter){
		if(this.validateFilter(pElementFilter, "Element")){
			mElementFilter = pElementFilter;
			return true;
		}
		return false;
	}

	public CDOHandler getDatabaseHandler() {
		return mDatabaseHandler;
	}

	public void setDatabaseHandler(final CDOHandler pDatabaseHandler) {
		this.mDatabaseHandler = pDatabaseHandler;
	}
}
