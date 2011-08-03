package de.hub.clickwatch.main;


public interface IClickWatchContext {

	public <T> T getAdapter(Class<T> adapterClass);
	
}
