package de.hub.clickwatch.recorder.examples;

import javax.swing.plaf.basic.BasicTreeUI;

import org.eclipse.core.runtime.IProgressMonitor;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.functions2.BasicTransformations;
import de.hub.clickwatch.analysis.functions2.Function;
import de.hub.clickwatch.analysis.functions2.Id;
import de.hub.clickwatch.analysis.functions2.MapFunction;
import de.hub.clickwatch.analysis.functions2.Pair;
import de.hub.clickwatch.analysis.functions2.Transformation;
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
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;

public class FunctionsSeismoPlotAnalysis implements IClickWatchMain {

	@Inject private DataBaseUtil dbUtil;
	@Inject private BasicTransformations trans;
	
	@Override
	public void main(IClickWatchContext ctx) {
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		Node[] nodes = ctx.getAdapter(IRecordProvider.class).getSelectedNodes();
		Result result = ctx.getAdapter(IResultsProvider.class).getResults().getResult("SeismoPlotAnalysis");
		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();
		
		monitor.beginTask("Performing analysis on all nodes", nodes.length*100);
		
		for (Node node: nodes) {
			Function<Long, Handler> handlerOverTime = trans.filter("seismo/latestchannelinfos", 
			    trans.cwdb(record).get(node)).get();
			
			Function<Long, MapFunction<Integer, Function<Long, Integer>>> seismoInfoOverTime =
			trans.forFunction(handlerOverTime, new Transformation<Handler, MapFunction<Integer,Function<Long,Integer>>>() {
				@Override
				public MapFunction<Integer, Function<Long, Integer>> apply(Handler from) {
					// TODO seismo info
					return null;
				}
			});
		}
		
		result.getCharts().add(ChartUtil.createXYChart("Plot over time", "channel", "time", "acc"));		
		
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, FunctionsSeismoPlotAnalysis.class);
	}
}
