package de.hub.clickwatch.recorder.examples.ui;

import org.eclipse.core.runtime.IProgressMonitor;

import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.examples.IAnalysisAlgorithm;
import de.hub.clickwatch.recorder.examples.IAnalysisContainer;

public class RuntimeAnalysisContainer extends AbstractRuntimeAnalysis implements IAnalysisContainer {

	private final IAnalysisAlgorithm alg;
	
	public RuntimeAnalysisContainer(IAnalysisAlgorithm alg) {
		super();
		this.alg = alg;
	}

	@Override
	protected void analyse(IClickWatchContext ctx, Node node,
			IProgressMonitor monitor) {
		alg.analyse(this, node, monitor);
	}



	@Override
	protected void initialize() {
		alg.initialize(this);
	}
}
