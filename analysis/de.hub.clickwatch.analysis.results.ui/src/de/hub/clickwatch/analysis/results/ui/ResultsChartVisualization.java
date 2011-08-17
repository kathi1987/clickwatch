package de.hub.clickwatch.analysis.results.ui;

import java.awt.Component;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import de.hub.clickwatch.analysis.results.Axis;
import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.Series;
import de.hub.clickwatch.analysis.results.ValueSpec;
import de.hub.clickwatch.analysis.results.XY;
import de.hub.clickwatch.analysis.visualization.IVisualization;

public class ResultsChartVisualization implements IVisualization {

	@SuppressWarnings("unchecked")
	@Override
	public boolean isEnabledForInput(Object input) {
		boolean hasChart = false;
		if (input != null) {
			for (Result result: (List<Result>)input) {
				hasChart |= getChart(result) != null; 
			}
		}
		return hasChart;
	}
	
	private Chart getChart(Object input) {
		if (input instanceof Result) {
			Result result = (Result)input;
			if (!result.getCharts().isEmpty()) {
				Chart chart = result.getCharts().get(0);
				if (chart.getType() != null) {
					return chart;
				}
			}
		}
		return null;
	}
	
	private Component createChart(Result result) {
		Chart chart = getChart(result);
		DataSet dataSet = result.getDataSet();
		
		List<ValueSpec> columns = new ArrayList<ValueSpec>();
		for (ValueSpec spec: chart.getValueSpecs()) {
			int column = spec.getColumn();
			while (column >= columns.size()) {
				columns.add(null);
			}
			columns.set(column, spec);
		}
		
		String xAxisName = null;
		String yAxisName = null;
		
		if (chart.getType() instanceof XY) {
			XYSeriesCollection jfDataSet = new XYSeriesCollection();
			Map<Object, XYSeries> seriesMap = new HashMap<Object, XYSeries>();
			for (DataEntry entry: dataSet.getEntries()) {
				EList<Object> values = entry.getValues();
				int size = values.size();
				boolean skip = false;
				double x = 0;
				double y = 0;
				Object s = 0;
				boolean first = true;		
				loop: for (int i = 0; i < size; i++) {													
					ValueSpec spec = columns.get(i);
					if (spec == null) {
						continue loop;
					} else if (spec instanceof Axis) {						
						if (first) {
							x = convert(values.get(i));
							xAxisName = spec.getName();
							first = false;
						} else {
							yAxisName = spec.getName();
							y = convert(values.get(i));
						}
					} else if (spec instanceof Series) {						
						s = values.get(i);
					} 
					if (spec != null && spec.getConstraint() != null) {
						skip |= !spec.getConstraint().evaluate(entry);
					}
				}
				if (!skip) {
					XYSeries series = seriesMap.get(s);
					if (series == null) {
						series = new XYSeries(s.toString());
						jfDataSet.addSeries(series);
						seriesMap.put(s, series);
					}
					series.add(x,y);
				}
			}
			
			JFreeChart jfChart = ChartFactory.createXYLineChart(
		            chart.getName(),
		            xAxisName,
		            yAxisName,
		            jfDataSet,
		            PlotOrientation.VERTICAL,
		            true,                         
		            false,                            
		            false
		        );

		        jfChart.getXYPlot();
			
			ChartPanel chartPanel = new ChartPanel(jfChart);
	        chartPanel.setMouseZoomable(true, false);
			return chartPanel;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Component createVisualization(Object input) {	
		if (input != null) {
			List<Result> results = (List<Result>)input;
			if (results.size() > 1) {
				Panel panel = new Panel();
				for (Result result: results) {
					panel.add(createChart(result));
				}	
				return panel;
			} else {
				return createChart(results.get(0));
			}
		}
		return null;
	}

	
	private double convert(Object value) {
		if (value instanceof Long) {
			return (double)(Long)value;
		} else if (value instanceof Integer) {
			return (double)(Integer)value;
		} else if (value instanceof Double) {
			return (Double)value;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
