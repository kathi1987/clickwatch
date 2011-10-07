package de.hub.clickwatch.recorder.examples.lib;

public class MovingAvg extends Window<Double> {
	double sum = 0;
	
	public MovingAvg(int size) {
		super(size);
	}
	
	public Double add(Double value) {
		sum += value;
		Double polled = super.add(value);
		if (polled != null) {
			sum -= polled;
		}
		return polled;
	}
	
	public double filter(double value) {
		add(value);
		return (double)sum/getCurrentSize();
	}
}