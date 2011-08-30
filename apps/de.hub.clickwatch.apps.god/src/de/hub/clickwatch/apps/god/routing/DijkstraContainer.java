package de.hub.clickwatch.apps.god.routing;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import de.hub.clickwatch.apps.god.SzenarioHWL;

public class DijkstraContainer {
	private String startNode = null;
	private Map<String, String> bestRoute = new HashMap<String, String>();
	private Map<String, Integer> bestRouteLength = new HashMap<String, Integer>();
	
	@SuppressWarnings("unused")
	private DijkstraContainer() {
		//nothing, just set the default constructor private, so that it cannot be used
	}
	
	public DijkstraContainer(String i_startNode) {
		if (i_startNode == null) {
			throw new InvalidParameterException("start node cannot be <null>");
		}
		this.startNode = i_startNode;
	}
	
	public void removeLink(String from, String to) {
		boolean linkIsInBestRoute = false;
		for (String route : bestRoute.keySet()) {
			if (bestRoute.get(route).contains(from + SzenarioHWL.LINKTABLE_SEPARATOR + to)) {
				linkIsInBestRoute = true;
				break;
			}
		}
		
		if (linkIsInBestRoute) {
			runDijkstra();
		}
	}
	
	public void upgradeLink(String from, String to, int metricDiff) {
		boolean linkIsNotInBestRoute = false;
		for (String route : bestRoute.keySet()) {
			if (bestRoute.get(route).contains(from + SzenarioHWL.LINKTABLE_SEPARATOR + to)) {
				linkIsNotInBestRoute = true;
				break;
			}
		}
		
		if (linkIsNotInBestRoute) {
			runDijkstra();
		} else {
			for (String route : bestRouteLength.keySet()) {
				Integer now = bestRouteLength.get(route) - metricDiff;
				bestRouteLength.put(route, now);
			}
		}
	}
	
	public void degradeLink(String from, String to) {
		boolean linkIsInBestRoute = false;
		for (String route : bestRoute.keySet()) {
			if (bestRoute.get(route).contains(from + SzenarioHWL.LINKTABLE_SEPARATOR + to)) {
				linkIsInBestRoute = true;
				break;
			}
		}
		
		if (linkIsInBestRoute) {
			runDijkstra();
		}
	}
	
	public void runDijkstra() {
		bestRoute = new HashMap<String, String>();
		bestRoute.put(startNode, startNode);
		bestRouteLength = new HashMap<String, Integer>();
		bestRouteLength.put(startNode, 0);
		
		Set<String> unvisited = GlobalRoutingtable.getNodes();
		unvisited.remove(startNode);
		
		Set<String> currentNodes = new HashSet<String>();
		currentNodes.add(startNode);
		
		while (currentNodes.size() > 0) {
			//take the currentNode with smallest distance
			int smallestValue = 999999999;
			String takeNode = null;
			for (String node : currentNodes) {
				if (bestRouteLength.containsKey(node) && (bestRouteLength.get(node) <= smallestValue)) {
					takeNode = node;
					smallestValue = bestRouteLength.get(node);
				}
			}
			
			if (takeNode != null) {
				unvisited.remove(takeNode);
				Set<String> neighbors = GlobalLinktable.getNeighbors(takeNode);
				currentNodes.addAll(neighbors);
				currentNodes.remove(takeNode);
				
				for (String neigh : neighbors) {
					if (unvisited.contains(neigh)) {
						int neighborMetric = GlobalLinktable.getLinktable().get(takeNode + SzenarioHWL.LINKTABLE_SEPARATOR + neigh).getMetric();
						if ((!bestRouteLength.containsKey(neigh)) || 
							(bestRouteLength.get(neigh) > bestRouteLength.get(takeNode) + neighborMetric)) {
							
							bestRouteLength.put(neigh, bestRouteLength.get(takeNode) + neighborMetric);
							bestRoute.put(neigh, bestRoute.get(takeNode) + SzenarioHWL.LINKTABLE_SEPARATOR + neigh);
							
						}
					}
				}
			} else {
				break;
			}
		}
	}
	
}
