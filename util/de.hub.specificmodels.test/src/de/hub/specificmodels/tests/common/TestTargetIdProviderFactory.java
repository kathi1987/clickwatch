package de.hub.specificmodels.tests.common;

import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.targetidprovider.CopyTargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.FeatureMapEntryTargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.ITargetIdProviderFactory;
import de.hub.specificmodels.common.targetidprovider.ListTargetIdProvider;
import de.hub.specificmodels.tests.testsourcemodel.ClassWithListFeatures;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass1;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass2;
import de.hub.specificmodels.tests.testsourcemodel.ListFeatureElementClass3;
import de.hub.specificmodels.tests.testsourcemodel.RootClass;
import de.hub.specificmodels.tests.testsourcemodel.TestSourceModelPackage;

public class TestTargetIdProviderFactory implements ITargetIdProviderFactory {

	@Override
	public ITargetIdProvider getTargetIdProvider(SourceObjectKey sok) {
		TestSourceModelPackage testSourceModel = TestSourceModelPackage.eINSTANCE;
		
		if (sok.isRoot()) {
			return new CopyTargetIdProvider(false);
		} else if (sok.getObject() instanceof RootClass) {
			if (testSourceModel.getRootClass().getEAllStructuralFeatures().contains(sok.getFeature())) {
				return new CopyTargetIdProvider(false);
			} else {
				return new FeatureMapEntryTargetIdProvider(false);
			}
		} else if (sok.getObject() instanceof ClassWithListFeatures) {
			if (sok.getFeature() == testSourceModel.getClassWithListFeatures_ListFeature1() || 
					sok.getFeature() == testSourceModel.getClassWithListFeatures_ListFeature2()) {
				return new ListTargetIdProvider(false, true, false);
			} else {
				return new CopyTargetIdProvider(false);
			}
		} else if (sok.getObject() instanceof ListFeatureElementClass1) {
			if (sok.getFeature() == testSourceModel.getListFeatureElementClass1_ListFeature3()) {
				return new ListTargetIdProvider(false, true, true);
			} else if (testSourceModel.getListFeatureElementClass1().getEAllStructuralFeatures().contains(sok.getFeature())) {
				return new CopyTargetIdProvider(true);
			} else {
				return new FeatureMapEntryTargetIdProvider(false);				
			}
		} else if (sok.getObject() instanceof ListFeatureElementClass2) {
			return new CopyTargetIdProvider(true);
		} else if (sok.getObject() instanceof ListFeatureElementClass3) {
			return new CopyTargetIdProvider(true);
		} else if (sok.getObject() instanceof AnyType) {
			return new FeatureMapEntryTargetIdProvider(false);
		} else {
			Preconditions.checkState(false);
			return null;
		}
	}

}
