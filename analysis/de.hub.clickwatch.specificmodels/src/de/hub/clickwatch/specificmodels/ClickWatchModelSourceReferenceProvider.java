package de.hub.clickwatch.specificmodels;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.specificmodels.metamodelgenerator.ISourceReferenceProvider;

public class ClickWatchModelSourceReferenceProvider implements ISourceReferenceProvider {

	@Override
	public String getNameForSourceReference(EObject object) {
		if (object instanceof Element) {
			return ((Element)object).getName();
		} else if (object instanceof Handler) {
			return ((Handler)object).getName();
		} else {
			return object.eClass().getName();
		}
	}

}
