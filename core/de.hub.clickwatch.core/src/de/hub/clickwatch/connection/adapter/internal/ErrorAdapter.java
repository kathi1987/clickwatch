package de.hub.clickwatch.connection.adapter.internal;

import java.util.Collection;
import java.util.HashSet;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.util.ILogger;

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

	public void createErrorEvent(final String message, final Throwable e) {
		taskDispatcher.dispatchTask(this, new Runnable() {			
			@Override
			public void run() {
				logger.log(ILogger.ERROR, "In connection " + connection.toString() + ": " + message, e);
				for(IErrorListener errorListener: errorListeners) {
					errorListener.handlerError(message, e);
				}		
			}
		});		
	}
}
