package de.hub.clickwatch.analysis.composition.visualization;

import java.awt.Component;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;

import de.hub.clickwatch.analysis.composition.model.DataNode;
import de.hub.clickwatch.analysis.composition.model.DataSet;
import de.hub.clickwatch.analysis.composition.model.DataSetNode;
import de.hub.clickwatch.analysis.composition.model.MeasureNode;
import de.hub.clickwatch.analysis.composition.model.Visualization;
import de.hub.clickwatch.analysis.visualization.IVisualization;

public class HistogramVisualization implements IVisualization {
	
	public static final String VisualizationName = "Histogram";
	
	@Override
	public boolean isEnabledForInput(Object input) {
		if (input instanceof DataSetNode || input instanceof MeasureNode) {
			DataNode node = (DataNode)input;
			Visualization visualization = node.getVisualization();
			if (visualization != null && visualization.getKind() != null && !visualization.getKind().equals("")) {
				return visualization.getKind().equals(VisualizationName);
			}
		}
		return false;
	}

	@Override
	public Component createVisualization(Object input) {
		if (input instanceof DataSetNode) {
			input = ((DataSetNode)input).getData();
		} else if (input instanceof MeasureNode) {
			input = ((MeasureNode)input).getData();
		}
		
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

	@Override
	public void updateVisualization(Object input) {
		// empty	
	}
	
}
