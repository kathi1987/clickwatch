package de.hub.clickwatch.recorder.examples;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.analysis.plot.lib.AvgBinning;
import de.hub.clickwatch.analysis.plot.lib.MathTransformation;
import de.hub.clickwatch.analysis.plot.lib.MovingFFT;
import de.hub.clickwatch.analysis.plot.lib.RemoveOffset;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;

public class SeismoBusAnalysisAlg implements IAnalysisAlgorithm {

	/**
	 * This mathematical transformation transforms a time signal into a time
	 * signal that plots the average of amplitudes in a specific band of frequencies
	 * in the source signal.
	 */
	private static class SeismoFrequenceTransformation implements MathTransformation<Double, Double> {
		private final MovingFFT movingFFT;
		private final RemoveOffset removeOffset;
		private final int bins;
		private final int bin;
		
		public SeismoFrequenceTransformation(int removeOffsetWindowSize, int fftWindowSize, int bins, int bin) {
			removeOffset = new RemoveOffset(removeOffsetWindowSize);
			movingFFT = new MovingFFT(fftWindowSize);
			this.bins = bins;
			this.bin = bin;
		}
		
		@Override
		public Double transform(Double value) {
			// first step, we remove the offset from the time signal
			Double valueWithoutOffset = removeOffset.transform(value);
			// second step, we compute the FFT of a window behind the current value
			Double[] fft = movingFFT.transform(valueWithoutOffset);
			// third step, we bin the FFT result into equal bins and calculate
			// the average of all the values in each bin
			Double[] binnings = new AvgBinning(fft.length / bins).transform(fft);
			// forth step, we select the bin that represents the wanted frequencies
			return binnings[bin];
		}		
	}
	
	private Result result = null;
	private long start = -1;
	
	@Override
	public void initialize(IAnalysisContainer container) {
//		setWindowInMS(13*3600*1000, 10*60*1000);
		container.addObservedHandler("seismo/localchannelinfo");
	}

	@Override
	public void analyse(IAnalysisContainer container, Node node,
			IProgressMonitor monitor) {
		
		// initialization and GUI-stuff
		IClickWatchContext ctx = container.getContext();
		if (result == null) {
			result = ctx.getAdapter(IResultsProvider.class).getResults().getGroup("SeismoBusAnalysis").getResult(node.getINetAddress());
			result.getData().getEntries().clear();
			result.getCharts().clear();
			result.getCharts().add(ChartUtil.createXYChart("SeismoBus " + node.getINetAddress(), "bin", "t", "ampl"));
		}
		
		// parameter definition
		int sampleRateInHz = 100; // we sample the seismo sensors in all three channels at 100 Hz
		int removeOffsetWindowInSeconds = 10; // this is the window size for the moving average used to null the seismo time signal
		int fftWindowInSeconds = 1; // this is the window size used for continuous FFTing the last x seconds 
		// an FFT of an 100 Hz sample, gives us the spectrum from 0 to 50 Hz (1/2 of the sample rate)
		// we further bin each FFT result
		int bins = 10; // use x bins to bin each FFT result
		int bin = 2; // select the xth bin as the transformation result
		
		// create three transformations, one for each channel
		SeismoFrequenceTransformation[] seismoTrans = new SeismoFrequenceTransformation[] {
			new SeismoFrequenceTransformation(removeOffsetWindowInSeconds*sampleRateInHz, fftWindowInSeconds*sampleRateInHz, bins, bin),
			new SeismoFrequenceTransformation(removeOffsetWindowInSeconds*sampleRateInHz, fftWindowInSeconds*sampleRateInHz, bins, bin),
			new SeismoFrequenceTransformation(removeOffsetWindowInSeconds*sampleRateInHz, fftWindowInSeconds*sampleRateInHz, bins, bin)			
		};
		
		// create a data base iterator that iterates through seismo data sets in the order they were recorded
		Iterable<Localchannelinfo> dataBaseIterator = container.createIterator(node, "seismo/localchannelinfo", Localchannelinfo.class, monitor);
		// use the iterator to actually go through the data base
		for (Localchannelinfo latestChannelInfo: dataBaseIterator) {
			// iterate to each seismo data set
			for (V value: latestChannelInfo.getC().getV()) {

				// each datum has a timestamp attached, we store the first time as "point 0" on the time scale
				if (start == -1) {
					start = value.getT();
				}
				
				// norm the time based on "point 0"
				long time = value.getT() - start;
				double dtime = time / 1e6;
				
				// apply the seismo transformation on the value from each channel and store the results with the current time
				result.getData().add(0, dtime, seismoTrans[0].transform((double)value.getC0()));
				result.getData().add(1, dtime, seismoTrans[1].transform((double)value.getC1()));
				result.getData().add(2, dtime, seismoTrans[2].transform((double)value.getC2()));
			}
			// this removes the data set read from the db from memory (there might be cycles in the data structure)
			EcoreUtil.delete(latestChannelInfo);
		}
		
		// some more GUI-stuff
		container.shiftResultWindow(result, 60, 1);
		container.updateResult(result);
	}
}
