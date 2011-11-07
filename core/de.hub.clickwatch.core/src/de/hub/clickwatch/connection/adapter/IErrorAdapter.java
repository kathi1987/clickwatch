package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.ErrorAdapter;
import de.hub.clickwatch.model.Error;

@ImplementedBy(ErrorAdapter.class)
public interface IErrorAdapter {

	public interface IErrorListener {
		public void handlerError(Error error);
	}
	
	public void addErrorListener(IErrorListener errorListener);
	
	public void removeErrorListener(IErrorListener errorListener);
	
    /**
     * Creates an error, informs all {@link IErrorListener} (see
     * {@link IErrorAdapter}) and closes the connection (see {@link #close()}).
     */
    public void createError(String message, Throwable e);
	
}
