package de.hub.clickwatch.recorder;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public interface INetworkRecorderDataListener {

	void handlerRecorded(Node node, Handler handler);

}
