package de.hub.clickwatch.model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.merge.Merger;

public class UiNodeConnection extends AbstractNodeConnection {
	
	@Inject
	private Merger merger;
	private final HandlerModelAdapter modelChangeListener = new HandlerModelAdapter();

	@Override
	protected void updateNode(final Node updatedNodeCopy) {
		configuration.runInModelThread(new Runnable() {
			@Override
			public void run() {
				((ClickWatchNodeMergeConfiguration) merger.getConfiguration()).reset();
				modelChangeListener.setMode(HandlerModelAdapter.LISTEN_FOR_ADAPTER);
				merger.merge(getNode(), updatedNodeCopy);
				modelChangeListener.setMode(HandlerModelAdapter.LISTEN_FOR_USER);
				getNode().setConnected(true);
				configuration.registerModelChanges(UiNodeConnection.this, getNode(),
						((ClickWatchNodeMergeConfiguration) merger
								.getConfiguration()).getChanges());
			}
		});

	}
	
	@Override
	public void setUp(Node node) {
		super.setUp(node);
		((ClickWatchNodeMergeConfiguration)merger.getConfiguration()).setNode(node);
	}

	@Override
	public void connect(Object context) {
		if (!getNode().isConnected()) {
			getNode().eAdapters().add(modelChangeListener);
		}
		super.connect(context);
	}

	@Override
	public synchronized void disconnect() {
		getNode().eAdapters().remove(modelChangeListener);
		super.disconnect();
	}
	
	public final void propagateHandlerValueChangeToReality(Handler handler) {
		if (getNode().isConnected()) {
			configuration.runInExtraThread(new SetValueInRealityRunnable(
					handler));
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
				while (notifier != null && notifier instanceof EObject
						&& !(notifier instanceof Handler)) {
					notifier = ((EObject) notifier).eContainer();
				}
				if (notifier != null && notifier instanceof Handler) {
					Handler handler = (Handler) notifier;

					if (isNotificationChangingValue(notification)) {
						if (mode == LISTEN_FOR_USER) {
							handlerUserNotification(notification, handler);
						} else if (mode == LISTEN_FOR_ADAPTER) {
							handlerAdapterNotification(notification, handler);
						} else {
							Preconditions.checkState(false);
						}
					}
					if (ClickWatchModelPackage.eINSTANCE.getHandler_Watch()
							.equals(notification.getFeature())) {
						if (notification.getNewBooleanValue()) {
							((Element) handler.eContainer()).setWatch(true);
						}
					}
				}
			}

		}

		private boolean isNotificationChangingValue(Notification notification) {
			if (notification.getNotifier() instanceof Handler) {
				return notification.getFeature() == ClickWatchModelPackage.eINSTANCE
						.getHandler_Any()
						|| notification.getFeature() == ClickWatchModelPackage.eINSTANCE
								.getHandler_Mixed();
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

		public static final int LISTEN_FOR_USER = 0;

		public static final int LISTEN_FOR_ADAPTER = 1;

		public void setMode(int mode) {
			this.mode = mode;
		}
	};

}
