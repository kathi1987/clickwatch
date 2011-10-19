package de.hub.clickwatch.recorder.examples.lib;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Window<T> implements MathTransformation<T, T> {
	
	private final int size;
	private int currentSize = 0;
	private final Queue<T> values = new ConcurrentLinkedQueue<T>();
	
	public Window(int size) {
		super();
		this.size = size;
	}
	
	public T transform(T value) {
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
	
	public int currentSize() {
		return currentSize;
	}
	
	public Queue<T> values() {
		return values;
	}
	
	public int size() {
		return size;
	}
	
}
