package de.hub.clickwatch.main.internal;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;

public interface IClickWatchContextAdapter {
		
	public List<Option> getCommandLineOptions();
	
	public void initialize(CommandLine commandLine) throws ParseException;
		
}
