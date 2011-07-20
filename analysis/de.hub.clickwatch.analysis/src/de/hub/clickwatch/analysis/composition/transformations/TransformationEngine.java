package de.hub.clickwatch.analysis.composition.transformations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.osgi.baseadaptor.BaseData;
import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.osgi.framework.internal.core.AbstractBundle;
import org.eclipse.osgi.internal.baseadaptor.DevClassLoadingHook;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.PDEClasspathContainer;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.PDEExtensionRegistry;
import org.eclipse.pde.internal.core.PDEManager;
import org.eclipse.pde.internal.core.PDEPreferencesManager;
import org.eclipse.pde.internal.core.builders.PDEBuilderHelper;
import org.eclipse.pde.internal.core.converter.PDEPluginConverter;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.pde.internal.core.product.PluginConfiguration;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.pde.internal.core.util.PDEJavaHelper;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.wiring.FrameworkWiring;
import org.osgi.service.packageadmin.PackageAdmin;

import de.hub.clickwatch.XmlModelRepository;
import de.hub.clickwatch.analysis.composition.model.CompositionFactory;
import de.hub.clickwatch.analysis.composition.model.DataSet;
import de.hub.clickwatch.analysis.composition.model.DataSetNode;
import de.hub.clickwatch.analysis.composition.model.ModelNode;
import de.hub.clickwatch.analysis.composition.model.ModelUtil;
import de.hub.clickwatch.analysis.composition.model.Node;
import de.hub.clickwatch.analysis.composition.model.ParameterSpecKind;
import de.hub.clickwatch.analysis.composition.model.TargetSpec;
import de.hub.clickwatch.analysis.composition.model.Transformation;
import de.hub.clickwatch.analysis.composition.model.TransformationKind;
import de.hub.clickwatch.analysis.composition.property.TransactionUtil;
import de.hub.clickwatch.analysis.ui.Activator;
import de.hub.clickwatch.ui.PluginActivator;

public class TransformationEngine {
	
	private final Transformation transformation;
	private ModelSet models;

	public TransformationEngine(Transformation transformation) {
		super();
		this.transformation = transformation;
	}
	
	public void executeTransformation() {
		TransformationKind kind = transformation.getKind();
		if (kind == TransformationKind.PREDEFINED) {
			models = getModels(false, false);
		} else if (kind == TransformationKind.XTEND) {
			models = getModels(true, true);
		} else if (kind == TransformationKind.XPAND) {
			raiseError("not supported yet");
		} else if (kind == TransformationKind.JAVA) {
			raiseError("not supported yet");			
		} else if (kind == TransformationKind.XTEND2)  {
			models = getModels(true, true);
		}
		
		List<EObject> sources = getArgument(models.sourceModel);
		List<EObject> targets = getArgument(models.targetModel);
		
		if (transformation.getTargetSpec() == TargetSpec.EXISTING) {
			for (final EObject source: sources) {
				for (final EObject target: targets) {
					TransactionUtil.runSafely(new Runnable() {
						@Override
						public void run() {
							executeTransformation(source, target);
						}
					}, transformation);
				}
			}
		} else if (transformation.getTargetSpec() == TargetSpec.ADD) {
			for (final EObject source: sources) {
				TransactionUtil.runSafely(new Runnable() {
					@Override
					public void run() {
						Object transformationResult = executeTransformation(source, null);
						if (transformationResult == null) {
							raiseError("invalid transformation result"); return;
						}
						
						Node targetNode = transformation.getTarget();
						if (targetNode instanceof ModelNode) {
							if (transformationResult instanceof EObject) {
								models.targetModel.model.getContents().add((EObject)transformationResult);
							} else {
								raiseError("invalid transformation result");
							}
						} else if (targetNode instanceof DataSetNode) {
							DataSetNode targetDSNode = (DataSetNode)targetNode;
							DataSet ds = ((DataSetNode)targetNode).getData();
							if (ds == null) {
								ds = CompositionFactory.eINSTANCE.createDataSet();
								targetDSNode.setData(ds);								
							}
							targetDSNode.setHasData(true);
							
							if (transformationResult instanceof Double) {
								ds.getDoubleValues().add((Double)transformationResult);
							} else if (transformationResult instanceof Integer) {
								ds.getIntValues().add((Integer)transformationResult);
							} else {
								raiseError("not supported");
							}
						}
					}
				}, transformation);
			}
		} else {
			raiseError("target spec is not supported");
		}
		
		if (models.targetModel != null) {
			if (!models.targetModel.model.getContents().isEmpty() && transformation.getTarget() instanceof ModelNode) {
				TransactionUtil.runSafely(new Runnable() {
					@Override
					public void run() {
						ModelUtil.addModelToModelNode((ModelNode)transformation.getTarget(), models.targetModel.model);
					}
				}, transformation);
			}
		}
	}
	
