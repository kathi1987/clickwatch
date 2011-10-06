package de.hub.clickwatch.recorder.examples.lib;

public class MovingAvg extends Window<Integer> {
	double sum = 0;
	
	public MovingAvg(int size) {
		super(size);
	}
	
	public Integer add(Integer value) {
		sum += value;
		Integer polled = super.add(value);
		if (polled != null) {
			sum -= polled;
		}
		return polled;
	}
	
	public int filter(int value) {
		add(value);
		return (int)sum/getCurrentSize();
	}
}