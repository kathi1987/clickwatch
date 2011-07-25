package de.hub.clickwatch.recorder.test;

import org.junit.Ignore;
import org.junit.Test;

import click.ControlSocket.HandlerInfo;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;

public class ExperimentRecorderTest extends AbstractDBTest {

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
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
		return "value of " + element + "/" + handler;
	}	

	@Ignore("work in progress")
	@Test
	public void testWithOneNode() throws Exception {	
		performTest(new String[] { "192.168.0.1" });		
	}
	
	@Ignore("work in progress")
	@Test
	public void testWithTwoNodes() throws Exception {	
		performTest(new String[] { "192.168.0.1", "192.168.0.2" });		
	}

	@Override
	protected int getLogLevel() {
		return 4;
	}

}