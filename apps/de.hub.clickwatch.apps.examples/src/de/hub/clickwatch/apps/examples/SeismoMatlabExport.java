package de.hub.clickwatch.apps.examples;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncinfo;
import de.hub.clickwatch.specificmodels.brn.tsi_syncinfo.Syncpacket;

public class SeismoMatlabExport implements IClickWatchMain {

	@Inject private DataBaseUtil dbUtil;
	int finishedRunner = 0;
	
	private long start = 0; //(long)(357*1e6);
	private long end = 0; //(long)(644*1e6); // (long)(14*3600*1e9);
	
	private static class Avg {
		Queue<Integer> values = new ConcurrentLinkedQueue<Integer>();
		final int size;
		double sum = 0;
		
		public Avg(int size) {
			this.size = size;
		}

		int filter(int value) {
			values.add(value);
			if (values.size() > size) {
				sum -= values.poll();
			}
			sum += value;
			
			return (int)(sum/values.size());
		}
	}
	
	private static class TimeSyncMap extends HashMap<String, Map<Integer, Long>> {
		private static final long serialVersionUID = 1L;
		String baseIp = null;
		
		public TimeSyncMap() {
			// empty
		}
		
//		TimeSyncMap(String fileName) {
//			try {
//				CSVParser csvParser = new CSVParser(new FileReader(new File(fileName)), new CSVStrategy(' ', '\n', '#'));
//				String[][] timeSyncMatrix = csvParser.getAllValues();
//							
//				for (String[] entry: timeSyncMatrix) {
//					String ip = entry[0];
//					int key = Integer.parseInt(entry[2]);
//					
//					String timeStr = entry[1];
//					String timeParts[] = timeStr.split("\\.");
//					long time = Long.parseLong(timeParts[0])*(long)1e9+Long.parseLong(timeParts[1]);
//					time = time / 1000;
//					
//					if (baseIp == null) {
//						baseIp = ip;
//					}
//					add(ip, key, time);
//				}
//			} catch (Exception e) {
//				Throwables.propagate(e);
//			}
//		}
		
		public void add(String ip, int key, long time) {
			Map<Integer, Long> times = get(ip);
			if (times == null) {
				times = new HashMap<Integer, Long>();
				put(ip, times);
			}
			times.put(key, time);
		}
		
		private int getClosestKey(String ip, long targetTime) {
			Map<Integer, Long> map = get(ip);
			int max_key = 0;
			for(int key: map.keySet()) {
				max_key = Math.max(max_key, key);
				long time = map.get(key);
				if (time > targetTime) {
					return key;
				}
			}
			return max_key;
		}
		
		private long getTime(String ip, int key) {
			return get(ip).get(key);
		}
		
		public long correctTime(String ip, long measuredTime) {
			int key = getClosestKey(ip, measuredTime);
			if (baseIp == null) {
				baseIp = ip;
			}
			if (ip.equals(baseIp)) {
				return measuredTime;
			} else {
				long referenceBaseTime = getTime(baseIp, key);
				long referenceLocalTime = getTime(ip, key);
				System.out.println(referenceLocalTime - referenceBaseTime);
				return measuredTime - (referenceLocalTime - referenceBaseTime);	
			}			
		}
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		final Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		//Result result = ctx.getAdapter(IResultsProvider.class).createNewResult("SeismoPlotAnalysis");
		final IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		String prefix = "/media/samba/experiments/" + record.getName() + "/";
		
