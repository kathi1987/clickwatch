package de.hub.clickwatch.recorder;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.model.Node;

@ImplementedBy(ClickSocketPlayer.class)
public interface IClickSocketPlayer {

	public Node getNode(String host, String port);
	
}
