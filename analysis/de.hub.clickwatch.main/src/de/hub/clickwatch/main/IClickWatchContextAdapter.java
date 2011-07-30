package de.hub.clickwatch.main;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;

public interface IClickWatchContextAdapter {
		
	public List<Option> getCommandLineOptions();
	
	public void initalize(CommandLine commandLine) throws ParseException;
		
}
