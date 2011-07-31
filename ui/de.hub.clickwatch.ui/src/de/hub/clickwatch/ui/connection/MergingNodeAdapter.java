package de.hub.clickwatch.ui.connection;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.AbstractAdapter;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.presentation.ClickWatchModelEditor;
import de.hub.clickwatch.ui.util.IUIContext;

public class MergingNodeAdapter extends AbstractAdapter {
	
	@Inject
	private Merger merger;
	@Inject
	private IUIContext uiContext;
	
	private MergingNodeAdapterMergeConfiguration getMergeConfiguration() {
		return (MergingNodeAdapterMergeConfiguration)merger.getConfiguration();
	}
	
	public void pullAndMergeHandlerValues(final Node modelNode) {
		String elementFilter;
		String handlerFilter;
		if (modelNode.eContainer() instanceof Network) {
			Network network = (Network)modelNode.eContainer();
			elementFilter = network.getElementFilter() == null ? "" : network.getElementFilter();
			handlerFilter = network.getHandlerFilter() == null ? "" : network.getHandlerFilter();
		} else {
			elementFilter = "";
			handlerFilter = "";
		}
		
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		final Node networkNode = nodeAdapter.pullNode(elementFilter, handlerFilter);
		
		uiContext.runInGUI(new Runnable() {
			@Override
			public void run() {
				getMergeConfiguration().getChanges().clear();
		
				merger.merge(modelNode, networkNode);					

				ClickWatchModelEditor editor = uiContext.getAdapter(ClickWatchModelEditor.class);
				if (editor != null) {
					editor.markChanges(modelNode, getMergeConfiguration().getChanges());
				}
			}
		});
	}
}
