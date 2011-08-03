package de.hub.clickwatch.connection.adapter;

import de.hub.clickcontrol.ClickSocketStatistics;

public class SocketStatisticsAdapter extends AbstractAdapter {
	
	public void activateSocketStatistics() {
		resetSocketStatistics();
	}
	
	public void resetSocketStatistics() {
		clickSocket().getAdapter(ClickSocketStatistics.class).resetStatistics();
	}

	public ClickSocketStatistics getSocketStatistics() {
		return clickSocket().getAdapter(ClickSocketStatistics.class); 
	}
}
