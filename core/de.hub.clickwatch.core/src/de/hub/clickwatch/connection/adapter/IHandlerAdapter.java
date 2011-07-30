package de.hub.clickwatch.connection.adapter;

import de.hub.clickwatch.model.Handler;

public interface IHandlerAdapter {
	
	public Handler getHandler(Handler handler);

	public Handler getHandler(String qualifiedName);
	
}
