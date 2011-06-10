package edu.hu.clickwatch.analysis.composition.property;

import java.util.Collection;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import edu.hu.clickwatch.analysis.composition.model.CompositionFactory;
import edu.hu.clickwatch.analysis.composition.model.DataNode;
import edu.hu.clickwatch.analysis.composition.model.TransformationKind;
import edu.hu.clickwatch.analysis.composition.model.Visualization;
import edu.hu.clickwatch.analysis.composition.visualization.VisualizationsUtil;

public class DataNodeVisualizationSection  extends GFPropertySection implements ITabbedPropertyConstants {

	private CCombo visualizationCombo;
	protected CLabel mapKeyLabel;
	
	protected Composite composite;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		composite = factory.createFlatFormComposite(parent);
		FormData data;
	
		CLabel visualizationLabel = factory.createCLabel(composite, "Visualization:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(0, 0);
		visualizationLabel.setLayoutData(data);
		
		visualizationCombo = factory.createCCombo(composite, SWT.DROP_DOWN);
		Collection<String> visualizations = 
			VisualizationsUtil.getVisualizations().keySet();
		String[] visualizationArray = new String[visualizations.size()];
		int i = 0;
		for (String visualization: visualizations) {
			visualizationArray[i++] = visualization;
		}
		
		visualizationCombo.setItems(visualizationArray);
		data = new FormData();
		data.left = new FormAttachment(visualizationLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(visualizationLabel, 0, SWT.CENTER);
		visualizationCombo.setText(TransformationKind.PREDEFINED.toString());
		visualizationCombo.setLayoutData(data);
		visualizationCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setVisualization(visualizationCombo.getText());
			}
		});
		
	}

	private void setVisualization(final String kind) {
		final Visualization visualization = getSelectedVisualization(true);
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				visualization.setKind(kind);
			}
		}, visualization);
	}

	public Visualization getSelectedVisualization(boolean create) {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof DataNode) {
				final DataNode dataNode = (DataNode)bo;
				if (dataNode.getVisualization() == null) {
					if (create) {
						TransactionUtil.runSafely(new Runnable() {
							@Override
							public void run() {
								Visualization visualization = CompositionFactory.eINSTANCE.createVisualization();
								dataNode.setVisualization(visualization);
							}
						}, dataNode);
					}	
				}	
				return dataNode.getVisualization();
			}
		}
		return null;
	}

	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Visualization visualization = getSelectedVisualization(false);
			String kind = null;
			if (visualization != null) {
				kind = visualization.getKind();
			}
			kind = kind == null ? "" : kind;
			visualizationCombo.setText(kind);
		}
	}
	
}
