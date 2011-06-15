package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.EdgeFeature;

public interface ICreateEdgeConfiguration<T extends EObject> {

	public T createEdge(EdgeFeature feature, EObject source, EObject target);
	
	public boolean isPossible(EdgeFeature feature, EObject source, EObject target);
	
}
