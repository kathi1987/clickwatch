package de.hub.clickwatch.tracesexample.first;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.GraphResult;
import de.hub.clickwatch.analysis.results.NumericalResult;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.tracesexample.hwbusy.HWBusyExample;
import de.hub.clickwatch.tracesexample.linkStats.LinkStatExample;
import de.hub.clickwatch.tracesexample.topology.TopologyExample;

public class TraceTest implements IClickWatchMain {

	@Inject
	DataBaseUtil dbUtil;

	@Override
	public void main(IClickWatchContext ctx) {

		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		NumericalResult numResult = ctx.getAdapter(IResultsProvider.class)
				.getResults().createNewNumericalResult("HwBusyPlotAnalysis");
		NumericalResult numResult2 = ctx.getAdapter(IResultsProvider.class)
				.getResults().createNewNumericalResult("HwBusyPlotAnalysis");
		GraphResult graphResult = ctx.getAdapter(IResultsProvider.class)
				.getResults().createNewGraphResult("Topology");

		// call the topology example
		System.out.println("************** Topology-Example ****************");
		(new TopologyExample()).createTopology(record, dbUtil, graphResult);

		System.out.println("\n************** HWBUSY-Example ****************");
		// call the hwbusy example
		Long from = new Long("1322150509558873386");
		Long to = new Long("1322150520000000000");
		(new HWBusyExample()).createHWBusy(record, dbUtil, numResult, from, to);

		// call the topology example
		System.out.println("\n************** Linkstat-Example ****************");
		(new LinkStatExample()).createTopology(record, dbUtil, numResult2);
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, TraceTest.class);
	}

}
