package edu.hu.clickwatch.analysis.composition.transformations;

import org.eclipse.emf.ecore.resource.Resource;

public interface IPredefinedTransformation {
	
	public void execute(Resource sourceModel, Resource targetModel) throws TransformationException;

}
