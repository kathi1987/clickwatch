package de.hub.clickwatch.main.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.analysis.results.ResultsFactory;
import de.hub.clickwatch.main.IResultsProvider;

public class ResultsProvider implements IClickWatchContextAdapter, IResultsProvider {

	private String outputFileName = null;
	private Results results = null;
	
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
	
	public void initialize(Results results) {
		this.results = results;
	}

	@Override
	public Result createNewResult(String name) {
		Result result = ResultsFactory.eINSTANCE.createResult();
		result.setName(name);
		result.setTimestamp(new Date());
		results.getResults().add(result);
		return result;
	}

	@Override
	public void saveResults() {
		if (outputFileName != null) {
			for (Result result: results.getResults()) {
				result.exportCSV(outputFileName);
			}
		}
	}

}
