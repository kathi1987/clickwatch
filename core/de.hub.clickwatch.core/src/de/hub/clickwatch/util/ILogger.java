package de.hub.clickwatch.util;


public interface ILogger {
	
	public static final int DEBUG = 4;
	public static final int INFO = 3;
	public static final int ERROR = 1;
	public static final int WARNING = 2;

	public void log(int level, String message, Throwable exception);
	
}
