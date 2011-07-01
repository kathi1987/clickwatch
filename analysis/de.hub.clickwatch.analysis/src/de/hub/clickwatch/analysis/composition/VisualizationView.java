package de.hub.clickwatch.analysis.composition;

import java.awt.Frame;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;

import de.hub.clickwatch.analysis.composition.model.DataNode;
import de.hub.clickwatch.analysis.composition.model.Visualization;
import de.hub.clickwatch.analysis.composition.visualization.IVisualization;
import de.hub.clickwatch.analysis.composition.visualization.VisualizationsUtil;


public class VisualizationView extends AbstractDataView {
	
	public static final String ID = "edu.hu.clickwatch.analysis.composition.VisualizationView";
	
	private Frame frame = null;
	
	protected void setInput(DataNode node, Object input) {
		frame.removeAll();
		frame.setVisible(false);
		if (node != null) {
			Visualization visualization = node.getVisualization();
			if (visualization != null && visualization.getKind() != null && !visualization.getKind().equals("")) {
				String kind = visualization.getKind();
				IVisualization visualizationImpl = VisualizationsUtil.getVisualizations().get(kind);
				if (visualizationImpl != null) {
					frame.add(visualizationImpl.createVisualization(input));
					frame.setVisible(true);
					return;
				}
			}
		}

	}


	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
	    frame = SWT_AWT.new_Frame(composite);
	    frame.pack();
	}
}