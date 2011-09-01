package de.hub.clickwatch.apps.god.visuals;

import de.hub.clickwatch.apps.god.routing.GlobalLinktable;
import de.hub.clickwatch.apps.god.routing.GlobalRoutingtable;

public class NodeRefresher extends Thread {
	private GodNetwork parent;
	
	public NodeRefresher(GodNetwork parent) {
		this.parent = parent;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException intExc) {
				//nothing
			}
			
			for (String node : GlobalRoutingtable.getNodes()) {
				boolean found = false;
				for (String known : parent.getNodeNames()) {
					if (known.equals(node)) {
						found = true;
						break;
					}
				}
				
				if (!found) {
					parent.addNode(node);
					
					for (String r : GlobalLinktable.getNeighbors(node)) {
						parent.addLink(node, r);
					}
				}
			}
		}
	}
}
