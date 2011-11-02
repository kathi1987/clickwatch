package de.hub.clickwatch.connection.adapter;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.model.Handler;

public interface IHandlerEventListener {
    /**
     * Each handler that is read will cause an event.
     * 
     * @param handler
     *            , the handler with the read value
     */
    public void handlerReceived(Handler handler);

    public void receivingStarted();

    public void receivingStopped();
    
    public void listeningStarted();
    
    public void listeningStopped();

    /**
     * This is disposed when the {@link IHandlerEventAdapter} is disposed, which
     * is disposed when the {@link INodeConnection} gets disposed.
     */
    public void dispose();
}