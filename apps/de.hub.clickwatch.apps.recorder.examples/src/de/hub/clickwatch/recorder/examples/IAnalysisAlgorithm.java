package de.hub.clickwatch.recorder.examples;

import org.eclipse.core.runtime.IProgressMonitor;

import de.hub.clickwatch.model.Node;

public interface IAnalysisAlgorithm {

	public void analyse(IAnalysisContainer container, Node node, IProgressMonitor monitor);
	
	public void initialize(IAnalysisContainer container);
}
