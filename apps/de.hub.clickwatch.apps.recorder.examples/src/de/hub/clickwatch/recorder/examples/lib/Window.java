package de.hub.clickwatch.recorder.examples.lib;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Window<T> {
	protected final int size;
	private int currentSize = 0;
	protected final Queue<T> values = new ConcurrentLinkedQueue<T>();
	
	public Window(int size) {
		super();
		this.size = size;
	}
	
	public T add(T value) {
		values.add(value);
		currentSize++;
		if (currentSize > size) {
			T polled = values.poll();
			currentSize--;
			return polled;
		} else {
			return null;
		}
	}
	
	public int getCurrentSize() {
		return currentSize;
	}
	
}
