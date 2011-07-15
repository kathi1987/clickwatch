package de.hub.specificmodels.common;

import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;


/**
 * This interface allows API users to provide a mapping from
 * {@link SourceObjectKey}s to {@link TargetId}s. This allows API users to
 * specify how source object should be mapped to target meta-model elements.
 * 
 * See {@link MetaModelGenerator} for more details.
 */
public interface ITargetIdProvider {

	public interface ITargetIdProviderContext {
		public TargetId[] getExistingTargetIds(SourceObjectKey sourceObject);
	}

	/**
	 * Provides targetIds for the given sourceObjectKey. It provides targetIds
	 * for the values and for the feature, not for the object.
	 */
	public TargetId[] provideTargetIds(ITargetIdProviderContext ctx,
			SourceObjectKey sourceObjectKey);

}
