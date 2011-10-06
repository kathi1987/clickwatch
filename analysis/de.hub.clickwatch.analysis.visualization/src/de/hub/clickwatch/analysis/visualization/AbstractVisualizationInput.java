package de.hub.clickwatch.analysis.visualization;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractVisualizationInput implements IVisualizationInput {
	
	private final List<IVisualizationInputChangeListener> listeners = new ArrayList<IVisualizationInputChangeListener>();

	@Override
	public void addInputChangeListener(
			IVisualizationInputChangeListener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeInputChangeListener(
			IVisualizationInputChangeListener listener) {
		listeners.remove(listener);
	}
	
	public void inputDataHasChanged() {
		for (IVisualizationInputChangeListener listener: listeners) {
			listener.inputDataHasChanged();
		}
	}

}
