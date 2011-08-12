package de.hub.clickwatch.analysis.results.util;

import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.util.builder.AxisBuilder;
import de.hub.clickwatch.analysis.results.util.builder.ChartBuilder;
import de.hub.clickwatch.analysis.results.util.builder.SeriesBuilder;
import de.hub.clickwatch.analysis.results.util.builder.XYBuilder;

public class ChartUtil {

	public static Chart createXYChart(String name, String series, String x, String y) {
		return ChartBuilder.newChartBuilder()
				.withName(name)
				.withType(XYBuilder.newXYBuilder())
				.withValueSpecs(SeriesBuilder.newSeriesBuilder().withColumn(0).withName(series))
				.withValueSpecs(AxisBuilder.newAxisBuilder().withColumn(1).withName(x))
				.withValueSpecs(AxisBuilder.newAxisBuilder().withColumn(2).withName(y))
				.build();
	}
}
