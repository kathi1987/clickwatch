package de.hub.clickwatch.analysis.composition.transformations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Inject;

import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.modelgenerator.ModelGenerator;

public class CreateSpecificModel implements IPredefinedTransformation {

	@Inject
	MetaModelGenerator smmg;
	@Inject
	ModelGenerator smg;
	
	@Override
	public EObject execute(EObject source, EObject target) {
		EPackage targetMetaModel = smmg.generate(source);
		
		target = smg.generate(targetMetaModel, source);
		return target;
	}

}
