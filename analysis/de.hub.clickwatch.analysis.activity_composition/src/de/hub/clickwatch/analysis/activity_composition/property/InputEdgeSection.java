package de.hub.clickwatch.analysis.activity_composition.property;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.hub.clickwatch.analysis.activity_composition.model.InputEdge;
import de.hub.clickwatch.analysis.activity_composition.model.ModelNode;
import de.hub.clickwatch.transformationLauncher.dialog.ClickWatchModelObjectChooser;

public class InputEdgeSection extends GFPropertySection implements
		ITabbedPropertyConstants {

	Text modelElement;

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		final Shell shell = composite.getShell();
		FormData data;

		CLabel modelElementLabel = factory.createCLabel(composite,
				"Model element:");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, 120);
		data.top = new FormAttachment(0, VSPACE);
		modelElementLabel.setLayoutData(data);

		Button searchModelElementBtn = factory.createButton(composite, "...",
				SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(modelElementLabel, 0, SWT.CENTER);
		searchModelElementBtn.setLayoutData(data);
		searchModelElementBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				InputEdge inputEdge = getSelectedInputEdge();

				// is the source a model node with a set clickwatch resource?
				if (inputEdge.getSource() instanceof ModelNode
						&& ((ModelNode) inputEdge.getSource())
								.getModelResource().endsWith("clickwatchmodel")) {
					String modelPath = ((ModelNode) inputEdge.getSource())
							.getModelResource();
					ResourceSet resourceSet = new ResourceSetImpl();
					resourceSet.getLoadOptions()
							.put(XMLResource.OPTION_EXTENDED_META_DATA,
									Boolean.TRUE);

					Resource modelResource = null;

					try {
						modelResource = resourceSet.getResource(
								URI.createURI(modelPath), true);
					} catch (Exception e) {
						Status s = new Status(IStatus.ERROR, "not_used",
								"The given source model file is not valid: "
										+ modelPath, null);
						StatusManager.getManager()
								.handle(s, StatusManager.SHOW);
					}
					if (modelResource != null) {
						ClickWatchModelObjectChooser dialog = new ClickWatchModelObjectChooser(
								shell, modelResource);
						if (dialog.open() == Dialog.OK) {
							setModelUri(dialog.getSelecteID());
						}
					}

				} else {

				}
			}
		});

		modelElement = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(modelElementLabel, HSPACE);
		data.right = new FormAttachment(searchModelElementBtn, -HSPACE);
		data.top = new FormAttachment(modelElementLabel, 0, SWT.CENTER);
		modelElement.setLayoutData(data);
	}

	/**
	 * setter for the text in the model element text element
	 * 
	 * @param uri
	 *            the new uri for the model
	 */
	private void setModelUri(String uri) {
		this.modelElement.setText(uri);

		getSelectedInputEdge().setClickwatchModelElement(uri);
	}

	/**
	 * reads the input edge node that is currently selected
	 * 
	 * @return the selected model node if any
	 */
	public InputEdge getSelectedInputEdge() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof InputEdge) {
				return (InputEdge) bo;
			}
		}
		return null;
	}

	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(pe);
			// the filter assured, that it is a ModelNode
			if (bo == null)
				return;

			InputEdge inputEdge = (InputEdge) bo;

			// if the input object for this edge has a clickwatchmodel resource, the user can choose the element in it
			if (!(inputEdge.getSource() instanceof ModelNode) || ((ModelNode) inputEdge.getSource()).getModelResource() == null
					|| !(((ModelNode) inputEdge.getSource()).getModelResource()
							.endsWith("clickwatchmodel")))
				modelElement.setEnabled(false);

			else
				modelElement.setEnabled(true);

			String modelResUri = inputEdge.getClickwatchModelElement();
			modelElement.setText(modelResUri == null ? "" : modelResUri);
		}
	}

}
