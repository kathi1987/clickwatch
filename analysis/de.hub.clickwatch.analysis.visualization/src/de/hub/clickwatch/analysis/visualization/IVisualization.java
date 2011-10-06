package de.hub.clickwatch.analysis.visualization;

import java.awt.Component;

public interface IVisualization {
	
	public boolean isEnabledForInput(Object input);

	public Component createVisualization(Object input);
	
	public void updateVisualization(Object input);
}
