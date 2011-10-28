package de.hub.clickwatch.connection.adapter;

import de.hub.clickwatch.model.Handler;

public interface IHandlerEventListener {
	/**
	 * Each handler that is read will cause an event.
	 * 
	 * @param handler
	 *            , the handler with the read value
	 */
	public void handlerReceived(Handler handler);
	
	public void receivingStarted();
	
	public void receivingStopped();
}