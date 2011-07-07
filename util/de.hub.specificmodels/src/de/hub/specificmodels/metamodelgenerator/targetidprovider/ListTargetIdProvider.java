package de.hub.specificmodels.metamodelgenerator.targetidprovider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.TargetId;

/**
 * Works only for {@link SourceObjectKey}s that represent {@link EReference}s.
 */
public class ListTargetIdProvider extends AbstractTargetIdProvider {

	private final boolean withCopy;
	private final CopyTargetIdProvider copyProvider;
	
	private TargetId copyId = null;
	
	public ListTargetIdProvider(boolean addToCopyParents, boolean withCopy) {
		super(addToCopyParents);
		this.withCopy = withCopy;
		if (withCopy) {
			copyProvider = new CopyTargetIdProvider(true);
		} else {
			copyProvider = null;
		}
	}

	@Override
	public TargetId[] provideTargetIds(ITargetIdProviderContext ctx, SourceObjectKey sok) {
		Preconditions.checkArgument(sok.getValue() instanceof EObject);
		List<TargetId> result = new ArrayList<TargetId>();
		
		if (withCopy) {
			copyId = copyProvider.provideTargetIds(ctx, sok)[0];
			result.add(copyId);
		}
		
		result.addAll(Arrays.asList(super.provideTargetIds(ctx, sok)));
		
		copyId = null;
		return result.toArray(new TargetId[]{});
	}

	@Override
	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		EObject sokValue = (EObject)sok.getValue();
		if (withCopy) {
			copyId.setContainment(false);
		}
		String name = (String)sokValue.eGet(sokValue.eClass().getEStructuralFeature("name"));
		TargetId listTargetId = new TargetId(parentId, sok.getFeature(), sokValue.eClass(), firstToLower(name), firstToUpper(name));
		listTargetId.setContainment(true);
		if (withCopy) {
			listTargetId.addSuperClassTargetId(copyId);
		}
		return listTargetId;
	}

}
