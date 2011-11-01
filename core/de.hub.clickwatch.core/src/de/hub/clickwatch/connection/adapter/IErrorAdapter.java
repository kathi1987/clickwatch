package de.hub.clickwatch.connection.adapter;

import java.util.List;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.ErrorAdapter;
import de.hub.clickwatch.model.ClickWatchError;

@ImplementedBy(ErrorAdapter.class)
public interface IErrorAdapter {

	public interface IErrorListener {
		public void handlerError(ClickWatchError error);
	}
	
	public void addErrorListener(IErrorListener errorListener);
	
	public void removeErrorListener(IErrorListener errorListener);
	
	public List<ClickWatchError> getErrors();
	
}
