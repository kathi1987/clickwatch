package de.hub.clickwatch.main.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.analysis.results.ResultsFactory;
import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.recorder.database.Record;

public class ResultsProvider implements IClickWatchContextAdapter, IResultsProvider {

	private String outputFileName = null;
	private Results results = null;
	
	@Override
	public Class<?> getAdpaterClass() {
		return IResultsProvider.class;
	}

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> result = new ArrayList<Option>();
		result.add(new Option("o", "output", true, "file name for saving results"));
		return result;
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		if (commandLine.hasOption("o")) {
			outputFileName = commandLine.getOptionValue("o");
			File file = new File(outputFileName);
			if (file.exists() && !file.canWrite()) {
				throw new IllegalArgumentException("cannot write output file");
			}
		}
		results = ResultsFactory.eINSTANCE.createResults();
	}
	
	@Override
	public void initialize(IConfigurationElement configurationElement, EObject selection) {
		while (!(selection == null || selection instanceof Record)) {
		    selection = selection.eContainer();
		}
		if (selection != null) {
		    this.results = ((Record)selection).getResults();
		} else {
		    this.results = null;
		}
	}

	@Override
	public Results getResults() {	    
		return results;
	}

	@Override
	public void saveResults() {
		if (outputFileName != null) {
			results.exportCSV(outputFileName);
		}
	}

}
