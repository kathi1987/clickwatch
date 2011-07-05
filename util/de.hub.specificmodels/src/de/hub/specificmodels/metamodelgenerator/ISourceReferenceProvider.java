package de.hub.specificmodels.metamodelgenerator;

import org.eclipse.emf.ecore.EObject;

public interface ISourceReferenceProvider {

	public String getNameForSourceReference(EObject object);
}
