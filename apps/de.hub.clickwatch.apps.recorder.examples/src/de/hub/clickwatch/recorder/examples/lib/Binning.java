package de.hub.clickwatch.recorder.examples.lib;

import java.util.ArrayList;
import java.util.List;

public abstract class Binning<T> {
	protected final int size;
	protected final List<T> bins = new ArrayList<T>();
	private int currentSize = 0;
	public Binning(int size) {
		super();
		this.size = size;
	}
	public void add(T value) {
		addToBin(value);
		currentSize++;
		if (currentSize >= size) {
			bins.add(closeBin());
			currentSize = 0;
		}
	}
	public List<T> getBins() {
		return bins;
	}
	protected abstract void addToBin(T value);
	protected abstract T closeBin();
}

