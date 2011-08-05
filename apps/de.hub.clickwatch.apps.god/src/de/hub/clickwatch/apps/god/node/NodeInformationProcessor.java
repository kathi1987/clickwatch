package de.hub.clickwatch.apps.god.node;

import java.util.List;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.model.Handler;

public interface NodeInformationProcessor {
	public List<ClientInformations> handleInformations(Handler data);
	public List<ClientInformations> handleGenuineInformations(String xmlData);
}
