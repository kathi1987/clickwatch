package de.hub.specificmodels.common.targetidprovider;

import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;

public class NullTargetIdProvider implements ITargetIdProvider {

	@Override
	public TargetId[] provideTargetIds(ITargetIdProviderContext ctx,
			SourceObjectKey sourceObjectKey) {
		return new TargetId[] {};
	}

}
