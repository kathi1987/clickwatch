package de.hub.clickwatch.util;


public interface ILogger {

	public void log(int status, String message, Throwable exception);
	
}
