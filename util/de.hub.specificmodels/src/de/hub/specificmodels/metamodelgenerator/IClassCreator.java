package de.hub.specificmodels.metamodelgenerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface IClassCreator<T extends EObject> {

	public EClass create(T object);
	public void addFeatures(EClass targetClass, T object);
}
