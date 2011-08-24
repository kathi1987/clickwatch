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
	
	private void resetFlows(String [][] usableMacIps) {
		while (true) {
			int resetCount = 0;
			for (int k = 0; k < usableMacIps.length; k++) {
				FlowInformation f = null;
				if ((server.getStorageManager().getClientInformations(usableMacIps[k][0]) != null) 
						&& server.getStorageManager().getClientInformations(usableMacIps[k][0]).containsKey(FlowstatsProcessor.class.getName())) {
					f = ((FlowInformation)server.getStorageManager().getClientInformations(usableMacIps[k][0]).get(FlowstatsProcessor.class.getName()));
				}
				
				if ((f != null) && (f.getRxflows().size() == 0) && (f.getTxflows().size() == 0)) {
					resetCount++;
				} else {
					System.out.println("\tINFO: resetting flowstats of node " + usableMacIps[k][1]);
					server.handleSetter(usableMacIps[k][1], 7777, "sf", "reset", "");
				}
			}
			
			if (resetCount == usableMacIps.length) {
				break;
			}
			
			try {
				Thread.sleep(1*1000);
			} catch (InterruptedException e) {
				//nothing
			}
		}
	}
	
	private boolean addNodesToSzenario(String[][] usableMacIps) {
		boolean addedSomething = false;
		
		for (int k = 0; k < usableMacIps.length; k++) {
			String[][] aps = server.getSzenario().get_ACCESS_POINTS();
			
			boolean alreadyIn = false;
			for (int m = 0; m < aps.length; m++) {
				if (aps[m][0].equals(usableMacIps[k][1])) {
					alreadyIn = true;
					break;
				}
			}
			
			if (!alreadyIn) {
				String[][] newAps = new String[aps.length+1][3];
				for (int m = 0; m < aps.length; m++) {
					newAps[m][0] = aps[m][0];
					newAps[m][1] = aps[m][1];
					newAps[m][2] = aps[m][2];
				}
				
				System.out.println("\t\tINFO:adding node " + usableMacIps[k][1] + ":7777 " + usableMacIps[k][2] + " to szenario");
				newAps[newAps.length-1][0] = usableMacIps[k][1];
				newAps[newAps.length-1][1] = "7777";
				newAps[newAps.length-1][2] = usableMacIps[k][2];
				
				server.getSzenario().set_ACCESS_POINTS(newAps);
				
				addedSomething = true;
			}
		}
		
		return addedSomething;
	}
	
	@Test
	//@Ignore
	public void initialFlowFunctionalityTest() {
		String[][] usableMacIps = new String[][] {
			{"06-0B-6B-09-ED-73", "192.168.3.110", "sk110"},
			{"06-0B-6B-09-F2-94", "192.168.3.111", "sk111"},
			{"06-0C-42-0C-74-0D", "192.168.3.112", "sk112"}
		};
		if (addNodesToSzenario(usableMacIps)) {
			server.stopSzenario();
			server.startSzenario();
		}
		resetFlows(usableMacIps);
		
		try {
			System.out.print("testing flow functionality ... ");
			server.handleSetter(usableMacIps[0][1], 7777, "sf", "add_flow", usableMacIps[0][0] + " " + usableMacIps[1][0] + " 300 100 0 100 true");
			Thread.sleep(1*1000);
			server.handleSetter(usableMacIps[0][1], 7777, "sf", "add_flow", usableMacIps[0][0] + " " + usableMacIps[1][0] + " 300 100 0 100 false");
			
			server.handleSetter(usableMacIps[0][1], 7777, "sf", "add_flow", usableMacIps[0][0] + " " + usableMacIps[2][0] + " 300 100 0 100 true");
			Thread.sleep(1*1000);
			server.handleSetter(usableMacIps[0][1], 7777, "sf", "add_flow", usableMacIps[0][0] + " " + usableMacIps[2][0] + " 300 100 0 100 false");
			System.out.println("done");
			Thread.sleep(3*1000);
		} catch (InterruptedException int_exc) {
			//nothing to do
		}
		
		FlowInformation f0 = (FlowInformation)server.getStorageManager().getClientInformations(usableMacIps[0][0]).get(FlowstatsProcessor.class.getName());
		FlowInformation f1 = (FlowInformation)server.getStorageManager().getClientInformations(usableMacIps[1][0]).get(FlowstatsProcessor.class.getName());
		FlowInformation f2 = (FlowInformation)server.getStorageManager().getClientInformations(usableMacIps[2][0]).get(FlowstatsProcessor.class.getName());
		
		assertEquals(2, f0.getTxflows().size());
		assertEquals(1, f1.getRxflows().size());
		assertEquals(1, f2.getRxflows().size());
	}
	
	@Test
	public void multiHopFunctionalityTest() {
		String[][] usableMacIps = new String[][] {
			{"06-0F-B5-3F-22-E9", "192.168.3.34", "wgt34"},
			{"06-0F-B5-3F-21-3C", "192.168.3.24", "wgt24"},
			{"06-0F-B5-97-33-6C", "192.168.3.31", "wgt31"},
			{"06-0F-B5-97-34-BC", "192.168.3.73", "wgt73"},
			{"06-0F-B5-3F-58-49", "192.168.3.45", "wgt45"}
		};
		if (addNodesToSzenario(usableMacIps)) {
			server.stopSzenario();
			server.startSzenario();
		}
		resetFlows(usableMacIps);
		
		try {
			System.out.print("testing flow functionality ... ");
			server.handleSetter(usableMacIps[0][1], 7777, "sf", "add_flow", usableMacIps[0][0] + " " + usableMacIps[4][0] + " 300 100 2 100 true");
			Thread.sleep(1*1000);
			server.handleSetter(usableMacIps[0][1], 7777, "sf", "add_flow", usableMacIps[0][0] + " " + usableMacIps[4][0] + " 300 100 2 100 false");
			
			Thread.sleep(3*1000);
		} catch (InterruptedException int_exc) {
			//nothing to do
		}
		
		FlowInformation f0 = (FlowInformation)server.getStorageManager().getClientInformations(usableMacIps[0][0]).get(FlowstatsProcessor.class.getName());
		FlowInformation f4 = (FlowInformation)server.getStorageManager().getClientInformations(usableMacIps[4][0]).get(FlowstatsProcessor.class.getName());
		
		assertEquals(1, f0.getTxflows().size());
		assertEquals(1, f4.getRxflows().size());
		assertTrue(f4.getRxflows().get(0).getAvgHops() > 1);
	}
}
