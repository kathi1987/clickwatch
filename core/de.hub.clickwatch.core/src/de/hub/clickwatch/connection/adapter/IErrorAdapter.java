package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.ErrorAdapter;

@ImplementedBy(ErrorAdapter.class)
public interface IErrorAdapter {

	public interface IErrorListener {
		public void handlerError(String message, Throwable e);
	}
	
	public void addErrorListener(IErrorListener errorListener);
	
	public void removeErrorListener(IErrorListener errorListener);
	
}
