package de.hub.clickwatch.recorder.examples.ui;

import de.hub.clickwatch.recorder.examples.SeismoAmplAnalysisAlg;

public class RuntimeSeismoAnalysis extends RuntimeAnalysisContainer {

	public RuntimeSeismoAnalysis() {
		super(new SeismoAmplAnalysisAlg());
	}

}
