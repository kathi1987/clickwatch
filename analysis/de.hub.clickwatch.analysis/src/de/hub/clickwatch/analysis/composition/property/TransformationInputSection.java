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

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.hub.clickwatch.analysis.composition.model.ParameterSpec;
import de.hub.clickwatch.analysis.composition.model.ParameterSpecKind;
import de.hub.clickwatch.analysis.composition.model.Transformation;
import de.hub.clickwatch.analysis.composition.model.TransformationKind;


public class TransformationInputSection extends GFPropertySection implements ITabbedPropertyConstants {

	private CCombo inputKindCombo;
	protected CLabel mapKeyLabel;
	private Text mapKeyText;
	private Text listQueryText;
	
	private List<Control> mapWidgets = new ArrayList<Control>();
	private List<Control> listWidgets = new ArrayList<Control>();
	
	protected Composite composite;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		composite = factory.createFlatFormComposite(parent);
		FormData data;
	
		CLabel inputKindLabel = factory.createCLabel(composite, "Parameter kind:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(0, 0);
		inputKindLabel.setLayoutData(data);
		
		inputKindCombo = factory.createCCombo(composite, SWT.DROP_DOWN);
		inputKindCombo.setItems(new String[] { 
				ParameterSpecKind.ROOT.toString(),
				ParameterSpecKind.MAP.toString(),
				ParameterSpecKind.LIST.toString() });
		data = new FormData();
		data.left = new FormAttachment(inputKindLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(inputKindLabel, 0, SWT.CENTER);
		inputKindCombo.setText(TransformationKind.PREDEFINED.toString());
		inputKindCombo.setLayoutData(data);
		inputKindCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				switchInputKind();
				setInputKind();
			}
		});
		
		mapKeyLabel = factory.createCLabel(composite, "Map (class) key:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(inputKindLabel, VSPACE);
		mapKeyLabel.setLayoutData(data);
		mapWidgets.add(mapKeyLabel);

		mapKeyText = factory.createText(composite, ""); //$NON-NLS-1$
		mapKeyText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(mapKeyLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(mapKeyLabel, 0, SWT.CENTER);
		mapKeyText.setLayoutData(data);
		mapKeyText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setMapKey(mapKeyText.getText());
			}
		});
		mapWidgets.add(mapKeyText);
		
		CLabel listQueryLabel = factory.createCLabel(composite, "List query:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(inputKindLabel, VSPACE);
		listQueryLabel.setLayoutData(data);
		listWidgets.add(listQueryLabel);

		listQueryText = factory.createText(composite, ""); //$NON-NLS-1$
		listQueryText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(listQueryLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(listQueryLabel, 0, SWT.CENTER);
		listQueryText.setLayoutData(data);
		listQueryText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setListQuery(listQueryText.getText());
			}
		});
		listWidgets.add(listQueryText);
		
		switchInputKind();
	}

	private void setListQuery(final String text) {
		final ParameterSpec parameter = getSelectedTransformationParameter();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				parameter.setListQuery(text);
			}
		}, parameter);
	}

	private void setMapKey(final String text) {
		final ParameterSpec parameter = getSelectedTransformationParameter();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				parameter.setMapClassKey(text);
			}
		}, parameter);
	}

	public ParameterSpec getSelectedTransformationParameter() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof Transformation) {
				return ((Transformation)bo).getInput();
			}
		}
		return null;
	}

	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			ParameterSpec parameter = getSelectedTransformationParameter();
			
			inputKindCombo.setText(parameter.getKind().toString());
			String mapKey = parameter.getMapClassKey();
			mapKeyText.setText(mapKey == null ? "" : mapKey);
			String listQuery = parameter.getListQuery();
			listQueryText.setText(listQuery == null ? "" : listQuery);
			
			switchInputKind();
		}
	}
	
	private void switchInputKind() {
		setVisibility(mapWidgets, false);
		setVisibility(listWidgets, false);
		
		if (inputKindCombo.getText().equals(ParameterSpecKind.MAP.toString())) {
			setVisibility(mapWidgets, true);
		} else if (inputKindCombo.getText().equals(ParameterSpecKind.LIST.toString())) {
			setVisibility(listWidgets, true);
		}
	}
	
	private void setInputKind() {
		ParameterSpecKind kind = null;
		if (inputKindCombo.getText().equals(ParameterSpecKind.ROOT.toString())) {
			kind = ParameterSpecKind.ROOT;
		} else if (inputKindCombo.getText().equals(ParameterSpecKind.MAP.toString())) {
			kind = ParameterSpecKind.MAP;
		} else if (inputKindCombo.getText().equals(ParameterSpecKind.LIST.toString())) {
			kind = ParameterSpecKind.LIST;
		}
		
		final ParameterSpec parameter = getSelectedTransformationParameter();
		final ParameterSpecKind finalKind = kind;
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				parameter.setKind(finalKind);
			}
		}, parameter);
	}
	
	private void setVisibility(List<Control> widgets, boolean visiblity) {
		for (Control widget: widgets) {
			widget.setVisible(visiblity);
		}
	}
}
