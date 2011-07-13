package de.hub.clickwatch.specificmodels;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.hub.specificmodels.metamodelgenerator.ITargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.TargetIdProviderFactoryProvider;

public class SpecificMetaModelGenerator extends MetaModelGenerator {

	public static EPackage generate(EObject root) {
		return new SpecificMetaModelGenerator(new TargetIdProviderFactoryProvider(new ClickWatchTargetIdProviderFactory())).generateMetaModel(root);
	}

	private SpecificMetaModelGenerator(ITargetIdProvider targetIdProvider) {
		super(targetIdProvider);
	}

	@Override
	protected boolean ommitFeature(EStructuralFeature feature) {
		return super.ommitFeature(feature);
	}

	
}
