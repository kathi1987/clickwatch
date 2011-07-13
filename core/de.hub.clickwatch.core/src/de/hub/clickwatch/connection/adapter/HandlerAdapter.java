package de.hub.clickwatch.connection.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.util.Throwables;

public class HandlerAdapter extends AbstractAdapter implements IHandlerAdapter {
	
	private Collection<Handler> config = null;
	
	@Override
	public Collection<Handler> pullHandler() {
		Preconditions.checkState(config != null, "handler adapter must be configured before handler can be pulled");
		List<Handler> result = new ArrayList<Handler>();
		for (Handler handler: config) {
			String qualifiedHandlerName = handler.getQualifiedName();
			int splitIndex = qualifiedHandlerName.lastIndexOf("/");
			char[] realValue = null;
			try {
				realValue = clickSocket.read(qualifiedHandlerName.substring(0, splitIndex), qualifiedHandlerName.substring(splitIndex + 1));
			} catch (Exception e) {
				Throwables.propagate(e);
			}
			Handler resultHandler = EcoreUtil.copy(handler);
			resultHandler.setName(handler.getQualifiedName());
			connection.getAdapter(IValueAdapter.class).setModelValue(resultHandler, new String(realValue));
			result.add(resultHandler);
		}
		
		return result;
	}

	@Override
	public void configure(Collection<Handler> handlerConfig) {
		this.config = handlerConfig;
	}

}
