package de.hub.clickwatch.recorder.examples.lib;

public class MovingAvg implements MathTransformation<Double, Double> {
	
	private double sum = 0;
	private final Window<Double> window;
	
	public MovingAvg(int size) {
		this.window = new Window<Double>(size);
	}
	
	public Double transform(Double value) {
		sum += value;
		Double polled = window.transform(value);
		if (polled != null) {
			sum -= polled;
		}
		return (double)sum/window.currentSize();
	}

}