package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import de.hub.specificmodels.metamodelgenerator.ITargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.TargetId;

public class TargetIdProviderFactoryProvider implements ITargetIdProvider {
	
	private final ITargetIdProviderFactory factory;

	public TargetIdProviderFactoryProvider(ITargetIdProviderFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public TargetId[] provideTargetIds(ITargetIdProviderContext ctx,
			SourceObjectKey sourceObjectKey) {
		return factory.getTargetIdProvider(sourceObjectKey).provideTargetIds(ctx, sourceObjectKey);
	}

}
