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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.hub.clickwatch.analysis.composition.model.Transformation;
import de.hub.clickwatch.analysis.composition.model.TransformationKind;
import de.hub.clickwatch.analysis.composition.transformations.PredefinedTransformationsUtil;
import de.hub.clickwatch.analysis.composition.transformations.TransformationEngine;


public class TransformationSection extends GFPropertySection implements ITabbedPropertyConstants {

	private Text labelText;
	private Button selectXtendButton;
	private Button selectXtend2Button;
	private Button selectXtend2ReqBundleButton;
	private Text xtendText;
	private Text xtend2Text;
	private Text xtend2ReqBundleText;
	private Text xtendFuncText;
	private Text xtend2FuncText;
	private Button executeButton;
	private CCombo transCombo;
	private CCombo predefinedTransCombo;
	
	private List<Control> xtendWidgets = new ArrayList<Control>();
	private List<Control> xtend2Widgets = new ArrayList<Control>();
	private List<Control> predefinedWidgets = new ArrayList<Control>();
	private List<Control> xpandWidgets = new ArrayList<Control>();
	private List<Control> javaWidgets = new ArrayList<Control>();

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		final Shell shell = composite.getShell();
		FormData data;

		CLabel labelLabel = factory.createCLabel(composite, "Name:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(0, VSPACE);
		labelLabel.setLayoutData(data);
		
		labelText = factory.createText(composite, ""); //$NON-NLS-1$
		labelText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(labelLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(labelLabel, 0, SWT.CENTER);
		labelText.setLayoutData(data);
		labelText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				final Transformation transformation = getSelectedTransformation();
				TransactionUtil.runSafely(new Runnable() {
					@Override
					public void run() {
						transformation.setLabel(labelText.getText());
					}
				}, transformation);
			}
		});
		
		CLabel transformationLabel = factory.createCLabel(composite, "Transformation:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(labelText, VSPACE);
		transformationLabel.setLayoutData(data);
		
		executeButton = factory.createButton(composite, "execute", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(100, -100);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(transformationLabel, 0, SWT.CENTER);
		executeButton.setLayoutData(data);
		executeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				new TransformationEngine(getSelectedTransformation()).executeTransformation();
			}
		});
		
		transCombo = factory.createCCombo(composite, SWT.DROP_DOWN);
		transCombo.setItems(new String[] { 
				TransformationKind.PREDEFINED.toString(), 
				TransformationKind.XTEND.toString(), 
				TransformationKind.XPAND.toString(), 
				TransformationKind.JAVA.toString(),
				TransformationKind.XTEND2.toString() });
		data = new FormData();
		data.left = new FormAttachment(transformationLabel, HSPACE);
		data.right = new FormAttachment(executeButton, -HSPACE);
		data.top = new FormAttachment(transformationLabel, 0, SWT.CENTER);
		transCombo.setText(TransformationKind.PREDEFINED.toString());
		transCombo.setLayoutData(data);
		transCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				switchTransformation();
				setTransformationKind();
			}
		});
		
		// ******* XTEND 2 CONTROLS START **********
		
		// xtend2 func
		CLabel xtend2Label = factory.createCLabel(composite, "Xtend2:");
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(transformationLabel, VSPACE);
		xtend2Label.setLayoutData(data);
		xtend2Widgets.add(xtend2Label);
		
		selectXtend2Button = factory.createButton(composite, "...", SWT.PUSH);
		selectXtend2Button.addSelectionListener(new SelectionAdapter() {
			@Override			
			public void widgetSelected(SelectionEvent selectionEvent) {
				IFile file = null;	
				
				IFile[] files = WorkspaceResourceDialog.openFileSelection(shell, null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					String uriString = URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString();
					setXtend2(uriString);
					refresh();
				}
			}
		});
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(xtend2Label, 0, SWT.CENTER);
		selectXtend2Button.setLayoutData(data);
		xtend2Widgets.add(selectXtend2Button);	
		
		xtend2Text = factory.createText(composite, ""); //$NON-NLS-1$
		xtend2Text.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(xtend2Label, HSPACE);
		data.right = new FormAttachment(selectXtend2Button, -HSPACE);
		data.top = new FormAttachment(xtend2Label, 0, SWT.CENTER);
		xtend2Text.setLayoutData(data);
		xtend2Text.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setXtend2(xtend2Text.getText());
			}
		});
		xtend2Widgets.add(xtend2Text);
		
		// required bundle
		CLabel xtend2RequiredBundleLabel = factory.createCLabel(composite, "Req. bundle:");
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(xtend2Text, VSPACE);
		xtend2RequiredBundleLabel.setLayoutData(data);
		xtend2Widgets.add(xtend2RequiredBundleLabel);
		
		selectXtend2ReqBundleButton = factory.createButton(composite, "...", SWT.PUSH);
		selectXtend2ReqBundleButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				IContainer file = null;
				IContainer[] files = WorkspaceResourceDialog.openFolderSelection(shell, null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {		
					try
					{
						String uriString = URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString();
						setRequiredBundle(uriString);						
						refresh();
					}
					catch (Exception e) {}
				}
			}
		});
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(xtend2RequiredBundleLabel, 0, SWT.CENTER);
		selectXtend2ReqBundleButton.setLayoutData(data);
		xtend2Widgets.add(selectXtend2ReqBundleButton);				
		
		xtend2ReqBundleText = factory.createText(composite, ""); //$NON-NLS-1$
		xtend2ReqBundleText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(xtend2RequiredBundleLabel, HSPACE);
		data.right = new FormAttachment(selectXtend2ReqBundleButton, -HSPACE);
		data.top = new FormAttachment(xtend2RequiredBundleLabel, 0, SWT.CENTER);
		xtend2ReqBundleText.setLayoutData(data);
		xtend2ReqBundleText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setRequiredBundle(xtend2ReqBundleText.getText());
			}
		});
		xtend2Widgets.add(xtend2ReqBundleText);
		
		
		// xtend2 function
		CLabel xtend2FuncLabel = factory.createCLabel(composite, "function:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(xtend2ReqBundleText, VSPACE);
		xtend2FuncLabel.setLayoutData(data);
		xtend2Widgets.add(xtend2FuncLabel);

		xtend2FuncText = factory.createText(composite, ""); //$NON-NLS-1$
		xtend2FuncText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(xtend2FuncLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(xtend2FuncLabel, 0, SWT.CENTER);
		xtend2FuncText.setLayoutData(data);
		xtend2FuncText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setXtend2Func(xtend2FuncText.getText());
			}
		});
		xtend2Widgets.add(xtend2FuncText);
		// ******* XTEND 2 CONTROLS END **********
		
		CLabel xtendLabel = factory.createCLabel(composite, "Xtend:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(transformationLabel, VSPACE);
		xtendLabel.setLayoutData(data);
		xtendWidgets.add(xtendLabel);
		
		selectXtendButton = factory.createButton(composite, "...", SWT.PUSH);
		selectXtendButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				IFile file = null;
				IFile[] files = WorkspaceResourceDialog.openFileSelection(shell, null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					String uriString = URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString();
					setXtend(uriString);
					refresh();
				}
			}
		});
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(xtendLabel, 0, SWT.CENTER);
		selectXtendButton.setLayoutData(data);
		xtendWidgets.add(selectXtendButton);

		xtendText = factory.createText(composite, ""); //$NON-NLS-1$
		xtendText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(xtendLabel, HSPACE);
		data.right = new FormAttachment(selectXtendButton, -HSPACE);
		data.top = new FormAttachment(xtendLabel, 0, SWT.CENTER);
		xtendText.setLayoutData(data);
		xtendText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setXtend(xtendText.getText());
			}
		});
		xtendWidgets.add(xtendText);
		
		CLabel xtendFuncLabel = factory.createCLabel(composite, "function:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(xtendText, VSPACE);
		xtendFuncLabel.setLayoutData(data);
		xtendWidgets.add(xtendFuncLabel);

		xtendFuncText = factory.createText(composite, ""); //$NON-NLS-1$
		xtendFuncText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(xtendFuncLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(xtendFuncLabel, 0, SWT.CENTER);
		xtendFuncText.setLayoutData(data);
		xtendFuncText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setXtendFunc(xtendFuncText.getText());
			}
		});
		xtendWidgets.add(xtendFuncText);
		
		predefinedTransCombo = factory.createCCombo(composite, SWT.DROP_DOWN);
		Collection<String> predefinedTransNames = PredefinedTransformationsUtil.getPredefinedTransformations().keySet();
		String[] predefinedTransItems = new String[predefinedTransNames.size()];
		Iterator<String> it = predefinedTransNames.iterator();
		for (int i = 0; i < predefinedTransNames.size(); i++) {
			predefinedTransItems[i] = it.next();
		}
		predefinedTransCombo.setItems(predefinedTransItems);
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(transformationLabel, VSPACE);
		predefinedTransCombo.setLayoutData(data);
		predefinedTransCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
			}
		});
		predefinedTransCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setPredefinedTransformation(predefinedTransCombo.getText());
			}
		});
		predefinedWidgets.add(predefinedTransCombo);
		
		switchTransformation();
	}
	
	private void setPredefinedTransformation(final String text) {
		final Transformation transformation = getSelectedTransformation();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setPredefinedTransformation(text);
			}
		}, transformation);
	}

	private void setXtend2Func(final String text) {
		final Transformation transformation = getSelectedTransformation();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setTransformationFunction(text);
			}
		}, transformation);
	}
	
	private void setXtendFunc(final String text) {
		final Transformation transformation = getSelectedTransformation();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setTransformationFunction(text);
			}
		}, transformation);
	}

	private void setXtend(final String uriString) {
		final Transformation transformation = getSelectedTransformation();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setTransformationUri(uriString);
			}
		}, transformation);
	}
	
	private void setXtend2(final String uriString) {
		final Transformation transformation = getSelectedTransformation();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setTransformationUri(uriString);
			}
		}, transformation);
	}
	
	private void setRequiredBundle(final String uriString) {
		final Transformation transformation = getSelectedTransformation();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setRequiredBundle(uriString);
			}
		}, transformation);
	}

	public Transformation getSelectedTransformation() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof Transformation) {
				return (Transformation)bo;
			}
		}
		return null;
	}

	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			// the filter assured, that it is a ModelNode
			if (bo == null)
				return;
			Transformation transformation = (Transformation)bo;
			String label = transformation.getLabel();
			labelText.setText(label == null ? "" : label); //$NON-NLS-1$
			String transformationFunction = transformation.getTransformationFunction();
			transCombo.setText(transformation.getKind().toString());
			xtendFuncText.setText(transformationFunction == null ? "" : transformationFunction);
			String transformationUri = transformation.getTransformationUri();
			xtendText.setText(transformationUri == null ? "" : transformationUri);
			
			xtend2FuncText.setText(transformationFunction == null ? "" : transformationFunction);			
			xtend2Text.setText(transformationUri == null ? "" : transformationUri);			
			xtend2ReqBundleText.setText(transformation.getRequiredBundle() == null ? "" : transformation.getRequiredBundle());
			
			String predefinedTransformation = transformation.getPredefinedTransformation();
			predefinedTransCombo.setText(predefinedTransformation == null ? "": predefinedTransformation);
		}
		
		switchTransformation();
	}

	private void switchTransformation() {
		setVisibility(predefinedWidgets, false);
		setVisibility(xtendWidgets, false);
		setVisibility(xpandWidgets, false);
		setVisibility(javaWidgets, false);
		setVisibility(xtend2Widgets, false);
		
		if (transCombo.getText().equals(TransformationKind.PREDEFINED.toString())) {
			setVisibility(predefinedWidgets, true);
		} else if (transCombo.getText().equals(TransformationKind.XTEND.toString())) {
			setVisibility(xtendWidgets, true);
		} else if (transCombo.getText().equals(TransformationKind.XPAND.toString())) {
			setVisibility(xpandWidgets, true);
		} else if (transCombo.getText().equals(TransformationKind.JAVA.toString())) {
			setVisibility(javaWidgets, true);
		} else if (transCombo.getText().equals(TransformationKind.XTEND2.toString())) {
			setVisibility(xtend2Widgets, true);
		}
		
	}
	
	private void setTransformationKind() {
		TransformationKind kind = null;
		if (transCombo.getText().equals(TransformationKind.PREDEFINED.toString())) {
			kind = TransformationKind.PREDEFINED;
		} else if (transCombo.getText().equals(TransformationKind.XTEND.toString())) {
			kind = TransformationKind.XTEND;
		} else if (transCombo.getText().equals(TransformationKind.XPAND.toString())) {
			kind = TransformationKind.XPAND;
		} else if (transCombo.getText().equals(TransformationKind.JAVA.toString())) {
			kind = TransformationKind.JAVA;
		} else if (transCombo.getText().equals(TransformationKind.XTEND2.toString())) {
			kind = TransformationKind.XTEND2;
		}
		
		final Transformation transformation = getSelectedTransformation();
		final TransformationKind finalKind = kind;
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				transformation.setKind(finalKind);
			}
		}, transformation);
	}
	
	private void setVisibility(List<Control> widgets, boolean visiblity) {
		for (Control widget: widgets) {
			widget.setVisible(visiblity);
		}
	}
}
