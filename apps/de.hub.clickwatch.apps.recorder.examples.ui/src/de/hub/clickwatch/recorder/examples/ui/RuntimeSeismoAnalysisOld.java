package de.hub.clickwatch.recorder.examples.ui;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.INetworkRecorderDataListener;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.cwdatabase.CWDataBasePackage;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;
import de.hub.clickwatch.util.Throwables;

public class RuntimeSeismoAnalysisOld implements IClickWatchMain, INetworkRecorderDataListener {
	
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
		Map<Object, FFT> ffts = new HashMap<Object, RuntimeSeismoAnalysisOld.FFT>();
		
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
	
	private static long analysisDuration = 5000;
	private static int dataInterval = 10;
	
	private long lastAnalysis = 0;
	@Inject private BrnValueAdapter brnValueAdapter;
	@Inject private StringValueAdapter stringValueAdapter;
	private boolean stopped = false;
	private Node selectedNode = null;
	private Result ampResult = null;
	private Result fftResult = null;
	private Queue<Channel_info> data = new ConcurrentLinkedQueue<Channel_info>();
	private Mean mean1 = new Mean();
	private Mean mean2 = new Mean();
	private Mean mean3 = new Mean();
	
	private synchronized void continiousAnalysis(final long currentTime) {
		int dataSize = data.size();
		int analysisDataSize = (int)analysisDuration / dataInterval;
		if (dataSize >= analysisDataSize) {
			for (int i = analysisDataSize; i < dataSize; i++) {
				data.poll();
			}
			Preconditions.checkState(data.size() == analysisDataSize);
			
			ampResult.getDataSet().getEntries().clear();
			fftResult.getDataSet().getEntries().clear();
			FFTSet ffts = new FFTSet(100);
			
			for (Channel_info channel_info: data) {
				int value0 = channel_info.getChannel_0() - mean1.filter(channel_info.getChannel_0());
				int value1 = channel_info.getChannel_1() - mean2.filter(channel_info.getChannel_1());
				int value2 = channel_info.getChannel_2() - mean3.filter(channel_info.getChannel_2());
				long time = channel_info.getTime();
				
				ampResult.getDataSet().add(0, time, value0);
				ampResult.getDataSet().add(1, time, value1);
				ampResult.getDataSet().add(2, time, value2);
				
				ffts.add(0, value0);
				ffts.add(1, value1);
				ffts.add(2, value2);
			}
			
			if (ampResult.getCharts().size() == 0) {
				ampResult.getCharts().add(ChartUtil.createXYChart("Plot over time", "channel", "time", "acc"));	
			}
			
			ffts.getResults(fftResult);
			if (fftResult.getCharts().size() == 0) {
				fftResult.getCharts().add(ChartUtil.createXYChart("fft", "Channel", "Hz", "Y"));
			}
			
			getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					ampResult.setTimestamp(new Date(currentTime));
					fftResult.setTimestamp(new Date(currentTime));		
				}
			});			
		}
	}

	private Display getDisplay() {
		return PlatformUI.getWorkbench().getDisplay();
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		final Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		ampResult = ctx.getAdapter(IResultsProvider.class).createNewResult("SeismoPlotAnalysis");
		fftResult = ctx.getAdapter(IResultsProvider.class).createNewResult("FFT");
		selectedNode = nodes[0];
		
		NetworkRecorder recorder = record.getNetworkRecorder();
		if (recorder == null) {
			getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					MessageDialog.openInformation(getDisplay().getActiveShell(),
							"Not recording",
							"This analysis is only available during recording.");		
				}
			});
			return;
		}
		stopped = false;
		final AdapterImpl stopAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == CWDataBasePackage.eINSTANCE.getRecord_NetworkRecorder()) {
					if (msg.getNewValue() == null) {
						stopped = true;
					}
				}
			}
		};
		record.eAdapters().add(stopAdapter);
		
		recorder.addDataListener(this);
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				while(!stopped) {
					long currentTime = System.currentTimeMillis();
					if (currentTime - lastAnalysis > 25) {
						continiousAnalysis(currentTime);
						lastAnalysis = currentTime;
					} else {
						try {
							Thread.currentThread().wait(10);
						} catch (InterruptedException e) {
							Throwables.propagate(e);
						}
					}
				}
				record.eAdapters().remove(stopAdapter);
			}
		}).start();
	}

	@Override
	public synchronized void handlerRecorded(Node node, Handler handler) {
		if (node == selectedNode) {
			if (handler.getQualifiedName().equals("seismo/latestchannelinfos")) {
				Latestchannelinfos latestchannelinfos = (Latestchannelinfos)brnValueAdapter.create(handler, stringValueAdapter);
				for (Channel_info channel_info: latestchannelinfos.getChannel_infos().getChannel_info()) {
					data.add(channel_info);
				}
			}			
		}
	}
}
