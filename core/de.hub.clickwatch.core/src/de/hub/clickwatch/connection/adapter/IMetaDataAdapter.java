package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.model.Node;

@ImplementedBy(MetaDataAdapter.class)
public interface IMetaDataAdapter {

	public Node pullAllMetaData();
	
}
