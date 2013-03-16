package de.hub.clickwatch.analysis.results.ui;

import java.awt.Component;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.Range;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import de.hub.clickwatch.analysis.results.Axis;
import de.hub.clickwatch.analysis.results.Chart;
import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;
import de.hub.clickwatch.analysis.results.NumericalResult;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.Series;
import de.hub.clickwatch.analysis.results.ValueSpec;
import de.hub.clickwatch.analysis.results.XY;
import de.hub.clickwatch.analysis.visualization.IVisualization;

public class ResultsChartVisualization implements IVisualization {
	
	private static Map<Result, ChartPanel> cache = new HashMap<Result, ChartPanel>();

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
	
	/* Wird aufgerufen wenn der Chart aktualisiert werden soll! */
	private Chart getChart(Object input) {
		if (input instanceof NumericalResult) {
		    NumericalResult result = (NumericalResult)input;
			if (!result.getCharts().isEmpty()) {
				Chart chart = result.getCharts().get(0);
				if (chart.getType() != null) {
					return chart;
				}
			}
		}
		return null;
	}
	
	/* Eigentliche Chart wird hier erstellt und mit Datenbefüllt!
	 * Wird aufgerufen wenn der Chart aktualisiert werden soll! */
	private JFreeChart createChart(NumericalResult result) {
		Chart chart = getChart(result);
		if (chart == null) {
		    return null;
		}
		 
		if (chart.getType() instanceof XY) {
			DataSet dataSet = result.getData();
			
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
			Axis yAxis = null;
			
			XYSeriesCollection jfDataSet = new XYSeriesCollection();
			Map<Object, XYSeries> seriesMap = new HashMap<Object, XYSeries>();
			for (DataEntry entry: dataSet.getEntries()) {
				Object[] values = entry.getValues();
				int size = values.length;
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
							x = convert(values[i]);
							xAxisName = spec.getName();
							first = false;
						} else {
							yAxisName = spec.getName();
							y = convert(values[i]);
							if (yAxis == null) {
								yAxis = (Axis)spec;
							}
						}
					} else if (spec instanceof Series) {						
						s = values[i];
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
	
		    XYPlot xyPlot = jfChart.getXYPlot();
		    if (yAxis != null && yAxis.getFrom() != yAxis.getTo()) {
		    	xyPlot.getRangeAxis().setRange(new Range(yAxis.getFrom(), yAxis.getTo()));	
		    } 
		    return jfChart;
		} else {
			return null;
		}
	}
	
	/* Wird augerufen wenn der Chart aktualisiert werden soll! */
	private Component createChartPanel(NumericalResult result) {
	    if (result == null) {
	        return null;
	    }
		JFreeChart jfChart = createChart(result);	
		if (jfChart == null) {
			return null;
		} else {
			ChartPanel chartPanel = new ChartPanel(jfChart);
	        chartPanel.setMouseZoomable(true, false);
	        cache.put(result, chartPanel);
			return chartPanel;
		}
	}
	
	/* Wird aufgerufen wenn der Chart aktualisert werden soll!
	 * (von VisualizationView.frame.add()) */
	@SuppressWarnings("unchecked")
	@Override
	public Component createVisualization(Object input) {	
		cache.clear();
		if (input != null) {
			List<NumericalResult> results = (List<NumericalResult>)input;
			if (results.size() > 1) {
				Panel panel = new Panel();
				for (NumericalResult result: results) {
					Component chartPanel = createChartPanel(result);
					if (chartPanel != null) {
					    panel.add(chartPanel);
					}
				}	
				return panel;
			} else {
				return createChartPanel(results.get(0));
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void updateVisualization(Object input) {
		if (input != null) {
			List<NumericalResult> results = (List<NumericalResult>)input;
			for (NumericalResult result: results) {
				ChartPanel panel = cache.get(result);
				if (panel != null) {
					panel.setChart(createChart(result));
				}	
			}
		}
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
