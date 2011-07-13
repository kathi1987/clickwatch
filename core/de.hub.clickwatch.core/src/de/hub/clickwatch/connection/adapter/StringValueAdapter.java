package de.hub.clickwatch.connection.adapter;

import de.hub.clickwatch.model.Handler;

public class StringValueAdapter extends AbstractAdapter implements IValueAdapter {

	@Override
	public String getPlainRealValue(Handler handler) {
		return handler.getValue();
	}

	@Override
	public void setModelValue(Handler handler, String realValue) {
		handler.setValue(realValue);
	}

	@Override
	public void moveValue(Handler source, Handler target) {
		target.setValue(source.getValue());
	}
	
}
