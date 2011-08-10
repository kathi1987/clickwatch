package de.hub.clickwatch.main.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IClickWatchSourceProvider;

public class SourceProvider implements IClickWatchContextAdapter, IClickWatchSourceProvider {
	
	private EObject sourceObject = null;

	@Override
	public EObject getSourceObject() {
		return sourceObject;
	}

	@Override
	public List<Option> getCommandLineOptions() {
		return new ArrayList<Option>();
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		// empty
	}
	
	public void initialize(EObject object) {
		this.sourceObject = object;
	}

	@Override
	public void initialize(IConfigurationElement configurationElement, EObject selection) {
		this.sourceObject = selection;
	}

	@Override
	public Class<?> getAdpaterClass() {
		return IClickWatchSourceProvider.class;
	}
}
