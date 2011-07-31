package de.hub.specificmodels.common.targetidprovider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;

public class CopyTargetIdProvider extends AbstractTargetIdProvider {
	
	public CopyTargetIdProvider(boolean addToCopyParentsOnly) {
		super(addToCopyParentsOnly);
	}

	public CopyTargetIdProvider() {
		super(false);
	}


	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		TargetId result = null;
		if (sok.getFeature() == null || sok.getFeature() instanceof EReference) {
			result = new TargetId(parentId, sok.getFeature(), ((EObject)sok.getValue()).eClass());
		} else {
			result = new TargetId(parentId, sok.getFeature(), null);
		}
		return result;
	}

}
