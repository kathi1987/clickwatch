package de.hub.clickwatch.recorder.examples.lib;


public class AvgBinning extends Binning<Double> {
	private double sum = 0;

	public AvgBinning(int size) {
		super(size);
	}
	
	public AvgBinning(int numberOfBins, int expectedNumberOfValues) {
		this(expectedNumberOfValues / numberOfBins);
	}

	@Override
	protected void addToBin(Double value) {
		sum += value;
	}

	@Override
	protected Double closeBin() {
		double result = sum / size;
		sum = 0;
		return result;
	}	
}

