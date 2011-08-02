package de.hub.clickwatch.analysis.data;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plot {
	
	private List<IFilter> filters = new ArrayList<IFilter>();
	private List<double[]> entries = new ArrayList<double[]>();
	
	public List<IFilter> getFilters() {
		return filters;
	}
	
	public Plot(IFilter... filters) {
		this.filters.addAll(Arrays.asList(filters));
	}

	public void addEntry(double... values) {
		loop: for (IFilter filter: filters) {
			values = filter.filter(values);
			if (values == null) {
				break loop;
			}
		}
		if (values != null) {
			entries.add(values);
		}
	}
	
	public double[][] getEntries() {
		return entries.toArray(new double[][]{});
	}

	public void print(PrintStream out) {
		out.print("[");
		for (double[] entry: entries) {
			for (double value: entry) {
				out.print(value);
				out.print(" ");
			}
			out.print("; ");
		}
		out.print("]");
	}
	
	public void printCSV(PrintStream out) {
		for (double[] entry: entries) {
			for (double value: entry) {
				out.print(value);
				out.print(" ");
			}
			out.print("\n");
		}
	}
}