	private Object executeTransformation(EObject source, EObject target) {
		TransformationKind kind = transformation.getKind();
		if (kind == TransformationKind.XTEND) {
			return executeXtendTransformation(source, target);
		} else if (kind == TransformationKind.PREDEFINED) {
			return executePredefinedTransformation(source, target);
		} else if (kind == TransformationKind.XTEND2) {
			return executeXtend2Transformation(source, target);
		} else {
			raiseError("not supported yet");
			return null;
		}
	}
	
	private Object executePredefinedTransformation(EObject source, EObject target) {
		String predefinedTransformationName = transformation.getPredefinedTransformation();
		final IPredefinedTransformation predefinedTransformation = 
				PredefinedTransformationsUtil.getPredefinedTransformations().get(predefinedTransformationName);
		if (predefinedTransformation == null) {
			raiseError("unknown transformation " + predefinedTransformationName); return null;
		}
		
		if (models != null) {
			try {				
				return predefinedTransformation.execute(source, target);
			} catch (TransformationException e) {
				e.printStackTrace();
				raiseError("transformation exception");			
			} catch (Exception e) {
				e.printStackTrace();
				raiseError("exception during transformation");
			}
		}
		return null;
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
		Model sourceModel;
		Model targetModel;
		public ModelSet(Model sourceModel, Model targetModel) {
			super();
			this.sourceModel = sourceModel;
			this.targetModel = targetModel;
		}
	}
	
