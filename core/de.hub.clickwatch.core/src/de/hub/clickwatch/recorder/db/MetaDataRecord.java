package de.hub.clickwatch.recorder.db;

public class MetaDataRecord {

	private final String experimentId;
	private final String nodeId;
	private final long timestamp;
	private final String serializedMetaData;
	
	public MetaDataRecord(String experimentId, String nodeId, long timestamp,
			String serializedMetaData) {
		super();
		this.experimentId = experimentId;
		this.nodeId = nodeId;
		this.timestamp = timestamp;
		this.serializedMetaData = serializedMetaData;
	}

	public String getExperimentId() {
		return experimentId;
	}

	public String getNodeId() {
		return nodeId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getSerializedMetaData() {
		return serializedMetaData;
	}
	
}
