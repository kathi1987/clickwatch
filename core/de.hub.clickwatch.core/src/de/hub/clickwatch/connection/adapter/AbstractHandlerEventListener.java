package de.hub.clickwatch.connection.adapter;

import de.hub.clickwatch.model.Handler;

public class AbstractHandlerEventListener implements IHandlerEventListener {

	@Override
	public void handlerReceived(Handler handler) {
		// empty
	}

	@Override
	public void receivingStarted() {
		// empty
	}

	@Override
	public void receivingStopped() {
		// empty
	}

    @Override
    public void dispose() {
        // empty
        
    }

    @Override
    public void listeningStarted() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listeningStopped() {
        // TODO Auto-generated method stub
        
    }
}
