package de.hub.clickwatch.recorder.examples;

import org.eclipse.core.runtime.IProgressMonitor;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.model.Node;

public interface IAnalysisContainer {

	public IClickWatchContext getContext();
	
	public void setWindowInMS(long from, long length);
	
	public <T> Iterable<T> createIterator(Node node, String handlerName, Class<T> handlerClass, IProgressMonitor monitor);

	public void shiftResultWindow(Result result, double size, int timeAxis);
	
	public void updateResult(final Result result);
	
	public void addObservedHandler(String handlerName);
	
}
