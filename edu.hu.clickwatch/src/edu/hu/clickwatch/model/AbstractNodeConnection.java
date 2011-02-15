package edu.hu.clickwatch.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import edu.hu.clickwatch.actions.Connect;
import edu.hu.clickwatch.actions.Disconnect;

/**
 * Instances of the class represent a connection the a remote node. These
 * objects function as interface between a node model element in an editor and a
 * real nodes in the network. Therefore, instances of this class communicate
 * between GUI-Thread and extra threads that run communication with the real
 * network node.
 * 
 * This is crucial! All interaction with the the editor model must be done
 * within the GUI-Thread using {@link #runInGUI(Runnable)} and all interaction
 * with the real node should be run in an extra thread using
 * {@link #runInExtraThread(Runnable)} to avoid GUI-freeze.
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
public abstract class AbstractNodeConnection {

	private Node node;
	private String elemFilter = null;
	private String handFilter = null;
	private final static int UPDATE_INTERVALL_DEFAULT = 5000;
	private int updateIntervall = UPDATE_INTERVALL_DEFAULT;
	
	private Adapter filterListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getNetwork_ElementFilter()) {
				elemFilter = notification.getNewStringValue();
			}
			if (notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getNetwork_HandlerFilter()) {
				handFilter = notification.getNewStringValue();
			}
			if (notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getNetwork_UpdateIntervall()) {
				updateIntervall = notification.getNewIntValue();
			}
		}
	};

	private IEditorPart editor = null;
	private boolean isScheduledForDisconnect = false;
	private boolean hasError = false;

	public void setUp(Node node) {
		Preconditions.checkNotNull(node);
		this.node = node;
	}

	protected abstract INodeAdapter getNodeAdapter();

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

	protected void runUpdate() {
		Node updatedNodeCopy = getNodeAdapter().retrieve(elemFilter, handFilter);
		runInGUI(new UpdateAllModelRunnable(updatedNodeCopy));
		runInGUI(new Runnable() {
			@Override
			public void run() {
				if (!node.isConnected()) {

				}
				node.setConnected(true);
			}
		});
		EcoreUtil.delete(updatedNodeCopy, true);
		try {
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
		final Object value;

		public SetValueInRealityRunnable(Handler handler, Object value) {
			super();
			this.handler = handler;
			this.value = value;
		}

		@Override
		public void run() {
			if (getNodeAdapter().isConnected()) {
				getNodeAdapter().updateHandlerValue(handler, value);
			}
		}
	}

	private void runInGUI(final Runnable runnable) {
		Display display = editor.getSite().getShell().getDisplay();
		display.asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (RuntimeException e) {
					hasError = true;
					MessageDialog.openError(editor.getSite().getShell(),
							"Exception", "Exception " + e.getClass().getName()
									+ " occured: " + e.getMessage()
									+ ". Node is forced to disconnect.");
					System.out.println("Exception " + e.getClass().getName()
							+ " occured:\n" + e.getMessage());
				}
			}
		});
	}

	private void runInExtraThread(final Runnable runnable) {
		new Thread() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (final RuntimeException e) {
					runInGUI(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openError(
									editor.getSite().getShell(), "Exception",
									"Exception " + e.getClass().getName()
											+ " occured: " + e.getMessage());
							System.out.println("Exception "
									+ e.getClass().getName() + " occured:\n"
									+ e.getMessage());
						}
					});
				}
			}
		}.start();
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

	private abstract static class ListUpdater<T> {

		ListUpdater(List<T> oldList, List<T> newList) {
			final Map<String, T> oldItemsMap = new HashMap<String, T>();
			ImmutableSet<String> items = ImmutableSet.copyOf(Lists.transform(
					oldList, new Function<T, String>() {
						@Override
						public String apply(T input) {
							String name = getName(input);
							oldItemsMap.put(name, input);
							return name;
						}
					}));
			final Map<String, T> newItemsMap = new HashMap<String, T>();
			ImmutableSet<String> updatedItemsCopy = ImmutableSet.copyOf(Lists
					.transform(newList, new Function<T, String>() {
						@Override
						public String apply(T input) {
							String name = getName(input);
							newItemsMap.put(name, input);
							return name;
						}
					}));
			for (String notLongerExistingItemName : Sets.difference(items,
					updatedItemsCopy)) {
				removeItem(oldItemsMap.get(notLongerExistingItemName));
			}
			for (String newItemName : Sets.difference(updatedItemsCopy, items)) {
				addItem(newItemsMap.get(newItemName));
			}
			for (T updatedItemCopy : newList) {
				for (T item : oldList) {
					if (getName(item).equals(getName(updatedItemCopy))) {
						update(item, updatedItemCopy);
					}
				}
			}
		}

		protected abstract void removeItem(T oldItem);

		protected abstract void addItem(T newItem);

		protected abstract void update(T oldItem, T newItem);

		protected abstract String getName(T item);
	}

	/**
	 * Runnable used to update the model with data retrieved from the real node.
	 * Should be run in GUI-Thread.
	 */
	private class UpdateAllModelRunnable implements Runnable {
		final Node updatedNodeCopy;

		public UpdateAllModelRunnable(Node updatedNodeCopy) {
			super();
			this.updatedNodeCopy = updatedNodeCopy;
		}
		
		class ElementListUpdater extends ListUpdater<Element> {
			
			public ElementListUpdater(List<Element> oldList, List<Element> newList) {
				super(oldList, newList);
			}

			@Override
			protected void removeItem(Element oldItem) {
				EcoreUtil.delete(oldItem, true);
			}

			@Override
			protected void addItem(Element newItem) {
				node.getElements().add(EcoreUtil.copy(newItem));
			}

			@Override
			protected String getName(Element item) {
				return item.getName();
			}

			@Override
			protected void update(final Element element,
					final Element updatedElementCopy) {
				new ElementListUpdater(element.getChildren(), updatedElementCopy.getChildren());
				new ListUpdater<Handler>(element.getHandlers(),
						updatedElementCopy.getHandlers()) {
					@Override
					protected void removeItem(Handler oldItem) {
						EcoreUtil.delete(oldItem);
					}

					@Override
					protected void addItem(Handler newItem) {
						element.getHandlers().add(EcoreUtil.copy(newItem));
					}

					@Override
					protected String getName(Handler item) {
						return item.getName();
					}

					@Override
					protected void update(Handler oldItem, Handler newItem) {
						ensureHandlerIsListening(oldItem);
						if (newItem.isCanRead()) {
							if (getNodeAdapter().determineHandlerHasChangedInReality(oldItem, newItem)) {
								propagateRemoteHandlerChangeToModel(
										oldItem, newItem.getValue());	
							}
						}
					}
				};
			}
		};

		@Override
		public void run() {
			new ElementListUpdater(node.getElements(),
					updatedNodeCopy.getElements());
		}
	}

	protected final void propagateHandlerValueChangeToReality(Handler handler,
			Object value) {
		if (node.isConnected()) {
			runInExtraThread(new SetValueInRealityRunnable(handler, value));
		}
	}

	/**
	 * EMF adapter used to listen to handler changes in the model. Is the value
	 * of handler changed, the value is also written to the handler in the real
	 * node.
	 */
	private class HandlerModelAdapter extends EContentAdapter {

		private boolean enabled = true;

		@Override
		public void notifyChanged(Notification msg) {
			if (enabled && msg.getEventType() != Notification.REMOVING_ADAPTER) {
				Object notifier = msg.getNotifier();
				while (notifier != null && 
						notifier instanceof EObject && !(notifier instanceof Handler)) {
					notifier = ((EObject)notifier).eContainer();
				}
				if (notifier != null && notifier instanceof Handler) {
					Handler handler = (Handler)notifier;
					
					if (getNodeAdapter().determineHandlerHasChangedInModel(msg)) {
						propagateHandlerValueChangeToReality(handler, handler.getValue());
					}
					if (ClickWatchModelPackage.eINSTANCE.getHandler_Watch().equals(
							msg.getFeature())) {
						if (msg.getNewBooleanValue()) {
							((Element) handler.eContainer()).setWatch(true);
						}
					}	
				}
			}
		}

		public void disable() {
			enabled = false;
		}

		public void enable() {
			enabled = true;
		}
	};
	
	private final HandlerModelAdapter modelChangeListener = new HandlerModelAdapter();

	private void ensureHandlerIsListening(Handler handler) {
		handler.eAdapters().remove(modelChangeListener);
		handler.eAdapters().add(modelChangeListener);
	}

	/**
	 * @param handler
	 *            , the handler within the model.
	 */
	protected final void propagateRemoteHandlerChangeToModel(final Handler handler,
			final AnyType value) {
		runInGUI(new Runnable() {
			@Override
			public void run() {
				modelChangeListener.disable();

				if (handler.isWatch() || ((Element) handler.eContainer()).isWatch()) {
					handler.setChanged(!value.equals(handler.getValue()));
				}
				handler.setValue(value);
				
				modelChangeListener.enable();
			}
		});

	}

	/**
	 * Connects to the remote node and starts continuous updates of the model
	 * with new data from the remote node.
	 * 
	 * @param editorPart
	 *            , the editor part to open message windows and to listen for
	 *            close to realise automatic disconnect on editor close.
	 */
	public void connect(IEditorPart editorPart) {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService()
				.addPartListener(closeListener);
		this.editor = editorPart;

		if (node.isConnected()) {
			return;
		}
		Network network = getNetwork(node);
		network.eAdapters().add(filterListener);
		elemFilter = network.getElementFilter();
		handFilter = network.getHandlerFilter();
		updateIntervall = network.getUpdateIntervall();
		runContinuousUpdate();
	}
	
	private Network getNetwork(Node node) {
		EObject container = node.eContainer();
		if (container instanceof Network) {
			return (Network)container;
		} else if (container instanceof Node) {
			return getNetwork((Node)container);
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
		getNetwork(node).eAdapters().remove(filterListener);
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
}
