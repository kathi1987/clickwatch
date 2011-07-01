package de.hub.clickwatch.util;

public class Throwables {
	public static void propagate(Throwable e) {
		throw new RuntimeException(e);
	}
}
