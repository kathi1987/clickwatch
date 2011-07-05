package de.hub.specificmodels.metamodelgenerator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;


public class CopyClassCreator<T extends EObject> extends AbstractClassCreator<T> {
	
	public static class CopyFeatureKey implements IFeatureKey {
		protected final EObject object;
		protected final EStructuralFeature feature;
		
		private CopyFeatureKey(EObject object, EStructuralFeature feature) {
			super();
			this.object = object;
			this.feature = feature;
		}

		@Override
		public boolean isMany() {
			return feature.isMany();
		}

		@Override
		public Object get() {
			return object.eGet(feature);
		}

		public EStructuralFeature getFeature() {
			return feature;
		}
		
		public EObject getObject() {
			return object;
		}
	}
	
	public CopyClassCreator(Context ctx) {
		super(ctx);
	}
	
	@Override
	protected Collection<IFeatureKey> getFeatureKeys(final T object) {
		return Lists.transform(object.eClass().getEStructuralFeatures(), 
				new Function<EStructuralFeature, IFeatureKey>() {
					@Override
					public IFeatureKey apply(EStructuralFeature from) {
						return new CopyFeatureKey(object, from);
					}
				});
	}
	
	@Override
	protected EClass createClass(T object) {
		EClass result = EcoreFactory.eINSTANCE.createEClass();
		result.setName(firstToUpper(getClassName(object)));
		// TODO other class features, such as super classes, package, etc.
		copyAttributeValues(object.eClass(), result);
		return result;
	}

	protected String getClassName(T object) {
		return object.eClass().getName();
	}
	
	@Override
	protected void updateClass(EClass target, T object) {
		// emtpy
	}
	
	@Override
	protected EStructuralFeature createFeature(IFeatureKey featureKey, Object value) {
		EStructuralFeature feature = ((CopyFeatureKey)featureKey).feature;
		EStructuralFeature result = null;
		if (feature instanceof EReference) {
			result = EcoreFactory.eINSTANCE.createEReference();
			EClass type = (EClass)ctx.continueOnObject((EObject)value);
			result.setEType(type);
		} else {
			result = EcoreFactory.eINSTANCE.createEAttribute();
			result.setEType(feature.getEType());
		}
		result.setName(firstToLower(feature.getName()));
		
		copyAttributeValues(feature, result);
		return result;
	}
	
	@Override
	protected void updateFeature(EStructuralFeature target, IFeatureKey featureKey, Object value) {
		if (target instanceof EAttribute) {
			EAttribute targetAttribute = (EAttribute)target;
			EDataType dataType = targetAttribute.getEAttributeType();
			if (dataType != EcorePackage.eINSTANCE.getEString()) {
				if (!dataType.isInstance(value)) {
					targetAttribute.setEType(EcorePackage.eINSTANCE.getEString());
				}
			}
		}
	}
	
	@Override
	protected boolean ommitFeature(IFeatureKey featureKey) {
		return ((CopyFeatureKey)featureKey).feature.isDerived();
	}

	@Override
	protected EStructuralFeature existingFeature(EClass targetClass,
			IFeatureKey featureKey) {
		return targetClass.getEStructuralFeature(((CopyFeatureKey)featureKey).feature.getName());
	}

	@SuppressWarnings("unchecked")
	private void copyAttributeValues(EObject source, EObject target) {
		Preconditions.checkArgument(source.eClass() == target.eClass());
		for (EStructuralFeature feature: source.eClass().getEAllStructuralFeatures()) {
			if (feature instanceof EAttribute && 
					!feature.isDerived() && 
					!feature.isTransient() && 
					!feature.isUnsettable() && feature != EcorePackage.eINSTANCE.getENamedElement_Name()) {
				if (feature.isMany()) {
					List<Object> sourceList = (List<Object>)source.eGet(feature);
					((List<Object>)target.eGet(feature)).addAll(sourceList);
				} else {
					target.eSet(feature, source.eGet(feature));
				}
			}
		}
	}
}
