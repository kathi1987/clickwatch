package de.hub.clickwatch.recorder.examples.ui;

import java.util.Queue;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.ui.AbstractRuntimeAnalysis;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;

public class RuntimeHwBusyAnalysis extends AbstractRuntimeAnalysis {
	
	@Inject private BrnValueAdapter brnValueAdapter;
	@Inject private StringValueAdapter stringValueAdapter;
	
	@Override
	protected void continiousAnalysis(Result[] results, Queue<Handler> data) {
		cutOffDataForDuration(25000);
		results[0].getDataSet().getEntries().clear();
		for (Handler unspecificHandler: data) {
			Stats handler = (Stats)unspecificHandler;
			results[0].getDataSet().add(
					handler.getChannelstats().getNode(), 
					(double)((handler.getTimestamp() - getRecord().getStart())/1000000000.0), 
					handler.getChannelstats().getPhy().getHwbusy());
		}			
	}

	@Override
	protected Result[] createResults() {
		return new Result[] {
				getContext().getAdapter(IResultsProvider.class).getResults().getResult("HwBusyPlotAnalysis")		
		};
	}

	@Override
	protected void prepareResults(Result[] results) {
		results[0].getCharts().add(ChartUtil.createXYChart("Plot over time", "nodes", "time", "HW_busy"));
	}

	@Override
	protected Handler getData(Node node, Handler handler) {
		if (handler.getQualifiedName().equals("device_wifi/wifidevice/cst/stats")) {
			return brnValueAdapter.create(handler, stringValueAdapter);
		} else {
			return null;
		}
	}
}
