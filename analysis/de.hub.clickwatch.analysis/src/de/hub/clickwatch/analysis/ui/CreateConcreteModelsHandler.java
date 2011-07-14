package de.hub.clickwatch.analysis.ui;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.model.Network;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.modelgenerator.ModelGenerator;


public class CreateConcreteModelsHandler extends AbstractHandler {
	
	@Inject
	MetaModelGenerator metaModelGenerator;
	@Inject
	ModelGenerator modelGenerator;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
		final IFile genericModelFile = (IFile)selection.getFirstElement();
		final Shell activeShell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		IContainer[] directories = WorkspaceResourceDialog.openFolderSelection(activeShell, 
				"Select target directory", "Select target directory", false, null, null);
		final IContainer targetDirectory = directories[0];		
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(activeShell);
		try {
			dialog.run(false, false, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					try {
						generateSpecificModels(monitor, genericModelFile, targetDirectory);
					} catch (Exception e) {
						MessageDialog.openError(activeShell, "Error", "Could not generate models: " + e.getMessage());
						e.printStackTrace();
					}					
				}				
			});
		} catch (Exception e) {
			MessageDialog.openError(activeShell, "Error", "Could not generate models: " + e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}

	public EPackage generateSpecificMetaModel(IProgressMonitor monitor, IFile genericModelFile, IContainer targetDirectory) throws IOException {
		return generateSpecificMetaModel(monitor, URI.createPlatformResourceURI(genericModelFile.getFullPath().toString(), true),
				URI.createPlatformResourceURI(targetDirectory.getFullPath().toString() + "/SpecificMetaModel.ecore", true));
	}
	
	public EPackage generateSpecificMetaModel(IProgressMonitor monitor, URI genericModelUri, URI specificMetaModelUri) throws IOException {

		ResourceSet rs = new ResourceSetImpl();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource resource = rs.getResource(genericModelUri, true);
		Network genericModel = (Network)resource.getContents().get(0);
		
		EPackage specificMetaModel = metaModelGenerator.generate(monitor, genericModel);	
		
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		specificMetaModel.setNsURI("src/SpecificMetaModel");
		specificMetaModel.setNsPrefix("scwm");
		EPackage.Registry.INSTANCE.put(specificMetaModel.getNsURI(), specificMetaModel);

		
		Resource specificMetaModelResource = rs.createResource(specificMetaModelUri);
		specificMetaModelResource.getContents().add(specificMetaModel);
		specificMetaModelResource.save(options);
		
		return specificMetaModel;
	}
	
	public void generateSpecificModel(IProgressMonitor monitor, IFile genericModelFile, EPackage specificMetaModel, IContainer targetDirectory) throws IOException {
		generateSpecificModel(monitor, URI.createPlatformResourceURI(genericModelFile.getFullPath().toString(), true),
				specificMetaModel,
				URI.createPlatformResourceURI(targetDirectory.getFullPath().toString() + "/SpecificModel.scwm", true));
	}
	
	public void generateSpecificModel(IProgressMonitor monitor, URI genericModelUri, EPackage specificMetaModel, URI specificModelUri) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource resource = rs.getResource(genericModelUri, true);
		Network genericModel = (Network)resource.getContents().get(0);
		
		EObject specificModel = modelGenerator.generate(monitor, specificMetaModel, genericModel);
		Preconditions.checkState(specificModel != null);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("scwm", new XMIResourceFactoryImpl());
		Resource specificModelResource = rs.createResource(specificModelUri);
		specificModelResource.getContents().add(specificModel);
		specificModelResource.save(options);
	}
	
	public void generateSpecificModels(IProgressMonitor monitor, IFile genericModelFile, IContainer targetDirectory) throws IOException {
		monitor.beginTask(null, 2);
		EPackage metaModel = generateSpecificMetaModel(new SubProgressMonitor(monitor, 1), genericModelFile, targetDirectory);
		generateSpecificModel(new SubProgressMonitor(monitor, 1), genericModelFile, metaModel, targetDirectory);
		monitor.done();
	}
}
