package de.hub.clickwatch.analysis.automated;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.ui.util.UIContext;

public interface IAutomatedAnalysis {

	public void analyseNextSample(Network model, UIContext uiThreadder);
	
}
