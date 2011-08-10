package de.hub.clickwatch.main.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IProgressMonitorProvider;

public class ProgressMonitorProvider implements IClickWatchContextAdapter, IProgressMonitorProvider {
	
	private IProgressMonitor monitor = null;

	@Override
	public IProgressMonitor getProgressMonitor() {
		if (monitor == null) {
			return new NullProgressMonitor();
		} else {
			return monitor;
		}
	}

	@Override
	public List<Option> getCommandLineOptions() {
		return new ArrayList<Option>();
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		// empty
	}

	@Override
	public void initialize(IConfigurationElement configurationElement,
			EObject selection) {
		// empty
	}

	public void initialize(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	@Override
	public Class<?> getAdpaterClass() {
		return IProgressMonitorProvider.class;
	}

}
