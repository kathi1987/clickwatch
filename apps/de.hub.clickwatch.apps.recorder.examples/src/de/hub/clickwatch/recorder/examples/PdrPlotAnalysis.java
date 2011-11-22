package de.hub.clickwatch.recorder.examples;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;

public class PdrPlotAnalysis implements IClickWatchMain {
	
	@Inject private DataBaseUtil dbUtil;
	
	@Override
	public void main(IClickWatchContext ctx) {
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		Result result = ctx.getAdapter(IResultsProvider.class).getResults().createNewResult("PDR Analysis");
		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		for (Node node: nodes) {
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(
					createHandle(record, node, "device_wifi/link_stat/bcast_stats"),
					new SubProgressMonitor(monitor, 100));
			while(iterator.hasNext()) {
				Bcast_stats handler = (Bcast_stats)iterator.next();
				for(Link link: handler.getEntry().getLink()) {
					for(Link_info linkInfo: link.getLink_info()) {
						if (linkInfo.getRate() == 2) {
							result.getData().add(
									handler.getEntry().getFrom() + "->" + link.getTo(), 
									handler.getTimestamp() - record.getStart(), 
									linkInfo.getRev());
						}
					}
				}
				
				EcoreUtil.delete(handler);
			}
		}
		
		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "link", "time", "PDR"));		
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, PdrPlotAnalysis.class);
	}
}
