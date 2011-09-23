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
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.Record;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;

public class SimpleSeismoPlotAnalysis implements IClickWatchMain {

	@Inject private DataBaseUtil dbUtil;
	
	@Override
	public void main(IClickWatchContext ctx) {
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		Result result = ctx.getAdapter(IResultsProvider.class).createNewResult("SeismoPlotAnalysis");
		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		for (Node node: nodes) {
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(
					createHandle(record, node.getINetAddress(), "seismo/latestchannelinfos"),
					new SubProgressMonitor(monitor, 100));
			while(iterator.hasNext()) {
				Latestchannelinfos handler = (Latestchannelinfos)iterator.next();
				for (Channel_info info: handler.getChannel_infos().getChannel_info()) {
					result.getDataSet().add(0, info.getTime(), info.getChannel_0());
					result.getDataSet().add(1, info.getTime(), info.getChannel_1());
					result.getDataSet().add(2, info.getTime(), info.getChannel_2());
					result.getDataSet().add(3, info.getTime(), info.getChannel_3());
				}
				
				EcoreUtil.delete(handler);
			}
		}
		
		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "nodes", "time", "acc"));		
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, SimpleSeismoPlotAnalysis.class);
	}
}
