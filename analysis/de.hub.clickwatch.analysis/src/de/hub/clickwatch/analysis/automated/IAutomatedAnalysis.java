package de.hub.clickwatch.analysis.automated;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.ui.util.UiThreadder;

public interface IAutomatedAnalysis {

	public void analyseNextSample(Network model, UiThreadder uiThreadder);
	
}
