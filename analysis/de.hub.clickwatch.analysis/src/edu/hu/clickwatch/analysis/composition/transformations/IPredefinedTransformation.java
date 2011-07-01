package edu.hu.clickwatch.analysis.composition.transformations;

import org.eclipse.emf.ecore.EObject;

public interface IPredefinedTransformation {
	
	public Object execute(EObject source, EObject target) throws TransformationException;

}
