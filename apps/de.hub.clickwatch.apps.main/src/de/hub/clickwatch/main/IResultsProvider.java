package de.hub.clickwatch.main;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.main.impl.ResultsProvider;

@ImplementedBy(ResultsProvider.class)
public interface IResultsProvider {

	public Result createNewResult(String name);
	
	public Result getResult(String name);
	
	public void saveResults();
	
}
