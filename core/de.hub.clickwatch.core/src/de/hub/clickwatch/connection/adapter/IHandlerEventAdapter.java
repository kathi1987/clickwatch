package de.hub.clickwatch.connection.adapter;

import java.util.Collection;
import java.util.List;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.HandlerEventAdapter;
import de.hub.clickwatch.model.Handler;

@ImplementedBy(HandlerEventAdapter.class)
public interface IHandlerEventAdapter {

//	public void start(Collection<Handler> configuredHandler);
//	
//	public void start(String elementFilter, String handlerFilter);
	
	public void start();
	
	public void stop();
	
	public void addEventListener(IHandlerEventListener eventListener);
	
	public void removeEventListener(IHandlerEventListener eventListener);
	
	public List<IHandlerEventListener> getListeners();
	
}
