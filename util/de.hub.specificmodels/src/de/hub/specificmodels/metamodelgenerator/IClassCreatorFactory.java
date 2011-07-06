package de.hub.specificmodels.metamodelgenerator;

import org.eclipse.emf.ecore.EObject;


public interface IClassCreatorFactory {

	public IClassCreator<? extends EObject> createClassCreator(Context ctx, EObject object);
	
}
