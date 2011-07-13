package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.metamodelgenerator.ITargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.TargetId;
import de.hub.specificmodels.metamodelgenerator.targetproperties.IsCopy;

public abstract class AbstractTargetIdProvider implements ITargetIdProvider {
	
	private final boolean addToCopyParents;
	
	public AbstractTargetIdProvider(boolean addToCopyParents) {
		super();
		this.addToCopyParents = addToCopyParents;
	}

	public AbstractTargetIdProvider() {
		this(true);
	}
	
	@Override
	public TargetId[] provideTargetIds(ITargetIdProviderContext ctx, SourceObjectKey sok) {
		List<TargetId> result = new ArrayList<TargetId>();
		
		if (sok.isRoot()) {
			result.add(createTargetId(null, sok));
		} else 	if (sok.getObject() != null) {
			TargetId[] parentIds = ctx.getExistingTargetIds(sok.getParent());
			for (TargetId parent: parentIds) {
				if (addToCopyParents && parent.getProperty(IsCopy.class).get()) {
					result.add(createTargetId(parent, sok));
				} else if (!addToCopyParents && !(parent.getProperty(IsCopy.class).get())) {
					result.add(createTargetId(parent, sok));
				}
			}
		}
		
		Preconditions.checkState(result.size() > 0);
				
		return result.toArray(new TargetId[]{});
	}

	protected abstract TargetId createTargetId(TargetId parentId, SourceObjectKey sok);
	
//	protected SourceObjectKey getParentKey(SourceObjectKey sok) {
//		return new SourceObjectKey(sok.getObject().eContainer(), sok.getObject().eContainingFeature(), sok.getObject());	
//	}
	
	protected String firstToUpper(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
	
	protected String firstToLower(String name) {
		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}
}
