package de.hub.clickwatch.recorder.examples.lib;

import java.util.ArrayList;
import java.util.List;

public abstract class Binning implements MathTransformation<Double[], Double[]>{
	private final int size;
	private final MathTransformation<Double[], Double> binTrans;
	
	public Binning(int size, MathTransformation<Double[], Double> binTrans) {
		super();
		this.size = size;
		this.binTrans = binTrans;
	}
	
	public Double[] transform(Double[] values) {
		List<Double> result = new ArrayList<Double>();
		List<Double> currentBin = null;
		for(Double value: values) {
			if (currentBin == null) {
				currentBin = new ArrayList<Double>();
			}
			currentBin.add(value);
			if (currentBin.size() == size) {
				result.add(binTrans.transform(currentBin.toArray(new Double[]{})));
				currentBin = null;
			}
		}
		return result.toArray(new Double[]{});
	}
}

