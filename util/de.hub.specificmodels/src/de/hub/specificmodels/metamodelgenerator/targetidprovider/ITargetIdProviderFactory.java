package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import de.hub.specificmodels.metamodelgenerator.ITargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;

public interface ITargetIdProviderFactory {
	
	public ITargetIdProvider getTargetIdProvider(SourceObjectKey sok);

}
