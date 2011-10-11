package de.hub.clickwatch.recorder.examples;

import org.eclipse.core.runtime.IProgressMonitor;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.model.Node;

public class AnalysisContainer extends AbstractAnalysis implements IAnalysisContainer {
	
	private final IAnalysisAlgorithm alg;

	public AnalysisContainer(IAnalysisAlgorithm alg) {
		super();
		this.alg = alg;
	}

	@Override
	public void shiftResultWindow(Result result, double size, int timeAxis) {
		// empty
	}

	@Override
	public void updateResult(Result result) {
		// empty
	}

	@Override
	public void addObservedHandler(String handlerName) {
		// empty
	}

	@Override
	protected void analyse(IClickWatchContext ctx, Node node,
			IProgressMonitor monitor) {
		alg.analyse(this, node, monitor);
	}

}
