package de.hub.clickwatch.recorder.examples;


public class SimpleSeismoPlotAnalysis extends AnalysisContainer {

	public SimpleSeismoPlotAnalysis() {
		super(new SeismoAmplAnalysisAlg());
	}

//	@Inject private DataBaseUtil dbUtil;
//	
//	private long start = (long)(13*3600*1e9);
//	private long end = (long)(13.5*3600*1e9);
//	
//	private static class FFT {
//		final double sampleRate;
//		public FFT(double sampleRate) {
//			super();
//			this.sampleRate = sampleRate;
//		}
//		List<Double> values = new ArrayList<Double>();
//		void add(double value) {
//			values.add((Double)value);
//		}
//		void getResults(Result result, Object series) {
//			int size = Integer.highestOneBit(values.size())*2;		
//			
//			double[] valuesArray = new double[size];
//			for (int i = 0; i < values.size(); i++) {
//				valuesArray[i] = values.get(i);
//			}
//						
//			Complex[] complexFFTResult = new FastFourierTransformer().transform(valuesArray);
//			for (int i = 0; i < complexFFTResult.length; i++) {
//				double x = ((double)i)*sampleRate/(double)valuesArray.length;
//				double y = complexFFTResult[i].abs()/size;
//				if (x > sampleRate/2) {
//					break;
//				}
//				result.getDataSet().add(series, x, y);
//			}
//		}
//	}
//	
//	private static class FFTSet {
//		private double sampleRate;
//		Map<Object, FFT> ffts = new HashMap<Object, SimpleSeismoPlotAnalysis.FFT>();
//		
//		public FFTSet(double sampleRate) {
//			super();
//			this.sampleRate = sampleRate;
//		}
//
//		void add(Object series, double value) {
//			FFT fft = ffts.get(series);
//			if (fft == null) {
//				fft = new FFT(sampleRate);
//				ffts.put(series, fft);
//			}
//			fft.add(value);
//		}
//		
//		void getResults(Result result) {
//			for (Object key: ffts.keySet()) {
//				ffts.get(key).getResults(result, key);
//			}
//		}
//	}
//	
//	private String nodeId(Node node) {
//		String ip = node.getINetAddress();
//		return ip.substring(ip.lastIndexOf(".")+1);
//	}
//	
//	@Override
//	public void main(IClickWatchContext ctx) {
//		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
//		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
//		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
//		Results plaintResults = ctx.getAdapter(IResultsProvider.class).getResults().createNewGroup("PlainSeismoPlot");
//		Results cleanResults = ctx.getAdapter(IResultsProvider.class).getResults().createNewGroup("CleanSeismoPlot");
//		
//		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
//		FFTSet ffts = new FFTSet(100);
//		for (Node node: nodes) {
//			Result plainResult = plaintResults.getResult(nodeId(node));
//			plainResult.getCharts().add(ChartUtil.createXYChart("Plot over time", "channel", "time", "acc"));
//			plainResult.getDataSet().getEntries().clear();
//			
//			Result cleanResult = cleanResults.getResult(nodeId(node));
//			cleanResult.getCharts().add(ChartUtil.createXYChart("Plot over time", "channel", "time", "acc"));
//			cleanResult.getDataSet().getEntries().clear();
//			
//			long time = 0;
//			long duration = (long)((record.getEnd() - record.getStart())/ 1e6);
//			RemoveOffset ro0 = new RemoveOffset(500);
//			RemoveOffset ro1 = new RemoveOffset(500);
//			RemoveOffset ro2 = new RemoveOffset(500);	
//			
//			long start = record.getStart() + (this.start > 0 ? this.start : 0);
//			long end = record.getStart() + (this.end > 0 ? this.end : record.getEnd() - record.getStart());
//			
//			Iterator<Handler> iterator = dbUtil.getHandlerIterator(
//					createHandle(record, node.getINetAddress(), "seismo/small",
//							start, end), new SubProgressMonitor(monitor, 100));
//			while(iterator.hasNext()) {
//				Small handler = (Small)iterator.next();
//				for (V info: handler.getC().getV()) {
//					time += 10;
//					if (time < 5000) {
//						continue;
//					}
//					
//					double value0 = info.getC0();
//					double value1 = info.getC1();
//					double value2 = info.getC2();
//					
//					double rov0 = ro0.filter(info.getC0());
//					double rov1 = ro1.filter(info.getC1());
//					double rov2 = ro2.filter(info.getC2());
//			
//					plainResult.getDataSet().add(0, time, value0);
//					plainResult.getDataSet().add(1, time, value1);
//					plainResult.getDataSet().add(2, time, value2);
//					
//					plainResult.getDataSet().add(4, time, Math.sqrt(Math.pow(value0, 2)+Math.pow(value1, 2)+Math.pow(value2, 2)));
//					
//					cleanResult.getDataSet().add(0, time, rov0);
//					cleanResult.getDataSet().add(1, time, rov1);
//					cleanResult.getDataSet().add(2, time, rov2);
//					
////					ffts.add(0, value0);
////					ffts.add(1, value1);
////					ffts.add(2, value2);
//				}
//				
//				EcoreUtil.delete(handler);
//			}
//		}
//		
////		Result fftResult = ctx.getAdapter(IResultsProvider.class).getResult("FFT");
////		ffts.getResults(fftResult);	
////		fftResult.getCharts().add(ChartUtil.createXYChart("fft", "Channel", "Hz", "Y"));
//		
//		
//		ctx.getAdapter(IResultsProvider.class).saveResults();
//		monitor.done();
//	}
//
//	public static final void main(String args[]) {
//		ClickWatchExternalLauncher.launch(args, SimpleSeismoPlotAnalysis.class);
//	}
}
