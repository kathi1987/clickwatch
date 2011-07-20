package de.hub.clickwatch.server.database;


public class MetaDataRecord implements IRecord {
	/** The ID of the experiment */
	private String mExperimentId;
	/** The ID of the node */
	private String mNodeId;
	/** The timestamp of the experiment */
	private long mTimeStamp;
	/** The metaData of the experiment */
	private String mMetaData;
	
	public MetaDataRecord(){}

	
	public MetaDataRecord(String pExperimentId, String pNode, long pTimestamp, String pMetaData){
		this.mExperimentId = pExperimentId;
		this.mNodeId = pNode;
		this.mTimeStamp = pTimestamp;
		this.mMetaData = pMetaData;
	}

	@Override
	public String createInsertStatement() {
		return "INSERT INTO metadatarecord (experimentid, nodeid, timestamp, metadata) VALUES ("
				+ "\'"
				+ mExperimentId
				+ "\'"
				+ ","
				+ "\'"
				+ mNodeId
				+ "\'"
				+ ","
				+ "\'"
				+ mTimeStamp
				+ "\'"
				+ ","
				+ "\'"
				+ mMetaData
				+ "\'"
				+ ");";
	}

	@Override
	public String createPreparedInsertStament() {
		return "INSERT INTO metadatarecord (experimentid, nodeid, timestamp, metadata) VALUES ("
				+ "?"
				+ ","
				+ "?"
				+ ","
				+ "?"
				+ ","
				+ "?"
				+ ");";
	}

	public String getExperimentId() {
		return mExperimentId;
	}

	public void setExperimentId(final String pExperimentId) {
		this.mExperimentId = pExperimentId;
	}

	public long getTimeStamp() {
		return mTimeStamp;
	}

	public void setTimeStamp(final long pTimeStamp) {
		this.mTimeStamp = pTimeStamp;
	}

	public String getMetaData() {
		return mMetaData;
	}

	public void setMetaData(final String pMetaData) {
		this.mMetaData = pMetaData;
	}


	public String getNode() {
		return mNodeId;
	}


	public void setNode(String pNode) {
		this.mNodeId = pNode;
	}
}
