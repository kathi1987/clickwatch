package de.hub.specificmodels.common.targetidprovider;

import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.SourceObjectKey;

public interface ITargetIdProviderFactory {
	
	public ITargetIdProvider getTargetIdProvider(SourceObjectKey sok);

}
