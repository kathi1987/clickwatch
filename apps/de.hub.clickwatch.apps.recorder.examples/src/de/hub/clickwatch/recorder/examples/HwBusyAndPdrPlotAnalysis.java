package de.hub.clickwatch.recorder.examples;

import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;
import de.hub.clickwatch.util.ILogger;

public class HwBusyAndPdrPlotAnalysis implements IClickWatchMain {
	
	private static final int PRECISION = 1000000;
	
	@Inject private DataBaseUtil dbUtil;
	@Inject private ILogger logger;
	
	private Record record;
	
	private long getMac(String mac) {
		return Long.parseLong(mac.replaceAll("-", ""), 16);
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		logger.log(ILogger.INFO, "Start analysis on record " , null);
		this.record = ctx.getAdapter(IRecordProvider.class).getRecord();
		final Result result = ctx.getAdapter(IResultsProvider.class).createNewResult("HwBusyPlotAnalysis");

		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		EList<Node> nodes = record.getConfiguration().getNodes();
		monitor.beginTask("Performing analysis on all nodes", nodes.size());
		
		for (Node nodeConfig: nodes) {						
			plot(nodeConfig.getINetAddress(), "device_wifi/link_stat/bcast_stats", new IPlotConfig<Bcast_stats>() {
				@Override
				public void doPlot(Bcast_stats bcastStats, double time) {
					long from = getMac(bcastStats.getEntry().getFrom());
					for(Link link: bcastStats.getEntry().getLink()) {
						long to = getMac(link.getTo());
						for(Link_info linkInfo: link.getLink_info()) {
							if (linkInfo.getRate() == 2) {
								result.getDataSet().add(1, from, to, time, linkInfo.getRev());
							}
						}
					}
				}
			});	
			
			plot(nodeConfig.getINetAddress(), "device_wifi/wifidevice/cst/stats", new IPlotConfig<Stats>() {
				@Override
				public void doPlot(Stats handler, double time) {
					result.getDataSet().add(2, getMac(handler.getChannelstats().getNode()), time, handler.getChannelstats().getPhy().getHwbusy());
				}
			});			
			monitor.worked(1);
		}
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}
	
	interface IPlotConfig<HC> {
		public void doPlot(HC handler, double time);
	}
	
	@SuppressWarnings("unchecked")
	private <HC> void plot(String nodeId, String handlerId, IPlotConfig<HC> config) {
		Iterator<Handler> iterator = dbUtil.getHandlerIterator(DataBaseUtil.createHandle(record, nodeId, handlerId));
		
		while(iterator.hasNext()) {
			Handler handler = iterator.next();
			config.doPlot((HC)handler, (handler.getTimestamp() - record.getStart()) / PRECISION);
			EcoreUtil.delete(handler);
		}

		logger.log(ILogger.INFO, "created plot for " + nodeId + "/" + handlerId, null);
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, HwBusyAndPdrPlotAnalysis.class);
	}
}
