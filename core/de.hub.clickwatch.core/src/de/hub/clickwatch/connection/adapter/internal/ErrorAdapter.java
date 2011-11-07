package de.hub.clickwatch.connection.adapter.internal;

import java.util.Collection;
import java.util.HashSet;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.model.Error;
import de.hub.clickwatch.model.util.ErrorUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.TaskQueues;

public class ErrorAdapter extends AbstractAdapter implements IErrorAdapter {

    @Inject private ILogger logger;
    @Inject private TaskQueues taskDispatcher;
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
        final Error error = ErrorUtil.createError(message, (Exception)e);
        connection.getNode().getErrors().add(error);

        // Dispatch a task to all error listeners.
        logger.log(ILogger.ERROR, "In connection " + connection.toString() + ": " + message, e);
        for (final IErrorListener errorListener: errorListeners) {            
            taskDispatcher.dispatchTask(this, new Runnable() {
                @Override
                public void run() {                 
                       errorListener.handlerError(error);
                }
            }); 
        }
    }
    
    @Override
    public void createError(String message, Throwable e) {
        logger.log(ILogger.ERROR, "error in connection " + toString() + ", connection is closed.", e);

        // distribute the error event to all handlers
        createErrorEvent(message, e);
        
        // try to close and remove a possible clickSocket
        connection.close();
    }
}
