package de.hub.clickwatch.recorder.examples.lib;

public class RemoveOffset {

	private final MovingAvg mavg;
	public RemoveOffset(int windowSize) {
		mavg = new MovingAvg(windowSize);
	}
	
	public int filter(int value) {
		return value - mavg.filter(value);
	}
}
