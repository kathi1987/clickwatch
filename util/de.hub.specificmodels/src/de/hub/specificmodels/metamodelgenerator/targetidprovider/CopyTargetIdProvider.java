package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.TargetId;
import de.hub.specificmodels.metamodelgenerator.targetproperties.IsCopy;

public class CopyTargetIdProvider extends AbstractTargetIdProvider {
	
	public CopyTargetIdProvider(boolean addToCopyParentsOnly) {
		super(addToCopyParentsOnly);
	}

	public CopyTargetIdProvider() {
		super();
	}


	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		TargetId result = null;
		if (sok.getFeature() == null || sok.getFeature() instanceof EReference) {
			result = new TargetId(parentId, sok.getFeature(), ((EObject)sok.getValue()).eClass());
		} else {
			result = new TargetId(parentId, sok.getFeature(), null);
		}
		result.getProperty(IsCopy.class).set(true);
		return result;
	}

}
