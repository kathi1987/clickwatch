package edu.hu.clickwatch.analysis.composition.transformations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import edu.hu.clickwatch.analysis.specificmodels.SpecificMetaModelGenerator;
import edu.hu.clickwatch.analysis.specificmodels.SpecificModelGenerator;

public class CreateSpecificModel implements IPredefinedTransformation {

	@Override
	public void execute(Resource sourceModelResource, Resource targetModelResource) {
		EObject sourceModel = sourceModelResource.getContents().get(0);
		
		SpecificMetaModelGenerator smmg = new SpecificMetaModelGenerator();
		EPackage targetMetaModel = smmg.generateMetaModel(sourceModel);
		
		SpecificModelGenerator smg = new SpecificModelGenerator();
		EObject targetModel = smg.generateModel(targetMetaModel, sourceModel);
		targetModelResource.getContents().add(targetModel);		
	}

}
