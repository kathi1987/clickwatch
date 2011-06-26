package edu.hu.clickwatch.model;

import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import edu.hu.clickwatch.actions.Connect;
import edu.hu.clickwatch.actions.Disconnect;
import edu.hu.clickwatch.merge.Merger;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.util.Throwables;
import edu.hu.clickwatch.util.UiThreadder;

/**
 * Instances of the class represent a connection the a remote node. These
 * objects function as interface between a node model element in an editor and a
 * real nodes in the network. Therefore, instances of this class communicate
 * between GUI-Thread and extra threads that run communication with the real
 * network node.
 * 
 * This is crucial! All interaction with the the editor model must be done
 * within the GUI-Thread using {@link UiThreadder#runInGUI(Runnable)} and all interaction
 * with the real node should be run in an extra thread using
 * {@link UiThreadder#runInExtraThread(Runnable)} to avoid GUI-freeze.
 * 
 * Node connections are designed to be a transient property of the model class
 * {@link Node}. This allows actions bind to model elements to access instances
 * of this class and use the public interface of this class to realize the
 * actions. Examples for actions are {@link Connect}, {@link Disconnect}, ...
 * 
 * Once connected, instances of this class will retrieve the current
 * configuration from the node continuously. Thus the model is updated
 * continuously.
 * 
 * Once a node connection is {@link #setUp(IEditorPart, Node)} and connected, it
 * is listening to the editor containing the model and will disconnect on editor
 * close automatically.
 * 
 * Once a node connection is established it will listen to all the handler model
 * elements in the editor for changes to handler values. Handler value changes
 * are automatically propagated to the real node in the network.
 * 
 * @author Markus Scheidgen
 * 
 */
public abstract class AbstractNodeConnection extends UiThreadder {

	private Node node;
	private final static int UPDATE_INTERVALL_DEFAULT = 5000;
	
	private ClickWatchModelEditor editor = null;
	
	private boolean isScheduledForDisconnect = false;
	private boolean hasError = false;
	
	private final HandlerModelAdapter modelChangeListener = new HandlerModelAdapter(); 
	
	@Inject Merger merger;

	private boolean validateFilter(String newFilter, String type) {
		if ( newFilter == null || newFilter.trim().equals("") ) {
			return true;	
		}
		
		try {
			java.util.regex.Pattern.compile(newFilter);
		} catch (PatternSyntaxException pe) {
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
			 "Malformed Filter", "The " + type + " filter is malformed. Ignoring filter.");
			return false;
		}
		return true;
	}

	public void setUp(Node node) {
		Preconditions.checkNotNull(node);
		this.node = node;
		((ClickWatchNodeMergeConfiguration)merger.getConfiguration()).setNode(node);
	}

	public abstract INodeAdapter getNodeAdapter();

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
				runInGUI(new Runnable() {
					@Override
					public void run() {
						showMessage("Exception", "Exception " + ex.getClass().getName()
								+ " occured: " + ex.getMessage());
					}
				});
				System.out.println("Exception " + ex.getClass().getName()
						+ " occured:\n" + ex.getMessage());
			} finally {
				getNodeAdapter().disconnect();
				runInGUI(new Runnable() {
					@Override
					public void run() {
						node.setConnected(false);
					}
				});
			}
		}
	}

	public void runUpdate() {
		node.setRetrieving(true);
		String elemFilter = getNetwork().getElementFilter();
		String handFilter = getNetwork().getHandlerFilter();
		validateFilter(elemFilter, "element");
		validateFilter(elemFilter, "handler");
		final Node updatedNodeCopy = getNodeAdapter().retrieve(elemFilter, handFilter);
		runInGUI(new Runnable() {
			@Override
			public void run() {
				((ClickWatchNodeMergeConfiguration)merger.getConfiguration()).reset();
				modelChangeListener.setMode(HandlerModelAdapter.LISTEN_FOR_ADAPTER);
				merger.merge(node, updatedNodeCopy);
				modelChangeListener.setMode(HandlerModelAdapter.LISTEN_FOR_USER);
				node.setConnected(true);
				if (editor != null) { // editor can be null in tests
					editor.markChanges(node, ((ClickWatchNodeMergeConfiguration)
							merger.getConfiguration()).getChanges());
				}
			}
		});
		EcoreUtil.delete(updatedNodeCopy, true);
		node.setRetrieving(false);
		sleepUntilNextUpdate();
	}
	
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

	@Override
	protected Display getDisplay() {
		return editor.getSite().getShell().getDisplay();
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

	public final void propagateHandlerValueChangeToReality(Handler handler) {
		if (node.isConnected()) {
			runInExtraThread(new SetValueInRealityRunnable(handler));
		}
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
		
		public void setMode(int mode) {
			this.mode = mode;
		}
	};

	/**
	 * Connects to the remote node and starts continuous updates of the model
	 * with new data from the remote node.
	 * 
	 * @param editorPart
	 *            , the editor part to open message windows and to listen for
	 *            close to realise automatic disconnect on editor close.
	 */
	public void connect(IEditorPart editorPart) {
		installPartListener(closeListener);
		this.editor = (ClickWatchModelEditor)editorPart;

		if (node.isConnected()) {
			return;
		}
		node.eAdapters().add(modelChangeListener);
		runContinuousUpdate();
	}
	
	private Network getNetwork() {
		EObject container = node.eContainer();
		if (container instanceof Network) {
			return (Network)container;
		} else {
			Preconditions.checkArgument(false, "Node must be contained in a network");
			return null;
		}
	}

	protected void runContinuousUpdate() {
		runInExtraThread(new ContinuousUpdateRunnable());
	}

	/**
	 * Disconnects from the remote note in the next possible moment.
	 */
	public synchronized void disconnect() {
		unInstallPartListener(closeListener);
		node.eAdapters().remove(modelChangeListener);
		isScheduledForDisconnect = true;
	}

	private final IPartListener closeListener = new IPartListener() {

		@Override
		public void partActivated(IWorkbenchPart part) {

		}

		@Override
		public void partBroughtToTop(IWorkbenchPart part) {

		}

		@Override
		public void partClosed(IWorkbenchPart part) {
			if (editor == part) {
				disconnect();
			}
		}

		@Override
		public void partDeactivated(IWorkbenchPart part) {

		}

		@Override
		public void partOpened(IWorkbenchPart part) {

		}

	};

	protected Node getNode() {
		return node;
	}
	
	protected void installPartListener(IPartListener listener) {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(closeListener);
	}
	
	protected void unInstallPartListener(IPartListener listener) {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().removePartListener(closeListener);
	}
}
