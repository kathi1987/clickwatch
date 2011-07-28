package de.hub.clickwatch.recorder.test;

import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;

public class ExperimentRecorderHBaseTest extends AbstractDBTest {

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}
	
	@Override
	protected Class<? extends IDataBaseRecordAdapter> getDataBaseRecordAdapterClass() {
		return HBaseDataBaseAdapter.class;
	}
	
	@Override
	protected Class<? extends IDataBaseRetrieveAdapter> getDataBaseRetrieveAdapterClass() {
		return HBaseDataBaseAdapter.class;
	}

	@Override
	protected boolean getRecordChangesOnly() {
		return false;
	}

	@Override
	protected HandlerInfo[] getHandler() {
		return new HandlerInfo[] { 
				new HandlerInfo("e1_1/e_2_1", "h1", true, true),
				new HandlerInfo("e1_1/e_2_1", "h2", true, true),
				new HandlerInfo("e1_1/e_2_2", "h1", true, true)
		};
	}
	
	@Override
	protected boolean getInMemory() {
		return false;
	}

	@Override
	protected String getExperimentName() {
		return "test";
	}

	@Override
	protected String getValue(String element, String handler) {
		return "value of " + element + "/" + handler;
	}	

	@Test
	public void testWithOneNode() throws Exception {	
		performTest(new String[] { "192.168.0.1" });		
	}
	
	@Test
	public void testWithTwoNodes() throws Exception {	
		performTest(new String[] { "192.168.0.1", "192.168.0.2" });		
	}

	@Test
	public void testWithTwelveNodes() throws Exception {	
		performTest(new String[] { 
				"192.168.0.1", 
				"192.168.0.2",
				"192.168.0.3",
				"192.168.0.4",
				"192.168.0.5",
				"192.168.0.6",
				"192.168.0.7",
				"192.168.0.8",
				"192.168.0.9",
				"192.168.0.10",
				"192.168.0.11",
				"192.168.0.12" });		
	}

}