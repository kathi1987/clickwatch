package edu.hu.clickwatch.analysis.automated;

import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.util.UiThreadder;

public interface IAutomatedAnalysis {

	public void analyseNextSample(Network model, UiThreadder uiThreadder);
	
}
