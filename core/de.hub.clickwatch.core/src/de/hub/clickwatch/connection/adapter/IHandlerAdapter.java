package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.model.Handler;

@ImplementedBy(HandlerAdapter.class)
public interface IHandlerAdapter {
	
	public Handler getHandler(Handler handler);

	public Handler getHandler(String qualifiedName);
	
}
