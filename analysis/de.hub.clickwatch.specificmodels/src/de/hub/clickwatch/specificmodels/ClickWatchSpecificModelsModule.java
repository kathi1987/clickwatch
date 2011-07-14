package de.hub.clickwatch.specificmodels;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.TargetIdProviderFactoryProvider;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;

public class ClickWatchSpecificModelsModule extends AbstractModule {
	@Override
	public void configure() {
		ClickWatchModelPackage clickWatchModel = ClickWatchModelPackage.eINSTANCE;
		
		bind(String.class).annotatedWith(Names.named(MetaModelGenerator.COMMON_CLASS_PREFIX_NAME)).toInstance(clickWatchModel.getNetwork().getName() + clickWatchModel.getNode().getName());
		bind(ITargetIdProvider.class).toInstance(new TargetIdProviderFactoryProvider(new ClickWatchTargetIdProviderFactory()));
	}
}
