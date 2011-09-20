package de.hub.clickwatch.apps.god.visuals;

import java.util.Map;
import java.util.Set;

import de.hub.clickwatch.apps.god.Server;
import de.hub.clickwatch.apps.god.routing.GlobalLinktable;
import de.hub.clickwatch.apps.god.routing.GlobalRoutingtable;

@SuppressWarnings("unused")
public class NodeRefresher extends Thread {
	private GodNetwork parent;
	
	public NodeRefresher(GodNetwork parent) {
		this.parent = parent;
	}
	
	private void displayNodeInfos(String node) {
		Map<String, String> macIp = Server.getMacIpList();
		System.out.print("\n" + node);
		if (macIp.containsValue(node)) {
			for (String ip : macIp.keySet()) {
				if (macIp.get(ip).equals(node)) {
					System.out.println(" (" + ip + "):");
				}
			}
		} else {
			System.out.println(":");
		}
		
		for (String neigh : GlobalLinktable.getNeighbors(node)) {
			System.out.println(node + " -> " + neigh + " val: " + GlobalLinktable.getLinkInfos(node, neigh).getMetric());
		}
		for (String rou : GlobalRoutingtable.getRoutesFrom(node)) {
			System.out.println(node + " ---route---> " + rou + " val: " + GlobalRoutingtable.getShortestLength(node, rou));
		}
		
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException intExc) {
				//nothing
			}
			
			Set<String> globalNodeNames = GlobalRoutingtable.getNodes();
			for (String node : globalNodeNames) {
				//displayNodeInfos(node);
				
				boolean found = false;
				for (String known : parent.getNodeNames()) {
					if (known.equals(node)) {
						found = true;
						break;
					}
				}
				
				if (!found) {
					parent.addNode(node);
				}
			}
		}
	}
}
