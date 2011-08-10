package de.hub.clickwatch.analysis.results;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class ResultsPlugin extends Plugin {
	
	private static ResultsPlugin instance = null;
	
	public static ResultsPlugin getInstance() {
		return instance;
	}
	
	private Results results = null;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
	}
	
	public Results getResults() {
		if (results == null) {
			results = ResultsFactory.eINSTANCE.createResults();
		}
		return results;
	}

}
