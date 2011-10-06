package de.hub.clickwatch.analysis.visualization;

public interface IVisualizationInput {

	public void addInputChangeListener(IVisualizationInputChangeListener listener);
	
	public void removeInputChangeListener(IVisualizationInputChangeListener listener);
	
	public Object getInputData();
}
