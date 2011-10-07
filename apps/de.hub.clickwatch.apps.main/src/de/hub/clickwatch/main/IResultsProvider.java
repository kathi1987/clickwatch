package de.hub.clickwatch.main;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.main.impl.ResultsProvider;

@ImplementedBy(ResultsProvider.class)
public interface IResultsProvider {

	public Results getResults();
	
	public void saveResults();
	
}
