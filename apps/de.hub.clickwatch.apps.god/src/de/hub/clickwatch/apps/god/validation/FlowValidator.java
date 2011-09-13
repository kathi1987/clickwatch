package de.hub.clickwatch.apps.god.validation;

import java.util.HashMap;
import java.util.Map;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.test.FlowWrapper;

public class FlowValidator implements Validator {
	private Map<String, String[]> validatingFlows = new HashMap<String, String[]>();
	
	@Override
	public void init() {
		String[][] aps = new String[][] {
				{"06-0F-B5-3F-22-E9", "192.168.3.34"},
				{"06-0F-B5-3F-21-3C", "192.168.3.24"},
				{"06-0F-B5-97-33-6C", "192.168.3.31"},
				{"06-0F-B5-97-34-BC", "192.168.3.73"},
				{"06-0F-B5-3F-58-49", "192.168.3.45"},
				{"06-0B-6B-09-ED-73", "192.168.3.110"},
				{"06-0B-6B-09-F2-94", "192.168.3.111"},
				{"06-0C-42-0C-74-0D", "192.168.3.112"}
		};
		
		this.validatingFlows = new HashMap<String, String[]>();
		Map<String, String> apResetList = new HashMap<String, String>();
		for (String[] ap : aps) {
			apResetList.put(ap[0], ap[1]);
			
			for (String[] targetAp : aps) {
				if (!targetAp[0].equals(ap[0])) {
					validatingFlows.put(ap[0] + " -> " + targetAp[0], new String[] {ap[0], targetAp[0], ap[1], targetAp[1]});
				}
			}
		}
		FlowWrapper.resetFlows(apResetList, false, false);
	}

	@Override
	public void startValidation() {
		int flowNum = 1;
		for (String flow : validatingFlows.keySet()) {
			System.out.println("\t" + (flowNum++) + ". flow:\t" + flow);
			
			String[] data = validatingFlows.get(flow);
			try {
				//TODO:_scurow: work on that!
				/*
				Server.getInstance().handleSetter(data[2], 7777, "routing/dsr_stats", "reset", "");
				
				Server.getInstance().handleSetter(data[2], 7777, "sf", "add_flow", data[0] + " " + data[1] + " 300 100 0 100 true");
				Thread.sleep(1*1000);
				Server.getInstance().handleSetter(data[2], 7777, "sf", "add_flow", data[0] + " " + data[1] + " 300 100 0 100 false");
				 */
				
				Thread.sleep(1*1000);
			} catch (InterruptedException int_exc) {
				//nothing to do
			}
		}
	}

}
