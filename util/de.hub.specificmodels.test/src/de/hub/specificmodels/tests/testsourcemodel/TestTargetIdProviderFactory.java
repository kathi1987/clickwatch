package de.hub.specificmodels.tests.testsourcemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xml.type.AnyType;

import de.hub.specificmodels.metamodelgenerator.ITargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.CopyTargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.FeatureMapEntryTargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.ITargetIdProviderFactory;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.ListTargetIdProvider;

public class TestTargetIdProviderFactory implements ITargetIdProviderFactory {

	@Override
	public ITargetIdProvider getTargetIdProvider(SourceObjectKey sok) {
		if (sok.isRoot()) {
			return new CopyTargetIdProvider();
		} else if (sok.getObject() instanceof RootClass) {
			if (sok.getFeature() instanceof EReference && sok.getValue() instanceof AnyType) {
				return new FeatureMapEntryTargetIdProvider(true);
			} else {
				return new CopyTargetIdProvider();
			}
		} else if (sok.getObject() instanceof AnyType) {
			return new FeatureMapEntryTargetIdProvider(false);
		} else if (sok.getObject() instanceof ClassWithListFeatures) {
			if (sok.getFeature() instanceof EAttribute) {
				return new CopyTargetIdProvider();	
			} else {
				return new ListTargetIdProvider(true, true);
			}
		} else {
			if (sok.getFeature() instanceof EAttribute) {
				return new CopyTargetIdProvider(true);
			} else {
				if (sok.getObject() instanceof ListFeatureElementClass1) {
					if (sok.getValue() instanceof AnyType) {
						return new FeatureMapEntryTargetIdProvider(false);
					} else {
						return new ListTargetIdProvider(false, true);
					}
				} else {
					return new ListTargetIdProvider(true, true);
				}
			}
		}
	}

}
