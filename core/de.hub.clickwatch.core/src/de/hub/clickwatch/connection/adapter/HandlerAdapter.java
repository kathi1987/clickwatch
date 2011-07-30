package de.hub.clickwatch.connection.adapter;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.util.Throwables;

public class HandlerAdapter extends AbstractAdapter implements IHandlerAdapter {
	
	@Override
	public Handler getHandler(Handler handler) {
		return getHandler(handler.getQualifiedName());
	}

	@Override
	public Handler getHandler(String qualifiedName) {
		String handlerName = qualifiedName;
		int slash = handlerName.lastIndexOf("/");
		String plainHandlerName = handlerName.substring(slash + 1);
		String elementName = handlerName.substring(0, slash);
		String plainValue = null;
		try {
			plainValue = new String(clickSocket().read(elementName, plainHandlerName));
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		
		return connection.getAdapter(IValueAdapter.class)
				.create(qualifiedName, System.nanoTime(), plainValue);
	}

}
