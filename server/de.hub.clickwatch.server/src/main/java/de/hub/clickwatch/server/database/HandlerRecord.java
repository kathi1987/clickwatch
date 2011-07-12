package de.hub.clickwatch.server.database;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Handler;


public class HandlerRecord implements IRecord {
	/** The ID of the experiment */
	private String mExperimentId;
	/** The ID of the node */
	private String mNodeId;
	/** The qualified name of the node */
	private String mQualifiedName;
	/** The timestamp of the record */
	private long mTimeStamp;
	/** The content of the handler */
	private String mValue;
		
	public HandlerRecord(){	}
	
	public HandlerRecord(final String pExperimentId, final String pNodeId, final String pQualifiedName, final long pTimestamp, final String pValue){
		this.mExperimentId = pExperimentId;
		this.mNodeId = pNodeId;
		this.mQualifiedName = pQualifiedName;
		this.mTimeStamp = pTimestamp;
		this.mValue = pValue;
	}
	
	// TODO
	public Handler createHandler(){
		Handler handler = ClickWatchModelFactory.eINSTANCE.createHandler();
		
		handler.setValue(mValue);
		
		return handler;
	}

	@Override
	public String createInsertStatement(){
		return "INSERT INTO HandlerRecord (experimentId, nodeId, qualifiedName, timestamp, value) VALUES ("
				+ "\'"
				+ mExperimentId
				+ "\'"
				+ ","
				+ "\'"
				+ mNodeId
				+ "\'"
				+ ","
				+ "\'"
				+ mQualifiedName
				+ "\'"
				+ ","
				+ "\'"
				+ mTimeStamp
				+ "\'"
				+ ","
				+ "\'"
				+ mValue
				+ "\'"
				+ ");";
	}
	
	public String createPreparedInsertStament(){
		return "INSERT INTO HandlerRecord (experimentId, nodeId, qualifiedName, timestamp, value) VALUES ("
				+ "?"
				+ ","
				+ "?"
				+ ","
				+ "?"
				+ ","
				+ "?"
				+ ","
				+ "?"
				+ ");";
	}

	@Override
	public String toString(){
		return "";
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

	public String getQualifiedName() {
		return mQualifiedName;
	}

	public void setQualifiedName(final String pQualifiedName) {
		this.mQualifiedName = pQualifiedName;
	}

	public long getTimeStamp() {
		return mTimeStamp;
	}

	public void setTimeStamp(final long pTimeStamp) {
		this.mTimeStamp = pTimeStamp;
	}

	public String getValue() {
		return mValue;
	}

	public void setValue(final String pValue) {
		this.mValue = pValue;
	}
}
