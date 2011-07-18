package de.hub.clickwatch.recorder.db;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public interface INodeRecord {

	public Node getMetaData();
	
	public Handler getHandler(String qualifiedName, long from, long to);
}
