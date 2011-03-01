package edu.hu.clickwatch.merge;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import com.google.common.base.Preconditions;

public class Merge {
	
	public interface Operations {
		public void replace();
		public void remove();
		public void add();
	}
	
	public static abstract class SimpleOperations implements Operations {
		public void remove() {
			replace();
		}
		public void add() {
			replace();
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static boolean merge(Object mergedValue, Object newValue, final Diff diff, final Operations op) {
		if (mergedValue == null && newValue == null) {
			return false;
		}
		if (mergedValue != null && newValue == null) {
			op.remove();
			diff.addEntry(mergedValue, null);
			return true;
		}
		if (mergedValue == null && newValue != null) {
			op.add();
			diff.addEntry(null, newValue);
			return true;
		}
		if (mergedValue instanceof EObject && newValue instanceof EObject) {
			final EObject eMergedValue = (EObject)mergedValue;
			final EObject eNewValue = (EObject)newValue;
			if (!eMergedValue.eClass().getName().equals(eNewValue.eClass().getName())) {
				op.replace();
				diff.addEntry(mergedValue, newValue);
				return true;
			}
			boolean hasChanged = false;
			for(final EStructuralFeature feature: eMergedValue.eClass().getEAllStructuralFeatures()) {
				if (!feature.isDerived()) {
					EStructuralFeature eNewValueFeature = eNewValue.eClass().getEStructuralFeature(feature.getFeatureID());
					if (eNewValueFeature == null) {
						// meta-model has changed
						diff.addEntry(mergedValue, newValue);
						op.replace();
						return true;
					}
					if (merge(eMergedValue.eGet(feature), eNewValue.eGet(eNewValueFeature), diff.getDiff(eMergedValue, feature),
							new Operations() {						
						@Override
						public void replace() {
							eMergedValue.eSet(feature, copy(eNewValue.eGet(feature)));
						}
						
						@Override
						public void remove() {
							eMergedValue.eUnset(feature);
						}
						
						@Override
						public void add() {
							replace();			
						}
					})) {
						hasChanged = true;
					}
				}
			}
			return hasChanged;
		} else if (mergedValue instanceof EList && newValue instanceof EList) {
			final EList lMergedValue = (EList)mergedValue;
			final EList lNewValue = (EList)newValue;
			boolean hasChanged = false;
			
			int lOneSize = Math.min(lMergedValue.size(), lNewValue.size());
			int i;
			for (i = 0; i < lOneSize; i++) {
				final int fi = i;
				if (merge(lMergedValue.get(i), lNewValue.get(i), diff, new Operations() {					
					@Override
					public void replace() {
						lMergedValue.set(fi, copy(lNewValue.get(fi)));
					}
					
					@Override
					public void remove() {
						Preconditions.checkState(false);
					}
					
					@Override
					public void add() {
						Preconditions.checkState(false);
					}
				})) {
					hasChanged = true;
				}
			}
			if (i < lMergedValue.size()) {
				hasChanged = true;
				for (;i < lMergedValue.size(); i++) {
					lMergedValue.remove(i);
				}
			} else if (i < lNewValue.size()) {
				hasChanged = true;
				for (;i < lNewValue.size(); i++) {
					lMergedValue.add(copy(lNewValue.get(i)));
				}
			}
			return hasChanged;
		} else if (mergedValue instanceof FeatureMap.Entry && newValue instanceof FeatureMap.Entry) {
			final FeatureMap.Entry fMergedValue = (FeatureMap.Entry)mergedValue;
			final FeatureMap.Entry fNewValue = (FeatureMap.Entry)newValue;
			if (!fMergedValue.getEStructuralFeature().getName().equals(fNewValue.getEStructuralFeature().getName())) {
				op.replace();
				diff.addEntry(fMergedValue, fNewValue);
				return true;
			} else {
				return merge(fMergedValue.getValue(), fNewValue.getValue(), diff.getDiff(fMergedValue.getEStructuralFeature()), new Operations() {					
					@Override
					public void replace() {
						op.replace();
					}					
					@Override
					public void remove() {
						Preconditions.checkState(false);
					}					
					@Override
					public void add() {
						Preconditions.checkState(false);
					}
				});
			}
			
		} else {
			if (!mergedValue.equals(newValue)) {
				op.replace();
				diff.addEntry(mergedValue, newValue);
				return true;
			} else {
				return false;
			}
		}
	}

	private static Object copy(Object object) {
		if (object == null) {
			return null;
		} else if (object instanceof EObject) {
			return EcoreUtil.copy((EObject)object);
		} else if (object instanceof FeatureMap.Entry){
			FeatureMap.Entry fObject = (FeatureMap.Entry)object;
			return FeatureMapUtil.createEntry(fObject.getEStructuralFeature(), copy(fObject.getValue()));
		} else {
			return object;
		}
	}
}
