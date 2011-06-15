package edu.hu.clickwatch.analysis.composition.visualization;

import java.awt.Component;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

import edu.hu.clickwatch.analysis.composition.model.DataSet;

public class HistogramVisualization implements IVisualization {

	@Override
	public Component createVisualization(Object input) {
		if (input instanceof DataSet) {
			DataSet dataSet = (DataSet)input;
		
			HistogramDataset jfcDataSet = new HistogramDataset();
			jfcDataSet.setType(HistogramType.RELATIVE_FREQUENCY);
			
			double[] data = new double[dataSet.getDoubleValues().size()];
			int i = 0;
			for (Double d: dataSet.getDoubleValues()) {
				data[i++] = d;
			}
			
			jfcDataSet.addSeries("Distances", data, 20);
			JFreeChart chart = ChartFactory.createHistogram("Histogram", "x", "y", jfcDataSet, PlotOrientation.VERTICAL, true, false, false);
			
			ChartPanel chartPanel = new ChartPanel(chart);
	        chartPanel.setMouseZoomable(true, false);
			return chartPanel;
		} else {
			return null;
		}
	}
}
