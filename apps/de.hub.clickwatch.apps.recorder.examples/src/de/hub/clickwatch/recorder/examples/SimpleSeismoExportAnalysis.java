package de.hub.clickwatch.recorder.examples;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
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

public class SimpleSeismoExportAnalysis implements IClickWatchMain {

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
	
	private Integer nodeId(Node node) {
		String ip = node.getINetAddress();
		return new Integer(ip.substring(ip.lastIndexOf(".")+1));
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		final Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		//Result result = ctx.getAdapter(IResultsProvider.class).createNewResult("SeismoPlotAnalysis");
		final IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		PrintStream out = null;
		try {
			out = new PrintStream(new File("seismo_out.csv"));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		final PrintStream fout = out;
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		finishedRunner = 0;
		for (final Node node: nodes) {
			Thread nodeRunner = new Thread(new Runnable() {
				
				@Override
				public void run() {
					long time = 0;
					
					Avg mean1 = new Avg(1000);
//					Avg mean2 = new Avg(3000);
//					Avg mean3 = new Avg(3000);
					
					long start = record.getStart() + (SimpleSeismoExportAnalysis.this.start > 0 ? SimpleSeismoExportAnalysis.this.start : 0);
					long end = record.getStart() + (SimpleSeismoExportAnalysis.this.end > 0 ? SimpleSeismoExportAnalysis.this.end : record.getEnd() - record.getStart());
					
					Iterator<Handler> iterator = dbUtil.getHandlerIterator(
							createHandle(record, node, "seismo/localchannelinfo", start, end),
							new SubProgressMonitor(monitor, 100));
					String nodeId = nodeId(node).toString();
					while(iterator.hasNext()) {
						Localchannelinfo handler = (Localchannelinfo)iterator.next();
						for (V info: handler.getC().getV()) {		
							
							int value0 = info.getC0() - mean1.filter(info.getC0());					
//							int value1 = info.getC1() - mean2.filter(info.getC1());
//							int value2 = info.getC2() - mean3.filter(info.getC2());
							
//							result.getDataSet().add(nodeId, 1, time, value1);					
//							result.getDataSet().add(nodeId, 2, time, value2);	
//							result.getDataSet().add(nodeId, 0, time, value0);
				
							print(fout, nodeId, 0, time, value0, info.getT());
//							print(fout, nodeId, 1, time, value1, info.getT());
//							print(fout, nodeId, 2, time, value2, info.getT());			
							
							time += 10;
						}
						
						EcoreUtil.delete(handler);
					}
					finishedRunner++;
				}
			});
			nodeRunner.start();
		}
		
		waitForAllRunnersFinished(nodes.length);
		out.close();
		
//		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "channel", "time", "acc"));		
//		result.exportCSV("seismo_out.csv");
		
//		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
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
		ClickWatchExternalLauncher.launch(args, SimpleSeismoExportAnalysis.class);
	}
}
