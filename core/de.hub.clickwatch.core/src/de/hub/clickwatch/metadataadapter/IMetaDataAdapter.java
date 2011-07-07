package de.hub.clickwatch.metadataadapter;

import java.util.Collection;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public interface IMetaDataAdapter {

	public Node pullAllMetaData();
	
	public Node pullMetaData(Collection<Handler> handler);
	
}
