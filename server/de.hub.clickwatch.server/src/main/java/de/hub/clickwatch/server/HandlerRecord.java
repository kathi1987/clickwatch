package de.hub.clickwatch.server;

public class HandlerRecord {

	private final String experimentId;
	private final String nodeId;
	private final String qualifiedHandlerName;
	private final long timestamp;
	private final String value;
	
	public HandlerRecord(String experimentId, String nodeId,
			String qualifiedHandlerName, long timestamp, String value) {
		super();
		this.experimentId = experimentId;
		this.nodeId = nodeId;
		this.qualifiedHandlerName = qualifiedHandlerName;
		this.timestamp = timestamp;
		this.value = value;
	}

	public String getExperimentId() {
		return experimentId;
	}

	public String getNodeId() {
		return nodeId;
	}

	public String getQualifiedHandlerName() {
		return qualifiedHandlerName;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getValue() {
		return value;
	}
	
}
