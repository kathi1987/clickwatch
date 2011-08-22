package de.hub.clickwatch.apps.god.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.hub.clickwatch.apps.god.Server;

public class FlowTests {
	private static Server server = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Server.startServer(false);
		server = Server.getInstance();
	}

	@Before
	public void setUp() throws Exception {
		server.startSzenario();
	}

	@After
	public void tearDown() throws Exception {
		server.stopSzenario();
	}

	@Test
	public void test() {
		System.out.println("\tJUnit test\n");
		
		try {
			Thread.sleep(5*1000);
			/*
			handleSetter("192.168.3.110", 7777, "sf", "add_flow", "06-0B-6B-09-ED-73 06-0B-6B-09-F2-94 300 100 0 100 true");
			handleSetter("192.168.3.110", 7777, "sf", "add_flow", "06-0B-6B-09-ED-73 06-0C-42-0C-74-0D 300 100 0 100 true");
			System.out.println("added flow...\n");
			Thread.sleep(5*1000);
			
			handleSetter("192.168.3.110", 7777, "sf", "add_flow", "06-0B-6B-09-ED-73 06-0B-6B-09-F2-94 300 100 0 100 false");
			handleSetter("192.168.3.110", 7777, "sf", "add_flow", "06-0B-6B-09-ED-73 06-0C-42-0C-74-0D 300 100 0 100 false");
			System.out.println("stopped flow...\n");
			*/
		} catch (InterruptedException int_exc) {
			//nothing to do
		}
		
		//System.out.println(storageMgr.getClientMonitor());
		assertTrue(true);
	}

}
