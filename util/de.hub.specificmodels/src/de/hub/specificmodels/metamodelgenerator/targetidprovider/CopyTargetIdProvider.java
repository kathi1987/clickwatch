package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.TargetId;

public class CopyTargetIdProvider extends AbstractTargetIdProvider {
	
	public CopyTargetIdProvider(boolean addToCopyParentsOnly) {
		super(addToCopyParentsOnly);
	}

	public CopyTargetIdProvider() {
		super();
	}


	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		if (sok.getFeature() == null || sok.getFeature() instanceof EReference) {
			return new CopyTargetId(parentId, sok.getFeature(), ((EObject)sok.getValue()).eClass());
		} else {
			return new CopyTargetId(parentId, sok.getFeature(), null);
		}
	}

}
