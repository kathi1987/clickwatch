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

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.CommonUIPlugin;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.analysis.composition.model.ModelNode;
import de.hub.clickwatch.analysis.composition.model.ModelUtil;
import de.hub.clickwatch.analysis.composition.model.Node;
import de.hub.clickwatch.analysis.ui.PluginActivator;


public class ModelNodeSection extends GFPropertySection implements ITabbedPropertyConstants {

	private Text labelText;
	private Button hasInferedTypeButton;
	private Text metaModelResourceText;
	private Text metaModelClassText;
	private Button selectMetaModelResource;
	private Button selectMetaModelClass;
	private Text registeredPackageText;
	private Button selectRegisteredPackage;
	private Button isPersistentButton;
	private Text modelResourceText;
	private Button selectModelResource;
	private Button loadModel;
	private Button saveModel;
	private Button clearModel;

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
				final Node node = getSelectedNode();
				TransactionUtil.runSafely(new Runnable() {
					@Override
					public void run() {
						node.setLabel(labelText.getText());
					}
				}, node);
			}
		});
		
		CLabel metaModelLabel = factory.createCLabel(composite, "Metamodel:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(labelText, VSPACE);
		metaModelLabel.setLayoutData(data);
		
		hasInferedTypeButton = factory.createButton(composite, "infered", SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(metaModelLabel, HSPACE);
		data.right = new FormAttachment(0, HSPACE+STANDARD_LABEL_WIDTH+100);
		data.top = new FormAttachment(metaModelLabel, 0, SWT.CENTER);
		hasInferedTypeButton.setLayoutData(data);
		hasInferedTypeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				toggleHasInferedType(hasInferedTypeButton.getSelection());
			}
		});
		
		CLabel metaModelResourceResourceLabel = factory.createCLabel(composite, "Resource:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(hasInferedTypeButton, VSPACE);
		metaModelResourceResourceLabel.setLayoutData(data);
		
		selectMetaModelResource = factory.createButton(composite, "...", SWT.PUSH);
		selectMetaModelResource.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				IFile file = null;
				IFile[] files = WorkspaceResourceDialog.openFileSelection(shell, null, null, false, null, null);
				if (files.length != 0) {
					file = files[0];
				}

				if (file != null) {
					String uriString = URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString();
					setMetaModelResource(uriString);
					refresh();
				}
			}
		});
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(metaModelResourceResourceLabel, 0, SWT.CENTER);
		selectMetaModelResource.setLayoutData(data);

		metaModelResourceText = factory.createText(composite, ""); //$NON-NLS-1$
		metaModelResourceText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(metaModelResourceResourceLabel, HSPACE);
		data.right = new FormAttachment(selectMetaModelResource, -HSPACE);
		data.top = new FormAttachment(metaModelResourceResourceLabel, 0, SWT.CENTER);
		metaModelResourceText.setLayoutData(data);
		metaModelResourceText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setMetaModelResource(metaModelResourceText.getText());
			}
		});
		
		CLabel metaModelClassLabel = factory.createCLabel(composite, "EClass:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(metaModelResourceText, VSPACE);
		metaModelClassLabel.setLayoutData(data);
		
		selectMetaModelClass = factory.createButton(composite, "...", SWT.PUSH);
		selectMetaModelClass.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				System.out.println("����");
			}
		});
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(metaModelClassLabel, 0, SWT.CENTER);
		selectMetaModelClass.setLayoutData(data);

		metaModelClassText = factory.createText(composite, ""); //$NON-NLS-1$
		metaModelClassText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(metaModelClassLabel, HSPACE);
		data.right = new FormAttachment(selectMetaModelClass, -HSPACE);
		data.top = new FormAttachment(metaModelClassLabel, 0, SWT.CENTER);
		metaModelClassText.setLayoutData(data);
		metaModelClassText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setMetaModelClass(metaModelClassText.getText());
			}
		});
		
		CLabel registeredPackageLabel = factory.createCLabel(composite, "Package:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH+HSPACE*2);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(metaModelClassText, VSPACE);
		registeredPackageLabel.setLayoutData(data);
		
		selectRegisteredPackage = factory.createButton(composite, "...", SWT.PUSH);
		selectRegisteredPackage.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(shell);
				registeredPackageDialog.open();
				Object[] result = registeredPackageDialog.getResult();
				Object thePackage = null;
				if (result != null && result.length != 0) {
					thePackage = result[0];
				}

				if (thePackage != null && thePackage instanceof String) {
					setRegisteredPackage((String)thePackage);
					refresh();
				}
			}
		});
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(registeredPackageLabel, 0, SWT.CENTER);
		selectRegisteredPackage.setLayoutData(data);

		registeredPackageText = factory.createText(composite, ""); //$NON-NLS-1$
		registeredPackageText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(registeredPackageLabel, HSPACE);
		data.right = new FormAttachment(selectRegisteredPackage, -HSPACE);
		data.top = new FormAttachment(registeredPackageLabel, 0, SWT.CENTER);
		registeredPackageText.setLayoutData(data);
		registeredPackageText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setRegisteredPackage(registeredPackageText.getText()); // TODO
			}
		});
		
		
		CLabel modelLabel = factory.createCLabel(composite, "Model:"); //$NON-NLS-1$
		data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.top = new FormAttachment(registeredPackageLabel, VSPACE);
		modelLabel.setLayoutData(data);
		
		isPersistentButton = factory.createButton(composite, "persistent", SWT.CHECK);
		data = new FormData();
		data.left = new FormAttachment(modelLabel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(modelLabel, 0, SWT.CENTER);
		isPersistentButton.setLayoutData(data);
		isPersistentButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				toggleIsPersistent(isPersistentButton.getSelection());
			}
		});
		
		CLabel modelResourceLabel = factory.createCLabel(composite, "Resource:");
		data = new FormData();
		data.left = new FormAttachment(modelLabel, HSPACE);
		data.right = new FormAttachment(0, STANDARD_LABEL_WIDTH*2+HSPACE*2);
		data.top = new FormAttachment(isPersistentButton, VSPACE);
		modelResourceLabel.setLayoutData(data);
		
		selectModelResource = factory.createButton(composite, "...", SWT.PUSH);
		selectModelResource.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				System.out.println("����");
			}
		});
		data = new FormData();
		data.left = new FormAttachment(100, -30);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(modelResourceLabel, 0, SWT.CENTER);
		selectModelResource.setLayoutData(data);
		selectModelResource.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent selectionEvent) {
				IFile file = openNewFile(shell, null, null, null, null);
				if (file != null) {
					String uriString = URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString();
					setModelResource(uriString);
					refresh();
				}
			}
		});

		modelResourceText = factory.createText(composite, ""); //$NON-NLS-1$
		modelResourceText.setEditable(true);
		data = new FormData();
		data.left = new FormAttachment(modelResourceLabel, HSPACE);
		data.right = new FormAttachment(selectModelResource, -HSPACE);
		data.top = new FormAttachment(modelResourceLabel, 0, SWT.CENTER);
		modelResourceText.setLayoutData(data);
		modelResourceText.addFocusListener(new AbstractFocusLostListener() {
			@Override
			protected void handleFocusLost() {
				setModelResource(modelResourceText.getText());
			}
		});
		
		loadModel = factory.createButton(composite, "load", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(modelResourceLabel, HSPACE);
		data.right = new FormAttachment(33, 0);
		data.top = new FormAttachment(modelResourceLabel, VSPACE);
		loadModel.setLayoutData(data);
		loadModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				loadModel(modelResourceText.getText());
			}
		});
		
		saveModel = factory.createButton(composite, "save", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(loadModel, HSPACE);
		data.right = new FormAttachment(66, 0);
		data.top = new FormAttachment(modelResourceLabel, VSPACE);
		saveModel.setLayoutData(data);
		
		clearModel = factory.createButton(composite, "clear", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(saveModel, HSPACE);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(modelResourceLabel, VSPACE);
		clearModel.setLayoutData(data);
		clearModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				clearModel();
			}
		});
	}
	
	protected void setRegisteredPackage(final String nsURI) {
		final ModelNode node = getSelectedNode();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				node.setRegisteredPackage(nsURI);
				node.setMetaModelResource(null);
			}
		}, node);
	}

	protected void clearModel() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof EObject) {				
				final ModelNode node = (ModelNode)bo;
				TransactionUtil.runSafely(new Runnable() {					
					@Override
					public void run() {
						ModelUtil.removeModelFromModelNode(node);		
					}
				}, node);				
				return;
			}
		}
		
		Status myStatus = new Status(IStatus.ERROR, de.hub.clickwatch.analysis.ui.PluginActivator.PLUGIN_ID, "Could not load model", null);
		StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
	}

	protected void loadModel(String uriString) {
		URI uri = URI.createURI(uriString);
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof EObject) {
				try {
					ResourceSet rs = ((EObject)bo).eResource().getResourceSet();
					
					if (!hasInferedTypeButton.getSelection()) {
						Resource metaModelResource = rs.createResource(URI.createURI(metaModelResourceText.getText()));
						metaModelResource.load(XmlModelRepository.defaultLoadSaveOptions());
						EPackage metaModel = (EPackage)metaModelResource.getContents().get(0);
						EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
					}
					
					final Resource modelResource = rs.createResource(uri);
					modelResource.load(XmlModelRepository.defaultLoadSaveOptions());
					final ModelNode node = (ModelNode)bo;
					TransactionUtil.runSafely(new Runnable() {						
						@Override
						public void run() {
							ModelUtil.addModelToModelNode(node, modelResource);		
						}
					}, node);
					
					return;
				} catch (Throwable e) {
					e.printStackTrace();
					Status myStatus = new Status(IStatus.ERROR, PluginActivator.PLUGIN_ID, "Could not load model", e);
					StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
					return;
				}
			}
		}
		
		Status myStatus = new Status(IStatus.ERROR, PluginActivator.PLUGIN_ID, "Could not load model", null);
		StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
	}

	protected void setMetaModelClass(final String text) {
		final ModelNode node = getSelectedNode();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				node.setMetaModelClass(text);
			}
		}, node);
	}
	
	protected void setMetaModelResource(final String text) {
		final ModelNode node = getSelectedNode();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				node.setMetaModelResource(text);
				node.setRegisteredPackage(null);
			}
		}, node);
	}
	
	protected void setModelResource(final String text) {
		final ModelNode node = getSelectedNode();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				node.setModelResource(text);
			}
		}, node);
	}

	protected void toggleHasInferedType(final boolean selection) {
		final ModelNode node = getSelectedNode();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				node.setInferedType(selection);
			}
		}, node);
		refresh();
	}
	
	protected void toggleIsPersistent(final boolean selection) {
		final ModelNode node = getSelectedNode();
		TransactionUtil.runSafely(new Runnable() {
			@Override
			public void run() {
				node.setPersistent(selection);
			}
		}, node);
		refresh();
	}

	public ModelNode getSelectedNode() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			if (bo instanceof ModelNode) {
				return (ModelNode)bo;
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
			ModelNode modelNode = (ModelNode)bo;
			String label = modelNode.getLabel();
			labelText.setText(label == null ? "" : label); //$NON-NLS-1$
			boolean hasInferedType = modelNode.isInferedType();
			hasInferedTypeButton.setSelection(hasInferedType);
			String metaModelResource = modelNode.getMetaModelResource();
			metaModelResourceText.setText(metaModelResource == null ? "" : metaModelResource); //$NON-NLS-1$
			String metaModelClass = modelNode.getMetaModelClass();
			metaModelClassText.setText(metaModelClass == null ? "" : metaModelClass);
			boolean isPersistent = modelNode.isPersistent();
			isPersistentButton.setSelection(isPersistent);
			String modelResource = modelNode.getModelResource();
			modelResourceText.setText(modelResource == null ? "": modelResource);
			metaModelClassText.setEnabled(!hasInferedType);
			metaModelResourceText.setEnabled(!hasInferedType);
			String registeredPackage = modelNode.getRegisteredPackage();
			registeredPackageText.setText(registeredPackage == null ? "" : registeredPackage);
			registeredPackageText.setEnabled(!hasInferedType);
			selectMetaModelClass.setEnabled(!hasInferedType);
			selectMetaModelResource.setEnabled(!hasInferedType);
			selectRegisteredPackage.setEnabled(!hasInferedType);
			modelResourceText.setEnabled(isPersistent);
			loadModel.setEnabled(isPersistent);
			saveModel.setEnabled(isPersistent);
			selectModelResource.setEnabled(isPersistent);
		}
	}
	
	public static IFile openNewFile(Shell parent, String title, String message,
			IPath suggestedPath, List<ViewerFilter> viewerFilters) {
		WorkspaceResourceDialog dialog = new WorkspaceResourceDialog(parent,
				new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		dialog.setAllowMultiple(false);
		dialog.setTitle(title != null ? title : CommonUIPlugin.INSTANCE
				.getString("_UI_NewFile_title"));
		dialog.setMessage(message);
		dialog.setShowNewFolderControl(true);
		dialog.setShowFileControl(true);

		dialog.addFilter(dialog.createDefaultViewerFilter(true));
		if (viewerFilters != null) {
			for (ViewerFilter viewerFilter : viewerFilters) {
				dialog.addFilter(viewerFilter);
			}
		}

		if (suggestedPath != null) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource resource = root.findMember(suggestedPath);
			if (resource != null && resource.isAccessible()) {
				if (resource instanceof IContainer) {
					dialog.setInitialSelection(resource);
				} else {
					dialog.setInitialSelection(resource.getParent());
					dialog.setFileText(resource.getName());
				}
			} else {
				if (suggestedPath.segmentCount() > 1) {
					if (resource == null) {
						resource = root.getFile(suggestedPath);
					}

					if (resource.getProject().isAccessible()) {
						IContainer container = resource.getParent();
						for (; !container.isAccessible()
								&& container != resource.getProject(); container = container
								.getParent()) {
							// Do nothing
						}
						dialog.setInitialSelection(container);
						suggestedPath = suggestedPath
								.removeFirstSegments(container.getFullPath()
										.segmentCount());
						dialog.setFileText(suggestedPath.toString());
						suggestedPath = null;
					}
				}

				if (suggestedPath != null) {
					String fileText = suggestedPath.isAbsolute() ? suggestedPath
							.removeFirstSegments(1).toString() : suggestedPath
							.toString();
					dialog.setFileText(fileText);
				}
			}
		}

		dialog.loadContents();
		return dialog.open() == Window.OK ? dialog.getFile() : null;
	}
}
