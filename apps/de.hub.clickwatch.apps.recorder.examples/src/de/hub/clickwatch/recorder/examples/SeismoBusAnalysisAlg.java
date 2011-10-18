package de.hub.clickwatch.recorder.examples;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.analysis.results.EqualsConstraint;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.ResultsFactory;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.examples.lib.AvgBinning;
import de.hub.clickwatch.recorder.examples.lib.MovingFFT;
import de.hub.clickwatch.recorder.examples.lib.RemoveOffset;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;

public class SeismoBusAnalysisAlg implements IAnalysisAlgorithm {

	private static class BinnedMovingFFTsOverTime {
		protected final int numberOfBins;
		private MovingFFT<AvgBinning> movingFFTReturnsBins = null;	
		private RemoveOffset cleanAvg = null;
		public BinnedMovingFFTsOverTime(int numberOfBins, int sampleRate, int movingFFTSize, int movingAvgSize) {
			super();
			this.numberOfBins = numberOfBins;
			this.movingFFTReturnsBins = new MovingFFT<AvgBinning>(movingFFTSize, sampleRate) {
				AvgBinning binning = null;
				@Override
				protected void addResult(double value, int resultSize) {
					if (binning == null) {
						binning = new AvgBinning(BinnedMovingFFTsOverTime.this.numberOfBins, resultSize);
					}
					binning.add(value);
				}

				@Override
				protected AvgBinning getResult() {
					AvgBinning result = binning;
					binning = null;
					return result;
				}
			};
			this.cleanAvg = new RemoveOffset(movingAvgSize);
		}
		
		public void add(double time, double value) {
			AvgBinning binning = movingFFTReturnsBins.add(cleanAvg.filter(value));
			int i = 0;
			for(double bin: binning.getBins()) {
				add(i++, time, bin);
			}
		}
		protected void add(int bin, double time, double value) {
			// empty
		}
	}

	private Result result = null;
	private long start = -1;
	
	private BinnedMovingFFTsOverTime bmffChannel0 = new BinnedMovingFFTsOverTime(10, 100, 100, 5000) {
		@Override
		protected void add(int bin, double time, double value) {
			result.getDataSet().add(bin, time, value);
		}
	};

	@Override
	public void initialize(IAnalysisContainer container) {
//		setWindowInMS(13*3600*1000, 10*60*1000);
		container.addObservedHandler("seismo/localchannelinfo");
	}

	@Override
	public void analyse(IAnalysisContainer container, Node node,
			IProgressMonitor monitor) {
		
		IClickWatchContext ctx = container.getContext();
		if (result == null) {
			result = ctx.getAdapter(IResultsProvider.class).getResults().getGroup("SeismoBusAnalysis").getResult(node.getINetAddress());
			result.getDataSet().getEntries().clear();
			result.getCharts().clear();
			result.getCharts().add(ChartUtil.createXYChart("SeismoBus " + node.getINetAddress(), "bin", "t", "ampl"));
			EqualsConstraint constraint = ResultsFactory.eINSTANCE.createEqualsConstraint();
			constraint.setConstraint(new Integer(1));
			result.getCharts().get(0).getValueSpecs().get(0).setConstraint(constraint);
		}		
		
		for (Localchannelinfo small: container.createIterator(node, "seismo/localchannelinfo", Localchannelinfo.class, monitor)) {
			for (V value: small.getC().getV()) {

				if (start == -1) {
					start = value.getT();
				}
				
				long time = value.getT() - start;
				double dtime = time / 1e6;
				
				bmffChannel0.add(dtime, value.getC0());
			}
			EcoreUtil.delete(small);
		}
		
		container.shiftResultWindow(result, 60, 1);
		container.updateResult(result);
	}
}
