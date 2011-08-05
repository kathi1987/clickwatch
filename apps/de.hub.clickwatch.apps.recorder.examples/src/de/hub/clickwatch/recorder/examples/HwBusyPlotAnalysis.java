package de.hub.clickwatch.recorder.examples;

import java.util.Iterator;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;
import de.hub.clickwatch.util.ILogger;

public class HwBusyPlotAnalysis implements IClickWatchMain {
	
	private static final int PRECISION = 1000000;
	
	@Inject private DataBaseUtil dbUtil;
	@Inject private ILogger logger;
	
	private ExperimentDescr experiment;
	
	private long getMac(String mac) {
		return Long.parseLong(mac.replaceAll("-", ""), 16);
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		logger.log(ILogger.INFO, "Start analysis on experiment " , null);
		this.experiment = ctx.getAdapter(IExperimentProvider.class).getExperiment();
		final Result result = ctx.getAdapter(IResultsProvider.class).createNewResult("HwBusyPlotAnalysis");

		for (Node nodeConfig: experiment.getNetwork().getNodes()) {						
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
		}
		ctx.getAdapter(IResultsProvider.class).saveResults();
	}
	
	interface IPlotConfig<HC> {
		public void doPlot(HC handler, double time);
	}
	
	@SuppressWarnings("unchecked")
	private <HC> void plot(String nodeId, String handlerId, IPlotConfig<HC> config) {
		Iterator<Handler> iterator = dbUtil.getHandlerIterator(experiment, nodeId, handlerId, 
				experiment.getStart(), experiment.getEnd());
		
		while(iterator.hasNext()) {
			Handler handler = iterator.next();
			config.doPlot((HC)handler, (handler.getTimestamp() - experiment.getStart()) / PRECISION);
			EcoreUtil.delete(handler);
		}

		logger.log(ILogger.INFO, "created plot for " + nodeId + "/" + handlerId, null);
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, HwBusyPlotAnalysis.class);
	}
}
