package de.hub.specificmodels.tests.testsourcemodel;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.metamodelgenerator2.ITargetIdProvider;
import de.hub.specificmodels.metamodelgenerator2.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator2.TargetId;

public class TestTargetIdProvider implements ITargetIdProvider {

	@Override
	public TargetId[] provideTargetIds(ITargetIdProviderContext ctx,
			SourceObjectKey sok) {
		ArrayList<TargetId> result = new ArrayList<TargetId>();
		
		if (sok.getFeature() == null) {
			Preconditions.checkArgument(sok.getValue() instanceof RootClass);
			result.add(new TargetId(null, null, ((EObject)sok.getValue()).eClass()));
		} else {
			SourceObjectKey parentKey = new SourceObjectKey(sok.getObject().eContainer(), sok.getObject().eContainingFeature(), sok.getObject());
			TargetId[] parentIds = ctx.getExistingTargetIds(parentKey);
			for (TargetId parentId: parentIds) {
				if (sok.getFeature() instanceof EReference) {
					EObject sokValue = (EObject)sok.getValue();	
					TargetId origTargetId = new TargetId(parentId, sok.getFeature(), (sokValue).eClass());
					result.add(origTargetId);					
					if (!(sok.getValue() instanceof ClassWithListFeatures)) {
						origTargetId.setContainment(false);
						String name = (String)sokValue.eGet(sokValue.eClass().getEStructuralFeature("name"));
						TargetId listTargetId = new TargetId(parentId, sok.getFeature(), sokValue.eClass(), firstToLower(name), firstToUpper(name));
						listTargetId.setContainment(true);
						listTargetId.addSuperClassTargetId(origTargetId);
						result.add(listTargetId);
					}
				} else {
					if (!(parentId.getSourceClass() instanceof ClassWithListFeatures)) {
						if (parentId.getTargetFeatureName().equals("")) {
							result.add(new TargetId(parentId, sok.getFeature(), null));	
						}
					} else {
						result.add(new TargetId(parentId, sok.getFeature(), null));
					}					
				}
			}
		}
		
		return result.toArray(new TargetId[]{});
	}

	protected String firstToUpper(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
	
	protected String firstToLower(String name) {
		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}
}
