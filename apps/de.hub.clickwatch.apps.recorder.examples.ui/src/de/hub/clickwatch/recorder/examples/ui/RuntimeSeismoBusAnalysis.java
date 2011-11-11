package de.hub.clickwatch.recorder.examples.ui;

import de.hub.clickwatch.recorder.examples.SeismoBusAnalysisAlg;

public class RuntimeSeismoBusAnalysis extends RuntimeAnalysisContainer {

	public RuntimeSeismoBusAnalysis() {
		super(new SeismoBusAnalysisAlg());
	}
	
}