package de.hub.clickwatch.connection.adapter.internal;

import de.hub.clickcontrol.ClickSocketStatistics;

public class SocketStatisticsAdapter extends AbstractAdapter {
	
	public void activateSocketStatistics() {
		resetSocketStatistics();
	}
	
	public void resetSocketStatistics() {
		connection.getBlockingSocket().getAdapter(ClickSocketStatistics.class).resetStatistics();
	}

	public ClickSocketStatistics getSocketStatistics() {
		return connection.getBlockingSocket().getAdapter(ClickSocketStatistics.class); 
	}
}
