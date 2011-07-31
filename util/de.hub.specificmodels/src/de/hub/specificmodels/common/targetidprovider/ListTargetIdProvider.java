package de.hub.specificmodels.common.targetidprovider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;
import de.hub.specificmodels.common.targetproperties.Containment;
import de.hub.specificmodels.common.targetproperties.GuessMultiplicities;
import de.hub.specificmodels.common.targetproperties.IsCopy;
import de.hub.specificmodels.common.targetproperties.SuperClasses;

/**
 * Works only for {@link SourceObjectKey}s that represent {@link EReference}s.
 */
public class ListTargetIdProvider extends AbstractTargetIdProvider {

	private final CopyTargetIdProvider copyProvider;
	
	private TargetId copyId = null;
	
	public ListTargetIdProvider(boolean addToCopyParents, boolean withCopy, boolean addCopyToCopyParents) {
		super(addToCopyParents);
		if (withCopy) {
			copyProvider = new CopyTargetIdProvider(addCopyToCopyParents);
		} else {
			copyProvider = null;
		}
	}
	
	public ListTargetIdProvider(boolean addToCopyParents, CopyTargetIdProvider copyTargetIdProvider) {
		super(addToCopyParents);
		this.copyProvider = copyTargetIdProvider;
	}

	@Override
	public TargetId[] provideTargetIds(ITargetIdProviderContext ctx, SourceObjectKey sok) {
		Preconditions.checkArgument(sok.getValue() instanceof EObject);
		List<TargetId> result = new ArrayList<TargetId>();
		
		if (copyProvider != null) {
			copyId = copyProvider.provideTargetIds(ctx, sok)[0];
			copyId.getProperty(IsCopy.class).set(true);
			result.add(copyId);
		}
		
		result.addAll(Arrays.asList(super.provideTargetIds(ctx, sok)));
		
		copyId = null;
		return result.toArray(new TargetId[]{});
	}

	@Override
	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		EObject sokValue = (EObject)sok.getValue();
		if (copyProvider != null) {
			copyId.getProperty(Containment.class).set(false);
		}
		String name = (String)sokValue.eGet(sokValue.eClass().getEStructuralFeature("name"));
		TargetId listTargetId = new TargetId(parentId, sok.getFeature(), sokValue.eClass(), firstToLower(name), firstToUpper(name));
		listTargetId.getProperty(Containment.class).set(true);
		if (copyProvider != null) {
			listTargetId.getProperty(SuperClasses.class).add(copyId);
		}
		listTargetId.getProperty(GuessMultiplicities.class).set(true);
		return listTargetId;
	}

}
