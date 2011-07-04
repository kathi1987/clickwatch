package de.hub.clickwatch.nodeadapter;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;


/**
 * This implementation of {@link INodeAdapter} adapts a node model to a click
 * node. It translates remote click data into {@link ClickWatchModelPackage} and
 * vice versa. Each adapter instance represents a connections to a click node.
 * 
 * The click control API is accessed through a {@link IClickSocket}
 * implementation. The implementation can be bind via DI and {@link ClickWatchModule}
 * .
 * 
 * @author Markus Scheidgen
 */
public class ClickControlNodeAdapter extends AbstractNodeAdapter {

	@Override
	protected void createAndSetModelValue(Handler handler, String string) {
		if (string == null) {
			return;
		}
		handler.setValue(string);
	}

	@Override
	protected String createPlainRealValue(Handler handler) {
		return handler.getValue();
	}
	
	
}