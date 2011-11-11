package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.HandlerEventAdapter;

@ImplementedBy(HandlerEventAdapter.class)
public interface IHandlerEventAdapter {

    /**
     * Stars listening on the node. The method configures the connection for
     * listening to all the handlers currently in the associated node. The
     * adapter will listen to the nodes handlers and adapt to any changes in the
     * set of handlers.
     * 
     * Runs asynchronous within the connection's thread.
     */
    public void start();

    /**
     * Stops listening, but listeners will stay.
     * 
     * Runs asynchronous within the connection's thread.
     */
    public void stop();

    public void addEventListener(Object key, IHandlerEventListener eventListener);

    public IHandlerEventListener getEventListener(Object key);

    public void removeEventListener(Object key);

}
