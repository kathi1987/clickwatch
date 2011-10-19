package de.hub.clickwatch.recorder.examples.lib;

public class AvgBinning extends Binning {

	public AvgBinning(int size) {
		super(size, new MathTransformation<Double[], Double>() {
			@Override
			public Double transform(Double[] values) {
				if (values.length == 0) {
					return .0;
				}
				double sum = 0;				
				for(double value: values) {
					sum += value;
				}
				return sum / values.length;
			}
		});
	}
}

