package de.hub.clickwatch.analysis.visualization;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import de.hub.clickwatch.util.Throwables;

public class VisualizationView extends AbstractDataView implements IVisualizationInputChangeListener {
	
	private static final String visualizationExtensionId = "de.hub.clickwatch.analysis.Visualization";
	private static List<IVisualization> providersCache = null;
	
	public static final String ID = "edu.hu.clickwatch.analysis.composition.VisualizationView";	
	private Frame frame = null;
	private IVisualizationInput currentInput = null;
	
	/* Wird aufgerufen wenn sich die Selection ändert! */
	protected void setInput(final IVisualizationInput input) {
		if (input == null) {
			return;
		}
		if (currentInput != null) {
			currentInput.removeInputChangeListener(this);
		}
		
		currentInput = input;
		currentInput.addInputChangeListener(this);
		
		/* Entfernt alle alten angezeigten Plost und fügt den neuen hinzu!
		 * Den neuen bekommt er über input.getInputData
		 * Eigentlich Arbeit in der if-Abfrage!!!
		 * Holt die zu visualisierenden Elemente aus dem providersCache */
		for (IVisualization visualization: getVisualizations()) {
			if (visualization.isEnabledForInput(input.getInputData())) {
				frame.removeAll();
				frame.setVisible(false);
				
				frame.add(visualization.createVisualization(input.getInputData()));
				frame.setVisible(true);
				return;
			}
		}
	}
	
	public void inputDataHasChanged() {
		for (IVisualization visualization: getVisualizations()) {
			if (visualization.isEnabledForInput(currentInput.getInputData())) {
				visualization.updateVisualization(currentInput.getInputData());
			}
		}
	}
	/**
	 * Wird beim Eclipsestart aufgerufen!
	 * Erzeugt die neue View inkl. Frame und Plot!
	 */
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
	    frame = SWT_AWT.new_Frame(composite);
	    frame.pack();
	}
	
	/**
	 * Wird aufgerufen wenn ein Knoten selektiert ist, der dann zum Plot führt!
	 * Beim ersten Aufruf: providersCache (inputliste) == leer => neu anlegen
	 * Danach wird immer der aktuelle providersCache zurückgegeben
	 * @return
	 */
	private List<IVisualization> getVisualizations() {
		if (providersCache == null) {
			List<IVisualization> result = new ArrayList<IVisualization>();
			IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(visualizationExtensionId);
			for (IConfigurationElement config: configs) {
				try {
					IVisualization provider = (IVisualization)config.createExecutableExtension("class");
					result.add(provider);
				} catch (CoreException e) {
					Throwables.propagate(e);
				}
			}
			return providersCache = result;
		}
		return providersCache;
	}	
}