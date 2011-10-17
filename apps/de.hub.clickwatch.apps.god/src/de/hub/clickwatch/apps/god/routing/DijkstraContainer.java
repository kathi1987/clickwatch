package de.hub.clickwatch.apps.god.routing;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import de.hub.clickwatch.apps.god.SzenarioHWL;
import de.hub.clickwatch.apps.god.information.LinktableLinkInformation;

public class DijkstraContainer {
	private String startNode = null;
	private Map<String, String> bestRoute = new HashMap<String, String>();
	private Map<String, Integer> bestRouteLength = new HashMap<String, Integer>();
	private boolean autoDikstra = true;
	
	@SuppressWarnings("unused")
	private DijkstraContainer() {
		//nothing, just set the default constructor private, so that it cannot be used
	}
	
	public void setAutoDikstra(boolean val) {
		autoDikstra = val;
	}
	
	public Set<String> getPossibleRoutes() {
		return bestRoute.keySet();
	}
	
	public DijkstraContainer(String i_startNode) {
		if (i_startNode == null) {
			throw new InvalidParameterException("start node cannot be <null>");
		}
		this.startNode = i_startNode;
	}
	
	public int getBestRouteLength(String to) {
		if (bestRouteLength.containsKey(to)) {
			return bestRouteLength.get(to);
		}
		
		return -1;
	}
	
	public String getBestRoutePath(String to) {
		if (bestRoute.containsKey(to)) {
			return bestRoute.get(to);
		}
		
		return null;
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
			runDijkstra(false);
		}
	}
	
	public void upgradeLink(String from, String to, int metricDiff) {
		/*
		boolean linkIsNotInBestRoute = false;
		for (String route : bestRoute.keySet()) {
			String bRoute = bestRoute.get(route);
			
			if ((bRoute != null) && (bRoute.contains(from + SzenarioHWL.LINKTABLE_SEPARATOR + to))) {
				linkIsNotInBestRoute = true;
				break;
			}
		}
		
		if (linkIsNotInBestRoute) {
			runDijkstra();
		} else {
			for (String route : bestRouteLength.keySet()) {
				String bRoute = bestRoute.get(route);
				if ((bRoute != null) && (bRoute.contains(from + SzenarioHWL.LINKTABLE_SEPARATOR + to))) {
					int now = bestRouteLength.get(route).intValue() + metricDiff;
					bestRouteLength.put(route, new Integer(now));
				}
			}
		}
		*/
		runDijkstra(false);
	}
	
	public void degradeLink(String from, String to) {
		boolean linkIsInBestRoute = false;
		for (String route : bestRoute.keySet()) {
			String bRoute = bestRoute.get(route);
			
			if ((bRoute != null) && (bRoute.contains(from + SzenarioHWL.LINKTABLE_SEPARATOR + to))) {
				linkIsInBestRoute = true;
				break;
			}
		}
		
		if (linkIsInBestRoute) {
			runDijkstra(false);
		}
	}
	
	public void runDijkstra(boolean forceRun) {
		if ((forceRun) || (autoDikstra)) {
			bestRoute = new HashMap<String, String>();
			bestRoute.put(startNode, startNode);
			bestRouteLength = new HashMap<String, Integer>();
			bestRouteLength.put(startNode, new Integer(0));
			
			Set<String> untakenNodes = GlobalRoutingtable.getNodes();
			if (untakenNodes.size() == 0) {
				return;
			}
			untakenNodes.remove(startNode);
			
			Set<String> currentNodes = new HashSet<String>();
			currentNodes.add(startNode);
			
			while (currentNodes.size() > 0) {
				//take the currentNode with smallest distance
				int smallestValue = Integer.MAX_VALUE;
				String takeNode = null;
				for (String node : currentNodes) {
					if ((bestRouteLength.containsKey(node) && (bestRouteLength.get(node).intValue() <= smallestValue))) {
						takeNode = node;
						smallestValue = bestRouteLength.get(node).intValue();
					}
				}
				
				if (takeNode != null) {
					untakenNodes.remove(takeNode);
					
					Set<String> neighbors = GlobalLinktable.getNeighbors(takeNode);
					for (String nei : neighbors) {
						if (untakenNodes.contains(nei)) {
							currentNodes.add(nei);
						}
					}
					currentNodes.remove(takeNode);
					
					for (String neigh : neighbors) {
						LinktableLinkInformation inf = GlobalLinktable.getLinkInfos(takeNode, neigh);
						
						if ((inf != null) && 
							((!bestRouteLength.containsKey(neigh)) || 
							(bestRouteLength.get(neigh).intValue() > bestRouteLength.get(takeNode).intValue() + inf.getMetric()))) {
							
							bestRouteLength.put(neigh, bestRouteLength.get(takeNode).intValue() + inf.getMetric());
							bestRoute.put(neigh, bestRoute.get(takeNode) + SzenarioHWL.LINKTABLE_SEPARATOR + neigh);					
						}
					}
				} else {
					break;
				}
			}
		}
	}
	
}
