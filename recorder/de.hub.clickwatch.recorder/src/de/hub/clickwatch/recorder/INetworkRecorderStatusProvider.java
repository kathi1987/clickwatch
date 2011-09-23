package de.hub.clickwatch.recorder;

public interface INetworkRecorderStatusProvider {

	public void setExpectedNumberOfReports(long expectedReports);
	
	public void report(String message);
}
