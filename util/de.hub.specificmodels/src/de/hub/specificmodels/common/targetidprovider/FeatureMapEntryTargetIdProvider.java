package de.hub.specificmodels.common.targetidprovider;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;
import de.hub.specificmodels.common.targetproperties.GuessMultiplicities;
import de.hub.specificmodels.common.targetproperties.GuessTypes;
import de.hub.specificmodels.common.targetproperties.IsBasedOnXml;
import de.hub.specificmodels.common.targetproperties.XmlName;

public class FeatureMapEntryTargetIdProvider extends AbstractTargetIdProvider {

	public FeatureMapEntryTargetIdProvider() {
		super();
	}

	public FeatureMapEntryTargetIdProvider(boolean addToCopyParentsOnly) {
		super(addToCopyParentsOnly);
	}

	@Override
	protected TargetId createTargetId(TargetId parentId, SourceObjectKey sok) {
		TargetId result = null;
		if (sok.getFeature() instanceof EReference) {
			result = new TargetId(parentId, sok.getFeature(), (EClass)sok.getFeature().getEType(), 
					firstToLower(sok.getFeature().getName()), firstToUpper(sok.getFeature().getName()));	
		} else {
			result = new TargetId(parentId, sok.getFeature(), null, firstToLower(sok.getFeature().getName()), null);
			result.getProperty(GuessTypes.class).set(true);
		}
		result.getProperty(GuessMultiplicities.class).set(true);
		result.getProperty(IsBasedOnXml.class).set(true);
		result.getProperty(XmlName.class).set(sok.getFeature().getName());
		return result;
	}

}
