package de.hub.clickwatch.recorder.examples.lib;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;

public class MovingFFT implements MathTransformation<Double, Double[]> {
	private final int origSize;
	
	private final Window<Double> window;
	
	public MovingFFT(int size) {
		window = new Window<Double>(Integer.highestOneBit(size)*2);
		this.origSize = size;
	}
	
	@Override
	public Double[] transform(Double value) {
		window.transform(value);		
		double[] valuesArray = new double[window.size()] ;
		int i = 0;
		for (Double v: window.values()) {
			valuesArray[i++] = v;
		}
					
		Complex[] complexFFTResult = new FastFourierTransformer().transform(valuesArray);
		// only the first half of the FFT is reasonable, the other half is just a mirror of the first
		int resultLength = (complexFFTResult.length / 2) + 1;
		Double[] fftResult = new Double[resultLength];		
		for (i = 0; i < resultLength; i++) {
			fftResult[i] = complexFFTResult[i].abs()/origSize;
		}
		return fftResult;
	}	
}
