package de.hub.clickwatch.util;

public class Throwables {
	
	public static ILogger logger = null;
	
	public static void propagate(Throwable e) {
		if (logger != null) {
			// logger.log(ILogger.ERROR, "propagated exception", e);
		}
		throw new RuntimeException(e);
	}
}
