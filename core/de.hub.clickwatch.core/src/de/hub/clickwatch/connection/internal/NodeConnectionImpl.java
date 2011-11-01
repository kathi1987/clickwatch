package de.hub.clickwatch.connection.internal;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Semaphore;

import click.ClickException;
import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.internal.AbstractAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.TaskQueues;

public class NodeConnectionImpl implements IInternalNodeConnection {

    @Inject private ILogger logger;
    @Inject private Provider<IClickSocket> clickSocketProvider;
    @Inject @Named(ClickWatchModule.I_DEFAULT_TIMEOUT) private int timeout;
    private IClickSocket clickSocket = null;
    private IClickSocket blockingClickSocket = new BlockingClickSocket();
    private final Semaphore socketSemaphore = new Semaphore(1);

    @Inject private IMetaDataAdapter metaDataAdapter;
    @Inject private IValueAdapter valueAdapter;
    @Inject private IHandlerAdapter handlerAdapter;
    @Inject private IHandlerEventAdapter handlerEventAdapter;
    @Inject private INodeAdapter nodeAdapter;
    @Inject private IErrorAdapter errorAdapter;
    @Inject private IMergeAdapter mergeAdapter;
    
    @Inject private TaskQueues taskQueues;

    private Node node;

    protected void init(Node node) {
        this.node = node;
    }

    @Override
    public Node getNode() {
        return node;
    }

    @Override
    public IClickSocket acquireSocket() {
        if (!node.getErrors().isEmpty()) {
            return null;
        }
        try {
            socketSemaphore.acquire();
        } catch (InterruptedException e) {
            logger.log(ILogger.ERROR, "unexpected interruption", e);
        }
        if (clickSocket == null) {
            clickSocket = clickSocketProvider.get();
        }
        if (!clickSocket.isConnected()) {
            try {
                clickSocket.connect(node.getINetAddress(), Integer.parseInt(node.getPort()), timeout);
            } catch (Exception e) {
                logger.log(ILogger.ERROR, "could not connect to " + node.getINetAddress() + " on port " + node.getPort(), e);
                try {
                    clickSocket.close();
                } catch (Exception followException) {
                }
                clickSocket = null;
                String errorMessage = "exception during connect: could not connect to " + node.getINetAddress() + " on port "
                        + node.getPort();
                getAdapter(IErrorAdapter.class).createError(errorMessage, e);
            }
        }
        return clickSocket;
    }

    @Override
    public void releaseSocket() {
        if (socketSemaphore.availablePermits() == 0) {
            socketSemaphore.release();
        }
    }

    @Override
    public void close() {
        logger.log(ILogger.DEBUG, "close connection for " + node.getINetAddress(), null);
        getAdapter(IHandlerEventAdapter.class).stop();
        taskQueues.dispatchTask(null, new Runnable() {            
            @Override
            public void run() {
                acquireSocket();
                if (clickSocket != null) {
                    clickSocket.close();
                }
                releaseSocket();
            }
        });        
    }
    
    @Override
    public void dispose() {
        logger.log(ILogger.DEBUG, "dispose connection for " + node.getINetAddress(), null);
        close();        
        ((AbstractAdapter)metaDataAdapter).dispose();
        ((AbstractAdapter)valueAdapter).dispose();
        ((AbstractAdapter)handlerAdapter).dispose();
        ((AbstractAdapter)handlerEventAdapter).dispose();
        ((AbstractAdapter)nodeAdapter).dispose();
        ((AbstractAdapter)errorAdapter).dispose();
        ((AbstractAdapter)mergeAdapter).dispose();
        node.getErrors().clear();
        node.setConnection(null);
        node = null;
    }

    @Override
    public IClickSocket getBlockingSocket() {
        return blockingClickSocket;
    }

    protected void init(AbstractAdapter abstractAdapter) {
        abstractAdapter.init(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getAdapter(Class<T> adapterClass) {
        if (adapterClass == IMetaDataAdapter.class) {
            init((AbstractAdapter) metaDataAdapter);
            return (T) metaDataAdapter;
        } else if (adapterClass == IHandlerEventAdapter.class) {
            init((AbstractAdapter) handlerEventAdapter);
            return (T) handlerEventAdapter;
        } else if (adapterClass == INodeAdapter.class) {
            init((AbstractAdapter) nodeAdapter);
            return (T) nodeAdapter;
        } else if (adapterClass == IValueAdapter.class) {
            init((AbstractAdapter) valueAdapter);
            return (T) valueAdapter;
        } else if (adapterClass == IErrorAdapter.class) {
            init((AbstractAdapter) errorAdapter);
            return (T) errorAdapter;
        } else if (adapterClass == IMergeAdapter.class) {
            init((AbstractAdapter) mergeAdapter);
            return (T) mergeAdapter;
        } else if (adapterClass == IHandlerAdapter.class) {
            init((AbstractAdapter) handlerAdapter);
            return (T) handlerAdapter;
            // } else if (adapterClass == SocketStatisticsAdapter.class) {
            // if (socketStatisticsAdapter == null) {
            // if (clickSocket.getAdapter(ClickSocketStatistics.class) != null)
            // {
            // socketStatisticsAdapter = new SocketStatisticsAdapter();
            // init(socketStatisticsAdapter);
            // }
            // }
            // return (T)socketStatisticsAdapter;
        } else {
            Preconditions.checkArgument(false, "Unknown adapter " + adapterClass.getCanonicalName());
            return null;
        }
    }

    @Override
    public String toString() {
        return node.getINetAddress();
    }

    /**
     * This is a delegating {@link IClickSocket} implementation that acquires a
     * shared socket on each operation. It blocks all calls until the shared
     * socket is available.
     */
    private class BlockingClickSocket implements IClickSocket {

        @Override
        public void connect(String host, int port, int socketTimeOut) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean isConnected() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void close() {
            IClickSocket socket = acquireSocket();
            if (socket != null) {
                socket.close();
            }
            releaseSocket();
        }

        @Override
        public List<String> getConfigElementNames() throws ClickException, IOException {
            IClickSocket socket = acquireSocket();
            List<String> result = null;
            if (socket != null) {
                result = socket.getConfigElementNames();
            }
            releaseSocket();
            return result;
        }

        @Override
        public List<HandlerInfo> getElementHandlers(String name) throws ClickException, IOException {
            IClickSocket socket = acquireSocket();
            List<HandlerInfo> result = null;
            if (socket != null) {
                result = socket.getElementHandlers(name);
            }
            releaseSocket();
            return result;
        }

        @Override
        public char[] read(String elementName, String handlerName) throws ClickException, IOException {
            IClickSocket socket = acquireSocket();
            char[] result = null;
            if (socket != null) {
                result = socket.read(elementName, handlerName);
            }
            releaseSocket();
            return result;
        }

        @Override
        public void write(String string, String string2, char[] charArray) throws ClickException, IOException {
            IClickSocket socket = acquireSocket();
            if (socket != null) {
                socket.write(string, string2, charArray);
            }
            releaseSocket();
        }

        @Override
        public <T> T getAdapter(Class<T> theClass) {
            IClickSocket socket = acquireSocket();
            T result = null;
            if (socket != null) {
                result = socket.getAdapter(theClass);
            }
            releaseSocket();
            return result;
        }
    }
}
