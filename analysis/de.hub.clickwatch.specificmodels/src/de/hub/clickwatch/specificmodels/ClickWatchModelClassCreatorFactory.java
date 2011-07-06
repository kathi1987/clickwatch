package de.hub.clickwatch.specificmodels;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.specificmodels.metamodelgenerator.Context;
import de.hub.specificmodels.metamodelgenerator.IClassCreator;
import de.hub.specificmodels.metamodelgenerator.IClassCreatorFactory;

public class ClickWatchModelClassCreatorFactory implements IClassCreatorFactory {

	@Override
	public IClassCreator<? extends EObject> createClassCreator(Context ctx,
			EObject object) {
		if (object instanceof Network) {
			return new NetworkClassCreator(ctx);
		} else if (object instanceof Node) {
			return new NodeClassCreator(ctx);
		} else {
			Preconditions.checkState(false);
			return null;
		}
	}

}
