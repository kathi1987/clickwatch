package de.hub.clickwatch.recorder.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.util.builder.AxisBuilder;
import de.hub.clickwatch.analysis.results.util.builder.ChartBuilder;
import de.hub.clickwatch.analysis.results.util.builder.SeriesBuilder;
import de.hub.clickwatch.analysis.results.util.builder.XYBuilder;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IClickWatchSourceProvider;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
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

		EObject source = ctx.getAdapter(IClickWatchSourceProvider.class).getSourceObject();		
		List<Node> nodes = null;
		if (source != null) {
			loop: while (source != null) {
				if (source instanceof Node) {
					nodes = new ArrayList<Node>();
					nodes.add((Node)source);
					break loop;
				}
				source = source.eContainer();
			}
		}
		if (nodes == null) {
			nodes = experiment.getNetwork().getNodes();
		}
		
		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();	
		monitor.beginTask("Performing analysis on all nodes", nodes.size());
		
		for (Node nodeConfig: nodes) {									
			plot(nodeConfig.getINetAddress(), "device_wifi/wifidevice/cst/stats", new IPlotConfig<Stats>() {
				@Override
				public void doPlot(Stats handler, double time) {
					result.getDataSet().add(getMac(handler.getChannelstats().getNode()), time, handler.getChannelstats().getPhy().getHwbusy());
				}
			});			
			monitor.worked(1);
		}
		
		result.getDiagrams().add(ChartBuilder.newChartBuilder()
				.withName("Plot over time")
				.withType(XYBuilder.newXYBuilder())
				.withValueSpecs(SeriesBuilder.newSeriesBuilder().withColumn(0).withName("node"))
				.withValueSpecs(AxisBuilder.newAxisBuilder().withColumn(1).withName("time"))
				.withValueSpecs(AxisBuilder.newAxisBuilder().withColumn(2).withName("HW_busy"))
				.build());
		
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
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
