package de.hub.clickwatch.apps.god.test;

import java.util.Map;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.information.FlowInformation;
import de.hub.clickwatch.apps.god.node.FlowInfoProcessor;

public class FlowWrapper {
	public static void resetFlows(Map<String, String> usableMacIps, boolean manualNodeUpdate, boolean displayInfos) {
		while (true) {
			int resetCount = 0;
			
			if (manualNodeUpdate) {
				Server.getInstance().updateInfosFromNodes();
			}
			
			for (String ap : usableMacIps.keySet()) {
				FlowInformation f = null;
				if ((Server.getInstance().getStorageManager().getClientInformations(ap) != null) 
						&& Server.getInstance().getStorageManager().getClientInformations(ap).containsKey(FlowInfoProcessor.class.getName())) {
					f = ((FlowInformation)Server.getInstance().getStorageManager().getClientInformations(ap).get(FlowInfoProcessor.class.getName()));
				}
				
				if ((f != null) && (f.getRxflows().size() == 0) && (f.getTxflows().size() == 0)) {
					resetCount++;
				}
			}
			
			if (resetCount == usableMacIps.keySet().size()) {
				break;
			} else {
				for (String ap : usableMacIps.keySet()) {
					if (displayInfos) {
						System.out.println("\tINFO: resetting flowstats of node " + usableMacIps.get(ap));
					}
					Server.getInstance().handleSetter(usableMacIps.get(ap), 7777, "sf", "reset", "");
				}
			}
			
			try {
				Thread.sleep(1*1000);
			} catch (InterruptedException e) {
				//nothing
			}
		}
	}
}
