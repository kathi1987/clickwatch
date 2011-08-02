package de.hub.clickwatch.recorder.examples;

import java.io.PrintStream;
import java.util.Iterator;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.data.Plot;
import de.hub.clickwatch.analysis.data.PlotGroup;
import de.hub.clickwatch.analysis.data.TimeBinFilter;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class HwBusyPlotAnalysis implements IClickWatchMain {
	
	private static final int PRECISION = 1000000;
	private static final int SAMPLES = 2000;
	
	@Inject private DataBaseUtil dbUtil;
	@Inject private ILogger logger;
	
	private PrintStream out;
	private PlotGroup plots;
	private ExperimentDescr experiment;
	
	public void initialize(PrintStream out) {
		this.out = out;
	}
	
	public void perform(ExperimentDescr experiment) {
		this.experiment = experiment;
		final double size = ((experiment.getEnd() - experiment.getStart()) / SAMPLES) / PRECISION;
		plots = new PlotGroup() {
			@Override
			protected Plot createPlot() {
				return new Plot(new TimeBinFilter(size));
			}
		};

		for (Node nodeConfig: experiment.getNetwork().getNodes()) {						
			plot(nodeConfig.getINetAddress(), "device_wifi/link_stat/bcast_stats", new IPlotConfig<Bcast_stats>() {
				@Override
				public void doPlot(Bcast_stats bcastStats, double time) {
					String from = bcastStats.getEntry().getFrom();
					for(Link link: bcastStats.getEntry().getLink()) {
						String to = link.getTo();
						for(Link_info linkInfo: link.getLink_info()) {
							if (linkInfo.getRate() == 2) {
								plots.get("PDR_" + from + "_to_" + to).addEntry(time, linkInfo.getRev());
							}
						}
					}
				}
			});	
			
			plot(nodeConfig.getINetAddress(), "device_wifi/wifidevice/cst/stats", new IPlotConfig<Stats>() {
				@Override
				public void doPlot(Stats handler, double time) {
					plots.get("hwbusy_" + handler.getChannelstats().getNode()).addEntry(time, handler.getChannelstats().getPhy().getHwbusy());
				}
			});			
		}
		
		plots.print(out);
		out.close();
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
	
	@Override
	public void main(IClickWatchContext ctx) {
		logger.log(ILogger.INFO, "Start analysis on experiment " , null);
		
		try {
			initialize(new PrintStream("out.txt", "utf8"));
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		perform(ctx.getAdapter(IExperimentProvider.class).getExperiment());
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, HwBusyPlotAnalysis.class);
	}
}
