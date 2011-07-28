package de.hub.clickwatch.recorder.test;

import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.logfile.LogFileDataBaseAdapter;

public class ExperimentRecorderLogFileTest extends AbstractDataBaseAdapterTest {
	
	@Override
	protected Class<? extends IDataBaseRecordAdapter> getDataBaseRecordAdapterClass() {
		return LogFileDataBaseAdapter.class;
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
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
	protected String getValue(String element, String handler) {
		if (handler.equals("h1")) {
			return "<entry><links from='FROM'><link to='TO1'><link_info rev='93'/></link><link to='TO2'><link_info rev='52'/></link></links></entry>";
		} else {
			return "value of " + element + "/" + handler;
		}
	}	

	@Test
	public void testWithOneNode() throws Exception {
		injector.getInstance(LogFileDataBaseAdapter.class).setOut(System.out);
		performTest(new String[] { "192.168.0.1" }, false);		
	}
	
	@Test
	public void testWithTwoNodes() throws Exception {	
		performTest(new String[] { "192.168.0.1", "192.168.0.2" }, false);		
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