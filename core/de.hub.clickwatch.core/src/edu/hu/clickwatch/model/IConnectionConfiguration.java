package edu.hu.clickwatch.model;

import java.util.Collection;

public interface IConnectionConfiguration {

	public void runInExtraThread(Runnable runnable);
	
	public void runInModelThread(Runnable runnable);
	
	public void registerModelChanges(Node node, Collection<ChangeMark> changes);
	
	public void handleConnect(AbstractNodeConnection connection);
	
	public void handleDisconnect(AbstractNodeConnection connection);
	
	public static final int ERROR = 0;
	public static final int WARNING = 1;
	
	public void handleIncident(int type, String message);
}
