package de.hub.specificmodels.tests.testsourcemodel;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.hub.specificmodels.metamodelgenerator.Context;
import de.hub.specificmodels.metamodelgenerator.CopyClassCreator;
import de.hub.specificmodels.metamodelgenerator.IClassCreator;
import de.hub.specificmodels.metamodelgenerator.IClassCreatorFactory;
import de.hub.specificmodels.metamodelgenerator.ISourceReferenceProvider;
import de.hub.specificmodels.metamodelgenerator.ListToSingleFeatureClassCreator;

public class TestSourceModelClassCreatorFactory implements IClassCreatorFactory, ISourceReferenceProvider {

	@Override
	public IClassCreator<? extends EObject> createClassCreator(Context ctx,
			EObject object) {
		if (object instanceof RootClass) {
			return new CopyClassCreator<RootClass>(ctx);
		} else if (object instanceof ClassWithListFeatures) {
			return new ListToSingleFeatureClassCreator<ClassWithListFeatures>(ctx) {
				@Override
				protected Collection<EReference> getListFeatures(
						ClassWithListFeatures object) {
					return Arrays.asList(new EReference[]{
							TestSourceModelPackage.eINSTANCE.getClassWithListFeatures_ListFeature1(),
							TestSourceModelPackage.eINSTANCE.getClassWithListFeatures_ListFeature2(),
					});
				}

				@Override
				protected String getFeatureName(
						ListFeatureKey featureKey) {
					EObject object = (EObject)featureKey.get();
					return (String)object.eGet(object.eClass().getEStructuralFeature("name"));
				}
				
			};
		} else if (object instanceof ListFeatureElementClass1) {
			return new ListToSingleFeatureClassCreator<ListFeatureElementClass1>(ctx) {
				@Override
				protected Collection<EReference> getListFeatures(
						ListFeatureElementClass1 object) {
					return Arrays.asList(new EReference[]{
							TestSourceModelPackage.eINSTANCE.getListFeatureElementClass1_ListFeature3()
					});
				}

				@Override
				protected String getFeatureName(
						ListFeatureKey featureKey) {
					EObject object = (EObject)featureKey.get();
					return (String)object.eGet(object.eClass().getEStructuralFeature("name"));
				}

				@Override
				protected String getClassName(ListFeatureElementClass1 object) {
					return object.getName();
				}		
			};
		} else if (object instanceof ListFeatureElementClass2) {
			return new CopyClassCreator<ListFeatureElementClass2>(ctx) {
				@Override
				protected String getClassName(ListFeatureElementClass2 object) {
					return object.getName();
				}
			};
		} else if (object instanceof ListFeatureElementClass3) {
			return new CopyClassCreator<ListFeatureElementClass3>(ctx) {
				@Override
				protected String getClassName(ListFeatureElementClass3 object) {
					return object.getName();
				}
			};
		} else {
			return null;
		}
	}

	@Override
	public String getNameForSourceReference(EObject object) {
		if (object instanceof ListFeatureElementClass1) {
			return ((ListFeatureElementClass1)object).getName();
		} else if (object instanceof ListFeatureElementClass2) {
			return ((ListFeatureElementClass2)object).getName();
		} else if (object instanceof ListFeatureElementClass3) {
			return ((ListFeatureElementClass3)object).getName();
		} else {
			return object.eClass().getName();
		}
	}
}
