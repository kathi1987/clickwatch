package de.hub.clickwatch.main.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContextAdapter;

public class ArgumentsProvider implements IClickWatchContextAdapter,
		IArgumentsProvider {

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
	public void initialize(IConfigurationElement configurationElement,
			EObject selection) {
		args = new String[] {};
	}
	
	/**
	 * init this provider with the needed information
	 * 
	 * @param args
	 */
	public void initialize(String[] args) {
		this.args = args;
	}

	@Override
	public Class<?> getAdpaterClass() {
		return IArgumentsProvider.class;
	}
}
