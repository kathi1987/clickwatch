package de.hub.clickwatch.connection.adapter.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class NodeAdapter extends AbstractAdapter implements INodeAdapter {
		
	@Override
	public Node pullNode(String elementFilter, String handlerFilter) {
		Node node = null;
		Collection<Handler> handlerCache = null;
		Map<String, Handler> handlerNameCache = null;
		
		elementFilter = elementFilter == null ? "" : elementFilter;
		handlerFilter = handlerFilter == null ? "" : handlerFilter;
		
		IHandlerAdapter handlerAdapter = connection.getAdapter(IHandlerAdapter.class);
		IValueAdapter valueAdapter = connection.getAdapter(IValueAdapter.class);
		if (node == null) {
			node = connection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
			if (node == null) {
				return null;
			}
			node.filter(elementFilter, handlerFilter);
		}
		if (handlerCache == null) {
			handlerCache = node.getAllHandlers();
			handlerNameCache = new HashMap<String, Handler>();
			for (Handler handler: handlerCache) {
				handlerNameCache.put(handler.getQualifiedName(), handler);
			}
		}
		
		loop: for (Handler handler: handlerCache) {
			handler = handlerAdapter.getHandler(handler);
			if (handler == null) {
				continue loop;
			}
			Handler cachedValue = handlerNameCache.get(handler.getName());
			if (cachedValue != null) {
				valueAdapter.moveValue(handler, cachedValue);	
			}			
		}
		
		return node;
	}

	@Override
	public Node pullNode() {
		return pullNode("", "");
	}

}
