package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMap;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.TargetId;

public class FeatureMapEntryTargetIdProvider extends AbstractTargetIdProvider {

	public FeatureMapEntryTargetIdProvider() {
		super();
	}

	public FeatureMapEntryTargetIdProvider(boolean addToCopyParentsOnly) {
		super(addToCopyParentsOnly);
	}

	@Override
	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		Preconditions.checkArgument(sok.getValue() instanceof FeatureMap.Entry);
		FeatureMap.Entry fme = (FeatureMap.Entry)sok.getValue();
		if (fme.getEStructuralFeature() instanceof EReference) {
			return new TargetId(parentId, fme.getEStructuralFeature(), (EClass)fme.getEStructuralFeature().getEType(), 
					firstToLower(fme.getEStructuralFeature().getName()), firstToUpper(fme.getEStructuralFeature().getName()));	
		} else {
			return new TargetId(parentId, fme.getEStructuralFeature(), null, 
					firstToLower(fme.getEStructuralFeature().getName()), null);
		}
		
	}

}
