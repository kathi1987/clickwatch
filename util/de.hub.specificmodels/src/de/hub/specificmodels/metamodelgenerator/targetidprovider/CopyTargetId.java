package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.hub.specificmodels.metamodelgenerator.TargetId;

public class CopyTargetId extends TargetId {

	public CopyTargetId(TargetId parent, EStructuralFeature sourceFeature,
			EClass sourceClass, String targetFeatureName, String targetClassName) {
		super(parent, sourceFeature, sourceClass, targetFeatureName, targetClassName);
	}

	public CopyTargetId(TargetId parent, EStructuralFeature sourceFeature,
			EClass sourceClass) {
		super(parent, sourceFeature, sourceClass);
	}

}
