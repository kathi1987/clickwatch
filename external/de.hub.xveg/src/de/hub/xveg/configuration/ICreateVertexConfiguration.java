package de.hub.xveg.configuration;

import org.eclipse.emf.ecore.EObject;

import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public interface ICreateVertexConfiguration<T extends EObject> {

	public T createVertex(VertexFeature feature);
}
