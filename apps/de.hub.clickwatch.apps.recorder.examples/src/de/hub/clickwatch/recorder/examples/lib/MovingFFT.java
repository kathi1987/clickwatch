package de.hub.clickwatch.recorder.examples.lib;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;

public abstract class MovingFFT<Result> extends Window<Double> {
	private final double sampleRate;
	private final int origSize;
	public MovingFFT(int size, double sampleRate) {
		super(Integer.highestOneBit(size)*2);
		this.origSize = size;
		this.sampleRate = sampleRate;
	}
	public Result add(double value) {
		super.add(value);		
		
		double[] valuesArray = new double[size] ;
		int i = 0;
		for (Double v: values) {
			valuesArray[i++] = v;
		}
					
		Complex[] complexFFTResult = new FastFourierTransformer().transform(valuesArray);
		for (i = 0; i < complexFFTResult.length; i++) {
			addResult(complexFFTResult[i].abs()/origSize, complexFFTResult.length);
		}
		return getResult();
	}
	protected abstract void addResult(double value, int resultSize);
	protected abstract Result getResult();
}
