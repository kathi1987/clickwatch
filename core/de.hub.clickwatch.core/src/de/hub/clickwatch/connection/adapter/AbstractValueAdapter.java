package de.hub.clickwatch.connection.adapter;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Handler;

public abstract class AbstractValueAdapter extends AbstractAdapter implements IValueAdapter {
	
	@Override
	public Handler create(Handler handler, IValueAdapter valueAdapter) {
		String plainValue = valueAdapter.getPlainValue(handler);
		return create(handler, plainValue);
	}

	@Override
	public Handler create(Handler handler, String plainValue) {
		long timestamp = handler.getTimestamp();
		if (timestamp <= 0) {
			timestamp = System.nanoTime();
		}
		Handler result = create(handler.getQualifiedName(), timestamp, plainValue);
		result.setCanRead(handler.isCanRead());
		result.setCanWrite(handler.isCanWrite());
		return result;
	}

	@Override
	public Handler create(String qualifiedName, long timestamp,
			String plainValue) {
		Handler result = createNewHandler(qualifiedName, plainValue);
		result.setName(qualifiedName);
		result.setTimestamp(timestamp);
		setValue(result, plainValue);
		return result;
	}
	
	@Override
	public void update(Handler target, Handler source,
			IValueAdapter valueAdapter) {
		target.setTimestamp(source.getTimestamp());
		target.setCanRead(source.isCanRead());
		target.setCanWrite(source.isCanWrite());
		if (valueAdapter.getClass() == this.getClass()) {
			moveValue(source, target);
		} else {
			target.setValue(valueAdapter.getPlainValue(source));
		}
	}

	protected Handler createNewHandler(String qualifiedName, String plainValue) {
		return ClickWatchModelFactory.eINSTANCE.createHandler();
	}

	protected abstract void setValue(Handler handler, String plainValue);
}
