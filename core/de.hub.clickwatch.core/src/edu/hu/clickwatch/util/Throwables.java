package edu.hu.clickwatch.util;

public class Throwables {
	public static void propagate(Throwable e) {
		throw new RuntimeException(e);
	}
}
