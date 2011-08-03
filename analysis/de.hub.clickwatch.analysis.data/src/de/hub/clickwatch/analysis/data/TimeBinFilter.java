package de.hub.clickwatch.analysis.data;


public class TimeBinFilter implements IFilter {
	
	private final double length;
	private double current = -1;
	private double[] sum = null;
	private int samples = 0;
	
	
	public TimeBinFilter(double length) {
		this.length = length;
	}

	@Override
	public double[] filter(double... values) {
		double[] result = null;
		double time = values[0];
		if (current == -1) {
			current = time;
		}
		if (sum == null) {
			sum = new double[values.length];
		}
		for (int i = 0; i < values.length; i++) {
			sum[i] += values[i];
		}
		samples++;
		if (time - current >= length) {
			for (int i = 0; i < sum.length; i++) {
				sum[i] /= samples;
			}
			result = sum;
			samples = 0;
			current = time;
			sum = null;
		}
		return result;
	}
}
