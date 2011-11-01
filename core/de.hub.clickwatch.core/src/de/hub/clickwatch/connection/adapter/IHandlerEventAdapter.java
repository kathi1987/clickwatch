package de.hub.clickwatch.connection.adapter;

import java.util.List;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.HandlerEventAdapter;

@ImplementedBy(HandlerEventAdapter.class)
public interface IHandlerEventAdapter {
	
	public void start();
	
	public void stop();
	
	public void addEventListener(IHandlerEventListener eventListener);
	
	public void removeEventListener(IHandlerEventListener eventListener);
	
	public List<IHandlerEventListener> getListeners();
	
}
