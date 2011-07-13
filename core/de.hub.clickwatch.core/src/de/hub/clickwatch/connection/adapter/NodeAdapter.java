package de.hub.clickwatch.connection.adapter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class NodeAdapter extends AbstractAdapter implements INodeAdapter {
	
	private Node nodeCache = null;
	private Collection<Handler> handlerCache = null;
	private Map<String, Handler> handlerNameCache = null;
	private String elementFiler = "";
	private String handlerFilter = "";
	
	@Override
	public Node pullNode(String elementFilter, String handlerFilter) {
		elementFilter = elementFilter == null ? "" : elementFilter;
		handlerFilter = handlerFilter == null ? "" : handlerFilter;
		
		if (!elementFilter.equals(this.elementFiler) || !handlerFilter.equals(this.handlerFilter)) {
			// filter have changed
			clearCaches();	
			this.elementFiler = elementFilter;
			this.handlerFilter = handlerFilter;
		}
		
		IHandlerAdapter handlerAdapter = connection.getAdapter(IHandlerAdapter.class);
		IValueAdapter valueAdapter = connection.getAdapter(IValueAdapter.class);
		if (nodeCache == null) {
			nodeCache = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
			nodeCache.filter(elementFilter, handlerFilter);
		}
		if (handlerCache == null) {
			handlerCache = nodeCache.getAllHandlers();
			handlerNameCache = new HashMap<String, Handler>();
			for (Handler handler: handlerCache) {
				handlerNameCache.put(handler.getQualifiedName(), handler);
			}
			handlerAdapter.configure(handlerCache);
		}
		
		Collection<Handler> handlers = handlerAdapter.pullHandler();
		for (Handler handler: handlers) {
			valueAdapter.moveValue(handler, handlerNameCache.get(handler.getName()));
		}
		
		return nodeCache;
	}
	

	@Override
	public void clearCaches() {
		nodeCache = null;
		handlerCache = null;
		handlerNameCache = null;
	}

	@Override
	public Node pullNode() {
		return pullNode(null, null);
	}

}
