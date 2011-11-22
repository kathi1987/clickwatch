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
import org.eclipse.swt.custom.CCombo;
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

import de.hub.clickwatch.analysis.activity_composition.dialog.ClickWatchDatabaseObjectChooser;
import de.hub.clickwatch.analysis.activity_composition.model.InputEdge;
import de.hub.clickwatch.analysis.activity_composition.model.ModelNode;

public class InputEdgeSection extends GFPropertySection implements
		ITabbedPropertyConstants {

	protected Text recordElement;
	protected Text nodeElement;
	protected Text handlerElement;
	protected Text timeFrom;
	protected Text timeTo;
	
	
	protected CCombo nodeSelectType;
	protected CCombo timeSelectType;
	protected CCombo handlerSelectType;
	
	
	private static String SELECT_CERTAIN = "Select";
	private static String FOR_EVERY = "For every";

	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		final Shell shell = composite.getShell();
		FormData data;

		//
		// record selection
		CLabel recordElementLabel = factory.createCLabel(composite,
				"Choose record:");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, 120);
		data.top = new FormAttachment(0, VSPACE);
		recordElementLabel.setLayoutData(data);

		Button searchModelElementBtn = factory.createButton(composite, "...",
				SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(recordElementLabel, 0, SWT.CENTER);
		searchModelElementBtn.setLayoutData(data);
		searchModelElementBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				InputEdge inputEdge = getSelectedInputEdge();

				// is the source a model node with a set clickwatch resource?
				if (inputEdge.getSource() instanceof ModelNode
						&& ((ModelNode) inputEdge.getSource())
								.getModelResource().endsWith("cwdatabase")) {
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
						ClickWatchDatabaseObjectChooser dialog = new ClickWatchDatabaseObjectChooser(
								shell, modelResource);
						if (dialog.open() == Dialog.OK) {
							setModelUri(dialog.getSelecteID());
						}
					}

				} else {

				}
			}
		});

		recordElement = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(recordElementLabel, HSPACE);
		data.right = new FormAttachment(searchModelElementBtn, -HSPACE);
		data.top = new FormAttachment(recordElementLabel, 0, SWT.CENTER);
		recordElement.setLayoutData(data);
		
		//
		// node selection
		CLabel nodeElementLabel = factory.createCLabel(composite, "Node element:");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, 120);
		data.top = new FormAttachment(recordElementLabel,  VSPACE);
		nodeElementLabel.setLayoutData(data);
		
		nodeSelectType = factory.createCCombo(composite);
		nodeSelectType.add(FOR_EVERY);
		nodeSelectType.add(SELECT_CERTAIN);
		nodeSelectType.select(0);
		data = new FormData();
		data.left = new FormAttachment(nodeElementLabel, HSPACE);
		//data.right = new FormAttachment(nodeElement, HSPACE);
		data.top = new FormAttachment(nodeElementLabel, 0, SWT.CENTER);
		nodeSelectType.setLayoutData(data);
		
		nodeElement = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(nodeSelectType, HSPACE);
		//data.right = new FormAttachment(0, -HSPACE);
		data.top = new FormAttachment(nodeElementLabel, 0, SWT.CENTER);
		nodeElement.setLayoutData(data);
		
		//
		// handler selection
		CLabel handlerLabel = factory.createCLabel(composite, "Handler:");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, 120);
		data.top = new FormAttachment(nodeElementLabel,  VSPACE);
		handlerLabel.setLayoutData(data);
		
		handlerSelectType = factory.createCCombo(composite);
		handlerSelectType.add(FOR_EVERY);
		handlerSelectType.add(SELECT_CERTAIN);
		handlerSelectType.select(0);
		data = new FormData();
		data.left = new FormAttachment(handlerLabel, HSPACE);
		//data.right = new FormAttachment(nodeElement, HSPACE);
		data.top = new FormAttachment(handlerLabel, 0, SWT.CENTER);
		handlerSelectType.setLayoutData(data);
		
		handlerElement = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(handlerSelectType, HSPACE);
		//data.right = new FormAttachment(0, -HSPACE);
		data.top = new FormAttachment(handlerLabel, 0, SWT.CENTER);
		handlerElement.setLayoutData(data);
		
		//
		// time selection
		CLabel timeLabel = factory.createCLabel(composite, "Record time:");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, 120);
		data.top = new FormAttachment(handlerLabel,  VSPACE);
		timeLabel.setLayoutData(data);
		
		timeSelectType = factory.createCCombo(composite);
		timeSelectType.add(FOR_EVERY);
		timeSelectType.add(SELECT_CERTAIN);
		timeSelectType.select(0);
		data = new FormData();
		data.left = new FormAttachment(timeLabel, HSPACE);
		//data.right = new FormAttachment(nodeElement, HSPACE);
		data.top = new FormAttachment(timeLabel, 0, SWT.CENTER);
		timeSelectType.setLayoutData(data);
		
		CLabel timeFromLabel = factory.createCLabel(composite, "start:");
		data = new FormData();
		data.left = new FormAttachment(timeSelectType, HSPACE);
		//data.right = new FormAttachment(0, HSPACE);
		data.top = new FormAttachment(timeLabel, 0, SWT.CENTER);
		timeFromLabel.setLayoutData(data);
		
		timeFrom = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(timeFromLabel, HSPACE);
		//data.right = new FormAttachment(0, -HSPACE);
		data.top = new FormAttachment(timeFromLabel, 0, SWT.CENTER);
		timeFrom.setLayoutData(data);
		
		CLabel timeToLabel = factory.createCLabel(composite, "end:");
		data = new FormData();
		data.left = new FormAttachment(timeFrom, HSPACE);
		//data.right = new FormAttachment(0, 120);
		data.top = new FormAttachment(timeLabel, 0, SWT.CENTER);
		timeToLabel.setLayoutData(data);
		
		timeTo = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(timeToLabel, HSPACE);
		//data.right = new FormAttachment(0, -HSPACE);
		data.top = new FormAttachment(timeLabel, 0, SWT.CENTER);
		timeTo.setLayoutData(data);
		
	}

	/**
	 * setter for the text in the model element text element
	 * 
	 * @param uri
	 *            the new uri for the model
	 */
	private void setModelUri(String uri) {
		this.recordElement.setText(uri);

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
							.endsWith("cwdatabase")))
				recordElement.setEnabled(false);

			else
				recordElement.setEnabled(true);

			String modelResUri = inputEdge.getClickwatchModelElement();
			recordElement.setText(modelResUri == null ? "" : modelResUri);
		}
	}

}
