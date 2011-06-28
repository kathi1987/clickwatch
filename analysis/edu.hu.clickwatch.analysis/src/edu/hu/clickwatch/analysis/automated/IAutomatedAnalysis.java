package edu.hu.clickwatch.analysis.automated;

import de.hub.clickwatch.ui.util.UiThreadder;
import edu.hu.clickwatch.model.Network;

public interface IAutomatedAnalysis {

	public void analyseNextSample(Network model, UiThreadder uiThreadder);
	
}
