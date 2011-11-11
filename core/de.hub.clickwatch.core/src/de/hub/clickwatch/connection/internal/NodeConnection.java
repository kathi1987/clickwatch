package de.hub.clickwatch.connection.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import click.ClickException;
import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.IEditingDomainAdapter;
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
import de.hub.clickwatch.util.Tasks;

public class NodeConnection implements IInternalNodeConnection {

    @Inject private ILogger logger;
    @Inject private Provider<IClickSocket> clickSocketProvider;
    @Inject @Named(ClickWatchModule.I_DEFAULT_TIMEOUT) private int timeout;
    private IClickSocket clickSocket = null;
    private IClickSocket blockingClickSocket = new SynchronizedClickSocket();

    @Inject private IMetaDataAdapter metaDataAdapter;
    @Inject private IValueAdapter valueAdapter;
    @Inject private IHandlerAdapter handlerAdapter;
    @Inject private IHandlerEventAdapter handlerEventAdapter;
    @Inject private INodeAdapter nodeAdapter;
    @Inject private IErrorAdapter errorAdapter;
    @Inject private IMergeAdapter mergeAdapter;
    @Inject private IEditingDomainAdapter editingDomainAdapter;
    
    @Inject private Tasks tasks;

    private Node node;

    protected void init(Node node) {
        this.node = node;
    }

    @Override
    public Node getNode() {
        return node;
    }
    
    private IClickSocket clickSocket() {
        if (node == null) {
            return null;
        } else if (!node.getErrors().isEmpty()) {
            return nullSocket;
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
    public void close() {       
        getAdapter(IHandlerEventAdapter.class).stop();
        tasks.dispatchTask(this, new Runnable() {            
            @Override
            public void run() {    
                if (clickSocket() != null) {
                    clickSocket().close();
                    clickSocket = null;
                }
                logger.log(ILogger.DEBUG, "closed connection for " + node.getINetAddress(), null);
            }
        });        
    }
    
    @Override
    public void dispose() {
        close();     
        tasks.dispatchTask(this,  new Runnable() {            
            @Override
            public void run() {
                String iNetAddress = node.getINetAddress();
                ((AbstractAdapter)metaDataAdapter).dispose();
                ((AbstractAdapter)valueAdapter).dispose();
                ((AbstractAdapter)handlerAdapter).dispose();
                ((AbstractAdapter)handlerEventAdapter).dispose();
                ((AbstractAdapter)nodeAdapter).dispose();
                ((AbstractAdapter)errorAdapter).dispose();
                ((AbstractAdapter)mergeAdapter).dispose();
                ((AbstractAdapter)editingDomainAdapter).dispose();
                node.getErrors().clear();
                node.setConnection(null);
                node = null;
                logger.log(ILogger.DEBUG, "disposed connection for " + iNetAddress, null);
            }
        });
        
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
        } else if (adapterClass == IEditingDomainAdapter.class) {
            init((AbstractAdapter)editingDomainAdapter);
            return (T) editingDomainAdapter;
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
        if (node != null) {
            return node.getINetAddress();
        } else {
            return "[non connected]";
        }
    }
    
    private static final NullSocket nullSocket = new NullSocket();
    
    private static class NullSocket implements IClickSocket {
        @Override
        public void connect(String host, int port, int socketTimeOut) throws IOException {
       
        }

        @Override
        public boolean isConnected() {
            return true;
        }

        @Override
        public void close() {
            
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<String> getConfigElementNames() throws ClickException, IOException {
            return Collections.EMPTY_LIST;
        }

        @SuppressWarnings("unchecked")
        @Override
        public List<HandlerInfo> getElementHandlers(String name) throws ClickException, IOException {
            return Collections.EMPTY_LIST;
        }

        @Override
        public char[] read(String elementName, String handlerName) throws ClickException, IOException {
            return new char[] {};
        }

        @Override
        public void write(String string, String string2, char[] charArray) throws ClickException, IOException {
            
        }

        @Override
        public <T> T getAdapter(Class<T> theClass) {            
            return null;
        }        
    }

    private class SynchronizedClickSocket implements IClickSocket {

        @Override
        public void connect(String host, int port, int socketTimeOut) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override
        public synchronized boolean isConnected() {
            return clickSocket().isConnected();
        }

        @Override
        public synchronized void close() {
            clickSocket().close();
        }

        @Override
        public synchronized List<String> getConfigElementNames() throws ClickException, IOException {
            return clickSocket().getConfigElementNames();
        }

        @Override
        public synchronized List<HandlerInfo> getElementHandlers(String name) throws ClickException, IOException {
            return clickSocket().getElementHandlers(name);
        }

        @Override
        public synchronized char[] read(String elementName, String handlerName) throws ClickException, IOException {
            return clickSocket().read(elementName, handlerName);
        }

        @Override
        public synchronized void write(String string, String string2, char[] charArray) throws ClickException, IOException {
            clickSocket().write(string, string2, charArray);
        }

        @Override
        public synchronized <T> T getAdapter(Class<T> theClass) {
            return clickSocket().getAdapter(theClass);
        }
    }

    @Override
    public void waitForOpenTasks() {
        tasks.waitForCompletion(this);
    }
    
    
}
