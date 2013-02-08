package de.hub.clickwatch.analysis.results.util;

import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.util.builder.AxisBuilder;
import de.hub.clickwatch.analysis.results.util.builder.ChartBuilder;
import de.hub.clickwatch.analysis.results.util.builder.SeriesBuilder;
import de.hub.clickwatch.analysis.results.util.builder.XYBuilder;

public class ChartUtil {

	public static Chart createXYChart(String name, String series, String x, String y) {
		return ChartBuilder.newChartBuilder()
				.name(name)
				.type(XYBuilder.newXYBuilder())
				.valueSpecs(SeriesBuilder.newSeriesBuilder().column(0).name(series))
				.valueSpecs(AxisBuilder.newAxisBuilder().column(1).name(x))
				.valueSpecs(AxisBuilder.newAxisBuilder().column(2).name(y))
				.build();
	}
}
