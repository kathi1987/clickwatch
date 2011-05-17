package edu.hu.clickwatch.analysis.composition.model;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

public class ModelUtil {
	
	public static class ModelAdapter extends AdapterImpl {
		private final Resource modelResource;

		public ModelAdapter(Resource modelResource) {
			super();
			this.modelResource = modelResource;
		}
	}
	
	public static void addModelToModelNode(ModelNode node, Resource model) {
		EList<Adapter> eAdapters = node.eAdapters();
		ModelAdapter oldAdapter = null;
		for (Adapter adapter: eAdapters) {
			if (adapter instanceof ModelAdapter) {
				oldAdapter = (ModelAdapter)adapter;
			}
		}
		if (oldAdapter != null) {
			eAdapters.remove(oldAdapter);
		}
		eAdapters.add(new ModelAdapter(model));
		node.setHasModel(true);
	}

	public static void removeModelFromModelNode(ModelNode node) {
		EList<Adapter> eAdapters = node.eAdapters();
		ModelAdapter oldAdapter = null;
		for (Adapter adapter: eAdapters) {
			if (adapter instanceof ModelAdapter) {
				oldAdapter = (ModelAdapter)adapter;
			}
		}
		if (oldAdapter != null) {
			eAdapters.remove(oldAdapter);
		}
		node.setHasModel(false);
	}

	public static Resource getModelFromModelNode(ModelNode node) {
		EList<Adapter> eAdapters = node.eAdapters();
		for (Adapter adapter: eAdapters) {
			if (adapter instanceof ModelAdapter) {
				return ((ModelAdapter)adapter).modelResource;
			}
		}
		return null;
	}
}
