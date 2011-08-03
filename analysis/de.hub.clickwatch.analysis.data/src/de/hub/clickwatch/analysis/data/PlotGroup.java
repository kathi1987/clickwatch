package de.hub.clickwatch.analysis.data;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlotGroup {

	private Map<String, Plot> plots = new HashMap<String, Plot>();
	
	protected Plot createPlot() {
		return new Plot();
	}
	
	public Plot get(String key) {
		Plot plot = plots.get(key);
		if (plot == null) {
			plot = createPlot();
			plots.put(key, plot);
		}
		return plot;
	}
	
	public void print(PrintStream out) {
		List<String> keys = new ArrayList<String>(plots.keySet());
		Collections.sort(keys);
		for(String key: keys) {
			out.print(key.replace("-", "_"));
			out.print("=");
			plots.get(key).print(out);
			out.print(";\n");
		}
	}
}
