package de.hub.clickwatch.ui.connection;

import java.util.regex.PatternSyntaxException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickwatch.connection.NodeConnection;
import de.hub.clickwatch.connection.adapter.AbstractAdapter;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.ui.ClickWatchUIModule;
import de.hub.clickwatch.ui.util.IUIContext;
import de.hub.clickwatch.util.Throwables;

public class UiNodeConnection extends NodeConnection {

	@Inject 
	private MergingNodeAdapter mergingNodeAdapter;
	@Inject
	private IUIContext uiContext;
	@Inject
	@Named(ClickWatchUIModule.DEFAULT_UPDATE_INTERVAL)
	private int defaultUpdateInterval;
	
	private final HandlerModelAdapter modelChangeListener = new HandlerModelAdapter();
	
	private boolean isScheduledForDisconnect = false;
	private boolean hasError = false;
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapterClass) {
		if (adapterClass == MergingNodeAdapter.class) {
			init((AbstractAdapter)mergingNodeAdapter);
			return (T)mergingNodeAdapter;
		} else {
			return super.getAdapter(adapterClass);
		}
	}
	
	@Override
	protected void clearAllCaches() {
		super.clearAllCaches();
		mergingNodeAdapter.clearCaches();
	}

	private boolean validateFilter(String newFilter, String type) {
		if (newFilter == null || newFilter.trim().equals("")) {
			return true;
		}

		try {
			java.util.regex.Pattern.compile(newFilter);
		} catch (PatternSyntaxException pe) {
			uiContext.openError("Error", "The " + type + " filter is malformed. Ignoring filter.");
			return false;
		}
		return true;
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
				if (!isConnected()) {
					UiNodeConnection.super.connect();
				}
				while (!isScheduledForDisconnect()) {
					runUpdate();
				}
			} catch (final Exception ex) {
				uiContext.runInGUI(new Runnable() {
					@Override
					public void run() {
						uiContext.openError("Error", "Exception "
								+ ex.getClass().getName()
								+ " occured: " + ex.getMessage());
					}
				});
				System.out.println("Exception " + ex.getClass().getName() + " occured:\n" + ex.getMessage());
			} finally {
				UiNodeConnection.super.disconnect();
				uiContext.runInGUI(new Runnable() {
					@Override
					public void run() {
						node.setConnected(false);
					}
				});
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
		if (getNetwork() != null) {
			String elemFilter = getNetwork().getElementFilter();
			String handFilter = getNetwork().getHandlerFilter();
			validateFilter(elemFilter, "element");
			validateFilter(handFilter, "handler");	
		}
		
		getAdapter(MergingNodeAdapter.class).pullAndMergeHandlerValues(node);
		
		node.setRetrieving(false);
		sleepUntilNextUpdate();
	}

	private void sleepUntilNextUpdate() {
		try {
			int updateIntervall = 0;
			if (getNetwork() != null) {
				updateIntervall = getNetwork().getUpdateIntervall();
			}
			if (updateIntervall == 0) {
				Thread.sleep(defaultUpdateInterval);
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

	private Network getNetwork() {
		EObject container = node.eContainer();
		if (container instanceof Network) {
			return (Network) container;
		} else {
			return null;
		}
	}
	
	@Override
	public void connect() {
		if (!node.isConnected()) {
			node.eAdapters().add(modelChangeListener);
		}
		if (node.isConnected()) {
			return;
		}
		node.setConnected(true);
		
		IWorkbench workbench = uiContext.getAdapter(IWorkbench.class);
		if (workbench != null) {
			closeListener = new MyPartListener();
			workbench.getActiveWorkbenchWindow().getPartService().addPartListener(closeListener);
		}
		uiContext.runInExtraThread(new ContinuousUpdateRunnable());
	}
	
	@Override
	public void disconnect() {
		node.eAdapters().remove(modelChangeListener);
		IWorkbench workbench = uiContext.getAdapter(IWorkbench.class);
		if (workbench != null) {
			workbench.getActiveWorkbenchWindow().getPartService().removePartListener(closeListener);
			closeListener = null;
		}
		isScheduledForDisconnect = true;
		node.setConnected(false);
	}
	
	public final void propagateHandlerValueChangeToReality(Handler handler) {
		if (node.isConnected()) {
			uiContext.runInExtraThread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
			});
		}
	}
	
	/**
	 * EMF adapter used to listen to handler changes in the model. Is the value
	 * of handler changed, the value is also written to the handler in the real
	 * node.
	 */
	private class HandlerModelAdapter extends EContentAdapter {

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			if (notification.getEventType() != Notification.REMOVING_ADAPTER) {
				Object notifier = notification.getNotifier();
				if (notifier instanceof Node || notifier instanceof Element) {
					return;
				}
				while (notifier != null && notifier instanceof EObject
						&& !(notifier instanceof Handler)) {
					notifier = ((EObject) notifier).eContainer();
				}
				if (notifier != null && notifier instanceof Handler) {
					Handler handler = (Handler) notifier;

					if (isNotificationChangingValue(notification)) {
						if (!node.isRetrieving()) {
							handlerUserNotification(notification, handler);
						} else {	
							handlerAdapterNotification(notification, handler);
						}
					}
					if (ClickWatchModelPackage.eINSTANCE.getHandler_Watch().equals(notification.getFeature())) {
						if (notification.getNewBooleanValue()) {
							((Element) handler.eContainer()).setWatch(true);
						}
					}
				}
			}

		}

		private boolean isNotificationChangingValue(Notification notification) {
			if (notification.getNotifier() instanceof Handler) {
				return notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Any()
						|| notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Mixed();
			} else {
				return true;
			}
		}

		private void handlerAdapterNotification(Notification notification,
				Handler handler) {
			if (handler.isWatch() || ((Element) handler.eContainer()).isWatch()) {
				handler.setChanged(true);
			}
		}

		private void handlerUserNotification(Notification notification,
				Handler handler) {
			propagateHandlerValueChangeToReality(handler);
		}

	};
	
	private IPartListener closeListener = null;
			
	private class MyPartListener implements IPartListener {
		
		private IWorkbenchPart part = null;
		
		MyPartListener() {
			part = uiContext.getAdapter(ClickWatchModelEditor.class);
		}
		

		@Override
		public void partActivated(IWorkbenchPart part) {

		}

		@Override
		public void partBroughtToTop(IWorkbenchPart part) {

		}

		@Override
		public void partClosed(IWorkbenchPart part) {
			if (this.part == part) {
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

}
