package de.hub.clickwatch.recorder.examples.lib;

public class RemoveOffset {

	private final MovingAvg mavg;
	public RemoveOffset(int windowSize) {
		mavg = new MovingAvg(windowSize);
	}
	
	public double filter(double value) {
		return value - mavg.filter(value);
	}
}
