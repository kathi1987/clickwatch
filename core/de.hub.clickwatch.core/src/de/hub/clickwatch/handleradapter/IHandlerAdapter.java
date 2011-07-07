package de.hub.clickwatch.handleradapter;

import java.util.Collection;

import de.hub.clickwatch.model.Handler;

public interface IHandlerAdapter {

	public Collection<Handler> pullHandler();
	
	public void configure(Collection<Handler> handlerConfig);
	
}
