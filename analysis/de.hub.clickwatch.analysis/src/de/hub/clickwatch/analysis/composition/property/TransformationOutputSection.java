/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package de.hub.clickwatch.analysis.composition.property;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
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

import de.hub.clickwatch.analysis.composition.model.ParameterSpec;
import de.hub.clickwatch.analysis.composition.model.TargetSpec;
import de.hub.clickwatch.analysis.composition.model.Transformation;
import de.hub.clickwatch.analysis.composition.model.TransformationKind;


public class TransformationOutputSection extends TransformationInputSection implements ITabbedPropertyConstants {

	private CCombo targetCombo;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);
		
		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		FormData data;
		
		CLabel targetLabel = factory.createCLabel(composite, "Target semantics:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(mapKeyLabel, VSPACE);
		targetLabel.setLayoutData(data);
		
		targetCombo = factory.createCCombo(composite, SWT.DROP_DOWN);
		targetCombo.setItems(new String[] { 
				TargetSpec.EXISTING.toString(),
				TargetSpec.ADD.toString() });
		data = new FormData();
		data.left = new FormAttachment(targetLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(targetLabel, 0, SWT.CENTER);
		targetCombo.setText(TransformationKind.PREDEFINED.toString());
		targetCombo.setLayoutData(data);
		targetCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setTargetCombo();
			}
		});
	}

	private void setTargetCombo() {
		TargetSpec spec = null;
		if (targetCombo.getText().equals(TargetSpec.EXISTING.toString())) {
			spec = TargetSpec.EXISTING;
		} else if (targetCombo.getText().equals(TargetSpec.ADD.toString())) {
			spec = TargetSpec.ADD;
		}
		
		final Transformation transformation = (Transformation)getSelectedTransformationParameter().eContainer();
		final TargetSpec finalSpec = spec;
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setTargetSpec(finalSpec);
			}
		}, transformation);
	}
	
	

	@Override
	public void refresh() {
		super.refresh();
		final Transformation transformation = (Transformation)getSelectedTransformationParameter().eContainer();
		targetCombo.setText(transformation.getTargetSpec().toString());
	}

	@Override
	public ParameterSpec getSelectedTransformationParameter() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof Transformation) {
				return ((Transformation)bo).getOutput();
			}
		}
		return null;
	}
	
	
}
