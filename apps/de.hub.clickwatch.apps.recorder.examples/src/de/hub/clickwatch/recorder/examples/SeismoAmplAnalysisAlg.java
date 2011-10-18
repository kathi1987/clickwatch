package de.hub.clickwatch.recorder.examples;

import org.eclipse.core.runtime.IProgressMonitor;

import de.hub.clickwatch.analysis.results.Axis;
import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.util.ChartUtil;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.examples.lib.RemoveOffset;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.Localchannelinfo;
import de.hub.clickwatch.specificmodels.brn.seismo_localchannelinfo.V;

public class SeismoAmplAnalysisAlg implements IAnalysisAlgorithm {

	private RemoveOffset ro0 = new RemoveOffset(5000);
	private RemoveOffset ro1 = new RemoveOffset(5000);
	private RemoveOffset ro2 = new RemoveOffset(5000);
	
	private long start = -1;
	
	@Override
	public void analyse(IAnalysisContainer container, Node node,
			IProgressMonitor monitor) {
		IClickWatchContext ctx = container.getContext();
		Result amplResult = ctx.getAdapter(IResultsProvider.class).getResults().getGroup("SeismoAmpl").getResult(node.getINetAddress());
		Result cleanResult = ctx.getAdapter(IResultsProvider.class).getResults().getGroup("SeismoAmplClean").getResult(node.getINetAddress());
		
		if (amplResult.getCharts().isEmpty()) {
			Chart amplChart = ChartUtil.createXYChart("Ampl", "channel", "time", "ampl");	
			((Axis)amplChart.getValueSpecs().get(2)).setFrom(-3000);
			((Axis)amplChart.getValueSpecs().get(2)).setTo(3000);
			amplResult.getCharts().add(amplChart);
		}
		
		if (cleanResult.getCharts().isEmpty()) {
			Chart amplChart = ChartUtil.createXYChart("CleanAmpl", "channel", "time", "ampl");	
			cleanResult.getCharts().add(amplChart);
		}
		
		container.shiftResultWindow(amplResult, 5, 1);
		
		for(Localchannelinfo handler: container.createIterator(node, "seismo/localchannelinfo", Localchannelinfo.class, monitor)) {
			for (V info: handler.getC().getV()) {				
				double rov0 = ro0.filter(info.getC0());
				double rov1 = ro1.filter(info.getC1());
				double rov2 = ro2.filter(info.getC2());
				
				if (start == -1) {
					start = info.getT();
				}
				
				long time = info.getT() - start;
				double dtime = time / 1e6;
				
				amplResult.getDataSet().add(0, dtime, rov0);
				amplResult.getDataSet().add(1, dtime, rov1);
				amplResult.getDataSet().add(2, dtime, rov2);
				
				cleanResult.getDataSet().add(0, dtime, info.getC0());
				cleanResult.getDataSet().add(1, dtime, info.getC1());
				cleanResult.getDataSet().add(2, dtime, info.getC2());
			}
		}
		
		container.updateResult(cleanResult);
		container.updateResult(amplResult);	
	}

	@Override
	public void initialize(IAnalysisContainer container) {
		container.addObservedHandler("seismo/localchannelinfo");
	}

}
