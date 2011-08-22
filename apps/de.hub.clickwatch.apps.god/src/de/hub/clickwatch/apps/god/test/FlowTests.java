package de.hub.clickwatch.apps.god.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.node.FlowstatsProcessor;
import de.hub.clickwatch.apps.god.information.FlowInformation;

public class FlowTests {
	private static Server server = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Server.startServer(false);
		server = Server.getInstance();
		
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException intExc) {
			//nothing
		}
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
	public void initialFlowFunctionalityTest() {
		String[][] macIp = new String[][] {
			{"06-0B-6B-09-ED-73", "192.168.3.110"},
			{"06-0B-6B-09-F2-94", "192.168.3.111"},
			{"06-0C-42-0C-74-0D", "192.168.3.112"}
		};
		
		try {
			while (true) {
				int resetCount = 0;
				for (int k = 0; k < macIp.length; k++) {
					FlowInformation f = null;
					if ((server.getStorageManager().getClientInformations(macIp[k][0]) != null) 
							&& server.getStorageManager().getClientInformations(macIp[k][0]).containsKey(FlowstatsProcessor.class.getName())) {
						f = ((FlowInformation)server.getStorageManager().getClientInformations(macIp[k][0]).get(FlowstatsProcessor.class.getName()));
					}
					
					if ((f != null) && (f.getRxflows().size() == 0) && (f.getTxflows().size() == 0)) {
						resetCount++;
					} else {
						System.out.println("\tresetting " + macIp[k][1]);
						server.handleSetter(macIp[k][1], 7777, "sf", "reset", "");
					}
				}
				
				if (resetCount == macIp.length) {
					break;
				}
				
				Thread.sleep(1*1000);
			}
			
			System.out.print("adding flow ... ");
			server.handleSetter(macIp[0][1], 7777, "sf", "add_flow", macIp[0][0] + " " + macIp[1][0] + " 300 100 0 100 true");
			server.handleSetter(macIp[0][1], 7777, "sf", "add_flow", macIp[0][0] + " " + macIp[2][0] + " 300 100 0 100 true");
			System.out.println("done");
			
			Thread.sleep(5*1000);
			
			System.out.println("stopping flow ... ");
			server.handleSetter(macIp[0][1], 7777, "sf", "add_flow", macIp[0][0] + " " + macIp[1][0] + " 300 100 0 100 false");
			server.handleSetter(macIp[0][1], 7777, "sf", "add_flow", macIp[0][0] + " " + macIp[2][0] + " 300 100 0 100 false");
			System.out.println("done");
			
			Thread.sleep(5*1000);
		} catch (InterruptedException int_exc) {
			//nothing to do
		}
		
		FlowInformation f = (FlowInformation)server.getStorageManager().getClientInformations(macIp[0][0]).get(FlowstatsProcessor.class.getName());
		System.out.println("size rx: " + f.getRxflows().size());
		System.out.println("size tx: " + f.getTxflows().size());
		assertTrue(true);
	}

}
