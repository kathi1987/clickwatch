package de.hub.clickwatch.apps.god.routing;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class GlobalRoutingtable implements Serializable {
	private static final long serialVersionUID = -6046518405036658052L;
	private static Set<String> nodes = new HashSet<String>();
	private static Map<String, DijkstraContainer> routingtable = new HashMap<String, DijkstraContainer>();
	
	public static Set<String> getNodes() {
		return new HashSet<String>(nodes);	
	}
	
	public static Set<String> getRoutesFrom(String mac) {
		if (routingtable.containsKey(mac)) {
			return routingtable.get(mac).getPossibleRoutes();
		} else {
			return new HashSet<String>();
		}
	}
	
	public static int getShortestLength(String from, String to) {
		if (routingtable.containsKey(from)) {
			return routingtable.get(from).getBestRouteLength(to);
		}
		
		return -1;
	}
	
	public static String getShortestPath(String from, String to) {
		if (routingtable.containsKey(from)) {
			return routingtable.get(from).getBestRoutePath(to);
		}
		
		return null;
	}
	
	public static Integer getShortestHopCount(String from, String to) {
		if (routingtable.containsKey(from)) {
			String route = routingtable.get(from).getBestRoutePath(to);
			StringTokenizer tok = new StringTokenizer(route, ",");
			return tok.countTokens();
		}
		
		return null;
	}
	
	public static void removeUsedLink(String from, String to) {
		synchronized (routingtable) {
			for (String s : routingtable.keySet()) {
				routingtable.get(s).removeLink(from, to);
			}
		}
	}
	
	public static void upgradeUsedLink(String from, String to, int metricDiff) {
		synchronized (routingtable) {
			for (String s : routingtable.keySet()) {
				routingtable.get(s).upgradeLink(from, to, metricDiff);
			}
		}
	}
	
	public static void degradeUsedLink(String from, String to) {
		synchronized (routingtable) {
			for (String s : routingtable.keySet()) {
				routingtable.get(s).degradeLink(from, to);
			}
		}
	}
	
	public static void addLink(String from, String to) {
		synchronized (nodes) {
			nodes.add(from);
			nodes.add(to);
		}
		
		synchronized (routingtable) {
			if (!routingtable.containsKey(from)) {
				routingtable.put(from, new DijkstraContainer(from));
			}
			if (!routingtable.containsKey(to)) {
				routingtable.put(to, new DijkstraContainer(to));
			}
			
			for (String s : routingtable.keySet()) {
				routingtable.get(s).runDijkstra();
			}
		}
	}
}