		PrintStream out = null;
		PrintStream syncOut = null;
		try {
			out = new PrintStream(new File(prefix + "seismo_out.csv"));
			syncOut = new PrintStream(new File(prefix + "seismo_synced_out.csv"));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		final PrintStream fout = out;
		final PrintStream fsyncOut = syncOut;
		
		final TimeSyncMap timeSyncMap = new TimeSyncMap();
		
		// collect the time sync information from all nodes
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		for(final Node node: nodes) {
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(
					createHandle(record, node.getINetAddress(), "tsi/syncinfo", 0, Long.MAX_VALUE),
					new SubProgressMonitor(monitor, 100));
			iteratorLoop: while(iterator.hasNext()) {						
				Syncinfo syncinfo = null;
				try {
					syncinfo = (Syncinfo)iterator.next();
				} catch (Exception e) {			
					System.out.println(e);
				}
				if (syncinfo == null) {
					continue iteratorLoop;
				}
				
				for(Syncpacket packet: syncinfo.getTimesyncinfo().getSyncpacket()) {
					int id = packet.getId();
					long time_us = packet.getTime();
					timeSyncMap.add(node.getINetAddress(), id, time_us);
				}
				
				finishedRunner++;
			}
		}
		monitor.done();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		finishedRunner = 0;
		nodeLoop: for (final Node node: nodes) {
			if (node.getINetAddress().endsWith("134")) {
				continue nodeLoop;
			}
			Thread nodeRunner = new Thread(new Runnable() {
				
				@Override
				public void run() {
					long time = 0;
					
					Avg mean1 = new Avg(1000);
//					Avg mean2 = new Avg(3000);
//					Avg mean3 = new Avg(3000);
					
					long start = record.getStart() + (SeismoMatlabExport.this.start > 0 ? SeismoMatlabExport.this.start : 0);
					long end = record.getStart() + (SeismoMatlabExport.this.end > 0 ? SeismoMatlabExport.this.end : record.getEnd() - record.getStart());
					
					Iterator<Handler> iterator = dbUtil.getHandlerIterator(
							createHandle(record, node, "seismo/localchannelinfo", start, end),
							new SubProgressMonitor(monitor, 100));
					String nodeId = nodeId(node).toString();
					iteratorLoop: while(iterator.hasNext()) {
						try {
							Localchannelinfo handler = (Localchannelinfo)iterator.next();
							if (handler == null) {
								continue iteratorLoop;
							}
							
							for (V info: handler.getC().getV()) {		
								
								int value0 = info.getC0() - mean1.filter(info.getC0());					
	//							int value1 = info.getC1() - mean2.filter(info.getC1());
	//							int value2 = info.getC2() - mean3.filter(info.getC2());
								
	//							result.getDataSet().add(nodeId, 1, time, value1);					
	//							result.getDataSet().add(nodeId, 2, time, value2);	
	//							result.getDataSet().add(nodeId, 0, time, value0);
					
								print(fout, nodeId, 0, time, value0, info.getS());
								try {
									print(fsyncOut, nodeId, 0, time, value0, timeSyncMap.correctTime(node.getINetAddress(), info.getS()));
								} catch (Exception e) {
									System.out.println("dropping value of node " + node.getINetAddress() + " due to exception in syncing " + e.getClass().getSimpleName() + ": " + e.getMessage());		
								}
								
	//							print(fout, nodeId, 1, time, value1, info.getT());
	//							print(fout, nodeId, 2, time, value2, info.getT());			
								
								time += 10;
							}
							
							EcoreUtil.delete(handler);
						} catch (Exception e) {
							System.out.println("dropping value of node " + node.getINetAddress() + " due to exception " + e.getClass().getSimpleName() + ": " + e.getMessage());
						}
					}
					finishedRunner++;
				}


			});
			nodeRunner.setName("Export seismo " + node.getINetAddress());
			nodeRunner.start();
		}
		
		waitForAllRunnersFinished(nodes.length);
		out.close();
		
//		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "channel", "time", "acc"));		
//		result.exportCSV("seismo_out.csv");
		
//		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}
	
	private Integer nodeId(Node node) {
		String[] parts = node.getINetAddress().split("\\.");
		return Integer.parseInt(parts[parts.length - 1]);
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
	
	private synchronized void print(PrintStream out, String nodeId, int channel, long time, int value, long nt) {
		out.print(nodeId);
		out.print(" ");
		out.print(channel);
		out.print(" ");
		out.print(time);
		out.print(" ");
		out.print(value);
		out.print(" ");
		out.print(nt);
		out.print("\n");
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, SeismoMatlabExport.class);
	}
}
