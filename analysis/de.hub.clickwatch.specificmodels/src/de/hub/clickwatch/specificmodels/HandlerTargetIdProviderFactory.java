package de.hub.clickwatch.specificmodels;

import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;
import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.SourceObjectKey;
import de.hub.specificmodels.common.TargetId;
import de.hub.specificmodels.common.targetidprovider.FeatureMapEntryTargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.ITargetIdProviderFactory;
import de.hub.specificmodels.common.targetidprovider.NullTargetIdProvider;

public class HandlerTargetIdProviderFactory implements ITargetIdProviderFactory {
	
	private final String handlerClassName;

	public HandlerTargetIdProviderFactory(String handlerClassName) {
		super();
		this.handlerClassName = handlerClassName;
	}

	@Override
	public ITargetIdProvider getTargetIdProvider(SourceObjectKey sok) {
		ClickWatchModelPackage clickWatchModel = ClickWatchModelPackage.eINSTANCE;
		
		if (sok.isRoot()) {
			return new ITargetIdProvider() {				
				@Override
				public TargetId[] provideTargetIds(ITargetIdProviderContext ctx,
						SourceObjectKey sourceObjectKey) {
					TargetId targetId = new TargetId(null, null, 
							ClickWatchModelPackage.eINSTANCE.getHandler(), 
							"", handlerClassName);
					return new TargetId[] { targetId };
				}
			};
		} else if (sok.getObject() instanceof Handler) {
			if (clickWatchModel.getHandler().getEAllStructuralFeatures().contains(sok.getFeature())) {
				return new NullTargetIdProvider();
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

}