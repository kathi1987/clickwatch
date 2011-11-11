package de.hub.clickwatch.connection.adapter.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import click.ClickException.NoSuchHandlerException;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.internal.IInternalNodeConnection;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.util.HandlerUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.NanoClock;
import de.hub.clickwatch.util.Tasks;

public class HandlerEventAdapter extends AbstractAdapter implements IHandlerEventAdapter {

    @SuppressWarnings("rawtypes")// otherwise inject won't work
    @Inject @Named(ClickWatchModule.CS_IGNORED_HANDLER_NAMES) protected Collection commonHandler;
    @Inject @Named(ClickWatchModule.I_REMOTE_UPDATE_PERIOD) private int removeUpdatePeriod;
    @Inject private ILogger logger;
    @Inject private NanoClock clock;
    private ScheduledFuture<?> listenFuture = null;

    @Inject private ScheduledExecutorService ses;
    @Inject private Tasks taskDispatcher;
    
    private boolean metaDataMightHaveChanged = false;

    private final Map<Object, IHandlerEventListener> eventListeners = new HashMap<Object, IHandlerEventListener>();

    @Override
    public void start() {
        taskDispatcher.dispatchTask(null, new Runnable() {
            @Override
            public void run() {
                connection.getNode().setListening(true);
                configureRemoteNode(connection.getNode().getAllHandlers());
                listenFuture = ses.scheduleAtFixedRate(createListenRunnable(), 0, removeUpdatePeriod, TimeUnit.MILLISECONDS);
                
                // create event
                for (final IHandlerEventListener eventListener : eventListeners.values()) {
                    taskDispatcher.dispatchTask(eventListener, new Runnable() {
                        @Override
                        public void run() {
                            try {
                                eventListener.listeningStarted();
                            } catch (Exception e) {
                                connection.getAdapter(IErrorAdapter.class).createError("exception in a HandlerEventListener", e);
                            }
                        }
                    });
                }
                
                logger.log(ILogger.DEBUG, "started listening for " + connection, null);
            }
        });
    }

    @Override
    public void init(IInternalNodeConnection connection) {
        super.init(connection);
        connection.getNode().eAdapters().add(new EContentAdapter() {
            @Override
            public void notifyChanged(Notification msg) {
                if (msg.getFeature() == ClickWatchModelPackage.eINSTANCE.getNode_Elements() || 
                        msg.getFeature() == ClickWatchModelPackage.eINSTANCE.getElement_Children() ||
                        msg.getFeature() == ClickWatchModelPackage.eINSTANCE.getElement_Handlers()) {
                    if (!metaDataMightHaveChanged) {
                        logger.log(ILogger.DEBUG, "HandlerEventAdapter realized that meta-data has changed", null);
                    }
                    metaDataMightHaveChanged = true;
                    
                }
                super.notifyChanged(msg);
            }

            @Override
            protected void selfAdapt(Notification notification) {
                if (!(notification.getNotifier() instanceof Handler)) {
                    super.selfAdapt(notification);
                }
            }                             
        });
    }

    @Override
    public void stop() {
        taskDispatcher.dispatchTask(connection, new Runnable() {
            @SuppressWarnings("unchecked")
            @Override
            public void run() {
                // create event
                for (final IHandlerEventListener eventListener : eventListeners.values()) {
                    taskDispatcher.dispatchTask(eventListener, new Runnable() {
                        @Override
                        public void run() {
                            try {
                                eventListener.listeningStarted();
                            } catch (Exception e) {
                                connection.getAdapter(IErrorAdapter.class).createError("exception in a HandlerEventListener", e);
                            }
                        }
                    });
                }
                
                while (listenFuture != null && !listenFuture.isDone()) {                  
                    listenFuture.cancel(false);
                }
                
                configureRemoteNode(Collections.EMPTY_LIST);
                connection.getNode().setListening(false);
                
                logger.log(ILogger.DEBUG, "listening stopped for " + connection, null);                
            }
        });
    }

    protected void configureRemoteNode(Collection<Handler> configuredHandler) {
        // empty
    }

    private class Listen implements Runnable {
        public void run() {
            long start = System.currentTimeMillis();
            onReceivingStart();
            Collection<Handler> configuredHandlers = connection.getNode().getAllHandlers();

            IClickSocket clickSocket = connection.getBlockingSocket();
            if (clickSocket == null || configuredHandlers == null || !clickSocket.isConnected()) {
                logger.log(ILogger.WARNING, "no socket available, but still listening", null);
                onReceivingStop();
                stop();
                return;
            }

            loop: for (Handler handler : configuredHandlers) {
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
                    onHandlerReceived(connection.getAdapter(IValueAdapter.class).create(handler.getQualifiedName(), clock.currentTimeNanos(), realValue));
                } catch (NoSuchHandlerException e) {
                    logger.log(ILogger.WARNING, "read an non existing handler", null);
                } catch (Exception e) {
                    connection.getAdapter(IErrorAdapter.class).createError("exception while reading handler", e);
                }
            }
            onReceivingStop();
            connection.getNode().getStatistics("default handler receive time").addValue(System.currentTimeMillis() - start);
        }
    }

    protected Runnable createListenRunnable() {
        return new Listen();
    }

    @Override
    public void addEventListener(Object key, IHandlerEventListener eventListener) {
        eventListeners.put(key, eventListener);
    }

    @Override
    public void removeEventListener(Object key) {
        eventListeners.remove(key);
    }
    
    @Override
    public IHandlerEventListener getEventListener(Object key) {
        return eventListeners.get(key);
    }

    private void reconfigureForChangedMetaData() {
        if (metaDataMightHaveChanged) {
            configureRemoteNode(connection.getNode().getAllHandlers());
            metaDataMightHaveChanged = false;
        }
    }

    protected final void onHandlerReceived(final Handler handler) {
        for (final IHandlerEventListener eventListener : eventListeners.values()) {
            taskDispatcher.dispatchTask(eventListener, new Runnable() {
                @Override
                public void run() {
                    try {
                        eventListener.handlerReceived(handler);
                    } catch (Exception e) {
                        connection.getAdapter(IErrorAdapter.class).createError("exception in a HandlerEventListener", e);
                    }
                }
            });
        }
    }

    protected final void onReceivingStart() {
        reconfigureForChangedMetaData();
        for (final IHandlerEventListener eventListener : eventListeners.values()) {
            taskDispatcher.dispatchTask(eventListener, new Runnable() {
                @Override
                public void run() {
                    try {
                        eventListener.receivingStarted();
                    } catch (Exception e) {
                        connection.getAdapter(IErrorAdapter.class).createError("exception in a HandlerEventListener", e);
                    }
                }
            });
        }
    }

    protected final void onReceivingStop() {
        for (final IHandlerEventListener eventListener : eventListeners.values()) {
            taskDispatcher.dispatchTask(eventListener, new Runnable() {
                @Override
                public void run() {
                    try {
                        eventListener.receivingStopped();
                    } catch (Exception e) {
                        connection.getAdapter(IErrorAdapter.class).createError("exception in a HandlerEventListener", e);
                    }
                }
            });
        }
    }

    @Override
    public void dispose() {
        taskDispatcher.dispatchTask(connection, new Runnable() {            
            @Override
            public void run() {
                for (IHandlerEventListener listener: new ArrayList<IHandlerEventListener>(eventListeners.values())) {
                    listener.dispose();
                }
                eventListeners.clear();        
            }
        });        
    }    
}
