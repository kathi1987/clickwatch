package de.hub.clickwatch.specificmodels;

import org.eclipse.emf.ecore.xml.type.AnyType;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.specificmodels.metamodelgenerator.ITargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.SourceObjectKey;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.CopyTargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.FeatureMapEntryTargetIdProvider;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.ITargetIdProviderFactory;
import de.hub.specificmodels.metamodelgenerator.targetidprovider.ListTargetIdProvider;

public class ClickWatchTargetIdProviderFactory implements ITargetIdProviderFactory {
	
	private CopyTargetIdProvider copyTargetIdProvider = new CopyTargetIdProvider();

	@Override
	public ITargetIdProvider getTargetIdProvider(SourceObjectKey sok) {
		ClickWatchModelPackage clickWatchModel = ClickWatchModelPackage.eINSTANCE;
		
		if (sok.isRoot()) {
			return copyTargetIdProvider;
		} else if (sok.getObject() instanceof Network) {
			return copyTargetIdProvider;
		} else if (sok.getObject() instanceof Node) {
			if (sok.getFeature() == clickWatchModel.getNode_Elements()) {
				return new ListTargetIdProvider(true, true);
			}
		} else if (sok.getObject() instanceof Element) {
			if (sok.getFeature() == clickWatchModel.getElement_Handlers()) {
				return new ListTargetIdProvider(false, true);
			} else if (sok.getFeature() == clickWatchModel.getElement_Children()) {
				return new ListTargetIdProvider(false, true); // DODO
			}
		} else if (sok.getObject() instanceof Handler) {
			if (sok.getFeature() == clickWatchModel.getHandler_Any() || 
					sok.getFeature() == clickWatchModel.getHandler_Mixed()) {
				return new FeatureMapEntryTargetIdProvider(false);
			}
		} else if (sok.getObject() instanceof AnyType) {
			return new FeatureMapEntryTargetIdProvider(false);
		}
		
		return copyTargetIdProvider;
	}

}
