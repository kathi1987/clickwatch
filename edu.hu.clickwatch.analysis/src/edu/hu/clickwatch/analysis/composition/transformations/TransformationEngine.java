package edu.hu.clickwatch.analysis.composition.transformations;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.analysis.composition.model.ModelNode;
import edu.hu.clickwatch.analysis.composition.model.ModelUtil;
import edu.hu.clickwatch.analysis.composition.model.Node;
import edu.hu.clickwatch.analysis.composition.model.ParameterSpecKind;
import edu.hu.clickwatch.analysis.composition.model.TargetSpec;
import edu.hu.clickwatch.analysis.composition.model.Transformation;
import edu.hu.clickwatch.analysis.composition.model.TransformationKind;
import edu.hu.clickwatch.analysis.composition.property.TransactionUtil;
import edu.hu.clickwatch.analysis.ui.Activator;

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
						EObject transformationResult = executeTransformation(source, null);
						if (transformationResult == null) {
							raiseError("invalid transformation result"); return;
						}
						models.targetModel.model.getContents().add(transformationResult);
					}
				}, transformation);
			}
		} else {
			raiseError("target spec is not supported");
		}
		
		if (!models.targetModel.model.getContents().isEmpty() && transformation.getTarget() instanceof ModelNode) {
			TransactionUtil.runSafely(new Runnable() {
				@Override
				public void run() {
					ModelUtil.addModelToModelNode((ModelNode)transformation.getTarget(), models.targetModel.model);
				}
			}, transformation);
		}
	}
	
	private EObject executeTransformation(EObject source, EObject target) {
		TransformationKind kind = transformation.getKind();
		if (kind == TransformationKind.XTEND) {
			return executeXtendTransformation(source, target);
		} else if (kind == TransformationKind.PREDEFINED) {
			return executePredefinedTransformation(source, target);
		} else {
			raiseError("not supported yet");
			return null;
		}
	}
	
	private EObject executePredefinedTransformation(EObject source, EObject target) {
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
	
	private List<EObject> getArgument(Model model) {
		List<EObject> result = new ArrayList<EObject>();
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
	
	private EObject executeXtendTransformation(EObject source, EObject target) {
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
				f.registerMetaModel(new EmfMetaModel(models.sourceModel.metaModel));
				f.registerMetaModel(new EmfMetaModel(models.targetModel.metaModel));
				f = f.cloneWithExtensions(read(URIConverter.INSTANCE.createInputStream(URI.createURI(xtendUri))));
				
				Object[] arguments;
				if (target == null) {
					arguments =  new Object[] { source };
				} else {
					arguments =  new Object[] { source, target };
				}
				
				Object result = f.call(xtendFunction, arguments);
				
				if (!(result instanceof EObject)) {
					return null;
				} else {
					return (EObject)result;
				}
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
}
