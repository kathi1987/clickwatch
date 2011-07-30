package de.hub.clickwatch.connection.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.util.Throwables;

public class PullHandlerAdapter extends AbstractAdapter implements IPullHandlerAdapter {
	
	public static Collection<String> commonHandler = new HashSet<String>(Arrays.asList(new String[] { 
			"debug", "handlers", "ports", "name", "version", // config, class 
	}));
	
	private Collection<Handler> config = null;
	
	@Override
	public Collection<Handler> pullHandler() {
		Preconditions.checkState(config != null, "handler adapter must be configured before handler can be pulled");
		List<Handler> result = new ArrayList<Handler>();
		loop: for (Handler handler: config) {
			String qualifiedHandlerName = handler.getQualifiedName();
			int slash = qualifiedHandlerName.lastIndexOf("/");
			String plainHandlerName = qualifiedHandlerName.substring(slash + 1);
			if (commonHandler.contains(plainHandlerName)) {
				continue loop;
			}
			
			int splitIndex = qualifiedHandlerName.lastIndexOf("/");
			String realValue = null;
			try {
				realValue = new String(clickSocket().read(
						qualifiedHandlerName.substring(0, splitIndex),
						qualifiedHandlerName.substring(splitIndex + 1)));
			} catch (Exception e) {
				Throwables.propagate(e);
			}
			
			result.add(connection.getAdapter(IValueAdapter.class)
					.create(handler, realValue));
		}
		
		return result;
	}

	@Override
	public void configure(Collection<Handler> handlerConfig) {
		this.config = handlerConfig;
	}

	@Override
	public void deconfigure() {
		// empty
	}

}
