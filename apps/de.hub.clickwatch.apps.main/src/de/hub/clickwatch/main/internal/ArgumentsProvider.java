package de.hub.clickwatch.main.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;

import de.hub.clickwatch.main.IArgumentsProvider;

public class ArgumentsProvider implements IClickWatchContextAdapter, IArgumentsProvider {
	
	private String[] args = null;

	@Override
	public String[] getArguments() {
		return args;
	}

	@Override
	public List<Option> getCommandLineOptions() {
		return new ArrayList<Option>();
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		args = commandLine.getArgs();
	}

	@Override
	public void initialize(IConfigurationElement configurationElement) {
		args = new String[] {};
	}
	
}
