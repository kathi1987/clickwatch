package de.hub.clickwatch.recorder.examples;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyleContext.SmallAttributeSet;

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
import de.hub.clickwatch.recorder.examples.lib.RemoveOffset;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;
import de.hub.clickwatch.specificmodels.brn.seismo_small.C;
import de.hub.clickwatch.specificmodels.brn.seismo_small.Small;
import de.hub.clickwatch.specificmodels.brn.seismo_small.V;

public class SimpleSeismoPlotAnalysis implements IClickWatchMain {

	@Inject private DataBaseUtil dbUtil;
	
	private static class FFT {
		final double sampleRate;
		public FFT(double sampleRate) {
			super();
			this.sampleRate = sampleRate;
		}
		List<Double> values = new ArrayList<Double>();
		void add(double value) {
			values.add((Double)value);
		}
		void getResults(Result result, Object series) {
			int size = Integer.highestOneBit(values.size())*2;		
			
			double[] valuesArray = new double[size];
			for (int i = 0; i < values.size(); i++) {
				valuesArray[i] = values.get(i);
			}
						
			Complex[] complexFFTResult = new FastFourierTransformer().transform(valuesArray);
			for (int i = 0; i < complexFFTResult.length; i++) {
				double x = ((double)i)*sampleRate/(double)valuesArray.length;
				double y = complexFFTResult[i].abs()/size;
				if (x > sampleRate/2) {
					break;
				}
				result.getDataSet().add(series, x, y);
			}
		}
	}
	
	private static class FFTSet {
		private double sampleRate;
		Map<Object, FFT> ffts = new HashMap<Object, SimpleSeismoPlotAnalysis.FFT>();
		
		public FFTSet(double sampleRate) {
			super();
			this.sampleRate = sampleRate;
		}

		void add(Object series, double value) {
			FFT fft = ffts.get(series);
			if (fft == null) {
				fft = new FFT(sampleRate);
				ffts.put(series, fft);
			}
			fft.add(value);
		}
		
		void getResults(Result result) {
			for (Object key: ffts.keySet()) {
				ffts.get(key).getResults(result, key);
			}
		}
	}
	
	private double nodeId(Node node) {
		String ip = node.getINetAddress();
		return new Double(ip.substring(ip.lastIndexOf(".")+1));
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		Result result = ctx.getAdapter(IResultsProvider.class).getResult("SeismoPlotAnalysis");
		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		FFTSet ffts = new FFTSet(100);
		for (Node node: nodes) {
			long time = 0;
			long duration = (long)((record.getEnd() - record.getStart())/ 1e6);
			RemoveOffset ro0 = new RemoveOffset(500);
			RemoveOffset ro1 = new RemoveOffset(500);
			RemoveOffset ro2 = new RemoveOffset(500);	
			
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(
					createHandle(record, node.getINetAddress(), "seismo/latestchannelinfos"),
					new SubProgressMonitor(monitor, 100));
			double nodeId = nodeId(node);
			while(iterator.hasNext()) {
				Latestchannelinfos handler = (Latestchannelinfos)iterator.next();
				for (Channel_info info: handler.getChannel_infos().getChannel_info()) {
					time += 10;
					if (time < 5000) {
						continue;
					}
					
					double value0 = ro0.filter(info.getChannel_0());
					double value1 = ro1.filter(info.getChannel_1());
					double value2 = ro2.filter(info.getChannel_2());
					
					double abs = Math.sqrt(value0*value0+value1*value1+value2*value2);
										
					result.getDataSet().add(0, time, value0);
					result.getDataSet().add(1, time, value1);
					result.getDataSet().add(2, time, value2);
					
					result.getDataSet().add(4, time, abs);
					
					ffts.add(0, value0);
					ffts.add(1, value1);
					ffts.add(2, value2);
				}
				
				EcoreUtil.delete(handler);
			}
		}
		
		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "channel", "time", "acc"));		
		result.exportCSV("seismo_out.csv");
		
		Result fftResult = ctx.getAdapter(IResultsProvider.class).getResult("FFT");
		ffts.getResults(fftResult);	
		fftResult.getCharts().add(ChartUtil.createXYChart("fft", "Channel", "Hz", "Y"));
		
		
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, SimpleSeismoPlotAnalysis.class);
	}
}
