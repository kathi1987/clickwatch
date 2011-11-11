package de.hub.clickwatch.recorder.examples;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;

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

public class SeismoCloudExport implements IClickWatchMain {

	@Inject private DataBaseUtil dbUtil;
	int finishedRunner = 0;
	
	private long start = 0; //(long)(357*1e6);
	private long end = 0; //(long)(60*60*1e9);
	
	@Override
	public void main(IClickWatchContext ctx) {
		final Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		final IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		finishedRunner = 0;
		for (final Node node: nodes) {
			Thread nodeRunner = new Thread(new Runnable() {
				
				@Override
				public void run() {					
					PrintStream out = null;
					try {
						out = new PrintStream(new File("seismo_" + node.getINetAddress() + ".csv"));
					} catch (FileNotFoundException e) {
						throw new RuntimeException(e);
					}
					final PrintStream fout = out;
					
					long time = 0;
					long start = record.getStart() + (SeismoCloudExport.this.start > 0 ? SeismoCloudExport.this.start : 0);
					long end = record.getStart() + (SeismoCloudExport.this.end > 0 ? SeismoCloudExport.this.end : record.getEnd() - record.getStart());
					
					Iterator<Handler> iterator = dbUtil.getHandlerIterator(
							createHandle(record, node, "seismo/localchannelinfo", start, end),
							new SubProgressMonitor(monitor, 100));
					while(iterator.hasNext()) {
						Localchannelinfo handler = (Localchannelinfo)iterator.next();
						for (V info: handler.getC().getV()) {		
							print(fout, 0, time, info.getC0());
							print(fout, 1, time, info.getC1());
							print(fout, 2, time, info.getC2());
							time += 10;
						}
						
						EcoreUtil.delete(handler);
					}
					out.close();
					finishedRunner++;
				}
			});
			nodeRunner.start();
		}
		
		waitForAllRunnersFinished(nodes.length);
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
	
	private synchronized void print(PrintStream out, int channel, long time, int value) {
		out.print(channel);
		out.print(" ");
		out.print(time);
		out.print(" ");
		out.print(value);
		out.print("\n");
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, SimpleSeismoExportAnalysis.class);
	}
}