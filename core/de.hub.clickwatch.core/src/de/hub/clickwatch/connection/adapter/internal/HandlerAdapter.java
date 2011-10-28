package de.hub.clickwatch.connection.adapter.internal;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.util.HandlerUtil;
import de.hub.clickwatch.util.NanoClock;

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
			plainValue = new String(connection.getBlockingSocket().read(elementName, handlerName));
		} catch (Exception e) {
			connection.createError("exception while reading handler " + qualifiedName, e);
		}
		
		return connection.getAdapter(IValueAdapter.class)
				.create(qualifiedName, clock.currentTimeNanos(), plainValue);
	}

	@Override
	public void setHandler(Handler handler) {
		String plainValue = connection.getAdapter(IValueAdapter.class).getPlainValue(handler);
		String[] splitName = HandlerUtil.getSplitQualifiedName(handler.getQualifiedName());
		String elementName = splitName[0];
		String handlerName = splitName[1];
		try {
			connection.getBlockingSocket().write(elementName, handlerName, plainValue.toCharArray());
		} catch (Exception e) {
			connection.createError("exception while writing handler " + handler.getQualifiedName(), e);
		}
	}

}
