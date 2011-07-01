package de.hub.clickwatch.analysis.composition.transformations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import de.hub.clickwatch.analysis.specificmodels.SpecificMetaModelGenerator;
import de.hub.clickwatch.analysis.specificmodels.SpecificModelGenerator;


public class CreateSpecificModel implements IPredefinedTransformation {

	@Override
	public EObject execute(EObject source, EObject target) {
		
		SpecificMetaModelGenerator smmg = new SpecificMetaModelGenerator();
		EPackage targetMetaModel = smmg.generateMetaModel(source);
		
		SpecificModelGenerator smg = new SpecificModelGenerator();
		target = smg.generateModel(targetMetaModel, source);
		return target;
	}

}
