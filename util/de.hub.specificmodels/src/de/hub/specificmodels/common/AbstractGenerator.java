package de.hub.specificmodels.common;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.inject.Inject;

import de.hub.specificmodels.common.ITargetIdProvider.ITargetIdProviderContext;

public class AbstractGenerator {
	@Inject
	private ITargetIdProvider targetIdProvider;
	
	private final ITargetIdProviderContext ctx = new TargetIdProviderContext();
	
	protected final Map<SourceObjectKey, TargetId[]> sokToTargetId = new HashMap<SourceObjectKey, TargetId[]>();	
	
	protected abstract class ModelTraverserConfiguration implements ModelTraverser.Configuration {
		@Override
		public boolean ommitFeature(EStructuralFeature feature) {
			if (feature.isDerived() == true) {
				return true;
			} else {
				return false;
			}
		}
	}

	private class TargetIdProviderContext implements ITargetIdProviderContext {
		@Override
		public TargetId[] getExistingTargetIds(SourceObjectKey sourceObject) {
			return getTargetIds(sourceObject);
		}
	}

	protected TargetId[] getTargetIds(SourceObjectKey object) {
		TargetId[] result = sokToTargetId.get(object);
		if (result == null) {
			result = targetIdProvider.provideTargetIds(ctx, object);
			sokToTargetId.put(object, result);
		}
		return result;
	}
}
