package de.hub.clickwatch.recorder;

import org.eclipse.emf.common.util.EList;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.impl.ElementImpl;
import de.hub.clickwatch.model.impl.HandlerImpl;

public class CompoundHandlerPlayerImpl extends ElementImpl {
	
	// TODO reference to player ...
	private boolean initialized = false;

	private class Read extends HandlerImpl {
		Read() {
			setName("read");
		}
		
		@Override
		public String getValue() {
			// TODO Auto-generated method stub
			return super.getValue();
		}
	}
	
	@Override
	public EList<Handler> getHandlers() {
		if (!initialized) {
			super.getHandlers().add(new Read());
		}
		return super.getHandlers();
	}

}
