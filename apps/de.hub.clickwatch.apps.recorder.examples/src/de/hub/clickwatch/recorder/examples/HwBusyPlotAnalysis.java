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
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

public class HwBusyPlotAnalysis implements IClickWatchMain {

	@Inject private DataBaseUtil dbUtil;
	
	@Override
	public void main(IClickWatchContext ctx) {
		ExperimentDescr experiment = ctx.getAdapter(IExperimentProvider.class).getExperiment();
		Node[] nodes = ctx.getAdapter(IExperimentProvider.class).getSelectedNodes();
		Result result = ctx.getAdapter(IResultsProvider.class).createNewResult("HwBusyPlotAnalysis");
		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		for (Node node: nodes) {
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(
					createHandle(experiment, node.getINetAddress(), "device_wifi/wifidevice/cst/stats"),
					new SubProgressMonitor(monitor, 100));
			while(iterator.hasNext()) {
				Stats handler = (Stats)iterator.next();
				result.getDataSet().add(
						handler.getChannelstats().getNode() + "/" + node.getINetAddress(), 
						handler.getTimestamp() - experiment.getStart(), 
						handler.getChannelstats().getPhy().getHwbusy());
				EcoreUtil.delete(handler);
			}
		}
		
		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "nodes", "time", "HW_busy"));		
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, HwBusyPlotAnalysis.class);
	}
}
