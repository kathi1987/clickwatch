package de.hub.clickwatch.specificmodels;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Node;
import de.hub.specificmodels.metamodelgenerator.Context;
import de.hub.specificmodels.metamodelgenerator.IFeatureKey;
import de.hub.specificmodels.metamodelgenerator.ListToSingleFeatureClassCreator;

public class NodeClassCreator extends ListToSingleFeatureClassCreator<Node> {

	public NodeClassCreator(Context ctx) {
		super(ctx);
	}

	@Override
	protected Collection<EReference> getListFeatures(Node object) {
		ClickWatchModelPackage cwPackage = ClickWatchModelPackage.eINSTANCE;
		return Arrays.asList(new EReference[]{ cwPackage.getNode_Elements() });
	}

	@Override
	protected void updateListFeature(EStructuralFeature target,
			IFeatureKey featureKey, Object value) {
		// empty
	}

	@Override
	protected EStructuralFeature createListFeature(IFeatureKey featureKey,
			Object value) {
		// TODO general superclass
		return null;
	}

	@Override
	protected String getFeatureName(ListFeatureKey featureKey) {
		return ((Element)featureKey.get()).getName();
	}
	
}
