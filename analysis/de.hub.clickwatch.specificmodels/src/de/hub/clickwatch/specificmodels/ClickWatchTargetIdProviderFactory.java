package de.hub.clickwatch.specificmodels;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.targetidprovider.CopyTargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.FeatureMapEntryTargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.ITargetIdProviderFactory;
import de.hub.specificmodels.common.targetidprovider.ListTargetIdProvider;

public class ClickWatchTargetIdProviderFactory implements ITargetIdProviderFactory {
	
	private static Collection<String> commonHandler = new HashSet<String>(Arrays.asList(new String[] { 
			"debug", "handlers", "ports", "config", "name", "version" 
	}));

	@Override
	public ITargetIdProvider getTargetIdProvider(SourceObjectKey sok) {
		ClickWatchModelPackage clickWatchModel = ClickWatchModelPackage.eINSTANCE;
		
		if (sok.isRoot()) {
			return new CopyTargetIdProvider(false);
		} else if (sok.getObject() instanceof Network) {
			return new CopyTargetIdProvider(false);
		} else if (sok.getObject() instanceof Node) {
			if (sok.getFeature() == clickWatchModel.getNode_Elements()) {
				return new ListTargetIdProvider(false, true, false);
			} else {
				return new CopyTargetIdProvider(false);	
			}
		} else if (sok.getObject() instanceof Element) {
			if (sok.getFeature() == clickWatchModel.getElement_Handlers()) {
				if (commonHandler.contains(((Handler)sok.getValue()).getName())) {
					return new ListTargetIdProvider(true, elementsCopyProvider) {
						@Override
						protected SourceObjectKey getParentKey(SourceObjectKey sok) {
							return getParentsForElementsCopyProvider(sok);
						}						
					};
				} else {
					return new ListTargetIdProvider(false, elementsCopyProvider);
				}
			} else if (sok.getFeature() == clickWatchModel.getElement_Children()) {
				return new ListTargetIdProvider(false, elementsCopyProvider); // DODO
			} else {
				return elementsCopyProvider;
			}
		} else if (sok.getObject() instanceof Handler) {
			if (clickWatchModel.getHandler().getEAllStructuralFeatures().contains(sok.getFeature())) {
				return new CopyTargetIdProvider(true);
			} else {
				return new FeatureMapEntryTargetIdProvider(false);
			}
		} else if (sok.getObject() instanceof AnyType) {
			return new FeatureMapEntryTargetIdProvider(false);
		} else {
			Preconditions.checkState(false);
			return null;
		}
	}
	
	private CopyTargetIdProvider elementsCopyProvider = new CopyTargetIdProvider(true) {
		@Override
		protected SourceObjectKey getParentKey(SourceObjectKey sok) {
			return getParentsForElementsCopyProvider(sok);
		}		
	};
	
	private SourceObjectKey getParentsForElementsCopyProvider(SourceObjectKey sok) {
		SourceObjectKey parent = sok.getParent();
		while (!(parent.getObject() instanceof Node)) {
			parent = parent.getParent();
		}
		return parent;
	}
}
