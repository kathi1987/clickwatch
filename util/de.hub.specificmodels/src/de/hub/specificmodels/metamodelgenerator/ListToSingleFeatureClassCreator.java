package de.hub.specificmodels.metamodelgenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import com.google.common.base.Function;
import com.google.common.collect.Lists;


public abstract class ListToSingleFeatureClassCreator<T extends EObject> extends CopyClassCreator<T> {

	public static class ListFeatureKey implements IFeatureKey {
		final EReference listFeature;
		final Object value;

		public ListFeatureKey(EObject object, EReference listFeature,
				Object value) {
			super();
			this.listFeature = listFeature;
			this.value = value;
		}

		@Override
		public boolean isMany() {
			return false;
		}

		@Override
		public Object get() {
			return value;
		}

		public EReference getListFeature() {
			return listFeature;
		}
	}

	public ListToSingleFeatureClassCreator(Context ctx) {
		super(ctx);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Collection<IFeatureKey> getFeatureKeys(final T object) {
		List<IFeatureKey> result = new ArrayList<IFeatureKey>();
		Collection<EReference> listFeatures = getListFeatures(object);
		for (final EReference listFeature: listFeatures) {
			result.addAll(Lists.transform((List<Object>)object.eGet(listFeature), new Function<Object, IFeatureKey>() {
				@Override
				public IFeatureKey apply(Object from) {
					return new ListFeatureKey(object, listFeature, from);
				}
			}));
		}
		result.addAll(super.getFeatureKeys(object));
		for (IFeatureKey featureKey: super.getFeatureKeys(object)) {
			if (featureKey instanceof CopyFeatureKey &&
					listFeatures.contains(((CopyFeatureKey)featureKey).getFeature())) {
				if (getMappedListFeatures(object).contains(((CopyFeatureKey)featureKey).getFeature())) {
					result.add(featureKey);
				} 
			} else {
				result.add(featureKey);
			}
		}
		return result;
	}
	
	protected Collection<EReference> getMappedListFeatures(T object) {
		return getListFeatures(object);
	}
	
	protected abstract Collection<EReference> getListFeatures(T object);

	@Override
	protected void updateClass(EClass target, T object) {
		// empty
	}

	@Override
	protected boolean ommitFeature(IFeatureKey featureKey) {
		if (featureKey instanceof ListFeatureKey) {
			return false;
		} else {
			return super.ommitFeature(featureKey);
		}
	}

	@Override
	protected EStructuralFeature existingFeature(EClass targetClass,
			IFeatureKey featureKey) {
		if (featureKey instanceof ListFeatureKey) {
			return targetClass.getEStructuralFeature(getFeatureName((ListFeatureKey)featureKey));
		} else {
			return super.existingFeature(targetClass, featureKey);
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	protected EStructuralFeature createFeature(IFeatureKey featureKey,
			Object value) {
		if (featureKey instanceof ListFeatureKey) {
			EReference targetFeature = EcoreFactory.eINSTANCE.createEReference();
			ListFeatureKey listFeatureKey = (ListFeatureKey)featureKey;
			targetFeature.setName(firstToLower(getFeatureName(listFeatureKey)));
			targetFeature.setEType((EClass)ctx.continueOnObject((EObject)value));
			targetFeature.setContainment(listFeatureKey.getListFeature().isContainment());
			return targetFeature;
		} else {
			CopyFeatureKey copyFeatureKey = (CopyFeatureKey)featureKey;
			if (getListFeatures((T)copyFeatureKey.getObject()).contains(copyFeatureKey.getFeature())) {
				return createListFeature(featureKey, value);
			} else {
				return super.createFeature(featureKey, value);
			}
		}	
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void updateFeature(EStructuralFeature target,
			IFeatureKey featureKey, Object value) {
		if (featureKey instanceof ListFeatureKey) {
			// TODO check for name collisions per annotation
			ctx.continueOnObject((EObject)value);
		} else {
			CopyFeatureKey copyFeatureKey = (CopyFeatureKey)featureKey;
			if (getListFeatures((T)copyFeatureKey.getObject()).contains(copyFeatureKey.getFeature())) {
				updateListFeature(target, featureKey, value);
			} else {
				super.updateFeature(target, featureKey, value);
			}
		}	
	}
	
	protected void updateListFeature(EStructuralFeature target, IFeatureKey featureKey, Object value) {
		// empty
	}

	protected EStructuralFeature createListFeature(IFeatureKey featureKey, Object value) {
		return null;
	}
	
	protected abstract String getFeatureName(ListFeatureKey featureKey);
}
