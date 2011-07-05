package de.hub.specificmodels.metamodelgenerator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;


public class MetaModelGenerator {

	public static EPackage generate(EObject source, IClassCreatorFactory factory, ISourceReferenceProvider sourceReferenceProvider) {
		Context ctx = new Context(factory, sourceReferenceProvider);
		ctx.continueOnObject(source);
		return ctx.generatePackage();
	}
	
	public static EPackage generate(EObject source, IClassCreatorFactory factory) {
		return generate(source, factory, null);
	}
}
