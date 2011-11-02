package de.hub.clickwatch.connection.adapter.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import click.ClickException.NoSuchHandlerException;

import com.google.common.base.Preconditions;
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
import de.hub.clickwatch.util.TaskQueues;

public class HandlerEventAdapter extends AbstractAdapter implements IHandlerEventAdapter {

    @SuppressWarnings("rawtypes")// otherwise inject won't work
    @Inject @Named(ClickWatchModule.CS_IGNORED_HANDLER_NAMES) protected Collection commonHandler;
    @Inject @Named(ClickWatchModule.I_REMOTE_UPDATE_PERIOD) private int removeUpdatePeriod;
    @Inject private ILogger logger;
    private ScheduledFuture<?> listenFuture = null;

    @Inject private ScheduledExecutorService ses;
    @Inject private TaskQueues taskDispatcher;
    
    private boolean metaDataMightHaveChanged = false;

    private final List<IHandlerEventListener> eventListeners = new ArrayList<IHandlerEventListener>();

    @Override
    public synchronized void start() {
        logger.log(ILogger.DEBUG, "try to start listening for " + connection, null);
        taskDispatcher.dispatchTask(null, new Runnable() {
            @Override
            public void run() {
                connection.getNode().setListening(true);
                configureRemoteNode(connection.getNode().getAllHandlers());
                listenFuture = ses.scheduleAtFixedRate(createListenRunnable(), 0, removeUpdatePeriod, TimeUnit.MILLISECONDS);
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
        logger.log(ILogger.DEBUG, "try to stop listening for " + connection, null);
        taskDispatcher.dispatchTask(null, new Runnable() {
            @SuppressWarnings("unchecked")
            @Override
            public void run() {
                if (listenFuture != null) {                  
                    listenFuture.cancel(false);
                    Preconditions.checkState(listenFuture.isDone());
                    listenFuture = null;
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
            onReceivingStart();
            Collection<Handler> configuredHandlers = connection.getNode().getAllHandlers();

            IClickSocket clickSocket = connection.acquireSocket();
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
                    onHandlerReceived(connection.getAdapter(IValueAdapter.class).create(handler, realValue));
                } catch (NoSuchHandlerException e) {
                    logger.log(ILogger.WARNING, "read an non existing handler", null);
                } catch (Exception e) {
                    connection.getAdapter(IErrorAdapter.class).createError("exception while reading handler", e);
                }
            }
            connection.releaseSocket();
            onReceivingStop();
        }
    }

    protected Runnable createListenRunnable() {
        return new Listen();
    }

    @Override
    public List<IHandlerEventListener> getListeners() {
        return eventListeners;
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
    
    private void reconfigureForChangedMetaData() {
        if (metaDataMightHaveChanged) {
            configureRemoteNode(connection.getNode().getAllHandlers());
            metaDataMightHaveChanged = false;
        }
    }

    protected final void onHandlerReceived(final Handler handler) {
        for (final IHandlerEventListener eventListener : eventListeners) {
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
        for (final IHandlerEventListener eventListener : eventListeners) {
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
        for (final IHandlerEventListener eventListener : eventListeners) {
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
        for (IHandlerEventListener listener: new ArrayList<IHandlerEventListener>(eventListeners)) {
            listener.dispose();
        }
        eventListeners.clear();
    }    
}
