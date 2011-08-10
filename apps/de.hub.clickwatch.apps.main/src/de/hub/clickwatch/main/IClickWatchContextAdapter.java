package de.hub.clickwatch.main;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

public interface IClickWatchContextAdapter {
		
	public List<Option> getCommandLineOptions();
	
	public void initialize(CommandLine commandLine) throws ParseException;
	
	public void initialize(IConfigurationElement configurationElement, EObject selection);

	public Class<?> getAdpaterClass();
		
}
