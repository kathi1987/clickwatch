package de.hub.clickwatch.analysis.ui.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.PluginProjectFactory;

import com.google.inject.Inject;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.util.RecordUtil;
import de.hub.emfxml.XmlModelRepository;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.modelgenerator.ModelGenerator;

public class ClickWatchProjectCreator extends WorkspaceModifyOperation {
	
	@Inject
	MetaModelGenerator metaModelGenerator;
	@Inject
	ModelGenerator modelGenerator;
	
	protected ClickWatchProjectInfo info;
	protected final String srcFolderName = "src";
	protected final String template = this.getClass().getPackage().getName().replace(".", "::") + "::Template::main";
	
	private class ProjectFactory extends PluginProjectFactory {
		ProjectFactory() {
			workbench = PlatformUI.getWorkbench();
			workspace = ResourcesPlugin.getWorkspace();
		}
	}
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
		monitor.beginTask("Creating project", 2);
		try {
			PluginProjectFactory projectFactory = new ProjectFactory();
			
			projectFactory.addWorkingSets(Arrays.asList(info.getSelectedWorkingSets()));
			projectFactory.addBuilderIds(JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID);
			projectFactory.addFolders(Arrays.asList(new String[] {srcFolderName}));
			projectFactory.setProjectName(info.getProjectName());
			projectFactory.addProjectNatures(JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", "xtendXPandNature");
			
			projectFactory.addRequiredBundles(Arrays.asList(new String[] { "de.hub.clickwatch.apps.main" }));
			
			IProject project = projectFactory.createProject(new SubProgressMonitor(monitor, 1), null);
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			
			try {
				generateModels(project);
			} catch (IOException e) {
				throw new InvocationTargetException(e);
			}
			generateFiles(template, project, (IFolder)project.findMember(srcFolderName));
			
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} finally {
			monitor.done();
		}	
	}
	
	protected Network createLoadGenericModel(ResourceSet rs, Map<Object, Object> options) throws IOException {
		Resource resource = rs.getResource(info.getClickWatchModel(), true);
		Network genericModel = (Network)resource.getContents().get(0);
		return genericModel;
	}
	
	private void generateModels(IProject project) throws IOException {
		generateExampleClickWatchModel(project);
		generateExampleClickWatchDataBase(project);
		// TODO: generate example composition experiment
		
		/*
		Network genericModel = createLoadGenericModel(rs, options);
		
		EPackage specificMetaModel = metaModelGenerator.generate(genericModel);
		EObject specificModel = modelGenerator.generate(specificMetaModel, genericModel);
		
		Preconditions.checkState(specificModel != null);
		
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		specificMetaModel.setNsURI("src/SpecificMetaModel");
		specificMetaModel.setNsPrefix("scwm");
		EPackage.Registry.INSTANCE.put(specificMetaModel.getNsURI(), specificMetaModel);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("scwm", new XMIResourceFactoryImpl());
		
		String uriBase = "platform:/resource/" + info.getProjectName() + "/" + srcFolderName + "/";
		
		Resource specificMetaModelResource = rs.createResource(URI.createURI(uriBase + "SpecificMetaModel.ecore"));
		specificMetaModelResource.getContents().add(specificMetaModel);
		specificMetaModelResource.save(options);
		
		Resource specificModelResource = rs.createResource(URI.createURI(uriBase + "SpecificModel.scwm"));
		specificModelResource.getContents().add(specificModel);
		specificModelResource.save(options);
		*/
	}
	
	private void generateExampleClickWatchModel(IProject project) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(info.getClickWatchModel());
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		network.setName("a network");
		Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		node.setINetAddress("localhost");
		network.getNodes().add(node);
		resource.getContents().add(network);
		resource.save(XmlModelRepository.defaultLoadSaveOptions());
	}
	
	private void generateExampleClickWatchDataBase(IProject project) throws IOException {
		DataBase dataBase = RecordUtil.buildDataBase("ExampleRecord", 1800000, 1000, "localhost");
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(info.getClickWatchDataBase());
		resource.getContents().add(dataBase);
		resource.save(XmlModelRepository.defaultLoadSaveOptions());		
	}

	/**
	 * Generates example source code. Three examples: a main for connecting to
	 * the network, one analysis the ClickWatch model and one analysis for the
	 * data base.
	 */
	private void generateFiles(String templateName, IProject project,
			IFolder targetFolder) throws CoreException {

		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, ResourcesPlugin.getWorkspace().getRoot().getDefaultCharset(), null, true,
				targetFolder.getLocation().makeAbsolute().toOSString()));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("iso-8859-1"); //$NON-NLS-1$
		execCtx.registerMetaModel(new JavaBeansMetaModel());

		XpandFacade facade = XpandFacade.create(execCtx);
		facade.evaluate(templateName, info);
	}

	public void setInfo(ClickWatchProjectInfo info) {
		this.info = info;
	}                                 
}
