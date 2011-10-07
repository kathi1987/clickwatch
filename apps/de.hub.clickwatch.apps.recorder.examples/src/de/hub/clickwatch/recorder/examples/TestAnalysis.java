package de.hub.clickwatch.recorder.examples;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.examples.lib.MovingAvg;
import de.hub.clickwatch.recorder.examples.lib.Window;
import de.hub.clickwatch.specificmodels.brn.seismo_small.Small;
import de.hub.clickwatch.specificmodels.brn.seismo_small.V;

public class TestAnalysis implements IClickWatchMain {

	@Inject private DataBaseUtil dbUtil;
	int finishedRunner = 0;
	
	private static abstract class MovingFFT<Result> extends Window<Double> {
		private final double sampleRate;
		public MovingFFT(int size, double sampleRate) {
			super(Integer.highestOneBit(size)*2);
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
//				double x = ((double)i)*sampleRate/(double)valuesArray.length; 
				addResult(complexFFTResult[i].abs()/size, complexFFTResult.length);
			}
			return getResult();
		}
		protected abstract void addResult(double value, int resultSize);
		protected abstract Result getResult();
	}
	
	private double[] fft(double[] values, double sampleRate) {
		int size = Integer.highestOneBit(values.length)*2;
		double[] ivalues = new double[size];
		for (int i = 0; i < values.length; i++) {
			ivalues[i] = values[i];
		}
		Complex[] complexFFTResult = new FastFourierTransformer().transform(ivalues);
		double[] result = new double[complexFFTResult.length];
		for (int i = 0; i < complexFFTResult.length; i++) {
			double x = ((double)i)*sampleRate/(double)ivalues.length;
			result[i] = complexFFTResult[i].abs();
//			addResult(complexFFTResult[i].abs()/size, complexFFTResult.length);
		}
		return result;
	}
	
	private static abstract class Binning<T> {
		protected final int size;
		protected final List<T> bins = new ArrayList<T>();
		private int currentSize = 0;
		public Binning(int size) {
			super();
			this.size = size;
		}
		public void add(T value) {
			addToBin(value);
			currentSize++;
			if (currentSize >= size) {
				bins.add(closeBin());
			}
		}
		public List<T> getBins() {
			return bins;
		}
		protected abstract void addToBin(T value);
		protected abstract T closeBin();
	}
	
	private static class AvgBinning extends Binning<Double> {
		private double sum = 0;

		public AvgBinning(int size) {
			super(size);
		}
		
		public AvgBinning(int numberOfBins, int expectedNumberOfValue) {
			this(expectedNumberOfValue / numberOfBins);
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
	
	private static class BinnedMovingFFTsOverTime {
		protected final int numberOfBins;
		private MovingFFT<AvgBinning> fft = null;	
		private MovingAvg movingAvg = null;
		public BinnedMovingFFTsOverTime(int numberOfBins, int sampleRate, int movingFFTSize, int movingAvgSize) {
			super();
			this.numberOfBins = numberOfBins;
			this.fft = new MovingFFT<AvgBinning>(movingFFTSize, sampleRate) {
				AvgBinning binning = null;
				@Override
				protected void addResult(double value, int resultSize) {
					if (binning == null) {
						binning = new AvgBinning(10, resultSize);
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
			this.movingAvg = new MovingAvg(movingAvgSize);
		}
		
		public void add(long time, int value) {
			AvgBinning binning = fft.add(movingAvg.filter(value));
			int i = 0;
			for(double bin: binning.bins) {
				add(i++, time, bin);
			}
		}
		protected void add(int bin, long time, double value) {
			// empty
		}
	}
	
	private Integer nodeId(Node node) {
		String ip = node.getINetAddress();
		return new Integer(ip.substring(ip.lastIndexOf(".")+1));
	}
	
	private synchronized void add(Result result, int nodeId, int channel, int bin, long time, double value) {
//		result.getDataSet().add(nodeId, channel, bin, time, value);
		result.getDataSet().add(bin, time, value);
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		final Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		final Result result = ctx.getAdapter(IResultsProvider.class).getResults().getResult("TestResult");
		result.getDataSet().getEntries().clear();
		final IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		double sampleRate = 2000;
		double duration = 1;
		int numberOfValues = (int)(duration * sampleRate);
		
		double a1 = 10;
		double f1 = 5;
		double a2 = 5;
		double f2 = 200;
		
		
		monitor.beginTask("Performing analysis", numberOfValues);
		MovingAvg mavg = new MovingAvg((int)(sampleRate/10));
		
		double[] fftInput = new double[numberOfValues];
		for(double i = 0; i < numberOfValues; i++) {
		
			double y = a1*Math.sin(i*f1*2*Math.PI/sampleRate) + 
					a2*Math.sin(i*f2*2*Math.PI/sampleRate) +
					2*a2*Math.sin(i*2*f2*2*Math.PI/sampleRate);
			
			fftInput[(int)i] = y;
			double t = i / sampleRate;
			result.getDataSet().add(0, t, y);
			result.getDataSet().add(1, t, mavg.filter(y));
			monitor.worked(1);
		}
		
		final Result fftResultResult = ctx.getAdapter(IResultsProvider.class).getResults().getResult("TestFFTResult");
		fftResultResult.getDataSet().getEntries().clear();
		
		AvgBinning avgBinning = new AvgBinning(5, (int)sampleRate);
		double fftResult[] = fft(fftInput, sampleRate);
		for(int i = 0; i < fftResult.length; i++) {
			double x = ((double)i)*sampleRate/(double)fftResult.length;
			avgBinning.add(fftResult[i]);
			if (x > sampleRate/2) {
				break;
			}
			fftResultResult.getDataSet().add(2, x, fftResult[i]);			
		}
		fftResultResult.getCharts().add(ChartUtil.createXYChart("FFT", "s", "x", "y"));
		
		for(double b: avgBinning.getBins()) {
			System.out.println("#" + b);
		}
		
		result.getCharts().add(ChartUtil.createXYChart("Plot", "s", "x", "y"));
		monitor.done();
		
//		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
//		finishedRunner = 0;
//		for (final Node node: nodes) {
//			Thread nodeRunner = new Thread(new Runnable() {
//				
//				@Override
//				public void run() {
//					long time = 0;
//					final int nodeId = nodeId(node);
//					BinnedMovingFFTsOverTime calculation0 = new BinnedMovingFFTsOverTime(10, 100, 500, 5000) {
//						@Override
//						protected void add(int bin, long time, double value) {
//							TestAnalysis.this.add(result, nodeId, 0, bin, time, value);
//						}
//					};
////					BinnedMovingFFTsOverTime calculation1 = new BinnedMovingFFTsOverTime(10, 100, 500, 5000) {
////						@Override
////						protected void add(int bin, long time, double value) {
////							ComplexSeismoPlotAnalysis.this.add(result, nodeId, 1, bin, time, value);
////						}
////					};
////					BinnedMovingFFTsOverTime calculation2 = new BinnedMovingFFTsOverTime(10, 100, 500, 5000) {
////						@Override
////						protected void add(int bin, long time, double value) {
////							ComplexSeismoPlotAnalysis.this.add(result, nodeId, 2, bin, time, value);
////						}
////					};
//								
//					Iterator<Handler> iterator = dbUtil.getHandlerIterator(
//							createHandle(record, node.getINetAddress(), "seismo/small", record.getEnd()-(long)(20*1E9), record.getEnd()),
//							new SubProgressMonitor(monitor, 100));
//					while(iterator.hasNext()) {
//						Small handler = (Small)iterator.next();
//						for (V info: handler.getC().getV()) {		
//							calculation0.add(time, info.getC0());
////							calculation1.add(time, info.getC1());
////							calculation2.add(time, info.getC2());
//										
//							time += 10;
//						}
//						
//						EcoreUtil.delete(handler);
//					}
//					finishedRunner++;
//				}
//			});
//			nodeRunner.start();
//		}
//		
//		waitForAllRunnersFinished(nodes.length);
//		
//		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "bin", "time", "ampl"));		
//		//result.exportCSV("seismo_out.csv");
//		
//		ctx.getAdapter(IResultsProvider.class).saveResults();
//		monitor.done();
	}
	
	private synchronized void waitForAllRunnersFinished(int nodes) {
		while(finishedRunner < nodes) {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void print(PrintStream out, String nodeId, int channel, long time, int value) {
		out.print(nodeId);
		out.print(" ");
		out.print(channel);
		out.print(" ");
		out.print(time);
		out.print(" ");
		out.print(value);
		out.print("\n");
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, TestAnalysis.class);
	}
}
