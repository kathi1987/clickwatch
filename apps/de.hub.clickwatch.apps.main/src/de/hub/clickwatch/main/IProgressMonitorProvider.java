package de.hub.clickwatch.main;

import org.eclipse.core.runtime.IProgressMonitor;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.main.impl.ProgressMonitorProvider;

@ImplementedBy(ProgressMonitorProvider.class)
public interface IProgressMonitorProvider {

	public IProgressMonitor getProgressMonitor();
}
