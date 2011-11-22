package de.hub.clickwatch.analysis.activity_composition.property;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
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
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.hub.clickwatch.analysis.activity_composition.model.Transformation;
import de.hub.clickwatch.analysis.activity_composition.transformation.TransactionUtil;

public class TransformationNodeSection extends GFPropertySection implements
ITabbedPropertyConstants {
	
	protected Text transformationFile;
	
	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {	
		super.createControls(parent, aTabbedPropertySheetPage);
		
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		final Shell shell = composite.getShell();
		FormData data;
		
		CLabel transFileLabel = factory.createCLabel(composite, "Transformation file:");
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, 120);
		data.top = new FormAttachment(0, VSPACE);
		transFileLabel.setLayoutData(data);

		Button searchTransformationFileBtn = factory.createButton(composite, "...",
				SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(transFileLabel, 0, SWT.CENTER);
		searchTransformationFileBtn.setLayoutData(data);
		searchTransformationFileBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				IFile file = null;
				IFile[] files = WorkspaceResourceDialog.openFileSelection(
						shell, null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					String uriString = URI.createPlatformResourceURI(
							file.getFullPath().toString(), true).toString();
					setTransformationFile(uriString);
					refresh();
				}
			}
		});
		
		transformationFile = factory.createText(composite, "");
		data = new FormData();
		data.left = new FormAttachment(transFileLabel, HSPACE);
		data.right = new FormAttachment(searchTransformationFileBtn, -HSPACE);
		data.top = new FormAttachment(transFileLabel, 0, SWT.CENTER);
		transformationFile.setLayoutData(data);
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

			String transfile = ((Transformation) bo).getTransformationFile();
			transformationFile.setText(transfile == null ? "" : transfile);
		}
	}

	
	/**
	 * reads the model node that is currently selected
	 * 
	 * @return the selected model node if any
	 */
	public Transformation getSelectedTransformationNode() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService()
					.getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof Transformation) {
				return (Transformation) bo;
			}
		}
		return null;
	}
	
	/**
	 * setter for the text in the transformationfile text element
	 * 
	 * @param uri
	 *            the new uri for the transformation file
	 */
	private void setTransformationFile(final String uri) {
		this.transformationFile.setText(uri);
		final Transformation tNode = getSelectedTransformationNode();
						
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				tNode.setTransformationFile(uri);
			}
		}, tNode);
		
	}

}
