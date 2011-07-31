package de.hub.specificmodels.common.targetidprovider;

import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;

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
