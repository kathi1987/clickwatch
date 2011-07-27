package de.hub.clickwatch.connection.adapter;

import java.util.Collection;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.model.Handler;

@ImplementedBy(HandlerAdapter.class)
public interface IHandlerAdapter {

	public Collection<Handler> pullHandler();
	
	public void configure(Collection<Handler> handlerConfig);
	
	public void deconfigure();
	
}