	private ModelSet getModels(
			boolean requireSourceMetaModel, 
			boolean requireTargetMetaModel) {
		ModelSet result = new ModelSet(null, null);
		ResourceSet rs = null;
		try {
			Node source = transformation.getSource();
			Node target = transformation.getTarget();
			
			if (source instanceof ModelNode) {
				ModelNode sourceModelNode = (ModelNode)source;
				Resource sourceModel = null;
				if (sourceModelNode.isHasData()) {
					sourceModel = ModelUtil.getModelFromModelNode(sourceModelNode);								
				} else {
					raiseError("no source model found"); return null;
				}
				
				rs = sourceModel.getResourceSet();
				
				EPackage sourceMetaModel = null;
				if (requireSourceMetaModel) {
					sourceMetaModel = loadMetaModel(rs, sourceModelNode);
				}
				
				if (requireSourceMetaModel && sourceModelNode.isInferedType()) {
					raiseError("infered meta-models are not supported yet"); return null;
				}
				result.sourceModel = new Model(sourceModel, sourceMetaModel);
			}
			if (target instanceof ModelNode) {
				
				ModelNode targetModelNode = (ModelNode)target;
				Resource targetModel = null;
				
				EPackage targetMetaModel = null;
				if (requireTargetMetaModel) {
					targetMetaModel = loadMetaModel(rs, targetModelNode);
				}
				
				if (requireTargetMetaModel && targetModelNode.isInferedType()) {
					raiseError("infered meta-models are not supported yet"); return null;
				}
				
				if (targetModelNode.isPersistent()) {
					if (targetModelNode.isHasData()) {
						targetModel = ModelUtil.getModelFromModelNode(targetModelNode);
					} else {
						targetModel = rs.createResource(URI.createURI(targetModelNode.getModelResource()));
					}
				} else {
					raiseError("non persistent target models are not supported yet"); return null;
				}	
				
				result.targetModel = new Model(targetModel, targetMetaModel);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not run transformation", e);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}
	}
	
	private List<EObject> getArgument(Model model) {		
		List<EObject> result = new ArrayList<EObject>();
		if (model == null) {
			return result;
		}
		if (transformation.getInput().getKind() == ParameterSpecKind.ROOT) {
			if (!model.model.getContents().isEmpty()) {
				result.add(model.model.getContents().get(0));
			}			
		} else if (transformation.getInput().getKind() == ParameterSpecKind.MAP) {
			String classKey = transformation.getInput().getMapClassKey();
			Iterator<EObject> it = model.model.getAllContents();
			while (it.hasNext()) {
				EObject next = it.next();
				if (next.eClass().getName().equals(classKey)) {
					result.add(next);
				}
			}
		} else {
			raiseError("input kind is not supported yet");
		}
		return result;
	}
	
	/**
	 * the execution method of an xtend2 script
	 * @param source the source model
	 * @param target the target model
	 * @return currently null
	 */
	private Object executeXtend2Transformation(EObject source, EObject target) {
		
		// get the URI to the xtend2 script that should be executed
		String xtend2Uri = transformation.getTransformationUri();
		if (xtend2Uri == null) {
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No transformation specified", null);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}
		
		// read the classname
		String xtend2ClassName = "";
		try {
			URI u = URI.createURI(xtend2Uri);
			InputStream is = URIConverter.INSTANCE.createInputStream(u);
			InputStreamReader isr = new InputStreamReader(is);				
			BufferedReader br = new BufferedReader(isr);			
			String line = br.readLine();
			if (line.startsWith("package")) {
				xtend2ClassName = line.substring(7).trim();
			}
			xtend2ClassName += "." + u.lastSegment().replaceAll(".xtend", "");
		}
		catch(Exception e) {
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not find the xtend2 class", null);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}		
		
		// get the required bundle (if needed)
		String xtend2ReqBundleUri = transformation.getRequiredBundle();
		
		// get the method name to be called in the xtend2 script
		String xtend2Function = transformation.getTransformationFunction();
		if (xtend2Function == null) {
			xtend2Function = "doTransformation";
		}
		
		try {
			if (models != null) {
				
				Class<?> xtend2Class = null;
				
				// is there a bundle to load?
				if(xtend2ReqBundleUri != null && xtend2ReqBundleUri != "")
				{
					// remove the first part if its an platform path
					String shortBundleURI = xtend2ReqBundleUri;
					if(shortBundleURI.startsWith("platform:/resource/")) shortBundleURI = shortBundleURI.substring(18);
																																											
					
					// install bundle (if its already installed we just receive that reference)
					Bundle newB = installBundleFromWorkspace(shortBundleURI);
					
					//installBundleFromWorkspace("/de.hu_berlin.clickwatch.examples").start();
					
					//Dictionary<?, ?> dict = newB.getHeaders();
					//System.out.println(dict.get("Require-Bundle"));
					
					newB.start();					
					
					
					// get the class for the xtend2 execution
					xtend2Class = newB.loadClass(xtend2ClassName);	
				}				
				
				// if the class is not already loaded, try it with the default class loader
				if(xtend2Class == null)
					xtend2Class  = PluginActivator.getInstance().getClass().getClassLoader().loadClass(xtend2ClassName);								
				
				// create an objekt of that class and call the given method to execute the xtend2 script
				Object o = xtend2Class.newInstance();
				Method[] methods = o.getClass().getMethods();
				for (Method m : methods) {						
					if (m.getName().equals(xtend2Function)) {
						// we found the correct method, maybe a check on the parameters would be nice in the future					
						m.invoke(o, source, target);
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not run transformation", e);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}
		
		//raiseError("could not run transformation");
		
		return null;
	}
	
	/**
	 * Tries to install a bundle in the workspace with the given name. If the bundle is already installed, the reference to this one is returned.
	 * 
	 * @param bundleIdentifier the name of the bundle that should be installed
	 * @return the installed bundle or null if the installation process failed
	 */
	private Bundle installBundleFromWorkspace(String bundleIdentifier) 
	{		
		Bundle retBundle = null;
		
		try
		{
			// add a slash to the beginning of the identifier if needed
			if( !(bundleIdentifier.startsWith("/") || bundleIdentifier.startsWith("\\")) )
			{
				bundleIdentifier = "/" + bundleIdentifier;				
			}		
			// try to install the bundle
			String bundleLocation = "reference:" + ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toURL().toString();
			
			retBundle = PluginActivator.getInstance().getBundle().getBundleContext().getBundle(bundleLocation + bundleIdentifier);

			// if its already installed, refresh it (maybe the code changed)
			if(retBundle != null)	
			{
				retBundle.stop();
				retBundle.update();
			}
			else
				retBundle = PluginActivator.getInstance().getBundle().getBundleContext().installBundle(bundleLocation + bundleIdentifier);
						

			// install all bundles in the workspace (maybe needed depency)
			
			/* 
			IPluginModelBase[] candidates = PluginRegistry.getWorkspaceModels();
			for(IPluginModelBase candidate : candidates)
			{
				IResource candidateManifest = candidate.getUnderlyingResource();

				String candidateLocationReference = "reference:" + candidateManifest.getProject().getLocationURI().toURL().toExternalForm();
				
				Bundle installedBundle = PluginActivator.getInstance().getBundle().getBundleContext().installBundle(candidateLocationReference);
				installedBundle.update();
							
				 
				// add the bin folder as classpath to the project 
				IProject project = candidateManifest.getProject();
				IJavaProject javaProject = JavaCore.create(project);
				try {
				    IPath output = javaProject.getOutputLocation();
				    BaseData bundleData = (BaseData)((AbstractBundle)installedBundle).getBundleData();
				    //bundleData.setClassPathString(output.removeFirstSegments(1).toString());				    				    
				    bundleData.setClassPathString("/bin");
				} catch (JavaModelException e) {
				    System.out.println(e);
				}
				
			}*/
			
			
			Dictionary<String, String> dict =  retBundle.getHeaders();
			
			// try to install required bundles, so the dependencies are in the osgi container
			String resources = dict.get("Require-Bundle");
			String[] resourcesArray = resources.split(",");
			for(String res  : resourcesArray)
			{
				String[] parts = res.split(";");
				
				try
				{
					PluginActivator.getInstance().getBundle().getBundleContext().installBundle(bundleLocation + "/" + parts[0]);																									
					
					/*
					IProject project = candidateManifest.getProject();
					IJavaProject javaProject = JavaCore.create(project);
					try {
					    IPath output = javaProject.getOutputLocation();
					    BaseData bundleData = (BaseData)((AbstractBundle)bundle).getBundleData();
					    bundleData.setClassPathString(output.removeFirstSegments(1).toString());
					} catch (JavaModelException e) {
					    Activator.log(e, false);
					}*/
					 
				}
				catch(Exception e)
				{
					// dont do anything, it normal that most parts can not be loaded
				}
			}			
			retBundle.update();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return retBundle;
	}
	
	private Object executeXtendTransformation(EObject source, EObject target) {
		String xtendUri = transformation.getTransformationUri();
		if (xtendUri == null) {
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No transformation specified", null);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}
		String xtendFunction = transformation.getTransformationFunction();
		if (xtendFunction == null) {
			xtendFunction = "performTransformation";
		}
		
		try {
			if (models != null) {
				XtendFacade f = XtendFacade.create();
				if (models.sourceModel != null) {
					f.registerMetaModel(new EmfMetaModel(models.sourceModel.metaModel));
				}
				if (models.targetModel != null) {
					f.registerMetaModel(new EmfMetaModel(models.targetModel.metaModel));
				}
				f = f.cloneWithExtensions(read(URIConverter.INSTANCE.createInputStream(URI.createURI(xtendUri))));
				
				Object[] arguments;
				if (target == null) {
					arguments =  new Object[] { source };
				} else {
					arguments =  new Object[] { source, target };
				}
				
				return f.call(xtendFunction, arguments);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not run transformation", e);
			StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
			return null;
		}
		
		raiseError("could not run transformation");
		return null;
	}
	
	private void raiseError(String string) {
		Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, string, null);
		StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
	}
	
	private String read (InputStream in) throws IOException {
	    StringBuffer out = new StringBuffer();
	    byte[] b = new byte[4096];
	    for (int n; (n = in.read(b)) != -1;) {
	        out.append(new String(b, 0, n));
	    }
	    return out.toString();
	}
	
	private EPackage loadMetaModel(ResourceSet rs, ModelNode node) throws IOException {
		if (node.getMetaModelResource() != null) {
		
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
		} else if (node.getRegisteredPackage() != null) {
			EPackage metaModel = EPackage.Registry.INSTANCE.getEPackage(node.getRegisteredPackage());
			if (metaModel == null) {
				raiseError("registered package does not exist");
				return null;
			}
			return (EPackage)metaModel;
		} else {
			raiseError("no meta-model given");
			return null;
		}
	}
}
