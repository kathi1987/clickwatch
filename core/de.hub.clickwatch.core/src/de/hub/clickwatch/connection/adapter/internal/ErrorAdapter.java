package de.hub.clickwatch.connection.adapter.internal;

import java.util.Collection;
import java.util.HashSet;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.model.ClickWatchError;
import de.hub.clickwatch.model.util.ClickWatchErrorUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Tasks;

public class ErrorAdapter extends AbstractAdapter implements IErrorAdapter {

    @Inject private ILogger logger;
    @Inject private Tasks tasks;
    private final Collection<IErrorListener> errorListeners = new HashSet<IErrorListener>();

    @Override
    public void addErrorListener(IErrorListener errorListener) {
        errorListeners.add(errorListener);
    }

    @Override
    public void removeErrorListener(IErrorListener errorListener) {
        errorListeners.remove(errorListener);
    }

    private void createErrorEvent(final String message, final Throwable e) {
        tasks.dispatchTask(connection, new Runnable() {            
            @Override
            public void run() {
                logger.log(ILogger.ERROR, "error in connection " + connection.toString() + ", connection was closed.", e);
                final ClickWatchError error = ClickWatchErrorUtil.createError(message, (Exception)e);
                connection.getNode().getErrors().add(error);

                // Dispatch a task to all error listeners.
                logger.log(ILogger.ERROR, "In connection " + connection.toString() + ": " + message, e);
                for (final IErrorListener errorListener: errorListeners) {            
                    tasks.dispatchTask(errorListener, new Runnable() {
                        @Override
                        public void run() {                 
                               errorListener.handlerError(error);
                        }
                    }); 
                }        
            }
        });        
    }
    
    @Override
    public void createError(String message, Throwable e) {     
        // try to close and remove a possible clickSocket
        connection.close();
        // distribute the error event to all handlers
        createErrorEvent(message, e);
    }
}
