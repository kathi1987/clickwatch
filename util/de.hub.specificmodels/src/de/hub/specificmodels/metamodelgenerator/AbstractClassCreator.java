package de.hub.specificmodels.metamodelgenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;


public abstract class AbstractClassCreator<T extends EObject> implements IClassCreator<T> {

	public final static String ANNOTATION_SOURCE = "http://de.hub.clickwatch.specificmodels";
	public static final String META_SOURCE_REFERENCE_KEY = "meta source reference";
	public static final String SOURCE_REFERENCE_KEY = "source reference";
	
	protected final Context ctx;

	public AbstractClassCreator(Context ctx) {
		super();
		this.ctx = ctx;
	}

	@Override
	public final EClass create(T object) {
		Object sourceReference = getSourceReference(object);
		Object name = getClassName(object);
		
		EClass classBySourceReference = ctx.getTarget(sourceReference);
		EClass classByName = ctx.getClass(name);
		
		if (classBySourceReference != null) {
			updateClass(classBySourceReference, object);
			return classBySourceReference;
		} else if (classByName != null) {
			EClass targetClass = createClass(object);
			addAnnotation(object.eClass(), object, targetClass);
			findUniqueNewNames(classByName, targetClass);
			
			ctx.addClass(classByName.getName(), targetClass);
			ctx.addTarget(sourceReference, targetClass);
			ctx.addClass(targetClass.getName(), targetClass);
			return targetClass;
		} else {
			EClass targetClass;
			targetClass = createClass(object);			
			addAnnotation(object.eClass(), object, targetClass);
			ctx.addTarget(sourceReference, targetClass);
			ctx.addClass(name, targetClass);
			return targetClass;
		}
	}
	
	@Override
	public EStructuralFeature create(EClass targetClass, T object, IFeatureKey featureKey) {
		// TODO Auto-generated method stub
		return null;
	}

	private void findUniqueNewNames(EClass class1, EClass class2) {		
		String name1 = getSourceReferenceOfTargetClass(class1).replaceAll("[^a-zA-Z0-9_]", "_");
		String name2 = getSourceReferenceOfTargetClass(class2).replaceAll("[^a-zA-Z0-9_]", "_");
		
		int i;
		int length = Math.min(name1.length(), name2.length());
		loop: for (i = 0; i < length; i++) {
			if (name1.charAt(i) != name2.charAt(i)) {
				break loop;
			}
		}

		i = name1.substring(0, i).lastIndexOf("_") + 1;
		
		name1 = name1.substring(i);
		name2 = name2.substring(i);
		
		class1.setName(firstToUpper(name1));		
		class2.setName(firstToUpper(name2));
	}
	
	protected String firstToUpper(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
	
	protected String firstToLower(String name) {
		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}
	
	private String getSourceReferenceOfTargetClass(EClass targetClass) {
		return targetClass.getEAnnotation(ANNOTATION_SOURCE).getDetails().get(SOURCE_REFERENCE_KEY);
	}

	@SuppressWarnings("unchecked")
	@Override
	public final void addFeatures(EClass targetClass, T object) {
		for (IFeatureKey featureKey: getFeatureKeys(object)) {
			Object rawValue = featureKey.get();
			List<Object> values = new ArrayList<Object>();
			if (featureKey.isMany()) {
				values = (List<Object>)rawValue;
			} else {
				values = new ArrayList<Object>();
				values.add(rawValue);
			}
			for (Object value: values) {
				EStructuralFeature targetFeature = existingFeature(targetClass, featureKey);
				if (targetFeature != null) {
					updateFeature(targetFeature, featureKey, value);
				} else {
					
					targetFeature = createFeature(featureKey, value);
					if (targetFeature != null) {
						targetClass.getEStructuralFeatures().add(targetFeature);
					}
				}
			}
		}
		
	}

	protected void addAnnotation(ENamedElement sourceMetaObject, T sourceObject, EModelElement target) {
		EcoreFactory factory = EcoreFactory.eINSTANCE;
		EAnnotation result = factory.createEAnnotation();
		result.setSource(ANNOTATION_SOURCE);
		String metaSourceReference = null;
		ENamedElement sourceMetaObject_i = sourceMetaObject;
		while (!(sourceMetaObject_i instanceof EPackage)) {
			metaSourceReference = sourceMetaObject_i.getName() + (metaSourceReference == null ? "" : "/" + metaSourceReference);
			sourceMetaObject_i = (ENamedElement)sourceMetaObject_i.eContainer();
		}
		metaSourceReference = ((EPackage)sourceMetaObject_i).getNsURI() + "/" + metaSourceReference;		
		result.getDetails().put(META_SOURCE_REFERENCE_KEY, metaSourceReference);
		
		String sourceReference = getSourceReference(sourceObject);
		if (sourceReference != null) {
			result.getDetails().put(SOURCE_REFERENCE_KEY, sourceReference);
		}
		target.getEAnnotations().add(result);
	}
	
	protected String getSourceReference(T sourceObject) {
		ISourceReferenceProvider provider = ctx.getAdapter(ISourceReferenceProvider.class);
		if (provider != null && sourceObject != null) {
			String sourceReference = null;
			EObject sourceObject_i = sourceObject;
			
			while (sourceObject_i != null) {
				EStructuralFeature containingFeature = sourceObject_i.eContainingFeature();
				String containingFeatureName = containingFeature == null ?
						"" : containingFeature.getName() + ":";
				sourceReference = containingFeatureName + provider.getNameForSourceReference(sourceObject_i) + (sourceReference == null ? "" : "/" + sourceReference);
				sourceObject_i = sourceObject_i.eContainer();
			}
			return sourceReference;
		} else {
			return null;
		}
	}
	
	protected abstract String getClassName(T object);
	
	protected abstract Collection<IFeatureKey> getFeatureKeys(T object);
	
	protected abstract EClass createClass(T object);
	
	protected abstract void updateClass(EClass target, T object);
	
	protected abstract boolean ommitFeature(IFeatureKey featureKey);
	
	protected abstract EStructuralFeature existingFeature(EClass targetClass, IFeatureKey featureKey);
	
	protected abstract EStructuralFeature createFeature(IFeatureKey featureKey, Object value);
	
	protected abstract void updateFeature(EStructuralFeature target, IFeatureKey featureKey, Object value);
	
}
