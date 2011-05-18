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
package edu.hu.clickwatch.analysis.composition.property;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
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
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.analysis.composition.model.ModelNode;
import edu.hu.clickwatch.analysis.composition.model.ModelUtil;
import edu.hu.clickwatch.analysis.composition.model.Node;
import edu.hu.clickwatch.analysis.composition.model.Transformation;
import edu.hu.clickwatch.analysis.composition.model.TransformationKind;
import edu.hu.clickwatch.analysis.composition.transformations.IPredefinedTransformation;
import edu.hu.clickwatch.analysis.composition.transformations.PredefinedTransformationsUtil;
import edu.hu.clickwatch.analysis.composition.transformations.TransformationException;
import edu.hu.clickwatch.analysis.ui.Activator;

public class TransformationSection extends GFPropertySection implements ITabbedPropertyConstants {

	private Text labelText;
	private Button selectXtendButton;
	private Text xtendText;
	private Text xtendFuncText;
	private Button executeButton;
	private CCombo transCombo;
	private CCombo predefinedTransCombo;
	
	private List<Control> xtendWidgets = new ArrayList<Control>();
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
				executeTransformation();
			}
		});
		
		transCombo = factory.createCCombo(composite, SWT.DROP_DOWN);
		transCombo.setItems(new String[] { 
				TransformationKind.PREDEFINED.toString(), 
				TransformationKind.XTEND.toString(), 
				TransformationKind.XPAND.toString(), 
				TransformationKind.JAVA.toString() });
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

	private EPackage loadMetaModel(ResourceSet rs, ModelNode node) throws IOException {
		URI uri = URI.createURI(node.getMetaModelResource());
		Resource metaModelResource = rs.getResource(uri, false);
		if (metaModelResource == null) {
			metaModelResource = rs.createResource(uri);
		}
		if (!metaModelResource.isLoaded()) {
			metaModelResource.load(XmlModelRepository.defaultLoadSaveOptions());
		}
		EPackage metaModel = (EPackage)metaModelResource.getContents().get(0);
		EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
		return metaModel;
	}
	
	private void executeTransformation() {
		if (transCombo.getText().equals(TransformationKind.PREDEFINED.toString())) {
			executePredefinedTransformation();
		} else if (transCombo.getText().equals(TransformationKind.XTEND.toString())) {
			executeXtendTransformation();
		} else if (transCombo.getText().equals(TransformationKind.XPAND.toString())) {
			raiseError("not supported yet");
		} else if (transCombo.getText().equals(TransformationKind.JAVA.toString())) {
			raiseError("not supported yet");
		}
	}
	
	private void executePredefinedTransformation() {
		final Transformation transformation = getSelectedTransformation();
		String predefinedTransformationName = predefinedTransCombo.getText();
		final IPredefinedTransformation predefinedTransformation = 
				PredefinedTransformationsUtil.getPredefinedTransformations().get(predefinedTransformationName);
		if (predefinedTransformation == null) {
			raiseError("unknown transformation " + predefinedTransformationName); return;
		}
		
		final ModelSet models = getModels(false, false);
		if (models != null) {
			try {
				TransactionUtil.runSafely(new Runnable() {
					@Override
					public void run() {
						try {
							predefinedTransformation.execute(models.sourceModel.model, models.targetModel.model);
							ModelUtil.addModelToModelNode((ModelNode)transformation.getTarget(), models.targetModel.model);
						} catch (TransformationException e) {
							e.printStackTrace();
							raiseError("transformation exception");			
						}
					}
				}, transformation);
			} catch (Exception e) {
				e.printStackTrace();
				raiseError("exception during transformation");
			}
		}
	}
	
	private class Model {
		final Resource model;
		final EPackage metaModel;
		public Model(Resource model, EPackage metaModel) {
			super();
			this.model = model;
			this.metaModel = metaModel;
		}
	}
	
	private class ModelSet {
		final Model sourceModel;
		final Model targetModel;
		public ModelSet(Model sourceModel, Model targetModel) {
			super();
			this.sourceModel = sourceModel;
			this.targetModel = targetModel;
		}
	}
	
	private ModelSet getModels(
			boolean requireSourceMetaModel, 
			boolean requireTargetMetaModel) {
		Transformation transformation = getSelectedTransformation();
		
		try {
			Node source = transformation.getSource();
			Node target = transformation.getTarget();
			
			if (source instanceof ModelNode && target instanceof ModelNode) {
				ModelNode sourceModelNode = (ModelNode)source;
				ModelNode targetModelNode = (ModelNode)target;
				
				Resource sourceModel = null;
				Resource targetModel = null;
				if (sourceModelNode.isHasModel()) {
					sourceModel = ModelUtil.getModelFromModelNode(sourceModelNode);								
				} else {
					raiseError("no source model found"); return null;
				}
				
				ResourceSet rs = sourceModel.getResourceSet();
				
				EPackage sourceMetaModel = null;
				if (requireSourceMetaModel) {
					sourceMetaModel = loadMetaModel(rs, sourceModelNode);
				}
				EPackage targetMetaModel = null;
				if (requireTargetMetaModel) {
					targetMetaModel = loadMetaModel(rs, targetModelNode);
				}
				
				if ((requireSourceMetaModel && sourceModelNode.isInferedType()) || 
						(requireTargetMetaModel && targetModelNode.isInferedType())) {
					raiseError("infered meta-models are not supported yet"); return null;
				}
				
				if (targetModelNode.isPersistent()) {
					if (targetModelNode.isHasModel()) {
						targetModel = ModelUtil.getModelFromModelNode(targetModelNode);
						targetModel.getContents().clear();
					} else {
						targetModel = rs.createResource(URI.createURI(targetModelNode.getModelResource()));
					}
				} else {
					raiseError("non persistent target models are not supported yet"); return null;
				}	
				
				return new ModelSet(new Model(sourceModel, sourceMetaModel), new Model(targetModel, targetMetaModel));
			}
		} catch (Exception e) {
			e.printStackTrace();
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not run transformation", e);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}
		
		raiseError("could not run transformation"); return null;
	}
	
	private void executeXtendTransformation() {
		Transformation transformation = getSelectedTransformation();
		
		String xtendUri = transformation.getTransformationUri();
		if (xtendUri == null) {
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No transformation specified", null);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return;
		}
		String xtendFunction = transformation.getTransformationFunction();
		if (xtendFunction == null) {
			xtendFunction = "performTransformation";
		}
		
		try {
			ModelSet models = getModels(true, true);
			if (models != null) {
				XtendFacade f = XtendFacade.create();
				f.registerMetaModel(new EmfMetaModel(models.sourceModel.metaModel));
				f.registerMetaModel(new EmfMetaModel(models.targetModel.metaModel));
				f = f.cloneWithExtensions(read(URIConverter.INSTANCE.createInputStream(URI.createURI(xtendUri))));
				
				final Object result = f.call(xtendFunction, new Object[] { models.sourceModel.model.getContents().get(0)});
				
				final Resource finalTargetModel = models.targetModel.model;
				final ModelNode finalTargetModelNode = (ModelNode)transformation.getTarget();
				if (!(result instanceof EObject)) {
					raiseError("invalid transformation result"); return;
				} else {
					TransactionUtil.runSafely(new Runnable() {
						@Override
						public void run() {
							finalTargetModel.getContents().add((EObject)result);
							if (!finalTargetModelNode.isHasModel()) {
								ModelUtil.addModelToModelNode(finalTargetModelNode, finalTargetModel);
							}
						}
					}, transformation);
					
				}
				
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not run transformation", e);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return;
		}
		
		raiseError("could not run transformation");
	}
	
	private void raiseError(String string) {
		Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, string, null);
		StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
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
		
		if (transCombo.getText().equals(TransformationKind.PREDEFINED.toString())) {
			setVisibility(predefinedWidgets, true);
		} else if (transCombo.getText().equals(TransformationKind.XTEND.toString())) {
			setVisibility(xtendWidgets, true);
		} else if (transCombo.getText().equals(TransformationKind.XPAND.toString())) {
			setVisibility(xpandWidgets, true);
		} else if (transCombo.getText().equals(TransformationKind.JAVA.toString())) {
			setVisibility(javaWidgets, true);
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
	
	private String read (InputStream in) throws IOException {
	    StringBuffer out = new StringBuffer();
	    byte[] b = new byte[4096];
	    for (int n; (n = in.read(b)) != -1;) {
	        out.append(new String(b, 0, n));
	    }
	    return out.toString();
	}
}
