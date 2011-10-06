package de.hub.clickwatch.recorder.examples.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Axis;
import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.ui.AbstractRuntimeAnalysis;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;

public class RuntimeSeismoAnalysis extends AbstractRuntimeAnalysis {
	
	@Inject private BrnValueAdapter brnValueAdapter;
	@Inject private StringValueAdapter stringValueAdapter;
	
	private long time = 0;
	
	@Override
	protected void continiousAnalysis(Result[] results, Queue<Handler> data) {
		cutOffDataForDuration(500);
		Result ampResult = results[0];
		Result fftResult = results[1];
		
		ampResult.getDataSet().getEntries().clear();
		fftResult.getDataSet().getEntries().clear();
		FFTSet ffts = new FFTSet(100);
		
		Mean mean1 = new Mean();
		Mean mean2 = new Mean();
		Mean mean3 = new Mean();
 		
		for (Handler unspecificHandler: data) {
			Latestchannelinfos handler = (Latestchannelinfos)unspecificHandler;
			for (Channel_info channel_info: handler.getChannel_infos().getChannel_info()) {
				int value0 = channel_info.getChannel_0() - mean1.filter(channel_info.getChannel_0());
				int value1 = channel_info.getChannel_1() - mean2.filter(channel_info.getChannel_1());
				int value2 = channel_info.getChannel_2() - mean3.filter(channel_info.getChannel_2());
				long time = channel_info.getTime();
				if (this.time == 0) {
					this.time = time;
				}
				time -= this.time;
				double dtime = time / 1000000.0;
				
				ampResult.getDataSet().add(0, dtime, value0);
				ampResult.getDataSet().add(1, dtime, value1);
				ampResult.getDataSet().add(2, dtime, value2);
				
				ffts.add(0, value0);
				ffts.add(1, value1);
				ffts.add(2, value2);				
			}
			ffts.getResults(fftResult);
		}		
	}

	@Override
	protected Result[] createResults() {
		this.time = 0;
		return new Result[] {
				getContext().getAdapter(IResultsProvider.class).createNewResult("SeismoAmpl"),
				getContext().getAdapter(IResultsProvider.class).createNewResult("SeismoFFT")
		};
	}

	@Override
	protected void prepareResults(Result[] results) {
		
		Chart amplChart = ChartUtil.createXYChart("Ampl", "channel", "time", "ampl");	
		((Axis)amplChart.getValueSpecs().get(2)).setFrom(-3000);
		((Axis)amplChart.getValueSpecs().get(2)).setTo(3000);
		results[0].getCharts().add(amplChart);
		
		Chart fftChart = ChartUtil.createXYChart("FFT", "channel", "freq:Hz", "y");
		((Axis)fftChart.getValueSpecs().get(2)).setFrom(0);
		((Axis)fftChart.getValueSpecs().get(2)).setTo(300);
		results[1].getCharts().add(fftChart);
	}

	@Override
	protected Handler getData(Node node, Handler handler) {
		if (handler.getQualifiedName().equals("seismo/latestchannelinfos")) {
			return brnValueAdapter.create(handler, stringValueAdapter);
		} else {
			return null;
		}
	}

	private static class Mean {
		double mean = 0;
		int samples = 0;
		int filter(int value) {
			mean = (mean*samples + value)/++samples;
			return (int)mean;
		}
	}
	
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
		Map<Object, FFT> ffts = new HashMap<Object, RuntimeSeismoAnalysis.FFT>();
		
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
}
