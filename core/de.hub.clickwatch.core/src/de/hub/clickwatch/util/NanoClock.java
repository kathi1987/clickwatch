package de.hub.clickwatch.util;

import com.google.inject.Singleton;

@Singleton
public class NanoClock {
	
	private long referenceNanos = 0;
	private long startMillies = 0;

	public long currentTimeNanos() {
		if (referenceNanos == 0) {
			referenceNanos = System.nanoTime();
			startMillies = System.currentTimeMillis();
		} 
		return (startMillies * 1000000) + System.nanoTime() - referenceNanos; 
	}
}
