package de.hub.clickwatch.connection.adapter.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.model.ClickWatchError;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.TaskQueues;

public class ErrorAdapter extends AbstractAdapter implements IErrorAdapter {

    @Inject private ILogger logger;
    @Inject private TaskQueues taskDispatcher;
    private final Collection<IErrorListener> errorListeners = new HashSet<IErrorListener>();
    private final List<ClickWatchError> errors = new ArrayList<ClickWatchError>();

    @Override
    public void addErrorListener(IErrorListener errorListener) {
        errorListeners.add(errorListener);
    }

    @Override
    public void removeErrorListener(IErrorListener errorListener) {
        errorListeners.remove(errorListener);
    }

    public void createErrorEvent(final String message, final Throwable e) {
        final ClickWatchError error = new ClickWatchError(message, e);
        errors.add(error);

        // Send a notification to all listeners of the connection's node, that
        // there is a new error in the node's derived errors attribute.
        Node node = connection.getNode();
        node.eNotify(new ENotificationImpl((InternalEObject) node, Notification.ADD, ClickWatchModelPackage.NODE__ERRORS, null,
                error, errors.size() - 1, true));

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
    public List<ClickWatchError> getErrors() {
        return errors;
    }
}
