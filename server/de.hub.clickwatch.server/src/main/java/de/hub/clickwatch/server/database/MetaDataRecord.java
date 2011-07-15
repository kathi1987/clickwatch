package de.hub.clickwatch.server.database;

import de.hub.clickwatch.xml.ExperimentType;

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
	
	
	public MetaDataRecord(ExperimentType pExperiment){
		
		
	}

	
	public MetaDataRecord(String pExperimentId, String pNodeId, long pTimestamp, String pMetaData){
		this.mExperimentId = pExperimentId;
		this.mNodeId = pNodeId;
		this.mTimeStamp = pTimestamp;
		this.mMetaData = pMetaData;
	}

	@Override
	public String createInsertStatement() {
		return "INSERT INTO MetaDataRecord (experimentId, nodeId, timestamp, metaData) VALUES ("
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
		return "INSERT INTO MetaDataRecord (experimentId, nodeId, timestamp, metaData) VALUES ("
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

	public String getNodeId() {
		return mNodeId;
	}

	public void setNodeId(final String pNodeId) {
		this.mNodeId = pNodeId;
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
}
