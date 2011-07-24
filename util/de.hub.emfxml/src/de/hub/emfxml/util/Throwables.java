package de.hub.emfxml.util;

public class Throwables {
	public static void propagate(Throwable e) {
		throw new RuntimeException(e);
	}
}
