package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.model.Node;

@ImplementedBy(NodeAdapter.class)
public interface INodeAdapter {

	public Node pullNode(String elementFilter, String handlerFilter);
	
	public Node pullNode();
	
}
