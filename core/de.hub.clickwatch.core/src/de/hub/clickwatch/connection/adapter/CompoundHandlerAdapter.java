package de.hub.clickwatch.connection.adapter;

import java.util.Collection;

import de.hub.clickwatch.model.Handler;

public class CompoundHandlerAdapter extends HandlerAdapter {

	@Override
	public Collection<Handler> pullHandler() {
		// TODO Auto-generated method stub
		return super.pullHandler();
	}

	@Override
	public void configure(Collection<Handler> handlerConfig) {
		super.configure(handlerConfig);
		// TODO push configuration into the network
	}

}
