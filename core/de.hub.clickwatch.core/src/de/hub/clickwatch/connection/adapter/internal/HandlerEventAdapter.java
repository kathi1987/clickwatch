package de.hub.clickwatch.connection.adapter.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.HandlerUtil;

public class HandlerEventAdapter extends AbstractAdapter implements IHandlerEventAdapter {
	
	@SuppressWarnings("rawtypes") // otherwise inject won't work
	@Inject @Named(ClickWatchModule.CS_IGNORED_HANDLER_NAMES) private Collection commonHandler;
	@Inject @Named(ClickWatchModule.I_REMOTE_UPDATE_PERIOD) private int removeUpdatePeriod;
	private Configuration config = null;
	private ScheduledFuture<?> listenFuture = null;
	private Semaphore listeningSemaphore = new Semaphore(1);
	
	@Inject private ScheduledExecutorService ses;
	@Inject private ExecutorService es;
	@Inject private TaskQueues taskDispatcher;
	
	private final Collection<IHandlerEventListener> eventListeners = new ArrayList<IHandlerEventListener>();
		
	private class Configuration {
		Collection<Handler> configuredHandlers;
		String elementFilter, handlerFilter;
		
		Configuration(String elementFilter, String handlerFilter) {
			super();
			Preconditions.checkArgument(elementFilter != null && handlerFilter != null);
			configuredHandlers = null;
			this.elementFilter = elementFilter;
			this.handlerFilter = handlerFilter;
		}

		Configuration(Collection<Handler> configuredHandlers) {
			super();
			this.configuredHandlers = configuredHandlers;
			this.elementFilter = null;
			this.handlerFilter = null;
		}
		
		@SuppressWarnings("unchecked")
		Collection<Handler> getConfiguredHandlers() {
			if (configuredHandlers == null) {
				if (elementFilter == null || handlerFilter == null) {
					configuredHandlers = Collections.EMPTY_LIST;
				} else {
					IMetaDataAdapter mda = connection.getAdapter(IMetaDataAdapter.class);
					Node metaData = mda.pullAllMetaData();
					metaData.filter(elementFilter, handlerFilter);
					configuredHandlers = metaData.getAllHandlers();
				}
			}
			return configuredHandlers;
		}
	}
	
	@Override
	public synchronized void start(Collection<Handler> configuredHandler) {
		config = new Configuration(configuredHandler);
		startListening();
	}
	
	@Override
	public synchronized void start(String elementFilter, String handlerFilter) {
		config = new Configuration(elementFilter, handlerFilter);
		startListening();
	}
	
	@Override
	public void start() {
		start("", "");
	}
	
	private synchronized void startListening() {
		if (listeningSemaphore.tryAcquire()) {
			listenFuture = ses.scheduleAtFixedRate(
					createListenRunnable(), 0, removeUpdatePeriod, TimeUnit.MILLISECONDS);
		}
	}

	@Override
	public void stop() {
		es.submit(new Runnable() {			
			@SuppressWarnings("unchecked")
			@Override
			public void run() {						
				if (listeningSemaphore.availablePermits() == 0) {					
					listenFuture.cancel(false);
					Preconditions.checkState(listenFuture.isDone());
					configureRemoteNode(Collections.EMPTY_LIST);
					IClickSocket socket = connection.acquireSocket();
					if (socket != null) {
						socket.close();
					}
					connection.releaseSocket();
					listeningSemaphore.release();
				}
			}
		});
	}

	protected void configureRemoteNode(Collection<Handler> configuredHandler) {
		// empty
	}

	private class Listen implements Runnable {
		private Configuration latestConfiguration = null;
		
		public void run() {			
			createReceivingStartedEvent();
			Collection<Handler> configuredHandlers = null;
			if (latestConfiguration != config) {
				configuredHandlers = config.getConfiguredHandlers();
				configureRemoteNode(configuredHandlers);
				if (configuredHandlers.size() == 0) {
					createReceivingStoppedEvent();
					stop();
					return;
				}
			} else {
				configuredHandlers = latestConfiguration.getConfiguredHandlers();
			}
			
			IClickSocket clickSocket = connection.acquireSocket();
			if (clickSocket == null || configuredHandlers == null) {
				createReceivingStoppedEvent();
				stop();
				return;
			}
			
			loop: for (Handler handler: configuredHandlers) {
				String qualifiedHandlerName = handler.getQualifiedName();
				String[] splitName = HandlerUtil.getSplitQualifiedName(qualifiedHandlerName);
				String plainHandlerName = splitName[1];
				String elementName = splitName[0];
				if (commonHandler.contains(plainHandlerName)) {
					continue loop;
				}
				
				String realValue = null;
				try {				
					realValue = new String(clickSocket.read(elementName, plainHandlerName));
					createHandlerReceivedEvent(connection.getAdapter(IValueAdapter.class).create(handler, realValue));
				} catch (Exception e) {
					connection.createError("exception while reading handler", e);
				}
			}
			connection.releaseSocket();
			createReceivingStoppedEvent();
		}
	}
	
	protected Runnable createListenRunnable() {
		return new Listen();
	}

	@Override
	public void addEventListener(IHandlerEventListener eventListener) {
		eventListeners.add(eventListener);
	}

	@Override
	public void removeEventListener(IHandlerEventListener eventListener) {
		eventListeners.remove(eventListener);
		if (eventListeners.size() == 0) {
			stop();
		}
	}

	protected final void createHandlerReceivedEvent(final Handler handler) {
		for(final IHandlerEventListener eventListener: eventListeners) {
			taskDispatcher.dispatchTask(eventListener, new Runnable() {					
				@Override
				public void run() {
					try {
						eventListener.handlerReceived(handler);
					} catch (Exception e) {
						connection.createError("exception in a HandlerEventListener", e);	
					}
				}
			});
		}			
	}
	
	protected final void createReceivingStartedEvent() {
		for(final IHandlerEventListener eventListener: eventListeners) {
			taskDispatcher.dispatchTask(eventListener, new Runnable() {					
				@Override
				public void run() {
					try {
						eventListener.receivingStarted();
					} catch (Exception e) {
						connection.createError("exception in a HandlerEventListener", e);	
					}
				}
			});
		}
	}
	
	protected final void createReceivingStoppedEvent() {
		for(final IHandlerEventListener eventListener: eventListeners) {
			taskDispatcher.dispatchTask(eventListener, new Runnable() {					
				@Override
				public void run() {
					try {
						eventListener.receivingStopped();
					} catch (Exception e) {
						connection.createError("exception in a HandlerEventListener", e);
					}
				}
			});
		}
	}
}
