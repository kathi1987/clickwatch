package de.hub.specificmodels.metamodelgenerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IClassCreator<T extends EObject> {

	public EClass create(T object);
	public EStructuralFeature create(EClass targetClass, T object, IFeatureKey featureKey);
	
	public void addFeatures(EClass targetClass, T object);
}
