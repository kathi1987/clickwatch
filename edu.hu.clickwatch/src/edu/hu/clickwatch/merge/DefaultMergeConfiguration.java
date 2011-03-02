package edu.hu.clickwatch.merge;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

public class DefaultMergeConfiguration implements IMergeConfiguration {

	@Override
	public void handleDiffernce(IContext context, Object oldValue,
			Object newValue, int index) {
		// empty
	}

	@Override
	public boolean consider(IContext context) {
		return true;
	}

	@Override
	public Object create(IContext context, Object newValue) {
		if (newValue == null) {
			return null;
		} else if (newValue instanceof EObject) {
			return EcoreUtil.copy((EObject) newValue);
		} else if (newValue instanceof FeatureMap.Entry) {
			FeatureMap.Entry fObject = (FeatureMap.Entry) newValue;
			return FeatureMapUtil.createEntry(fObject.getEStructuralFeature(),
					create(context, fObject.getValue()));
		} else {
			return newValue;
		}
	}

	@Override
	public void dispose(IContext context, Object oldValue) {
		// empty
	}

	@Override
	public Object identity(IContext context, Object value) {
		return null;
	}

	@Override
	public boolean hasIdentity(IContext context) {
		return false;
	}

}
