package de.hub.clickwatch.connection.adapter;

import com.google.inject.Inject;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.util.HandlerUtil;
import de.hub.clickwatch.util.NanoClock;
import de.hub.clickwatch.util.Throwables;

public class HandlerAdapter extends AbstractAdapter implements IHandlerAdapter {
	
	@Inject NanoClock clock;
	
	@Override
	public Handler getHandler(Handler handler) {
		return getHandler(handler.getQualifiedName());
	}

	@Override
	public Handler getHandler(String qualifiedName) {
		String[] splitName = HandlerUtil.getSplitQualifiedName(qualifiedName);
		String elementName = splitName[0];
		String handlerName = splitName[1];
		String plainValue = null;
		try {
			plainValue = new String(clickSocket().read(elementName, handlerName));
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		
		return connection.getAdapter(IValueAdapter.class)
				.create(qualifiedName, clock.currentTimeNanos(), plainValue);
	}

}
